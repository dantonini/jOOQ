/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.db.h2.tables;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.db.h2.Indexes;
import org.jooq.example.db.h2.Keys;
import org.jooq.example.db.h2.Public;
import org.jooq.example.db.h2.tables.records.AuthorRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author extends TableImpl<AuthorRecord> {

    private static final long serialVersionUID = 43261682;

    /**
     * The reference instance of <code>PUBLIC.AUTHOR</code>
     */
    public static final Author AUTHOR = new Author();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorRecord> getRecordType() {
        return AuthorRecord.class;
    }

    /**
     * The column <code>PUBLIC.AUTHOR.ID</code>.
     */
    public final TableField<AuthorRecord, Integer> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.FIRST_NAME</code>.
     */
    public final TableField<AuthorRecord, String> FIRST_NAME = createField(DSL.name("FIRST_NAME"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.LAST_NAME</code>.
     */
    public final TableField<AuthorRecord, String> LAST_NAME = createField(DSL.name("LAST_NAME"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.DATE_OF_BIRTH</code>.
     */
    public final TableField<AuthorRecord, LocalDate> DATE_OF_BIRTH = createField(DSL.name("DATE_OF_BIRTH"), org.jooq.impl.SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.YEAR_OF_BIRTH</code>.
     */
    public final TableField<AuthorRecord, Integer> YEAR_OF_BIRTH = createField(DSL.name("YEAR_OF_BIRTH"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.ADDRESS</code>.
     */
    public final TableField<AuthorRecord, String> ADDRESS = createField(DSL.name("ADDRESS"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>PUBLIC.AUTHOR</code> table reference
     */
    public Author() {
        this(DSL.name("AUTHOR"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.AUTHOR</code> table reference
     */
    public Author(String alias) {
        this(DSL.name(alias), AUTHOR);
    }

    /**
     * Create an aliased <code>PUBLIC.AUTHOR</code> table reference
     */
    public Author(Name alias) {
        this(alias, AUTHOR);
    }

    private Author(Name alias, Table<AuthorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Author(Name alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Author(Table<O> child, ForeignKey<O, AuthorRecord> key) {
        super(child, key, AUTHOR);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_7);
    }

    @Override
    public Identity<AuthorRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AUTHOR;
    }

    @Override
    public UniqueKey<AuthorRecord> getPrimaryKey() {
        return Keys.PK_T_AUTHOR;
    }

    @Override
    public List<UniqueKey<AuthorRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthorRecord>>asList(Keys.PK_T_AUTHOR);
    }

    @Override
    public Author as(String alias) {
        return new Author(DSL.name(alias), this);
    }

    @Override
    public Author as(Name alias) {
        return new Author(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(String name) {
        return new Author(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(Name name) {
        return new Author(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, LocalDate, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
