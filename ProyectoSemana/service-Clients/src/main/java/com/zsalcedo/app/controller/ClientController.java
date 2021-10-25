package com.zsalcedo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zsalcedo.app.entity.Client;
import com.zsalcedo.app.service.ClientService;

@RestController
@RequestMapping("/apiClients")
public class ClientController {


	@Autowired
	private ClientService clientService;
	
	@GetMapping("/list")
	public List<Client> findAll(){
		return clientService.findAll();
	}
	
	@GetMapping("/list/{id}")
	public Client findById(@PathVariable String id){
		return clientService.findById(id);
	}
	
	@PostMapping("/client")
	public Client create(@RequestBody Client client) {
		return clientService.save(client);
	}
	
	@PutMapping("/client/{id}")
	public Client update(@RequestBody Client client,@PathVariable String id) {
		return clientService.save(client);
	}

	@DeleteMapping("/client/{id}")
	public void delete(@PathVariable String id) {
		clientService.delete(id);
	}
}
