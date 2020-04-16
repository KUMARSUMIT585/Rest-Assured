package com.example.restservice;

public class Updates {
	private final long id;
	private final String content;
	private final String update;

	public Updates(long id, String content,String update) {
		this.id = id;
		this.content = content;
		this.update=update;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	public String getUpdates()
	{
		return update;
	}

}
