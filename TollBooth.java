package com.assesment.java;

import java.util.ArrayList;
public interface TollBooth {
	public ArrayList<Truck> trucksArrived = new ArrayList<>();
    public double totalToll;
 
	public void arrived(Truck truck) {
		// TODO Auto-generated method stub
		 double toll = calculateToll(truck.getAxles(), truck.getWeight());
	        truck.displayData();
	        System.out.printf("Toll Due:$%.2f\n", toll);
	        addToll(toll);
	        trucksArrived.add(truck);
	    }
    public double calculateToll(int axles, double weight);

	public void addToll(double toll);
 
    abstract public void getTotalToll(totalToll);
 }
class AlleghenyTollBooth {
	 
    public double calculateToll(int axles, double weight) {
        double toll;
        toll = 5 * axles;
        weight = weight / 500;
        if (weight <= 60) {
            toll = toll + (10 * weight);
        } else {
            weight = weight - 60;
            toll = toll + (10 * 60) + (weight * 5);
        }
        return toll;
    }
 
    public void displayData() {
        System.out.printf("\nTotal Truck Arrived : %d   Total Receipt : $%.2f\n", trucksArrived.size(), getTotalToll());
    }
}