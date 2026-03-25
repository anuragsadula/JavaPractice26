package interview_questions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Orders{

    public int orderId;

    public String orderName;

    public LocalDate orderDate;

    public int quantity;

    public Orders(int orderId, String orderName, LocalDate orderDate, int quantity){

        this.orderId = orderId;
        this.orderName = orderName;
        this.orderDate = orderDate;
        this.quantity = quantity;
    }


}

public class ConcentrixInterview {

    public static void main(String[] args){

//        Orders order1 = new Orders(1, "Laptop", LocalDate.of(2026, 2, 15), 20);
//        Orders order2 = new Orders(2, "Smartphone", LocalDate.of(2026, 2, 16), 5);
//        Orders order3 = new Orders(3, "Headphones", LocalDate.of(2026, 3, 17), 15);
//        Orders order4 = new Orders(4, "Monitor", LocalDate.of(2026, 3, 18), 3);
//        Orders order5 = new Orders(5, "Keyboard", LocalDate.of(2026, 2, 19), 10);
//        Orders order6 = new Orders(6, "Mouse", LocalDate.of(2026, 3, 20), 4);
//        Orders order7 = new Orders(7, "Printer", LocalDate.of(2026, 2, 21), 11);
//        Orders order8 = new Orders(8, "Tablet", LocalDate.of(2026, 2, 22), 16);

        List<Orders> ordersList = Arrays.asList(
                new Orders(1, "Laptop", LocalDate.of(2026, 2, 15), 20),
                new Orders(2, "Smartphone", LocalDate.of(2026, 2, 16), 5),
                new Orders(3, "Headphones", LocalDate.of(2026, 3, 17), 15),
                new Orders(4, "Monitor", LocalDate.of(2026, 3, 18), 3),
                new Orders(5, "Keyboard", LocalDate.of(2026, 2, 19), 10),
                new Orders(6, "Mouse", LocalDate.of(2026, 3, 20), 4),
                new Orders(7, "Printer", LocalDate.of(2026, 2, 21), 11),
                new Orders(8, "Laptop", LocalDate.of(2026, 2, 22), 16)
        );

        ordersList.stream()
                .forEach(order -> System.out.println("Order ID: " + order.orderId + ", Order Name: " + order.orderName + ", Order Date: " + order.orderDate + ", Quantity: " + order.quantity));


        HashMap<String, Integer> groupOrdersByQuantity = new HashMap<>();

        int quantity = 0;

        for(int i = 0; i < ordersList.size(); i++){

            Orders order = ordersList.get(i);
            quantity = groupOrdersByQuantity.get(order.orderName)+order.quantity;
            groupOrdersByQuantity.put(order.orderName, quantity);
        }

        System.out.println("Grouped Orders by Quantity: " + groupOrdersByQuantity);
    }

}
