/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package electivexp;

import electivexp.dto.ElectiveSubjectSummary;
import java.util.Collection;

/**
 *
 * @author Thomas
 */
public interface ElectiveManager {
    
    void makeChoise(int stuId, int firstPri1ElectiveSubjID,int firstPri2ElectiveSubjID, int second1ElectiveSubjID, int second2Pri2ElectiveSubjID);
    Collection<ElectiveSubjectSummary> getSubjects();
}
