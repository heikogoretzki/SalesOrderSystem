package de.mischokacademy.SalesOrderSystem.Domain.Payment;

public class WireTransfer extends Payment {
    private String bankID;
    private String bankName;

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
