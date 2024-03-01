package com.rest.payroll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Mobil {

    private @Id @GeneratedValue Long id;
    private String merk;
    private String type;
    private String cc;

    // Default Constructor
    public Mobil() {}
    
    // Parameterized Constructor
    public Mobil(String merk, String type, String cc) {
        this.merk = merk;
        this.type = type;
        this.cc = cc;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Long getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public String getCc() {
        return cc;
    }


    // Compares Method
    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;
        if (!(o instanceof Mobil))
        return false;
        Mobil kreditKendaraan = new Mobil();
        return Objects.equals(this.id, kreditKendaraan.id)
            && Objects.equals(this.merk, kreditKendaraan.merk);
    }

    // HashData
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.merk, this.type, this.cc);
    }

    @Override
    public String toString() {
        return "Mobil{"
         + "id=" + this.id
         + "merk='" + this.merk + "\'"
         + "type='" + this.type + "\'"
         + "cc='" + this.cc + "\'"
         + "}";
    }
    
}
