package com.vis.demo.dao;

import com.vis.demo.dto.LoginDto;

public interface CustomerDao {
    LoginDto getUsersEmailAndPasswordByEmail(String email);
}
