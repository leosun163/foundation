/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.user.impl.jooq.generation.tables.records;


import com.wuda.foundation.core.user.impl.jooq.generation.tables.UserBelongsToGroupGeneral;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import java.time.LocalDateTime;


/**
 * 用户在所属的组中的基本信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserBelongsToGroupGeneralRecord extends UpdatableRecordImpl<UserBelongsToGroupGeneralRecord> implements Record8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 1746805442;

    /**
     * Setter for <code>foundation_user.user_belongs_to_group_general.user_belongs_to_group_general_id</code>.
     */
    public void setUserBelongsToGroupGeneralId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_user.user_belongs_to_group_general.user_belongs_to_group_general_id</code>.
     */
    public ULong getUserBelongsToGroupGeneralId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_user.user_belongs_to_group_general.user_belongs_to_group_id</code>.
     */
    public void setUserBelongsToGroupId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_user.user_belongs_to_group_general.user_belongs_to_group_id</code>.
     */
    public ULong getUserBelongsToGroupId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_user.user_belongs_to_group_general.nickname</code>. 用户在组里面的昵称
     */
    public void setNickname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_user.user_belongs_to_group_general.nickname</code>. 用户在组里面的昵称
     */
    public String getNickname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_user.user_belongs_to_group_general.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_user.user_belongs_to_group_general.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>foundation_user.user_belongs_to_group_general.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_user.user_belongs_to_group_general.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>foundation_user.user_belongs_to_group_general.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_user.user_belongs_to_group_general.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>foundation_user.user_belongs_to_group_general.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_user.user_belongs_to_group_general.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>foundation_user.user_belongs_to_group_general.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_user.user_belongs_to_group_general.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL.USER_BELONGS_TO_GROUP_GENERAL_ID;
    }

    @Override
    public Field<ULong> field2() {
        return UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL.USER_BELONGS_TO_GROUP_ID;
    }

    @Override
    public Field<String> field3() {
        return UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL.NICKNAME;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL.CREATE_TIME;
    }

    @Override
    public Field<ULong> field5() {
        return UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field7() {
        return UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field8() {
        return UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getUserBelongsToGroupGeneralId();
    }

    @Override
    public ULong component2() {
        return getUserBelongsToGroupId();
    }

    @Override
    public String component3() {
        return getNickname();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public ULong component5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component6() {
        return getLastModifyTime();
    }

    @Override
    public ULong component7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component8() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getUserBelongsToGroupGeneralId();
    }

    @Override
    public ULong value2() {
        return getUserBelongsToGroupId();
    }

    @Override
    public String value3() {
        return getNickname();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public ULong value5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value6() {
        return getLastModifyTime();
    }

    @Override
    public ULong value7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value8() {
        return getIsDeleted();
    }

    @Override
    public UserBelongsToGroupGeneralRecord value1(ULong value) {
        setUserBelongsToGroupGeneralId(value);
        return this;
    }

    @Override
    public UserBelongsToGroupGeneralRecord value2(ULong value) {
        setUserBelongsToGroupId(value);
        return this;
    }

    @Override
    public UserBelongsToGroupGeneralRecord value3(String value) {
        setNickname(value);
        return this;
    }

    @Override
    public UserBelongsToGroupGeneralRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public UserBelongsToGroupGeneralRecord value5(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public UserBelongsToGroupGeneralRecord value6(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public UserBelongsToGroupGeneralRecord value7(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public UserBelongsToGroupGeneralRecord value8(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public UserBelongsToGroupGeneralRecord values(ULong value1, ULong value2, String value3, LocalDateTime value4, ULong value5, LocalDateTime value6, ULong value7, ULong value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserBelongsToGroupGeneralRecord
     */
    public UserBelongsToGroupGeneralRecord() {
        super(UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL);
    }

    /**
     * Create a detached, initialised UserBelongsToGroupGeneralRecord
     */
    public UserBelongsToGroupGeneralRecord(ULong userBelongsToGroupGeneralId, ULong userBelongsToGroupId, String nickname, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(UserBelongsToGroupGeneral.USER_BELONGS_TO_GROUP_GENERAL);

        set(0, userBelongsToGroupGeneralId);
        set(1, userBelongsToGroupId);
        set(2, nickname);
        set(3, createTime);
        set(4, createUserId);
        set(5, lastModifyTime);
        set(6, lastModifyUserId);
        set(7, isDeleted);
    }
}
