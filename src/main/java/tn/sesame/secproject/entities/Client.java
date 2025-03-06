package tn.sesame.secproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date dateOfBirth;
    private String metier;

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy = "client")
    private List<Compte> comptes;

    @OneToMany(mappedBy = "client")
    private List<DemandeCredit> Credits;
}
