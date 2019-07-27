package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

public class Parking {
    private static int nextId;
    private int id;
    private LocalDateTime date;
    private String code;
    private Status status;

    {
        id=nextId;
        nextId++;
    }

    public Parking() {
    }

    public Parking(String code, Status status) {
        this.code = code;
        this.status = status;
    }

    public Parking(int id, LocalDateTime date, String code, Status status) {
        this.id = id;
        this.date = date;
        this.code = code;
        this.status = status;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Parking.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Parking{" +
                "id=" + id +
                ", date=" + date +
                ", code='" + code + '\'' +
                ", status=" + status +
                '}';
    }
}
