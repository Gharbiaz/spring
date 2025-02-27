package tn.sesame.secproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompte;
    private Date dateOfcreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte typeCompte;

    @ManyToOne
    private Client client;
}

