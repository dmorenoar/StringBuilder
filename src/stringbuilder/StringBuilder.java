/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder;

/**
 *
 * @author dmorenoar
 */
public class StringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        
       
        for(char c = 'a'; c<='z'; c++){
            sb.append(c);
        }
        System.out.println(sb);
        
        sb.append("final");
        
        System.out.println(sb);
        
        //Nos gira el contenido del stringbuilder
        System.out.println(sb.reverse());
        
        System.out.println("Letra en la posicion 0 " + sb.charAt(0));
        System.out.println("Tamaño de sb" + sb.length());
        System.out.println("Indice de b: " + sb.indexOf("b"));
        
        sb.insert(1, "--");
        
        //borra en una posicion
        sb.deleteCharAt(0);
        
        //borra con un inicio y un fin
        sb.delete(2, 5);
        
        System.out.println(sb);
        
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Inicio");
        
        sb2.append(" continuo");
        
        java.lang.StringBuilder sb3 = sb2.append("addMoreno");
        
        java.lang.StringBuilder letras = new java.lang.StringBuilder("ab");
        
        java.lang.StringBuilder letrasCompletas = letras.append("cde");
        
        System.out.println(letrasCompletas);
        
        //Creamos stringBuilder vacio
        java.lang.StringBuilder vacio = new java.lang.StringBuilder();
        //Con un contenido especifico
        java.lang.StringBuilder predefinido = new java.lang.StringBuilder("ab");
        //Le damos una pista del tamaño que va a tener, reservamos 10 caracteres de espacio.
        java.lang.StringBuilder numeros = new java.lang.StringBuilder(10);
        
    }
    
}
