# Write your MySQL query statement below
select max(salary) AS SecondHighestSalary from employee where salary < (Select max(salary) from employee);