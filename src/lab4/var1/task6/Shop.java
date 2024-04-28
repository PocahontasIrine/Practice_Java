package lab4.var1.task6;

import java.util.Date;
import java.util.List;

public class Shop {
    private String name;
    private String location;
    private int countOfEmployees;

    public class Department{
        private String name;
        private double square;
        private List<Product> products;
        private List<Service> services;

        public Department(String name, double square) {
            this.name = name;
            this.square = square;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSquare() {
            return square;
        }

        public void setSquare(double square) {
            this.square = square;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }

        public List<Service> getServices() {
            return services;
        }

        public void setServices(List<Service> services) {
            this.services = services;
        }

        public void addProduct(Product p){
            products.add(p);
        }

        public void addService(Service s){
            services.add(s);
        }

        public void inventory(){
            System.out.println("В отделе доступны " + products.size() + " продукта, " + services.size() + " услуги");
        }

        public void printProducts(){
            for (int i = 0; i < products.size(); i++) {
                System.out.println("Продукт №" + (i+1) + " " + products.get(i).name);
            }
        }

        public void printServices(){
            for (int i = 0; i < services.size(); i++) {
                System.out.println("Услуга №" + (i+1) + " " + services.get(i).name);
            }
        }
    }

    public class Product{
        private String name;
        private Date dateOfManufacture;
        private Date dateOfExperation;
        private double weight;
        private boolean available;
        private double price;

        public Product(String name, Date dateOfManufacture, Date dateOfExperation, double weight, double price) {
            this.name = name;
            this.dateOfManufacture = dateOfManufacture;
            this.dateOfExperation = dateOfExperation;
            this.weight = weight;
            this.available = true;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getDateOfManufacture() {
            return dateOfManufacture;
        }

        public void setDateOfManufacture(Date dateOfManufacture) {
            this.dateOfManufacture = dateOfManufacture;
        }

        public Date getDateOfExperation() {
            return dateOfExperation;
        }

        public void setDateOfExperation(Date dateOfExperation) {
            this.dateOfExperation = dateOfExperation;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double totalPrice(){
            return price*weight;
        }

        public void buyProduct(){
            if(available){
                System.out.println("Вы купили товар " + name);
                available = false;
            }else{
                System.out.println("Товар закончился");
            }
        }

        public void bringProduct(){
            available = true;
        }
    }

    public class Service{
        private String name;
        private String type;
        private double price;
        private boolean available;

        public Service(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
            this.available = true;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public void buyService(){
            if(available){
                System.out.println("Вы купили услугу " + name);
            }
        }

        public void changeAvailable(){
            if(available){
                available = false;
            }else{
                available = true;
            }
        }
    }
}
