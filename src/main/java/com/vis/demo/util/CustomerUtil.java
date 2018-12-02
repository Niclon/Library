package com.vis.demo.util;

import com.vis.demo.dto.CustomerDto;
import com.vis.demo.model.Customer;

public class CustomerUtil {
    public static CustomerDto getCustomerDtoFromCustomer(Customer customer){
        if (customer==null){
            return null;
        }

        CustomerDto customerDto = new CustomerDto(
                customer.getCid(),
                customer.getName(),
                customer.getSurname(),
                customer.getEmail(),
                customer.getLogin()
        );
        return customerDto;
    }
}
