package com.designPattern.factory;

public class Shop extends Website {

	@Override
	protected void createWebsite() {
		pages.add(new CartPage());
		pages.add(new SearchPage());
		pages.add(new ItemPage());
	}

}
