import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DanePracownikaComponent } from './dane-pracownika.component';

describe('DanePracownikaComponent', () => {
  let component: DanePracownikaComponent;
  let fixture: ComponentFixture<DanePracownikaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DanePracownikaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DanePracownikaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
