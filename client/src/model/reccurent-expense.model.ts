import { Expense } from "./expense.model";

export class RecurrentExpense extends Expense {
    contractedValue: number;
    installments: number;
    installmentsValue: number; 
}