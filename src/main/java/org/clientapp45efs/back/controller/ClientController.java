package org.clientapp45efs.back.controller;

import org.clientapp45efs.back.dto.ResponseClientDto;
import org.clientapp45efs.back.service.AddClientService;
import org.clientapp45efs.back.service.DeleteClientService;
import org.clientapp45efs.back.service.FindClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

import javax.annotation.processing.Generated;
import java.util.List;


public class ClientController {

    private AddClientService addClientService;
    private FindClientService findClientService;
    private DeleteClientService deleteClientService;

    public ClientController(AddClientService addClientService, FindClientService findClientService, DeleteClientService deleteClientService) {
        this.addClientService = addClientService;
        this.findClientService = findClientService;
        this.deleteClientService = deleteClientService;
    }



    public List<ResponseClientDto> getAllClients(){
        return findClientService.findAll();
    }
}
