import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewDaneComponent } from './view-dane.component';

describe('ViewDaneComponent', () => {
  let component: ViewDaneComponent;
  let fixture: ComponentFixture<ViewDaneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ViewDaneComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewDaneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
