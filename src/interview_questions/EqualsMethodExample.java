package interview_questions;

class Product{

    String id;

    Product(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return id == other.id;
    }
}

public class EqualsMethodExample {

    public static void main(String[] args) {

        Product p1 = new Product("Java");
        Product p2 = new Product("Java");

        System.out.println(p1.equals(p2));
    }
}
