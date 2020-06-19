import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Car } from '../models/car.model';

const carUrl = 'http://localhost:9999/cars';

@Injectable({
  providedIn: 'root'
})
export class CarService {

  constructor(private readonly httpClient: HttpClient) { }

  getCars(): Observable<Array<Car>> {
    return this.httpClient.get<Array<Car>>(carUrl);
  }

  getCarByLicense(license: string): Observable<Car> {
    return this.httpClient.get<Car>(carUrl + '/' + license);
  }
}
