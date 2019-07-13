SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for wc_record
-- ----------------------------
DROP TABLE IF EXISTS `wc_record`;
CREATE TABLE `wc_record`
(
  `record_id`            int(11)       NOT NULL auto_increment,
  `record_name`          varchar(100) NOT NULL,
  `company_id` int(11),
  `record_url` varchar(40),
  `student_id` int(11),
  `download_count` int(11),
  `view_count` int(11),
  `click_count` int(11),
  `time` datetime,
  `status` tinyint(1),
  PRIMARY KEY (`record_id`),
  index `idx_time` (`time`),
  index `idx_status` (`status`),
  index `idx_record_url` (`record_url`),
  index `idx_student_id` (`student_id`),
  index `idx_company_id` (`company_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
