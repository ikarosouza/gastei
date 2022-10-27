import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Expense } from 'model/expense.model';
import { ExpenseDeleteDialogComponent } from '../expense-delete-dialog/expense-delete-dialog.component';
import { ExpenseSaveDialogComponent } from '../expense-save-dialog/expense-save-dialog.component';

@Component({
  selector: 'app-expense-list',
  templateUrl: './expense-list.component.html',
  styleUrls: ['./expense-list.component.scss']
})
export class ExpenseListComponent implements OnInit {

  expenses: Expense[] = [];
  constructor(//private categoryService: CategoryService,
              public dialog: MatDialog,
              private ref: ChangeDetectorRef) { }

  ngOnInit(): void {
    // this.categoryService.getCategoriesList().subscribe(result => {
    //   this.expenses = result;
    // });
  }

  openDialog(expense: Expense) {
    const dialogRef = this.dialog.open(ExpenseSaveDialogComponent);
    // dialogRef.componentInstance.title = "Editar Categoria";
    // dialogRef.componentInstance.category = { ...expense };

    dialogRef.afterClosed().subscribe(result => {
      if(result != undefined){
        expense = result;        
      }
      this.refresh();
    });    
  }

  openDialogNewCategory() {
    const dialogNewCatRef = this.dialog.open(ExpenseSaveDialogComponent);
    //dialogNewCatRef.componentInstance.title = "Nova Categoria";
    dialogNewCatRef.afterClosed().subscribe(result => {
      this.refresh();
    });    
  }

  openDialogDeleteCategory(expense: Expense) {
    const dialogDeleteRef = this.dialog.open(ExpenseDeleteDialogComponent);
    //dialogDeleteRef.componentInstance.category = { ...expense };
    dialogDeleteRef.afterClosed().subscribe(result => {
      this.refresh();
    });    
  }

  refresh(){
    // this.categoryService.getCategoriesList().subscribe(result => {
    //   this.expenses = result;
    //   this.ref.detectChanges();
    // });
  }

}
