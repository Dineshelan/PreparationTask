package multipleInheritance;

public class Ipl implements Cricket,Sports {
	public String leagueName(String name) {
		return "League Name: "+name;
	}
	public int noOfCountriesPopular(int number) {
		return number;
	}
	public void teamName(String name) {
		System.out.println("Team Name: "+name);
	}
	public void jerseyColor(String color) {
		System.out.println("Jersey Color: "+color);
	}
}