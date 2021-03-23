package classBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSurfaceArea(){
        return (2 * length * width) + getLateralSurfaceArea();
    }
    public double getLateralSurfaceArea(){
        return (2 * this.length * this.height) + (2 * this.width * this.height);
    }
    public double getVolume() {
        return height * width * length;
    }
}
