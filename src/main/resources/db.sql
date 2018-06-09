
CREATE TABLE buzi_info (
  id char(36) NOT NULL,
  pk_tenant varchar(10) NOT NULL DEFAULT '~' ,
  product_id varchar(36) NOT NULL DEFAULT '~',
  pur_num int NOT NULL DEFAULT 0 ,
  buzi_content varchar(1024) NOT NULL DEFAULT '~',
  active_date datetime NOT NULL  DEFAULT '1000-01-01 00:00:00',
  PRIMARY KEY (`id`)
)
