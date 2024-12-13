import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-view-film',
  standalone: true,
  imports: [],
  templateUrl: './view-film.component.html',
  styleUrl: './view-film.component.css'
})
export class ViewFilmComponent {
@Input() viewFilm!:string;
}
