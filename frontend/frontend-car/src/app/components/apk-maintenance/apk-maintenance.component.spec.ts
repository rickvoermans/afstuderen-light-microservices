import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApkMaintenanceComponent } from './apk-maintenance.component';

describe('ApkMaintenanceComponent', () => {
  let component: ApkMaintenanceComponent;
  let fixture: ComponentFixture<ApkMaintenanceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApkMaintenanceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApkMaintenanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
