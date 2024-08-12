import java.util.ArrayList;

public class JavaProgram21 {
    public static void main(String[] args) {
        // Create an ArrayList with initial colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Replace the second element (index 1) with a specified element "Orange"
        colors.set(1, "Orange");

        // Print the modified ArrayList
        System.out.println("Modified ArrayList: " + colors);
    }
}
