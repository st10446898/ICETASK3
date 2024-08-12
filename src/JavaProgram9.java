import java.util.ArrayList;

public class JavaProgram9 {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Purple");
        colors1.add("Blue");

        ArrayList<String> colors2 = new ArrayList<>(colors1);

        System.out.println("Colors1: " + colors1);
        System.out.println("Colors2 (Copy): " + colors2);
    }
}
