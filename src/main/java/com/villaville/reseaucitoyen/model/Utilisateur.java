package com.villaville.reseaucitoyen.model;


import java.time.LocalDate;

@Entity
public class Utilisateur {
    private int id;
    private String prenom;
    private String nom;
    private String username;
    private String email;
    private LocalDate dateNaissance;
    private String role;
    private boolean actif;

}
