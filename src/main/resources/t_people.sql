/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50723
Source Host           : 127.0.0.1:3306
Source Database       : mytest

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2018-12-11 18:02:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_people
-- ----------------------------
DROP TABLE IF EXISTS `t_people`;
CREATE TABLE `t_people` (
  `people_id` varchar(20) NOT NULL,
  `people_name` varchar(20) DEFAULT NULL,
  `people_age` varchar(5) DEFAULT NULL,
  `people_weight` varchar(10) DEFAULT NULL,
  `people_height` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`people_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_people
-- ----------------------------
INSERT INTO `t_people` VALUES ('111', '马真', '18', '150', '186');
INSERT INTO `t_people` VALUES ('123456', '李明', '19', '140', '170');
INSERT INTO `t_people` VALUES ('222', '张玮', '11', '130', '180');

