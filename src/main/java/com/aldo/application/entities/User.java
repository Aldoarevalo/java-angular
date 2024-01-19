package com.aldo.application.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String apellido;
    private final String email;
    private final String telefono;
    
    public User() {
        this.name = "";
        this.apellido = "";
        this.email = "";
        this.telefono = "";
    }
    
    public User(String name,String apellido ,String email,String telefono) {
        this.name = name;
        this.name = apellido;
        this.email = email;
        this.telefono = name;
    }

    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ",+ ", apellido=" + apellido + ", email=" + email +,+ ", telefono=" + telefono + " '}';
    }
}
