package interfaces;

public class UseSchoolStudent {
	public static void main(String[] args) {
		SchoolStudent s = new SchoolStudent();
		System.out.println(s.name("Arun"));
		s.age(12);
		System.out.println(s.std("XII"));
		s.rollNo(3);
	}

}
