import java.util.ArrayList;

public class JavaProgram3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Blue");

        colors.addFirst("Red");

        System.out.println("Colors: " + colors);
    }
}
