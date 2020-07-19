/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation;


import com.wuda.foundation.commons.impl.jooq.generation.tables.Email;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Phone;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKey;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyValue;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.EmailRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PhoneRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyKeyRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyValueRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.ULong;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>foundation_commons</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PropertyKeyRecord, ULong> IDENTITY_PROPERTY_KEY = Identities0.IDENTITY_PROPERTY_KEY;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EmailRecord> KEY_EMAIL_PRIMARY = UniqueKeys0.KEY_EMAIL_PRIMARY;
    public static final UniqueKey<EmailRecord> KEY_EMAIL_EMAIL_ID = UniqueKeys0.KEY_EMAIL_EMAIL_ID;
    public static final UniqueKey<EmailRecord> KEY_EMAIL_IDX_EMAIL_UNIQUE = UniqueKeys0.KEY_EMAIL_IDX_EMAIL_UNIQUE;
    public static final UniqueKey<PhoneRecord> KEY_PHONE_PRIMARY = UniqueKeys0.KEY_PHONE_PRIMARY;
    public static final UniqueKey<PhoneRecord> KEY_PHONE_PHONE_ID = UniqueKeys0.KEY_PHONE_PHONE_ID;
    public static final UniqueKey<PhoneRecord> KEY_PHONE_IDX_PHONE_NUMBER = UniqueKeys0.KEY_PHONE_IDX_PHONE_NUMBER;
    public static final UniqueKey<PropertyKeyRecord> KEY_PROPERTY_KEY_PRIMARY = UniqueKeys0.KEY_PROPERTY_KEY_PRIMARY;
    public static final UniqueKey<PropertyKeyRecord> KEY_PROPERTY_KEY_IDX_UNIQUE = UniqueKeys0.KEY_PROPERTY_KEY_IDX_UNIQUE;
    public static final UniqueKey<PropertyValueRecord> KEY_PROPERTY_VALUE_PRIMARY = UniqueKeys0.KEY_PROPERTY_VALUE_PRIMARY;
    public static final UniqueKey<PropertyValueRecord> KEY_PROPERTY_VALUE_IDX_ATTR_VALUE = UniqueKeys0.KEY_PROPERTY_VALUE_IDX_ATTR_VALUE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<PropertyKeyRecord, ULong> IDENTITY_PROPERTY_KEY = Internal.createIdentity(PropertyKey.PROPERTY_KEY, PropertyKey.PROPERTY_KEY.PROPERTY_KEY_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<EmailRecord> KEY_EMAIL_PRIMARY = Internal.createUniqueKey(Email.EMAIL, "KEY_email_PRIMARY", new TableField[] { Email.EMAIL.EMAIL_ID }, true);
        public static final UniqueKey<EmailRecord> KEY_EMAIL_EMAIL_ID = Internal.createUniqueKey(Email.EMAIL, "KEY_email_email_id", new TableField[] { Email.EMAIL.EMAIL_ID }, true);
        public static final UniqueKey<EmailRecord> KEY_EMAIL_IDX_EMAIL_UNIQUE = Internal.createUniqueKey(Email.EMAIL, "KEY_email_idx_email_unique", new TableField[] { Email.EMAIL.ADDRESS, Email.EMAIL.IS_DELETED }, true);
        public static final UniqueKey<PhoneRecord> KEY_PHONE_PRIMARY = Internal.createUniqueKey(Phone.PHONE, "KEY_phone_PRIMARY", new TableField[] { Phone.PHONE.PHONE_ID }, true);
        public static final UniqueKey<PhoneRecord> KEY_PHONE_PHONE_ID = Internal.createUniqueKey(Phone.PHONE, "KEY_phone_phone_id", new TableField[] { Phone.PHONE.PHONE_ID }, true);
        public static final UniqueKey<PhoneRecord> KEY_PHONE_IDX_PHONE_NUMBER = Internal.createUniqueKey(Phone.PHONE, "KEY_phone_idx_phone_number", new TableField[] { Phone.PHONE.NUMBER, Phone.PHONE.IS_DELETED }, true);
        public static final UniqueKey<PropertyKeyRecord> KEY_PROPERTY_KEY_PRIMARY = Internal.createUniqueKey(PropertyKey.PROPERTY_KEY, "KEY_property_key_PRIMARY", new TableField[] { PropertyKey.PROPERTY_KEY.PROPERTY_KEY_ID }, true);
        public static final UniqueKey<PropertyKeyRecord> KEY_PROPERTY_KEY_IDX_UNIQUE = Internal.createUniqueKey(PropertyKey.PROPERTY_KEY, "KEY_property_key_idx_unique", new TableField[] { PropertyKey.PROPERTY_KEY.OWNER_TYPE, PropertyKey.PROPERTY_KEY.OWNER_IDENTIFIER, PropertyKey.PROPERTY_KEY.KEY, PropertyKey.PROPERTY_KEY.IS_DELETED }, true);
        public static final UniqueKey<PropertyValueRecord> KEY_PROPERTY_VALUE_PRIMARY = Internal.createUniqueKey(PropertyValue.PROPERTY_VALUE, "KEY_property_value_PRIMARY", new TableField[] { PropertyValue.PROPERTY_VALUE.PROPERTY_VALUE_ID }, true);
        public static final UniqueKey<PropertyValueRecord> KEY_PROPERTY_VALUE_IDX_ATTR_VALUE = Internal.createUniqueKey(PropertyValue.PROPERTY_VALUE, "KEY_property_value_idx_attr_value", new TableField[] { PropertyValue.PROPERTY_VALUE.PROPERTY_KEY_ID, PropertyValue.PROPERTY_VALUE.VALUE, PropertyValue.PROPERTY_VALUE.IS_DELETED }, true);
    }
}