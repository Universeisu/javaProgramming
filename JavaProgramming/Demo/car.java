public class car {
    /* Attributes */
    public int size;
    public String color;
    public String model;

    /* main Methods */
    public static void main(String[] args) {
        // moveForward();
        // moveBackward();
        // stop();
        // trunOnLight();
        // trunOffLight();

        car redCar = new car();
        redCar.color = "red";
        redCar.model = "Benz";
        redCar.size = 4;
        System.out.println("Car color " + redCar.color);
        System.out.println("Car size " + redCar.size);
        System.out.println("Car model " + redCar.model);
        redCar.moveForward();                                

        car blueCar = new car();
        blueCar.color = "blue";
        blueCar.model = "Benz";
        blueCar.size = 4;
        
        System.out.println("Car color " + blueCar.color);
        System.out.println("Car size " + blueCar.size);
        System.out.println("Car model " + blueCar.model);
        blueCar.moveForward();
        
    }
    /* Methods */

    public  void moveForward() {
        System.out.println(this.color +" move forward");
    }
    public  void moveBackward() {
        System.out.println(this.color +" move backward");
    }
    public  void stop() {
        System.out.println(this.color +" stop");
    }
    public  void trunOnLight() {
        System.out.println(this.color + " trun on light");
    }
    public  void trunOffLight() {
        System.out.println(this.color +" trun off light");
    }
}