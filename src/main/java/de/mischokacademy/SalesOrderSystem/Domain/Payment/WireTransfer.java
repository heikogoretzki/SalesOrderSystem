package de.mischokacademy.SalesOrderSystem.Domain.Payment;

public class WireTransfer extends Payment {
    private String bacnkID;
    private String bankName;

    public String getBacnkID() {
        return bacnkID;
    }

    public void setBacnkID(String bacnkID) {
        this.bacnkID = bacnkID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
