package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ProductManagerTest {

    @Test
    public void SearchByGameInBooksName() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1,"Game of Thrones",480, "George Martin");
        Book book2 = new Book(28,"The Hobbit",500, "Tolkien");
        Book book3 = new Book(15,"Game",658, "Tom Habbot");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Game");
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SearchByHobbitInBookNames() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1,"Game of Thrones",480, "George Martin");
        Book book2 = new Book(28,"The Hobbit",500, "Tolkien");
        Book book3 = new Book(15,"Game",658, "Tom Habbot");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Hobbit");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void SearchByRingsInBookNames() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1,"Game of Thrones",480, "George Martin");
        Book book2 = new Book(28,"The Hobbit",500, "Tolkien");
        Book book3 = new Book(15,"Game",658, "Tom Habbot");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Rings");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void RemoveByIdTwentyEight() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1,"Game of Thrones",480, "George Martin");
        Book book2 = new Book(28,"The Hobbit",500, "Tolkien");
        Book book3 = new Book(15,"Game",658, "Tom Habbot");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.removeById(28);
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void SearchByLabelInSmartphoneProducer() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Smartphone smartphone1 = new Smartphone(11,"Lenovo K30",12000,"Lenovo");
        Smartphone smartphone2 = new Smartphone(456,"Redmi Note 9",18500, "Xiaomi");
        Smartphone smartphone3 = new Smartphone(3478,"Honor 5",23500, "Huawei");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Redmi");
        Product[] expected = {smartphone2};

        Assertions.assertArrayEquals(expected, actual);

    }

}