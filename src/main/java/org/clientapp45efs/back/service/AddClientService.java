package org.clientapp45efs.back.service;

import org.clientapp45efs.back.dto.RequestClientDto;
import org.clientapp45efs.back.dto.ResponseClientDto;
import org.clientapp45efs.back.entity.Client;
import org.clientapp45efs.back.repository.ClientRepository;
import org.springframework.stereotype.Component;

@Component
public class AddClientService {

    private ClientRepository repository;

    public AddClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public ResponseClientDto addClient(RequestClientDto request){
        Client clientForAdd = new Client(request.getName(), request.getEmail(), request.getPassword());

        Client clientAfterAdd = repository.add(clientForAdd);

        return new ResponseClientDto(
                clientAfterAdd.getIdClient(),
                clientAfterAdd.getName(),
                clientAfterAdd.getEmail());
    }
}
