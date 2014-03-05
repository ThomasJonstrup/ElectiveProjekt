/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import electivexp.ElectiveManager;
import electivexp.dto.ElectiveSubjectSummary;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import model.ElectiveSubject;
import model.Person;
import model.Pool;
import model.Priorities;
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

    public ArrayList<ElectiveSubject> getElectivSubjects() {
        return electivSubjects;
    }
    
//    private ArrayList<Student> students = new ArrayList<>();
    private Pool poolA;
    private Pool poolB;
    
    Teacher t1 = new Teacher(1, "Torben", "?", 111, "tor@cph.dk", "cocio2013");
    Teacher t2 = new Teacher(80, "Peter", "Lorentzen", 113, "pelo@cph.dk", "11111");
    
    public DummyBackend() {
        students.put(1, new Student(1, "Thomas", "Jonstrup", 112, "tj@cph.dk", "1111", 0, 0, 0,0));
        persons.put(1,new Person(1, "Thomas", "Jonstrup", 112,"tjcph.dk" ,"1111"));
        electivSubjects.add(new ElectiveSubject(7,"C#","C Sharp", t1));
        electivSubjects.add(new ElectiveSubject(8, "Python", "Python Language", t2));
        electivSubjects.add(new ElectiveSubject(9, "Android", "Get your Android", t2));
        electivSubjects.add(new ElectiveSubject(10, "SW Design", "Get your Android", t2));
        electivSubjects.add(new ElectiveSubject(11, "Games", "Get your Android", t2));
        electivSubjects.add(new ElectiveSubject(12, "Databases", "Get your Android", t2));
        electivSubjects.add(new ElectiveSubject(13, "Mordern Languages", "Get your Android", t2));
        poolA = new Pool();
        poolB = new Pool();
        poolA.addSubject(electivSubjects.get(0));
        poolA.addSubject(electivSubjects.get(2));
        poolA.addSubject(electivSubjects.get(4));
        poolB.addSubject(electivSubjects.get(3));
        poolB.addSubject(electivSubjects.get(5));
        poolB.addSubject(electivSubjects.get(1));
        poolB.addSubject(electivSubjects.get(6));
    }

    @Override
    public void makeChoise(int stuId, int firstPri1ElectiveSubjID, int firstPri2ElectiveSubjID, int second1ElectiveSubjID, int second2Pri2ElectiveSubjID) {
        students.get(stuId).setFirstPri1(firstPri1ElectiveSubjID);
        students.get(stuId).setFirstPri2(firstPri2ElectiveSubjID);
        students.get(stuId).setSecondPri1(second2Pri2ElectiveSubjID);
        students.get(stuId).setSecondPri2(second2Pri2ElectiveSubjID);
    }

    public ArrayList<Priorities> getStudentPoolSatisfaction() {
        ArrayList<Priorities> priorities = new ArrayList<>();
        priorities.add(new Priorities("1,1"));
        priorities.add(new Priorities("1,2"));
        priorities.add(new Priorities("2,2"));
        priorities.add(new Priorities("1,0"));
        priorities.add(new Priorities("0,0"));
        priorities.add(new Priorities("0,2"));
        Student stud ;
        int a,b;
        for (int i = 1; i <= students.size(); i++) {
            stud = students.get(i);
            a=0;b=0;
            if(poolA.checkSubject(stud.getFirstPri1ElectiveSubjID()))
            {
                a=1;
            }
            else if( poolB.checkSubject(stud.getFirstPri1ElectiveSubjID()))
            {
                b=1;
            }
            if(poolA.checkSubject(stud.getFirstPri2ElectiveSubjID()))
            {
                a=1;
            }
            else if( poolB.checkSubject(stud.getFirstPri2ElectiveSubjID()))
            {
                b=1;
            }
            if(poolA.checkSubject(stud.getSecondPri1ElectiveSubjID()))
            {
                if(a!=1) a=2;
            }
            else if( poolB.checkSubject(stud.getSecondPri1ElectiveSubjID()))
            {
                if(b!=1) b=2;
            }
            if(poolA.checkSubject(stud.getSecondPri2ElectiveSubjID()))
            {
                 if(a!=1) a=2;
            }
            else if( poolB.checkSubject(stud.getSecondPri2ElectiveSubjID()))
            {
                if(b!=1) b=2;
            }
            if(a==1 && b==1)
            {
                priorities.get(0).addStudents(stud);
            }
            else if((a==1 && b==2) || (a==2 && b==1))
            {
                priorities.get(1).addStudents(stud);
            }
            else if(a==2 && b==2)
            {
                priorities.get(2).addStudents(stud);
            }
            else if((a==1 && b==0) || (a==0 && b==1))
            {
                priorities.get(3).addStudents(stud);
            }
            else if(a==0 && b==0)
            {
                priorities.get(4).addStudents(stud);
            }
            else if((a==0 && b==2) || (a==2 && b==0))
            {
                priorities.get(5).addStudents(stud);
            }
        }


        return priorities;
    }

    @Override
    public Collection<ElectiveSubjectSummary> getSubjects() {
        return DummyBankAssembler.createElectiveSummaries(electivSubjects);
    }
}
