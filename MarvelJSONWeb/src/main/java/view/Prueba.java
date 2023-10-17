package view;

import handler.WebHandler;
import model.Item;
import model.Result;

public class Prueba {

	public static void main(String[] args) {
		WebHandler webHandler = new WebHandler(
				"https://gateway.marvel.com/v1/public/characters?limit=100&offset=1&apikey=e894ad1f6af082d2b6b7a63ff20f35e0&hash=6faa0674ad5f8d6d7563ae9d0ad65dc9&ts=9");
		Result result = webHandler.getResult();
		for (Item item : result.getData().getResults()) {
			System.out.println(item);
		}

	}

}
