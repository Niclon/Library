package com.vis.demo.dao.impl;

import com.vis.demo.dao.CustomerDao;
import com.vis.demo.dao.HibernateDao;
import com.vis.demo.dto.LoginDto;
import com.vis.demo.model.Customer;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl extends HibernateDao implements CustomerDao {


    @Override
    public LoginDto getUsersEmailAndPasswordByEmail(String email) {
        Criteria loginCriteria = getSession().createCriteria(Customer.class).add(Restrictions.eq("email", email));
        if (loginCriteria.list().isEmpty()){
            return null;
        }
        Customer customer = (Customer) loginCriteria.list().get(0);

        return new LoginDto(customer.getEmail(),customer.getPassword());
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        Criteria loginCriteria = getSession().createCriteria(Customer.class).add(Restrictions.eq("email", email));
        if (loginCriteria.list().isEmpty()){
            return null;
        }
        return (Customer) loginCriteria.list().get(0);
    }
}
