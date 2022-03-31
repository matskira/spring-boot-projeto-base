package io.github.matskira.service;

import org.springframework.stereotype.Service;

import io.github.matskira.model.Cliente;
import io.github.matskira.repository.ClienteRepository;

@Service
public class ClienteService {

	private ClienteRepository repository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.repository = clienteRepository; 
	};
	
	public void salvarCliente(Cliente cliente){
		validaCliente(cliente);
		this.repository.persistir(cliente);
	};
	
	public void validaCliente(Cliente cliente){};
}
