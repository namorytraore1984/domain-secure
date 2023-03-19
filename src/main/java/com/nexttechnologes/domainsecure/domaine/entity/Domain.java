package com.nexttechnologes.domainsecure.domaine.entity;

import com.nexttechnologes.domainsecure.constant.Genre;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Short surface;
    // dimension - creer un objet de type dimension
    @ManyToOne
    @JoinColumn
    private Client client;
    @OneToOne(mappedBy = "domain", cascade = CascadeType.ALL)
    private DomainLocation location;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    @OneToMany(mappedBy = "domain")
    private List<DomainConsultationHistorique> consultationHistoriques;
}
