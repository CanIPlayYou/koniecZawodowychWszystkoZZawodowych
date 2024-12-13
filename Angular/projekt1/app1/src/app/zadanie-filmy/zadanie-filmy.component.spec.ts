import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZadanieFilmyComponent } from './zadanie-filmy.component';

describe('ZadanieFilmyComponent', () => {
  let component: ZadanieFilmyComponent;
  let fixture: ComponentFixture<ZadanieFilmyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ZadanieFilmyComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ZadanieFilmyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
