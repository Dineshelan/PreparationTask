package hierarichicalInheritance;

public class SuperCar extends Car implements Vehicle {
	public int productionYear(int year, int price) {
		if (year >= 2017 && year <= 2020) {
			return price-(price * (10 / 100));
		} else if (year >= 2020 && year <= 2022) {
			return price- (price * (5 / 100));
		} else {
			return price-(price * (2 / 100));
		}

	}
	public String speed(int a) {
		if(a>40) {
		return "City Speed";
		}
		else {
			return "Rural Speed";
		}
	}
	public String vehicleType(String a) {
		if(a.equals("yellow")) {
		return "Rental Car";
		}
		else {
			return "Not a Rental Car";
		}
	}
}
