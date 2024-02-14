package interfaces;

public class UseHome {
	public static void main(String[] args) {
		Home h = new Home();
		System.out.println(h.chair("Tablemate"));
	    h.table(4);
	    System.out.println(h.door());
	    
	    Furniture f = new Home();
	    System.out.println(f.chair("Wooden Table"));
	    f.table(5);
	    
	}

}
