package factory;

public class Circel implements Shap{
    int radius;
    
	public Circel(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

}
