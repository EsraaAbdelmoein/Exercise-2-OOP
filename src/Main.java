public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Nadia", 29.99);
        Book book2 = new Book("Learn Encapsulation", "Esraa", 19.99);

        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();

        book2.setPrice(15.99);
        System.out.println("\nUpdated Book 2 Price: $" + book2.getPrice());
    }
}

