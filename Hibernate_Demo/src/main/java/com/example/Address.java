package com.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="Student_address")
public class Address {

         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         @Column(name = "address_id")
         private int addressid;

         @Column(length = 50,name = "STREET")
        private String street;

         @Column(length = 100,name ="CITY")
        private String city;

         @Column(name="is_open")
        private boolean isopen;

         @Transient
        private double x;

         @Column(name="added_date")
        private Date addeddate;

         @Lob
         private byte[] image;

        public Address(){
            super();
        }

    public Address(Date addeddate, double x, boolean isopen, String city, String street, int addressid) {
        this.addeddate = addeddate;
        this.x = x;
        this.isopen = isopen;
        this.city = city;
        this.street = street;
        this.addressid = addressid;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public String getStreet(String string) {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddeddate() {
        return addeddate;
    }

    public void setAddeddate(Date addeddate) {
        this.addeddate = addeddate;
    }


}
