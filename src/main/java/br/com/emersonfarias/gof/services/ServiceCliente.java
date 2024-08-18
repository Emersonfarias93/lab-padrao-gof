package br.com.emersonfarias.gof.services;

import br.com.emersonfarias.gof.models.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 *  @author emersonsantos
 */
public interface ServiceCliente {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(long id, Cliente cliente);
    void deletar(long id);
}
