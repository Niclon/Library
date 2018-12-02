package com.vis.demo.dao;

import com.vis.demo.dto.LoginDto;
import com.vis.demo.model.Customer;

public interface CustomerDao {
    LoginDto getUsersEmailAndPasswordByEmail(String email);
    Customer getCustomerByEmail(String email);
}
