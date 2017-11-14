package com.epam.lab.payments.web.html;

import com.epam.lab.payments.web.html.cosmetic.CardNumberAdjuster;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {

    @RequestMapping("/orders/{id}")
    public String orders(@PathVariable("id") String id, Model model) {

        model.addAttribute("accountId", id);
        model.addAttribute("accountNumber", CardNumberAdjuster.valueOf16Digits(id));

        return "reports/madeOrders";
    }
}
