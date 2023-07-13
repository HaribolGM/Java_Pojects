

import java.util.*;

class bus {



int c;
int s;

int a;
int ch;


    void accept(){

        System.out.println("___________________________________________");
        System.out.println("|                                         |");
        System.out.println("|        Welcome to Pune Station          |");
        System.out.println("|                                         |");
        System.out.println("-------------------------------------------");


        Scanner sc = new Scanner(System.in);

        System.out.println("___________________________________________");
        System.out.println("|                                         |");
        System.out.println("|              1. Male                    |");
        System.out.println("|              2. Female                  |");
        System.out.println("|                                         |");
        System.out.println("-------------------------------------------");



        System.out.println("Enter Opions for Gender ");
      a = sc.nextInt();

      switch (a)
      {
          case 1 : // male

              System.out.println("___________________________________________");
              System.out.println("|                                         |");
              System.out.println("|        Welcome to Pune Station          |");
              System.out.println("|                                         |");
              System.out.println("-------------------------------------------");




              System.out.println("___________________________________________");
              System.out.println("|                                         |");
              System.out.println("|               1.Mumbai                  |");
              System.out.println("|               2.Sangli                  |");
              System.out.println("|               3.Nagpur                  |");
              System.out.println("|               4.Satara                  |");
              System.out.println("|                                         |");
              System.out.println("-------------------------------------------");


              Scanner s = new Scanner(System.in);

              System.out.println("Enter Opions for Destination: ");
           ch = s.nextInt();

              switch(ch)
              {
                  case 1: //Mumbai;
                      System.out.println("We wish your journey goes fine from Pune to Mumbai ");
                      System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + " 250");
                      break;

                  case 2: //Sangli;

                      System.out.println("We wish your journey goes fine from Pune to Sangli ");
                      System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + " 300");
                      break;

                  case 3: //Nagpur;
                      System.out.println("We wish your journey goes fine from Pune to Nagpur ");
                      System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + " 500");
                      break;


                  case 4: //Satara;
                      System.out.println("We wish your journey goes fine from Pune to Satara ");
                      System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + " 200");
                      break;

                  default:
                      System.out.println("Please enter valid opinion");
              }




              break;



          case 2 : // female

              System.out.println("___________________________________________");
              System.out.println("|                                         |");
              System.out.println("|        Welcome to Pune Station          |");
              System.out.println("|                                         |");
              System.out.println("-------------------------------------------");



              System.out.println("___________________________________________");
              System.out.println("|                                         |");
              System.out.println("|               1.Mumbai                  |");
              System.out.println("|               2.Sangli                  |");
              System.out.println("|               3.Nagpur                  |");
              System.out.println("|               4.Satara                  |");
              System.out.println("|                                         |");
              System.out.println("-------------------------------------------");


              Scanner a= new Scanner(System.in);

              System.out.println("Enter Opions for Destination: ");
              ch = a.nextInt();

              switch(ch)
              {
                  case 1: //Mumbai;
                      System.out.println("We wish your journey goes fine from Pune to Mumbai ");
                      System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + " 125");
                      break;

                  case 2: //Sangli;

                      System.out.println("We wish your journey goes fine from Pune to Sangli ");
                      System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + " 150");
                      break;

                  case 3: //Nagpur;
                      System.out.println("We wish your journey goes fine from Pune to Nagpur ");
                      System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + " 250");
                      break;


                  case 4: //Satara;
                      System.out.println("We wish your journey goes fine from Pune to Satara ");
                      System.out.println("Your payment from  Pune to Mumbai  is: " + " ₹ " + " 100");
                      break;

                  default:
                      System.out.println("Please enter valid opinion");
              }

              break;
      }





    }

}



public class project_Bus_ticket_02 {
    public static void main(String[] args) {


 bus b  = new bus();
 b.accept();

    }
}
