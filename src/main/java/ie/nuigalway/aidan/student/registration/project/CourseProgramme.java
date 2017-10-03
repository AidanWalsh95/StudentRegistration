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
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Module> moduleList;
    
    public CourseProgramme(String cName, LocalDate sDate, LocalDate eDate) {
		this.courseName = cName;
                this.startDate = sDate;
		this.endDate = eDate;
                this.moduleList = new ArrayList<Module>();
        }
    
    public boolean addModule(Module module) {
        
        return this.moduleList.add(module);
    
    }
    
}
