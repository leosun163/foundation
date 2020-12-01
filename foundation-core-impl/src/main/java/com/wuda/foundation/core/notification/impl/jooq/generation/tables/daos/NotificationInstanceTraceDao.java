/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.notification.impl.jooq.generation.tables.daos;


import com.wuda.foundation.core.notification.impl.jooq.generation.tables.NotificationInstanceTrace;
import com.wuda.foundation.core.notification.impl.jooq.generation.tables.records.NotificationInstanceTraceRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.List;


/**
 * 通知的追踪信息，比如是否被接收者阅读
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationInstanceTraceDao extends DAOImpl<NotificationInstanceTraceRecord, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace, ULong> {

    /**
     * Create a new NotificationInstanceTraceDao without any configuration
     */
    public NotificationInstanceTraceDao() {
        super(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace.class);
    }

    /**
     * Create a new NotificationInstanceTraceDao with an attached configuration
     */
    public NotificationInstanceTraceDao(Configuration configuration) {
        super(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace object) {
        return object.getNotificationInstanceTraceId();
    }

    /**
     * Fetch records that have <code>notification_instance_trace_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfNotificationInstanceTraceId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.NOTIFICATION_INSTANCE_TRACE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_instance_trace_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByNotificationInstanceTraceId(ULong... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.NOTIFICATION_INSTANCE_TRACE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>notification_instance_trace_id = value</code>
     */
    public com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace fetchOneByNotificationInstanceTraceId(ULong value) {
        return fetchOne(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.NOTIFICATION_INSTANCE_TRACE_ID, value);
    }

    /**
     * Fetch records that have <code>notification_instance_content_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfNotificationInstanceContentId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.NOTIFICATION_INSTANCE_CONTENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_instance_content_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByNotificationInstanceContentId(ULong... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.NOTIFICATION_INSTANCE_CONTENT_ID, values);
    }

    /**
     * Fetch records that have <code>observer_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfObserverType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.OBSERVER_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>observer_type IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByObserverType(UByte... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.OBSERVER_TYPE, values);
    }

    /**
     * Fetch records that have <code>observer_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfObserverIdentifier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.OBSERVER_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>observer_identifier IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByObserverIdentifier(ULong... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.OBSERVER_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>read BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfRead(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.READ, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>read IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByRead(Boolean... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.READ, values);
    }

    /**
     * Fetch records that have <code>read_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfReadTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.READ_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>read_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByReadTime(LocalDateTime... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.READ_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByCreateTime(LocalDateTime... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByCreateUserId(ULong... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfLastModifyUserId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByLastModifyUserId(Long... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationInstanceTrace> fetchByIsDeleted(ULong... values) {
        return fetch(NotificationInstanceTrace.NOTIFICATION_INSTANCE_TRACE.IS_DELETED, values);
    }
}
