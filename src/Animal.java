public class Animal {
    private String name;
    private boolean edible;

    public Animal(String name, boolean edible) {
        this.name = name;
        this.edible = edible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }
}
