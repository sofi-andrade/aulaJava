/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class IMC {
    public static void main (String[] args){
        double altura= 1.60;
        double peso= 40;
        
        double imc= peso /(altura*altura);
        
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
            
        }else if (imc <= 24.9){
            System.out.println("Peso normal");
            
        }else if (imc <=39.9){
            System.out.println("Sobrepeso");
            
        }else{
            System.out.println("Obsidade");
                    }
        }
    
    
}
