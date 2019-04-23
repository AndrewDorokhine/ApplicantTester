/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package department;

/**
 *
 * @author ADSki
 */
public abstract class Department {
    final boolean isAccepted(Admission app) {
        return hasPastDegree(app) == true && highGrade(app) == true && specReq(app) == true && knowsEnglish(app) == true;
    }
    
    boolean hasPastDegree(Admission app) {
        return app.hasPastDegree == true;
    }
    boolean highGrade(Admission app) {
        return app.gpa >= 3.00;
    }
    
    abstract boolean specReq(Admission app);
    
    boolean knowsEnglish(Admission app) {
        return app.knowsEng == true;
    }
}
