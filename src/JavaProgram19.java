import java.util.ArrayList;

public class JavaProgram19 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");

        colors.trimToSize();

        System.out.println("ArrayList after trimming: " + colors);
    }
}
