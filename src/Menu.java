import java.util.Scanner;
public class Menu {
    public static void menuPrompt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Reminder App");
        System.out.println("What would you like to do?");
        System.out.println("0 to quit");
        System.out.println("1 to view Reminders");
        System.out.println("2 to add new Reminders");
        System.out.println("3 to delete a Reminder");
        System.out.println("4 to edit a Reminder");
        int choice = input.nextInt();
        while(choice != 0) {
            switch (choice) {
                case 1:
                    // view reminders
                    break;
                case 2:
                    // add reminders
                    break;
                case 3:
                    // delete reminder
                    break;
                case 4:
                    // edit reminder
                    break;
            }
        }
    }
}
