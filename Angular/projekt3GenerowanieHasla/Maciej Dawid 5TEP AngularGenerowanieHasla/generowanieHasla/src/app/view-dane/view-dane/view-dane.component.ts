import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-view-dane',
  standalone: true,
  imports: [],
  templateUrl: './view-dane.component.html',
  styleUrl: './view-dane.component.css'
})
export class ViewDaneComponent {
  @Input() viewData!:string;
}
