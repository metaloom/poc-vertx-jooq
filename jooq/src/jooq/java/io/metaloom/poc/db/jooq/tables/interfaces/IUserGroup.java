/*
 * This file is generated by jOOQ.
 */
package io.metaloom.poc.db.jooq.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.util.UUID;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IUserGroup extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.user_group.user_uuid</code>.
     */
    public IUserGroup setUserUuid(UUID value);

    /**
     * Getter for <code>public.user_group.user_uuid</code>.
     */
    public UUID getUserUuid();

    /**
     * Setter for <code>public.user_group.group_uuid</code>.
     */
    public IUserGroup setGroupUuid(UUID value);

    /**
     * Getter for <code>public.user_group.group_uuid</code>.
     */
    public UUID getGroupUuid();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUserGroup
     */
    public void from(IUserGroup from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUserGroup
     */
    public <E extends IUserGroup> E into(E into);

        @Override
        public default IUserGroup fromJson(io.vertx.core.json.JsonObject json) {
                // Omitting unrecognized type java.util.UUID for column user_uuid!
                // Omitting unrecognized type java.util.UUID for column group_uuid!
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                // Omitting unrecognized type java.util.UUID for column user_uuid!
                // Omitting unrecognized type java.util.UUID for column group_uuid!
                return json;
        }

}
