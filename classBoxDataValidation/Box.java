package classBoxDataValidation;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException(String.format("Length cannot be zero or negative"));
        }
        this.length = length;
    }
    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException(String.format("Width cannot be zero or negative"));
        }
        this.width = width;
    }
    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException(String.format("Height cannot be zero or negative"));
        }
        this.height = height;
    }

    public double calculateSurfaceArea(){
        return (2 * this.length * this.width) + this.calculateLateralSurfaceArea();
    }
    public double calculateLateralSurfaceArea(){
        return (2 * this.length * this.height) + (2 * this.width * this.height);
    }
    public double calculateVolume(){
        return this.length * this.width * this.height;
    }
}
