SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`
(
  `department_id`                     int(11) NOT NULL,
  `teacher_id`                        int(11) NOT NULL,
  PRIMARY KEY (`department_id`,`teacher_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
