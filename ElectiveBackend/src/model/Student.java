/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Thomas
 */
public class Student extends Person implements Serializable{

    private int stuId;
    private int firstPri1ElectiveSubjID;
    private int firstPri2ElectiveSubjID;
    private int secondPri1ElectiveSubjID;
    private int secondPri2ElectiveSubjID;
//    private int nextid = 1;

    public Student(int stuid, String fName, String lName, int cpr, String email, String password, int firstPri1ElectiveSubjID, int firstPri2ElectiveSubjID, int secondPri1ElectiveSubjID, int secondPri2ElectiveSubjID) {
        super(stuid, fName, lName, cpr, email, password);
        this.firstPri1ElectiveSubjID = firstPri1ElectiveSubjID;
        this.firstPri2ElectiveSubjID = firstPri2ElectiveSubjID;
        this.secondPri1ElectiveSubjID = secondPri1ElectiveSubjID;
        this.secondPri2ElectiveSubjID = secondPri2ElectiveSubjID;
    }
    
    public void setFirstPri1(int firstPri1ElectiveSubjID) {
        this.firstPri1ElectiveSubjID = firstPri1ElectiveSubjID;
    }    

    public void setFirstPri2(int firstPri2ElectiveSubjID) {
        this.firstPri2ElectiveSubjID = firstPri2ElectiveSubjID;
    }

    public void setSecondPri1(int secondPri1ElectiveSubjID) {
        this.secondPri1ElectiveSubjID = secondPri1ElectiveSubjID;
    }

    public void setSecondPri2(int secondPri2ElectiveSubjID) {
        this.secondPri2ElectiveSubjID = secondPri2ElectiveSubjID;
    }
    

    public int getFirstPri1() {
        return firstPri1ElectiveSubjID;
    }

    public int getFirstPri2() {
        return firstPri2ElectiveSubjID;
    }

    public int getSecondPri1() {
        return secondPri1ElectiveSubjID;
    }

    public int getSecondPri2() {
        return  secondPri2ElectiveSubjID;
    }

    public int getID() {
        return stuId;
    }
    

}
