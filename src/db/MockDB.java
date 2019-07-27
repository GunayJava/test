package db;

import model.Parking;
import model.User;
import service.ParkingService;

import java.time.LocalDate;
import java.util.*;

public class MockDB {
    public static final List<User> users=new ArrayList<>();
    public static final List<Parking> bills=new ArrayList<>();


    static{
        users.add(new User(new Parking()));
    }
}
