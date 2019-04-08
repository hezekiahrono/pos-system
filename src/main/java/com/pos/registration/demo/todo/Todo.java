package com.pos.registration.demo.todo;

import java.util.Date;
import java.util.Objects;

public class Todo {

    private long id;
    private int serial;
    private String make;
    private String owner;
    private Date  targetDate;

    protected Todo(){

    }

    public Todo(long id, int serial, String make, String owner, Date targetDate) {
        this.id = id;
        this.serial = serial;
        this.make = make;
        this.owner = owner;
        this.targetDate = targetDate;
    }

    public long getId() {
        return id;
    }

    public Todo setId(long id) {
        this.id = id;
        return this;
    }

    public int getSerial() {
        return serial;
    }

    public Todo setSerial(int serial) {
        this.serial = serial;
        return this;
    }

    public String getMake() {
        return make;
    }

    public Todo setMake(String make) {
        this.make = make;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public Todo setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public Todo setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
