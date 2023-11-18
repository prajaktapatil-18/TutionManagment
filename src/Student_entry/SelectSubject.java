package Student_entry;


import java.util.Scanner;

public class SelectSubject {

    public void  six_std(){
        Scanner scan = new Scanner(System.in);
        System.out.println("choose which sub you want to choose\n" +
                "1. All subjects\n" +
                "2. i want to choose");

        int choice = scan.nextInt();
        int choiceNew= scan.nextInt();
        Payment payment = new Payment();

        if (choice==1){
            System.out.println("Done\n" +
                    "Welcome dear student you have taken all subject class\n" +
                    "We will provide/send all curiculam of classes and important thing which is useful\n" +
                    "when you will pay 1 month fees and advance ");
            payment.payment();
            //*****************************

        } else if (choice==2) {

            System.out.println("How many subject you want 1. math 2. english 3. science\n" +
                    "1\n" +
                    "2");
            if (choiceNew==1){
                System.out.println("enetr a subject ");
                int one = scan.nextInt();
                System.out.println("welcome");


            } else if (choiceNew==2) {
                System.out.println("enter any two subject");
                int one = scan.nextInt();
                int two = scan.nextInt();
                System.out.println("welcome");

            }

        }

    }
}
