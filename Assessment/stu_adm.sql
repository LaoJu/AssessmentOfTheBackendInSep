/*
Navicat MySQL Data Transfer

Source Server         : myDB
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : stu_adm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-09-02 17:23:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `AdminID` int(11) NOT NULL AUTO_INCREMENT,
  `AdminName` varchar(32) DEFAULT NULL,
  `AdminPwd` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`AdminID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '123', '123');
INSERT INTO `admin` VALUES ('2', '321', '321');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `StudentName` varchar(32) NOT NULL,
  `StudentAge` int(11) NOT NULL,
  `StudentNumber` int(11) NOT NULL,
  `StudentMajor` varchar(32) NOT NULL,
  PRIMARY KEY (`StudentNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('韩梅梅', '12', '2016210002', '广播电视工程');
INSERT INTO `student` VALUES ('吕秀才', '20', '2016210005', '电子信息工程');
INSERT INTO `student` VALUES ('123', '20', '2016210009', '信息工程');
INSERT INTO `student` VALUES ('小红', '25', '2016210456', '通信工程');
INSERT INTO `student` VALUES ('小郭', '22', '2016210457', '通信工程');
INSERT INTO `student` VALUES ('张伟', '18', '2016210485', '信息工程');
INSERT INTO `student` VALUES ('李雷', '19', '2016210564', '电子信息工程');
INSERT INTO `student` VALUES ('小郭', '25', '2016210963', '电子信息工程');
