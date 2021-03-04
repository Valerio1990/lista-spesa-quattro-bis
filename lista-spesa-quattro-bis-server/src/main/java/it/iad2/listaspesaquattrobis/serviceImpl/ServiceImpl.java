
package it.iad2.listaspesaquattrobis.serviceImpl;

import it.iad2.listaspesaquattrobis.model.Prodotto;
import it.iad2.listaspesaquattrobis.repository.RepositoryProdotto;
import it.iad2.listaspesaquattrobis.service.ServiceProdotto;
import it.iad2.listaspesaquattrobis.spesaDto.ListaProdottiDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements  ServiceProdotto{
    @Autowired
    RepositoryProdotto repositoryProdotto;

    @Override
    public ListaProdottiDto aggiungi(Prodotto prodotto) {
        repositoryProdotto.save(prodotto);
        return aggiornaLista();
        
    }

    @Override
    public ListaProdottiDto resetLista() {
        repositoryProdotto.deleteAllInBatch();
        return aggiornaLista();
    }

    @Override
    public ListaProdottiDto aggiornaLista() {
        ListaProdottiDto dto = new ListaProdottiDto();
        List<Prodotto>lista = repositoryProdotto.findAll();
        
       return dto;
       
    }
    
    
}
