
package it.iad2.listaspesaquattrobis.spesaDto;

import it.iad2.listaspesaquattrobis.model.Prodotto;
import java.util.List;


public class ListaProdottiDto {
    private List<Prodotto>listaProdottiDto;

    public ListaProdottiDto() {
    }

    public ListaProdottiDto(List<Prodotto> listaProdottiDto) {
        this.listaProdottiDto = listaProdottiDto;
    }

    public List<Prodotto> getListaProdottiDto() {
        return listaProdottiDto;
    }

    public void setListaProdottiDto(List<Prodotto> listaProdottiDto) {
        this.listaProdottiDto = listaProdottiDto;
    }
    
}
