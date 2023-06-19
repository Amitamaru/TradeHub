package com.marzhiievskyi.tradehubproject.controller;

import com.marzhiievskyi.tradehubproject.dto.ClientDto;
import com.marzhiievskyi.tradehubproject.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trade-hub")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public List<ClientDto> getAllClients() {
        return clientService.findAllClients();
    }

    @GetMapping("/clients/{id}")
    public ClientDto getClientById(@PathVariable Long id) {
        return clientService.findClientById(id);
    }
}
