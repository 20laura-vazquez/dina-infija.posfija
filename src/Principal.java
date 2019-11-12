
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yareli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaVector vec = new PilaVector();
        int x;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Teclea numero de elementos");
        try {
            x = Integer.parseInt(entrada.readLine());
            for (int j = 1; j <= x; j++) {
                Double d;
                d = Double.valueOf(entrada.readLine());
                vec.insertar(d);
            }
            System.out.println("Elementos de la pila:");
            while (!vec.pilaVacia()) {
                Double d;
                d = (Double) vec.quitar();
                if (d.doubleValue() > 0.0) 
                    System.out.println(d +"");
                }
                    
                }
        catch (Exception er){
            System.err.println("Exception:"+ er);
            }
        
        }

    }
