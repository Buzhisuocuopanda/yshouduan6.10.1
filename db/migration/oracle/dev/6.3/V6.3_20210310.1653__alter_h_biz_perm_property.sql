alter table H_BIZ_PERM_PROPERTY add ENCRYPTVISIBLE NUMBER;

comment on column H_BIZ_PERM_PROPERTY.ENCRYPTVISIBLE is '是否可见加密';

UPDATE H_BIZ_PERM_PROPERTY SET ENCRYPTVISIBLE = 0 WHERE ID != '';