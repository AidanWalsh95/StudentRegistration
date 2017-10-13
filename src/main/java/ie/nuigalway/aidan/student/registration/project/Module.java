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
    
    private String moduleName;
    private String moduleID;
    private ArrayList<Student> moduleStudents;
    
    public Module(String mName, String mID) {
		this.moduleName = mName;
		this.moduleID = mID;
                this.moduleStudents = new ArrayList<Student>();
        }
    
    public void addStudent(Student s) {
        this.moduleStudents.add(s);
        s.addSModule(this);
    }
    
    public void removeStudent(Student s) {
        int i = this.moduleStudents.indexOf(s);
        this.moduleStudents.remove(i);
    }
    
    public ArrayList<Student> getModuleStudents() {
        return moduleStudents;
    }
    
    public void setModuleStudents(ArrayList<Student> mStudents) {
        this.moduleStudents = mStudents;
    }
    
    public String getModuleName() {
        return moduleName;
    }
    
    public String getModuleID() {
        return moduleID;
    }
    
    
}
