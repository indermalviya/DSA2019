package com.designPattern.factory;

public class WebSiteFactory {

	public static Website getWebsite(WebsiteEnum type) {
		switch (type) {
		case BLOG:
			return new Blog();

		case SHOP:
			return new Shop();

		default:
			return null;
		}

	}

}
