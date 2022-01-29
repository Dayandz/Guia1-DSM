//Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares
import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int num,par, impar ,div;
    par=0 ; impar=0 ;
    do{
      System.out.print("ingrese el numero: (ingrese 0 para terminar):");
      num= teclado.nextInt();
      div= num % 2;
      if(num!=0){
        if(div==0){
        par++;
        }
        else{
          impar++;
        }
      }
      else{/*para no contar el 0*/ }      
    }while(num != 0);
    System.out.println("habian "+ par +" pares y habian "+ impar +" impares");
  }
}