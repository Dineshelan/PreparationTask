package multilevelInheritance;

public abstract class Car implements Vehicle {
	public abstract String brand(String a);
	
	public void colour(String a) {
		System.out.println(a);
	}
	public String mileage(int a) {
		if(a>49) {
			return "Good Mileage";
		}
		else {
			return "Bad Mileage";
		}
	}
	

}
