import { NgIf } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-view',
  standalone: true,
  imports: [NgIf],
  templateUrl: './view.component.html',
  styleUrl: './view.component.css'
})
export class ViewComponent {
imie:string="";
wypelnionePole:boolean = false;
pustePole:boolean = false;


SaveName(imie:string):string{
  if(imie == ""){
    this.pustePole = true;
    this.wypelnionePole = false;
  }else{
    this.wypelnionePole = true;
    this.pustePole = false;
  }

  return this.imie = imie;
}
}
