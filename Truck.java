package com.assesment.java;

public interface Truck {
	
     public int getAxles();
 
     public double getWeight();
 
     public void displayData();

}
class DaewooTruck implements Truck {
    private static final String name = "DaewooTruck";
 
    public DaewooTruck(int axles, double weight) {
    }
 
    public void displayData() {
        System.out.printf("%s Axles : %d Total Weight KG: %.2f ", name, getAxles(), getWeight());
    }

	public int truck(int axles, int weight) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class FordTruck implements Truck {
    private static final String name = "FordTruck";
 
    public FordTruck(int axles, double weight) {
   
    }
 
    public void displayData() {
        System.out.printf("%s   Axles : %d Total Weight KG: %.2f ", name, getAxles(), getWeight());
    }

	public int truck(int axles, int weight) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class NissanTruck implements Truck {
    private static final String name = "NissanTruck";
 
    public NissanTruck(int axles, double weight) {
   
    }
 
    public void displayData() {
        System.out.printf("%s Axles : %d Total Weight KG: %.2f ", name, getAxles(), getWeight());
    }

	public int truck(int axles, int weight) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
