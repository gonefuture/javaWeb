/*
SQLyog v10.2 
MySQL - 5.5.28 : Database - user
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`user` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `user`;

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `uuid` char(32) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`uuid`,`username`,`password`,`email`,`phone`) values ('04897D1D1F224F36B981293D96850829','谢安','123456','848727875@qq.com',2147483647);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int(36) NOT NULL AUTO_INCREMENT,
  `userName` varchar(36) DEFAULT NULL,
  `userPass` varchar(36) DEFAULT NULL,
  `age` int(36) DEFAULT NULL,
  `sex` varchar(36) DEFAULT NULL,
  `email` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`userId`,`userName`,`userPass`,`age`,`sex`,`email`) values (1,'4','1',1,'1','1'),(2,NULL,NULL,0,NULL,'848727875@qq.com'),(3,NULL,NULL,0,NULL,'848727875@qq.com'),(4,NULL,NULL,0,NULL,'848727875@qq.com'),(5,NULL,NULL,0,NULL,'123456@qq.com'),(6,'å¶è¶','123456',0,NULL,'123456@qq.com'),(7,'叶超','123456',0,NULL,'123456@qq.com'),(11,'伟龙','123456',0,NULL,'123456@qq.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
