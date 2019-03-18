package com.hark.cms.view;

import java.io.PrintWriter;
import java.util.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hark.cms.model.ContentInfo;
import com.hark.cms.model.DataHandler;
import com.hark.cms.model.JDBCBase;


public class ContentListServlet extends HttpServlet  {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		JDBCBase dbhelper = new JDBCBase();
		try {
			List<ContentInfo> contentList = dbhelper.getList();
			String contentListJson = DataHandler.getHarkListJson(contentList);

			response.setHeader("content-type","text/html;charset=UTF-8");
			PrintWriter pw = response.getWriter();
			pw.println(contentListJson);
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
