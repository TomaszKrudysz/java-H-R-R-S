import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String hotelName = "Overlook";
        int systemVersion = 1;
        boolean isDeveloperVersion = true;

        showSystemInfo(hotelName,systemVersion,isDeveloperVersion);

        Scanner input = new Scanner(System.in);

        int option = getActionFromUser(input);

        if (option == 1) {
            Guest newGuest = createNewGuest(input);
        } else if (option == 2) {
            Room newRoom = createNewRoom(input);
        } else if (option == 3) {
            System.out.println("Wybrano opcję 3");
        } else {
            System.out.println("Wybrano niepoprawną akcję");
        }

    }

    private static void showSystemInfo(String hotelName, int systemVersion, boolean isDeveloperVersion){


        System.out.println("Witamy w systemie rezerwacji dla hotelu " + hotelName);
        System.out.println("Aktualna wersja systemu: " + systemVersion);
        System.out.println("Wersja developerska: " + isDeveloperVersion);


        System.out.println("\n================================\n");
    }

    private static int getActionFromUser(Scanner in){
        System.out.println("1. Dodaj nowego gościa");
        System.out.println("2. Dodaj nowy pokój");
        System.out.println("3. Wyszukaj gościa");
        System.out.println("Wybierz opcję: ");

        int actionNumber = 0;

        try {
            actionNumber = in.nextInt();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane wejściowe, wybierz liczbę");
            e.printStackTrace();
        }

        return actionNumber;
    }
    private static Guest createNewGuest (Scanner input){
        try {
            System.out.println("Tworzymy nowego gościa");
            System.out.print("Podaj imię: ");
            String firstName = input.next();
            System.out.print("Podaj nazwisko: ");
            String lastName = input.next();
            System.out.print("Podaj wiek: ");
            int age = input.nextInt();
            Guest newGuest = new Guest(firstName,lastName,age);
            System.out.println(newGuest.getInfo());
            return newGuest;
        } catch (Exception e){
            System.out.println("Zły wiek, używaj liczb");
            e.printStackTrace();
            return null;
        }

    }
    private static Room createNewRoom(Scanner input){
        try {
            System.out.print("Numer: ");
            int number = input.nextInt();
            System.out.println("Ilość łóżek: ");
            int beds = input.nextInt();
            Room newRoom = new Room(number,beds);
            System.out.println(newRoom.getInfo());
            return newRoom;
        }catch (Exception e){
            System.out.println("Podaj liczby");
            e.printStackTrace();
            return null;
        }
    }

}
