/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos;


import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 分类
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationCategory implements Serializable {

    private static final long serialVersionUID = 389869157;

    private ULong         notificationCategoryId;
    private ULong         parentNotificationCategoryId;
    private ULong         rootNotificationCategoryId;
    private UByte         depth;
    private String        name;
    private String        description;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public NotificationCategory() {}

    public NotificationCategory(NotificationCategory value) {
        this.notificationCategoryId = value.notificationCategoryId;
        this.parentNotificationCategoryId = value.parentNotificationCategoryId;
        this.rootNotificationCategoryId = value.rootNotificationCategoryId;
        this.depth = value.depth;
        this.name = value.name;
        this.description = value.description;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public NotificationCategory(
        ULong         notificationCategoryId,
        ULong         parentNotificationCategoryId,
        ULong         rootNotificationCategoryId,
        UByte         depth,
        String        name,
        String        description,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.notificationCategoryId = notificationCategoryId;
        this.parentNotificationCategoryId = parentNotificationCategoryId;
        this.rootNotificationCategoryId = rootNotificationCategoryId;
        this.depth = depth;
        this.name = name;
        this.description = description;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getNotificationCategoryId() {
        return this.notificationCategoryId;
    }

    public void setNotificationCategoryId(ULong notificationCategoryId) {
        this.notificationCategoryId = notificationCategoryId;
    }

    public ULong getParentNotificationCategoryId() {
        return this.parentNotificationCategoryId;
    }

    public void setParentNotificationCategoryId(ULong parentNotificationCategoryId) {
        this.parentNotificationCategoryId = parentNotificationCategoryId;
    }

    public ULong getRootNotificationCategoryId() {
        return this.rootNotificationCategoryId;
    }

    public void setRootNotificationCategoryId(ULong rootNotificationCategoryId) {
        this.rootNotificationCategoryId = rootNotificationCategoryId;
    }

    public UByte getDepth() {
        return this.depth;
    }

    public void setDepth(UByte depth) {
        this.depth = depth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public ULong getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(ULong createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ULong getLastModifyUserId() {
        return this.lastModifyUserId;
    }

    public void setLastModifyUserId(ULong lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NotificationCategory (");

        sb.append(notificationCategoryId);
        sb.append(", ").append(parentNotificationCategoryId);
        sb.append(", ").append(rootNotificationCategoryId);
        sb.append(", ").append(depth);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
