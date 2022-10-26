package Exercise3;

public class PotentialEnergy {

    private final static double gravity = 9.80665;
    private double high;
    private double mass;

    public PotentialEnergy() {
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void calculateEnergy(){
        if (high < 0 || mass < 0 ){
            System.out.println("Ошибка при вводе данных. Высота и масса не могут быть отрицательными.");
        } else {
            System.out.println("Потенциальная энергия равна " + mass*gravity*high + " Дж");
        }
    }
}
