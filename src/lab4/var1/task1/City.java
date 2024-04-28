package lab4.var1.task1;

import java.util.List;

public class City {
    private String name;
    private int Population;
    private List<Avenue> avenues;
    private List<Street> streets;
    private List<Square> squares;

    public City(String name, int population) {
        this.name = name;
        Population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public void addStreet(String name){
        streets.add(new Street(name));
    }

    public void addAvenue(String name, double x, double y){
        avenues.add(new Avenue(name, x, y));
    }

    public void addSquare(String name){
        squares.add(new Square(name));
    }

    public List<Avenue> getAvenues() {
        return avenues;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public List<Square> getSquares() {
        return squares;
    }

    public class Avenue{
        private String name;
        private double coordX;
        private double coordY;
        private String[] shops;
        private boolean available;

        public Avenue(String name, double coordX, double coordY) {
            this.name = name;
            this.coordX = coordX;
            this.coordY = coordY;
            this.available = false;
            shops = new String[0];
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCoordX() {
            return coordX;
        }

        public void setCoordX(double coordX) {
            this.coordX = coordX;
        }

        public double getCoordY() {
            return coordY;
        }

        public void setCoordY(double coordY) {
            this.coordY = coordY;
        }

        public String[] getShops() {
            return shops;
        }

        public void setShops(String[] shops) {
            this.shops = shops;
        }

        public void goToShop(String name){
            System.out.println("Вы посетили магазин " + name);
        }

        public void openAvenue(){
            if(available){
                System.out.println("Проспект уже работает");
            }else{
                available = true;
                System.out.println("Проспект стал доступен для посещения");
            }
        }

        public void closeAvenue(){
            if(!available){
                System.out.println("Проспект уже на ремонте");
            }else{
                available = false;
                System.out.println("Проспект стал закрыт для посещения");
            }
        }
    }

    public class Street{
        private String name;
        private String[] houses;

        public Street(String name) {
            this.name = name;
            this.houses = new String[0];
        }

        public void buildNewHouse(String name){
            String[] temp = new String[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                temp[i] = houses[i];
            }
            temp[temp.length - 1] = name;
            houses = temp;
        }
    }

    public class Square{
        private String name;
        private String[] attractions;

        public Square(String name) {
            this.name = name;
            attractions = new String[0];
        }

        public void joinAttraction(int number){
            if(number < attractions.length){
                System.out.println("Вы побывали на аттракционе " + attractions[number]);
            }else{
                System.out.println("Такого аттракциона нет");
            }
        }
    }
}
