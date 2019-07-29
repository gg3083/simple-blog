CREATE TABLE `biz_log` (
  `id` bigint(20)  NOT NULL AUTO_INCREMENT,
  `ipaddr` varchar(64)  NULL COMMENT 'ip地址',
  `address` varchar(64) NULL COMMENT '访问地址',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT