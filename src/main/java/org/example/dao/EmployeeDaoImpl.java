package org.example.dao;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.example.entities.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

   /* @Autowired
    private SessionFactory sessionFactory;*/
    @Inject
    private Session session;

   /* @Autowired
    public EmployeeDaoImpl(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }*/

    @Override
    public void save(Employee e) {
        //Session session = this.sessionFactory.openSession();
        //Transaction tx = session.beginTransaction();
        //session.save(e);
        session.persist(e);
        //tx.commit();
        //session.close();

    }


    @Override
    public List<Employee> getEmployee() {
        //Session session = this.sessionFactory.openSession();

        Criteria cr = session.createCriteria(Employee.class);
        List results = cr.list();


        return results;
    }

}
