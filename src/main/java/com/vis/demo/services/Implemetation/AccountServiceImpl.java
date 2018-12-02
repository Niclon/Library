package com.vis.demo.services.Implemetation;

import com.vis.demo.dao.CustomerDao;
import com.vis.demo.dto.LoginDto;
import com.vis.demo.model.Customer;
import com.vis.demo.services.Interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public boolean checkIfEmailAndPasswordAreSame(LoginDto fromRequest) {
        LoginDto loginFromDb = customerDao.getUsersEmailAndPasswordByEmail(fromRequest.getEmail());
        if (loginFromDb == null){
            return false;
        }
        return checkIfBothLoginDtoAreSame(fromRequest,loginFromDb);
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        return customerDao.getCustomerByEmail(email);
    }

    private boolean checkIfBothLoginDtoAreSame(LoginDto dto1,LoginDto dto2){
        if (dto1.getEmail().equals(dto2.getEmail()) && dto1.getPassword().equals(dto2.getPassword())){
            return true;
        }
        return false;
    }
}
