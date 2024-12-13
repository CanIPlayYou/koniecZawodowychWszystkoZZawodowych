import { Component, EventEmitter, Output } from '@angular/core';
import { delay } from 'rxjs';

@Component({
  selector: 'app-generowanie-hasla',
  standalone: true,
  imports: [],
  templateUrl: './generowanie-hasla.component.html',
  styleUrl: './generowanie-hasla.component.css'
})
export class GenerowanieHaslaComponent {
  @Output() sendPassword  = new EventEmitter()

  ileZnakow:number = 0
  wielkieLiteryCheck:boolean = false;
  cyfryCheck:boolean = false;
  specjalneCheck:boolean = false;

  maleLiteryArray = ['a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's','t', 'u', 'v', 'w', 'x', 'y', 'z'];
  wielkieLiteryArray = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
  cyfryArray = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'];
  znakiSpecjalneArray = ['!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '-', '='];

  wygenerowaneHaslo:string = ""

  wygenerowaneHasloMessage:string = ""

  wielkieOnChange(event: Event):void{
    if(this.wielkieLiteryCheck == false){
      this.wielkieLiteryCheck = true;
    }else{
      this.wielkieLiteryCheck = false;
    }
  }

  cyfryOnChange(event: Event):void{
    if(this.cyfryCheck == false){
      this.cyfryCheck = true;
    }else{
      this.cyfryCheck = false;
    }
  }

  specjalneOnChange(event: Event):void{
    if(this.specjalneCheck == false){
      this.specjalneCheck = true;
    }else{
      this.specjalneCheck = false;
    }
  }

  getRandomInt(max: number): number {
    return Math.floor(Math.random() * max);
  }

  generuj(iloscZnakow:string):void{
    this.ileZnakow = parseInt(iloscZnakow)

    if(this.ileZnakow >= 5){

      //Same małe litery
      if(this.wielkieLiteryCheck == false && this.cyfryCheck == false && this.specjalneCheck == false){
        this.wygenerowaneHaslo = ""

        for(let i = 0; i < this.ileZnakow; i++){
          this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        }
      }

      //Z wielką literą
      if(this.wielkieLiteryCheck == true && this.cyfryCheck == false && this.specjalneCheck == false){
        this.wygenerowaneHaslo = ""

        this.wygenerowaneHaslo += this.wielkieLiteryArray[this.getRandomInt(25)]
        for(let i = 0; i < this.ileZnakow - 1; i++){
          this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        }
      }

      //Z cyfrą
      if(this.wielkieLiteryCheck == false && this.cyfryCheck == true && this.specjalneCheck == false){
        this.wygenerowaneHaslo = ""

        this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        this.wygenerowaneHaslo += this.cyfryArray[this.getRandomInt(9)]
        for(let i = 0; i < this.ileZnakow - 2; i++){
          this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        }
      }

      //Ze specjalnym znakiem
      if(this.wielkieLiteryCheck == false && this.cyfryCheck == false && this.specjalneCheck == true){
        this.wygenerowaneHaslo = ""

        this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        this.wygenerowaneHaslo += this.znakiSpecjalneArray[this.getRandomInt(13)]
        for(let i = 0; i < this.ileZnakow - 3; i++){
          this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        }
      }

      //Wielka litera i cyfra
      if(this.wielkieLiteryCheck == true && this.cyfryCheck == true && this.specjalneCheck == false){
        this.wygenerowaneHaslo = ""

        this.wygenerowaneHaslo += this.wielkieLiteryArray[this.getRandomInt(25)]
        this.wygenerowaneHaslo += this.cyfryArray[this.getRandomInt(9)]
        for(let i = 0; i < this.ileZnakow - 2; i++){
          this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        }
      }

      //Wielka litera i znak specjalny
      if(this.wielkieLiteryCheck == true && this.cyfryCheck == false && this.specjalneCheck == true){
        this.wygenerowaneHaslo = ""

        this.wygenerowaneHaslo += this.wielkieLiteryArray[this.getRandomInt(25)]
        this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        this.wygenerowaneHaslo += this.znakiSpecjalneArray[this.getRandomInt(13)]
        for(let i = 0; i < this.ileZnakow - 3; i++){
          this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        }
      }

      //Cyfra i znak specjalny
      if(this.wielkieLiteryCheck == false && this.cyfryCheck == true && this.specjalneCheck == true){
        this.wygenerowaneHaslo = ""

        this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        this.wygenerowaneHaslo += this.cyfryArray[this.getRandomInt(9)]
        this.wygenerowaneHaslo += this.znakiSpecjalneArray[this.getRandomInt(13)]
        for(let i = 0; i < this.ileZnakow - 3; i++){
          this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        }
      }

      //Wszystko zaznaczone
      if(this.wielkieLiteryCheck == true && this.cyfryCheck == true && this.specjalneCheck == true){
        this.wygenerowaneHaslo = ""

        this.wygenerowaneHaslo += this.wielkieLiteryArray[this.getRandomInt(25)]
        this.wygenerowaneHaslo += this.cyfryArray[this.getRandomInt(9)]
        this.wygenerowaneHaslo += this.znakiSpecjalneArray[this.getRandomInt(13)]
        for(let i = 0; i < this.ileZnakow - 3; i++){
          this.wygenerowaneHaslo += this.maleLiteryArray[this.getRandomInt(25)]
        }
      }

      console.log(this.wygenerowaneHaslo)
      this.sendPassword.emit(this.wygenerowaneHaslo)

      this.wygenerowaneHasloMessage = "Wygenerowano hasło!"
    }else{
      this.wygenerowaneHasloMessage = "Minimalna ilość znaków wynosi 5!"
    }
  }

}
