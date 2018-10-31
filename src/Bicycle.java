
class Bicycle { // base class
    private int gear; // properties
    private int speed;

    public int getGear() { // getter/ setters
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override // toString Method
    public String toString() {
        return "Bicycle{" +
                "gear = " + gear +
                ", speed = " + speed +
                '}';
    }

    public Bicycle(int gear, int speed) { // Constructor
        this.gear = gear;
        this.speed = speed;
    }

    public static void main(String[] args) {
        HeroHonda my = new HeroHonda(3, 100, 20, 2);
        HeroHonda by = new HeroHonda(4, 120, 25, 1);
        System.out.println(my);
        System.out.println(by);
    }

}

class HeroHonda extends Bicycle {
    private int seatHeight;
    private int handle;

    public HeroHonda(int gear, int speed, int startHeight, int NumberOfHandle) {
        super(gear, speed);
        this.seatHeight = startHeight;
        this.handle = NumberOfHandle;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "HeroHonda{" +
                "seatHeight = " + seatHeight +
                ", handle = " + handle +
                '}';
    }


}

