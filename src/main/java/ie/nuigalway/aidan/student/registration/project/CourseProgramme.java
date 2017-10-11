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
    
    public boolean addModule(Module module) {
        
        return this.moduleList.add(module);
    
    }
    
}
