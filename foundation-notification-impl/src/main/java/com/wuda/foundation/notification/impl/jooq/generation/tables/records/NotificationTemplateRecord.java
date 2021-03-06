/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables.records;


import com.wuda.foundation.notification.impl.jooq.generation.tables.NotificationTemplate;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * 通知内容的模板
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationTemplateRecord extends UpdatableRecordImpl<NotificationTemplateRecord> implements Record9<ULong, String, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -1136403805;

    /**
     * Setter for <code>foundation_notification.notification_template.notification_template_id</code>.
     */
    public void setNotificationTemplateId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.notification_template_id</code>.
     */
    public ULong getNotificationTemplateId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_notification.notification_template.name</code>. 模板名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.name</code>. 模板名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>foundation_notification.notification_template.content</code>. 模板的内容
     */
    public void setContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.content</code>. 模板的内容
     */
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_notification.notification_template.description</code>. 对该模板的描述
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.description</code>. 对该模板的描述
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>foundation_notification.notification_template.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>foundation_notification.notification_template.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>foundation_notification.notification_template.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>foundation_notification.notification_template.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>foundation_notification.notification_template.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_template.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, String, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<ULong, String, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.NOTIFICATION_TEMPLATE_ID;
    }

    @Override
    public Field<String> field2() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.NAME;
    }

    @Override
    public Field<String> field3() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.CONTENT;
    }

    @Override
    public Field<String> field4() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.DESCRIPTION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.CREATE_TIME;
    }

    @Override
    public Field<ULong> field6() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field9() {
        return NotificationTemplate.NOTIFICATION_TEMPLATE.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getNotificationTemplateId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getContent();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public ULong component6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component7() {
        return getLastModifyTime();
    }

    @Override
    public ULong component8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component9() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getNotificationTemplateId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getContent();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public ULong value6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value7() {
        return getLastModifyTime();
    }

    @Override
    public ULong value8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value9() {
        return getIsDeleted();
    }

    @Override
    public NotificationTemplateRecord value1(ULong value) {
        setNotificationTemplateId(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord value3(String value) {
        setContent(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord value6(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord value7(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord value8(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord value9(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public NotificationTemplateRecord values(ULong value1, String value2, String value3, String value4, LocalDateTime value5, ULong value6, LocalDateTime value7, ULong value8, ULong value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NotificationTemplateRecord
     */
    public NotificationTemplateRecord() {
        super(NotificationTemplate.NOTIFICATION_TEMPLATE);
    }

    /**
     * Create a detached, initialised NotificationTemplateRecord
     */
    public NotificationTemplateRecord(ULong notificationTemplateId, String name, String content, String description, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(NotificationTemplate.NOTIFICATION_TEMPLATE);

        set(0, notificationTemplateId);
        set(1, name);
        set(2, content);
        set(3, description);
        set(4, createTime);
        set(5, createUserId);
        set(6, lastModifyTime);
        set(7, lastModifyUserId);
        set(8, isDeleted);
    }
}
