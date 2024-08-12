import java.util.ArrayList;

public class JavaProgram17 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");

        colors.clear();

        System.out.println("Colors after clearing: " + colors);
    }
}
