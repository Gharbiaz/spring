package tn.sesame.secproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String adresse;

    @ManyToOne
    private Banque banque;

    @OneToMany(mappedBy = "agence")
    private List<Client> clients;

    @ManyToMany(mappedBy = "agences")
    private List<Admin> admins;




}
