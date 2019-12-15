package factory;

public class ShapFactory {
	
	public static Shap get(String str){
		if(str.equals("s"))
			return new Square(4, 4);
		if(str.equals("t"))
			return new Triangle(4,4);
		return new Circel(4);
		
		
	}

}
