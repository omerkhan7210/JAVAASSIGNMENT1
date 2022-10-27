
public class Association_aggregation_1 {

	public static void main(String[] args) {
		Course c1 = new Course("CSC-113","COMPUTER PROGRAMMING","3");
		Course c2 = new Course("CSC-125","IICT","2");
		
		Faculty f1 = new Faculty("Omer","CS","Omer@","03343779404",4000,021);
		Faculty f2 = new Faculty("Gaffar","IT","Gaffar@","0334375655",8000,055);
		Faculty f3 = new Faculty("Sharjeel","BBA","Sharjeel@","0334334331",10000,101);
		
		Department d1 = new Department("CS");
		Department d2 = new Department("IT");
		Department d3 = new Department("BBA");
		
		
		
		System.out.println("The Course Code Is: " + c1.getCourseCode());
		System.out.println("The Course Name Is: " + c1.getCourseName());
		System.out.println("The Course Credit Hours Is: " + c1.getCourseCreditHours());
		
		f1.assignCourse(c1);
		f2.assignCourse(c2);
		f3.assignCourse(c1);
		
		d1.facultyList(f1);
		d2.facultyList(f2);
		d3.facultyList(f3);
		
		d1.courseList(c1);
		d2.courseList(c2);
	}

}
