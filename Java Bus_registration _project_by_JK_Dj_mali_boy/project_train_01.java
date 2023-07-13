import java.util.Scanner;

class train {


    int s;


    int cc;


    void acc() {

        System.out.println("___________________________________________");
        System.out.println("|                                         |");
        System.out.println("|        Welcome to Pune Junction         |");
        System.out.println("|                                         |");
        System.out.println("-------------------------------------------");


        Scanner sc = new Scanner(System.in);


        System.out.println("___________________________________________");
        System.out.println("|                                         |");
        System.out.println("|             1.Mumbai Junction           |");
        System.out.println("|             2.Sangli Junction           |");
        System.out.println("|             3.Nagpur Junction           |");
        System.out.println("|             4.Satara Junction           |");
        System.out.println("|                                         |");
        System.out.println("-------------------------------------------");


        Scanner s = new Scanner(System.in);

        System.out.println("Enter Opions for Destination: ");
        cc = s.nextInt();

        switch (cc) {
            case 1: //Mumbai;
                System.out.println("____________________________________________");
                System.out.println("-------------------------------------------");
                System.out.println("|                                         |");
                System.out.println(" \\                                      /");
                System.out.println("  \\           We wish!                 /");
                System.out.println("   \\            Your Journey          /");
                System.out.println("    \\           GOES FINE            /");
                System.out.println("     \\         Pune Junction        /");
                System.out.println("      \\             To             /");
                System.out.println("       \\      Mumbai Junction     /");
                System.out.println("        \\                         /");
                System.out.println("         |||||||||||||||||||||||||");
                System.out.println("-------------------------------------------");
                System.out.println("         |||||||||||||||||||||||||");
                System.out.println("        /         Your Payment   \\");
                System.out.println("       /             From          \\");
                System.out.println("      /           Pune Junction     \\");
                System.out.println("     /               To              \\");
                System.out.println("    /         Mumbai Junction         \\");
                System.out.println("   /                is                  \\");
                System.out.println("-------------------------------------------");
                System.out.println("|                ₹ 150                    |");
                System.out.println("___________________________________________");


                break;

            case 2: //Sangli;

                System.out.println("We wish your journey goes fine from Pune Junction to Sangli Junction ");
                System.out.println("Your payment from  Pune Junction to Sangli Junction  is: " + " ₹ " + " 200");
                break;

            case 3: //Nagpur;
                System.out.println("We wish your journey goes fine from Pune Junction to Nagpur Junction ");
                System.out.println("Your payment from  Pune Junction to Nagpur Junction  is: " + " ₹ " + " 300");
                break;


            case 4: //Satara;
                System.out.println("We wish your journey goes fine from Pune Junction to Satara Junction ");
                System.out.println("Your payment from  Pune Junction to Mumbai Junction  is: " + " ₹ " + " 100");
                break;

            default:
                System.out.println("Please enter valid opinion");
        }

    }
}

public class project_train_01 {


    public static void main(String[] args) {
    train t = new train();
        t.acc();
    }
}
