import java.util.ArrayList;

public class JavaProgram12 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        ArrayList<String> sublist = new ArrayList<>(colors.subList(1, 3));

        System.out.println("Sublist: " + sublist);
    }
}
