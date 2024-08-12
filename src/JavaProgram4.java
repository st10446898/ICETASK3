import java.util.ArrayList;

public class JavaProgram4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        String color = colors.get(1);
        System.out.println("Retrieved Color: " + color);
    }
}

