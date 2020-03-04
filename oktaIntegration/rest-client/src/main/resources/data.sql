SET FOREIGN_KEY_CHECKS=0;
truncate  table employee;
truncate  table  person;
truncate  table user;
SET FOREIGN_KEY_CHECKS=1;

insert into person (id, name, age, gender, dob)
values (1, 'ubaid', 23, 'M', '1997-02-09'),
       (2, 'attiq', 21, 'M', '2000-04-01'),
       (3, 'ali', 23, 'M', '1996-12-23'),
       (4, 'Yusra', 22, 'F', '1998-01-30');


insert into employee(id, username, password, salary, position, year, employee_detail_id)
values(1, 'urehman', '1234', 70000, 'Sr Java developer', 7, 1),
(2, 'arehman', '4578', 80000, 'Sr ML Engineer', 6, 2);

