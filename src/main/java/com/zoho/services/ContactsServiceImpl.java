package com.zoho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Contacts;
import com.zoho.repositories.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {
    
	@Autowired
	private ContactsRepository contactsRepo;
	
	@Override
	public void saveContactsInformation(Contacts contacts) {
		contactsRepo.save(contacts);

	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> contacts = contactsRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts findContactById(long id) {
		Optional<Contacts> findById = contactsRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

}
