package com.nexttechnologes.domainsecure.service;

import com.nexttechnologes.domainsecure.api.dto.ClientResource;
import com.nexttechnologes.domainsecure.domaine.entity.Client;
import com.nexttechnologes.domainsecure.domaine.repository.ClientRepository;
import com.nexttechnologes.domainsecure.mapper.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    public List<ClientResource> getAllClient() {
        return clientMapper.toClientResources(clientRepository.findAll());
    }

    public List<ClientResource> addClients(List<ClientResource> clientResources) {
        List<Client> clients = clientMapper.toClients(clientResources);
        return clientMapper.toClientResources(clientRepository.saveAll(clients));
    }
}
