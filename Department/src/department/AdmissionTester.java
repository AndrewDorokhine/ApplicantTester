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
public class AdmissionTester {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Admission app = new Admission(true, 3.70, 15, true);
        Admission app2 = new Admission(true, 2.10, 5, false);
        Admission app3 = new Admission(true, 4.00, 10, false);
        
        CPSCDept C = new CPSCDept();
        System.out.println(C.isAccepted(app)); //should be true; credits = 45
        System.out.println(C.isAccepted(app2)); //should be false; credits = 15
        System.out.println(C.isAccepted(app3)); //should be false; doesn't know English
        
        BIOLDept B = new BIOLDept();
        System.out.println(B.isAccepted(app)); //should be true; gpa = 3.7
        System.out.println(B.isAccepted(app2)); //should be false; gpa = 2.1 
        System.out.println(C.isAccepted(app3)); //should be false; pas parle Englais
        

        
    }
}
