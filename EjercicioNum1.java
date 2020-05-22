import java.util.Scanner;

public class EjercicioNum1{
  public static Scanner teclado = new Scanner(System.in);
  //CalcularNotaFinalCWMM
  public static void main(String args[]){
  //Declaramos las Variables
   double Nota1=0, Nota2=0, Nota3=0, Nota4=0, NotaFinal =0;
  //Datos de Entrada 
   System.out.println("Ingre las notas obtenidas");
   System.out.println("NOTA 1:");
   Nota1 = teclado.nextDouble();
   System.out.println("NOTA 2:");
   Nota2 = teclado.nextDouble();
   System.out.println("NOTA 3:"); 
   Nota3 = teclado.nextDouble();
   System.out.println("NOTA 4:");
   Nota4 = teclado.nextDouble();
   //Proceso, en esta parte obtenemos la nota final 
   //segun el porcentaje de valor de las notas ingresadas
   Nota1 = Nota1 * 0.15;
   Nota2 = Nota2 * 0.20;
   Nota3 = Nota3 * 0.25;
   Nota4 = Nota4 * 0.40;
 
   NotaFinal = Nota1 + Nota2 + Nota3 + Nota4;
   //Datos de Salida 
   System.out.println("La nota final de curo de F.P es de: "+ NotaFinal);
 } 
}