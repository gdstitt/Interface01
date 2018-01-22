/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface01;

/**
 * Interfaces: Responsive (I am a ...), [Comparable?], Plant, PlantPart, Fruit, Vegetable, 
 * Classes: Thing, ResponsiveThing, Apple, Tomato, Potato, Carrot
 * @author Greg
 */
public class Interface01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thing aThing = new Thing();
        
        Responsive responder = new ResponsiveThing();
        
        System.out.println("The instance says it is of class: " + responder.getClass().getName());
        System.out.println("The Interface 'Responsive' says it is called: " + Responsive.getName());
        Class<?>[] componentClasses = responder.getClass().getClasses();
        System.out.println("\nThe classes which are inherited by or contained in this class are:\n");
        for (Class<?> aClass : componentClasses) {
            System.out.println(aClass.getName());
        }
        System.out.println("\nresponder.getFunctions() returns: " + responder.getFunctions());
        String[] functionList = responder.getFunctions();
        for(String function : functionList) {
            System.out.println(function);
        }
        
    }
    
}
