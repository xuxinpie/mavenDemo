CREATE TABLE USER (
  id INT(20) NOT NULL AUTO_INCREMENT,
  email VARCHAR(50) DEFAULT NULL,
  user_name VARCHAR(40) DEFAULT NULL,
  PASSWORD VARCHAR(255) DEFAULT NULL,
  age INT(4) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `user` */


INSERT INTO USER VALUES ('1',"xuxinpie@gmail.com",'xinux','901126','25'),('2',"dreamingfish123@gmail.com",'hulda','901126','24');