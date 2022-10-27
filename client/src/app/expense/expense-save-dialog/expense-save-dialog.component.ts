import { Component, OnInit } from '@angular/core';
import { Expense } from 'model/expense.model';

@Component({
  selector: 'app-expense-save-dialog',
  templateUrl: './expense-save-dialog.component.html',
  styleUrls: ['./expense-save-dialog.component.scss']
})
export class ExpenseSaveDialogComponent implements OnInit {

  expense: Expense = new Expense();
  title: String = "Title";
  constructor() {}
  
  ngOnInit(): void {
  }

  save(){
    console.log(this.expense);
  }

}
