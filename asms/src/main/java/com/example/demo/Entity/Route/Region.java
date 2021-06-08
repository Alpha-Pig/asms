package com.example.demo.Entity.Route;

import javax.persistence.*;

@Entity
public class Region {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int r_id;
    @Column(nullable = false)
    private String r_name;
    public Region() {

    }
    public Region(String name) {
        this.r_name = name;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                '}';
    }
}
