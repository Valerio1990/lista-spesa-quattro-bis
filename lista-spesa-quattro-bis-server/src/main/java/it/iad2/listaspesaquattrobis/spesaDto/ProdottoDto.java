
package it.iad2.listaspesaquattrobis.spesaDto;

import it.iad2.listaspesaquattrobis.model.Prodotto;


public class ProdottoDto {
    private Prodotto prodotto;    

    public ProdottoDto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    @Override
    public String toString() {
        return "ProdottoDto{" + "prodotto=" + prodotto + '}';
    }
    
}
