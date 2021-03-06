alter table h_biz_sheet add formSystemVersion varchar(32) null comment '系统版本号';
alter table h_biz_property add options longtext null comment '数据项属性';
DROP TABLE IF EXISTS `h_biz_data_rule`;
CREATE TABLE `h_biz_data_rule`  (
  `id` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `creater` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createdTime` datetime(0) NULL DEFAULT NULL,
  `deleted` bit(1) NULL DEFAULT NULL,
  `modifier` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `modifiedTime` datetime(0) NULL DEFAULT NULL,
  `remarks` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `schemaCode` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `propertyCode` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `options` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `dataRuleType` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `checkType` int(2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '数据规则' ROW_FORMAT = Dynamic;
alter table h_biz_export_task add refId varchar(200) null comment '附件id';
alter table h_biz_export_task add schemaCode varchar(200) null comment '数据模型编码';
alter table h_biz_export_task add expireTime datetime(0) null comment '过期时间';
ALTER TABLE h_biz_sheet ADD formTrack bit(1) NULL DEFAULT NULL comment '是否开启表单留痕';
ALTER TABLE h_biz_sheet ADD trackDataCodes longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL comment '需要留痕的表单数据项code,用 ; 号分割';

ALTER TABLE h_biz_sheet_history ADD formTrack bit(1) NULL DEFAULT NULL comment '是否开启表单留痕';
ALTER TABLE h_biz_sheet_history ADD trackDataCodes longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL comment '需要留痕的表单数据项code,用 ; 号分割';

ALTER TABLE h_perm_admin ADD dataDictionaryManage bit(1) NULL DEFAULT NULL comment '是否有数据字典管理权限';

update h_biz_sheet set formTrack = 0 where formTrack is null or formTrack = '';
update h_biz_sheet_history set formTrack = 0 where formTrack is null or formTrack = '';
update h_perm_admin set dataDictionaryManage = 0 where dataDictionaryManage is null or dataDictionaryManage ='';

CREATE TABLE `h_data_dictionary` (
  `id` varchar(120) NOT NULL,
  `createdTime` datetime DEFAULT NULL,
  `creater` varchar(120) DEFAULT NULL,
  `deleted` bit(1) DEFAULT b'0',
  `modifiedTime` datetime DEFAULT NULL,
  `modifier` varchar(120) DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL COMMENT '字典名称',
  `code` varchar(50) DEFAULT NULL COMMENT '字典编码',
  `dictionaryType` varchar(40) DEFAULT NULL COMMENT '字典类型',
  `sortKey` int(11) DEFAULT NULL COMMENT '排序值',
  `status` bit(1) DEFAULT NULL COMMENT '启用状态',
  `classificationId` varchar(120) DEFAULT NULL COMMENT '所属分类ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

CREATE TABLE `h_dictionary_class` (
  `id` varchar(120) NOT NULL,
  `createdTime` datetime DEFAULT NULL,
  `creater` varchar(120) DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `modifiedTime` datetime DEFAULT NULL,
  `modifier` varchar(120) DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL COMMENT '字典分类名',
  `sortKey` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

CREATE TABLE `h_dictionary_record` (
  `id` varchar(120) NOT NULL,
  `createdTime` datetime DEFAULT NULL,
  `creater` varchar(120) DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `modifiedTime` datetime DEFAULT NULL,
  `modifier` varchar(120) DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL COMMENT '字典数据名称',
  `code` varchar(50) DEFAULT NULL COMMENT '字典数据编码',
  `dictionaryId` varchar(120) DEFAULT NULL COMMENT '所属字典ID',
  `sortKey` int(11) DEFAULT NULL,
  `parentId` varchar(120) DEFAULT NULL COMMENT '上级字典数据ID',
  `status` bit(1) DEFAULT NULL COMMENT '字典数据启用状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

CREATE TABLE `h_biz_data_track` (
  `id` varchar(120) NOT NULL,
  `createdTime` datetime DEFAULT NULL,
  `creater` varchar(120) DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `modifiedTime` datetime DEFAULT NULL,
  `modifier` varchar(120) DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL COMMENT '留痕的表单名称',
  `bizObjectId` varchar(120) DEFAULT NULL COMMENT '留痕的表单ID',
  `departmentId` varchar(120) DEFAULT NULL COMMENT '此次留痕记录的修改人部门',
  `departmentName` varchar(50) DEFAULT NULL COMMENT '此次留痕记录的修改人部门名称',
  `creatorName` varchar(50) DEFAULT NULL COMMENT '此次留痕记录的修改人',
  `schemaCode` varchar(40) DEFAULT NULL COMMENT '所属数据模型编码',
  `sheetCode` varchar(40) DEFAULT NULL COMMENT '所属表单编码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

CREATE TABLE `h_biz_data_track_detail` (
  `id` varchar(120) NOT NULL,
  `createdTime` datetime DEFAULT NULL,
  `creater` varchar(120) DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  `modifiedTime` datetime DEFAULT NULL,
  `modifier` varchar(120) DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL,
  `trackId` varchar(120) DEFAULT NULL COMMENT '留痕记录ID',
  `bizObjectId` varchar(120) DEFAULT NULL COMMENT '留痕的表单ID',
  `name` varchar(50) DEFAULT NULL COMMENT '留痕的字段名称',
  `beforeValue` longtext DEFAULT NULL COMMENT '留痕字段新值',
  `afterValue` longtext DEFAULT NULL COMMENT '留痕字段旧值',
  `type` varchar(40) DEFAULT NULL COMMENT '留痕字段类型',
  `departmentName` varchar(50) DEFAULT NULL COMMENT '此次留痕记录的修改人部门名称',
  `creatorName` varchar(50) DEFAULT NULL COMMENT '此次留痕记录的修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;
ALTER TABLE h_dictionary_record ADD initialUsed bit(1) NULL DEFAULT NULL comment '字典数据历史使用状态';

update h_dictionary_record set initialUsed = 0 where initialUsed is null or initialUsed = '';

ALTER TABLE h_biz_query_condition MODIFY COLUMN options VARCHAR(2048);
alter table h_biz_sheet add draftSchemaOptionsJson longtext;
ALTER TABLE h_biz_query_condition CHANGE `options` `options` LONGTEXT;
