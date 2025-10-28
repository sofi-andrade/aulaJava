/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class anoBissexto {
    public static void main(String[] args){
        int ano =2025;

        if (ano %4==0 && ano% 100!=0 || ano%400==0){
            System.out.println("Ano bissexto");
      
        }else{
            System.out.println("Ano não bissexto");
        }
    
    }
    
}
