package de.mischokacademy.SalesOrderSystem.Controller;

import de.mischokacademy.SalesOrderSystem.Domain.Form.OrderForm;
import de.mischokacademy.SalesOrderSystem.Domain.Order.Customer;
import de.mischokacademy.SalesOrderSystem.Domain.Order.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class OrderController {
    public static List<Order> orderList = new ArrayList<>();

    @GetMapping("orderInput")
    public String getOrderInputForm(Model model) {
        Objects.requireNonNull(model);

        model.addAttribute("orderInputForm", new OrderForm());
        model.addAttribute("orderList", orderList);
        model.addAttribute("customerList", CustomerController.customerList);
        model.addAttribute("orderList", OrderController.orderList);

        return "orderInputForm";
    }

    @PostMapping("orderInput")
    public String saveNewOrder(Model model, OrderForm orderForm) {
        Objects.requireNonNull(model);
        Objects.requireNonNull(orderForm);

        orderList.add(convertOrderFormToOrder(orderForm));

        model.addAttribute("orderInputForm", new OrderForm());
        model.addAttribute("orderList", orderList);
        model.addAttribute("customerList", CustomerController.customerList);
        model.addAttribute("orderList", OrderController.orderList);

        System.out.println(orderList);

        return "orderInputForm";
    }

    @GetMapping("allOrders")
    public String getAllOrders(Model model) {
        Objects.requireNonNull(model);

        model.addAttribute("customerInputForm", orderList);

        return "allOrders";
    }

    private Order convertOrderFormToOrder(OrderForm orderForm) {
        Objects.requireNonNull(orderForm);
        Customer customer = CustomerController.customerList.get(orderForm.getListIndexCustomer());

        Order newOrder = new Order();
        newOrder.setCustomer(customer);

        return newOrder;
    }
}
