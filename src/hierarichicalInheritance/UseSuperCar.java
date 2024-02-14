package hierarichicalInheritance;

public class UseSuperCar {
	public static void main(String[] args) {
		SuperCar s = new SuperCar();
		System.out.println(s.vehicleType("white"));
		System.out.println(s.speed(100));
		System.out.println(s.mileage(20));
		System.out.println(s.productionYear(2022, 500000));
	}

}
