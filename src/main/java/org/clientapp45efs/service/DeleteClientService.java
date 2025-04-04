package org.clientapp45efs.service;

import org.clientapp45efs.entity.Client;
import org.clientapp45efs.repository.ClientRepository;

import java.util.Optional;

public class DeleteClientService {

    private ClientRepository repository;

    public DeleteClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Optional<Client> deleteClient(Integer idClient){
        return repository.deleteById(idClient);
    }

}
