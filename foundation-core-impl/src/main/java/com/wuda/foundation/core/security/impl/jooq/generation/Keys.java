/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.security.impl.jooq.generation;


import com.wuda.foundation.core.security.impl.jooq.generation.tables.PermissionAction;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.PermissionAssignment;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.PermissionCategory;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.PermissionRole;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.PermissionTarget;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.records.PermissionActionRecord;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.records.PermissionAssignmentRecord;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.records.PermissionCategoryRecord;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.records.PermissionRoleRecord;
import com.wuda.foundation.core.security.impl.jooq.generation.tables.records.PermissionTargetRecord;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.ULong;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>foundation_security</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PermissionActionRecord, ULong> IDENTITY_PERMISSION_ACTION = Identities0.IDENTITY_PERMISSION_ACTION;
    public static final Identity<PermissionAssignmentRecord, ULong> IDENTITY_PERMISSION_ASSIGNMENT = Identities0.IDENTITY_PERMISSION_ASSIGNMENT;
    public static final Identity<PermissionRoleRecord, ULong> IDENTITY_PERMISSION_ROLE = Identities0.IDENTITY_PERMISSION_ROLE;
    public static final Identity<PermissionTargetRecord, ULong> IDENTITY_PERMISSION_TARGET = Identities0.IDENTITY_PERMISSION_TARGET;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PermissionActionRecord> KEY_PERMISSION_ACTION_PRIMARY = UniqueKeys0.KEY_PERMISSION_ACTION_PRIMARY;
    public static final UniqueKey<PermissionActionRecord> KEY_PERMISSION_ACTION_IDX_PERMISSION_ACTION = UniqueKeys0.KEY_PERMISSION_ACTION_IDX_PERMISSION_ACTION;
    public static final UniqueKey<PermissionAssignmentRecord> KEY_PERMISSION_ASSIGNMENT_PRIMARY = UniqueKeys0.KEY_PERMISSION_ASSIGNMENT_PRIMARY;
    public static final UniqueKey<PermissionCategoryRecord> KEY_PERMISSION_CATEGORY_PRIMARY = UniqueKeys0.KEY_PERMISSION_CATEGORY_PRIMARY;
    public static final UniqueKey<PermissionRoleRecord> KEY_PERMISSION_ROLE_PRIMARY = UniqueKeys0.KEY_PERMISSION_ROLE_PRIMARY;
    public static final UniqueKey<PermissionTargetRecord> KEY_PERMISSION_TARGET_PRIMARY = UniqueKeys0.KEY_PERMISSION_TARGET_PRIMARY;
    public static final UniqueKey<PermissionTargetRecord> KEY_PERMISSION_TARGET_IDX_PERMISSION_NAME = UniqueKeys0.KEY_PERMISSION_TARGET_IDX_PERMISSION_NAME;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<PermissionActionRecord, ULong> IDENTITY_PERMISSION_ACTION = Internal.createIdentity(PermissionAction.PERMISSION_ACTION, PermissionAction.PERMISSION_ACTION.PERMISSION_ACTION_ID);
        public static Identity<PermissionAssignmentRecord, ULong> IDENTITY_PERMISSION_ASSIGNMENT = Internal.createIdentity(PermissionAssignment.PERMISSION_ASSIGNMENT, PermissionAssignment.PERMISSION_ASSIGNMENT.ID);
        public static Identity<PermissionRoleRecord, ULong> IDENTITY_PERMISSION_ROLE = Internal.createIdentity(PermissionRole.PERMISSION_ROLE, PermissionRole.PERMISSION_ROLE.PERMISSION_ROLE_ID);
        public static Identity<PermissionTargetRecord, ULong> IDENTITY_PERMISSION_TARGET = Internal.createIdentity(PermissionTarget.PERMISSION_TARGET, PermissionTarget.PERMISSION_TARGET.PERMISSION_TARGET_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<PermissionActionRecord> KEY_PERMISSION_ACTION_PRIMARY = Internal.createUniqueKey(PermissionAction.PERMISSION_ACTION, "KEY_permission_action_PRIMARY", new TableField[] { PermissionAction.PERMISSION_ACTION.PERMISSION_ACTION_ID }, true);
        public static final UniqueKey<PermissionActionRecord> KEY_PERMISSION_ACTION_IDX_PERMISSION_ACTION = Internal.createUniqueKey(PermissionAction.PERMISSION_ACTION, "KEY_permission_action_idx_permission_action", new TableField[] { PermissionAction.PERMISSION_ACTION.PERMISSION_TARGET_ID, PermissionAction.PERMISSION_ACTION.NAME, PermissionAction.PERMISSION_ACTION.IS_DELETED }, true);
        public static final UniqueKey<PermissionAssignmentRecord> KEY_PERMISSION_ASSIGNMENT_PRIMARY = Internal.createUniqueKey(PermissionAssignment.PERMISSION_ASSIGNMENT, "KEY_permission_assignment_PRIMARY", new TableField[] { PermissionAssignment.PERMISSION_ASSIGNMENT.ID }, true);
        public static final UniqueKey<PermissionCategoryRecord> KEY_PERMISSION_CATEGORY_PRIMARY = Internal.createUniqueKey(PermissionCategory.PERMISSION_CATEGORY, "KEY_permission_category_PRIMARY", new TableField[] { PermissionCategory.PERMISSION_CATEGORY.PERMISSION_CATEGORY_ID }, true);
        public static final UniqueKey<PermissionRoleRecord> KEY_PERMISSION_ROLE_PRIMARY = Internal.createUniqueKey(PermissionRole.PERMISSION_ROLE, "KEY_permission_role_PRIMARY", new TableField[] { PermissionRole.PERMISSION_ROLE.PERMISSION_ROLE_ID }, true);
        public static final UniqueKey<PermissionTargetRecord> KEY_PERMISSION_TARGET_PRIMARY = Internal.createUniqueKey(PermissionTarget.PERMISSION_TARGET, "KEY_permission_target_PRIMARY", new TableField[] { PermissionTarget.PERMISSION_TARGET.PERMISSION_TARGET_ID }, true);
        public static final UniqueKey<PermissionTargetRecord> KEY_PERMISSION_TARGET_IDX_PERMISSION_NAME = Internal.createUniqueKey(PermissionTarget.PERMISSION_TARGET, "KEY_permission_target_idx_permission_name", new TableField[] { PermissionTarget.PERMISSION_TARGET.PERMISSION_CATEGORY_ID, PermissionTarget.PERMISSION_TARGET.NAME, PermissionTarget.PERMISSION_TARGET.IS_DELETED }, true);
    }
}
