package Exercise2;

public class RightTriangle {

    private int cathet1;
    private int cathet2;
    private double hypotenuse;

    public RightTriangle() {
    }

    public RightTriangle(int cathet1, int cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    public int getCathet1() {
        return cathet1;
    }

    public void setCathet1(int cathet1) {
        this.cathet1 = cathet1;
    }

    public int getCathet2() {
        return cathet2;
    }

    public void setCathet2(int cathet2) {
        this.cathet2 = cathet2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double calculateHypotenuse(){
        hypotenuse = Math.sqrt(cathet1*cathet1+cathet2*cathet2);
        return hypotenuse;
    }

}
