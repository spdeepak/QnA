insert into question (question,created_date,version) values ('First ever question','2017-07-17 15:58:00',1);
insert into question (question,created_date,version) values ('Second ever question','2017-07-16 11:58:00',1);
insert into question (question,created_date,version) values ('Third ever question','2017-07-16 12:58:00',1);
insert into question (question,created_date,version) values ('Fourth ever question','2017-07-15 14:58:00',1);
insert into question (question,created_date,version) values ('Fifth ever question','2017-07-14 13:58:00',1);
insert into question (question,created_date,version) values ('Sixth ever question','2017-07-15 17:58:00',1);
insert into question (question,created_date,version) values ('Seventh ever question','2017-07-13 10:58:00',1);

insert into topic (name,version,description) values ('one',1,'Dummy one Description');
insert into topic (name,version,description) values ('two',1,'Dummy two Description');
insert into topic (name,version,description) values ('three',1,'Dummy three Description');

insert into question_topics(question_id,topics_id) values ((select id from question where question = 'First ever question'),(select id from topic where name = 'one'));
insert into question_topics(question_id,topics_id) values ((select id from question where question = 'First ever question'),(select id from topic where name = 'two'));