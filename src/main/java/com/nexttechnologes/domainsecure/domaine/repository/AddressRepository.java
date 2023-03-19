package com.nexttechnologes.domainsecure.domaine.repository;

import com.nexttechnologes.domainsecure.domaine.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
