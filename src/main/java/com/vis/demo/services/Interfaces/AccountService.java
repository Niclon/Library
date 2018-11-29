package com.vis.demo.services.Interfaces;

import com.vis.demo.dto.LoginDto;

public interface AccountService {
//    todo logic
    boolean checkIfEmailAndPasswordAreSame(LoginDto fromRequest);
}
