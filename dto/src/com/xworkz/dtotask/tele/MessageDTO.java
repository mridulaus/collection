package com.xworkz.dtotask.tele;

import java.io.Serializable;

public class MessageDTO implements Serializable {
	private String type;
	private boolean videoCall;
	private  boolean received ;
	private String version;
	private boolean emoji ;
	

	
	
	public MessageDTO(String type, boolean videoCall, boolean received, String version, boolean emoji) {
		super();
		this.type = type;
		this.videoCall = videoCall;
		this.received = received;
		this.version = version;
		this.emoji = emoji;
	}
	public MessageDTO() {
		System.out.println("  constructor imvoked" );
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isVideoCall() {
		return videoCall;
	}
	public void setVideoCall(boolean videoCall) {
		this.videoCall = videoCall;
	}
	public boolean isReceived() {
		return received;
	}
	public void setReceived(boolean received) {
		this.received = received;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public boolean isEmoji() {
		return emoji;
	}
	public void setEmoji(boolean emoji) {
		this.emoji = emoji;
	}
	@Override
	public String toString() {
		return "MessageDTO [type=" + type + ", videoCall=" + videoCall + ", received=" + received + ", emoji=" + emoji
				+ "]";
	}
	
	
	

}
