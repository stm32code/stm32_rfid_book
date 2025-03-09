/*
Navicat MySQL Data Transfer

Source Server         : 腾讯云数据库_新
Source Server Version : 50718
Source Host           : bj-cynosdbmysql-grp-1043rhue.sql.tencentcdb.com:29167
Source Database       : bs_book2

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2022-04-22 11:24:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bs_book_info
-- ----------------------------
DROP TABLE IF EXISTS `bs_book_info`;
CREATE TABLE `bs_book_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(255) DEFAULT NULL,
  `b_msg` varchar(255) DEFAULT NULL,
  `b_price` decimal(10,2) DEFAULT NULL,
  `b_number` int(11) DEFAULT NULL,
  `b_rfid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_book_info
-- ----------------------------

-- ----------------------------
-- Table structure for bs_rfid
-- ----------------------------
DROP TABLE IF EXISTS `bs_rfid`;
CREATE TABLE `bs_rfid` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rfid_id` varchar(255) DEFAULT NULL,
  `rfid_status` varchar(255) DEFAULT NULL COMMENT '0-未读 1-已读',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_rfid
-- ----------------------------
INSERT INTO `bs_rfid` VALUES ('1', '73B51E19', '0');

-- ----------------------------
-- Table structure for bs_token
-- ----------------------------
DROP TABLE IF EXISTS `bs_token`;
CREATE TABLE `bs_token` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_token
-- ----------------------------
INSERT INTO `bs_token` VALUES ('1', '1', 'f2693c42-b40f-4a28-9af4-b7ab4d9ce64d');
INSERT INTO `bs_token` VALUES ('2', '2', null);
INSERT INTO `bs_token` VALUES ('3', '4', 'e0a1827c-94e5-45cb-811d-16d1d0ef90aa');
INSERT INTO `bs_token` VALUES ('4', '5', 'bbca0a4d-9914-4e5c-8805-81f001bd8901');
INSERT INTO `bs_token` VALUES ('5', '6', 'c4a3e52b-5411-446f-94e9-08c281317653');

-- ----------------------------
-- Table structure for bs_user
-- ----------------------------
DROP TABLE IF EXISTS `bs_user`;
CREATE TABLE `bs_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL COMMENT ' 0-管理员 1-普通用户',
  `identity` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_user
-- ----------------------------
INSERT INTO `bs_user` VALUES ('1', 'admin', 'admin0401', '0');
INSERT INTO `bs_user` VALUES ('4', 'user1', 'user1', '1');
INSERT INTO `bs_user` VALUES ('5', 'user3', 'user3', '1');
INSERT INTO `bs_user` VALUES ('6', 'user4', 'user4', '1');
