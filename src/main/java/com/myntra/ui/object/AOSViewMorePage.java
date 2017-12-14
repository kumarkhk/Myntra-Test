package com.myntra.ui.object;

import org.openqa.selenium.By;

public interface AOSViewMorePage {
	
	By womenTab=By.xpath("//android.widget.TextView[@text='Women']");
	By menTab=By.xpath("//android.widget.TextView[@text='Men']");
	By kidsTab=By.xpath("//android.widget.TextView[@text='Kids']");
	By homeLivingtab=By.xpath("//android.widget.TextView[@text='Home & Living']");
	By weddingTab=By.xpath("//android.widget.TextView[@text='Wedding']");
	By globalTrendsTab=By.xpath("//android.widget.TextView[@text='Global Trends']");
	By themeStoresTab=By.xpath("//android.widget.TextView[@text='Theme Stores']");
	By giftCardsTab=By.xpath("//android.widget.TextView[@text='Gift Cards']");
	By refereEarnTab=By.xpath("//android.widget.TextView[@text='Refer & Earn']");
	By faqsTab=By.xpath("//android.widget.TextView[@text='FAQs']");
	By contactTab=By.xpath("//android.widget.TextView[@text='CONTACT US']");
	By moreTab=By.xpath("//android.widget.TextView[@text='MORE']");

}
