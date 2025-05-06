package WIX1002_2019_2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customerName = getStringInput(sc, "Enter customer name: ");
        String customerId = getStringInput(sc, "Enter customer id: ");
        int quantity = getIntInput(sc, "Enter quantity ordered: ");
        double unitPrice = getDoubleInput(sc, "Enter price per unit: ");

        System.out.println(new Order(customerName, customerId, quantity, unitPrice) + "\n");
        System.out.println(new ShippedOrder(customerName, customerId, quantity, unitPrice));

        sc.close();
    }

    public static String getStringInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int getIntInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        int val = sc.nextInt();
        sc.nextLine(); // Consume newline
        return val;
    }

    public static double getDoubleInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        double val = sc.nextDouble();
        sc.nextLine(); // Consume newline
        return val;
    }
}

class Order {
    String customerName;
    String customerId;
    int quantity;
    double unitPrice;

    public Order() {
        this("Unknown", "Unknown", 1, 1);
    }

    public Order(String customerName, String customerId, int quantity, double unitPrice) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double computeTotalPrice() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return String.format(
            "Order record\nCustomer Name : %s\nCustomer Id : %s\nQuantity ordered: %d\nUnit Price : %.1f\nTotal Price : %.1f",
            customerName, customerId, quantity, unitPrice, computeTotalPrice());
    }
}

class ShippedOrder extends Order {
    public ShippedOrder(String customerName, String customerId, int quantity, double unitPrice) {
        super(customerName, customerId, quantity, unitPrice);
    }

    @Override
    public double computeTotalPrice() {
        return super.computeTotalPrice() + 4;
    }

    @Override
    public String toString() {
        return String.format("Shipped\n%s", super.toString());
    }
}
