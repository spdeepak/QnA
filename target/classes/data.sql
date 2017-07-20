insert into user (first_name,middle_name,last_name,email,date_of_birth,version,description) values('Deepak','Sunanda','Prabhakar','speedpak1991@gmail.com','1991-03-17',1,'26 And still stumbling');

insert into question (question,created_date,version,description,creator_id) values ('First ever question where I am just adding some text to just increase the text size of the question','2017-07-17 15:58:00',1,'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.',(select id from user where email = 'speedpak1991@gmail.com'));
insert into question (question,created_date,version) values ('Second ever question','2017-07-16 11:58:00',1);
insert into question (question,created_date,version) values ('Third ever question','2017-07-16 12:58:00',1);
insert into question (question,created_date,version) values ('Fourth ever question','2017-07-15 14:58:00',1);
insert into question (question,created_date,version) values ('Fifth ever question','2017-07-14 13:58:00',1);
insert into question (question,created_date,version) values ('Sixth ever question','2017-07-15 17:58:00',1);
insert into question (question,created_date,version) values ('Seventh ever question','2017-07-13 10:58:00',1);

insert into topic (name,version,description) values ('one',1,'Dummy one Description');
insert into topic (name,version,description) values ('two',1,'Dummy two Description');
insert into topic (name,version,description) values ('three',1,'Dummy three Description');

insert into question_topics(question_id,topics_id) values ((select id from question where question = 'First ever question where I am just adding some text to just increase the text size of the question'),(select id from topic where name = 'one'));
insert into question_topics(question_id,topics_id) values ((select id from question where question = 'First ever question where I am just adding some text to just increase the text size of the question'),(select id from topic where name = 'two'));

insert into answer(answer,created_date,version,question_id,user_id) values('Dummy Answer one','2017-07-17 18:00:00',1, (select id from question where question = 'First ever question where I am just adding some text to just increase the text size of the question'),(select id from user where email = 'speedpak1991@gmail.com'));
insert into question_answers(question_id,answers_id) values ((select id from question where question = 'First ever question where I am just adding some text to just increase the text size of the question'),(select id from answer where answer = 'Dummy Answer one'));