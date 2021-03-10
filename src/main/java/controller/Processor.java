package controller;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import util.HibernateUtil;
import util.MyException;

import java.util.List;


public abstract class Processor <T> {

    @Getter
    @Setter
    protected T entity;
    protected Session session;

    public abstract List<T> getData();
    protected abstract void controlCreate() throws MyException;
    protected abstract void controlUpdate() throws MyException;
    protected abstract void controlDelete() throws MyException;


    public Processor(){
        this.session= HibernateUtil.getSession();
    }

    public Processor(T entity){
        this();
        this.entity=entity;
    }

    public T create() throws MyException{
        controlCreate();
        save();
        return this.entity;
    }

    public T update() throws MyException{
        controlUpdate();
        save();
        return this.entity;
    }

    public boolean delete() throws MyException{
        controlDelete();
        session.beginTransaction();
        session.delete(this.entity);
        session.getTransaction().commit();
        return true;
    }

    private void save(){
        session.beginTransaction();
        session.save(this.entity);
        session.getTransaction().commit();
    }




}
