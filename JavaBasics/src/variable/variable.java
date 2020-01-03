/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable;

/**
 *
 * @author Aashi
 */
public class variable {
   
//code to understand the scope and use case of variable
    public static void StudentAge()
    {
        // local variable age
        int age = 0;
        age = age + 5;
        System.out.println("Student age is : " + age);
    }

    public static void main(String args[])
    {

        StudentAge();
       // System.out.println("Student age is : " + age);  if we access the local variable from outside the block of function student age
    }
}


