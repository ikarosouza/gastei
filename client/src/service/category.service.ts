import { HttpClient, HttpHeaders, HttpResponse } from "@angular/common/http";
import { Inject, Injectable } from "@angular/core";
import { Category } from "model/category.model";
import { Observable } from "rxjs";

@Injectable()
export class CategoryService{
    constructor(private http: HttpClient) {}

    getCategoriesList(): Observable<Category[]>{
        return this.http.get<Category[]>('http://localhost:8080/gastei/category/all');
    }

    save(category: Category): Observable<Category>{
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json'
            })
        }
        return this.http.post<Category>('http://localhost:8080/gastei/category/', category, httpOptions);
    }

    delete(category: Category){
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  '*/*'
            })
        }
        return this.http.delete('http://localhost:8080/gastei/category/delete/' + category.id);
    }
}