# plugin
插件化开发


先install main_program
再package plugin(没有主程序，打包会报错，删除target文件夹中的空jar文件，重命名.jar.original文件为.jar文件)
数据库
CREATE TABLE `plugin` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `BOOT_CLASS` varchar(255) DEFAULT NULL COMMENT '	\r\nspring初始化结束后，插件进行初始化的类。\r\n\r\n示例：xxx.xxx.xxx.XxxBootClass',
  `NAME` varchar(255) DEFAULT NULL COMMENT '插件名不为空是为了输出插件的加载情况',
  `URL` varchar(255) DEFAULT NULL COMMENT '插件路径。\r\n\r\n示例：F:\\xxx\\xxx\\xxx.jar',
  `SCAN_PATH` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '需要spring进行管理的类的包。\r\n\r\n示例:xxx/xxx/xxx',
  `IS_ENABLE` tinyint(1) DEFAULT NULL COMMENT '是否启用插件',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `plugin` (ID ,BOOT_CLASS , NAME ,URL ,SCAN_PATH , IS_ENABLE) VALUE (1,'com.pinyi.plugin.devastate.PrintWorldBoot','打印插件','D:\Dee\spring-plugin-cli-master\spring-plugin-cli-master\plugin\target\devastate-0.0.1-SNAPSHOT.jar','com.pinyi.plugin',1)
