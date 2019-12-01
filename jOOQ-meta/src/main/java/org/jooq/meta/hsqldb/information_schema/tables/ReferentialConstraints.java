/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.hsqldb.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.hsqldb.information_schema.InformationSchema;


/**
 * one row for each foreign key constraint
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferentialConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 437281025;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS</code>
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = new ReferentialConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_CATALOG = createField(DSL.name("UNIQUE_CONSTRAINT_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_SCHEMA = createField(DSL.name("UNIQUE_CONSTRAINT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_NAME = createField(DSL.name("UNIQUE_CONSTRAINT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>.
     */
    public final TableField<Record, String> MATCH_OPTION = createField(DSL.name("MATCH_OPTION"), org.jooq.impl.SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>.
     */
    public final TableField<Record, String> UPDATE_RULE = createField(DSL.name("UPDATE_RULE"), org.jooq.impl.SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>.
     */
    public final TableField<Record, String> DELETE_RULE = createField(DSL.name("DELETE_RULE"), org.jooq.impl.SQLDataType.VARCHAR(65536), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS</code> table reference
     */
    public ReferentialConstraints() {
        this(DSL.name("REFERENTIAL_CONSTRAINTS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS</code> table reference
     */
    public ReferentialConstraints(String alias) {
        this(DSL.name(alias), REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS</code> table reference
     */
    public ReferentialConstraints(Name alias) {
        this(alias, REFERENTIAL_CONSTRAINTS);
    }

    private ReferentialConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReferentialConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("one row for each foreign key constraint"));
    }

    public <O extends Record> ReferentialConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REFERENTIAL_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ReferentialConstraints as(String alias) {
        return new ReferentialConstraints(DSL.name(alias), this);
    }

    @Override
    public ReferentialConstraints as(Name alias) {
        return new ReferentialConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferentialConstraints rename(String name) {
        return new ReferentialConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferentialConstraints rename(Name name) {
        return new ReferentialConstraints(name, null);
    }
}
