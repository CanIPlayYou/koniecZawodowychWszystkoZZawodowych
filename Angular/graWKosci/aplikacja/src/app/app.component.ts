import { NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, NgFor],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'aplikacja';
  pathImg: string = "assets/";
  kosciValue: number[] = [];

  losuj():void{
    this.kosciValue = [];

    for(let i = 0; i < 5; i++){
      const randomNumber = Math.floor(Math.random()*6)+1;
      this.kosciValue.push(randomNumber)
    }
    //console.log(this.kosciValue)
  }
}
