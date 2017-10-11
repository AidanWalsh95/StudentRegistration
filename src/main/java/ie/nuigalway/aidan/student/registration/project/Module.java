/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.aidan.student.registration.project;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Module {
    
    private String name;
    private String moduleID;
    private ArrayList<Student> moduleStudents;
    
    public Module(String mName, String mID) {
		this.name = mName;
		this.moduleID = mID;
                this.moduleStudents = new ArrayList<Student>();
        }
    
    public boolean addStudent(Student student) {
        return this.moduleStudents.add(student);    
    }
    
    
}
