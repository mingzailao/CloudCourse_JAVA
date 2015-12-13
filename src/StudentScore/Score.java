package StudentScore;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by apple on 15/12/13.
 */
class Student {
    private String name;
    Student(){

    }
    Student(String name){
        this.name=name;
    }
    public String getstudentName(){
        return name;
    }
}
class Course {
    private String name;
    ArrayList<Student> includeStudent=new ArrayList<Student>();
    Course(){

    }
    Course(String name){
        this.name=name;
    }
    public String getcourseName(){
        return name;
    }
}
class Student_Course{
    private Student student=new Student();
    private Course course=new Course();
    Student_Course(){

    }
    Student_Course(String student_name,String course_name){
        this.student=new Student(student_name);
        this.course=new Course(course_name);
    }
    public String getStudent(){
        return student.getstudentName();
    }
    public String getCourse(){
        return course.getcourseName();
    }

//    public void addItem(String Studen_name,String Course_name){
//        Student s=new Student(Studen_name);
//        Course c=new Course(Course_name);
//    }
}
public class Score {
    private HashMap<Student_Course,Double> m=new HashMap<Student_Course,Double>();

    public void addItem(String student_name,String course_name,double value){
        Student_Course a=new Student_Course(student_name,course_name);
        m.put(a,value);
    }
    public ArrayList<Double> getStudentScore(String studen_name){
        ArrayList<Double> ans=new ArrayList<Double>();
        for (Student_Course key:
             m.keySet()) {
            if(key.getStudent().equals(studen_name)){
                ans.add(m.get(key));
            }
        }
        return ans;
    }
    public ArrayList<Double> getCourseScore(String course_name){
        ArrayList<Double> ans=new ArrayList<Double>();
        for (Student_Course key:
                this.m.keySet()) {
            Student_Course tmp=new Student_Course();
            tmp=key;
            if(tmp.getCourse().equals(course_name)){
                ans.add(this.m.get(tmp));
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Score s=new Score();
        s.addItem("bob","Compute_science",79.0);
        s.addItem("bob","Math",80);
        s.addItem("sue","Compute_science",76.0);
        System.out.println(s.getCourseScore("Compute_science"));
        System.out.println(s.getStudentScore("bob"));
        System.out.println(s.getStudentScore("sue"));
    }

}
