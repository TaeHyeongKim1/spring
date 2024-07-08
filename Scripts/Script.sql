create table calendar(
		id number primary key,
		title varchar2(200),
		writer varchar2(50),
		start1 varchar2(50),
		end1 varchar2(50),
		content varchar2(1000),
		backgroundcolor varchar2(50),
		textColor varchar2(50),
		allDay number(1),
		url varchar2(200)
	);
	
CREATE SEQUENCE cal_seq;
	INSERT INTO calendar values(cal_seq.nextval,'첫일정','홍길동','2024-07-08','2024-07-09',
						'첫일정입니다.','#0099cc','#ccffff',1,'http://www.naver.com');
	
					select id,title,writer,start1 "start", end1 "end", content,backgroundcolor,
					allday,url
					FROM calendar;
/*
				select id,title,writer,start1 "start", end1 "end", content,backgroundcolor,
					allday,url
					FROM calendar;
					INSERT INTO calendar values(cal_seq.nextval,#{title},#{writer},#{start},
					#{end},#{content},#{backgroundColor},#{textColor},#{allDay},#{url})
 
   */				
