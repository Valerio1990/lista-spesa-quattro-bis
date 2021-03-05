package it.iad2.listaspesaquattrobis.controller;

import it.iad2.listaspesaquattrobis.service.ServiceProdotto;
import it.iad2.listaspesaquattrobis.spesaDto.ListaProdottiDto;
import it.iad2.listaspesaquattrobis.spesaDto.ProdottoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ProdottiController {

    @Autowired
    ServiceProdotto serviceProdotto;

    @RequestMapping("/aggiungi")
    @ResponseBody
    public ListaProdottiDto aggiungiProdotto(@RequestBody ProdottoDto dto) {
        return serviceProdotto.aggiungi(dto.getProdotto());
    }

    @RequestMapping("/reset")
    @ResponseBody
    public ListaProdottiDto resetLista() {
        return serviceProdotto.aggiornaLista();
    }

    @RequestMapping("/")
    @ResponseBody
    public ListaProdottiDto aggiornaLista() {
        return serviceProdotto.aggiornaLista();
    }

}
