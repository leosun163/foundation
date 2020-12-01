/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.store.impl.jooq.generation.tables;


import com.wuda.foundation.core.store.impl.jooq.generation.FoundationStore;
import com.wuda.foundation.core.store.impl.jooq.generation.Indexes;
import com.wuda.foundation.core.store.impl.jooq.generation.Keys;
import com.wuda.foundation.core.store.impl.jooq.generation.tables.records.StoreCoreRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 店铺信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreCore extends TableImpl<StoreCoreRecord> {

    private static final long serialVersionUID = 223724045;

    /**
     * The reference instance of <code>foundation_store.store_core</code>
     */
    public static final StoreCore STORE_CORE = new StoreCore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreCoreRecord> getRecordType() {
        return StoreCoreRecord.class;
    }

    /**
     * The column <code>foundation_store.store_core.store_core_id</code>.
     */
    public final TableField<StoreCoreRecord, ULong> STORE_CORE_ID = createField(DSL.name("store_core_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_store.store_core.store_id</code>. store id。一定和【group_core.group_id】相等，因为【store is a group】。
     */
    public final TableField<StoreCoreRecord, ULong> STORE_ID = createField(DSL.name("store_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "store id。一定和【group_core.group_id】相等，因为【store is a group】。");

    /**
     * The column <code>foundation_store.store_core.type</code>. 店铺类型
     */
    public final TableField<StoreCoreRecord, UByte> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "店铺类型");

    /**
     * The column <code>foundation_store.store_core.state</code>. 店铺状态
     */
    public final TableField<StoreCoreRecord, UByte> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "店铺状态");

    /**
     * The column <code>foundation_store.store_core.create_time</code>.
     */
    public final TableField<StoreCoreRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_store.store_core.create_user_id</code>.
     */
    public final TableField<StoreCoreRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_store.store_core.last_modify_time</code>.
     */
    public final TableField<StoreCoreRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_store.store_core.last_modify_user_id</code>.
     */
    public final TableField<StoreCoreRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_store.store_core.is_deleted</code>.
     */
    public final TableField<StoreCoreRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_store.store_core</code> table reference
     */
    public StoreCore() {
        this(DSL.name("store_core"), null);
    }

    /**
     * Create an aliased <code>foundation_store.store_core</code> table reference
     */
    public StoreCore(String alias) {
        this(DSL.name(alias), STORE_CORE);
    }

    /**
     * Create an aliased <code>foundation_store.store_core</code> table reference
     */
    public StoreCore(Name alias) {
        this(alias, STORE_CORE);
    }

    private StoreCore(Name alias, Table<StoreCoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private StoreCore(Name alias, Table<StoreCoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("店铺信息"), TableOptions.table());
    }

    public <O extends Record> StoreCore(Table<O> child, ForeignKey<O, StoreCoreRecord> key) {
        super(child, key, STORE_CORE);
    }

    @Override
    public Schema getSchema() {
        return FoundationStore.FOUNDATION_STORE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STORE_CORE_IDX_STORE_ID);
    }

    @Override
    public Identity<StoreCoreRecord, ULong> getIdentity() {
        return Keys.IDENTITY_STORE_CORE;
    }

    @Override
    public UniqueKey<StoreCoreRecord> getPrimaryKey() {
        return Keys.KEY_STORE_CORE_PRIMARY;
    }

    @Override
    public List<UniqueKey<StoreCoreRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreCoreRecord>>asList(Keys.KEY_STORE_CORE_PRIMARY);
    }

    @Override
    public StoreCore as(String alias) {
        return new StoreCore(DSL.name(alias), this);
    }

    @Override
    public StoreCore as(Name alias) {
        return new StoreCore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreCore rename(String name) {
        return new StoreCore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreCore rename(Name name) {
        return new StoreCore(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, UByte, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
