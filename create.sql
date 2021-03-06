create table answer (id bigint not null auto_increment, answer TEXT, created_date datetime(6), version bigint not null, question_id bigint, user_id bigint, primary key (id)) ENGINE=InnoDB
create table answer_comments (answer_id bigint not null, comments_id bigint not null) ENGINE=InnoDB
create table answer_downvotes (answer_id bigint not null, downvotes_id bigint not null, primary key (answer_id, downvotes_id)) ENGINE=InnoDB
create table answer_upvotes (answer_id bigint not null, upvotes_id bigint not null, primary key (answer_id, upvotes_id)) ENGINE=InnoDB
create table answer_comment (id bigint not null auto_increment, comment TEXT, created_date datetime(6), version bigint not null, answer_id bigint, user_id bigint, primary key (id)) ENGINE=InnoDB
create table answer_comment_downvotes (answer_comment_id bigint not null, downvotes_id bigint not null, primary key (answer_comment_id, downvotes_id)) ENGINE=InnoDB
create table answer_comment_upvotes (answer_comment_id bigint not null, upvotes_id bigint not null, primary key (answer_comment_id, upvotes_id)) ENGINE=InnoDB
create table answer_downvote (id bigint not null auto_increment, user_id bigint, primary key (id)) ENGINE=InnoDB
create table answer_upvote (id bigint not null auto_increment, user_id bigint, primary key (id)) ENGINE=InnoDB
create table comment_downvote (id bigint not null auto_increment, user_id bigint, primary key (id)) ENGINE=InnoDB
create table comment_upvote (id bigint not null auto_increment, user_id bigint, primary key (id)) ENGINE=InnoDB
create table question (id bigint not null auto_increment, created_date datetime(6), description TEXT, question varchar(255), version bigint not null, creator_id bigint, primary key (id)) ENGINE=InnoDB
create table question_answers (question_id bigint not null, answers_id bigint not null) ENGINE=InnoDB
create table question_comments (question_id bigint not null, comments_id bigint not null, primary key (question_id, comments_id)) ENGINE=InnoDB
create table question_downvotes (question_id bigint not null, downvotes_id bigint not null, primary key (question_id, downvotes_id)) ENGINE=InnoDB
create table question_followers (question_id bigint not null, followers_id bigint not null, primary key (question_id, followers_id)) ENGINE=InnoDB
create table question_topics (question_id bigint not null, topics_id bigint not null, primary key (question_id, topics_id)) ENGINE=InnoDB
create table question_upvotes (question_id bigint not null, upvotes_id bigint not null, primary key (question_id, upvotes_id)) ENGINE=InnoDB
create table question_comment (id bigint not null auto_increment, comment TEXT, created_date datetime(6), version bigint not null, question_id bigint, user_id bigint, primary key (id)) ENGINE=InnoDB
create table question_comment_downvotes (question_comment_id bigint not null, downvotes_id bigint not null, primary key (question_comment_id, downvotes_id)) ENGINE=InnoDB
create table question_comment_upvotes (question_comment_id bigint not null, upvotes_id bigint not null, primary key (question_comment_id, upvotes_id)) ENGINE=InnoDB
create table question_downvote (id bigint not null auto_increment, user_id bigint, primary key (id)) ENGINE=InnoDB
create table question_upvote (id bigint not null auto_increment, user_id bigint, primary key (id)) ENGINE=InnoDB
create table topic (id bigint not null auto_increment, description TEXT, name varchar(255), version bigint not null, primary key (id)) ENGINE=InnoDB
create table user (id bigint not null auto_increment, date_of_birth date not null, description varchar(140), email varchar(255) not null, first_name varchar(255) not null, last_name varchar(255) not null, middle_name varchar(255), user_name varchar(255), version bigint not null, primary key (id)) ENGINE=InnoDB
create table user_answer_comments (user_id bigint not null, answer_comments_id bigint not null) ENGINE=InnoDB
create table user_answers (user_id bigint not null, answers_id bigint not null, primary key (user_id, answers_id)) ENGINE=InnoDB
create table user_asked_questions (user_id bigint not null, asked_questions_id bigint not null, primary key (user_id, asked_questions_id)) ENGINE=InnoDB
create table user_following_questions (user_id bigint not null, following_questions_id bigint not null, primary key (user_id, following_questions_id)) ENGINE=InnoDB
create table user_question_comments (user_id bigint not null, question_comments_id bigint not null) ENGINE=InnoDB
alter table answer_comments add constraint UK_jbfl62ab39e1jo0iyhc48fdtd unique (comments_id)
alter table answer_downvotes add constraint UK_oojqgidho1inbe9akcvbqb7oc unique (downvotes_id)
alter table answer_upvotes add constraint UK_3j7us6lywjanrpd6m585plkth unique (upvotes_id)
alter table answer_comment_downvotes add constraint UK_svp4qa1a5bcmsofcjo4wrxy6w unique (downvotes_id)
alter table answer_comment_upvotes add constraint UK_pn6s51y433p056wt0vclse86u unique (upvotes_id)
alter table question_answers add constraint UK_4qtn1pf4ea4ougou3ewipk9qx unique (answers_id)
alter table question_comments add constraint UK_k5ul1a176ahw7033bfkuxc2ta unique (comments_id)
alter table question_downvotes add constraint UK_pg360jb3op5xjtfqeemvq7vla unique (downvotes_id)
alter table question_followers add constraint UK_pt2q87me4dhscxkulp2bv6n1n unique (followers_id)
alter table question_topics add constraint UK_jy5c1h749afqvixgnn2boxp7l unique (topics_id)
alter table question_upvotes add constraint UK_gji5lxeox5c7asbj4e667j4tj unique (upvotes_id)
alter table question_comment_downvotes add constraint UK_3cbmp57t5rhutdwr7ta5y5627 unique (downvotes_id)
alter table question_comment_upvotes add constraint UK_9vlf5bf6ekye5fnr8rck21lss unique (upvotes_id)
alter table user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table user add constraint UK_lqjrcobrh9jc8wpcar64q1bfh unique (user_name)
alter table user_answer_comments add constraint UK_8rqecmqb7ng0bprscjp7y9o01 unique (answer_comments_id)
alter table user_answers add constraint UK_drtyhwp6seekniluv1uo77d78 unique (answers_id)
alter table user_asked_questions add constraint UK_gs5v7wqdb0y4hgy4u3pi1gnfp unique (asked_questions_id)
alter table user_following_questions add constraint UK_jghpocjpd2xyj65c7p60gwu7e unique (following_questions_id)
alter table user_question_comments add constraint UK_24u5evl1lxffd7kbame21le4c unique (question_comments_id)
alter table answer add constraint FK8frr4bcabmmeyyu60qt7iiblo foreign key (question_id) references question (id)
alter table answer add constraint FK68tbcw6bunvfjaoscaj851xpb foreign key (user_id) references user (id)
alter table answer_comments add constraint FK6jhyvhq6mm1kfjjtrqjh0dfpa foreign key (comments_id) references answer_comment (id)
alter table answer_comments add constraint FK29upuh06yt42c2oncpmy6tn1j foreign key (answer_id) references answer (id)
alter table answer_downvotes add constraint FKd4l4umj7itcj282ka47k3n077 foreign key (downvotes_id) references answer_downvote (id)
alter table answer_downvotes add constraint FKa8w1ou0d7a6d7b5lkf0if8tba foreign key (answer_id) references answer (id)
alter table answer_upvotes add constraint FK6s89xawpek02tei30gixx625k foreign key (upvotes_id) references answer_upvote (id)
alter table answer_upvotes add constraint FKhmf4hefb1c3tt23jvtgv5hs0g foreign key (answer_id) references answer (id)
alter table answer_comment add constraint FKbi4ojf23mofyyc9wmmslub4ln foreign key (answer_id) references answer (id)
alter table answer_comment add constraint FK87c9uh8328afrd7v20x4hcfar foreign key (user_id) references user (id)
alter table answer_comment_downvotes add constraint FKfmk0s6e1j4rlsfdnpi9d21xit foreign key (downvotes_id) references comment_downvote (id)
alter table answer_comment_downvotes add constraint FKanegnmu5rjk85v0i4p0qjlbhn foreign key (answer_comment_id) references answer_comment (id)
alter table answer_comment_upvotes add constraint FKb66w350av6sdmvoeofi44wovw foreign key (upvotes_id) references comment_upvote (id)
alter table answer_comment_upvotes add constraint FKeolgu6ghu2luyfb6dpuqlm06 foreign key (answer_comment_id) references answer_comment (id)
alter table answer_downvote add constraint FK4jr37778kj5qo4c0yvwr8dq7o foreign key (user_id) references user (id)
alter table answer_upvote add constraint FK442hcp3l2twi9s7a7mhral7e5 foreign key (user_id) references user (id)
alter table comment_downvote add constraint FKt2j7oytrekc1wvtf9wm009k5r foreign key (user_id) references user (id)
alter table comment_upvote add constraint FKr96847mm8n3rydr9ua59137y0 foreign key (user_id) references user (id)
alter table question add constraint FK5x08j81rbrwxowo5l8c3236nv foreign key (creator_id) references user (id)
alter table question_answers add constraint FKnr1xcvup15w03kboejfervq1y foreign key (answers_id) references answer (id)
alter table question_answers add constraint FKlglw0r110cw97aje0b0pa4q51 foreign key (question_id) references question (id)
alter table question_comments add constraint FK6brxdxc9snn4e27vm4su0qtpy foreign key (comments_id) references question_comment (id)
alter table question_comments add constraint FK9uteqnot54x033kh2soej4jmw foreign key (question_id) references question (id)
alter table question_downvotes add constraint FKam24xjwwwkpl203t3uvo165rx foreign key (downvotes_id) references question_downvote (id)
alter table question_downvotes add constraint FKrb9kmmqfigkjfb9rlwjql9n4d foreign key (question_id) references question (id)
alter table question_followers add constraint FKc5xsfwxo7k99wkgfo9pomo76d foreign key (followers_id) references user (id)
alter table question_followers add constraint FKkx9ml3wqgi5t93fbnswpvga0i foreign key (question_id) references question (id)
alter table question_topics add constraint FKgdktt6q3fgqoyrig9yoyglxfo foreign key (topics_id) references topic (id)
alter table question_topics add constraint FKxfy72xl4cugh2ykr8k18xph9 foreign key (question_id) references question (id)
alter table question_upvotes add constraint FKjs5yxd0fj0d3t77wgk1qmmcoc foreign key (upvotes_id) references question_upvote (id)
alter table question_upvotes add constraint FKermum9o3klcj20fr81r8cdwjt foreign key (question_id) references question (id)
alter table question_comment add constraint FKgatho66t7ix04m6dothg6jaqh foreign key (question_id) references question (id)
alter table question_comment add constraint FK5v1x6rdm2bocicjn0c5ndow8c foreign key (user_id) references user (id)
alter table question_comment_downvotes add constraint FK51y698rsihtfi6b2pschm8hk6 foreign key (downvotes_id) references comment_downvote (id)
alter table question_comment_downvotes add constraint FKd5h3gk0fbeomwph3blsf5wigb foreign key (question_comment_id) references question_comment (id)
alter table question_comment_upvotes add constraint FKk6jh6kkjd8ehq8c68r39w2nd5 foreign key (upvotes_id) references comment_upvote (id)
alter table question_comment_upvotes add constraint FKnw6ama9r3b86pbbi555q9pec2 foreign key (question_comment_id) references question_comment (id)
alter table question_downvote add constraint FK4sy4mw5tusbw0xushhgtw869p foreign key (user_id) references user (id)
alter table question_upvote add constraint FKkyfkl3env3rak670otdpyr602 foreign key (user_id) references user (id)
alter table user_answer_comments add constraint FKpwrlxv56votfd9otnfixhdxht foreign key (answer_comments_id) references answer_comment (id)
alter table user_answer_comments add constraint FK5ikagndidvehu61wg0dtcgaqs foreign key (user_id) references user (id)
alter table user_answers add constraint FKr4hgnxj9dcdj2qctgiqmr60u8 foreign key (answers_id) references answer (id)
alter table user_answers add constraint FKhjidtwb6tnkcgq2del9dl22w2 foreign key (user_id) references user (id)
alter table user_asked_questions add constraint FK562ownpih3e2cfgctpclp8yn2 foreign key (asked_questions_id) references question (id)
alter table user_asked_questions add constraint FKbmovn41xk27j1u4b9arf84hv6 foreign key (user_id) references user (id)
alter table user_following_questions add constraint FKq2392jfeyh46xi5rtwgwcnx0a foreign key (following_questions_id) references question (id)
alter table user_following_questions add constraint FKhtud5n1jx21csrgn4uk1lx9qa foreign key (user_id) references user (id)
alter table user_question_comments add constraint FK84l1l7cwm6y2aoyrqs2gksy4k foreign key (question_comments_id) references question_comment (id)
alter table user_question_comments add constraint FK7c0nkgmmbas71ydnfww0mc8rl foreign key (user_id) references user (id)
