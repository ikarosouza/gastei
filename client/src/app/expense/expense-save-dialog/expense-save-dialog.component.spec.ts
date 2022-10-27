import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExpenseSaveDialogComponent } from './expense-save-dialog.component';

describe('ExpenseSaveDialogComponent', () => {
  let component: ExpenseSaveDialogComponent;
  let fixture: ComponentFixture<ExpenseSaveDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExpenseSaveDialogComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExpenseSaveDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
