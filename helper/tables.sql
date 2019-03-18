USE hark_content;
drop table hark_content_info;
CREATE TABLE hark_content_info(
	id int auto_increment primary key,
    title nvarchar(50),
    content text,
    content_type int,
    create_time timestamp,
    edit_time timestamp
);
insert into hark_content_info(title, content, content_type, create_time, edit_time) 
values("测试标题1", "文章内容2", 1, from_unixtime(1552924220), from_unixtime(1552924220));


insert into hark_content_info(title, content, content_type, create_time, edit_time) 
values("测试标题2", "文章内容2", 1, from_unixtime(1552924220), from_unixtime(1552924220));


insert into hark_content_info(title, content, content_type, create_time, edit_time) 
values("测试标题3", "文章内容2", 1, from_unixtime(1552924220), from_unixtime(1552924220));


insert into hark_content_info(title, content, content_type, create_time, edit_time) 
values("测试标题4", "文章内容2", 1, from_unixtime(1552924220), from_unixtime(1552924220));


insert into hark_content_info(title, content, content_type, create_time, edit_time) 
values("测试标题5", "文章内容2", 1, from_unixtime(1552924220), from_unixtime(1552924220));