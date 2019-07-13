SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wc_teacher
-- ----------------------------
DROP TABLE IF EXISTS `wc_teacher`;
CREATE TABLE `wc_teacher`
(
  `teacher_id`            int(11)       NOT NULL auto_increment,
  `teacher_name`          varchar(40) NOT NULL,
  `department_id`         varchar(40),
  `phone`                  varchar(40),
  `gender` tinyint(2),
  `openid` varchar(40),
  PRIMARY KEY (`teacher_id`),
  index `idx_department_id` (`department_id`),
  index `idx_teacher_name` (`teacher_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
