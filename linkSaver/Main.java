package linkSaver;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String spec = "https://rozetka.com.ua/notebooks/c80004/sort=novelty/";

		try {
			String htmlText = NetworkService.getTextFromURL(spec, "UTF-8");
			System.out.println(htmlText);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}