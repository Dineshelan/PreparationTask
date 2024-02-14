package interfaces;

public class Home implements Furniture {

	public String chair(String name) {
		return name;
	}

	public void table(int noOfTables) {
		System.out.println(noOfTables);

	}
	String door() {
		return "Door is open";
	}

}
