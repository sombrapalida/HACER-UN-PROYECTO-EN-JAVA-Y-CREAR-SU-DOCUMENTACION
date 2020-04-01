
package principal;
import figura.circulo;  //imnportamso fichero anterior


public class Main {
    public static void main(String[] args){
    double centrox=1; //definimos las variables otra vez
    double centroy=1;
    double radio=5;
    circulo c1 =new circulo(centrox,centroy,radio);
    // a continuacion imprimimos todas las variables
    System.out.println("Area del circulo = " + c1.areaCirculo());
    System.out.println ("Perimetro del circulo = " + c1.perimetroCirculo());
    c1.movercirculo(10,10);
    System.out.println("centro x nuevo = " +c1.getcentrox ());
        System.out.println("centro y nuevo = " +c1.getcentroy ());

    }
}


