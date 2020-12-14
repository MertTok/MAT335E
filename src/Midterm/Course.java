////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-1
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Midterm;

public class Course {
    private String courseName;
    private String courseCode;
    private int level;
    private int capacity;
    private static final int maxCapacity = 40;

    public Course(String courseName, String courseCode, int level){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.level = level;
        this.capacity = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public static void addCourse(Student student, Course course){
        System.out.println("Attemping to add " + student.getFullName() + " to " + course.getCourseName() + "...");
        // Check if course is full or not
        if(course.isFull()){
            System.out.println("This course has reached maximum capacity.");
            System.out.println("Unable to register a new student.");
            System.out.println("Aborting...\n");
            return;
        }

        // Check student eligibility
        if(course.getLevel() > student.getYear()){
            System.out.println("This student is not eligible to take this course.");
            System.out.println("Course level: " + course.getLevel());
            System.out.println("Student's current year: " + student.getYear());
            System.out.println("Aborting...\n");
            return;
        }

        // Add student to course
        course.capacity++;
        System.out.println("Successfully added " + student.getFullName() + " to " + course.getCourseName());

        course.printCourseInfo();
    }


    public static void dropCourse(Student student, Course course){
        System.out.println("Attemping to drop " + student.getFullName() + " from " + course.getCourseName());
        // Check if any student is assigned to this class
        if(course.getCapacity() <= 0) {
            System.out.println("Currently there aren't any students assigned to this course.");
            System.out.println("Aborting...\n");
            return;
        }

        // Add a new student to course
        course.capacity--;
        System.out.println("Successfully dropped " + student.getFullName() + " from " + course.getCourseName());

        course.printCourseInfo();
    }


    public boolean isFull(){
        return (maxCapacity - getCapacity()) <= 0;
    }


    public void printCourseInfo(){
        System.out.println("\n------------------- Course Info -------------------");
        System.out.println("CourseID: " + getCourseCode());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Course Level: " + getLevel());
        System.out.println("Registered Students: " + getCapacity());
        System.out.println("---------------------------------------------------\n");
    }
}
