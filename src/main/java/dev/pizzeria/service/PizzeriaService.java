package dev.pizzeria.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import dev.pizzeria.domain.Client;
import dev.pizzeria.domain.Pizza;

public class PizzeriaService {

	Map<UUID, Client> clients = new HashMap<>();
	Map<UUID, Pizza> pizzas = new HashMap<>();

	public void sauverClient(String nom, String prenom, String ville, int age) {
		Client client = new Client(UUID.randomUUID(), nom, prenom, ville, age);
		this.clients.put(client.getUuid(), client);
	}
	
	public void sauverPizza(String libelle, String reference, Double prix, String photo) {
		Pizza pizza = new Pizza(UUID.randomUUID(), libelle, reference, prix, photo);
		this.pizzas.put(pizza.getUuid(), pizza);
	}
	
	public List<Client> listeCients() {
		return new ArrayList<Client>(clients.values());
	}

}
