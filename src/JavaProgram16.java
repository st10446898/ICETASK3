import java.util.ArrayList;

public class JavaProgram16 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");

        ArrayList<String> clonedColors = (ArrayList<String>) colors.clone();

        System.out.println("Cloned Colors: " + clonedColors);
    }
}

