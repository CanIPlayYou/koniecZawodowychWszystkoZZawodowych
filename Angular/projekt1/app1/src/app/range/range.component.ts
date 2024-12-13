import { Component } from '@angular/core';

@Component({
  selector: 'app-range',
  standalone: true,
  imports: [],
  templateUrl: './range.component.html',
  styleUrl: './range.component.css'
})
export class RangeComponent {
  rangeValue:number = 128;

  get textColor():string{
    const red = this.rangeValue;
    const green = 255-this.rangeValue;
    const blue = this.rangeValue/2;

    return `rgb(${red}, ${green}, ${blue})`
  }

  onRange(event:Event):void{
    let input = event.target as HTMLInputElement;
    //console.log(input.value);

    this.rangeValue = parseInt(input.value);
  }
}
