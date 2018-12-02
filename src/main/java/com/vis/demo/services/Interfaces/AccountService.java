package com.vis.demo.services.Interfaces;

import com.vis.demo.dto.LoginDto;
import com.vis.demo.model.Customer;

public interface AccountService {
//    todo logic
    boolean checkIfEmailAndPasswordAreSame(LoginDto fromRequest);
    Customer getCustomerByEmail(String email);
}
