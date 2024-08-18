package br.com.emersonfarias.gof.services.impl;

import br.com.emersonfarias.gof.models.Cliente;
import br.com.emersonfarias.gof.models.Endereco;
import br.com.emersonfarias.gof.repositories.RepositoryCliente;
import br.com.emersonfarias.gof.repositories.RepositoryEndereco;
import br.com.emersonfarias.gof.services.ServiceCliente;
import br.com.emersonfarias.gof.services.ServiceViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação da <b>Strategy</b> {@link ServiceCliente}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 *
 * @author emersonsantos
 */

@Service
public class ServiceClienteImpl implements ServiceCliente {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private RepositoryCliente clienteRepository;
    @Autowired
    private RepositoryEndereco enderecoRepository;
    @Autowired
    private ServiceViaCep viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }
    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }
    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }
    @Override
    public void atualizar(long id, Cliente cliente) {
        Optional<Cliente> clienteExistente = clienteRepository.findById(id);
        if (clienteExistente.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }
    @Override
    public void deletar(long id) {
        clienteRepository.deleteById(id);
    }
    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(Long.valueOf(cep)).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
