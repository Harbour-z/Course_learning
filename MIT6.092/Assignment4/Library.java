import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class
    String LibNum;
    ArrayList<Book> books;
    int booknums; 
    public Library(String LibNum){
        this.LibNum = LibNum;
        this.books = new ArrayList<>();
        this.booknums = 0;
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void addBook(Book book){
        this.books.add(book);
        this.booknums += 1;
    }

    public void printAddress(){
        System.out.println(this.LibNum);
    }

    public void borrowBook(String bookname){
        int flag = 0;
        for(int i = 0;i <=this.booknums-1;i++){
            Book crbook = this.books.get(i);
            if(crbook.getTitle().equals(bookname) && crbook.isBorrowed() == false){
                crbook.borrowed();
                System.out.println("You successfully borrowed" + bookname);
                flag  = 1;
                break;
            }
            else if(crbook.getTitle().equals(bookname) && crbook.isBorrowed() == true){
                System.out.println("Sorry, this book is already borrowed.");
                flag = 1;
                break;
            }

        }
        if(flag == 0){
            System.out.println("Sorry, this book is not in our catalog.");
        }

    }
    public void returnBook(String name){
        for(int i=0;i<=this.booknums-1;i++){
            Book crbook = this.books.get(i);
            if(crbook.getTitle().equals(name) && crbook.isBorrowed()==true){
                System.out.println("You successfully returned "+ name);
                crbook.returned();
            }
        }

    }
    public void printAvailableBooks(){
        int flag = 0;
        for(int i = 0; i<= this.booknums-1;i++){
            Book crbook = this.books.get(i);
            if(crbook.isBorrowed() == false){
                System.out.println(crbook.getTitle());
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("No book in catalog.");
        }
    }
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }



} 