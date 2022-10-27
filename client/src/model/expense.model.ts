import { Category } from "./category.model";

export class Expense {
    id: number;
    title: string;
    description: string;
    category: Category;
    totalValue: number;
    createdDate: Date;
    periodicity: string;
}