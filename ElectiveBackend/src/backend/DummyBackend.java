/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import electivexp.ElectiveManager;
import java.util.ArrayList;
import java.util.HashMap;
import model.ElectiveSubject;
import model.Person;
import model.Student;
import model.Teacher;

/**
 *
 * @author Thomas
 */
public class DummyBackend implements ElectiveManager{
    
    private HashMap<Integer, Student> students = new HashMap<>();
    private HashMap<Integer, Person> persons = new HashMap<>();
    private ArrayList<ElectiveSubject> electivSubjects = new ArrayList<>();
    
    Teacher t1 = new Teacher(1, "Torben", "?", 111, "tor@cph.dk", "cocio2013");
    Teacher t2 = new Teacher(80, "Peter", "Lorentzen", 113, "pelo@cph.dk", "11111");
    
    public DummyBackend() {
        students.put(1, new Student(1, "Thomas", "Jonstrup", 112, "tj@cph.dk", "1111", 0, 0, 0,0));
        persons.put(1,new Person(1, "Thomas", "Jonstrup", 112,"tjcph.dk" ,"1111"));
        electivSubjects.add(new ElectiveSubject(7,"C#","C Sharp", t1));
        electivSubjects.add(new ElectiveSubject(8, "Python", "Python Language", t2));
        electivSubjects.add(new ElectiveSubject(9, "Android", "Get your Android", t2));
    }

    @Override
    public void makeChoise(int stuId, int firstPri1ElectiveSubjID, int firstPri2ElectiveSubjID, int second1ElectiveSubjID, int second2Pri2ElectiveSubjID) {
        students.get(stuId).setFirstPri1(firstPri1ElectiveSubjID);
        students.get(stuId).setFirstPri2(firstPri2ElectiveSubjID);
        students.get(stuId).setSecondPri1(second2Pri2ElectiveSubjID);
        students.get(stuId).setSecondPri2(second2Pri2ElectiveSubjID);
    }
    
    
}
