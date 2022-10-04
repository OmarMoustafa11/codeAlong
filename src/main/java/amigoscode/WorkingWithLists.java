package amigoscode;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List <String> color = new ArrayList<>();
        color.add("blue");
        color.add("purple");
        color.add("Yellow");
//        color.add(1);
//        color.add(1);
//        color.add(new Object());
        System.out.println(color);
        System.out.println(color.size());
        System.out.println(color.contains("pink"));
        for(String colors : color){
            System.out.println(colors);
        }

    }
}
