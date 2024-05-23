package Escola.sesi.textil.model;

import jakarta.persistence.Table;

import javax.crypto.spec.PSource;

@Table(name = "user")
public class User {

    private String name;
    private String lastName;
    private String login;
    private Integer idade;

}
