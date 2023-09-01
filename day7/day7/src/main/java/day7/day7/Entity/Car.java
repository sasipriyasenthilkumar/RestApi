package day7.day7.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	private int id;
	private String carName;
	private String carType;
	private int Owners;
	private String currentOwnerName;
	private long moble;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getOwners() {
		return Owners;
	}
	public void setOwners(int owners) {
		Owners = owners;
	}
	public String getCurrentOwnerName() {
		return currentOwnerName;
	}
	public void setCurrentOwnerName(String currentOwnerName) {
		this.currentOwnerName = currentOwnerName;
	}
	public long getMoble() {
		return moble;
	}
	public void setMoble(long moble) {
		this.moble = moble;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Car(int id, String carName, String carType, int owners, String currentOwnerName, long moble,
			String address) {
		super();
		this.id = id;
		this.carName = carName;
		this.carType = carType;
		Owners = owners;
		this.currentOwnerName = currentOwnerName;
		this.moble = moble;
		this.address = address;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
