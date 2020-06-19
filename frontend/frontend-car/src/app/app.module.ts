import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CarsComponent } from './components/cars/cars.component';
import { ApkMaintenanceComponent } from './components/apk-maintenance/apk-maintenance.component';

import { ReactiveFormsModule, FormsModule } from '@angular/forms';

import { MatDividerModule } from '@angular/material/divider';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatDatepickerModule } from '@angular/material/datepicker';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CarComponent } from './components/cars/car/car.component';

import { HttpClientModule } from '@angular/common/http';
import { MatNativeDateModule } from '@angular/material/core';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    ApkMaintenanceComponent,
    CarComponent
  ],
  imports: [
    BrowserModule,
    MatDividerModule,
    MatCardModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatFormFieldModule,
    ReactiveFormsModule,
    FormsModule,
    MatNativeDateModule,
    MatDatepickerModule
  ],
  providers: [MatDatepickerModule],
  bootstrap: [AppComponent],
})
export class AppModule { }
