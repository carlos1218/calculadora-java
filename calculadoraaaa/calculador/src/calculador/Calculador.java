/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.util.*;

/**
 *
 * @author USER
 */
public class Calculador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora oper=new calculadora();
        CalGui calc=new CalGui(); 
        Scanner scan=new Scanner(System.in);
        int seguir;
        
        do {
            
            int selec;
            System.out.println("Calculadora\n Seleccione una opcion: \n 1. Suma\n 2. resta\n 3. multiplicacion\n 4. division\n 5. Seno\n 6. coseno\n 7. Tangente\n 8.raiz\n 9. potencia\n");
            selec = scan.nextInt();
            seguir=0;
            float a=0, b=0;
            switch(selec){

                  case 1:
                      System.out.println("Ingrese el primer valor:");
                      oper.setA(scan.nextFloat());
                      System.out.println("Ingrese el segundo valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.suma());
                      break;
                  case 2:
                      System.out.println("Ingrese el primer valor:");
                      oper.setA(scan.nextFloat());
                      System.out.println("Ingrese el segundo valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.resta());
                      break;
                  case 3:
                      System.out.println("Ingrese el primer valor:");
                      oper.setA(scan.nextFloat());
                      System.out.println("Ingrese el segundo valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.mult());
                      break;
                  case 4:
                      System.out.println("Ingrese el primer valor:");
                      oper.setA(scan.nextFloat());
                      System.out.println("Ingrese el segundo valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.div());
                      break;
                  case 5:
                      System.out.println("Ingrese el valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.seno());
                      break;
                  case 6:
                      System.out.println("Ingrese el valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.coseno());
                      break;
                  case 7:
                      System.out.println("Ingrese el valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.tang());
                      break;
                  case 8:
                      System.out.println("Ingrese el valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.raiz());
                      break;
                  case 9:
                      System.out.println("Ingrese el primer valor:");
                      oper.setA(scan.nextFloat());
                      System.out.println("Ingrese el segundo valor:");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado:"+oper.pot());
                      break;
                  case 10:
                      System.out.println("Ingrese el numero");
                      oper.setA(scan.nextFloat());              
                      System.out.println("ingrese el porcentaje");
                      oper.setB(scan.nextFloat());
                      System.out.println("Resultado" + oper.porc()+"%");
                      break;                          
              }
              Scanner Seguir = new Scanner(System.in);
              System.out.println("\nSeguir?... \n1 Para SI \n2 Para NO");
              seguir=Seguir.nextInt();
        } while (seguir==1);
        
         
       
        

// TODO code application logic here
    }
    
}
