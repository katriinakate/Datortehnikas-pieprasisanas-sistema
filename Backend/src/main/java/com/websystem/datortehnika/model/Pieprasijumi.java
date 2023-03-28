package com.websystem.datortehnika.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.ZonedDateTime;

@Entity
public class Pieprasijumi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String vards;
    private String tehnika;
    private String pamatojums;
    private ZonedDateTime laiks;

    public Pieprasijumi() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getVards() {
        return vards;
    }

    public void setVards(String vards) {
        this.vards = vards;
    }

    public String getTehnika() {
        return tehnika;
    }

    public void setTehnika(String tehnika) {
        this.tehnika = tehnika;
    }

    public String getPamatojums() {
        return pamatojums;
    }

    public void setPamatojums(String pamatojums) {
        this.pamatojums = pamatojums;
    }

    public ZonedDateTime getLaiks() {
        return laiks;
    }

    public void setLaiks(ZonedDateTime laiks) {
        this.laiks = laiks;
    }
}
