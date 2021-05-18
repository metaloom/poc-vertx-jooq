package io.metaloom.poc.db.jooq.tables.mappers;

import io.vertx.sqlclient.Row;
import java.util.function.Function;

public class RowMappers {

        private RowMappers(){}

        public static Function<Row,io.metaloom.poc.db.jooq.tables.pojos.Group> getGroupMapper() {
                return row -> {
                        io.metaloom.poc.db.jooq.tables.pojos.Group pojo = new io.metaloom.poc.db.jooq.tables.pojos.Group();
                        pojo.setUuid(row.getUUID("uuid"));
                        pojo.setName(row.getString("name"));
                        pojo.setMeta(row.getString("meta"));
                        pojo.setCreated(row.getLocalDateTime("created"));
                        pojo.setCreatorUuid(row.getUUID("creator_uuid"));
                        pojo.setEdited(row.getLocalDateTime("edited"));
                        pojo.setEditorUuid(row.getUUID("editor_uuid"));
                        return pojo;
                };
        }

        public static Function<Row,io.metaloom.poc.db.jooq.tables.pojos.User> getUserMapper() {
                return row -> {
                        io.metaloom.poc.db.jooq.tables.pojos.User pojo = new io.metaloom.poc.db.jooq.tables.pojos.User();
                        pojo.setUuid(row.getUUID("uuid"));
                        pojo.setUsername(row.getString("username"));
                        pojo.setFirstname(row.getString("firstname"));
                        pojo.setLastname(row.getString("lastname"));
                        pojo.setPasswordhash(row.getString("passwordhash"));
                        pojo.setEmail(row.getString("email"));
                        pojo.setEnabled(row.getBoolean("enabled"));
                        pojo.setMeta(row.getString("meta"));
                        pojo.setCreated(row.getLocalDateTime("created"));
                        pojo.setCreatorUuid(row.getUUID("creator_uuid"));
                        pojo.setEdited(row.getLocalDateTime("edited"));
                        pojo.setEditorUuid(row.getUUID("editor_uuid"));
                        return pojo;
                };
        }

        public static Function<Row,io.metaloom.poc.db.jooq.tables.pojos.UserGroup> getUserGroupMapper() {
                return row -> {
                        io.metaloom.poc.db.jooq.tables.pojos.UserGroup pojo = new io.metaloom.poc.db.jooq.tables.pojos.UserGroup();
                        pojo.setUserUuid(row.getUUID("user_uuid"));
                        pojo.setGroupUuid(row.getUUID("group_uuid"));
                        return pojo;
                };
        }

}
