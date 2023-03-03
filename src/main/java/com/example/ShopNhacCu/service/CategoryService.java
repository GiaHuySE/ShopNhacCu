package com.example.ShopNhacCu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShopNhacCu.model.Category;
import com.example.ShopNhacCu.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}
	
	public void addCategory(Category category) {
		 categoryRepository.save(category);
	}
	
	public void deleteCategory(int id) {
		categoryRepository.deleteById(id);
	}
	
	public Optional<Category> getCategoryByID(int id){
		return categoryRepository.findById(id);
	}
}
