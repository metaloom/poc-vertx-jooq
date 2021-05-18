/*
 * This file is generated by jOOQ.
 */
package io.metaloom.poc.db.jooq.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.metaloom.poc.db.jooq.tables.UserGroup;
import io.metaloom.poc.db.jooq.tables.interfaces.IUserGroup;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGroupRecord extends UpdatableRecordImpl<UserGroupRecord> implements VertxPojo, Record2<UUID, UUID>, IUserGroup {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user_group.user_uuid</code>.
     */
    @Override
    public UserGroupRecord setUserUuid(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.user_group.user_uuid</code>.
     */
    @Override
    public UUID getUserUuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.user_group.group_uuid</code>.
     */
    @Override
    public UserGroupRecord setGroupUuid(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.user_group.group_uuid</code>.
     */
    @Override
    public UUID getGroupUuid() {
        return (UUID) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UUID, UUID> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UUID, UUID> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return UserGroup.USER_GROUP.USER_UUID;
    }

    @Override
    public Field<UUID> field2() {
        return UserGroup.USER_GROUP.GROUP_UUID;
    }

    @Override
    public UUID component1() {
        return getUserUuid();
    }

    @Override
    public UUID component2() {
        return getGroupUuid();
    }

    @Override
    public UUID value1() {
        return getUserUuid();
    }

    @Override
    public UUID value2() {
        return getGroupUuid();
    }

    @Override
    public UserGroupRecord value1(UUID value) {
        setUserUuid(value);
        return this;
    }

    @Override
    public UserGroupRecord value2(UUID value) {
        setGroupUuid(value);
        return this;
    }

    @Override
    public UserGroupRecord values(UUID value1, UUID value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserGroup from) {
        setUserUuid(from.getUserUuid());
        setGroupUuid(from.getGroupUuid());
    }

    @Override
    public <E extends IUserGroup> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserGroupRecord
     */
    public UserGroupRecord() {
        super(UserGroup.USER_GROUP);
    }

    /**
     * Create a detached, initialised UserGroupRecord
     */
    public UserGroupRecord(UUID userUuid, UUID groupUuid) {
        super(UserGroup.USER_GROUP);

        setUserUuid(userUuid);
        setGroupUuid(groupUuid);
    }

        public UserGroupRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
