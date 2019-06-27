package bio;
import java.util.Scanner;

public class Bio2 {
    private Scanner myObject;
    private static String[] movielist;

    public static void main(String[] args) {
        int ticket = 0;
        String[] movielist = {"1).Blinky Bill filmen;", "2).Draktr?naren;", "3).Dr?mparken;", "4).Dumbo;", "5).Husdjurens;", "6).Aladdi", "7).Pokemon:Detective pikachu", "8).Lejonkungen"};
        int[] movielistAge = {7, 7, 7, 7, 7, 7, 11, 15};

        //create scanner object
        Scanner scannerObject = new Scanner(System.in);

        //create person object
        //request name
        System.out.println("Ange ditt namn.");

        String name = scannerObject.nextLine();
        System.out.println("Ditt namn är: " + name);

        //request age
        System.out.println("Ange din ålder, tack");

        //get string from scanner, convert it to int.

        int age = Integer.parseInt(scannerObject.next());

        if (age<3) {

            System.out.println("Förlåt, du kan inte köpa bijleter här.");
        } else {
        System.out.println("Din ålder är: " + age);

        System.out.println("Har du har målmat? Ja eller Nej");
        String mat = scannerObject.next();
            if (mat.equals("Ja")) {
                age = age + 4;
                System.out.println(age);
            }

        //creat person object
        int n = 0;
        while (n < 3) {
            System.out.println("Du kan välja en fil här!");
            for (int i = 0; i< movielist.length ; i++) {
                System.out.println(movielist[i]);
            }

            int number = Integer.parseInt(scannerObject.next());
            int agelimit=movielistAge[number-1];
            System.out.println("filmen Åldering gräns är" + agelimit +".");



            //System.out.println(scannerObject.getName() + personObject.getAge());

            //request name change

            if (age >= 15) {
                System.out.println("You are allowed to buy what you want!");
                System.out.println("Du har vält den filmen." + movielist[number - 1] + ".");
                System.out.println("Hur många bljetter du ska köpa nu?");
                int ticketNumber = Integer.parseInt(scannerObject.next());
                ticket = ticketNumber + ticket;
                n = n + 1;

            } else if (agelimit > age) {
                System.out.println("Förlåt, kommer när du är 7:).");

            } else if (agelimit <= age) {
                System.out.println("Du kan köpa vad du behöver med din åld , hur många bijliet du ska köpa?");
                int ticketNumber = Integer.parseInt(scannerObject.next());
                ticket = ticketNumber + ticket;
                n = n + 1;
            }

        }

        System.out.println("Ha du har rabattkort? Ja eller Nej");
        String input = scannerObject.next();
        if (input.equals("Ja")) {
            System.out.println("Du får 20kr discount per. ");
            int Total_price = ticket * 80;
            System.out.println("De kostar " + Total_price + "kr.");
        } else {
            System.out.println("Du får inte discount per biljet.");
            int Total_price = ticket * 100;
            System.out.println("De kostar " + Total_price + "kr.");
        }
    }}
}



