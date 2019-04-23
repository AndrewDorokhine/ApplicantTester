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
public class BIOLDept extends Department {

    public boolean specReq(Admission app) {
        return app.gpa >= 3.50;
    }    
}
