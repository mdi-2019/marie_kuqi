package fr.esir.mdi;
import java.util.Scanner;
import org.apache.commons.math3.*;


/**
 * Created by 16002492 on 11/02/19.
 */


public class Scientifique {

    public static double cosinus(double angle){
        return  Math.cos(angle);
    }


    public static double puissance(int base, int exposant){
        return Math.pow(base, exposant);
    }

    public static void main() {
        System.out.println("Choisissez l'opération :");
        System.out.println("1 - cosinus");
        System.out.println("2 - puissance");

        Scanner scan = new Scanner(System.in);
        switch(scan.nextInt()){
            case 1:
                System.out.println("COSINUS");
                System.out.println("Veuillez choisir l'angle:");
                Scanner cos = new Scanner(System.in);
                Double angle = cos.nextDouble();
                cos.close();
                System.out.println("Cosinus de l'angle : " + angle + " est : " + cosinus(angle));;
                break;

            case 2:
                System.out.println("PUISSANCE");
                System.out.println("Veuillez choisir la base:");
                Scanner pow = new Scanner(System.in);
                int base = pow.nextInt();
                int exposant = pow.nextInt();
                pow.close();
                System.out.println("Résultat de " + base + " puissance de " + exposant + " est : " + puissance(base, exposant));
                break;
            default:
                System.exit(0);
        }
        scan.close();

    }
}
