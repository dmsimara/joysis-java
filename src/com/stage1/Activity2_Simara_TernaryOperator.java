
package com.stage1;


public class Activity2_Simara_TernaryOperator {
    
    // Ternary Operator (), ?, :
    
    public static void main(String[] args) {
        
        float lowestGrade = 75F;
        float highestGrade = 100F;
        float subjectGrade1 = 86.79F;
        float subjectGrade2 = 70.22F;
        
        // ? is executed - condition is true
        String passOrFail1 = ((subjectGrade1 >= lowestGrade) && (subjectGrade1 <= highestGrade)) ? "Remarks: Passed" : "Remarks: Failed";
        System.out.println("FIRST GRADE" + " \n" + passOrFail1);
        
        System.out.println(" ");
        
        // : is executed - condition is false
        String passOrFail2 = ((subjectGrade2 >= lowestGrade) && (subjectGrade2 <= highestGrade)) ? "Remarks: Passed" : "Remarks: Failed";
        System.out.println("SECOND GRADE" + " \n" + passOrFail2);
        
    }
}
