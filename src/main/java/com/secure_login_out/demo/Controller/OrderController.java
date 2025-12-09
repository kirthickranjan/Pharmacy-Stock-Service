package com.secure_login_out.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.secure_login_out.demo.Model.p_order;
import com.secure_login_out.demo.Repository.p_orderRepository;



@Controller
@RequestMapping(value="/user")
public class OrderController {
	@Autowired
	private p_orderRepository OrderRepo;
	@GetMapping("/order")
	public String orderForm(Model model)
	{
	model.addAttribute("order",new p_order());
	model.addAttribute("pageTitle", "New Order");
	return "user/order_form";
	}
	@PostMapping("/save")
	public String order(p_order order)
	{
		OrderRepo.save(order);
		return "user/product";
	}
	@GetMapping("/view_order")
	public String vieworder(Model model)
	{
		List<p_order> listprod=(List<p_order>) OrderRepo.findAll();
		model.addAttribute("listprod",listprod);
		return "product";
	}
}
