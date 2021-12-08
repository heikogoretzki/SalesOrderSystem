package de.mischokacademy.SalesOrderSystem.Controller;

import de.mischokacademy.SalesOrderSystem.Domain.Order.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    public static List<Customer> customerList = new ArrayList<>();

    @GetMapping("input")
    public String getCustomerInputForm(Model model) {

        model.addAttribute("customerInputForm", new Customer());
        model.addAttribute("customerList", customerList);

        return "customerInputForm";
    }

    @PostMapping("input")
    public String saveNewCustomer(Model model, Customer customer) {

        customerList.add(customer);

        model.addAttribute("customerInputForm", new Customer());
        model.addAttribute("customerList", customerList);

        System.out.println(customerList);

        return "customerInputForm";
    }

    @GetMapping("output")
    public String getAllCustomers(Model model) {

        model.addAttribute("customerInputForm", customerList);

        return "allCustomers";
    }
}
