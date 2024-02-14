package interfaces;

public class UseHome {
	public static void main(String[] args) {
		Home h = new Home();
		System.out.println(h.chair("Plastic Chair"));
	    h.table(4);
	    System.out.println(h.door());
	    
	    Furniture f = new Home();
	    System.out.println(f.chair("Tablemate"));
	    f.table(5);
	    
	}

}
