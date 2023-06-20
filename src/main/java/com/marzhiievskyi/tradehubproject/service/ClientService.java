package com.marzhiievskyi.tradehubproject.service;


import com.marzhiievskyi.tradehubproject.dao.ClientDAO;
import com.marzhiievskyi.tradehubproject.domain.Client;
import com.marzhiievskyi.tradehubproject.domain.constants.Permission;

import com.marzhiievskyi.tradehubproject.domain.dto.ShowInfoClientDTO;
import com.marzhiievskyi.tradehubproject.mappers.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientDAO clientDAO;
    private final ClientMapper clientMapper;



    public List<ShowInfoClientDTO> findAllClients() {

        List<Client> clientList = clientDAO.findAll();
        return clientList.stream().map(clientMapper::toDto).toList();
    }

    public void createOrUpdate(Client client) {
        clientDAO.save(client);
    }

    public ShowInfoClientDTO findClientById(Long id) {
        Client client = clientDAO.findById(id).orElseThrow();
        return clientMapper.toDto(client);
    }

    public void deleteClient(Long id) {
        clientDAO.deleteById(id);
    }

    public Permission[] getClientPermissions() {
        return Permission.values();
    }

}
