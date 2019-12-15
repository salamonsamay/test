package factory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//48-122
		ArrayList<Character> b=new ArrayList<>();
	
		int a=0;
		int count =0;
		while(count++<4){
			a=(int) (Math.random()*74)+48;
			b.add((char)a);
			 
		}
		System.out.println(b.toString());
		
		count=0;
		ArrayList<Character> d=new ArrayList<>();
	    while(true){
	    	while(count++<4){
				a=(int) (Math.random()*74)+48;
				d.add((char)a);
			}
	    	count=0;
	    	if(eq(b, d)){
	    		break;
	    	}
	    	d.clear();
	    }  
	   System.out.println(d.toString());
	}
	
	public static boolean eq(ArrayList<Character> c,ArrayList<Character> c2){
		if(c.size()!=c2.size())
			return false;
		for(int i=0;i<c.size();i++){
			if(c.get(i)!=c2.get(i))
				return false;
		}
		return true;
	}

}
