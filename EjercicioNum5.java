import java.util.Scanner;

public class EjercicioNum5{
  public static Scanner teclado = new Scanner(System.in);  
   //IncrementoDeSalarioCWMM
  public static void main(String args[]){
   //Declarar las Variables 
  double SalarioAnual=0, SalarioTotal, SalarioInicial, Incremento;
  int Tiempo;
  //Datos de Entrada 
  System.out.println("Ingrese el salario inicial del docente");
  SalarioInicial = teclado.nextDouble();
  System.out.println("Ingrese el timpo en años de servicio");
  Tiempo = teclado.nextInt();
  //Dato de Entrada, determinamos el valor inicial que dara paso a una Iteración 
  int z=1;
  // Proceso, en esta parte desarrollamos el proceso a seguirse segun el 
  // número de Interaciones y el valor limite propuesto
  while(z<=Tiempo){

    Incremento = SalarioInicial*0.10;
    SalarioAnual = Incremento + SalarioInicial;
    
    System.out.println("El salario del año"+z+"es de: S/."+SalarioAnual+"Soles");
      z+=1;
  } 
  //Proceso final para el dato de salida 
    SalarioAnual = (double)SalarioAnual*Tiempo;
    SalarioTotal = SalarioAnual;
  //Dato de Salida
    System.out.println("El salario total de los "+Tiempo+" años de servicio es de: S/."+SalarioTotal+" Soles");
 }
}