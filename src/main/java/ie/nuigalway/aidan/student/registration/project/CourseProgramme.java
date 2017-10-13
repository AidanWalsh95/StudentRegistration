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
public class CourseProgramme {
    
    private String courseName;
    private String courseCode;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Module> moduleList;
    
    public CourseProgramme(String cName, String cCode, String sDate, String eDate) {
		this.courseName = cName;
                this.courseCode = cCode;
                this.startDate = LocalDate.parse(sDate);
		this.endDate = LocalDate.parse(eDate);
                this.moduleList = new ArrayList<Module>();
        }
    
    public void addModule(Module m) {
        this.moduleList.add(m);
        
        for (Student s : m.getModuleStudents()) {
           s.setStudentCourse(this);
        }
    }
    
    public void removeModule(Module m) {
        int i = this.moduleList.indexOf(m);
        this.moduleList.remove(i);
    }
    
    public void setModules(ArrayList mods) {
        this.moduleList = mods;
    }
    
    public LocalDate getSDate() {
       return startDate;
    }
   
    public LocalDate getEDate() {
       return endDate;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public ArrayList<Module> getModuleList() {
        return moduleList;
    }
}
