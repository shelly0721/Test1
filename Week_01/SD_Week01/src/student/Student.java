/*
  author Sayaka
  Date: Jan 28th 2022
*/
package student;

/**
 *
 * @author nakamurasayaka
 */
public class Student {
    
    private String studentId;
    private String name;
    

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }


    public String getName() {
        return name;
    }
    
    public String getStudentId() {
        return studentId;
    }

    
    public String toString() {
        return "StudentID: " + studentId + ", name: " + name; 
    }
    
}