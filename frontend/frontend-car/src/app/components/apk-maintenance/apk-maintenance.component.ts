import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Apk } from 'src/app/models/apk.model';
import { ApkService } from 'src/app/services/apk.service';

@Component({
  selector: 'app-apk-maintenance',
  templateUrl: './apk-maintenance.component.html',
  styleUrls: ['./apk-maintenance.component.css']
})
export class ApkMaintenanceComponent implements OnInit {

  apkForm: FormGroup;

  constructor(
    private readonly formBuilder: FormBuilder,
    private readonly apkService: ApkService
  ) { }

  ngOnInit() {
    this.apkForm = this.formBuilder.group({
      license: [null, [Validators.required]],
      date: [null, [Validators.required]],
      totalPrice: [null, [Validators.required]]
    });
  }

  // convenience getter for easy access to form fields
  get f() { return this.apkForm.controls; }

  onSubmit() {
    const apkGegevens: Apk = {
      license: this.f.license.value,
      date: this.f.date.value,
      totalPrice: this.f.totalPrice.value
    };

    this.apkService.saveApkCar(apkGegevens)
      .subscribe({
        next: () => {
          console.log('iets van een toaster??');
        },
        error: () => {
          console.log('iets van een error toaster');
        }
      });
  }
}
