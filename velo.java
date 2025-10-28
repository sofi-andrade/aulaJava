/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class velo {
    public static void main(String[] args){
        double velocidade= 130;
        
        if (velocidade > 120){
            
            System.out.println("Velocidade acima do limite!!");
            
            double acima = velocidade-120;
            double multa = acima*10.00;
            
            System.out.println("Multa a ser paga R$"+ multa);
            
        }else{
            System.out.println("Dentro da velocidade");
            
        }

    }
    
}
