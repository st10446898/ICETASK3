import java.util.ArrayList;

public class JavaProgram18 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");

        boolean isEmpty = colors.isEmpty();

        System.out.println("Is the ArrayList empty? " + isEmpty);
    }
}
