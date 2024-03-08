package com.rest.api.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "mobil")
public class Mobil {

    @Id
    @GeneratedValue
    @Column(name = "car_id")
    private Long id;

    @Column(name = "merk")
    private String merk;
    
    @Column(name = "type")
    private String type;

    @Column(name = "car_name")
    private String carName;

    @Column(name = "cc")
    private int cc;

    @Column(name = "harga")
    private Double harga;

    // Default Constructor
    public Mobil() {}
    
    // Parameterized Constructor
    public Mobil(String merk, String type, String carName, int cc, Double harga) {
        this.merk = merk;
        this.carName = carName;
        this.type = type;
        this.harga = harga;
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

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCc(int cc) {
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

    public int getCc() {
        return cc;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }


    // Compares Method
    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;
        if (!(o instanceof Mobil))
        return false;
        Mobil car = new Mobil();
        return Objects.equals(this.id, car.id)
            && Objects.equals(this.merk, car.merk);
    }

    // HashData
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.merk, this.type, this.carName, this.cc, this.harga);
    }

    @Override
    public String toString() {
        return "Mobil{"
         + "id=" + this.id
         + "merk='" + this.merk + "\'"
         + "type='" + this.type + "\'"
         + "carName='" + this.carName + "\'"
         + "cc='" + this.cc + "\'"
         + "harga='" + this.harga + "\'"
         + "}";
    }
    
}
