/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.notification.impl.jooq.generation.tables.daos;


import com.wuda.foundation.core.notification.impl.jooq.generation.tables.NotificationDefinitionObserverrExpandSnapshot;
import com.wuda.foundation.core.notification.impl.jooq.generation.tables.records.NotificationDefinitionObserverrExpandSnapshotRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;
import java.util.List;


/**
 * 接收者如果是“全部”，“莫某部门”这样的一类用户时，在接收者主表保存“全部”这样类型的接收者时，将当时那个瞬间“全部”的用户展开来保存到这个表中，比如当时整个公司全部只有20个人，则在这个表展开来就有20条记录，后面如果公司再新进新人，则新人不包含。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationDefinitionObserverrExpandSnapshotDao extends DAOImpl<NotificationDefinitionObserverrExpandSnapshotRecord, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot, ULong> {

    /**
     * Create a new NotificationDefinitionObserverrExpandSnapshotDao without any configuration
     */
    public NotificationDefinitionObserverrExpandSnapshotDao() {
        super(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot.class);
    }

    /**
     * Create a new NotificationDefinitionObserverrExpandSnapshotDao with an attached configuration
     */
    public NotificationDefinitionObserverrExpandSnapshotDao(Configuration configuration) {
        super(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT, com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot object) {
        return object.getNotificationDefinitionObserverExpandSnapshotId();
    }

    /**
     * Fetch records that have <code>notification_definition_observer_expand_snapshot_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfNotificationDefinitionObserverExpandSnapshotId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.NOTIFICATION_DEFINITION_OBSERVER_EXPAND_SNAPSHOT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_definition_observer_expand_snapshot_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByNotificationDefinitionObserverExpandSnapshotId(ULong... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.NOTIFICATION_DEFINITION_OBSERVER_EXPAND_SNAPSHOT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>notification_definition_observer_expand_snapshot_id = value</code>
     */
    public com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot fetchOneByNotificationDefinitionObserverExpandSnapshotId(ULong value) {
        return fetchOne(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.NOTIFICATION_DEFINITION_OBSERVER_EXPAND_SNAPSHOT_ID, value);
    }

    /**
     * Fetch records that have <code>notification_definition_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfNotificationDefinitionId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.NOTIFICATION_DEFINITION_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_definition_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByNotificationDefinitionId(ULong... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.NOTIFICATION_DEFINITION_ID, values);
    }

    /**
     * Fetch records that have <code>notification_definition_receiver_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfNotificationDefinitionReceiverId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.NOTIFICATION_DEFINITION_RECEIVER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_definition_receiver_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByNotificationDefinitionReceiverId(ULong... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.NOTIFICATION_DEFINITION_RECEIVER_ID, values);
    }

    /**
     * Fetch records that have <code>observer_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfObserverType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.OBSERVER_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>observer_type IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByObserverType(UByte... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.OBSERVER_TYPE, values);
    }

    /**
     * Fetch records that have <code>observer_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfObserverIdentifier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.OBSERVER_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>observer_identifier IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByObserverIdentifier(ULong... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.OBSERVER_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByCreateTime(LocalDateTime... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByCreateUserId(ULong... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByLastModifyUserId(ULong... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.core.notification.impl.jooq.generation.tables.pojos.NotificationDefinitionObserverrExpandSnapshot> fetchByIsDeleted(ULong... values) {
        return fetch(NotificationDefinitionObserverrExpandSnapshot.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT.IS_DELETED, values);
    }
}
