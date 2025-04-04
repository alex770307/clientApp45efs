package org.clientapp45efs.service;

import org.clientapp45efs.dto.ResponseClientDto;
import org.clientapp45efs.entity.Client;
import org.clientapp45efs.repository.ClientRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public class FindClientService {

    private ClientRepository repository;

    public FindClientService(ClientRepository repository) {
        this.repository = repository;
    }
    public List<ResponseClientDto> findAll() {
        List<Client> allClients = repository.findAll();

        // вариант "классический с циклами"
//        List<ResponseClientDto> responseDtos = new ArrayList<>();
//        for (Client currentClient : allClients){
//            ResponseClientDto currentDto = new ResponseClientDto(
//                    currentClient.getIdClient(),
//                    currentClient.getName(),
//                    currentClient.getEmail()
//            );
//            responseDtos.add(currentDto);
//        }
//        return responseDtos;
        return allClients.stream()
                .map(currentClient -> new ResponseClientDto(
                        currentClient.getIdClient(),
                        currentClient.getName(),
                        currentClient.getEmail()
                ))
                .toList();
    }

    public Optional<ResponseClientDto> findById(Integer idClient){
        Optional<Client> foundedClientOptional = repository.findById(idClient);

        if (foundedClientOptional.isPresent()){
            Client foundedClient = foundedClientOptional.get();
            ResponseClientDto response = new ResponseClientDto(
                    foundedClient.getIdClient(),
                    foundedClient.getName(),
                    foundedClient.getEmail()
            );
            return Optional.of(response);
        } else {
            return Optional.empty();
        }
    }

    public List<ResponseClientDto> findByName(String name){
        List<Client> foundedClients = repository.findByName(name);
        return foundedClients.stream()
                .map(client -> new ResponseClientDto(
                        client.getIdClient(),
                        client.getName(),
                        client.getEmail()
                ))
                .toList();
    }


    // для ДЗ - сделать метод findByEmail
    public Optional<ResponseClientDto> findByEmail(String email){
        Optional<Client> foundedClientOptional = repository.findByEmail(email);
        if (foundedClientOptional.isPresent()){
            Client foundedClient = foundedClientOptional.get();
            ResponseClientDto response = new ResponseClientDto(
                    foundedClient.getIdClient(),
                    foundedClient.getName(),
                    foundedClient.getEmail()
            );
            return Optional.of(response);
        }else {
            return Optional.empty();
        }
    }

}
