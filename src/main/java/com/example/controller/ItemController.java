package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ItemForm;

@Controller
@RequestMapping("/item")
public class ItemController {

	@GetMapping("toroku")
	public String index(Model model) {
		return "item/index";
	}

	@GetMapping("toroku")
	public String torokuPage(@ModelAttribute("itemForm") ItemForm itemForm) {
		return "item/torokuPage";
	}

	@PostMapping("toroku")
	public String toroku(ItemForm itemForm) {
		return "redirect:/item";
	}

	@GetMapping("henshu/{id}")
	public String henshuPage(@PathVariable("id") Integer id, Model model, @ModelAttribute("itemForm") ItemForm itemForm) {
		return "item/henshuPage";
	}

	@PostMapping("henshu/{id}")
	public String henshu(@PathVariable("id") Integer id, @ModelAttribute("itemForm") ItemForm itemForm) {
		return "redirect:/item";
	}

	@PostMapping("sakujo/{id}")
	public String sakujo(@PathVariable("id") Integer id) {
		return "redirect:/item";
	}

}
