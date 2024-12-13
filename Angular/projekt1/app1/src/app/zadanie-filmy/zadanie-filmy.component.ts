import { Component } from '@angular/core';
import { ViewFilmComponent } from '../view-film/view-film.component';

@Component({
  selector: 'app-zadanie-filmy',
  standalone: true,
  imports: [ViewFilmComponent],
  templateUrl: './zadanie-filmy.component.html',
  styleUrl: './zadanie-filmy.component.css'
})
export class ZadanieFilmyComponent {

  viewFilm:string = "";

  save(tytulFilmu:string, kategoriaFilmu:string):void{
    console.log("Tytuł: "+ tytulFilmu +", Kategoria: "+ kategoriaFilmu);

    this.viewFilm = `${tytulFilmu} ${kategoriaFilmu}`;
  }
}
