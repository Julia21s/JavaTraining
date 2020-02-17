package lesson04.a_inheritance;

public abstract class Vehicle {
    protected String model;
    protected int productionYear;

    public Vehicle(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    public void gas(){
        System.out.println("Started to move " + this.getClass().getSimpleName());
        System.out.println("Driving");
    }
    public void stop(){
        System.out.println(this.getClass().getSimpleName() + " Started to stop");
        System.out.println(this.getClass().getSimpleName() + " Stopped");
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;

        Vehicle vehicle = (Vehicle) o;

        if (getProductionYear() != vehicle.getProductionYear()) return false;
        return getModel().equals(vehicle.getModel());
    }

    @Override
    public int hashCode() {
        int result = getModel().hashCode();
        result = 31 * result + getProductionYear();
        return result;
    }
}
