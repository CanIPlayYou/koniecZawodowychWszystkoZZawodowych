import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-dane-pracownika',
  standalone: true,
  imports: [],
  templateUrl: './dane-pracownika.component.html',
  styleUrl: './dane-pracownika.component.css'
})
export class DanePracownikaComponent {
  @Output() sendData = new EventEmitter()

OnChange(imiePracownikaa:string, nazwiskoPracownikaa:string, stanowiskoPracownikaa:string){
  console.log(imiePracownikaa + nazwiskoPracownikaa + stanowiskoPracownikaa);

  this.sendData.emit(imiePracownikaa + " "+ nazwiskoPracownikaa+ ", "+ stanowiskoPracownikaa)
}
}
