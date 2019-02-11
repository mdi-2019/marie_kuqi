package fr.esir.mdi;

import org.apache.commons.math3.util.Pair;

import java.util.Scanner;

/**
 * Created by 16002492 on 11/02/19.
 */
public class Normal {
    public static void main()
    {
        System.out.println("MODE NORMAL");
        System.out.println( "Choisir une opération :" );
        System.out.println( "1 - Addition" );
        System.out.println( "0 - Quitter" );

        Scanner scanner = new Scanner(System.in);

        int scannedInt = scanner.nextInt();

        switch(scannedInt) {
            case 0:
                System.exit(0);
                break;

            case 1:
                System.out.println("ADDITION");
                Pair<Integer, Integer> args = readPairFromUserInput(scanner);
                int result = add(args.getFirst(), args.getSecond());
                System.out.println(result);
                break;

            default:
                System.exit(0);
        }
    }

    private static Pair<Integer, Integer> readPairFromUserInput(Scanner scanner) {
        System.out.println("Saisir argument 1 : ");
        int scannedFirstArg = scanner.nextInt();

        System.out.println("Saisir argument 2 : ");
        int scannedSecondArg = scanner.nextInt();

        return new Pair<Integer, Integer>(scannedFirstArg, scannedSecondArg);
    }

    public static int add(int firstArg, int secondArg) {
        return firstArg + secondArg;
    }
}
