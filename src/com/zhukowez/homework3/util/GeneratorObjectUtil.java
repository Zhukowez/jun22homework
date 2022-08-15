package homework3.util;

import homework3.domain.Book;
import homework3.domain.Student;
import homework3.domain.User;

import java.util.*;

public class GeneratorObjectUtil {

    private static final Random random = new Random();
    public static List<Book> createBookLinkedList = new LinkedList<>();
    public static List<Book> bookLinkedList = new LinkedList<>();
    public static List<Book> bookLinkedList2 = new LinkedList<>();
    public static HashSet<Book> bookHashSet = new HashSet<>();

    public static TreeSet<Student> studentTreeSet = new TreeSet();

    public static List<User> generateUsersAndFriends = new LinkedList<>();


    public static void createBookList(List<String> list) {

        for (String bookInfo : list) {
            String[] bookField = bookInfo.split(";");

            String bookName = bookField[0];
            String authorFirstName = bookField[1];
            String authorLastName = bookField[2];
            String authorPatronymic = bookField[3];
            Book book = new Book(bookName, authorFirstName, authorLastName, authorPatronymic);

            createBookLinkedList.add(book);
        }
    }

    public static void generateBookLinkedList(List<Book> list, int numberBookGenerateForLinkedList) {
        for (int i = 0; i < numberBookGenerateForLinkedList; i++) {
            bookLinkedList.add(list.get(random.nextInt(list.size())));
        }
    }

    public static void generateBookHashSet(List<Book> list, int numberBookGenerateForHashSet, int numberRepeatBooks) {

        int count = 0;

        while (count < 1) {

            Map<Book, Integer> counter = new HashMap<>();

            for (int i = 0; i < numberBookGenerateForHashSet; i++) {
                bookLinkedList2.add(list.get(random.nextInt(list.size())));
            }
            for (Book x : bookLinkedList2) {
                int newValue = counter.getOrDefault(x, 0) + 1;
                counter.put(x, newValue);
            }

            for (int value : counter.values()) {
                if (value > numberRepeatBooks) {
                    count++;
                    bookHashSet.addAll(bookLinkedList2);
                }
            }

            while (!bookLinkedList2.isEmpty()) {
                bookLinkedList2.remove(0);
            }

        }

    }


    public static void treeSetStudentsGenerate(List<String> firstNameList, List<String> lastNameList) {

        for (int i = 0; i < 10; i++) {
            String studentFirstName = firstNameList.get(i);
            System.out.println(firstNameList.get(i));
            String studentLastName = lastNameList.get(i);
            System.out.println(lastNameList.get(i));

            Student student = new Student(studentFirstName, studentLastName);
            studentTreeSet.add(student);
        }

    }

    public static void showEveryEven(TreeSet<Student> studentTreeSet) {
        Iterator<Student> iterator = studentTreeSet.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (count % 2 == 0) {
                System.out.println(iterator.next());
            } else iterator.next();
        }
        count++;
    }

    public static void deleteEveryOdd(TreeSet<Student> studentTreeSet) {
        Iterator<Student> iterator = studentTreeSet.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (count % 2 != 0) {
                iterator.remove();
            }
        }
        count++;
    }



    public static List<User> generateUsers(List<String> firstNameList, List<String> lastNameList, int numberUsersGenerate, int numberUserFriendsGenerate){
            long id = random.nextInt(firstNameList.size());
            String userLastName = lastNameList.get(random.nextInt(lastNameList.size()));

            String userFirstName = firstNameList.get(random.nextInt(firstNameList.size()));

            List<User> userFriends = null;
            User user = new User(id, userFirstName, userLastName, userFriends);
            generateUsersAndFriends.add(user);

            for (int i = 0; i < 3; i++){
            user.getFriends(generateFriends(firstNameList));
            }

        //  List<User> userFriends = generateFriends(firstNameList);


        //generateFriends(user);


        return generateUsersAndFriends;
    }
    /*public static List<User> generateUsers(List<String> firstNameList, List<String> lastNameList, int numberUsersGenerate, int numberUserFriendsGenerate){
                int i = 0;
                long id = random.nextInt(firstNameList.size());
                String userLastName = lastNameList.get(random.nextInt(lastNameList.size()));
                while (i < numberUsersGenerate) {
                    i++;
                    String userFirstName = firstNameList.get(random.nextInt(firstNameList.size()));

                    List<User> userFriends = generateUsers(firstNameList, lastNameList, random.nextInt(numberUsersGenerate), random.nextInt(numberUserFriendsGenerate));
                    User user = new User(id, userFirstName, userLastName, userFriends);
                    generateUsersAndFriends.add(user);
                }

              //  List<User> userFriends = generateFriends(firstNameList);


                //generateFriends(user);


        return generateUsersAndFriends;
    }*/

    public static List<User> generateFriends(List<String> firstNameList) {
        List<User> friends = null;
        // random.nextInt(firstNameList.size());
        List<User> userFriends = null;
        for (int i = 0; i < 3; i++) {
            List<User> user = new LinkedList<>();
            String userFirstName = firstNameList.get(random.nextInt(firstNameList.size()));
            userFriends = generateFriends(firstNameList);
        }
        return userFriends;
    }


    public static void printUsersAndFriend(List<User> user){
        int i = 0;
        while (i < 3){
            System.out.println(user.get(i).getName() + "=>");
            //printUsersAndFriend(user.get(i).getFriends(generateFriends(firstNameList.subList(i, i + 1))));
            i++;
        }
    }

/*    public static void printFriends(User user){

    }*/



}
