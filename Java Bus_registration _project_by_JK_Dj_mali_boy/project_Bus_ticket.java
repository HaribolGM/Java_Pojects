
import java.util.*;

class Bus {

   String enter;
   String destination;

  int Mumbai;
  int Pune ;

    int puneToMumbai;
    int MumbaiToPune;
    void accept(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Where Enter in bus : ");
        enter = sc.next();
        System.out.println("Enter final destination : ");
        destination = sc.next();

    }


void cal()
{
    this.puneToMumbai = 300;
   this.MumbaiToPune = 400;
}

        void display()
    {
            if (enter.equals("Mumbai") && destination.equals("Pune"))
            {
                System.out.println("We wish your journey goes fine to ");
                System.out.println("Your payment for entry point to Pune is: " + " ₹ " +MumbaiToPune);
            }

            else if (enter.equals("Pune") && destination.equals("Mumbai"))
            {
                System.out.println("We wish your journey goes fine from Pune to Mumbai ");
                System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + puneToMumbai);
            }

            else {
                System.out.println("Please enter valid destination point.");
            }
        }

    }





public class project_Bus_ticket {
    public static void main(String[] args) {



                Bus c = new Bus();
                c.cal();
                c.accept();
                c.display();


    }
}
