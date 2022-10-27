import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminLayoutRoutes } from './admin-layout.routing';
import { DashboardComponent } from '../../dashboard/dashboard.component';
import { UserProfileComponent } from '../../user-profile/user-profile.component';
import { TableListComponent } from '../../table-list/table-list.component';
import { CategoryListComponent } from '../../category-list/category-list.component';
import { CategoryDialogComponent } from '../../category-dialog/category-dialog.component';
import { TypographyComponent } from '../../typography/typography.component';
import { IconsComponent } from '../../icons/icons.component';
import { MapsComponent } from '../../maps/maps.component';
import { NotificationsComponent } from '../../notifications/notifications.component';
import { UpgradeComponent } from '../../upgrade/upgrade.component';
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import {MatRippleModule} from '@angular/material/core';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatTooltipModule} from '@angular/material/tooltip';
import {MatSelectModule} from '@angular/material/select';
import { MatDialogActions, MatDialogModule } from '@angular/material/dialog';
import { CategoryDeleteDialogComponent } from 'app/category-delete-dialog/category-delete-dialog.component';
import { ExpenseListComponent } from 'app/expense/expense-list/expense-list.component';
import { ExpenseSaveDialogComponent } from 'app/expense/expense-save-dialog/expense-save-dialog.component';
import { ExpenseDeleteDialogComponent } from 'app/expense/expense-delete-dialog/expense-delete-dialog.component';
import { ExpenseFormComponent } from 'app/expense/expense-form/expense-form.component';
import { MatCheckboxModule } from '@angular/material/checkbox';

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(AdminLayoutRoutes),
    FormsModule,
    ReactiveFormsModule,
    MatButtonModule,
    MatRippleModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatTooltipModule,
    MatDialogModule,
    MatCheckboxModule
  ],
  declarations: [
    DashboardComponent,
    UserProfileComponent,
    TableListComponent,
    TypographyComponent,
    IconsComponent,
    MapsComponent,
    NotificationsComponent,
    UpgradeComponent,
    CategoryDeleteDialogComponent,
    CategoryDialogComponent,
    CategoryListComponent,
    ExpenseListComponent,
    ExpenseSaveDialogComponent,
    ExpenseDeleteDialogComponent,
    ExpenseFormComponent
  ]
})

export class AdminLayoutModule {}
