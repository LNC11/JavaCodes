public class MyBookList {
    public static Book[] books = new Book[5];
    public static void main(String[] args) {
        // 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, James Clear, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, 0);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012, 0);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018, 0);
        Book book4 = new Book("Java Programming", "John Doe", 2020, 0);
        Book book5 = new Book("Harry Potter and The Half Blood Prince", "J.K Rowling", 2005, 0);

        // 2.) Display the details of each book using the displayDetails method. Below is the sample output
        //     Title: Rich Dad Poor Dad, Author: Robert Kiyosaki, Year: 1997, Current Page: 0
        //     Title: The Power of Habit, Author: Charles Duhigg, Year: 2012, Current Page: 0
        //     Title: Atomic Habits, Author: James Clear, Year: 2018, Current Page: 0
        //     Title: Java Programming, Author: John Doe, Year: 2020, Current Page: 0
        System.out.println("========================== [ Book List ] =========================");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();
        System.out.println("==================================================================\n");

        // 3.) Change the current page of "Rich Dad Poor Dad" to 50 and "Atomic Habits" to 100 using the changePage method. Display the details again for the two books.
        System.out.println("========================== [ Updated Book Page ] =========================");
        book1.changePage(50);
        book3.changePage(100);
        book1.displayDetails();
        book3.displayDetails();
        System.out.print("\nSuccesfully changed the books page!\n");
        System.out.println("==================================================================\n");

        // 4.) Change the current page of your favorite book to any page number you like. Display the details again for your favorite book.
        System.out.println("========================== [ Updated Book Page ] =========================");
        book5.changePage(20);
        book5.displayDetails();
        System.out.print("\nSuccesfully changed the book page!\n");
        System.out.println("==================================================================\n");

        // 5.) Change the author of "Java Programming" to "Jane Smith". Display the details again for the book.
        System.out.println("========================== [ Updated Book Author ] =========================");
        book4.changeAuthor("Jane Smith");
        book4.displayDetails();
        System.out.print("\nSuccesfully changed the book author!\n");
        System.out.println("====================================================================\n");

        // 6.) Create an array of Book objects to store all the books you created. Loop through the array and display the title of the books published after 2010.
        books[0] = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997, 0);
        books[1] = new Book("The Power of Habit", "Charles Duhigg", 2012, 0);
        books[2] = new Book("Atomic Habits", "James Clear", 2018, 0);
        books[3] = new Book("Java Programming", "John Doe", 2020, 0);
        books[4] = new Book("Harry Potter and The Half Blood Prince", "J.K Rowling", 2005, 0);

        System.out.println("================== [ Book Published After 2010 ] =================");
        for (int i = 0; i < 5; i++){
            if (books[i].yearPublished > 2010) {
                System.out.println(books[i].title);
            }
        }
        System.out.println("==================================================================\n");
    }
}