public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Book 1 Details (Default):");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Pages: " + book1.getPages());

        Book book2 = new Book("Java Programming", "Esraa", 350);
        System.out.println("\nBook 2 Details (Custom):");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Pages: " + book2.getPages());

        book1.setTitle("Learning Java with Nadia");
        book1.setAuthor("Nadia");
        book1.setPages(200);

        System.out.println("\nBook 1 Details (Updated):");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Pages: " + book1.getPages());
    }
}
