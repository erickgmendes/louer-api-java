package com.louer.application;

import com.louer.domain.Cliente;
import com.louer.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente obterClientePeloId(long id) {
        return clienteRepository.findById(id);
    }

    public Cliente incluirCliente(Cliente cliente) {
        if (cliente == null)
            return null;

        Cliente clienteNovo = clienteRepository.findByRazaoSocial(cliente.getRazaoSocial());
        if (clienteNovo != null)
            return clienteNovo;

        clienteNovo = new Cliente();
        clienteNovo.setRazaoSocial(cliente.getRazaoSocial());
        return clienteRepository.save(clienteNovo);
    }

    public Cliente alterarCliente(long id, Cliente cliente) {
        Cliente clienteBanco = clienteRepository.findById(id);
        clienteBanco.setRazaoSocial(cliente.getRazaoSocial());
        return clienteRepository.save(clienteBanco);
    }

    public boolean excluirCliente(long id) {
        Cliente cliente = clienteRepository.findById(id);

        if (cliente == null)
            return false;

        clienteRepository.delete(cliente);

        return true;
    }

}
