
import java.util.ArrayList;

public class Faculty {
	
	private String facultyN;
	private String facultyD;
	private String facultyEmail;
	private String facultyC;
	private int facultyS,facultyId;
	ArrayList<Course> courseList = new ArrayList<Course>();
	
	public Faculty(String facultyN, String facultyD, String facultyEmail, String facultyC, int facultyS, int facultyId) {
		this.facultyN = facultyN;
		this.facultyD = facultyD;
		this.facultyEmail = facultyEmail;
		this.facultyC = facultyC;
		this.facultyS = facultyS;
		this.facultyId = facultyId;
	}
	
	public void assignCourse(Course course) {
		this.facultyC = course.getCourseName();
		System.out.println("You (" + facultyN + ") have been assigned this(" + facultyC + ") course");
	}
	
	public String toString() {
		return null;
	}
	
	
}
