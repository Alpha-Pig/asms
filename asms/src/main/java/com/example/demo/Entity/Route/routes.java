package com.example.demo.Entity.Route;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class routes {
    @Id
    private int  route_id;
    @Column(nullable = false)
    private String start;
    @Column(nullable = false)
    private String end;
    public routes(){

    }
    public routes(int route_id,String start,String end){
        this.route_id=route_id;
        this.start=start;
        this.end=end;
    }
    public int getRoute_id() {
        return this.route_id;
    }

    public void setRoute_id(final int route_id) {
        this.route_id = route_id;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(final String start) {
        this.start = start;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(final String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "routes{" +
                "route_id=" + route_id +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
