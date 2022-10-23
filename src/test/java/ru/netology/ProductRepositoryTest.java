package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    @Test
    public void RemoveByIdOne() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Game of Thrones", 480, "George Martin");
        Book book2 = new Book(28, "The Hobbit", 500, "Tolkien");
        Book book3 = new Book(15, "Game", 658, "Tom Habbot");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product[] actual = repo.removeById(1);
        Product[] expected = {book2, book3};


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShowAllNamesOfBooks() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Game of Thrones", 480, "George Martin");
        Book book2 = new Book(28, "The Hobbit", 500, "Tolkien");
        Book book3 = new Book(15, "Game", 658, "Tom Habbot");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product[] actual = repo.getItems();
        Product[] expected = {book1, book2, book3};


        Assertions.assertArrayEquals(expected, actual);


    }
}
