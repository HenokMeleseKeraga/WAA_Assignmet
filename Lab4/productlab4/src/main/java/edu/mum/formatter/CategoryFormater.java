package edu.mum.formatter;

import edu.mum.domain.Category;
import edu.mum.domain.Product;
import edu.mum.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
@Component
public class CategoryFormater implements Formatter<Category> {
    @Autowired
    CategoryService categoryService;


    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        return categoryService.getCategory(Integer.parseInt(text));
    }

    @Override
    public String print(Category object, Locale locale) {
        return null;
    }
}
