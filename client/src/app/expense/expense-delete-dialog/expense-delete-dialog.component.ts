import { Component, OnInit } from '@angular/core';
import { Expense } from 'model/expense.model';

@Component({
  selector: 'app-expense-delete-dialog',
  templateUrl: './expense-delete-dialog.component.html',
  styleUrls: ['./expense-delete-dialog.component.scss']
})
export class ExpenseDeleteDialogComponent implements OnInit {

  expense: Expense = new Expense();
  constructor() { }

  ngOnInit(): void {
  }

  delete(){
    
  }

}
