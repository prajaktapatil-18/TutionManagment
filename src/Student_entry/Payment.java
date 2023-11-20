package Student_entry;

import java.util.Scanner;

public class Payment {
int payment;
        int six_std_math =600;
        int six_std_English =500;
        int six_std_Science =500;

        int sev_std_math =700;
        int sev_std_English =600;
        int sev_std_science =500;

        int eight_std_math =800;
        int eight_std_english =700;
        int eight_std_science =600;




        public void payment(){
                int total = six_std_English+six_std_math+ six_std_Science;
                System.out.println("you have to pay " + total);

                System.out.println("choose\n" +
                        "1.pay\n" +
                        "2.after pay");
                Scanner scan = new Scanner(System.in);
                int paymentDecision = scan.nextInt();
                if (paymentDecision==1){
                        System.out.println("you have to pay" + total);
                        int payment = scan.nextInt();
                        if (payment==total){
                                System.out.println("welcome now you are a student of our classes we will sent all information on your number\n" +
                                        "thank you");

                        }else {
                                System.out.println("check again");
                        }

                }

        }





}
