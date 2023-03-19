package com.nexttechnologes.domainsecure.api.dto;

import com.nexttechnologes.domainsecure.constant.Genre;
import com.nexttechnologes.domainsecure.domaine.entity.Address;
import com.nexttechnologes.domainsecure.domaine.entity.Domain;
import com.nexttechnologes.domainsecure.domaine.entity.Subscription;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientResource {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private Genre genre;
    private Boolean active;
    private List<Address> addresses;
    private List<Domain> domains;
    private Subscription subscription;
}
