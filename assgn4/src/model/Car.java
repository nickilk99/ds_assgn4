package model;

public class Car {

	private String model;
	private String make;
	private Integer year;
	
	public Car() {
		
	}

	public Car(String model, String make, Integer year) {
		this.model = model;
		this.make = make;
		this.year = year;
	}
	
	

	public Car(String make, String model) {
		super();
		this.model = model;
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
	
}
