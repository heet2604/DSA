# Write your MySQL query statement below
select a.machine_id , ROUND(AVG(b.timestamp-a.timestamp),3) as processing_time from Activity a join activity b on a.machine_id = b.machine_id where a.process_id=b.process_id
and a.activity_type = 'start' and b.activity_type = 'end' group by a.machine_id;