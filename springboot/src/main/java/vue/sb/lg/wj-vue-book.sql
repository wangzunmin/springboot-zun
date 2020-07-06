/*
Navicat MySQL Data Transfer

Source Server         : localhost2-slave
Source Server Version : 50727
Source Host           : localhost:3307
Source Database       : wj-vue

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2020-07-06 16:25:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`abs`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`author`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`cover`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`date`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`press`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`title`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`cid`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=28

;

-- ----------------------------
-- Records of t_book
-- ----------------------------
BEGIN;
INSERT INTO `t_book` VALUES ('1', '文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……', '刘慈欣', 'https://i.loli.net/2019/04/10/5cada7e73d601.jpg', '2019-05-05', '重庆出版社', '三体', '1'), ('2', '17岁前从未上过学的女孩，如何成为剑桥大学博士？我们要背叛多少曾经，才能找到真正的自我！《纽约时报》 等数十家媒体一致公推“年度图书”，作者获选《时代周刊》年度影响力人物！这本书比你听说的还要好！', '塔拉 · 韦斯特弗', 'https://i.loli.net/2020/06/11/cuyrZFe8DwMq5Cm.png', '2019-11', '南海出版公司', '你当像鸟飞往你的山', '2'), ('3', '批判性思维领域“圣经”。批判性思维领域的权威大师之作！兼具科学性与实用性，不能错过的思维技能训练书！', '文森特·赖安·拉吉罗', 'https://i.loli.net/2020/06/23/NSbVUYR5p6LFE9k.png', '2019-01-01', '机械工业出版社', '思考的艺术', '3'), ('25', '321', '321', '43242', '312', '321', '21321', '6'), ('26', '321', '321', '332121', '21', '12321', '32', '5'), ('27', '45354光伏发电', '4324324', '3242432', '432432', '43543', '432432', '4');
COMMIT;

-- ----------------------------
-- Auto increment value for t_book
-- ----------------------------
ALTER TABLE `t_book` AUTO_INCREMENT=28;
