/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import electivexp.dto.StudentFirstRoundDetail;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Rasmus
 */
class MakeChoisesCommand extends TargetCommand{

    public MakeChoisesCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) {
        String firstPri1SelectedSubject = request.getParameter("firstpri1");
        int firstPri1SelectedSubjectINT = Integer.parseInt(firstPri1SelectedSubject);
        
        String firstPri2SelectedSubject = request.getParameter("firstpri2");
        int firstPri2SelectedSubjectINT = Integer.parseInt(firstPri2SelectedSubject);
        
        String secondPri1SelectedSubject = request.getParameter("secondpri1");
        int secondPri1SelectedSubjectINT = Integer.parseInt(secondPri1SelectedSubject);
        
        String secondPri2SelectedSubject = request.getParameter("secondpri2");
        int secondPri2SelectedSubjectINT = Integer.parseInt(secondPri2SelectedSubject);
        
        Factory.getInstance().getManager().makeChoise(1, firstPri1SelectedSubjectINT, firstPri2SelectedSubjectINT, secondPri1SelectedSubjectINT, secondPri2SelectedSubjectINT);
        
        String selectedSubjectIDer = firstPri1SelectedSubjectINT + ", " + firstPri2SelectedSubjectINT + ", " + secondPri1SelectedSubjectINT + " and " + secondPri2SelectedSubjectINT + " as elective subjects";
        
        request.setAttribute("lol" , selectedSubjectIDer);
        
        return super.execute(request);
    }
    
}
