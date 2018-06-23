package org.trahim.jpa;

import org.trahim.jpa.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class MainExample {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaExample");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Book book = new Book();
        book.setAuthor("trahim 2");
        book.setName("face");
        book.setPublihed(new Date());


        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(book);
        transaction.commit();


        entityManager.close();
        entityManagerFactory.close();
    }
}
