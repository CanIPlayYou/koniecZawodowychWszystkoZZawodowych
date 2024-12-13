import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TytulComponentComponent } from './tytul-component.component';

describe('TytulComponentComponent', () => {
  let component: TytulComponentComponent;
  let fixture: ComponentFixture<TytulComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TytulComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TytulComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
