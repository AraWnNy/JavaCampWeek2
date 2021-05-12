
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(
				1,
				"Fikret",
				"Gözütok",
				"crazy_boy@mail.com");

		
		Course csharp = new Course(
				1,
				"C# ile Backend Geliştirme",
				"Engin Demiroğ");
		
		Course java = new Course();
		java.id = 2;
		java.name = "Temelden İleri Seviye Java";
		java.instructor = "Engin Demiroğ";
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.signUpForACourse(user1, java);
		courseManager.leaveTheCourse(user1, csharp);
	}

}
