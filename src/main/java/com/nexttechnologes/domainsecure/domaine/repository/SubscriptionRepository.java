package com.nexttechnologes.domainsecure.domaine.repository;

import com.nexttechnologes.domainsecure.domaine.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
