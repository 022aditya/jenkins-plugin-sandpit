package com.pluralsight.sandpit;

import hudson.model.BuildBadgeAction;

public class EkstaziPostbuildAction implements BuildBadgeAction {

	public static String iconPath = "/home/aditya/Downloads/Ekstazi.ico";
	public static String text     = "This is an Ekstazi icon!";
	
	private EkstaziPostbuildAction(String iconPath, String text) {
			this.iconPath = iconPath;
			this.text = text;
	}
	
	public static EkstaziPostbuildAction createBadge(String icon, String text) {
		return new EkstaziPostbuildAction(getIconPath(icon), text);
	}
	
	 public static String getIconPath(String icon) {
		 if(icon == null) return null;
		 
		 return iconPath;
	 }
	
	public String getIconFileName() {
		return null;
	}

	public String getDisplayName() {
		return null;
	}

	public String getUrlName() {
		return null;
	}

}
