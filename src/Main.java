
    class Grandparent {
        public void printMe() {
            System.out.println("Grandparent");
        }
    }

    class Parent extends Grandparent {
        public void printMe() {
            System.out.println("parent");
        }
    }

    class Child extends Parent {
        public void printMe() {
            super.printMe();
            System.out.println("Child");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Grandparent a = new Grandparent();
            a.printMe();
            Child c = new Child();
            c.printMe();
        }
    }

