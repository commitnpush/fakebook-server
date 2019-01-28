create database fakebook default char set = 'utf8';
use fakebook;
create table recent_search(
		id int primary key auto_increment,
        text varchar(100) not null,
        regdate date not null
) ;
insert into recent_search(text, regdate) values('리엑트', curdate());
delete from recent_search;
commit;
select * from recent_search;
