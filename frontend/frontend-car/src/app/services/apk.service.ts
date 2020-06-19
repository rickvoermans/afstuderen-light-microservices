import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Apk } from '../models/apk.model';

const apkUrl = 'http://localhost:8888/apk';

@Injectable({
  providedIn: 'root'
})
export class ApkService {

  constructor(private readonly httpClient: HttpClient) { }

  getAllApks(): Observable<Array<Apk>> {
    return this.httpClient.get<Array<Apk>>(apkUrl);
  }

  getSpecificApk(license: string): Observable<Apk> {
    return this.httpClient.get<Apk>(apkUrl + '/' + license);
  }

  saveApkCar(apk: Apk): Observable<Apk> {
    return this.httpClient.post<Apk>(apkUrl, apk);
  }
}
