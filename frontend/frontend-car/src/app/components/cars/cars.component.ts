import { Component, OnInit } from '@angular/core';
import { Car } from 'src/app/models/car.model';
import { CarService } from 'src/app/services/car.service';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
  cars: Car[];

  constructor(private readonly carService: CarService) { }

  ngOnInit() {
    this.getAllCars();
  }

  getAllCars(): void {
    this.carService.getCars()
      .subscribe({
        next: (cars) => {
          this.cars = cars;
        },
        error: () => console.log('error toaster?')
      });
  }
}
