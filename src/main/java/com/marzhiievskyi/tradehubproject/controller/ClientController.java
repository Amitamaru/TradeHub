package com.marzhiievskyi.tradehubproject.controller;

import com.marzhiievskyi.tradehubproject.domain.dto.ShowInfoClientDTO;
import com.marzhiievskyi.tradehubproject.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trade-hub")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/clients")
    public List<ShowInfoClientDTO> findAllClients() {
        return clientService.findAllClients();
    }

    @GetMapping("/clients/{id}")
    public ShowInfoClientDTO findClientById(@PathVariable Long id) {
        return clientService.findClientById(id);
    }
}
