alter table answer drop foreign key FK8frr4bcabmmeyyu60qt7iiblo
alter table answer drop foreign key FK68tbcw6bunvfjaoscaj851xpb
alter table answer_comments drop foreign key FK6jhyvhq6mm1kfjjtrqjh0dfpa
alter table answer_comments drop foreign key FK29upuh06yt42c2oncpmy6tn1j
alter table answer_downvotes drop foreign key FKd4l4umj7itcj282ka47k3n077
alter table answer_downvotes drop foreign key FKa8w1ou0d7a6d7b5lkf0if8tba
alter table answer_upvotes drop foreign key FK6s89xawpek02tei30gixx625k
alter table answer_upvotes drop foreign key FKhmf4hefb1c3tt23jvtgv5hs0g
alter table answer_comment drop foreign key FKbi4ojf23mofyyc9wmmslub4ln
alter table answer_comment drop foreign key FK87c9uh8328afrd7v20x4hcfar
alter table answer_comment_downvotes drop foreign key FKfmk0s6e1j4rlsfdnpi9d21xit
alter table answer_comment_downvotes drop foreign key FKanegnmu5rjk85v0i4p0qjlbhn
alter table answer_comment_upvotes drop foreign key FKb66w350av6sdmvoeofi44wovw
alter table answer_comment_upvotes drop foreign key FKeolgu6ghu2luyfb6dpuqlm06
alter table answer_downvote drop foreign key FK4jr37778kj5qo4c0yvwr8dq7o
alter table answer_upvote drop foreign key FK442hcp3l2twi9s7a7mhral7e5
alter table comment_downvote drop foreign key FKt2j7oytrekc1wvtf9wm009k5r
alter table comment_upvote drop foreign key FKr96847mm8n3rydr9ua59137y0
alter table question drop foreign key FK5x08j81rbrwxowo5l8c3236nv
alter table question_answers drop foreign key FKnr1xcvup15w03kboejfervq1y
alter table question_answers drop foreign key FKlglw0r110cw97aje0b0pa4q51
alter table question_comments drop foreign key FK6brxdxc9snn4e27vm4su0qtpy
alter table question_comments drop foreign key FK9uteqnot54x033kh2soej4jmw
alter table question_downvotes drop foreign key FKam24xjwwwkpl203t3uvo165rx
alter table question_downvotes drop foreign key FKrb9kmmqfigkjfb9rlwjql9n4d
alter table question_followers drop foreign key FKc5xsfwxo7k99wkgfo9pomo76d
alter table question_followers drop foreign key FKkx9ml3wqgi5t93fbnswpvga0i
alter table question_topics drop foreign key FKgdktt6q3fgqoyrig9yoyglxfo
alter table question_topics drop foreign key FKxfy72xl4cugh2ykr8k18xph9
alter table question_upvotes drop foreign key FKjs5yxd0fj0d3t77wgk1qmmcoc
alter table question_upvotes drop foreign key FKermum9o3klcj20fr81r8cdwjt
alter table question_comment drop foreign key FKgatho66t7ix04m6dothg6jaqh
alter table question_comment drop foreign key FK5v1x6rdm2bocicjn0c5ndow8c
alter table question_comment_downvotes drop foreign key FK51y698rsihtfi6b2pschm8hk6
alter table question_comment_downvotes drop foreign key FKd5h3gk0fbeomwph3blsf5wigb
alter table question_comment_upvotes drop foreign key FKk6jh6kkjd8ehq8c68r39w2nd5
alter table question_comment_upvotes drop foreign key FKnw6ama9r3b86pbbi555q9pec2
alter table question_downvote drop foreign key FK4sy4mw5tusbw0xushhgtw869p
alter table question_upvote drop foreign key FKkyfkl3env3rak670otdpyr602
alter table user_answer_comments drop foreign key FKpwrlxv56votfd9otnfixhdxht
alter table user_answer_comments drop foreign key FK5ikagndidvehu61wg0dtcgaqs
alter table user_answers drop foreign key FKr4hgnxj9dcdj2qctgiqmr60u8
alter table user_answers drop foreign key FKhjidtwb6tnkcgq2del9dl22w2
alter table user_asked_questions drop foreign key FK562ownpih3e2cfgctpclp8yn2
alter table user_asked_questions drop foreign key FKbmovn41xk27j1u4b9arf84hv6
alter table user_following_questions drop foreign key FKq2392jfeyh46xi5rtwgwcnx0a
alter table user_following_questions drop foreign key FKhtud5n1jx21csrgn4uk1lx9qa
alter table user_question_comments drop foreign key FK84l1l7cwm6y2aoyrqs2gksy4k
alter table user_question_comments drop foreign key FK7c0nkgmmbas71ydnfww0mc8rl
drop table if exists answer
drop table if exists answer_comments
drop table if exists answer_downvotes
drop table if exists answer_upvotes
drop table if exists answer_comment
drop table if exists answer_comment_downvotes
drop table if exists answer_comment_upvotes
drop table if exists answer_downvote
drop table if exists answer_upvote
drop table if exists comment_downvote
drop table if exists comment_upvote
drop table if exists question
drop table if exists question_answers
drop table if exists question_comments
drop table if exists question_downvotes
drop table if exists question_followers
drop table if exists question_topics
drop table if exists question_upvotes
drop table if exists question_comment
drop table if exists question_comment_downvotes
drop table if exists question_comment_upvotes
drop table if exists question_downvote
drop table if exists question_upvote
drop table if exists topic
drop table if exists user
drop table if exists user_answer_comments
drop table if exists user_answers
drop table if exists user_asked_questions
drop table if exists user_following_questions
drop table if exists user_question_comments
