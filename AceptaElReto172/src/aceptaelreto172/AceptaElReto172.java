package aceptaelreto172;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class AceptaElReto172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int numsillas = 1;
        numsillas = sc.nextInt();
        while (numsillas != 0) {

            String src = sc.nextLine();
            boolean bool1 = false;
            boolean bool2 = false;
            for (int i = 0; i < src.length(); i++) {
                if (src.charAt(i) == 'I') {
                    bool1 = true;
                } if (src.charAt(i) == 'D') {
                    bool2 = true;
                }
            }
            if (bool1 && bool2) {
                System.out.println("ALGUNO NO COME");
            } else {
                System.out.println("TODOS COMEN");
            }
            numsillas = sc.nextInt();
        }
    }
}