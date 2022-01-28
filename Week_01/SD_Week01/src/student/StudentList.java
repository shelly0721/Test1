package student;

/**
 *
 * @author nakamurasayaka
 */
public class StudentList {

    public static void main(String[] args) {
       
        Student[] studentList = new Student[3];
        
        studentList[0] = new Student("s1", "Ronak");
        studentList[1] = new Student("s2", "Sayaka");
        studentList[2] = new Student("s3", "Shelly");
      
    
        for (Student s : studentList) {
            System.out.println(s);
        } 
     
        System.out.println();
        
        for (Student s : studentList) {
            System.out.println(s.getName());
        }
    }
    
}
