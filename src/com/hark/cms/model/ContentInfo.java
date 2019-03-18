package com.hark.cms.model;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

public class ContentInfo {
	
	private int id;
	private String title;
	private String content;
	private String content_type;
	private Time create_time;
	private Time edit_time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getcontent_type() {
		return content_type;
	}
	public int getcontent_typeid() {
		return ContentTypeEnum.getContentTypeId(content_type);
	}
	public void setcontent_type(String content_type) {
		this.content_type = content_type;
	}
	public void setcontent_typeid(int content_typeid) {
		this.content_type = ContentTypeEnum.getContentType(content_typeid);
	}
	public Time getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Time create_time) {
		this.create_time = create_time;
	}
	public Time getEdit_time() {
		return edit_time;
	}
	public void setEdit_time(Time edit_time) {
		this.edit_time = edit_time;
	}
}

class ContentTypeEnum {
	public static final Map<String, Integer> contentTypeMap = new HashMap<String, Integer>(){
		{
			put("学习笔记", 1);
			put("项目介绍", 2);
		}
	};

    public static int getContentTypeId(String contentType) {
    	return contentTypeMap.get(contentType);
    }
    public static String getContentType(int contentTypeId) {	
    	for(Map.Entry<String, Integer> item : contentTypeMap.entrySet()) {
    		if(item.getValue() == contentTypeId)
    			return item.getKey();
    	}  
    	throw new RuntimeException();
    }
}
