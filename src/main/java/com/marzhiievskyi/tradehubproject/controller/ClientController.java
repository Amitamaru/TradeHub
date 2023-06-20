package com.marzhiievskyi.tradehubproject.controller;

import com.marzhiievskyi.tradehubproject.dto.showClientInfoDTO;
import com.marzhiievskyi.tradehubproject.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trade-hub")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;


    @GetMapping("/clients")
    public List<showClientInfoDTO> getAllClients() {
        return clientService.findAllClients();
    }

    @GetMapping("/clients/{id}")
    public showClientInfoDTO getClientById(@PathVariable Long id) {
        return clientService.findClientById(id);
    }
}
