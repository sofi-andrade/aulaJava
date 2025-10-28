/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Triângulo {
    public static void main(String[] args){
        double lado1=20;
        double lado2=10;
        double lado3=9;
        
        if (lado1 == lado2 && lado2 == lado3)
            
            {System.out.println("Trinagulo equlatero");
                
        }else if( lado1 == lado2 || lado1==lado3 ||lado2==lado3){ 
            System.out.println("Triangulo Isosceles");
                   
        }else{
             System.out.println("Triangulo Escaleno");
             
                }
            
    }
    
}
