/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables;


import com.wuda.foundation.notification.impl.jooq.generation.FoundationNotification;
import com.wuda.foundation.notification.impl.jooq.generation.Indexes;
import com.wuda.foundation.notification.impl.jooq.generation.Keys;
import com.wuda.foundation.notification.impl.jooq.generation.tables.records.NotificationDefinitionSendMethodRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
import org.jooq.types.ULong;


/**
 * 定义通知发表的方式，比如通过邮件，公告发表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationDefinitionSendMethod extends TableImpl<NotificationDefinitionSendMethodRecord> {

    private static final long serialVersionUID = 1143409683;

    /**
     * The reference instance of <code>foundation_notification.notification_definition_send_method</code>
     */
    public static final NotificationDefinitionSendMethod NOTIFICATION_DEFINITION_SEND_METHOD = new NotificationDefinitionSendMethod();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationDefinitionSendMethodRecord> getRecordType() {
        return NotificationDefinitionSendMethodRecord.class;
    }

    /**
     * The column <code>foundation_notification.notification_definition_send_method.notification_definition_send_method_id</code>.
     */
    public final TableField<NotificationDefinitionSendMethodRecord, ULong> NOTIFICATION_DEFINITION_SEND_METHOD_ID = createField(DSL.name("notification_definition_send_method_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_send_method.notification_definition_id</code>.
     */
    public final TableField<NotificationDefinitionSendMethodRecord, ULong> NOTIFICATION_DEFINITION_ID = createField(DSL.name("notification_definition_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_send_method.notification_send_method_id</code>. 使用的发送方式，一个定义可以有多种发送方式。
     */
    public final TableField<NotificationDefinitionSendMethodRecord, ULong> NOTIFICATION_SEND_METHOD_ID = createField(DSL.name("notification_send_method_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "使用的发送方式，一个定义可以有多种发送方式。");

    /**
     * The column <code>foundation_notification.notification_definition_send_method.notification_template_id</code>. 声明使用的模板
     */
    public final TableField<NotificationDefinitionSendMethodRecord, ULong> NOTIFICATION_TEMPLATE_ID = createField(DSL.name("notification_template_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "声明使用的模板");

    /**
     * The column <code>foundation_notification.notification_definition_send_method.create_time</code>.
     */
    public final TableField<NotificationDefinitionSendMethodRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_send_method.create_user_id</code>.
     */
    public final TableField<NotificationDefinitionSendMethodRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_send_method.last_modify_time</code>.
     */
    public final TableField<NotificationDefinitionSendMethodRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_send_method.last_modify_user_id</code>.
     */
    public final TableField<NotificationDefinitionSendMethodRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_send_method.is_deleted</code>.
     */
    public final TableField<NotificationDefinitionSendMethodRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_notification.notification_definition_send_method</code> table reference
     */
    public NotificationDefinitionSendMethod() {
        this(DSL.name("notification_definition_send_method"), null);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_definition_send_method</code> table reference
     */
    public NotificationDefinitionSendMethod(String alias) {
        this(DSL.name(alias), NOTIFICATION_DEFINITION_SEND_METHOD);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_definition_send_method</code> table reference
     */
    public NotificationDefinitionSendMethod(Name alias) {
        this(alias, NOTIFICATION_DEFINITION_SEND_METHOD);
    }

    private NotificationDefinitionSendMethod(Name alias, Table<NotificationDefinitionSendMethodRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationDefinitionSendMethod(Name alias, Table<NotificationDefinitionSendMethodRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("定义通知发表的方式，比如通过邮件，公告发表"), TableOptions.table());
    }

    public <O extends Record> NotificationDefinitionSendMethod(Table<O> child, ForeignKey<O, NotificationDefinitionSendMethodRecord> key) {
        super(child, key, NOTIFICATION_DEFINITION_SEND_METHOD);
    }

    @Override
    public Schema getSchema() {
        return FoundationNotification.FOUNDATION_NOTIFICATION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NOTIFICATION_DEFINITION_SEND_METHOD_IDX_NOTIFICATION_DEFINITION_ID, Indexes.NOTIFICATION_DEFINITION_SEND_METHOD_IDX_NOTIFICATION_TEMPLATE_ID, Indexes.NOTIFICATION_DEFINITION_SEND_METHOD_IDX_SEND_METHOD_ID);
    }

    @Override
    public Identity<NotificationDefinitionSendMethodRecord, ULong> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_DEFINITION_SEND_METHOD;
    }

    @Override
    public UniqueKey<NotificationDefinitionSendMethodRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_DEFINITION_SEND_METHOD_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationDefinitionSendMethodRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationDefinitionSendMethodRecord>>asList(Keys.KEY_NOTIFICATION_DEFINITION_SEND_METHOD_PRIMARY);
    }

    @Override
    public NotificationDefinitionSendMethod as(String alias) {
        return new NotificationDefinitionSendMethod(DSL.name(alias), this);
    }

    @Override
    public NotificationDefinitionSendMethod as(Name alias) {
        return new NotificationDefinitionSendMethod(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationDefinitionSendMethod rename(String name) {
        return new NotificationDefinitionSendMethod(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationDefinitionSendMethod rename(Name name) {
        return new NotificationDefinitionSendMethod(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, ULong, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
