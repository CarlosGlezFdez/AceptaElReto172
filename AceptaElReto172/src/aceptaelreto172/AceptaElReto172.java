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
            boolean bool1 = true;
            boolean bool2 = true;
            for (int i = 0; i < numsillas; i++) {
                if (src.charAt(i + 1) == 'I') {
                    bool1 = false;
                } else if (src.charAt(i) == 'D') {
                    bool2 = false;
                }
            }
            if (bool1 == false && bool2 == false) {
                System.out.println("ALGUNO NO COME");
            } else {
                System.out.println("TODOS COMEN");
            }
            numsillas = sc.nextInt();
        }
    }
}
