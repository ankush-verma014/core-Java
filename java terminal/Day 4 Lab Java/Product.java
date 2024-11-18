class Product {

    public static void calculateDiscount(double price, double discountPercentage) {
        double discountedPrice = price - (price * discountPercentage / 100);
        System.out.println("Original Price: " + price);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discounted Price: " + discountedPrice);
        System.out.println();
    }

    public static void main(String[] args) {

        calculateDiscount(1000, 10); 
        calculateDiscount(500, 20);  
        calculateDiscount(1200, 15); 
    }
}