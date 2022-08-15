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

        //Путь на файл с книгами
        Path readBookList = Paths.get("src\\homework3\\books.txt");
        //Путь на файл с именами студентов
        Path readStudentFirstName = Paths.get("src\\homework3\\firstnamestudents.txt");
        //Путь на файл с фамилиями студентов
        Path readStudentLastName = Paths.get("src\\homework3\\lastnamestudents.txt");
        /*************************************************************************************************/
        //Создание списка с книгами из файла
        List<String> linkedListForGenerate = Files.readAllLines(readBookList);
        //Создание листа со всеми объектами книг
        GeneratorObjectUtil.createBookList(linkedListForGenerate);

        //Количество для генерации книг в LinkedList
        int numberBookGenerateForLinkedList = 20;
        //Генерация книг
        GeneratorObjectUtil.generateBookLinkedList(createBookLinkedList, numberBookGenerateForLinkedList);

        Book.printBookList(bookLinkedList);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        bookLinkedList.remove(6);
        Book.printBookList(bookLinkedList);

        //Количество для генерации книг в HashSet
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

        //Создание списка имен студентов из файла
        List<String> studentsFirstNameGenerate = Files.readAllLines(readStudentFirstName);
        List<String> studentsLastNameGenerate = Files.readAllLines(readStudentLastName);

        GeneratorObjectUtil.treeSetStudentsGenerate(studentsFirstNameGenerate, studentsLastNameGenerate);

        GeneratorObjectUtil.showEveryEven(studentTreeSet);
        GeneratorObjectUtil.deleteEveryOdd(studentTreeSet);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
        int numberUsersGenerate = 1;
        int numberUserFriendsGenerate = 3;
       // List<User> users = GeneratorObjectUtil.generateUsers(studentsFirstNameGenerate, studentsLastNameGenerate, numberUsersGenerate, numberUserFriendsGenerate);


        List<User> user = GeneratorObjectUtil.generateUsers(studentsFirstNameGenerate, studentsLastNameGenerate, numberUsersGenerate, numberUserFriendsGenerate);

        GeneratorObjectUtil.printUsersAndFriend(user);


        /*for (String bookGenerate : linkedListForGenerate){
            String[] bookField = bookGenerate.split(";");
            String bookName = bookField[0];
            String authorFirstName = bookField[1];
            String authorLastName = bookField[2];
            String authorPatronymic = bookField[3];
            Book book = new Book(bookName, authorFirstName, authorLastName, authorPatronymic);

            bookLinkedList.add(book);
        }*/

        //System.out.println(linkedListForGenerate);

       // System.out.println(generateBookLinkedList);





       /**/
    }
}
