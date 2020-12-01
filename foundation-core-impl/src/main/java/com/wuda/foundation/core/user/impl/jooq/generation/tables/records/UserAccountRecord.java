/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.user.impl.jooq.generation.tables.records;


import com.wuda.foundation.core.user.impl.jooq.generation.tables.UserAccount;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.time.LocalDateTime;


/**
 * 用户账号信息，适用各种类型的用户
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserAccountRecord extends UpdatableRecordImpl<UserAccountRecord> implements Record10<ULong, ULong, String, String, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -727928838;

    /**
     * Setter for <code>foundation_user.user_account.user_account_id</code>.
     */
    public void setUserAccountId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.user_account_id</code>.
     */
    public ULong getUserAccountId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_user.user_account.user_id</code>. 用户ID
     */
    public void setUserId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.user_id</code>. 用户ID
     */
    public ULong getUserId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_user.user_account.username</code>. 只能是英文模式下的字母，数字，下划线，中划线，必须明确检查保证不是邮箱。设置以后不能修改(github可以修改)，可用作用户主页URL的一部分，参考github。注意和昵称的区别
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.username</code>. 只能是英文模式下的字母，数字，下划线，中划线，必须明确检查保证不是邮箱。设置以后不能修改(github可以修改)，可用作用户主页URL的一部分，参考github。注意和昵称的区别
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_user.user_account.password</code>. 只能是ASCII表中的可打印字符
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.password</code>. 只能是ASCII表中的可打印字符
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>foundation_user.user_account.state</code>. 账号的状态
     */
    public void setState(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.state</code>. 账号的状态
     */
    public UByte getState() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>foundation_user.user_account.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>foundation_user.user_account.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>foundation_user.user_account.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>foundation_user.user_account.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>foundation_user.user_account.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>foundation_user.user_account.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, ULong, String, String, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<ULong, ULong, String, String, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return UserAccount.USER_ACCOUNT.USER_ACCOUNT_ID;
    }

    @Override
    public Field<ULong> field2() {
        return UserAccount.USER_ACCOUNT.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return UserAccount.USER_ACCOUNT.USERNAME;
    }

    @Override
    public Field<String> field4() {
        return UserAccount.USER_ACCOUNT.PASSWORD;
    }

    @Override
    public Field<UByte> field5() {
        return UserAccount.USER_ACCOUNT.STATE;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return UserAccount.USER_ACCOUNT.CREATE_TIME;
    }

    @Override
    public Field<ULong> field7() {
        return UserAccount.USER_ACCOUNT.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return UserAccount.USER_ACCOUNT.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field9() {
        return UserAccount.USER_ACCOUNT.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field10() {
        return UserAccount.USER_ACCOUNT.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getUserAccountId();
    }

    @Override
    public ULong component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getUsername();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public UByte component5() {
        return getState();
    }

    @Override
    public LocalDateTime component6() {
        return getCreateTime();
    }

    @Override
    public ULong component7() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component8() {
        return getLastModifyTime();
    }

    @Override
    public ULong component9() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component10() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getUserAccountId();
    }

    @Override
    public ULong value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getUsername();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public UByte value5() {
        return getState();
    }

    @Override
    public LocalDateTime value6() {
        return getCreateTime();
    }

    @Override
    public ULong value7() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value8() {
        return getLastModifyTime();
    }

    @Override
    public ULong value9() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value10() {
        return getIsDeleted();
    }

    @Override
    public UserAccountRecord value1(ULong value) {
        setUserAccountId(value);
        return this;
    }

    @Override
    public UserAccountRecord value2(ULong value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserAccountRecord value3(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UserAccountRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserAccountRecord value5(UByte value) {
        setState(value);
        return this;
    }

    @Override
    public UserAccountRecord value6(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public UserAccountRecord value7(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public UserAccountRecord value8(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public UserAccountRecord value9(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public UserAccountRecord value10(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public UserAccountRecord values(ULong value1, ULong value2, String value3, String value4, UByte value5, LocalDateTime value6, ULong value7, LocalDateTime value8, ULong value9, ULong value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserAccountRecord
     */
    public UserAccountRecord() {
        super(UserAccount.USER_ACCOUNT);
    }

    /**
     * Create a detached, initialised UserAccountRecord
     */
    public UserAccountRecord(ULong userAccountId, ULong userId, String username, String password, UByte state, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(UserAccount.USER_ACCOUNT);

        set(0, userAccountId);
        set(1, userId);
        set(2, username);
        set(3, password);
        set(4, state);
        set(5, createTime);
        set(6, createUserId);
        set(7, lastModifyTime);
        set(8, lastModifyUserId);
        set(9, isDeleted);
    }
}
