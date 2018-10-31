
class Superclass {
    public void printMethod() {
        System.out.println("BaseClass");
    }

}

class Subclass extends Superclass {
    public void printMethod() {
        super.printMethod();
        System.out.println("Child");

    }


    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }

}
