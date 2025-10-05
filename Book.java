public class Book extends MyBookList {
    public String title;
    public String author;
    public int yearPublished;
    public int currentPage;

    public Book(String title, String author, int yearPublished, int currentPage) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = currentPage;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", Current Page: " + currentPage);
    }

    public void changePage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

}


