select * from t1 where not exists (select * from t2 where t1.t1_id = t2.t2_id and t1.name = t2.name and t1.age = t2.age)