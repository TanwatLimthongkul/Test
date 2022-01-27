package SF_222.Exercise_2;

public class TestAuthorBook {
    public static void main(String[] args){
        Author a1 = new Author("David", "blane9973@gmail.com", 'm');
        System.out.println(a1.toString());

        Book b1 = new Book("Real or magic", a1, 200.0);
    }
}