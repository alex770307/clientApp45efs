package org.clientapp45efs.back.service;

import org.clientapp45efs.back.entity.Client;
import org.clientapp45efs.back.repository.ClientRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DeleteClientService {
    private ClientRepository repository;

    public DeleteClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Optional<Client> deleteClient(Integer idClient){
        return repository.deleteById(idClient);
    }
}