/*
  Q3. Design a Product class to manage inventory in a store.
The class should include the following:
productId, productName, stockQuantity.
Initialize the product details with or without stock quantity.
Define some operations such as:
addStock(int quantity): Increases the stock by the specified amount.
sellStock(int quantity): Reduces the stock by the specified amount if
    enough stock is available; otherwise, display an appropriate message.
displayProductInfo(): Displays the product ID, name, and available
    stock quantity.
*/

class Product {
    String productId;
    String productName;
    int stockQuantity;

    public void addStock(int quantity) {
        stockQuantity += quantity;
    }

    public void sellStock(int quantity) {
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity;
            System.out.println("Stock sold: " + quantity);
        } else {
            System.out.println("Insufficient stock available");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Stock Quantity: " + stockQuantity);
    }

    public static void main(String[] args) {
     
        Product p1 = new Product();

        p1.productId = "Ty124";
        p1.productName = "Bata";
        p1.stockQuantity = 15;

        p1.displayProductInfo();

        p1.addStock(2); 
        p1.sellStock(20); 

        p1.displayProductInfo();
    }
}
