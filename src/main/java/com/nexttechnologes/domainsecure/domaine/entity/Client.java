package com.nexttechnologes.domainsecure.domaine.entity;

import com.nexttechnologes.domainsecure.constant.Genre;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Address> addresses;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Domain> domains;
    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Subscription subscription;
}
