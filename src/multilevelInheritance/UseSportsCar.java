package multilevelInheritance;

public class UseSportsCar {
	public static void main(String[] args) {
		SportsCar s = new SportsCar();
		System.out.println(s.brand("BMW"));
		s.colour("White");
		System.out.println(s.price(4500000));
	}

}
