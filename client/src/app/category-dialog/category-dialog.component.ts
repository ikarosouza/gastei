import { Component, Inject } from "@angular/core";
import { MAT_DIALOG_DATA } from "@angular/material/dialog";
import { Category } from "model/category.model";
import { CategoryService } from "service/category.service";

@Component({
    selector: 'app-category-dialog',
    templateUrl: 'category-dialog.component.html',
  })
  export class CategoryDialogComponent {
    category: Category = new Category();
    title: String = "Title";
    constructor(private categoryService: CategoryService) {}

    save(){
      console.log(this.category);
      this.categoryService.save(this.category).subscribe(response => {
        this.category = response;
      });
    }
  }