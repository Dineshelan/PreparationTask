package interfaces;

public class SchoolStudent implements Student {
	public String std(String a) {
		return "Standard Studying: "+a;
	}
	public void rollNo(int a) {
		System.out.println(a);
	}
	public String name(String a) {
		return "Name of the student: "+a;
	}
	public void age(int a) {
		System.out.println(a);
	}

}
