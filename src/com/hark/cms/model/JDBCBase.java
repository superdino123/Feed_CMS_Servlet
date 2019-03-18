package com.hark.cms.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCBase {
	
	private static final String URL = "jdbc:mysql://localhost:3306/hark_content?serverTimezone=GMT%2B8";
	private static final String USER = "root";
	private static final String PWD = "A1zhengweidi94";
	
	class InnerHarkContentInfo {
		public static final String ID = "id";
		public static final String TITLE = "title";
		public static final String CONTENT = "content";
		public static final String CONTENTTYPE = "content_type";
		public static final String CREATETIME = "create_time";
		public static final String EDIT_TIME = "edit_time";
	}

	public List<ContentInfo> getList() throws Exception{
		String sql = "select * from hark_content_info where 1=1";
		
		//1. 加载驱动程序
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2. 获取数据库连接
		Connection conn = DriverManager.getConnection(URL, USER, PWD);
		//3. 操作数据库，实现增删改查
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		//4. 如果有数据，返回
		List<ContentInfo> content_list = new ArrayList<ContentInfo>();
		while(rs.next()) {
			ContentInfo item = new ContentInfo();
			item.setId(rs.getInt(InnerHarkContentInfo.ID));
			item.setTitle(rs.getString(InnerHarkContentInfo.TITLE));
			item.setContent(rs.getString(InnerHarkContentInfo.CONTENT));
			item.setcontent_typeid(rs.getInt(InnerHarkContentInfo.CONTENTTYPE));
			item.setCreate_time(rs.getTime(InnerHarkContentInfo.CREATETIME));
			item.setEdit_time(rs.getTime(InnerHarkContentInfo.EDIT_TIME));
			content_list.add(item);
		}
		return content_list;
	}
}
