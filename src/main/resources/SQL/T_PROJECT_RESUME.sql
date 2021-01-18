DROP TABLE IF EXISTS T_PROJECT_RESUME;
CREATE TABLE T_PROJECT_RESUME(
ID INT PRIMARY KEY AUTO_INCREMENT COMMENT 'ID(Primary)',
RESUME_CONTENT TEXT COMMENT 'Project Or Business content',
RESUME_URL VARCHAR(100) COMMENT 'url',
DIVIDE VARCHAR(2) COMMENT 'divce',
INS_DATE DATETIME COMMENT 'Insert Time',
INS_USER_ID VARCHAR(20) COMMENT 'Insert User',
INS_PROGRAM VARCHAR(20) COMMENT 'Insert Program',
UPD_DATE DATETIME COMMENT 'Update Time',
UPD_USER_ID VARCHAR(20) COMMENT 'Update User',
UPD_PROGRAM VARCHAR(20) COMMENT 'Update Program',
LOCK_VERSION BIGINT COMMENT 'Update Version'
) CHARACTER SET UTF8 COMMENT = 'project Resume or Business Resume';

INSERT INTO `freePj`.`t_project_resume` (`ID`, `RESUME_CONTENT`, `RESUME_URL`, `DIVIDE`, `INS_DATE`, `INS_USER_ID`, `INS_PROGRAM`, `UPD_DATE`, `UPD_USER_ID`, `UPD_PROGRAM`, `LOCK_VERSION`) VALUES ('1', 
'自由的人生，It’s free life，这就是<STRONG STYLE="text-color:blue">网站的主题</STRONG>。<BR/>不论现在我们处在什么阶段，都想有一片放飞自我的天地。<BR/>而我们，现在的我们，亦年轻，亦学浅，但都有着试想与天比高的气概。<BR/><SPAN STYLE="text-decoration:underline">在这里，我们都有一个共同的思考，"我们总要做些什么"</SPAN>，那么<BR/><STRONG>现在，即刻，便开始去做吧，只希望不负人生这一程。</STRONG>'
, '#', '32', SYSDATE(), NULL, NULL, NULL, NULL, NULL, NULL);
