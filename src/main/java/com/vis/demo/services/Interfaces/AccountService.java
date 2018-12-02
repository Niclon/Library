package com.vis.demo.services.Interfaces;

import com.vis.demo.dto.LoginDto;
import com.vis.demo.model.Customer;
import com.vis.demo.model.Debt;

import java.util.List;

public interface AccountService {
    boolean checkIfEmailAndPasswordAreSame(LoginDto fromRequest);
    Customer getCustomerByEmail(String email);
}
