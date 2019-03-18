package com.hark.cms.model;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class DataHandler{
	
	public static String getHarkListJson(List<ContentInfo> contentList) {
		return JSON.toJSONString(contentList);
	}
}