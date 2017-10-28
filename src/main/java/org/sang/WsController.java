package org.sang;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * Created by sang on 16-12-22.
 */
@Controller
public class WsController {
//    @MessageMapping("/welcome")
//    @SendTo("/topic/getResponse")
//    public ResponseMessage say(RequestMessage message) {
//        System.out.println(message.getName());
//        return new ResponseMessage("welcome," + message.getName() + " !");
//    }
//    
	
	@Autowired
	private WsSocket ws;
	
	@Resource
    private SimpMessagingTemplate simpMessagingTemplate;
	
    @MessageMapping("/welcome")
    public void cao() {
   //     System.out.println(message.getName());
       for (int i=0;i<10;i++) {
        ws.broadcastSpittle("godloveme"); }
    }
}
