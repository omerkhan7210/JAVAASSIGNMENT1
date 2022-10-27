
public class Course {
	private String courseCode,courseName,courseCreditHours;
	
	public Course(String courseCode,String courseName,String courseCreditHours) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseCreditHours = courseCreditHours;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getCourseCreditHours() {
		return courseCreditHours;
	}

	
	
}
