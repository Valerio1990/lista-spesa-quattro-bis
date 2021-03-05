package it.iad2.listaspesaquattrobis.service;

import it.iad2.listaspesaquattrobis.model.Prodotto;
import it.iad2.listaspesaquattrobis.spesaDto.ListaProdottiDto;
import it.iad2.listaspesaquattrobis.spesaDto.ProdottoDto;

public interface ServiceProdotto {

    public ListaProdottiDto aggiungi(Prodotto prodotto);

    public ListaProdottiDto resetLista();

    public ListaProdottiDto aggiornaLista();

    public ListaProdottiDto cancellaProdotto(Prodotto prodotto);
}
