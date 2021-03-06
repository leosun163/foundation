/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.user.tables;


import com.wuda.foundation.jooq.code.generation.user.FoundationUser;
import com.wuda.foundation.jooq.code.generation.user.Indexes;
import com.wuda.foundation.jooq.code.generation.user.Keys;
import com.wuda.foundation.jooq.code.generation.user.tables.records.UserBelongsToGroupCoreRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import org.jooq.types.UShort;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 用户所属的组
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserBelongsToGroupCore extends TableImpl<UserBelongsToGroupCoreRecord> {

    private static final long serialVersionUID = -1621465025;

    /**
     * The reference instance of <code>foundation_user.user_belongs_to_group_core</code>
     */
    public static final UserBelongsToGroupCore USER_BELONGS_TO_GROUP_CORE = new UserBelongsToGroupCore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserBelongsToGroupCoreRecord> getRecordType() {
        return UserBelongsToGroupCoreRecord.class;
    }

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.user_belongs_to_group_core_id</code>.
     */
    public final TableField<UserBelongsToGroupCoreRecord, ULong> USER_BELONGS_TO_GROUP_CORE_ID = createField(DSL.name("user_belongs_to_group_core_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.user_belongs_to_group_id</code>.
     */
    public final TableField<UserBelongsToGroupCoreRecord, ULong> USER_BELONGS_TO_GROUP_ID = createField(DSL.name("user_belongs_to_group_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.user_id</code>. 用户ID
     */
    public final TableField<UserBelongsToGroupCoreRecord, ULong> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "用户ID");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.group_type</code>. 组的类型，比如部门是一种组，其他组织机构也是一种组
     */
    public final TableField<UserBelongsToGroupCoreRecord, UShort> GROUP_TYPE = createField(DSL.name("group_type"), org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "组的类型，比如部门是一种组，其他组织机构也是一种组");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.group_identifier</code>. 组的唯一标记，如果组的类型是部门，则该值应该是部门表的ID
     */
    public final TableField<UserBelongsToGroupCoreRecord, ULong> GROUP_IDENTIFIER = createField(DSL.name("group_identifier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "组的唯一标记，如果组的类型是部门，则该值应该是部门表的ID");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.create_time</code>.
     */
    public final TableField<UserBelongsToGroupCoreRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.create_user_id</code>.
     */
    public final TableField<UserBelongsToGroupCoreRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.last_modify_time</code>.
     */
    public final TableField<UserBelongsToGroupCoreRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.last_modify_user_id</code>.
     */
    public final TableField<UserBelongsToGroupCoreRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_core.is_deleted</code>.
     */
    public final TableField<UserBelongsToGroupCoreRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_user.user_belongs_to_group_core</code> table reference
     */
    public UserBelongsToGroupCore() {
        this(DSL.name("user_belongs_to_group_core"), null);
    }

    /**
     * Create an aliased <code>foundation_user.user_belongs_to_group_core</code> table reference
     */
    public UserBelongsToGroupCore(String alias) {
        this(DSL.name(alias), USER_BELONGS_TO_GROUP_CORE);
    }

    /**
     * Create an aliased <code>foundation_user.user_belongs_to_group_core</code> table reference
     */
    public UserBelongsToGroupCore(Name alias) {
        this(alias, USER_BELONGS_TO_GROUP_CORE);
    }

    private UserBelongsToGroupCore(Name alias, Table<UserBelongsToGroupCoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserBelongsToGroupCore(Name alias, Table<UserBelongsToGroupCoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户所属的组"), TableOptions.table());
    }

    public <O extends Record> UserBelongsToGroupCore(Table<O> child, ForeignKey<O, UserBelongsToGroupCoreRecord> key) {
        super(child, key, USER_BELONGS_TO_GROUP_CORE);
    }

    @Override
    public Schema getSchema() {
        return FoundationUser.FOUNDATION_USER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_BELONGS_TO_GROUP_CORE_IDX_GROUP_IDENTIFIER, Indexes.USER_BELONGS_TO_GROUP_CORE_IDX_USER_BELONGS_TO_GROUP_ID, Indexes.USER_BELONGS_TO_GROUP_CORE_IDX_USER_ID);
    }

    @Override
    public Identity<UserBelongsToGroupCoreRecord, ULong> getIdentity() {
        return Keys.IDENTITY_USER_BELONGS_TO_GROUP_CORE;
    }

    @Override
    public UniqueKey<UserBelongsToGroupCoreRecord> getPrimaryKey() {
        return Keys.KEY_USER_BELONGS_TO_GROUP_CORE_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserBelongsToGroupCoreRecord>> getKeys() {
        return Arrays.<UniqueKey<UserBelongsToGroupCoreRecord>>asList(Keys.KEY_USER_BELONGS_TO_GROUP_CORE_PRIMARY);
    }

    @Override
    public UserBelongsToGroupCore as(String alias) {
        return new UserBelongsToGroupCore(DSL.name(alias), this);
    }

    @Override
    public UserBelongsToGroupCore as(Name alias) {
        return new UserBelongsToGroupCore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserBelongsToGroupCore rename(String name) {
        return new UserBelongsToGroupCore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserBelongsToGroupCore rename(Name name) {
        return new UserBelongsToGroupCore(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, ULong, ULong, UShort, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
