
public class CourseManager {
	public void signUpForACourse(User user, Course course) {
		System.out.println(user.name + " " + user.lastName + " isimli kullan�c� " + course.name + " kursuna kay�t oldu.");
	}
	
	public void leaveTheCourse(User user, Course course) {
		System.out.println(user.name + " " + user.lastName + " isimli kullan�c�n�n " + course.name + " kursundan ayr�ld�.");
	}
}
