package builder;

public class Phone {
	
	private String os;
	private int ram;
	private String processor;
	private double screanSize;
	private int battery;
	
	public Phone(String os, int ram, String processor, double screanSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screanSize = screanSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screanSize=" + screanSize
				+ ", battery=" + battery + "]";
	}
	
	

}
