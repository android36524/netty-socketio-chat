package com.corundumstudio.socketio.demo;

public class ChatObject {

    private String message; // 信息
    private String targetUser;
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

	public String getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}

}
