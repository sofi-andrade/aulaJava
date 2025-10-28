/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class agua_ph {
    public static void main(String[] args ){
        int ph= 8;
        
        if (ph < 7){
            System.out.println("Ácido");
        }else if (ph==7){    
            System.out.println("Neutro");
        }else{
            System.out.println("Alcalino");
            
        }
    }
    
}
