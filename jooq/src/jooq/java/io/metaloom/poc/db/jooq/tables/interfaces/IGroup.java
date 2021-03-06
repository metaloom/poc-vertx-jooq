/*
 * This file is generated by jOOQ.
 */
package io.metaloom.poc.db.jooq.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IGroup extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.group.uuid</code>.
     */
    public IGroup setUuid(UUID value);

    /**
     * Getter for <code>public.group.uuid</code>.
     */
    public UUID getUuid();

    /**
     * Setter for <code>public.group.name</code>.
     */
    public IGroup setName(String value);

    /**
     * Getter for <code>public.group.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>public.group.meta</code>.
     */
    public IGroup setMeta(String value);

    /**
     * Getter for <code>public.group.meta</code>.
     */
    public String getMeta();

    /**
     * Setter for <code>public.group.created</code>.
     */
    public IGroup setCreated(LocalDateTime value);

    /**
     * Getter for <code>public.group.created</code>.
     */
    public LocalDateTime getCreated();

    /**
     * Setter for <code>public.group.creator_uuid</code>.
     */
    public IGroup setCreatorUuid(UUID value);

    /**
     * Getter for <code>public.group.creator_uuid</code>.
     */
    public UUID getCreatorUuid();

    /**
     * Setter for <code>public.group.edited</code>.
     */
    public IGroup setEdited(LocalDateTime value);

    /**
     * Getter for <code>public.group.edited</code>.
     */
    public LocalDateTime getEdited();

    /**
     * Setter for <code>public.group.editor_uuid</code>.
     */
    public IGroup setEditorUuid(UUID value);

    /**
     * Getter for <code>public.group.editor_uuid</code>.
     */
    public UUID getEditorUuid();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IGroup
     */
    public void from(IGroup from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IGroup
     */
    public <E extends IGroup> E into(E into);

        @Override
        public default IGroup fromJson(io.vertx.core.json.JsonObject json) {
                // Omitting unrecognized type java.util.UUID for column uuid!
                setOrThrow(this::setName,json::getString,"name","java.lang.String");
                setOrThrow(this::setMeta,json::getString,"meta","java.lang.String");
                setOrThrow(this::setCreated,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"created","java.time.LocalDateTime");
                // Omitting unrecognized type java.util.UUID for column creator_uuid!
                setOrThrow(this::setEdited,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"edited","java.time.LocalDateTime");
                // Omitting unrecognized type java.util.UUID for column editor_uuid!
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                // Omitting unrecognized type java.util.UUID for column uuid!
                json.put("name",getName());
                json.put("meta",getMeta());
                json.put("created",getCreated()==null?null:getCreated().toString());
                // Omitting unrecognized type java.util.UUID for column creator_uuid!
                json.put("edited",getEdited()==null?null:getEdited().toString());
                // Omitting unrecognized type java.util.UUID for column editor_uuid!
                return json;
        }

}
