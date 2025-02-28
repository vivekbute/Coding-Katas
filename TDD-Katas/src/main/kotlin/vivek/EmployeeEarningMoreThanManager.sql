-- First solution
Select
    e.name Employee
from
    Employee as e
join
    Employee as m
on
    e.managerId = m.id
where
    e.salary > m.salary

-- Second solution
Select
    name as Employee
from
    Employee e
where exists
    (
    Select 1 from Employee m where e.managerId = m.id and e.salary > m.salary
    )


-- Third solution
SELECT e.name AS Employee
FROM Employee e
JOIN (
    SELECT *
    FROM Employee
    WHERE id IN (SELECT managerId FROM Employee)
) a ON e.managerId = a.id
WHERE e.salary > a.salary;