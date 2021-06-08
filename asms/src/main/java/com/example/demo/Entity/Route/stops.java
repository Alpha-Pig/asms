package com.example.demo.Entity.Route;

import javax.persistence.*;

@Entity
public class stops {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int stop_id;
    @Column(nullable = false)
    private int route_id_fk;
    @Column(nullable = false)
    private String stop_name;
    @Column(nullable = false)
    private int stop_number;

    public stops(){

    }

    public stops(int rid,int stop_number,String stopname){
        this.route_id_fk=rid;
        this.stop_name=stopname;
        this.stop_number=stop_number;
    }
    public int getStop_id() {
        return this.stop_id;
    }

    public void setStop_id(final int stop_id) {
        this.stop_id = stop_id;
    }


    public int getRoute_id_fk() {
        return this.route_id_fk;
    }

    public void setRoute_id_fk(final int route_id_fk) {
        this.route_id_fk = route_id_fk;
    }

    public int getStop_number() {
        return this.stop_number;
    }

    public void setStop_number(final int stop_number) {
        this.stop_number = stop_number;
    }


    public String getStop_name() {
        return this.stop_name;
    }

    public void setStop_name(final String stop_name) {
        this.stop_name = stop_name;
    }

    @Override
    public String toString() {
        return "stops{" +
                "stop_id=" + stop_id +
                ", route_id_fk=" + route_id_fk +
                ", stop_name='" + stop_name + '\'' +
                ", stop_number=" + stop_number +
                '}';
    }
}
