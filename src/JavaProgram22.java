import java.util.ArrayList;

public class JavaProgram22 {
    public static void main(String[] args) {
        // Create an ArrayList with initial colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        // Print each element in the ArrayList using their position (index)
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at index " + i + ": " + colors.get(i));
        }
    }
}
