package com.marzhiievskyi.tradehubproject.service;


import com.marzhiievskyi.tradehubproject.dao.ClientDAO;
import com.marzhiievskyi.tradehubproject.domain.Client;
import com.marzhiievskyi.tradehubproject.domain.Permission;

import com.marzhiievskyi.tradehubproject.dto.showClientInfoDTO;
import com.marzhiievskyi.tradehubproject.mappers.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientDAO clientDAO;
    private final ClientMapper clientMapper;



    public List<showClientInfoDTO> findAllClients() {

        List<Client> clientList = clientDAO.findAll();
        return clientList.stream().map(clientMapper::toDto).toList();
    }

    public void createOrUpdate(Client client) {
        clientDAO.save(client);
    }

    public showClientInfoDTO findClientById(Long id) {
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
