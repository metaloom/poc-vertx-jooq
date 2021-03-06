/*
 * This file is generated by jOOQ.
 */
package io.metaloom.poc.db.jooq.tables;


import io.metaloom.poc.db.jooq.Indexes;
import io.metaloom.poc.db.jooq.Keys;
import io.metaloom.poc.db.jooq.Public;
import io.metaloom.poc.db.jooq.tables.records.GroupRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Group extends TableImpl<GroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.group</code>
     */
    public static final Group GROUP = new Group();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupRecord> getRecordType() {
        return GroupRecord.class;
    }

    /**
     * The column <code>public.group.uuid</code>.
     */
    public final TableField<GroupRecord, java.util.UUID> UUID = createField(DSL.name("uuid"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field("uuid_generate_v4()", SQLDataType.UUID)), this, "");

    /**
     * The column <code>public.group.name</code>.
     */
    public final TableField<GroupRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.group.meta</code>.
     */
    public final TableField<GroupRecord, String> META = createField(DSL.name("meta"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.group.created</code>.
     */
    public final TableField<GroupRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.group.creator_uuid</code>.
     */
    public final TableField<GroupRecord, java.util.UUID> CREATOR_UUID = createField(DSL.name("creator_uuid"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.group.edited</code>.
     */
    public final TableField<GroupRecord, LocalDateTime> EDITED = createField(DSL.name("edited"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.group.editor_uuid</code>.
     */
    public final TableField<GroupRecord, java.util.UUID> EDITOR_UUID = createField(DSL.name("editor_uuid"), SQLDataType.UUID, this, "");

    private Group(Name alias, Table<GroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private Group(Name alias, Table<GroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.group</code> table reference
     */
    public Group(String alias) {
        this(DSL.name(alias), GROUP);
    }

    /**
     * Create an aliased <code>public.group</code> table reference
     */
    public Group(Name alias) {
        this(alias, GROUP);
    }

    /**
     * Create a <code>public.group</code> table reference
     */
    public Group() {
        this(DSL.name("group"), null);
    }

    public <O extends Record> Group(Table<O> child, ForeignKey<O, GroupRecord> key) {
        super(child, key, GROUP);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GROUP_NAME_IDX);
    }

    @Override
    public UniqueKey<GroupRecord> getPrimaryKey() {
        return Keys.GROUP_PKEY;
    }

    @Override
    public List<UniqueKey<GroupRecord>> getKeys() {
        return Arrays.<UniqueKey<GroupRecord>>asList(Keys.GROUP_PKEY, Keys.GROUP_NAME_KEY);
    }

    @Override
    public List<ForeignKey<GroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GroupRecord, ?>>asList(Keys.GROUP__GROUP_CREATOR_UUID_FKEY, Keys.GROUP__GROUP_EDITOR_UUID_FKEY);
    }

    private transient User _groupCreatorUuidFkey;
    private transient User _groupEditorUuidFkey;

    public User groupCreatorUuidFkey() {
        if (_groupCreatorUuidFkey == null)
            _groupCreatorUuidFkey = new User(this, Keys.GROUP__GROUP_CREATOR_UUID_FKEY);

        return _groupCreatorUuidFkey;
    }

    public User groupEditorUuidFkey() {
        if (_groupEditorUuidFkey == null)
            _groupEditorUuidFkey = new User(this, Keys.GROUP__GROUP_EDITOR_UUID_FKEY);

        return _groupEditorUuidFkey;
    }

    @Override
    public Group as(String alias) {
        return new Group(DSL.name(alias), this);
    }

    @Override
    public Group as(Name alias) {
        return new Group(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Group rename(String name) {
        return new Group(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Group rename(Name name) {
        return new Group(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<java.util.UUID, String, String, LocalDateTime, java.util.UUID, LocalDateTime, java.util.UUID> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
