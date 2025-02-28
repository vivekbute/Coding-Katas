-- SELECT e.name AS Employee
-- FROM Employee e
-- JOIN (
--     SELECT *
--     FROM Employee
--     WHERE id IN (SELECT managerId FROM Employee)
-- ) a ON e.managerId = a.id
-- WHERE e.salary > a.salary;


-- select
--     e.name Employee
-- from
--     Employee as e
-- join
--     Employee as m
-- on
--     e.managerId = m.id
-- Where
--     e.salary > m.salary

Select
    name as Employee
From
    Employee e
Where exists
          (
              Select
                  1
              From
                  Employee m
              where
                  e.managerId = m.id and e.salary>m.salary
          )

--
--           +-------------+---------+
--     | Column Name | Type    |
--     +-------------+---------+
--     | id          | int     |
--     | name        | varchar |
--     | salary      | int     |
--     | managerId   | int     |
--     +-------------+---------+