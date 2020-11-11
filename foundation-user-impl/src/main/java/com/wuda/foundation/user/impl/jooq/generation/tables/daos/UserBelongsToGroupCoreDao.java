/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.user.impl.jooq.generation.tables.daos;


import com.wuda.foundation.user.impl.jooq.generation.tables.UserBelongsToGroupCore;
import com.wuda.foundation.user.impl.jooq.generation.tables.records.UserBelongsToGroupCoreRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * 用户所属的组
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserBelongsToGroupCoreDao extends DAOImpl<UserBelongsToGroupCoreRecord, com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore, ULong> {

    /**
     * Create a new UserBelongsToGroupCoreDao without any configuration
     */
    public UserBelongsToGroupCoreDao() {
        super(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE, com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore.class);
    }

    /**
     * Create a new UserBelongsToGroupCoreDao with an attached configuration
     */
    public UserBelongsToGroupCoreDao(Configuration configuration) {
        super(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE, com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore object) {
        return object.getUserBelongsToGroupCoreId();
    }

    /**
     * Fetch records that have <code>user_belongs_to_group_core_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfUserBelongsToGroupCoreId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.USER_BELONGS_TO_GROUP_CORE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_belongs_to_group_core_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByUserBelongsToGroupCoreId(ULong... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.USER_BELONGS_TO_GROUP_CORE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_belongs_to_group_core_id = value</code>
     */
    public com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore fetchOneByUserBelongsToGroupCoreId(ULong value) {
        return fetchOne(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.USER_BELONGS_TO_GROUP_CORE_ID, value);
    }

    /**
     * Fetch records that have <code>user_belongs_to_group_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfUserBelongsToGroupId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.USER_BELONGS_TO_GROUP_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_belongs_to_group_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByUserBelongsToGroupId(ULong... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.USER_BELONGS_TO_GROUP_ID, values);
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByUserId(ULong... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>group_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfGroupType(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.GROUP_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>group_type IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByGroupType(UShort... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.GROUP_TYPE, values);
    }

    /**
     * Fetch records that have <code>group_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfGroupIdentifier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.GROUP_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>group_identifier IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByGroupIdentifier(ULong... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.GROUP_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByCreateTime(LocalDateTime... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByCreateUserId(ULong... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByLastModifyUserId(ULong... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.user.impl.jooq.generation.tables.pojos.UserBelongsToGroupCore> fetchByIsDeleted(ULong... values) {
        return fetch(UserBelongsToGroupCore.USER_BELONGS_TO_GROUP_CORE.IS_DELETED, values);
    }
}
