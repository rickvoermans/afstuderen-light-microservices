import { EventListenerFocusTrapInertStrategy } from '@angular/cdk/a11y'

export interface Car {
  license: string;
  brand: string;
  type: string;
  owner: string;

  apkInspections: number;

  lastApk: Date;
}
