package com.nexttechnologes.domainsecure.domaine.repository;

import com.nexttechnologes.domainsecure.domaine.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
