DROP TABLE IF EXISTS T_AUTHORITY;
CREATE TABLE T_AUTHORITY(
AUTHORITY_ID INT PRIMARY KEY COMMENT '权限Id',
AUTHORITY_NAME VARCHARACTER(50) COMMENT '权限Id',
INS_DATE DATETIME COMMENT 'Insert Time',
INS_USER_ID VARCHAR(20) COMMENT 'Insert User',
INS_PROGRAM VARCHAR(20) COMMENT 'Insert Program',
UPD_DATE DATETIME COMMENT 'Update Time',
UPD_USER_ID VARCHAR(20) COMMENT 'Update User',
UPD_PROGRAM VARCHAR(20) COMMENT 'Update Program',
LOCK_VERSION BIGINT COMMENT 'Update Version'
) CHARACTER SET UTF8 COMMENT = 'User Authority'

INSERT INTO `freepj`.`t_authority` (`AUTHORITY_ID`, `AUTHORITY_NAME`, `INS_DATE`, `INS_USER_ID`, `INS_PROGRAM`, `UPD_DATE`, `UPD_USER_ID`, `UPD_PROGRAM`, `LOCK_VERSION`) VALUES ('1', '检索权限', '2018-08-25 11:53:25', 'admin', NULL, '2018-08-25 11:53:35', 'admin', NULL, '0');
INSERT INTO `freepj`.`t_authority` (`AUTHORITY_ID`, `AUTHORITY_NAME`, `INS_DATE`, `INS_USER_ID`, `INS_PROGRAM`, `UPD_DATE`, `UPD_USER_ID`, `UPD_PROGRAM`, `LOCK_VERSION`) VALUES ('2', '更新权限', '2018-08-25 11:53:25', 'admin', NULL, '2018-08-25 11:53:35', 'admin', NULL, '0');
INSERT INTO `freepj`.`t_authority` (`AUTHORITY_ID`, `AUTHORITY_NAME`, `INS_DATE`, `INS_USER_ID`, `INS_PROGRAM`, `UPD_DATE`, `UPD_USER_ID`, `UPD_PROGRAM`, `LOCK_VERSION`) VALUES ('3', '录入权限', '2018-08-25 11:53:25', 'admin', NULL, '2018-08-25 11:53:35', 'admin', NULL, '0');
INSERT INTO `freepj`.`t_authority` (`AUTHORITY_ID`, `AUTHORITY_NAME`, `INS_DATE`, `INS_USER_ID`, `INS_PROGRAM`, `UPD_DATE`, `UPD_USER_ID`, `UPD_PROGRAM`, `LOCK_VERSION`) VALUES ('4', '下载权限', '2018-08-25 11:53:25', 'admin', NULL, '2018-08-25 11:53:35', 'admin', NULL, '0');
INSERT INTO `freepj`.`t_authority` (`AUTHORITY_ID`, `AUTHORITY_NAME`, `INS_DATE`, `INS_USER_ID`, `INS_PROGRAM`, `UPD_DATE`, `UPD_USER_ID`, `UPD_PROGRAM`, `LOCK_VERSION`) VALUES ('5', '管理员权限', '2018-08-25 11:53:25', 'admin', NULL, '2018-08-25 11:53:35', 'admin', NULL, '0');
