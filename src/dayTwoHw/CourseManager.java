package dayTwoHw;

public class CourseManager {
	
	public void courseProgram(Course course) {
		System.out.println("Kurs Program� Listelendi : " + course.name);
	}
	
	public void previousLesson(Course course) {
		System.out.println(course.name + " kursu i�in �nceki ders");
	}
	
	public void finishAndNextLesson(Course course) {
		System.out.println(course.name + " kursu i�in Bitir ve devam et");
	}	

}
