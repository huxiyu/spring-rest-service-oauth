insert into t_oauth_user(id, name, login, password) values (1,'Roy','roy','spring');
insert into t_oauth_user(id, name, login, password) values (2,'Craig','craig','spring');
insert into t_oauth_user(id, name, login, password) values (3,'Greg','greg','spring');
 
insert into t_oauth_role(id, name) values (1,'ROLE_USER');
insert into t_oauth_role(id, name) values (2,'ROLE_ADMIN');
insert into t_oauth_role(id, name) values (3,'ROLE_GUEST'); 

insert into t_oauth_user_role(user_id, role_id) values (1,1);
insert into t_oauth_user_role(user_id, role_id) values (1,2);
insert into t_oauth_user_role(user_id, role_id) values (2,1);
insert into t_oauth_user_role(user_id, role_id) values (3,1);
