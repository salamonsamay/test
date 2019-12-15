package adapter;

public class AssigmentWork {
    private Pen p;
    
    public void writeAssigment(String str){
    	p.write(str);
    }
	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}
    
    
}
