package classBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Integer.parseInt(reader.readLine());
        double width = Integer.parseInt(reader.readLine());
        double height = Integer.parseInt(reader.readLine());

        Box box = new Box(length, width, height);


        System.out.println(String.format("Surface area - %.2f", box.getSurfaceArea()));
        System.out.println(String.format("Lateral Surface area - %.2f", box.getLateralSurfaceArea()));
        System.out.println(String.format("Volume - %.2f", box.getVolume()));
    }
}
