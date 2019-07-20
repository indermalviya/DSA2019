package com.dp.factory;

public class Blog extends Website {

	@Override
	protected void createWebsite() {
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new PostPage());
	}

}
