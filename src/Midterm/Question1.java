////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name, Surname: Mert Tok
// Student ID:    090160325
// Question no:   Question-1
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
package Midterm;

public class Question1 {
    public static void main(String[] args) {
        Student student1 = new Student("Mert", "Tok", 13, 4);
        Student student2 = new Student("Yiğit", "Tok", 14, 2);

        Course course1 = new Course("Programming Algorithms", "MAT335-E", 3);
        Course course2 = new Course("Statistics", "MAT242", 2);

        Course.addCourse(student1, course1);
        Course.addCourse(student1, course2);
        Course.addCourse(student2, course1);
        Course.addCourse(student2, course2);

        Course.dropCourse(student1, course1);
        Course.dropCourse(student2, course1);
        Course.dropCourse(student1, course1);

        course1.setCapacity(40);
        Course.addCourse(student1, course1);
    }
}
