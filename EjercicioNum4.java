import java.util.Scanner;

public class EjercicioNum4{
  public static void main(String args[]){
   
   Scanner teclado = new Scanner(System.in);
   int ValorA=0, ValorB=0, Resultado=0;
   int operacion=0;
   
   System.out.println("Ingrese el Valor A");
   ValorA = teclado.nextInt;
   System.out.println("Ingrese el Valor A");
   ValorB = teclado.nextInt;
   System.out.println("Ingrese la operacion que desea realizar");
   System.out.println("Suma: 1");
   System.out.println("Resta: 2");
   System.out.println("Multiplicaci�n: 3");
   System.out.println("Divici�n: 4");
   System.out.println("Potencia: 5");
   operacion = teclado.nextInt;

   switch(operacion){
    case 1: Resultado = ValorA + ValorB;
            break;
    case 2: Resultado = ValorA - ValorB;
            break;
    case 3: Resultado = ValorA * ValorB;
            break;
    case 4: Resultado = ValorA / ValorB;
            break;

    default: System.out.println("Por favor ingrese el n�mero de una de las operaci�nes precentadas");
             break;
  }
 }
}