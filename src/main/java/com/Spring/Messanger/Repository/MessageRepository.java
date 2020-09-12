package com.Spring.Messanger.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Messanger.Model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByTag(String tag);
}