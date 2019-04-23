/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package department;

/**
 * This is a data class, but it prevents clumping of the booleans, the gpa and coursesTaken
 * @author ADSki
 */
public class Admission {
    public final boolean hasPastDegree;
    public final double gpa;
    public final int coursesTaken;
    public final boolean knowsEng;
    public final int credits;
    
    public Admission(boolean hasPastDegree, double gpa, int coursesTaken, boolean knowsEng) {
        this.hasPastDegree = hasPastDegree;
        this.gpa = gpa;
        this.coursesTaken = coursesTaken;
        this.knowsEng = knowsEng;
        this.credits = coursesTaken*3; //pretty sure this is how MacEwan calculates credits, so good enough for me.
    }
}
