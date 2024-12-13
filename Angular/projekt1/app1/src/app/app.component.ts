import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ViewComponent } from './view/view.component';
import { ZadanieFilmyComponent } from './zadanie-filmy/zadanie-filmy.component';
import { RangeComponent } from './range/range.component';
import { ViewFilmComponent } from './view-film/view-film.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ViewComponent, ZadanieFilmyComponent, RangeComponent, ViewFilmComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'app1';
}
