package com.vis.demo.XmlManager;

import com.vis.demo.model.Debt;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class DebtManager {

    List<Debt> debts = null;

    public DebtManager() {
    }

    public DebtManager(List<Debt> debts) {
        this.debts = debts;
    }
    @XmlElement(name="debt")
    public List<Debt> getDebts() {
        return debts;
    }

    public void setDebts(List<Debt> debts) {
        this.debts = debts;
    }
}
