package abstraction;

public class UseElectronics {
	public static void main(String[] args) {
		Electronics e = new Electronics();
		e.brand("Lenovo");
		System.out.println(e.price(40000));
		System.out.println(e.color("Grey"));
	}

}
