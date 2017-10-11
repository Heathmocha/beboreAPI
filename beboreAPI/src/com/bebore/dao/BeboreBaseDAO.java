package com.bebore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BeboreBaseDAO
{

    @PersistenceContext(unitName = "BeboreJPA")
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

    protected BeboreBaseDAO()
    {
        super();
    }

}
