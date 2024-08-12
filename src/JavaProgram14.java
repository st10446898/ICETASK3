import java.util.ArrayList;
import java.util.Collections;

public class JavaProgram14 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");

        Collections.swap(colors, 0, 2);

        System.out.println("Swapped Colors: " + colors);
    }
}
