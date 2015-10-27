import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Demo {

    public static void runDemo(NoEquals foo, NoEquals bar) {
        Set<NoEquals> demoSet = new HashSet<NoEquals>();
        demoSet.add(foo);
        demoSet.add(bar);
        System.out.println("Set contains " + demoSet.size() + " items.");

        List<NoEquals> demoList = new ArrayList<NoEquals>();
        demoList.add(foo);
        System.out.println("Does demoList contain bar? "
                + demoList.contains(bar));

        demoList.remove(bar);
        System.out.println("List contains " + demoList.size() + " items.");
    }
}
