/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.notification.impl.jooq.generation.tables;


import com.wuda.foundation.core.notification.impl.jooq.generation.FoundationNotification;
import com.wuda.foundation.core.notification.impl.jooq.generation.Indexes;
import com.wuda.foundation.core.notification.impl.jooq.generation.Keys;
import com.wuda.foundation.core.notification.impl.jooq.generation.tables.records.NotificationInstanceSendHistoryRecord;
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
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 通知发送历史
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationInstanceSendHistory extends TableImpl<NotificationInstanceSendHistoryRecord> {

    private static final long serialVersionUID = -1282146101;

    /**
     * The reference instance of <code>foundation_notification.notification_instance_send_history</code>
     */
    public static final NotificationInstanceSendHistory NOTIFICATION_INSTANCE_SEND_HISTORY = new NotificationInstanceSendHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationInstanceSendHistoryRecord> getRecordType() {
        return NotificationInstanceSendHistoryRecord.class;
    }

    /**
     * The column <code>foundation_notification.notification_instance_send_history.notification_instance_send_history_id</code>.
     */
    public final TableField<NotificationInstanceSendHistoryRecord, ULong> NOTIFICATION_INSTANCE_SEND_HISTORY_ID = createField(DSL.name("notification_instance_send_history_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_notification.notification_instance_send_history.notification_instance_content_id</code>. 如果同一个通知（内容一模一样）发送多次的，使用这个指针指向该通知，则会节省很多空间
     */
    public final TableField<NotificationInstanceSendHistoryRecord, ULong> NOTIFICATION_INSTANCE_CONTENT_ID = createField(DSL.name("notification_instance_content_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "如果同一个通知（内容一模一样）发送多次的，使用这个指针指向该通知，则会节省很多空间");

    /**
     * The column <code>foundation_notification.notification_instance_send_history.send_time</code>.
     */
    public final TableField<NotificationInstanceSendHistoryRecord, LocalDateTime> SEND_TIME = createField(DSL.name("send_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_instance_send_history.sender_type</code>. 发送者类型，不一定是某个人发送，比如是服务A发送给服务B。
     */
    public final TableField<NotificationInstanceSendHistoryRecord, UByte> SENDER_TYPE = createField(DSL.name("sender_type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "发送者类型，不一定是某个人发送，比如是服务A发送给服务B。");

    /**
     * The column <code>foundation_notification.notification_instance_send_history.sender_identifier</code>. 发送者唯一标记
     */
    public final TableField<NotificationInstanceSendHistoryRecord, ULong> SENDER_IDENTIFIER = createField(DSL.name("sender_identifier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "发送者唯一标记");

    /**
     * The column <code>foundation_notification.notification_instance_send_history.receiver_type</code>. 接收者类型，不一定发个人，也可以发给某个分组等
     */
    public final TableField<NotificationInstanceSendHistoryRecord, Byte> RECEIVER_TYPE = createField(DSL.name("receiver_type"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "接收者类型，不一定发个人，也可以发给某个分组等");

    /**
     * The column <code>foundation_notification.notification_instance_send_history.receiver_identifier</code>. 接收者唯一标记符
     */
    public final TableField<NotificationInstanceSendHistoryRecord, ULong> RECEIVER_IDENTIFIER = createField(DSL.name("receiver_identifier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "接收者唯一标记符");

    /**
     * The column <code>foundation_notification.notification_instance_send_history.is_deleted</code>.
     */
    public final TableField<NotificationInstanceSendHistoryRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_notification.notification_instance_send_history</code> table reference
     */
    public NotificationInstanceSendHistory() {
        this(DSL.name("notification_instance_send_history"), null);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_instance_send_history</code> table reference
     */
    public NotificationInstanceSendHistory(String alias) {
        this(DSL.name(alias), NOTIFICATION_INSTANCE_SEND_HISTORY);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_instance_send_history</code> table reference
     */
    public NotificationInstanceSendHistory(Name alias) {
        this(alias, NOTIFICATION_INSTANCE_SEND_HISTORY);
    }

    private NotificationInstanceSendHistory(Name alias, Table<NotificationInstanceSendHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationInstanceSendHistory(Name alias, Table<NotificationInstanceSendHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("通知发送历史"), TableOptions.table());
    }

    public <O extends Record> NotificationInstanceSendHistory(Table<O> child, ForeignKey<O, NotificationInstanceSendHistoryRecord> key) {
        super(child, key, NOTIFICATION_INSTANCE_SEND_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return FoundationNotification.FOUNDATION_NOTIFICATION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NOTIFICATION_INSTANCE_SEND_HISTORY_IDX_NOTIFICATION_ID, Indexes.NOTIFICATION_INSTANCE_SEND_HISTORY_IDX_RECEIVER);
    }

    @Override
    public Identity<NotificationInstanceSendHistoryRecord, ULong> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_INSTANCE_SEND_HISTORY;
    }

    @Override
    public UniqueKey<NotificationInstanceSendHistoryRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_INSTANCE_SEND_HISTORY_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationInstanceSendHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationInstanceSendHistoryRecord>>asList(Keys.KEY_NOTIFICATION_INSTANCE_SEND_HISTORY_PRIMARY);
    }

    @Override
    public NotificationInstanceSendHistory as(String alias) {
        return new NotificationInstanceSendHistory(DSL.name(alias), this);
    }

    @Override
    public NotificationInstanceSendHistory as(Name alias) {
        return new NotificationInstanceSendHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationInstanceSendHistory rename(String name) {
        return new NotificationInstanceSendHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationInstanceSendHistory rename(Name name) {
        return new NotificationInstanceSendHistory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, LocalDateTime, UByte, ULong, Byte, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
