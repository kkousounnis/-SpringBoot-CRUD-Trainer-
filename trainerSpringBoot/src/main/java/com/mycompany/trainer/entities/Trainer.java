/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainer.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author konstantinos
 */
@Entity
@Table(name = "trainers", catalog = "pschooltrainers", schema = "")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Trainers.findAll", query = "SELECT t FROM Trainers t"),
//    @NamedQuery(name = "Trainers.findById", query = "SELECT t FROM Trainers t WHERE t.id = :id"),
//    @NamedQuery(name = "Trainers.findByFirstName", query = "SELECT t FROM Trainers t WHERE t.firstName = :firstName"),
//    @NamedQuery(name = "Trainers.findByLastName", query = "SELECT t FROM Trainers t WHERE t.lastName = :lastName"),
//    @NamedQuery(name = "Trainers.findBySubject", query = "SELECT t FROM Trainers t WHERE t.subject = :subject")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Size(max = 20)
    @Column(name = "first_name", length = 20)
    private String firstName;
    @Size(max = 30)
    @Column(name = "last_name", length = 30)
    private String lastName;
    @Size(max = 20)
    @Column(length = 20)
    private String subject;

    public Trainer() {
    }

    public Trainer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Trainer(Integer id, String firstName, String lastName, String subject) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }   
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.trainermvc.trainermvc.entities.Trainers[ id=" + id + " ]";
    }
    
}
