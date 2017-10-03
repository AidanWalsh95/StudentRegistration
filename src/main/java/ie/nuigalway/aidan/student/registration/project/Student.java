/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.aidan.student.registration.project;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Student {
    
    private String name;
    private int age;
    private LocalDate DOB;
    private int studentID;
    private String username;

	public Student(String sName, int sAge, String sDOB, int sID) {
		this.name = sName;
		this.age = sAge;
		this.DOB = LocalDate.parse(sDOB);
                this.studentID = sID;
        }

	public String getUsername() {
		this.username = name + age;
                return this.username;
	}
    
}
