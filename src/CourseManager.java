
public class CourseManager {
	public void signUpForACourse(User user, Course course) {
		System.out.println(user.name + " " + user.lastName + " isimli kullanýcý " + course.name + " kursuna kayýt oldu.");
	}
	
	public void leaveTheCourse(User user, Course course) {
		System.out.println(user.name + " " + user.lastName + " isimli kullanýcýnýn " + course.name + " kursundan ayrýldý.");
	}
}
