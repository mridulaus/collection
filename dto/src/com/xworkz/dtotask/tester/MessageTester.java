package com.xworkz.dtotask.tester;
import com.xworkz.dtotask.tele.*;
public class MessageTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageDTO  msg = new MessageDTO ();
		msg.setEmoji(true);
		msg.setReceived(false); 
		msg.setType("whatsapp messages  ");
		msg.setVersion("wh1256" );
		msg.setVideoCall(true);
		System.out.println(  msg.toString());
			
	}

}
