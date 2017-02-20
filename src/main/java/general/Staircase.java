package general;/*

solution(6)

Example Output:

     #
    ##
   ###
  ####
 #####
######

*/

public class Staircase {


    public void solution(int n) {
        for (int i = 0; i < n; i++) {

            for (int w = 1; w <= n; w++) {
                System.out.print(w < n - i ? " " : "#");
            }

            System.out.println("");
        }
    }


//    public void solution(int n) {
//
//        int step = 1;
//
//        // start rendering rows
//        for (int i = 0; i < n; i++) {
//
//            // render spaces
//            int spaces = n - step;
//            for (int w = 0; w < spaces; w++) {
//                System.out.print(" ");
//            }
//
//            // render steps
//            for (int l = 0; l < step; l++) {
//                System.out.print("#");
//            }
//
//            step++;
//            System.out.println("");
//        }
//    }
}