package de.mischokacademy.SalesOrderSystem.Controller;

import de.mischokacademy.SalesOrderSystem.Domain.Order.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {
    public List<Item> itemList = new ArrayList<>();

    @GetMapping("itemInput")
    public String getItemInputForm(Model model) {

        model.addAttribute("itemInputForm", new Item());
        model.addAttribute("itemList", itemList);

        return "itemInputForm";
    }

    @PostMapping("itemInput")
    public String saveNewItem(Model model, Item item) {

        itemList.add(item);

        model.addAttribute("itemInputForm", new Item());
        model.addAttribute("itemList", itemList);

        System.out.println(itemList);

        return "itemInputForm";
    }

    @GetMapping("itemOutput")
    public String getAllItems(Model model) {

        model.addAttribute("itemList", itemList);

        return "allItems";
    }
}
