package com.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TestBaseDAO
{

    @PersistenceContext(unitName = "TestJPA")
    protected EntityManager entityManager;

    /**
     * @return the entityManager
     */
    public EntityManager getEntityManager()
    {
        return entityManager;
    }

    /**
     * @param entityManager
     *            the entityManager to set
     */
    public void setEntityManager(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    protected TestBaseDAO()
    {
        super();
    }
    
}
