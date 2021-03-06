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
public class ElementContrat extends org.jooq.impl.TableImpl<jooq.training.generated.tables.records.ElementContratRecord> {

	private static final long serialVersionUID = 279662422;

	/**
	 * The singleton instance of <code>jooq.element_contrat</code>
	 */
	public static final jooq.training.generated.tables.ElementContrat ELEMENT_CONTRAT = new jooq.training.generated.tables.ElementContrat();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.training.generated.tables.records.ElementContratRecord> getRecordType() {
		return jooq.training.generated.tables.records.ElementContratRecord.class;
	}

	/**
	 * The column <code>jooq.element_contrat.id</code>.
	 */
	public final org.jooq.TableField<jooq.training.generated.tables.records.ElementContratRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jooq.element_contrat.conditions</code>.
	 */
	public final org.jooq.TableField<jooq.training.generated.tables.records.ElementContratRecord, java.lang.String> CONDITIONS = createField("conditions", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

	/**
	 * Create a <code>jooq.element_contrat</code> table reference
	 */
	public ElementContrat() {
		this("element_contrat", null);
	}

	/**
	 * Create an aliased <code>jooq.element_contrat</code> table reference
	 */
	public ElementContrat(java.lang.String alias) {
		this(alias, jooq.training.generated.tables.ElementContrat.ELEMENT_CONTRAT);
	}

	private ElementContrat(java.lang.String alias, org.jooq.Table<jooq.training.generated.tables.records.ElementContratRecord> aliased) {
		this(alias, aliased, null);
	}

	private ElementContrat(java.lang.String alias, org.jooq.Table<jooq.training.generated.tables.records.ElementContratRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.training.generated.Jooq.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<jooq.training.generated.tables.records.ElementContratRecord, java.lang.Integer> getIdentity() {
		return jooq.training.generated.Keys.IDENTITY_ELEMENT_CONTRAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratRecord> getPrimaryKey() {
		return jooq.training.generated.Keys.KEY_ELEMENT_CONTRAT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratRecord>>asList(jooq.training.generated.Keys.KEY_ELEMENT_CONTRAT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.training.generated.tables.ElementContrat as(java.lang.String alias) {
		return new jooq.training.generated.tables.ElementContrat(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.training.generated.tables.ElementContrat rename(java.lang.String name) {
		return new jooq.training.generated.tables.ElementContrat(name, null);
	}
}
