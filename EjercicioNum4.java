import java.util.Scanner;

public class EjercicioNum4{
  public static Scanner teclado = new Scanner(System.in);
   //CalculoDeOperacionesAritmeticasCWMM
   public static void main(String args[]){
   //Declarar las Variables
   double ValorA=0, ValorB=0, Resultado=0;
   int operacion=0;
   //Datos de Entrada
   System.out.println("Ingrese el Valor A");
   ValorA = teclado.nextDouble();
   System.out.println("Ingrese el Valor B");
   ValorB = teclado.nextDouble();
   System.out.println("Ingrese la opci�n de la operaci�n que desea realizar");
   System.out.println("Suma: 1");
   System.out.println("Resta: 2");
   System.out.println("Multiplicaci�n: 3");
   System.out.println("Divici�n: 4");
   System.out.println("Potencia: 5");
   operacion = teclado.nextInt();
   //Proceso
   //En esta parta evaluamos los valores acorde a la operaci�n asignada anteriormente 
   switch(operacion){
    case 1: Resultado = ValorA + ValorB;
            break;
    case 2: Resultado = ValorA - ValorB;
            break;
    case 3: Resultado = ValorA * ValorB;
            break;
    case 4: Resultado = ValorA / ValorB;
            break;
    case 5: Resultado = (double) Math.pow(ValorA, ValorB);
            break;
    //Dato de salida alternativa 
    default: System.out.println("Por favor ingrese el n�mero de una de las operaci�nes precentadas");
             break;
  }
    //Dato de Salida 
    System.out.println("El resutado de la operaci�n entre los dos valores es: "+ Resultado);
 }
}