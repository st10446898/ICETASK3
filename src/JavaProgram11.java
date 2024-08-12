import java.util.ArrayList;
import java.util.Collections;

public class JavaProgram11 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");

        Collections.reverse(colors);

        System.out.println("Reversed Colors: " + colors);
    }
}
