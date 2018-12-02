package com.vis.demo.services.Implemetation;

import com.vis.demo.StorageConverters.DebtManagerXmlConverter;
import com.vis.demo.XmlManager.DebtManager;
import com.vis.demo.model.Debt;
import com.vis.demo.services.Interfaces.DebtService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DebtServiceImpl implements DebtService {
    @Override
    public List<Debt> getDebtsForGivenUserId(long id) {
        List<Debt> result = new ArrayList<>();
        DebtManager debtManager = DebtManagerXmlConverter.getDebtManagerFromStorage();
        for (Debt debt : debtManager.getDebts()){
            if (debt.getCid() == id){
                result.add(debt);
            }
        }
        return result;
    }
}
