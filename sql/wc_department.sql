SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wc_department
-- ----------------------------
DROP TABLE IF EXISTS `wc_department`;
CREATE TABLE `wc_department`
(
  `department_id`            int(11) NOT NULL auto_increment,
  `department_name`          varchar(40),
  `pid`  int(11),
  PRIMARY KEY (`department_id`),
  index `idx_department_name` (`department_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
