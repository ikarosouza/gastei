import { Component, OnInit } from '@angular/core';
import { Category } from 'model/category.model';
import { CategoryService } from 'service/category.service';

@Component({
  selector: 'app-category-delete-dialog',
  templateUrl: './category-delete-dialog.component.html',
  styleUrls: ['./category-delete-dialog.component.scss']
})
export class CategoryDeleteDialogComponent implements OnInit {
  category: Category;
  constructor(private categoryService: CategoryService) { }

  ngOnInit(): void {
  }

  delete(){
    this.categoryService.delete(this.category).subscribe(result => {});
  }

}
