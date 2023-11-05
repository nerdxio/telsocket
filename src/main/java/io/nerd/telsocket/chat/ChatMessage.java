package io.nerd.telsocket.chat;

public  record ChatMessage(String content, String sender, MessageType type){
}
