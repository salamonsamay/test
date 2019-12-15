package builder;

public class MainPhone {

	public static void main(String[] args) {
		Phone p=new PhoneBuilder().setRam(10).setBattery(23).setProcessor("i7").getPhone();
		System.out.println(p);
	}

}
