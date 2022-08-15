package homework3.service;

import homework3.domain.Book;

import java.util.Comparator;

public enum CompareBooks implements Comparator<Book> {
    AUTHOR_LAST_NAME{
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorLastName().compareTo(o2.getAuthorLastName());
        }
    },
    AUTHOR_FIRST_NAME {
        @Override
        public int compare(Book o1, Book o2){
            return o1.getAuthorFirstName().compareTo(o2.getAuthorFirstName());
        }
    },
    AUTHOR_PATRONYMIC {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorPatronymic().compareTo(o2.getAuthorPatronymic());
        }
    };
}
