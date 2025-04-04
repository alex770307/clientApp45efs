package org.clientapp45efs.service;

import org.clientapp45efs.dto.RequestClientDto;
import org.clientapp45efs.dto.ResponseClientDto;
import org.clientapp45efs.entity.Client;
import org.clientapp45efs.repository.ClientRepository;

public class AddClientService {
    private ClientRepository repository;

    public AddClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public ResponseClientDto addClient(RequestClientDto request) {
      Client clientForAdd = new Client(request.getName(), request.getEmail(), request.getPassword());
        Client clientAfterAdd = repository.add(clientForAdd);
        return new ResponseClientDto(
                clientAfterAdd.getIdClient(),
                clientAfterAdd.getName(),
                clientAfterAdd.getEmail());
    }
}
