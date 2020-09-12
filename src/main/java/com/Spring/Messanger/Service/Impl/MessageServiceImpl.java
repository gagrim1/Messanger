package com.Spring.Messanger.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Spring.Messanger.Model.Message;
import com.Spring.Messanger.Repository.MessageRepository;
import com.Spring.Messanger.Service.MessageService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {
	
	private final MessageRepository mesDao;

	@Override
	public Message saveMessage(Message message) {
		Message savedMessage = mesDao.save(message);
		return savedMessage;
	}

	@Override
	public List<Message> findByTag(String tag) {
		return mesDao.findByTag(tag);
	}

	@Override
	public void deleteMessageById(Long id) {
		mesDao.deleteById(id);
		
	}

	@Override
	public List<Message> findAll() {
		return mesDao.findAll();
	}

}