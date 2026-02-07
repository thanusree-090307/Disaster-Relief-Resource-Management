package DRRM;

abstract class Area {
    protected String name;
    protected String disasterType;

    public Area(String name) {
        this.name = name;
        this.disasterType = "None";
    }

    public String getName() {
        return name;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    abstract void display();
}

class AffectedAreas extends Area {
    Resource resource;

    public AffectedAreas(String name, Resource resource) {
        super(name);
        this.resource = resource;
    }

    void display() {
        System.out.println("Area Name     : " + name);
        System.out.println("Disaster Type : " + disasterType);
        resource.display();
    }
}
