package com.teamgames.net.packet.impl;

import com.teamgames.net.packet.Packet;

/**
 * Handles all yells from the ERS console API
 * @author Nelson
 *
 */

public class Yell extends Packet {
	
	private String message;

	@Override
	public void read(String message) {
		setMessage(message);
		addQueue(this);
	}
	
	@Override
	public int getType() {
		return Packet.YELL;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
