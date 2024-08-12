import java.util.ArrayList;

public class JavaProgram2 {
    public static void
    main(String[] args)  {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Purple");

        for (String color : colors) {
            System.out.println(color);
       }
    }
}