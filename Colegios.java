package colegios;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegios {
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        ArrayList <String> estudiante;
        estudiante = new ArrayList();      
       int estu;
       int n[];
       double pro=0,not,apro=0,est,tot;
       System.out.println("Digite el numero de estudiantes");
        estu=leer.nextInt();
        n= new int [estu];
        for(int i=1; i<=estu; i++){
              System.out.println("Digite el nombre del estudiante "+i);
            estudiante.add(leer.next());
            System.out.println("Digite la nota del estudiante "+i);
            not=leer.nextDouble();
            pro=pro+not;
            if(not>=3){
              apro=apro+1;
         }        
     }                              
         System.out.println(estudiante);   
         tot=pro/estu;
         System.out.println("El promedio de los estudiantes es de: "+tot);
         System.out.println("El total de estudiantes con mas de 3 es de: "+apro);
    
    
}
}


 
 