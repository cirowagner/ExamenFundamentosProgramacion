import java.util.Scanner;

 public class EjercicioNum3{
   public static Scanner teclado = new Scanner(System.in);
   //Este algoritmo ayudara a gestionar que tipo de vacuna se debe administrar a cada persona
   //AplicacionVacunasCOVID19 CWMM
   public static void main(String args[]){
     char sexo;
     int Edad;
   //Datos de Entrada 
     System.out.println("Ingrese la Edad de la persona");
     Edad = teclado.nextInt();
     System.out.println("Ingrese el Sexo de la persona");
     System.out.println("Masculino: M");
     System.out.println("Femenino: F");
     sexo = teclado.next().charAt(0);
   //Proceso,  en esta parte identificamos el tipo de vacuna a administrar en base a la edad y el sexo 
    if(Edad>=70){
       System.out.println("Administrar vacuna tipo C");
    }else if(Edad>=16 && Edad<=69){
       if(sexo=='F'){
       System.out.println("Administrar vacuna tipo B");
      }else{
       System.out.println("Administrar vacuna tipo A");
      }

    }else{
       System.out.println("Administrar vacuna tipo A");
    }
    //Datos de Salida
    System.out.println("¡Gracias!");
 }
}
   