/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package françois;
 
/**
 *
 * @author Fanfan
 */
public class françois{
    static int i = 0;
    
    public static void main (String[] args){
        System.out.println("Hello françois how are you?");
        System.out.println("put put push ollaaaaaa");
        Lapin lap = new Lapin("Clément", 7);
        while(i<=10){
            lap.crier();
            i = i + 1;
        }
        System.out.println("coucou cava?");
    }
       
    
}
