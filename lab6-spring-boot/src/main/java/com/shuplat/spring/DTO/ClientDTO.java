package com.shuplat.spring.DTO;


import java.util.Set;

public class ClientDTO {
    private Integer id;

    private String name;
    private String surname;
    private String email;

    private Set<Integer> orders;

    public ClientDTO(Integer id, String name, String surname, String email, Set<Integer> orders) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.orders = orders;
    }

    public ClientDTO(Integer id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Integer> getOrders() {
        return orders;
    }

    public void setOrders(Set<Integer> orders) {
        this.orders = orders;
    }
}
