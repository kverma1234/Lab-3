
//Harsh changes made to the code
package restaurant;

// Customer class
public class Customer {
    private String name;
    private Order order;

    public Customer(String name) {
        this.name = name;
        this.order = new Order();  // Collaborating with Order class
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }

    public void addMenuItemToOrder(MenuItem item) {
        order.addItem(item);  // Collaborating with Order to add items
    }

    public void removeMenuItemFromOrder(MenuItem item) {
        order.removeItem(item);  // Collaborating with Order to remove items
    }

    public void clearOrder() {
        order.clear();  // Collaborating with Order to clear all items
    }

    public void placeOrder() {
        System.out.println("Customer: " + name);
        order.printOrderDetails();  // Collaborating with Order to display order details
    }
}