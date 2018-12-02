package com.vis.demo.services.Interfaces;

import com.vis.demo.model.Debt;

import java.util.List;

public interface DebtService {
    List<Debt> getDebtsForGivenUserId(long id);
}
