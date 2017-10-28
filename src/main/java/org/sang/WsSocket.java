package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

@Service  
public class WsSocket {  
private SimpMessageSendingOperations messaging;  
@Autowired  
public WsSocket(  
SimpMessageSendingOperations messaging) { // 注入消息模板.  
this.messaging = messaging;  
}  
public void broadcastSpittle(String message) {  
messaging.convertAndSend("/topic/getResponse", message); // 发送消息.  
}  
}  