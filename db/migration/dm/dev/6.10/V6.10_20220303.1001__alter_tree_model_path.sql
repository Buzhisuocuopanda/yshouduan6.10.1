-- 树形-批量向模型表中添加treePath_、treeLevel_字段
-- 1.创建
create  or replace procedure addTreePathParam(vUser in varchar2) as
begin
    declare
        cursor csr is select code from h_biz_schema where modelType = 'TREE';
        vSchemaCode VARCHAR(200);
        vTableName VARCHAR(200);
        nCount number;
        nCount2 number;
        v_sql varchar2(1000);
    begin
        for row_schema_code in csr loop

                vSchemaCode := row_schema_code.code;
                select  UPPER(('i' || appNameSpace || '_' || vSchemaCode)) into vTableName from h_app_package where code = (select appCode from h_app_function where code = vSchemaCode);
								if vTableName is not null then
									 dbms_output.put_line('deal table --->'||vTableName);
									 select count(0) into nCount from h_biz_property where schemaCode = vSchemaCode and code = 'treePath_';
								   if nCount = 0 then
									      v_sql := 'ALTER TABLE "'||vUser||'"."'||vTableName||'" ADD ("treePath_" VARCHAR2(512 BYTE) DEFAULT null)';
												execute immediate v_sql;
                        v_sql :='COMMENT ON COLUMN "'||vUser||'"."'||vTableName||'"."treePath_" is ''路径''';
                        execute immediate v_sql;
												v_sql := 'INSERT INTO h_biz_property (id, createdTime, creater, deleted, code, defaultProperty, name, propertyEmpty, propertyIndex, propertyLength, propertyType, published,schemaCode)
                                                      VALUES (LOWER(sys_guid()), sysdate, NULL, 0,'||'''treePath_'', 0, ''路径'', 0, 0, 12, ''SHORT_TEXT'', 1,'''||vSchemaCode||''')';
												execute immediate v_sql;
									 end if;
									 select count(0) into nCount2 from h_biz_property where schemaCode = vSchemaCode and code = 'treeLevel_';
								   if nCount2 = 0 then
									      v_sql := 'ALTER TABLE "'||vUser||'"."'||vTableName||'" ADD ("treeLevel_" NUMBER(25,8) DEFAULT 1)';
												execute immediate v_sql;
                        v_sql :='COMMENT ON COLUMN "'||vUser||'"."'||vTableName||'"."treeLevel_" is ''层级''';
                        execute immediate v_sql;
											  v_sql := 'INSERT INTO h_biz_property (id, createdTime, creater, deleted, code, defaultProperty, defaultValue, name, propertyEmpty, propertyIndex, propertyLength, propertyType, published, schemaCode)
                                            VALUES (LOWER(sys_guid()), sysdate, NULL, 0,'||'''treeLevel_'', 0, 1, ''层级'', 0,  0, 12, ''NUMERICAL'', 1, '''||vSchemaCode||''')';
												execute immediate v_sql;
									 end if;
								end if;
            end loop;
    end;
end addTreePathParam;
/

-- 2.执行!!!!!!输入库所属用户名 （获取当前用户 select username from user_users）
call addTreePathParam('TEST');

-- 3.删除
drop procedure  addTreePathParam;
