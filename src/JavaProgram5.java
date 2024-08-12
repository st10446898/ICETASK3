import java.util.ArrayList;

public class JavaProgram5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        colors.set(1, "Pink");

        System.out.println("Updated Colors: " + colors);
    }
}
