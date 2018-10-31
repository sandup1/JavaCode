public class CelestialObject {
    private String name;
    private float mass;
    private String NGC;   // New Galactic Catalog number
    private long age;

    // then we add in the getters and setters, the toString and the constructor(s)
    public CelestialObject(String name, float mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "CelestialObject{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", NGC='" + NGC + '\'' +
                ", age=" + age +
                '}';
    }
}