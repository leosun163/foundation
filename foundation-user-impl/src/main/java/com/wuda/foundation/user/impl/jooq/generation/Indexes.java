/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.user.impl.jooq.generation;


import com.wuda.foundation.user.impl.jooq.generation.tables.IndividualUserGeneral;
import com.wuda.foundation.user.impl.jooq.generation.tables.UserCore;
import com.wuda.foundation.user.impl.jooq.generation.tables.UserEmail;
import com.wuda.foundation.user.impl.jooq.generation.tables.UserPhone;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>foundation_user</code> 
 * schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index INDIVIDUAL_USER_GENERAL_FK_USER_ID = Indexes0.INDIVIDUAL_USER_GENERAL_FK_USER_ID;
    public static final Index USER_CORE_IDX_USER_ID = Indexes0.USER_CORE_IDX_USER_ID;
    public static final Index USER_EMAIL_FK_USER_ID = Indexes0.USER_EMAIL_FK_USER_ID;
    public static final Index USER_PHONE_FK_USER_ID = Indexes0.USER_PHONE_FK_USER_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index INDIVIDUAL_USER_GENERAL_FK_USER_ID = Internal.createIndex("fk_user_id", IndividualUserGeneral.INDIVIDUAL_USER_GENERAL, new OrderField[] { IndividualUserGeneral.INDIVIDUAL_USER_GENERAL.USER_ID }, false);
        public static Index USER_CORE_IDX_USER_ID = Internal.createIndex("idx_user_id", UserCore.USER_CORE, new OrderField[] { UserCore.USER_CORE.USER_ID }, false);
        public static Index USER_EMAIL_FK_USER_ID = Internal.createIndex("fk_user_id", UserEmail.USER_EMAIL, new OrderField[] { UserEmail.USER_EMAIL.USER_ID }, false);
        public static Index USER_PHONE_FK_USER_ID = Internal.createIndex("fk_user_id", UserPhone.USER_PHONE, new OrderField[] { UserPhone.USER_PHONE.USER_ID }, false);
    }
}
