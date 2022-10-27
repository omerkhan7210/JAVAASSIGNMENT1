
import java.util.ArrayList;

public class Department {
	private String departN;
	private ArrayList<Faculty> departF = new ArrayList<Faculty>();
	private ArrayList<Course> offeredCourses = new ArrayList<Course>();
	
	public Department(String departN) {
		this.departN = departN;
	}
	
	public void facultyList(Faculty faculty) {
		
	}
	
	public void courseList(Course course) {
		
	}
	
	public String toString() {
		return null;
	}
}
