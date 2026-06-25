import java.util.Scanner;
import java.util.InputMismatchException;


public class DecodeLabs_Java_P4_v2 {
        public static void main(String[] args){
        int base, currency;
        double baseRate =0, amount=0; 
        double usd = 1, pak = 300, inr = 90;
        String currencyName  = "";
        Scanner sc = new Scanner(System.in);

        while(true) {

            try {
                System.out.println("Which currency do you have Right Now! 1.USD | 2.INR | 3.PKR");
                base = sc.nextInt();
                if(base<=0) {
                    System.out.println("Write More than 0");
                    continue;
                }
                else if(base>3) {
                    System.out.println("Write Between 1-3");
                    continue;
                }
            if(base == 1) {
                currencyName = "USD";
                baseRate = usd;

                while(true) {
                    try {
                        System.out.println("How much USD you want to Convert");
                        amount = sc.nextDouble();
                        if(amount <= 0) {
                            System.out.println("Write above 0");
                            continue;
                        }
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("Invalid Amount! Write Numbers Only!");
                        sc.nextLine();
                        continue;
                    }
                }
                break;
            }

            else if(base == 2) {
                currencyName  = "INR";
                baseRate = inr;

                while(true) {
                    try {
                        System.out.println("How much INR you want to Convert");
                        amount = sc.nextDouble();
                        if(amount<=0) {
                            System.out.println("Write above 0");
                            continue;
                        }
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("Invalid Amount! Write Numbers Only!");
                        sc.nextLine();
                        continue;
                    }
                }
                break;
            }
            else if(base == 3) {
                currencyName  = "PKR";
                baseRate = pak;

                while(true) {
                    try {
                        System.out.println("How much PKR you want to Convert");
                        amount = sc.nextDouble();
                        if(amount<=0) {
                            System.out.println("Write above 0");
                            continue;
                        }
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("Invalid Amount! Write Numbers Only!");
                        sc.nextLine();
                        continue;
                    }
                }
                break;
            }

            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid Amount! Write Numbers Only!");
                sc.nextLine();
                continue;
            }
        }

        while(true) {

            try {
                System.out.println("In Which currency do you wanna Convert: 1.USD | 2.INR | 3.PKR");
                currency = sc.nextInt();
                if(currency<=0) {
                        System.out.println("Write More than 0");
                        continue;
                }
                 else if(currency>3) {
                    System.out.println("Write Between 1-3");
                    continue;
                }

            if(currency == 1) {
                System.out.println(amount + " " + currencyName  + " = Converting to USD");
                convertCurrency(amount, baseRate, usd);
                break;
            }
            else if(currency == 2) {
                System.out.println(amount + " " + currencyName  + " = Converting to INR");
                convertCurrency(amount, baseRate, inr);
                break;
            }
            else if(currency == 3) {
                System.out.println(amount + " " + currencyName   + " = Converting to PKR");
                convertCurrency(amount, baseRate, pak);
                break;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid Amount! Write Numbers Only!");
                sc.nextLine();
                continue;
            }
        }
    
    }
            public static void convertCurrency(double amount, double fromRate, double toRate) {
                double usdAmount = amount / fromRate;
                double result = usdAmount * toRate;
                System.out.println("Amount = " + result);
            }
}