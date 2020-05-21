import java.util.Scanner;

public class EjercicioNum1{
  public static void main(String args[]){

   Scanner teclado = new Scanner(System.in);
   int notaFinal = "";
   int nota1=0, nota2=0, nota3=0, nota4=0;

   System.out.println("Ingre las notas obtenidas");
   System.out.println("NOTA 1:");
   nota1 = teclado.nextInt();

   System.out.println("NOTA 2:");
   nota2 = teclado.nextInt();

   System.out.println("NOTA 3:"); 
   nota3 = teclado.nextInt();

   System.out.println("NOTA 4:");
   nota4 = teclado.nextInt();
  
   nota1T = nota1 * 0.15;
   nota2S = nota2 * 0.20;
   nota3V = nota3 * 0.25;
   nota4B = nota4 * 0.40;

   notaFinal = nota1T+nota2S+nota3V+nota4B;
   
   System.out.println("La nota final de curo de F.P es de: "+ notaFinal);
 } 
}