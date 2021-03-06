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
public class ElementContratToContrat extends org.jooq.impl.TableImpl<jooq.training.generated.tables.records.ElementContratToContratRecord> {

	private static final long serialVersionUID = 916886094;

	/**
	 * The singleton instance of <code>jooq.element_contrat_to_contrat</code>
	 */
	public static final jooq.training.generated.tables.ElementContratToContrat ELEMENT_CONTRAT_TO_CONTRAT = new jooq.training.generated.tables.ElementContratToContrat();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<jooq.training.generated.tables.records.ElementContratToContratRecord> getRecordType() {
		return jooq.training.generated.tables.records.ElementContratToContratRecord.class;
	}

	/**
	 * The column <code>jooq.element_contrat_to_contrat.contrat_id</code>.
	 */
	public final org.jooq.TableField<jooq.training.generated.tables.records.ElementContratToContratRecord, java.lang.Integer> CONTRAT_ID = createField("contrat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jooq.element_contrat_to_contrat.element_contrat_id</code>.
	 */
	public final org.jooq.TableField<jooq.training.generated.tables.records.ElementContratToContratRecord, java.lang.Integer> ELEMENT_CONTRAT_ID = createField("element_contrat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>jooq.element_contrat_to_contrat</code> table reference
	 */
	public ElementContratToContrat() {
		this("element_contrat_to_contrat", null);
	}

	/**
	 * Create an aliased <code>jooq.element_contrat_to_contrat</code> table reference
	 */
	public ElementContratToContrat(java.lang.String alias) {
		this(alias, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT);
	}

	private ElementContratToContrat(java.lang.String alias, org.jooq.Table<jooq.training.generated.tables.records.ElementContratToContratRecord> aliased) {
		this(alias, aliased, null);
	}

	private ElementContratToContrat(java.lang.String alias, org.jooq.Table<jooq.training.generated.tables.records.ElementContratToContratRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, jooq.training.generated.Jooq.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratToContratRecord> getPrimaryKey() {
		return jooq.training.generated.Keys.KEY_ELEMENT_CONTRAT_TO_CONTRAT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratToContratRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratToContratRecord>>asList(jooq.training.generated.Keys.KEY_ELEMENT_CONTRAT_TO_CONTRAT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, ?>>asList(jooq.training.generated.Keys.FK_EC2C_CONTRAT, jooq.training.generated.Keys.FK_EC2C_ELEMENT_CONTRAT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public jooq.training.generated.tables.ElementContratToContrat as(java.lang.String alias) {
		return new jooq.training.generated.tables.ElementContratToContrat(alias, this);
	}

	/**
	 * Rename this table
	 */
	public jooq.training.generated.tables.ElementContratToContrat rename(java.lang.String name) {
		return new jooq.training.generated.tables.ElementContratToContrat(name, null);
	}
}
