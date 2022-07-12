package com.example.aviasales.dao;

import com.example.aviasales.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public abstract class EntityDao<T> {
    private Class<T> entityClass;

    @PersistenceContext
    protected EntityManager em;

    protected final void setEntityClass(Class<T> entityClassToSet) {
        this.entityClass = entityClassToSet;
    }

    public T findById(Long id) {
        return em.find(entityClass, id);
    }

    public T save(T entity) {
        em.persist(entity);
        return entity;
    }
//    public User saveUser(T entity) {
//        em.persist(entity);
//        return null;
//    }

    public void deleteById(Long id) {
        T entity = findById(id);
        em.remove(entity);
    }

    public T update(T entity) {
        return em.merge(entity);
    }

    public List<T> findAll() {
        Query query = em.createQuery("FROM " + entityClass.getName());
        List<T> result = (List<T>) query.getResultList();
        if (result.size() == 0) {
            return null;
        }
        return result;
    }


    public List<T> findAllByUserId(Long idUser) {
        Query query = em.createQuery("FROM " + entityClass.getName() +
                " WHERE ID_USER = :paramUserId");
        query.setParameter("paramUserId", idUser);
        List<T> result = (List<T>) query.getResultList();
        if (result.size() == 0) {
            return null;
        }
        return result;
    }
}
