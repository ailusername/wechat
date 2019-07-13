SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wc_student
-- ----------------------------
DROP TABLE IF EXISTS `wc_student`;
CREATE TABLE `tb_company`
(
  `student_id`            int(11)       NOT NULL auto_increment,
  `student_name`          varchar(40) NOT NULL,
  `department_id`         varchar(40),
  `phone`                  varchar(40),
  `gender` tinyint(2),
  `openid` varchar(40),
  PRIMARY KEY (`student_id`),
  index `idx_student_name` (`student_name`),
  index `idx_department_id` (`department_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
