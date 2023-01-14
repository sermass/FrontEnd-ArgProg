import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardSoftSkilComponent } from './hard-soft-skil.component';

describe('HardSoftSkilComponent', () => {
  let component: HardSoftSkilComponent;
  let fixture: ComponentFixture<HardSoftSkilComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardSoftSkilComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HardSoftSkilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
