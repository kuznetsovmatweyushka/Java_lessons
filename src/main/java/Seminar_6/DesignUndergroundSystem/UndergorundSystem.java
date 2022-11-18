package Seminar_6.DesignUndergroundSystem;

import java.util.HashMap;
import java.util.Map;

public class UndergorundSystem {
    private Map<Integer, Client> clientMap;
    private Map<String, Route> routeMap;

    public UndergorundSystem() {
        clientMap = new HashMap<>();
        routeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Client client = new Client(id, stationName, t);
        clientMap.put(id, client);
    }

    public void checkOut(int id, String stationName, int t) {
        Client client = clientMap.get(id);
        String routeKey = getRouteKey(client.getStationName(), stationName);
        routeMap.putIfAbsent(routeKey, new Route(0, 0));
        routeMap.get(routeKey).addTime(t - client.getTimeStart());
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = getRouteKey(startStation,endStation);
        return routeMap.get(route).getAverageTime();
    }

    private static String getRouteKey(String startStation, String endStation) {
        return startStation + "->" + endStation;
    }

    public static void main(String[] args) {
        UndergorundSystem system =new UndergorundSystem();
        system.checkIn(32,"aa",8);
        system.checkOut(32,"B",32);
    }
}

class Client {
    private int id;
    private String stationName;
    private int timeStart;

    public Client(int id, String stationName, int time) {
        this.id = id;
        this.stationName = stationName;
        this.timeStart = time;
    }

    public String getStationName() {
        return this.stationName;
    }

    public int getTimeStart() {
        return this.timeStart;
    }
}

class Route {
    private int time;
    private int tripCounter;

    public Route(int time, int tripCounter) {
        this.time = time;
        this.tripCounter = tripCounter;
    }

    public void addTime(int time) {
        this.time += time;
        this.tripCounter++;
    }

    public double getAverageTime() {
        return 1.0d * time / tripCounter;
    }


}
