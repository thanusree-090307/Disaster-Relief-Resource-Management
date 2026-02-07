package DRRM;

class Resource {

    int food;
    int water;
    int medicine;
    int boats;
    int tents;
    int shelters;
    int fireExtinguishers;

    public Resource(int food, int water, int medicine) {
        this.food = food;
        this.water = water;
        this.medicine = medicine;

        boats = 0;
        tents = 0;
        shelters = 0;
        fireExtinguishers = 0;
    }

    void display() {
        System.out.println("Food: " + food);
        System.out.println("Water: " + water);
        System.out.println("Medicine: " + medicine);

        if (boats > 0)
            System.out.println("Boats: " + boats);
        if (tents > 0)
            System.out.println("Tents: " + tents);
        if (shelters > 0)
            System.out.println("Shelters: " + shelters);
        if (fireExtinguishers > 0)
            System.out.println("Fire Extinguishers: " + fireExtinguishers);
    }
}
