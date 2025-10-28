/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Desconto {
    public static void main(String[] args){
        double valor= 100.90;
        
        if (valor >= 100){
            double total= (valor)-(valor*0.10);
            System.out.println("Valor total a pagar " + total);
        }else {
            double total= (valor)-(valor*0.05);
            System.out.println("Valor total a pagar " + total);
        }
    }
    
}
