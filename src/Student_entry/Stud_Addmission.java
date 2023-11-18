package Student_entry;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Stud_Addmission {



    public void entry() {
        System.out.println("Welcome");
        System.out.println("Hello, my self Tina Swaymbhu\n" +
                "I have started tutions for 6 st to 8 standard student. In this class which subject you want that you can choose for your children");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your  full name ");
        String stud_name = scan.nextLine();
        System.out.println("Enter your address");
        String stud_add = scan.nextLine();

        System.out.println("Enbter ypour phone number");
        String stud_phn_no = scan.nextLine();


    }

    public void fees() {
        Stud_Addmission sa = new Stud_Addmission();
        System.out.println("We are teaching some particular  subjects \n" +
                "yoc can choose which subjects you want");
        Scanner scan = new Scanner(System.in);
        System.out.println("If you want to see fees structure click  1.\n" +
                "2. select subject");

        int choose = scan.nextInt();
        if (choose == 1) {
            System.out.println("6th std = \n" +
                    "mathematics =500\n" +
                    "english = 500\n" +
                    "science = 500\n" +
                    "***********************************************\n" +
                    "7th std = \n" +
                    "mathematics =600\n" +
                    "english =500\n" +
                    "science =600\n" +
                    "**************************************************\n" +
                    "eight std = \n" +
                    "mathematics = 700\n" +
                    "english = 600\n" +
                    "science = 600");
            sa.fees();
        } else if(choose==2){
            sa.selectSub();


        }else{
            System.out.println("Invalid");
        }
    }

        public void selectSub(){

            Scanner scan = new Scanner(System.in);
            System.out.println("Hello choose properly\n" +
                    "1. 6th standard\n" +
                    "2. 7th standard\n" +
                    "3. 8th standard");
            int choice = scan.nextInt();
            SelectSubject selectSubject =new SelectSubject();


            if (choice == 1) {
                selectSubject.six_std();
//            ***********************
            } else if (choice == 3) {
                //*****************

            } else if (choice == 3) {


            } else {
                System.out.println("Invalid please check again");
            }

        }
        public static void main(String [] args){

        Stud_Addmission studAddmission = new Stud_Addmission();
        studAddmission.entry();
        studAddmission.fees();

        }

    }
