import java.util.ArrayList;

public class JavaProgram6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        colors.remove(2);

        System.out.println("Colors after removal: " + colors);
    }
}
