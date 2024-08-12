import java.util.ArrayList;
import java.util.Collections;

public class JavaProgram8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Purple");

        Collections.sort(colors);

        System.out.println("Sorted Colors: " + colors);
    }
}
