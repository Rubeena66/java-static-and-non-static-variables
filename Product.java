public class Product{
    public  static String category="Electronics";
    public String productName;
    public static void main(String[]args){
        Product p1=new Product();
        Product p2=new Product();
        p1.productName="Laptop";
        p2.productName="Smartphone";
        System.out.println("category:"+Product.category);
        System.out.println("Product 1:"+p1.productName);
        System.out.println("Product 2:"+p2.productName);
    }
}