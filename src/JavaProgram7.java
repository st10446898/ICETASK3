import java.util.ArrayList;

public class JavaProgram7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        boolean exists = colors.contains("Purple");

        if (exists) {
            System.out.println("Purple is in the list.");
        } else {
            System.out.println("Purple is not in the list.");
        }
    }
}

