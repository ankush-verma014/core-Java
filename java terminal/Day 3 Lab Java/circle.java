class circle {

    double radius;
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius = 22;

        double diameter = c1.radius*2; 
        double cir = 2*Math.PI*c1.radius;
        double area = Math.PI*(c1.radius*c1.radius);

        System.out.println("Diameter of the Circle : "+diameter);
        System.out.println("Circumference of the Circle : "+cir);
        System.out.println("Area of the Circle : "+area);
    }

}