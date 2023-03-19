package com.nexttechnologes.domainsecure.mapper;

import com.nexttechnologes.domainsecure.api.dto.ClientResource;
import com.nexttechnologes.domainsecure.domaine.entity.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ClientMapper {

    public abstract List<ClientResource> toClientResources(List<Client> clients);
    public abstract List<Client> toClients(List<ClientResource> clientResources);
    public abstract ClientResource toClientResource(Client client);
    public abstract Client toClient(ClientResource clientResource);
}
