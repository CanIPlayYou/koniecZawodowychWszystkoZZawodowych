import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TytulComponentComponent } from './tytul-component/tytul-component.component';
import { MainAplikacjiComponent } from './main-aplikacji/main-aplikacji.component';
import { FooterComponent } from './footer/footer.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, TytulComponentComponent, MainAplikacjiComponent, FooterComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'zadanieWeterynarz';
}
