package builder;

public class PhoneBuilder {

	private String os;
	private int ram;
	private String processor;
	private double screanSize;
	private int battery;
	public void setOs(String os) {
		this.os = os;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreanSize(double screanSize) {
		this.screanSize = screanSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(os, ram, processor, screanSize, battery);
	}
	
	

}
