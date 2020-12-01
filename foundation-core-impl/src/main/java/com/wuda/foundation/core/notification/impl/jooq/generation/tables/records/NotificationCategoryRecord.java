/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.notification.impl.jooq.generation.tables.records;


import com.wuda.foundation.core.notification.impl.jooq.generation.tables.NotificationCategory;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;


/**
 * 分类
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationCategoryRecord extends UpdatableRecordImpl<NotificationCategoryRecord> implements Record11<ULong, ULong, ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 1237490325;

    /**
     * Setter for <code>foundation_notification.notification_category.notification_category_id</code>. 与group_id相等，因为分类是一个组
     */
    public void setNotificationCategoryId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.notification_category_id</code>. 与group_id相等，因为分类是一个组
     */
    public ULong getNotificationCategoryId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.parent_notification_category_id</code>. 父级，一定和组的parent_group_id相等。
     */
    public void setParentNotificationCategoryId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.parent_notification_category_id</code>. 父级，一定和组的parent_group_id相等。
     */
    public ULong getParentNotificationCategoryId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.root_notification_category_id</code>.
     */
    public void setRootNotificationCategoryId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.root_notification_category_id</code>.
     */
    public ULong getRootNotificationCategoryId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.depth</code>.
     */
    public void setDepth(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.depth</code>.
     */
    public UByte getDepth() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.name</code>. 名称
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.name</code>. 名称
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.description</code>. 节点的描述
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.description</code>. 节点的描述
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.create_time</code>. 描述
     */
    public void setCreateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.create_time</code>. 描述
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>foundation_notification.notification_category.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>foundation_notification.notification_category.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<ULong, ULong, ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<ULong, ULong, ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return NotificationCategory.NOTIFICATION_CATEGORY.NOTIFICATION_CATEGORY_ID;
    }

    @Override
    public Field<ULong> field2() {
        return NotificationCategory.NOTIFICATION_CATEGORY.PARENT_NOTIFICATION_CATEGORY_ID;
    }

    @Override
    public Field<ULong> field3() {
        return NotificationCategory.NOTIFICATION_CATEGORY.ROOT_NOTIFICATION_CATEGORY_ID;
    }

    @Override
    public Field<UByte> field4() {
        return NotificationCategory.NOTIFICATION_CATEGORY.DEPTH;
    }

    @Override
    public Field<String> field5() {
        return NotificationCategory.NOTIFICATION_CATEGORY.NAME;
    }

    @Override
    public Field<String> field6() {
        return NotificationCategory.NOTIFICATION_CATEGORY.DESCRIPTION;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return NotificationCategory.NOTIFICATION_CATEGORY.CREATE_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return NotificationCategory.NOTIFICATION_CATEGORY.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return NotificationCategory.NOTIFICATION_CATEGORY.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field10() {
        return NotificationCategory.NOTIFICATION_CATEGORY.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field11() {
        return NotificationCategory.NOTIFICATION_CATEGORY.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getNotificationCategoryId();
    }

    @Override
    public ULong component2() {
        return getParentNotificationCategoryId();
    }

    @Override
    public ULong component3() {
        return getRootNotificationCategoryId();
    }

    @Override
    public UByte component4() {
        return getDepth();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public String component6() {
        return getDescription();
    }

    @Override
    public LocalDateTime component7() {
        return getCreateTime();
    }

    @Override
    public ULong component8() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component9() {
        return getLastModifyTime();
    }

    @Override
    public ULong component10() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component11() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getNotificationCategoryId();
    }

    @Override
    public ULong value2() {
        return getParentNotificationCategoryId();
    }

    @Override
    public ULong value3() {
        return getRootNotificationCategoryId();
    }

    @Override
    public UByte value4() {
        return getDepth();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public String value6() {
        return getDescription();
    }

    @Override
    public LocalDateTime value7() {
        return getCreateTime();
    }

    @Override
    public ULong value8() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value9() {
        return getLastModifyTime();
    }

    @Override
    public ULong value10() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value11() {
        return getIsDeleted();
    }

    @Override
    public NotificationCategoryRecord value1(ULong value) {
        setNotificationCategoryId(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value2(ULong value) {
        setParentNotificationCategoryId(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value3(ULong value) {
        setRootNotificationCategoryId(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value4(UByte value) {
        setDepth(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value6(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value8(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value9(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value10(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord value11(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public NotificationCategoryRecord values(ULong value1, ULong value2, ULong value3, UByte value4, String value5, String value6, LocalDateTime value7, ULong value8, LocalDateTime value9, ULong value10, ULong value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NotificationCategoryRecord
     */
    public NotificationCategoryRecord() {
        super(NotificationCategory.NOTIFICATION_CATEGORY);
    }

    /**
     * Create a detached, initialised NotificationCategoryRecord
     */
    public NotificationCategoryRecord(ULong notificationCategoryId, ULong parentNotificationCategoryId, ULong rootNotificationCategoryId, UByte depth, String name, String description, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(NotificationCategory.NOTIFICATION_CATEGORY);

        set(0, notificationCategoryId);
        set(1, parentNotificationCategoryId);
        set(2, rootNotificationCategoryId);
        set(3, depth);
        set(4, name);
        set(5, description);
        set(6, createTime);
        set(7, createUserId);
        set(8, lastModifyTime);
        set(9, lastModifyUserId);
        set(10, isDeleted);
    }
}
