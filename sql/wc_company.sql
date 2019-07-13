SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_company
-- ----------------------------
DROP TABLE IF EXISTS `tb_company`;
CREATE TABLE `tb_company`
(
  `company_id`            int(11)       NOT NULL auto_increment,
  `company_name`          varchar(100) NOT NULL,
  PRIMARY KEY (`cid`),
  index `idx_company_name` (`company_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  auto_increment = 1;
