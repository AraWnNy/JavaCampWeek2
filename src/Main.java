
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(
				1,
				"Fikret",
				"G�z�tok",
				"crazy_boy@mail.com");

		
		Course csharp = new Course(
				1,
				"C# ile Backend Geli�tirme",
				"Engin Demiro�");
		
		Course java = new Course();
		java.id = 2;
		java.name = "Temelden �leri Seviye Java";
		java.instructor = "Engin Demiro�";
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.signUpForACourse(user1, java);
		courseManager.leaveTheCourse(user1, csharp);
	}

}
