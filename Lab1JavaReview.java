import java.util.Scanner;

public class Lab1JavaReview {
    static final int MAX_BOOKS = 5;
    static String[] bookName = new String[MAX_BOOKS];
    static String[] bookStatus = new String[MAX_BOOKS];
    static int books = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n-------------------------------------------------\n");
        System.out.print("========[ LIBRARY BOOK MANGEMENT SYSTEM ]========");
        System.out.print("\n-------------------------------------------------\n");

        while(true) {
            System.out.print("\n|-------[ Main Menu ]------|\n");
            System.out.print("|--------------------------|\n");
            System.out.print("|  1  | Add Book           |\n");
            System.out.print("|  2  | Update Book Status |\n");
            System.out.print("|  3  | Show All Books     |\n");
            System.out.print("|  4  | Generate Report    |\n");
            System.out.print("|  5  | Exit               |");
            System.out.print("\n|--------------------------|\n");
            System.out.print("What would you like to do? ");
            int response = scanner.nextInt();

            switch(response) {
                case 1:
                addBooks();
                break;
                case 2:
                updateBookStatus();
                break;
                case 3:
                showBooks();
                break;
                case 4:
                generateReport();
                break;
                case 5:
                System.out.print("\n------------------------------\n");
                System.out.print("Thanks! Exiting the program...");
                System.out.print("\n------------------------------\n");
                return;
                default:
                System.out.println("\nInvalid! Please input a valid one.");
            }
        }
    }
    public static void addBooks() {
        Scanner scanner = new Scanner(System.in);

        if (books >= MAX_BOOKS) {
            System.out.println("\nMaximum books limit reached.");
            return;
        }

        System.out.print("\nEnter book name: ");
        bookName[books] = scanner.nextLine();

        if (bookName[books].equals("")) {
            System.out.print("\nPlease input a valid name!\n");
        } else {
            bookStatus[books] = "Available";
            books++;

            System.out.print("\n------------------------\n");
            System.out.print("Added Book Successfully!");
            System.out.print("\n------------------------\n");
        }
    }
    public static void updateBookStatus() {
        Scanner scanner = new Scanner(System.in);

        showBooks();
        System.out.print("What book # you want to update?: ");
        int bookChoice = scanner.nextInt();

        if (bookChoice > books) {
            System.out.print("\nInvalid Book Number!\n");
        } else {
            System.out.print("\n----------------------------------------------\n");
            System.out.print("You have successfully updated the book status!");
            System.out.print("\n----------------------------------------------\n");
        }

        for (int i = 0; i < books; i++) {
            if(bookChoice == (i + 1)) {
                if(bookStatus[i].equals("Available")) {
                    bookStatus[i] = "Borrowed";
                } else {
                    bookStatus[i] = "Available";
                }
            }
        }
    }
    public static void showBooks() {
        System.out.print("\n-----[ List of Books ]-----\n");
        if(books == 0) {
            System.out.print("There is no book added right now.\n");
        }
        
        for (int i = 0; i < books; i++) {
            System.out.println("Book #" + (i + 1) + " - " + bookName[i] + " - " + bookStatus[i]);
        }
        System.out.print("---------------------------\n");
    }
    public static void generateReport() {
        int available = 0, borrowed = 0;

        for (int i = 0; i < books; i++) {
            if (bookStatus[i].equals("Available")) {
                available++;
            } else {
                borrowed++;
            }
        }

        System.out.print("\n--------[ Book Report ]---------\n");
        System.out.print("Total number of books: " + books);
        System.out.print("\nTotal number of available books: " + available);
        System.out.print("\nTotal number of borrowed books: " + borrowed + "\n");
        System.out.print("----------------------------------\n");
    }
}