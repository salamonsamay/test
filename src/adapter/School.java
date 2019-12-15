package adapter;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(234);
		Pen p=new PenAdapter();
        AssigmentWork aw=new AssigmentWork();
        aw.setP(p);
        aw.writeAssigment("test");
	}

}
