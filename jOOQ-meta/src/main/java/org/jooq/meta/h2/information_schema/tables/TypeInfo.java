/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.h2.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TypeInfo extends TableImpl<Record> {

    private static final long serialVersionUID = 950050407;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TYPE_INFO</code>
     */
    public static final TypeInfo TYPE_INFO = new TypeInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.TYPE_NAME</code>.
     */
    public static final TableField<Record, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.DATA_TYPE</code>.
     */
    public static final TableField<Record, Integer> DATA_TYPE = createField(DSL.name("DATA_TYPE"), org.jooq.impl.SQLDataType.INTEGER, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PRECISION</code>.
     */
    public static final TableField<Record, Integer> PRECISION = createField(DSL.name("PRECISION"), org.jooq.impl.SQLDataType.INTEGER, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PREFIX</code>.
     */
    public static final TableField<Record, String> PREFIX = createField(DSL.name("PREFIX"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.SUFFIX</code>.
     */
    public static final TableField<Record, String> SUFFIX = createField(DSL.name("SUFFIX"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PARAMS</code>.
     */
    public static final TableField<Record, String> PARAMS = createField(DSL.name("PARAMS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.AUTO_INCREMENT</code>.
     */
    public static final TableField<Record, Boolean> AUTO_INCREMENT = createField(DSL.name("AUTO_INCREMENT"), org.jooq.impl.SQLDataType.BOOLEAN, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.MINIMUM_SCALE</code>.
     */
    public static final TableField<Record, Short> MINIMUM_SCALE = createField(DSL.name("MINIMUM_SCALE"), org.jooq.impl.SQLDataType.SMALLINT, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.MAXIMUM_SCALE</code>.
     */
    public static final TableField<Record, Short> MAXIMUM_SCALE = createField(DSL.name("MAXIMUM_SCALE"), org.jooq.impl.SQLDataType.SMALLINT, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.RADIX</code>.
     */
    public static final TableField<Record, Integer> RADIX = createField(DSL.name("RADIX"), org.jooq.impl.SQLDataType.INTEGER, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.POS</code>.
     */
    public static final TableField<Record, Integer> POS = createField(DSL.name("POS"), org.jooq.impl.SQLDataType.INTEGER, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.CASE_SENSITIVE</code>.
     */
    public static final TableField<Record, Boolean> CASE_SENSITIVE = createField(DSL.name("CASE_SENSITIVE"), org.jooq.impl.SQLDataType.BOOLEAN, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.NULLABLE</code>.
     */
    public static final TableField<Record, Short> NULLABLE = createField(DSL.name("NULLABLE"), org.jooq.impl.SQLDataType.SMALLINT, TYPE_INFO, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.SEARCHABLE</code>.
     */
    public static final TableField<Record, Short> SEARCHABLE = createField(DSL.name("SEARCHABLE"), org.jooq.impl.SQLDataType.SMALLINT, TYPE_INFO, "");

    /**
     * No further instances allowed
     */
    private TypeInfo() {
        this(DSL.name("TYPE_INFO"), null);
    }

    private TypeInfo(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TypeInfo(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TypeInfo(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TYPE_INFO);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
