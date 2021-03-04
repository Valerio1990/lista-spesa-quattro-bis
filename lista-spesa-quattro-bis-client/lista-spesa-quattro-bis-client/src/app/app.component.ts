import { Component } from '@angular/core';
import { Prodotto } from './prodotto';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nome: string = "";
  prodotto: Prodotto;
  listaProdotti: Prodotto[]=[];

  aggiungi() {
  }

  reset() {
  }

  aggiornaLista() {
  }
}
