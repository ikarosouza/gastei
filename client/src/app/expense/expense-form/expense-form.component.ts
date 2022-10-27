import { Component, Input, OnInit } from '@angular/core';
import { Category } from 'model/category.model';
import { Expense } from 'model/expense.model';
import { CategoryService } from 'service/category.service';

@Component({
  selector: 'app-expense-form',
  templateUrl: './expense-form.component.html',
  styleUrls: ['./expense-form.component.scss']
})
export class ExpenseFormComponent implements OnInit {
  categories: Category[] = [];
  isRecurrent: boolean = false;

  @Input() expense: Expense = new Expense();
  
  constructor(private categoryService: CategoryService) { }

  ngOnInit(): void {
    this.categoryService.getCategoriesList().subscribe(result => {
      this.categories = result;
    });
  }

}
