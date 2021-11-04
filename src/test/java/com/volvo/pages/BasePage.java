package com.volvo.pages;

import com.volvo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){ PageFactory.initElements(Driver.get(), this);
    }

}
