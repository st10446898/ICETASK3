import java.util.ArrayList;

public class JavaProgram13 {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("purple");
        colors1.add("Blue");

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Purple");
        colors2.add("Orange");

        boolean areEqual = colors1.equals(colors2);

        System.out.println("Are the two ArrayLists equal? " + areEqual);
    }
}
