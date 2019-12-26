package com.example.hr.websocket;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.ejb.Singleton;
import javax.enterprise.event.Observes;
import javax.json.bind.JsonbBuilder;
import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.example.hr.entity.Employee;

@Singleton
@ServerEndpoint("/stream")
public class HrWebSocket {
	private Map<String,Session> sessions = new ConcurrentHashMap<>();

	@OnOpen
	public void onOpen(Session session) {
		sessions.put(session.getId(), session);
	}
	
	@OnClose
	public void onClose(Session session) {
		sessions.remove(session.getId());
	}
	
	public void onNewEmployeeEvent(@Observes Employee employee) {
		final String json = JsonbBuilder.newBuilder().build().toJson(employee);
		sessions.forEach( (id,session) -> {
			try {
				session.getBasicRemote().sendText(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
