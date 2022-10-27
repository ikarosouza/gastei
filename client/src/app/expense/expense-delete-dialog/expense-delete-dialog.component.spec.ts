import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpenseDeleteDialogComponent } from './expense-delete-dialog.component';

describe('ExpenseDeleteDialogComponent', () => {
  let component: ExpenseDeleteDialogComponent;
  let fixture: ComponentFixture<ExpenseDeleteDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExpenseDeleteDialogComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExpenseDeleteDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
