package com.peter.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	private List<User> users;

	public void sendMessage(String msg, User user) {
		for (User u : this.users) {
			// message should not be received by the user sending it
			if (u != user) {
				u.receive(msg);
			}
		}
	}

	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
	}

	public void addUser(User user) {
		this.users.add(user);
	}

}
