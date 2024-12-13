import { Component } from '@angular/core';
import { range } from 'rxjs';

@Component({
  selector: 'app-main-aplikacji',
  standalone: true,
  imports: [],
  templateUrl: './main-aplikacji.component.html',
  styleUrl: './main-aplikacji.component.css'
})
export class MainAplikacjiComponent {
  zwierze:string = "";
  rangeMax:number = 0;
  rangeValue:number = 0;

  onChangee(rodzajZwierzecia:string){
    console.log(rodzajZwierzecia + " " + this.rangeMax)
    if(rodzajZwierzecia == "1"){
      this.rangeMax = 18;

      if(this.rangeValue > 18){ //?
        this.rangeValue = 18;
      }
    }
    if(rodzajZwierzecia == "2"){
      this.rangeMax = 20;
    }
    if(rodzajZwierzecia == "3"){
      this.rangeMax = 9;

      if(this.rangeValue > 9){
        this.rangeValue = 9;
      }
    }
  }

  onRange(event:Event):void{
    let input = event.target as HTMLInputElement;

    this.rangeValue = parseInt(input.value);
  }

  okButton(imieNazwiskoWlas:string, rodzajZwierzecia:string, celWizyty:string, godzinaWizyty:string):void{
    if(rodzajZwierzecia == "1"){
      this.zwierze = "Pies";
    }
    if(rodzajZwierzecia == "2"){
      this.zwierze = "Kot";
    }
    if(rodzajZwierzecia == "3"){
      this.zwierze = "Świnka morska";
    }

    console.log(imieNazwiskoWlas + ", " + this.zwierze + ", "+ this.rangeValue + ", "+ celWizyty +", "+ godzinaWizyty)
  }
}
