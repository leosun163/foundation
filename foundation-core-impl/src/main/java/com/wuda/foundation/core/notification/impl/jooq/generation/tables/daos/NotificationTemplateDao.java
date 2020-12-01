/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.notification.impl.jooq.generation.tables.daos;


import com.wuda.foundation.core.notification.impl.jooq.generation.tables.NotificationTemplate;
import com.wuda.foundation.core.notification.impl.jooq.generation.tables.records.NotificationTemplateRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.List;


/**
 * 通知内容的模板
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationTemplateDao extends DAOImpl<NotificationTemplateRecord, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate, ULong> {

    /**
     * Create a new NotificationTemplateDao without any configuration
     */
    public NotificationTemplateDao() {
        super(NotificationTemplate.NOTIFICATION_TEMPLATE, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate.class);
    }

    /**
     * Create a new NotificationTemplateDao with an attached configuration
     */
    public NotificationTemplateDao(Configuration configuration) {
        super(NotificationTemplate.NOTIFICATION_TEMPLATE, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate object) {
        return object.getNotificationTemplateId();
    }

    /**
     * Fetch records that have <code>notification_template_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfNotificationTemplateId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.NOTIFICATION_TEMPLATE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_template_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByNotificationTemplateId(ULong... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.NOTIFICATION_TEMPLATE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>notification_template_id = value</code>
     */
    public com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate fetchOneByNotificationTemplateId(ULong value) {
        return fetchOne(NotificationTemplate.NOTIFICATION_TEMPLATE.NOTIFICATION_TEMPLATE_ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByName(String... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.NAME, values);
    }

    /**
     * Fetch records that have <code>content BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfContent(String lowerInclusive, String upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.CONTENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByContent(String... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.CONTENT, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByDescription(String... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByCreateTime(LocalDateTime... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByCreateUserId(ULong... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByLastModifyUserId(ULong... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationTemplate.NOTIFICATION_TEMPLATE.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationTemplate> fetchByIsDeleted(ULong... values) {
        return fetch(NotificationTemplate.NOTIFICATION_TEMPLATE.IS_DELETED, values);
    }
}
