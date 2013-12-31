/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hrplan.business.administration.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author aszatkowski
 */
@Entity (name = "HRP_USER")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HRP_USER_SEQ")
    private Long id;
    private String name;
    private String surname;

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

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", surname=" + surname + '}';
    }

    public static class Builder {

        public Builder() {
            this.item = new User();
        }
        private User item;

        public Builder withName(final String name) {
            this.item.name = name;
            return this;
        }

        public Builder withSurname(final String surname) {
            this.item.surname = surname;
            return this;
        }

        public User build() {
            return this.item;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
