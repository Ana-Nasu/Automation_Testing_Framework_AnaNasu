package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryItemList extends Page{

    @FindBy(id = "product-list")
    private List<WebElement> items;
    public CategoryItemList(WebDriver driver){
        super(driver);
    }

    public int getProductListSize(){
        return items.size();
    }


}
