package cumpleaños;

import java.util.Scanner;

public class Cumpleaños {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      int edad,cont=0,x=0;
      
      
        System.out.println("Digite la edad del cumpleañero: ");
        edad=entrada.nextInt();
        int tama[]=new int[edad];
        
        for(int i=0;i<edad;i++){
            System.out.print(" Tamaño de la vela "+(i+1)+": ");
            tama[i]=entrada.nextInt();   
                  if(x<tama[i]){
                      x=tama[i];
                  }
        }
        for(int i=0;i<edad;i++){
                 if(tama[i]==x){
                      cont++;
                  }
        }
     
      
        System.out.println("velas que se van a apagar: "+cont);
    }
    
}
