
// Question 1 :
    /*class BaseClass {
        public void show() {
            System.out.println("BaseClass");
        }
    }

    class Derived extends BaseClass {
        public void show() {
            System.out.println("Derived");
        }
    }

    public class ClassInheritance {
        public static void main(String[] args) {
            BaseClass b = new Derived(); // (int b = 0;    String b = "Something new";  String b = new String ("something new");)
            b.show();
        }
    }*/


    //Question 2:
   /* class BaseClass {
        final public void show() {
            System.out.println("BaseClass");
        }
    }

    class Derived extends BaseClass {
        public void show() {
            System.out.println("Derived");
        }
    }
    class ClassInheritance {
        public static void main(String[] args) {
            BaseClass b = new Derived();
            b.show();
        }
    }*/

   //Question 3:
  /* class BaseClass {
       public static void show() {
           System.out.println("BaseClass");
       }
   }

class Derived extends BaseClass {
    public static void show() {
        System.out.println("Derived");
    }
}

class ClassInheritance {
    public static void main(String[] args) {
        BaseClass b = new Derived();
        Derived d = new Derived();
        b.show();
        d.show();
    }
}*/

  //Question 4:
 /* class BaseClass {
      public void show() {
          System.out.println("BaseClass");
      }
  }

class Derived extends BaseClass {
    public void show() {
        System.out.println("Derived");
    }
}

class ClassInheritance{
    public static void doShow( BaseClass o ) {
        o.show();
    }
    public static void main(String[] args) {
        BaseClass    x = new BaseClass();
        BaseClass    y = new Derived();
        Derived z = new Derived();
        doShow(x);
        doShow(y);
        doShow(z);
    }
}*/



