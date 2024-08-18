package br.com.emersonfarias.gof.repositories;

import br.com.emersonfarias.gof.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCliente extends JpaRepository<Cliente, Long> {
}
