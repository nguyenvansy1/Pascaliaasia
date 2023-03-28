CREATE TABLE agents (
  code INT PRIMARY KEY,
  name VARCHAR(50),
  area VARCHAR(50),
  commission DECIMAL(4,2),
  phone VARCHAR(20),
  country VARCHAR(50)
);

CREATE TABLE customer (
    code INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    area VARCHAR(50) NOT NULL,
    country VARCHAR(50) NOT NULL,
    grade VARCHAR(2) NOT NULL,
    opening DATE NOT NULL,
    receive DATE NOT NULL,
    agent_code INT NOT NULL,
    FOREIGN KEY (agent_code) REFERENCES agents (code)
);

update agents set commission = 0.2 where country = "UK";

delete from agents where country = "india" and commission < 0.14;

Select * from employee where age > 25;

select * from employee 
left join projects on projects.EmployeeID = employee.id
where employee.city = "London";


select count(salary) from employee
group by employee.salary
having employee.salary > 45000;


START TRANSACTION;
UPDATE products
SET price = 1001
WHERE id IN (111);

COMMIT;


SELECT MAX(salary) 
FROM employees 
WHERE salary < (SELECT MAX(salary) FROM employees);


SELECT department, MAX(age) AS max_age
FROM employees
GROUP BY department

