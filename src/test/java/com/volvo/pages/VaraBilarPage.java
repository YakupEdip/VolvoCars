package com.volvo.pages;

import com.volvo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VaraBilarPage {

    public VaraBilarPage(){ PageFactory.initElements(Driver.get(), this);
    }



    @FindBy(xpath = "//*[@id=\"nav:topNavCarMenu\"]/em")
    public WebElement varaBilar;

    @FindBy(xpath = "//*[@title='Acceptera']")
    public WebElement alertAccep;

    @FindBy(xpath = "//*[@id=\"site-nav-cars-menu-section-tab-0\"]/h2")
    public WebElement elbilar;

    @FindBy(xpath = "//*[@id=\"site-nav-cars-menu-section-tab-1\"]/h2")
    public WebElement hybridbilar;

    @FindBy(xpath = "//*[@id=\"site-nav-cars-menu-section-tab-2\"]/h2")
    public WebElement ovrigaBilar;










}
