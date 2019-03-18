package com.hark.test;

import java.util.List;

import com.hark.cms.model.ContentInfo;
import com.hark.cms.model.DataHandler;
import com.hark.cms.model.JDBCBase;

public class JDBCTest {
	
	public static void main(String[] args) {
		try {
			JDBCBase dbhelper = new JDBCBase();
			List<ContentInfo> contentList = dbhelper.getList();
			String contentListJson = DataHandler.getHarkListJson(contentList);
			System.out.print(contentListJson);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
