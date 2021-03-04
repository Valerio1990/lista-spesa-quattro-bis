
package it.iad2.listaspesaquattrobis.repository;

import it.iad2.listaspesaquattrobis.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProdotto extends JpaRepository<Prodotto, Long> {
    
}
