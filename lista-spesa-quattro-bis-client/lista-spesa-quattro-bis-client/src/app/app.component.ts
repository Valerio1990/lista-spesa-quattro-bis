import { Component } from '@angular/core';
import { Prodotto } from './prodotto';
import { HttpClient } from '@angular/common/http';
import { ProdottoDto } from './prodottoDto';
import { ListaProdottiDto } from './listaprodottidto';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  prodotto: Prodotto = new Prodotto();
  nome: string = "";
  
  listaProdotti: Prodotto[]=[];

  constructor (private http:HttpClient) {
    this.aggiornaLista
  }

  aggiungi() {
    //preparo i dati da inviare al server via DTO
    let dto: ProdottoDto = new ProdottoDto();
    dto.prodotto = this.prodotto;
    //chiamo il servizio REST
    let oss:Observable<ListaProdottiDto> = this.http.post<ListaProdottiDto>("http://localhost:8080/aggiungi,",dto);

    oss.subscribe(v => this.listaProdotti = v.listaProdottiDto) 
    this.prodotto = new Prodotto();
    

  }

  reset() {
  }

  aggiornaLista() {
  }
}
