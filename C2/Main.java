//Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores
import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int num,mas, menos ,div, f;
    mas=0 ; menos=0 ;
    for (f=1 ; f<=10 ; f++){
      System.out.print("ingrese la nota: ");
      num= teclado.nextInt();
      if(num>= 7 && num <=10){
        mas ++ ;
      } 
      else if (num<7 && num>=1){
        menos ++;
      }     
    }
    System.out.println("habian "+ mas +" notas mayores o iguales a 7 y habian "+ menos +" menores a 7.");
  }
}