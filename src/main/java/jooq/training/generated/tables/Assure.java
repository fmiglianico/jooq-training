/**
 * This class is generated by jOOQ
 */
package jooq.training.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Assure extends org.jooq.impl.TableImpl<jooq.training.generated.tables.records.AssureRecord> {

	private static final long serialVersionUID = -1123035894;

	/**
	 * The singleton instance of <code>jooq.assure</code>
	 */
	public static final jooq.training.generated.tables.Assure ASSURE = new jooq.training.generated.tables.Assure();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.training.generated.tables.records.AssureRecord> getRecordType() {
		return jooq.training.generated.tables.records.AssureRecord.class;
	}

	/**
	 * The column <code>jooq.assure.id</code>.
	 */
	public final org.jooq.TableField<jooq.training.generated.tables.records.AssureRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jooq.assure.first_name</code>.
	 */
	public final org.jooq.TableField<jooq.training.generated.tables.records.AssureRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>jooq.assure.last_name</code>.
	 */
	public final org.jooq.TableField<jooq.training.generated.tables.records.AssureRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>jooq.assure.date_of_birth</code>.
	 */
	public final org.jooq.TableField<jooq.training.generated.tables.records.AssureRecord, java.sql.Timestamp> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>jooq.assure</code> table reference
	 */
	public Assure() {
		this("assure", null);
	}

	/**
	 * Create an aliased <code>jooq.assure</code> table reference
	 */
	public Assure(java.lang.String alias) {
		this(alias, jooq.training.generated.tables.Assure.ASSURE);
	}

	private Assure(java.lang.String alias, org.jooq.Table<jooq.training.generated.tables.records.AssureRecord> aliased) {
		this(alias, aliased, null);
	}

	private Assure(java.lang.String alias, org.jooq.Table<jooq.training.generated.tables.records.AssureRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.training.generated.Jooq.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.training.generated.tables.records.AssureRecord, java.lang.Integer> getIdentity() {
		return jooq.training.generated.Keys.IDENTITY_ASSURE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.training.generated.tables.records.AssureRecord> getPrimaryKey() {
		return jooq.training.generated.Keys.KEY_ASSURE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.training.generated.tables.records.AssureRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.training.generated.tables.records.AssureRecord>>asList(jooq.training.generated.Keys.KEY_ASSURE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.training.generated.tables.Assure as(java.lang.String alias) {
		return new jooq.training.generated.tables.Assure(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.training.generated.tables.Assure rename(java.lang.String name) {
		return new jooq.training.generated.tables.Assure(name, null);
	}
}
