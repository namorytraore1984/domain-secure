package com.nexttechnologes.domainsecure.api.controller;

import com.nexttechnologes.domainsecure.api.ClientApi;
import com.nexttechnologes.domainsecure.api.dto.ClientResource;
import com.nexttechnologes.domainsecure.api.dto.ClientResponse;
import com.nexttechnologes.domainsecure.domaine.entity.Client;
import com.nexttechnologes.domainsecure.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/domain-secure/api/v1/clients")
@RequiredArgsConstructor
@RestController
public class ClientController /*implements ClientApi*/ {

    private final ClientService clientService;
    //@Override
    @GetMapping
    public ResponseEntity<ClientResponse> getAllClient() {
        return ResponseEntity.ok(ClientResponse.builder().clients(clientService.getAllClient()).build());
    }

    //@Override
    public ResponseEntity<ClientResource> getClientById() {
        return null;
    }

    //@Override
    @PostMapping
    public ResponseEntity<ClientResponse> addClients(@RequestBody List<ClientResource> clientResources) {
        return new ResponseEntity<ClientResponse>(ClientResponse.builder()
                .clients(clientService.addClients(clientResources)).build(), HttpStatus.CREATED);
    }
}
