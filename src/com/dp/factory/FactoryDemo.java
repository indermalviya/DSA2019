package com.dp.factory;

public class FactoryDemo {
	public static void main(String[] args) {

		Website site = WebSiteFactory.getWebsite(WebsiteEnum.BLOG);
		System.out.println(site.getPages());
		site = WebSiteFactory.getWebsite(WebsiteEnum.SHOP);
		System.out.println(site.getPages());
	}

}
