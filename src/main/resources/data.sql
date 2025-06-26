INSERT INTO tbl_role (role_id, role_nm, role_desc, ad_group, approver_soeid, approver_fname, approver_lname, approver_group, resource_id) VALUES
  (1, 'Admin', 'Administrator Role', 'AD_ADMIN', 'SOEID1', 'John', 'Doe', 'GroupA', 'RES1'),
  (2, 'User', 'User Role', 'AD_USER', 'SOEID2', 'Jane', 'Smith', 'GroupB', 'RES2');

INSERT INTO tbl_channel (channel_id, channel_nm, ad_group) VALUES
  (1, 'Email', 'AD_EMAIL'),
  (2, 'SMS', 'AD_SMS');

INSERT INTO tbl_audit_level (audit_level_id, audit_level_nm, ad_group, approver_soeid, approver_fname, approver_lname, approver_group, resource_id) VALUES
  (1, 'Level 1', 'AD_AUDIT1', 'SOEID3', 'Alice', 'Brown', 'GroupC', 'RES3'),
  (2, 'Level 2', 'AD_AUDIT2', 'SOEID4', 'Bob', 'White', 'GroupD', 'RES4');

INSERT INTO tbl_permission_category (permission_category_id, permission_category_name) VALUES
  (1, 'CategoryA'),
  (2, 'CategoryB');

INSERT INTO tbl_permission (id, permission_category_id, permission_id, permission_nm, ad_group) VALUES
  (1, 1, 'PERM1', 'Permission 1', 'AD_PERM1'),
  (2, 1, 'PERM2', 'Permission 2', 'AD_PERM2'),
  (3, 2, 'PERM3', 'Permission 3', 'AD_PERM3');

INSERT INTO tbl_role_permission (id, role_id, permission_id, default_flag) VALUES
  (1, 1, 'PERM1', 'Y'),
  (2, 1, 'PERM2', 'N'),
  (3, 2, 'PERM3', 'Y'); 