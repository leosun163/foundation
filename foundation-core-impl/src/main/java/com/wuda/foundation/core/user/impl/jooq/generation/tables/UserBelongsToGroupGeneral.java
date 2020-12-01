/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.user.impl.jooq.generation.tables;


import com.wuda.foundation.core.user.impl.jooq.generation.FoundationUser;
import com.wuda.foundation.core.user.impl.jooq.generation.Indexes;
import com.wuda.foundation.core.user.impl.jooq.generation.Keys;
import com.wuda.foundation.core.user.impl.jooq.generation.tables.records.UserBelongsToGroupGeneralRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 用户在所属的组中的基本信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserBelongsToGroupGeneral extends TableImpl<UserBelongsToGroupGeneralRecord> {

    private static final long serialVersionUID = -436420351;

    /**
     * The reference instance of <code>foundation_user.user_belongs_to_group_general</code>
     */
    public static final UserBelongsToGroupGeneral USER_BELONGS_TO_GROUP_GENERAL = new UserBelongsToGroupGeneral();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserBelongsToGroupGeneralRecord> getRecordType() {
        return UserBelongsToGroupGeneralRecord.class;
    }

    /**
     * The column <code>foundation_user.user_belongs_to_group_general.user_belongs_to_group_general_id</code>.
     */
    public final TableField<UserBelongsToGroupGeneralRecord, ULong> USER_BELONGS_TO_GROUP_GENERAL_ID = createField(DSL.name("user_belongs_to_group_general_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_general.user_belongs_to_group_id</code>.
     */
    public final TableField<UserBelongsToGroupGeneralRecord, ULong> USER_BELONGS_TO_GROUP_ID = createField(DSL.name("user_belongs_to_group_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_general.nickname</code>. 用户在组里面的昵称
     */
    public final TableField<UserBelongsToGroupGeneralRecord, String> NICKNAME = createField(DSL.name("nickname"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "用户在组里面的昵称");

    /**
     * The column <code>foundation_user.user_belongs_to_group_general.create_time</code>.
     */
    public final TableField<UserBelongsToGroupGeneralRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_general.create_user_id</code>.
     */
    public final TableField<UserBelongsToGroupGeneralRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_general.last_modify_time</code>.
     */
    public final TableField<UserBelongsToGroupGeneralRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_general.last_modify_user_id</code>.
     */
    public final TableField<UserBelongsToGroupGeneralRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_belongs_to_group_general.is_deleted</code>.
     */
    public final TableField<UserBelongsToGroupGeneralRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_user.user_belongs_to_group_general</code> table reference
     */
    public UserBelongsToGroupGeneral() {
        this(DSL.name("user_belongs_to_group_general"), null);
    }

    /**
     * Create an aliased <code>foundation_user.user_belongs_to_group_general</code> table reference
     */
    public UserBelongsToGroupGeneral(String alias) {
        this(DSL.name(alias), USER_BELONGS_TO_GROUP_GENERAL);
    }

    /**
     * Create an aliased <code>foundation_user.user_belongs_to_group_general</code> table reference
     */
    public UserBelongsToGroupGeneral(Name alias) {
        this(alias, USER_BELONGS_TO_GROUP_GENERAL);
    }

    private UserBelongsToGroupGeneral(Name alias, Table<UserBelongsToGroupGeneralRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserBelongsToGroupGeneral(Name alias, Table<UserBelongsToGroupGeneralRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户在所属的组中的基本信息"), TableOptions.table());
    }

    public <O extends Record> UserBelongsToGroupGeneral(Table<O> child, ForeignKey<O, UserBelongsToGroupGeneralRecord> key) {
        super(child, key, USER_BELONGS_TO_GROUP_GENERAL);
    }

    @Override
    public Schema getSchema() {
        return FoundationUser.FOUNDATION_USER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_BELONGS_TO_GROUP_GENERAL_IDX_USER_BELONGS_TO_GROUP_ID);
    }

    @Override
    public Identity<UserBelongsToGroupGeneralRecord, ULong> getIdentity() {
        return Keys.IDENTITY_USER_BELONGS_TO_GROUP_GENERAL;
    }

    @Override
    public UniqueKey<UserBelongsToGroupGeneralRecord> getPrimaryKey() {
        return Keys.KEY_USER_BELONGS_TO_GROUP_GENERAL_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserBelongsToGroupGeneralRecord>> getKeys() {
        return Arrays.<UniqueKey<UserBelongsToGroupGeneralRecord>>asList(Keys.KEY_USER_BELONGS_TO_GROUP_GENERAL_PRIMARY);
    }

    @Override
    public UserBelongsToGroupGeneral as(String alias) {
        return new UserBelongsToGroupGeneral(DSL.name(alias), this);
    }

    @Override
    public UserBelongsToGroupGeneral as(Name alias) {
        return new UserBelongsToGroupGeneral(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserBelongsToGroupGeneral rename(String name) {
        return new UserBelongsToGroupGeneral(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserBelongsToGroupGeneral rename(Name name) {
        return new UserBelongsToGroupGeneral(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
