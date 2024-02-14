package multipleInheritance;

public class UseIpl {
	public static void main(String[] args) {
		Ipl i = new Ipl();
		System.out.println(i.leagueName("IPL"));
		System.out.println(i.noOfCountriesPopular(10));
		i.teamName("CSK");
		i.jerseyColor("Yellow");
	}

}
