import java.util.ArrayList;

public class JavaProgram15 {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Purple");

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Blue");
        colors2.add("Orange");

        colors1.addAll(colors2);

        System.out.println("Joined Colors: " + colors1);
    }
}
