/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.aidan.student.registration.project;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Student {
    
    private String fName;
    private String sName;
    private int age;
    private LocalDate DOB;
    private int studentID;
    private String username;
    private ArrayList<Module> studentModules = new ArrayList<Module>();
    private CourseProgramme studentCourse;

	public Student(String firstName, String surname, int sAge, String sDOB, int sID) {
		
                this.fName = firstName;
                this.sName = surname;
		this.age = sAge;
		this.DOB = LocalDate.parse(sDOB);
                this.studentID = sID;
        }

	public String getUsername() {
		this.username = fName + sName + age;
                return this.username;
	}
        
        public String getFName() {
            return fName;
        }
        
        public String getSName() {
            return sName;
        }
        
        public int getAge() {
            return age;
        }
        
        public LocalDate getDOB() {
            return DOB;
        }
        
        public int getStudentID() {
            return studentID;
        }
        public ArrayList<Module> getSModules() {
        return studentModules;
        }

        public void setSModules(ArrayList<Module> sModules) {
        this.studentModules = sModules;
        }

        public void addSModule(Module sModule) {
        this.studentModules.add(0, sModule);
        }

        public CourseProgramme getStudentCourse() {
        return studentCourse;
        }

        public void setStudentCourse(CourseProgramme sCourse) {
        this.studentCourse = sCourse;
        }
}
