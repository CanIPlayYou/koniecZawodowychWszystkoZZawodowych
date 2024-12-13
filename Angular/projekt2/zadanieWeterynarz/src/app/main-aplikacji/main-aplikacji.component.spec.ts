import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MainAplikacjiComponent } from './main-aplikacji.component';

describe('MainAplikacjiComponent', () => {
  let component: MainAplikacjiComponent;
  let fixture: ComponentFixture<MainAplikacjiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MainAplikacjiComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MainAplikacjiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
