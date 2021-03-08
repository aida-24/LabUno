import java.util.Scanner;
public class LabUno {
        public static void main (String[] args) {

                Scanner reader = new Scanner(System.in);

                int acc = 0;
                char code = ' ';


                //user info
                System.out.print("Please enter your account number: ");

                acc = reader.nextInt();

                System.out.println("Account number is: " + acc);

                System.out.println("Please enter your service code (A or B): ");

                code = reader.next().toUpperCase().charAt(0);

                System.out.println("Service code is : " + code);
                //switch case
                // if the user enters any other letter than A/a or B/b
                switch (code) {


                        case 'A': {
                                int cost = 0;
                                int maxMin = 0;
                                int mins = 0;
                                double tCost = 0;
                                double amountToPay = 0;

                                cost = 10;
                                maxMin = 50;

                                System.out.println("Please enter the amount of minutes used: ");

                                mins = reader.nextInt();

                                if (mins > maxMin) {
                                        tCost = (mins - maxMin) * 0.2;
                                        amountToPay = (cost + tCost);
                                        System.out.println("The total amount to be paid is: $" + amountToPay);
                                } else {
                                        System.out.println("The total amount to be paid is: " + cost);
                                }

                                break;
                        }

                        case 'B': {

                                int nTimeMins = 0;
                                double nTimeAmount = 0;
                                double mTimeAmount = 0;
                                int bCost = 0;
                                int mTimeMins = 0;
                                double btCost = 0;
                                double bTotal = 0;
                                bCost = 25;

                                System.out.println("Total minutes used from 6am to 6pm? :");
                                mTimeMins = reader.nextInt();

                                System.out.println("Total minutes used from 6pm to 6am? :");
                                nTimeMins = reader.nextInt();

                                if (mTimeMins > 75) {
                                        btCost = (mTimeMins - 75) * 0.10;
                                        mTimeAmount = (bCost + btCost);

                                }
                                if (nTimeMins > 100) {
                                        btCost = (nTimeMins - 100) * 0.05;
                                        nTimeAmount = (bCost + btCost);
                                        bTotal = nTimeAmount + mTimeAmount;
                                        System.out.println("The total amount due is: $" + bTotal);
                                } else {
                                        System.out.println("The total amount due is: " + btCost);
                                }
                        }
                        default: {
                                System.out.println("Please enter a valid service code. Thank you!");

                        }
                }
                return;

        }
}