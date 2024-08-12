import java.util.ArrayList;

public class JavaProgram20 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(3);
        colors.add("Red");
        colors.add("Purple");
        colors.add("Blue");

        colors.ensureCapacity(10);

        System.out.println("Increased size of ArrayList");
    }
}
