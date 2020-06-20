insert into user (id, user_name, password, active, roles) values
(1, 'einstein', 'einstein', true, 'USER'),
(2, 'newton', 'newton', true, 'USER'),
(3, 'koushik', 'koushik', true, 'USER');

insert into user_profile (id, user_name, theme, summary, first_name, last_name, email, phone, designation) values
(1, 'einstein', 1, 'Developed the theory of relativity, one of the two pillars of modern physics. My work is also known for its influence on the philosophy of science.', 'Albert', 'Einstein', 'einstein@gmail.com', '111-111-1111', 'Theoretical physicist'),
(2, 'newton', 2, 'Widely recognised as one of the most influential scientists of all time and as a key figure in the scientific revolution', 'Isaac', 'Newton', 'newton@gmail.com', '222-222-2222', 'Mathematician, physicist, astronomer, theologian, and author');
