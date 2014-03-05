/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import electivexp.dto.ElectiveSubjectSummary;
import java.util.ArrayList;
import java.util.Collection;
import model.ElectiveSubject;

/**
 *
 * @author Thomas
 */
public class DummyBankAssembler {
    
public static ElectiveSubjectSummary createElectiveSummary(ElectiveSubject subject) { 
    return new ElectiveSubjectSummary(subject.getSubjectId(), subject.getName()); }
    

public static Collection<ElectiveSubjectSummary> createElectiveSummaries(Collection<ElectiveSubject> subjects)
    {
        Collection<ElectiveSubjectSummary> summaries = new ArrayList<>();
        for (ElectiveSubject subject : subjects) {
            summaries.add(createElectiveSummary(subject));
        }
        return summaries;
    }
}
