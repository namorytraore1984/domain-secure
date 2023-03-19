package com.nexttechnologes.domainsecure.api;

import com.nexttechnologes.domainsecure.api.dto.ClientResource;
import com.nexttechnologes.domainsecure.api.dto.ClientResponse;
import com.nexttechnologes.domainsecure.domaine.entity.Client;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClientApi {
    public ResponseEntity<ClientResponse> getAllClient();
    public ResponseEntity<ClientResource> getClientById();
    public ResponseEntity<ClientResource> addClients(List<ClientResource> clients);
}
