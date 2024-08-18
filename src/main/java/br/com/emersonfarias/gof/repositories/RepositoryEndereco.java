package br.com.emersonfarias.gof.repositories;

import br.com.emersonfarias.gof.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEndereco extends JpaRepository<Endereco, Long> {
}
