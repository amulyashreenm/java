package com.amulyashree.project1;

public class Locked {
public static void main(String[] args) {
		
	Filesoperation.createMainFolderIfNotPresent("main");
		
	menu.printWelcomeScreen("Locker", "amulyashree");
		
	Handle.handleWelcomeScreenInput();
	}
}
