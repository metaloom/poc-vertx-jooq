/*
 * This file is generated by jOOQ.
 */
package io.metaloom.poc.db.jooq.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;
import io.metaloom.poc.db.jooq.tables.UserGroup;
import io.metaloom.poc.db.jooq.tables.records.UserGroupRecord;

import java.util.Collection;
import java.util.UUID;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.reactivepg.ReactiveRXQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGroupDao extends AbstractReactiveVertxDAO<UserGroupRecord, io.metaloom.poc.db.jooq.tables.pojos.UserGroup, Record2<UUID, UUID>, Single<List<io.metaloom.poc.db.jooq.tables.pojos.UserGroup>>, Single<Optional<io.metaloom.poc.db.jooq.tables.pojos.UserGroup>>, Single<Integer>, Single<Record2<UUID, UUID>>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<UserGroupRecord,io.metaloom.poc.db.jooq.tables.pojos.UserGroup,Record2<UUID, UUID>> {

        /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
        public UserGroupDao(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate) {
                super(UserGroup.USER_GROUP, io.metaloom.poc.db.jooq.tables.pojos.UserGroup.class, new ReactiveRXQueryExecutor<UserGroupRecord,io.metaloom.poc.db.jooq.tables.pojos.UserGroup,Record2<UUID, UUID>>(configuration,delegate,io.metaloom.poc.db.jooq.tables.mappers.RowMappers.getUserGroupMapper()));
        }

        @Override
        protected Record2<UUID, UUID> getId(io.metaloom.poc.db.jooq.tables.pojos.UserGroup object) {
                return compositeKeyRecord(object.getUserUuid(), object.getGroupUuid());
        }

        /**
     * Find records that have <code>group_uuid IN (values)</code> asynchronously
     */
        public Single<List<io.metaloom.poc.db.jooq.tables.pojos.UserGroup>> findManyByGroupUuid(Collection<UUID> values) {
                return findManyByCondition(UserGroup.USER_GROUP.GROUP_UUID.in(values));
        }

        /**
     * Find records that have <code>group_uuid IN (values)</code> asynchronously limited by the given limit
     */
        public Single<List<io.metaloom.poc.db.jooq.tables.pojos.UserGroup>> findManyByGroupUuid(Collection<UUID> values, int limit) {
                return findManyByCondition(UserGroup.USER_GROUP.GROUP_UUID.in(values),limit);
        }

        @Override
        public ReactiveRXQueryExecutor<UserGroupRecord,io.metaloom.poc.db.jooq.tables.pojos.UserGroup,Record2<UUID, UUID>> queryExecutor(){
                return (ReactiveRXQueryExecutor<UserGroupRecord,io.metaloom.poc.db.jooq.tables.pojos.UserGroup,Record2<UUID, UUID>>) super.queryExecutor();
        }
}
