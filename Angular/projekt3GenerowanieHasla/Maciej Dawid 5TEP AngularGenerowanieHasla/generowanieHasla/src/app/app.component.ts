import { Component , Output} from '@angular/core';
import { EventEmitter } from 'events';
import { RouterOutlet } from '@angular/router';
import { GenerowanieHaslaComponent } from './generowanie-hasla-div/generowanie-hasla/generowanie-hasla.component';
import { DanePracownikaComponent } from './dane-pracownika-div/dane-pracownika/dane-pracownika.component';
import { ViewDaneComponent } from './view-dane/view-dane/view-dane.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, GenerowanieHaslaComponent, DanePracownikaComponent, ViewDaneComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'generowanieHasla';

  dane:string = ""
  haslo:string = ""

  dataString:string = ""

  getData(dataa:string){
    this.dane = dataa
    console.log(this.dane)
  }

  getPassword(pass:string){
    this.haslo = pass
    console.log(this.haslo)
  }

  zatwierdzButton():void{
    this.dataString = "Dane pracownika: "+ this.dane + "; Hasło: "+ this.haslo
  }
  
}
