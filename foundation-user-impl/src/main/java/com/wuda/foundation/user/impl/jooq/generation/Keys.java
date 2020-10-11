/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.user.impl.jooq.generation;


import com.wuda.foundation.user.impl.jooq.generation.tables.IndividualUserGeneral;
import com.wuda.foundation.user.impl.jooq.generation.tables.UserAccount;
import com.wuda.foundation.user.impl.jooq.generation.tables.UserCore;
import com.wuda.foundation.user.impl.jooq.generation.tables.UserEmail;
import com.wuda.foundation.user.impl.jooq.generation.tables.UserPhone;
import com.wuda.foundation.user.impl.jooq.generation.tables.records.IndividualUserGeneralRecord;
import com.wuda.foundation.user.impl.jooq.generation.tables.records.UserAccountRecord;
import com.wuda.foundation.user.impl.jooq.generation.tables.records.UserCoreRecord;
import com.wuda.foundation.user.impl.jooq.generation.tables.records.UserEmailRecord;
import com.wuda.foundation.user.impl.jooq.generation.tables.records.UserPhoneRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.ULong;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>foundation_user</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<IndividualUserGeneralRecord, ULong> IDENTITY_INDIVIDUAL_USER_GENERAL = Identities0.IDENTITY_INDIVIDUAL_USER_GENERAL;
    public static final Identity<UserAccountRecord, ULong> IDENTITY_USER_ACCOUNT = Identities0.IDENTITY_USER_ACCOUNT;
    public static final Identity<UserCoreRecord, ULong> IDENTITY_USER_CORE = Identities0.IDENTITY_USER_CORE;
    public static final Identity<UserEmailRecord, ULong> IDENTITY_USER_EMAIL = Identities0.IDENTITY_USER_EMAIL;
    public static final Identity<UserPhoneRecord, ULong> IDENTITY_USER_PHONE = Identities0.IDENTITY_USER_PHONE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<IndividualUserGeneralRecord> KEY_INDIVIDUAL_USER_GENERAL_PRIMARY = UniqueKeys0.KEY_INDIVIDUAL_USER_GENERAL_PRIMARY;
    public static final UniqueKey<UserAccountRecord> KEY_USER_ACCOUNT_PRIMARY = UniqueKeys0.KEY_USER_ACCOUNT_PRIMARY;
    public static final UniqueKey<UserAccountRecord> KEY_USER_ACCOUNT_IDX_USERNAME = UniqueKeys0.KEY_USER_ACCOUNT_IDX_USERNAME;
    public static final UniqueKey<UserCoreRecord> KEY_USER_CORE_PRIMARY = UniqueKeys0.KEY_USER_CORE_PRIMARY;
    public static final UniqueKey<UserEmailRecord> KEY_USER_EMAIL_PRIMARY = UniqueKeys0.KEY_USER_EMAIL_PRIMARY;
    public static final UniqueKey<UserEmailRecord> KEY_USER_EMAIL_IDX_UNIQUE = UniqueKeys0.KEY_USER_EMAIL_IDX_UNIQUE;
    public static final UniqueKey<UserPhoneRecord> KEY_USER_PHONE_PRIMARY = UniqueKeys0.KEY_USER_PHONE_PRIMARY;
    public static final UniqueKey<UserPhoneRecord> KEY_USER_PHONE_IDX_UNIQUE = UniqueKeys0.KEY_USER_PHONE_IDX_UNIQUE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<IndividualUserGeneralRecord, ULong> IDENTITY_INDIVIDUAL_USER_GENERAL = Internal.createIdentity(IndividualUserGeneral.INDIVIDUAL_USER_GENERAL, IndividualUserGeneral.INDIVIDUAL_USER_GENERAL.INDIVIDUAL_USER_GENERAL_ID);
        public static Identity<UserAccountRecord, ULong> IDENTITY_USER_ACCOUNT = Internal.createIdentity(UserAccount.USER_ACCOUNT, UserAccount.USER_ACCOUNT.USER_ACCOUNT_ID);
        public static Identity<UserCoreRecord, ULong> IDENTITY_USER_CORE = Internal.createIdentity(UserCore.USER_CORE, UserCore.USER_CORE.USER_CORE_ID);
        public static Identity<UserEmailRecord, ULong> IDENTITY_USER_EMAIL = Internal.createIdentity(UserEmail.USER_EMAIL, UserEmail.USER_EMAIL.ID);
        public static Identity<UserPhoneRecord, ULong> IDENTITY_USER_PHONE = Internal.createIdentity(UserPhone.USER_PHONE, UserPhone.USER_PHONE.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<IndividualUserGeneralRecord> KEY_INDIVIDUAL_USER_GENERAL_PRIMARY = Internal.createUniqueKey(IndividualUserGeneral.INDIVIDUAL_USER_GENERAL, "KEY_individual_user_general_PRIMARY", new TableField[] { IndividualUserGeneral.INDIVIDUAL_USER_GENERAL.INDIVIDUAL_USER_GENERAL_ID }, true);
        public static final UniqueKey<UserAccountRecord> KEY_USER_ACCOUNT_PRIMARY = Internal.createUniqueKey(UserAccount.USER_ACCOUNT, "KEY_user_account_PRIMARY", new TableField[] { UserAccount.USER_ACCOUNT.USER_ACCOUNT_ID }, true);
        public static final UniqueKey<UserAccountRecord> KEY_USER_ACCOUNT_IDX_USERNAME = Internal.createUniqueKey(UserAccount.USER_ACCOUNT, "KEY_user_account_idx_username", new TableField[] { UserAccount.USER_ACCOUNT.USERNAME, UserAccount.USER_ACCOUNT.IS_DELETED }, true);
        public static final UniqueKey<UserCoreRecord> KEY_USER_CORE_PRIMARY = Internal.createUniqueKey(UserCore.USER_CORE, "KEY_user_core_PRIMARY", new TableField[] { UserCore.USER_CORE.USER_CORE_ID }, true);
        public static final UniqueKey<UserEmailRecord> KEY_USER_EMAIL_PRIMARY = Internal.createUniqueKey(UserEmail.USER_EMAIL, "KEY_user_email_PRIMARY", new TableField[] { UserEmail.USER_EMAIL.ID }, true);
        public static final UniqueKey<UserEmailRecord> KEY_USER_EMAIL_IDX_UNIQUE = Internal.createUniqueKey(UserEmail.USER_EMAIL, "KEY_user_email_idx_unique", new TableField[] { UserEmail.USER_EMAIL.EMAIL_ID, UserEmail.USER_EMAIL.USE, UserEmail.USER_EMAIL.IS_DELETED }, true);
        public static final UniqueKey<UserPhoneRecord> KEY_USER_PHONE_PRIMARY = Internal.createUniqueKey(UserPhone.USER_PHONE, "KEY_user_phone_PRIMARY", new TableField[] { UserPhone.USER_PHONE.ID }, true);
        public static final UniqueKey<UserPhoneRecord> KEY_USER_PHONE_IDX_UNIQUE = Internal.createUniqueKey(UserPhone.USER_PHONE, "KEY_user_phone_idx_unique", new TableField[] { UserPhone.USER_PHONE.PHONE_ID, UserPhone.USER_PHONE.USE, UserPhone.USER_PHONE.IS_DELETED }, true);
    }
}
