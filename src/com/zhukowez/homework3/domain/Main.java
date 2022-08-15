package homework3.domain;

import homework3.service.CompareBooks;
import homework3.util.GeneratorObjectUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static homework3.util.GeneratorObjectUtil.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //The path to the book file
        Path readBookList = Paths.get("src\\homework3\\books.txt");
        //Path to file with student first names
        Path readStudentFirstName = Paths.get("src\\homework3\\firstnamestudents.txt");
        //The path to the file with the lasts names of students
        Path readStudentLastName = Paths.get("src\\homework3\\lastnamestudents.txt");
        /*************************************************************************************************/
        //Creating a list with books from a file
        List<String> linkedListForGenerate = Files.readAllLines(readBookList);
        //Create a list with all book objects
        GeneratorObjectUtil.createBookList(linkedListForGenerate);

        //Number to generate books in LinkedList
        int numberBookGenerateForLinkedList = 20;
        //Book Generation
        GeneratorObjectUtil.generateBookLinkedList(createBookLinkedList, numberBookGenerateForLinkedList);

        Book.printBookList(bookLinkedList);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        bookLinkedList.remove(6);
        Book.printBookList(bookLinkedList);

        //Number to generate books in HashSet
        int numberBookGenerateForHashSet = 25;
        int numberRepeatBooks = 6;
        GeneratorObjectUtil.generateBookHashSet(createBookLinkedList, numberBookGenerateForHashSet, numberRepeatBooks);
        while (!bookLinkedList.isEmpty()) {
            bookLinkedList.remove(0);
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        Book.printBookHashSetVowel(bookHashSet);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        numberBookGenerateForLinkedList = 25;
        GeneratorObjectUtil.generateBookLinkedList(createBookLinkedList, numberBookGenerateForLinkedList);

        Collections.sort(bookLinkedList, CompareBooks.AUTHOR_LAST_NAME);
        Book.printBookList(bookLinkedList);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        Collections.sort(bookLinkedList, CompareBooks.AUTHOR_FIRST_NAME);
        Book.printBookList(bookLinkedList);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        Collections.sort(bookLinkedList, CompareBooks.AUTHOR_PATRONYMIC);
        Book.printBookList(bookLinkedList);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");

        //Create a list of student names from a file
        List<String> studentsFirstNameGenerate = Files.readAllLines(readStudentFirstName);
        List<String> studentsLastNameGenerate = Files.readAllLines(readStudentLastName);

        GeneratorObjectUtil.treeSetStudentsGenerate(studentsFirstNameGenerate, studentsLastNameGenerate);

        GeneratorObjectUtil.showEveryEven(studentTreeSet);
        GeneratorObjectUtil.deleteEveryOdd(studentTreeSet);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        int numberUsersGenerate = 1;
        int numberUserFriendsGenerate = 3;

        List<User> user = GeneratorObjectUtil.generateUsers(studentsFirstNameGenerate, studentsLastNameGenerate, numberUsersGenerate, numberUserFriendsGenerate);

        GeneratorObjectUtil.printUsersAndFriend(user, numberUserFriendsGenerate);

    }
}
