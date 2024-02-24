# Write your MySQL query statement below
select 
    CASE  
        when count(*)=1 then null
        else 
            (select distinct salary from Employee ORDER BY salary DESC limit 1,1)
        end as SecondHighestSalary
from 
    Employee;   