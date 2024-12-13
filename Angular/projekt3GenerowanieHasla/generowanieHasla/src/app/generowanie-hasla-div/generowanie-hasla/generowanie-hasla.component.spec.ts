import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GenerowanieHaslaComponent } from './generowanie-hasla.component';

describe('GenerowanieHaslaComponent', () => {
  let component: GenerowanieHaslaComponent;
  let fixture: ComponentFixture<GenerowanieHaslaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GenerowanieHaslaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GenerowanieHaslaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
