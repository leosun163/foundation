/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables;


import com.wuda.foundation.commons.impl.jooq.generation.FoundationCommons;
import com.wuda.foundation.commons.impl.jooq.generation.Keys;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyValueRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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


/**
 * 属性的值
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyValue extends TableImpl<PropertyValueRecord> {

    private static final long serialVersionUID = 629332268;

    /**
     * The reference instance of <code>foundation_commons.property_value</code>
     */
    public static final PropertyValue PROPERTY_VALUE = new PropertyValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PropertyValueRecord> getRecordType() {
        return PropertyValueRecord.class;
    }

    /**
     * The column <code>foundation_commons.property_value.property_value_id</code>.
     */
    public final TableField<PropertyValueRecord, ULong> PROPERTY_VALUE_ID = createField(DSL.name("property_value_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_commons.property_value.property_key_id</code>. 所属的key
     */
    public final TableField<PropertyValueRecord, ULong> PROPERTY_KEY_ID = createField(DSL.name("property_key_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "所属的key");

    /**
     * The column <code>foundation_commons.property_value.value</code>. 属性值
     */
    public final TableField<PropertyValueRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "属性值");

    /**
     * The column <code>foundation_commons.property_value.create_time</code>.
     */
    public final TableField<PropertyValueRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.property_value.create_user_id</code>.
     */
    public final TableField<PropertyValueRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.property_value.last_modify_time</code>.
     */
    public final TableField<PropertyValueRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.property_value.last_modify_user_id</code>.
     */
    public final TableField<PropertyValueRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.property_value.is_deleted</code>.
     */
    public final TableField<PropertyValueRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_commons.property_value</code> table reference
     */
    public PropertyValue() {
        this(DSL.name("property_value"), null);
    }

    /**
     * Create an aliased <code>foundation_commons.property_value</code> table reference
     */
    public PropertyValue(String alias) {
        this(DSL.name(alias), PROPERTY_VALUE);
    }

    /**
     * Create an aliased <code>foundation_commons.property_value</code> table reference
     */
    public PropertyValue(Name alias) {
        this(alias, PROPERTY_VALUE);
    }

    private PropertyValue(Name alias, Table<PropertyValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private PropertyValue(Name alias, Table<PropertyValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("属性的值"), TableOptions.table());
    }

    public <O extends Record> PropertyValue(Table<O> child, ForeignKey<O, PropertyValueRecord> key) {
        super(child, key, PROPERTY_VALUE);
    }

    @Override
    public Schema getSchema() {
        return FoundationCommons.FOUNDATION_COMMONS;
    }

    @Override
    public Identity<PropertyValueRecord, ULong> getIdentity() {
        return Keys.IDENTITY_PROPERTY_VALUE;
    }

    @Override
    public UniqueKey<PropertyValueRecord> getPrimaryKey() {
        return Keys.KEY_PROPERTY_VALUE_PRIMARY;
    }

    @Override
    public List<UniqueKey<PropertyValueRecord>> getKeys() {
        return Arrays.<UniqueKey<PropertyValueRecord>>asList(Keys.KEY_PROPERTY_VALUE_PRIMARY, Keys.KEY_PROPERTY_VALUE_IDX_ATTR_VALUE);
    }

    @Override
    public PropertyValue as(String alias) {
        return new PropertyValue(DSL.name(alias), this);
    }

    @Override
    public PropertyValue as(Name alias) {
        return new PropertyValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PropertyValue rename(String name) {
        return new PropertyValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PropertyValue rename(Name name) {
        return new PropertyValue(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
