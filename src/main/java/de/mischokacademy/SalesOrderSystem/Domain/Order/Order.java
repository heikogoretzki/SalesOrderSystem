package de.mischokacademy.SalesOrderSystem.Domain.Order;

import de.mischokacademy.SalesOrderSystem.Domain.Payment.Payment;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    private Customer customer;
    private OrderStatus orderStatus;
    private List<OrderDetail> lineItemOrderDetail = new ArrayList<>();
    private List<Payment> paymentList = new ArrayList<>();

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderDetail> getLineItemOrderDetail() {
        return lineItemOrderDetail;
    }

    public void setLineItemOrderDetail(List<OrderDetail> lineItemOrderDetail) {
        this.lineItemOrderDetail = lineItemOrderDetail;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "createDate=" + createDate +
                ", customer=" + customer +
                ", orderStatus=" + orderStatus +
                ", lineItemOrderDetail=" + lineItemOrderDetail +
                ", paymentList=" + paymentList +
                '}';
    }
}
