package interview_questions;

import java.util.Arrays;
import java.util.List;

class Products{

    String productName;

    String productType;

    double cost;

    double quantity;

    public Products(String productName, String productType, double cost, double quantity) {
        this.productName = productName;
        this.productType = productType;
        this.cost = cost;
        this.quantity = quantity;
    }

    public  String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products [productName=" + productName + ", productType=" + productType + ", cost=" + cost
                + ", quantity=" + quantity + "]";
    }
}

public class WiproInterview {

    public static double findTotalCostOfProducts(List<Products> products) {

        if (products.isEmpty())
            return 0.0;

        double totalCost = products.stream()
                .mapToDouble(p -> p.getCost() * p.getQuantity())
                .sum();

        return totalCost;
    }

    public static Products findHighestCostProduct(List<Products> products) {

        if (products.isEmpty())
            return null;

        Products highestCostProduct = products.stream()
                .max((p1, p2) -> Double.compare(p1.getCost() * p1.getQuantity(), p2.getCost() * p2.getQuantity()))
                .orElse(null);

        return highestCostProduct;
    }

    public static void main(String[] args) {

        List<Products> products = Arrays.asList(
                new Products("Laptop","Electronics",1000,50),
                new Products("Phone","Electronics",500,100),
                new Products("Table","Furniture",200,20),
                new Products("Chair","Furniture",100,30),
                new Products("Headphones","Electronics",150,80),
                new Products("Bookshelf","Furniture",300,10),
                new Products("Monitor","Electronics",250,40),
                new Products("Sofa","Furniture",800,5),
                new Products("Keyboard","Electronics",80,60),
                new Products("Bed","Furniture",600,15)
        );

        WiproInterview wipro = new WiproInterview();

        System.out.println("findTotalCostOfProducts(): " + wipro.findTotalCostOfProducts(products));

        System.out.println("findHighestCostProduct(): " + wipro.findHighestCostProduct(products));
    }
}
