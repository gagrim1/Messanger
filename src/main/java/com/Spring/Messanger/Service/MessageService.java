package com.Spring.Messanger.Service;

import java.util.List;

import com.Spring.Messanger.Model.Message;

public interface MessageService {
    
	Message saveMessage(Message message);
	List<Message> findByTag(String tag);
	void deleteMessageById(Long id);
	List<Message> findAll();
}