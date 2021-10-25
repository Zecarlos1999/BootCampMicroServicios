package com.zsalcedo.app.service;

import java.util.List;

import com.zsalcedo.app.entity.Client;

public interface ClientService {

	public List<Client> findAll();

	public Client findById(String id);

	// public void save(Client client);
	public Client save(Client client);

	// public void delete(Client client);
	public void delete(String id);

}
