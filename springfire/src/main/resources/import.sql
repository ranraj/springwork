insert into SALE_ORDER_DETAILS(id,delery_address , payment_mode) values (101,'Main road1','Online')
insert into SALE_ORDER_DETAILS(id,delery_address , payment_mode) values (102,'Main road2','Credit card')

insert into SALE_ORDER(item, amount,order_detail_id) values ('laptop', 100,101)
insert into SALE_ORDER(item, amount,order_detail_id) values ('mobile', 20,102)

insert into SALE_CATEGORY(id,name, description) values (1,'Electonics','Electronic item like laptops and mobiles')

insert into SALE_ITEM(name, mrp,item_category_id) values ('laptop', 101,1)


