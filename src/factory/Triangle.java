package factory;

public class Triangle implements Shap {
    int height;
    int width;
    
	public Triangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (height*width)/2;
	}

}
