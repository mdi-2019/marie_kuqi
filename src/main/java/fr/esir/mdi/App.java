package fr.esir.mdi;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "CALCULATRICE - KUQI Marlon & MARIE Theo" );
        System.out.println( "Choisir un mode :" );
        System.out.println( "1 - Normal" );
        System.out.println( "2 - Scientifique" );
        System.out.println( "0 - Quitter" );

        Scanner scanner = new Scanner(System.in);

        int scannedInt = scanner.nextInt();

        switch(scannedInt) {
            case 0:
                System.exit(0);
                break;

            case 1:
                Normal.main();
                break;

            case 2:
                Scientifique.main();
                break;

            default:
                System.exit(0);
        }
    }
}
