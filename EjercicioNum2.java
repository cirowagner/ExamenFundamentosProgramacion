import java.util.Scanner;

public class EjercicioNum2{
  public static Scanner teclado = new Scanner(System.in);  
   //Bono De Desempeño del Docente CWMM
   //Este algoritmo no permitira bonificar al Docente por su desempeño laboral
   public static void main(String args[]){
    //Declarar las Variables
    double Bono=0, SalarioMin;
    int Puntos;
    //Datos de Entrada
    System.out.print("Ingrese el salario minimo del docente");
    SalarioMin = teclado.nextDouble();
    System.out.print("Ingrese los puntos obtenidos");
    Puntos = teclado.nextInt();
    //Proceso
    //En esta parte calculamos el bono total en base a los puntos del docente
    if(Puntos>=20 && Puntos<=100){
     Bono = SalarioMin*0.10;
   }else if(Puntos>=101 && Puntos<=200){
     Bono = SalarioMin*0.50;  
   }else{
     Bono = SalarioMin*1;
   } 
    //Datos de Salida
    System.out.print("El monto del bono total es de: "+ Bono +" Soles");  
  }
 }