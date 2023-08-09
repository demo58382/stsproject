package com.zoho.services;

import java.util.List;

import com.zoho.entities.Contacts;

public interface ContactsService {
   public void saveContactsInformation(Contacts contacts);
   public List<Contacts> getAllContacts();
   public Contacts findContactById(long id);
}
