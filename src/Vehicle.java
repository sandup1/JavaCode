/*public class Vehicle {
    private int rpm;
    private int speed;
    private int gears;         // number of gears
    private int currentGear;   // what gear the car is in currently
    private int gear;

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "rpm=" + rpm +
                ", speed=" + speed +
                ", gears=" + gears +
                ", currentGear=" + currentGear +
                '}';
    }

    public Vehicle(int rpm, int speed, int gears, int currentGear) {
        this.rpm = rpm;
        this.speed = speed;
        this.gears = gears;
        this.currentGear = currentGear;
    }

    public void accelerate(int deltaVelocity) {
        deltaVelocity += speed; //Add deltaVelocity to speed
        rpm += (deltaVelocity > 0) ? 350 : -350;
        if (rpm > 2700) {
            if (currentGear < gears) {
                currentGear++;
                rpm = 2600;
            } else if (currentGear == gears && rpm > 2900) {
                System.out.println("Slow Down!");
            }
            if (rpm < 2300) {
                if (currentGear > 1) {
                    currentGear--;
                    rpm = 2600;
                }
            }

        }
        System.out.println("speed : " + getSpeed() + " " + " currentGear :" + getCurrentGear() + " " + " RPM : " + getRpm() + " " + "Gear : " + getGears());
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(2900, 100, 4, 2);
        vehicle.accelerate(20);
        vehicle.accelerate(20);
        vehicle.accelerate(20);

        vehicle.accelerate(-40);
        vehicle.accelerate(-40);
        vehicle.accelerate(-40);
        vehicle.accelerate(-40);
    }
}*/

/*public class Vehicle {

    //  unchangin fields
    private int wheels;
    private int engineSize;     //  in cubic cm
    private int doors;
    private int gearCount;
    private boolean isAutomatic;  //  true if isAutomatic. false if manual
    private int seatingCapacity;
    private String model;
    private String color;
    private String[] accessories;          //TODO add code for accessories

    //  driver changeable fields
    private boolean running;
    private int gear;
    private int speed;

    //  unchanging fields
    public int getWheels() {
        return wheels;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public int getGearCount() {
        return gearCount;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public String getModel() {
        return model;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }


    //  driver changeable fields
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getSpeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public Vehicle(int engineSize, int gearCount, String color, String model) {
        this(4, 4, engineSize, gearCount, true, 5, color, model);
    }

    public Vehicle(int wheels, int doors, int engineSize, int gearCount, boolean automatic, int seatingCapacity, String color, String model) {
        this.wheels = wheels;
        this.doors = doors;
        this.engineSize = engineSize;
        this.gearCount = gearCount;
        this.isAutomatic = automatic;
        this.seatingCapacity = seatingCapacity;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "inheritance.Vehicle { " +
                "wheels=" + wheels +
                ", engineSize=" + engineSize +
                ", doors=" + doors +
                ", gear=" + gear +
                ", gearCount=" + gearCount +
                ", isAutomatic=" + isAutomatic +
                ", seatingCapacity=" + seatingCapacity +
                ", running=" + running +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                "}";
    }

    public static void main(String[] args) {
        Vehicle acuraTLX 	= new Vehicle(4, 4, 300, 8, true, 5, "Black", "Acura TLX");
        Vehicle acuraTSX 	= new Vehicle(300, 8, "Silver", "Acura TSX");
        Vehicle fordF150 	= new Vehicle(4, 2, 450, 3, true, 3, "White", "Ford F150");
        Vehicle miniCooper 	= new Vehicle(4, 2, 200, 3, true, 2, "Green", "Mini Cooper");
        Vehicle spider 		= new Vehicle(3, 0, 300, 4, false, 2, "Black", "Spider");
        Vehicle indian 		= new Vehicle(2, 0, 450, 4, false, 2, "Yellow", "Indian!");

        Vehicle[] veh2 = {acuraTLX, acuraTSX, fordF150, miniCooper, spider, indian};
        for (int i = 0; i < veh2.length; i++) {
            System.out.println(veh2[i]);
        }
        System.out.println(spider);
        System.out.println(fordF150);
        spider.setGear(3);
        System.out.println(spider);
    }
}*/


