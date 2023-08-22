package ru.netology.hwhibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import ru.netology.hwhibernate.enity.Persons;

import java.util.List;

@org.springframework.stereotype.Repository
@Transactional
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List getPersonsByCity(String city){
        Query query = entityManager.createQuery("select p from Persons p where p.cityOfLiving = :city", Persons.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}