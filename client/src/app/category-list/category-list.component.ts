import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Category } from 'model/category.model';
import { CategoryService } from 'service/category.service';
import {MatDialog} from '@angular/material/dialog';
import { CategoryDialogComponent } from 'app/category-dialog/category-dialog.component';
import { CategoryDeleteDialogComponent } from 'app/category-delete-dialog/category-delete-dialog.component';


@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.scss']
})
export class CategoryListComponent implements OnInit {
  categories: Category[];
  constructor(private categoryService: CategoryService,
              public dialog: MatDialog,
              private ref: ChangeDetectorRef) { }

  ngOnInit() {
    this.categoryService.getCategoriesList().subscribe(result => {
      this.categories = result;
    });
  }

  openDialog(category: Category) {
    const dialogRef = this.dialog.open(CategoryDialogComponent);
    dialogRef.componentInstance.title = "Editar Categoria";
    dialogRef.componentInstance.category = { ...category };

    dialogRef.afterClosed().subscribe(result => {
      if(result != undefined){
        category = result;        
      }
      this.refresh();
    });    
  }

  openDialogNewCategory() {
    const dialogNewCatRef = this.dialog.open(CategoryDialogComponent);
    dialogNewCatRef.componentInstance.title = "Nova Categoria";
    dialogNewCatRef.afterClosed().subscribe(result => {
      this.refresh();
    });    
  }

  openDialogDeleteCategory(category: Category) {
    const dialogDeleteRef = this.dialog.open(CategoryDeleteDialogComponent);
    dialogDeleteRef.componentInstance.category = { ...category };
    dialogDeleteRef.afterClosed().subscribe(result => {
      this.refresh();
    });    
  }

  refresh(){
    this.categoryService.getCategoriesList().subscribe(result => {
      this.categories = result;
      this.ref.detectChanges();
    });
  }

}