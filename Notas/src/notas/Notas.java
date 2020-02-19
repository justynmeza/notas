/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Meza Duran
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int naprob = 0, aprob = 0;
        float n = 0, nota = 0, sumanota = 0, nb = 5, na = 0;
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Digite número de estudiantes: ");
        
        n = sc.nextFloat();
        
        if (n >= 1) {
            for (float i = 0; i < n; i++) {
                System.out.println("Digite la nota de los estudiantes");
                nota = sc.nextFloat();
                sumanota += nota;
                
                if (nota >= 3) {
                    aprob = aprob + 1;
                } else {
                    naprob = naprob + 1;
                }
                if (nota < nb) {
                    nb = nota;
                }
                if (nota > na) {
                    na = nota;
                }
            }
            
        } else {
            System.out.println("No hay estudiantes");
        }
        System.out.println("Número de estudiantes que aprobaron= "+aprob);
        System.out.println("Número de estudiantes que no aprobaron= "+naprob);
        System.out.println("El promedio de las notas entre los estudiantes son= "+df.format((float)sumanota/n));
        System.out.println("La nota mas baja es= "+nb);
        System.out.println("La nota mas alta es= "+na);
    }
    
}
