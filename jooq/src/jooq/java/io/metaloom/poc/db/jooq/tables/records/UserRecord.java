/*
 * This file is generated by jOOQ.
 */
package io.metaloom.poc.db.jooq.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.metaloom.poc.db.jooq.tables.User;
import io.metaloom.poc.db.jooq.tables.interfaces.IUser;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements VertxPojo, Record12<UUID, String, String, String, String, String, Boolean, String, LocalDateTime, UUID, LocalDateTime, UUID>, IUser {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user.uuid</code>.
     */
    @Override
    public UserRecord setUuid(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.user.uuid</code>.
     */
    @Override
    public UUID getUuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.user.username</code>.
     */
    @Override
    public UserRecord setUsername(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.user.username</code>.
     */
    @Override
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user.firstname</code>.
     */
    @Override
    public UserRecord setFirstname(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.user.firstname</code>.
     */
    @Override
    public String getFirstname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user.lastname</code>.
     */
    @Override
    public UserRecord setLastname(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.user.lastname</code>.
     */
    @Override
    public String getLastname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.user.passwordhash</code>.
     */
    @Override
    public UserRecord setPasswordhash(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.user.passwordhash</code>.
     */
    @Override
    public String getPasswordhash() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.user.email</code>.
     */
    @Override
    public UserRecord setEmail(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.user.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.user.enabled</code>.
     */
    @Override
    public UserRecord setEnabled(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.user.enabled</code>.
     */
    @Override
    public Boolean getEnabled() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.user.meta</code>.
     */
    @Override
    public UserRecord setMeta(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.user.meta</code>.
     */
    @Override
    public String getMeta() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.user.created</code>.
     */
    @Override
    public UserRecord setCreated(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.user.created</code>.
     */
    @Override
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>public.user.creator_uuid</code>.
     */
    @Override
    public UserRecord setCreatorUuid(UUID value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.user.creator_uuid</code>.
     */
    @Override
    public UUID getCreatorUuid() {
        return (UUID) get(9);
    }

    /**
     * Setter for <code>public.user.edited</code>.
     */
    @Override
    public UserRecord setEdited(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.user.edited</code>.
     */
    @Override
    public LocalDateTime getEdited() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>public.user.editor_uuid</code>.
     */
    @Override
    public UserRecord setEditorUuid(UUID value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.user.editor_uuid</code>.
     */
    @Override
    public UUID getEditorUuid() {
        return (UUID) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<UUID, String, String, String, String, String, Boolean, String, LocalDateTime, UUID, LocalDateTime, UUID> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UUID, String, String, String, String, String, Boolean, String, LocalDateTime, UUID, LocalDateTime, UUID> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return User.USER.UUID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return User.USER.FIRSTNAME;
    }

    @Override
    public Field<String> field4() {
        return User.USER.LASTNAME;
    }

    @Override
    public Field<String> field5() {
        return User.USER.PASSWORDHASH;
    }

    @Override
    public Field<String> field6() {
        return User.USER.EMAIL;
    }

    @Override
    public Field<Boolean> field7() {
        return User.USER.ENABLED;
    }

    @Override
    public Field<String> field8() {
        return User.USER.META;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return User.USER.CREATED;
    }

    @Override
    public Field<UUID> field10() {
        return User.USER.CREATOR_UUID;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return User.USER.EDITED;
    }

    @Override
    public Field<UUID> field12() {
        return User.USER.EDITOR_UUID;
    }

    @Override
    public UUID component1() {
        return getUuid();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getFirstname();
    }

    @Override
    public String component4() {
        return getLastname();
    }

    @Override
    public String component5() {
        return getPasswordhash();
    }

    @Override
    public String component6() {
        return getEmail();
    }

    @Override
    public Boolean component7() {
        return getEnabled();
    }

    @Override
    public String component8() {
        return getMeta();
    }

    @Override
    public LocalDateTime component9() {
        return getCreated();
    }

    @Override
    public UUID component10() {
        return getCreatorUuid();
    }

    @Override
    public LocalDateTime component11() {
        return getEdited();
    }

    @Override
    public UUID component12() {
        return getEditorUuid();
    }

    @Override
    public UUID value1() {
        return getUuid();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getFirstname();
    }

    @Override
    public String value4() {
        return getLastname();
    }

    @Override
    public String value5() {
        return getPasswordhash();
    }

    @Override
    public String value6() {
        return getEmail();
    }

    @Override
    public Boolean value7() {
        return getEnabled();
    }

    @Override
    public String value8() {
        return getMeta();
    }

    @Override
    public LocalDateTime value9() {
        return getCreated();
    }

    @Override
    public UUID value10() {
        return getCreatorUuid();
    }

    @Override
    public LocalDateTime value11() {
        return getEdited();
    }

    @Override
    public UUID value12() {
        return getEditorUuid();
    }

    @Override
    public UserRecord value1(UUID value) {
        setUuid(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setFirstname(value);
        return this;
    }

    @Override
    public UserRecord value4(String value) {
        setLastname(value);
        return this;
    }

    @Override
    public UserRecord value5(String value) {
        setPasswordhash(value);
        return this;
    }

    @Override
    public UserRecord value6(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UserRecord value7(Boolean value) {
        setEnabled(value);
        return this;
    }

    @Override
    public UserRecord value8(String value) {
        setMeta(value);
        return this;
    }

    @Override
    public UserRecord value9(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public UserRecord value10(UUID value) {
        setCreatorUuid(value);
        return this;
    }

    @Override
    public UserRecord value11(LocalDateTime value) {
        setEdited(value);
        return this;
    }

    @Override
    public UserRecord value12(UUID value) {
        setEditorUuid(value);
        return this;
    }

    @Override
    public UserRecord values(UUID value1, String value2, String value3, String value4, String value5, String value6, Boolean value7, String value8, LocalDateTime value9, UUID value10, LocalDateTime value11, UUID value12) {
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
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUser from) {
        setUuid(from.getUuid());
        setUsername(from.getUsername());
        setFirstname(from.getFirstname());
        setLastname(from.getLastname());
        setPasswordhash(from.getPasswordhash());
        setEmail(from.getEmail());
        setEnabled(from.getEnabled());
        setMeta(from.getMeta());
        setCreated(from.getCreated());
        setCreatorUuid(from.getCreatorUuid());
        setEdited(from.getEdited());
        setEditorUuid(from.getEditorUuid());
    }

    @Override
    public <E extends IUser> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(UUID uuid, String username, String firstname, String lastname, String passwordhash, String email, Boolean enabled, String meta, LocalDateTime created, UUID creatorUuid, LocalDateTime edited, UUID editorUuid) {
        super(User.USER);

        setUuid(uuid);
        setUsername(username);
        setFirstname(firstname);
        setLastname(lastname);
        setPasswordhash(passwordhash);
        setEmail(email);
        setEnabled(enabled);
        setMeta(meta);
        setCreated(created);
        setCreatorUuid(creatorUuid);
        setEdited(edited);
        setEditorUuid(editorUuid);
    }

        public UserRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
