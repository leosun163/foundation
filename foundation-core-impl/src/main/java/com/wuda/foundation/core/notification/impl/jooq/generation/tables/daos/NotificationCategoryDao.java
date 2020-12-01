/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.notification.impl.jooq.generation.tables.daos;


import com.wuda.foundation.core.notification.impl.jooq.generation.tables.NotificationCategory;
import com.wuda.foundation.core.notification.impl.jooq.generation.tables.records.NotificationCategoryRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.List;


/**
 * 分类
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationCategoryDao extends DAOImpl<NotificationCategoryRecord, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory, ULong> {

    /**
     * Create a new NotificationCategoryDao without any configuration
     */
    public NotificationCategoryDao() {
        super(NotificationCategory.NOTIFICATION_CATEGORY, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory.class);
    }

    /**
     * Create a new NotificationCategoryDao with an attached configuration
     */
    public NotificationCategoryDao(Configuration configuration) {
        super(NotificationCategory.NOTIFICATION_CATEGORY, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory object) {
        return object.getNotificationCategoryId();
    }

    /**
     * Fetch records that have <code>notification_category_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfNotificationCategoryId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.NOTIFICATION_CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_category_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByNotificationCategoryId(ULong... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.NOTIFICATION_CATEGORY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>notification_category_id = value</code>
     */
    public com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory fetchOneByNotificationCategoryId(ULong value) {
        return fetchOne(NotificationCategory.NOTIFICATION_CATEGORY.NOTIFICATION_CATEGORY_ID, value);
    }

    /**
     * Fetch records that have <code>parent_notification_category_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfParentNotificationCategoryId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.PARENT_NOTIFICATION_CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>parent_notification_category_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByParentNotificationCategoryId(ULong... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.PARENT_NOTIFICATION_CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>root_notification_category_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfRootNotificationCategoryId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.ROOT_NOTIFICATION_CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>root_notification_category_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByRootNotificationCategoryId(ULong... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.ROOT_NOTIFICATION_CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>depth BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfDepth(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.DEPTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>depth IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByDepth(UByte... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.DEPTH, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByName(String... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByDescription(String... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByCreateTime(LocalDateTime... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByCreateUserId(ULong... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByLastModifyUserId(ULong... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationCategory.NOTIFICATION_CATEGORY.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationCategory> fetchByIsDeleted(ULong... values) {
        return fetch(NotificationCategory.NOTIFICATION_CATEGORY.IS_DELETED, values);
    }
}
