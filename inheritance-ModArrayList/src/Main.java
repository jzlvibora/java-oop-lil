import java.util.ArrayList;
import java.util.List;

public class Main extends ArrayList<String> {
    public static void main(String[] args) {
        ModArrayList names = new ModArrayList();
        names.add("Ana");
        names.add("Carl");
        names.add("Bones");
        System.out.println(names);

        System.out.println(names.getUsingMod(2));
        System.out.println(names.getUsingMod(-1));
        System.out.println(names.getUsingMod(200));

    }
}
