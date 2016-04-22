package com.CraigRodewlad.login;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class LibraryLoginApp {
	public static void main(String[] args) {
		
		// Start website
		try {
			Desktop destop = java.awt.Desktop.getDesktop();
			URI url = new URI("http://localhost:8080/BharatiyaCommunityLibraryApp/LandingPage.html");
			destop.browse(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Initialize objects
		Scanner scan = new Scanner(System.in);


		scan.close();
	}

}
