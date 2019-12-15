package factory;

public class Square implements Shap{
    int width;
    int height;
    
    
	public Square(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

}
