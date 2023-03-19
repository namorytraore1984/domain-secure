package com.nexttechnologes.domainsecure.domaine.repository;

import com.nexttechnologes.domainsecure.domaine.entity.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<Domain, Long> {
}
