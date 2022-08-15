package collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionLesson {
    public static void main(String[] args) throws IOException {

        Path readCatName = Paths.get("src\\collection\\cat-name.txt");
        Path readCatColor = Paths.get("src\\collection\\cat-color.txt");
        Path readCatAge = Paths.get("src\\collection\\cat-age.txt");

        List <String> catName = Files.readAllLines(readCatName);
        List <String> catColor = Files.readAllLines(readCatColor);
        List <String> catAge = Files.readAllLines(readCatAge);

        int countGenerate = 100000;

        long start = System.currentTimeMillis();
        ArrayList<Cat> catArrayList = (ArrayList<Cat>) GeneratorList.generateArrayListCat(countGenerate, catName, catColor, catAge);
        long finish = System. currentTimeMillis();
        long timeDifference = finish - start;
        System.out.println(timeDifference);

        start = System.currentTimeMillis();
        LinkedList <Cat> catLinkedList = (LinkedList<Cat>) GeneratorList.generateLinkedListCat(countGenerate, catName, catColor, catAge );
        finish = System. currentTimeMillis();
        timeDifference = finish - start;
        System.out.println(timeDifference);

        start = System.currentTimeMillis();
        catArrayList.remove(0);
        finish = System. currentTimeMillis();
        timeDifference = finish - start;
        System.out.println(timeDifference);

        start = System.currentTimeMillis();
        catLinkedList.remove(0);
        finish = System. currentTimeMillis();
        timeDifference = finish - start;
        System.out.println(timeDifference);
    }
}
