package com.nexttechnologes.domainsecure.domaine.entity;

import com.nexttechnologes.domainsecure.constant.StreetType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String civicNumber;
    private StreetType streetType;
    private String streetName;
    private String city;
    private String province;
    private String country;
    private String zipCode;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    @ManyToOne
    @JoinColumn
    private Client client;
}
