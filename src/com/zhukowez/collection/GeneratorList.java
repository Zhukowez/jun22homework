package collection;

import java.util.*;

public class GeneratorList {

    static Random random = new Random();
    static Collection<Cat> catArrayList = new ArrayList<>();
    static Collection<Cat> catLinkedList = new LinkedList<>();
    public static Collection<Cat> generateArrayListCat(int count, List<String> catName, List<String> catColor, List<String> catAge){

        for (int i = 0; i < count; i++){
            String name = catName.get(random.nextInt(catName.size()));
            String color = catColor.get(random.nextInt(catColor.size()));
            Integer age = Integer.valueOf(catAge.get(random.nextInt(catAge.size())));

            Cat cat = new Cat(name, color, age);
            catArrayList.add(cat);
        }
        return catArrayList;
    }

    public static Collection<Cat> generateLinkedListCat(int count, List<String> catName, List<String> catColor, List<String> catAge){

        for (int i = 0; i < count; i++){
            String name = catName.get(random.nextInt(catName.size()));
            String color = catColor.get(random.nextInt(catColor.size()));
            Integer age = Integer.valueOf(catAge.get(random.nextInt(catAge.size())));

            Cat cat = new Cat(name, color, age);
            catLinkedList.add(cat);
        }
        return catLinkedList;
    }

}
