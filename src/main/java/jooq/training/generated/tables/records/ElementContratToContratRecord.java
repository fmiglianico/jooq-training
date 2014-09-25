/**
 * This class is generated by jOOQ
 */
package jooq.training.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElementContratToContratRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.training.generated.tables.records.ElementContratToContratRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer>, jooq.training.generated.tables.interfaces.IElementContratToContrat {

	private static final long serialVersionUID = 565025440;

	/**
	 * Setter for <code>jooq.element_contrat_to_contrat.contrat_id</code>.
	 */
	@Override
	public void setContratId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jooq.element_contrat_to_contrat.contrat_id</code>.
	 */
	@Override
	public java.lang.Integer getContratId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>jooq.element_contrat_to_contrat.element_contrat_id</code>.
	 */
	@Override
	public void setElementContratId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jooq.element_contrat_to_contrat.element_contrat_id</code>.
	 */
	@Override
	public java.lang.Integer getElementContratId() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.CONTRAT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.ELEMENT_CONTRAT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getContratId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getElementContratId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ElementContratToContratRecord value1(java.lang.Integer value) {
		setContratId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ElementContratToContratRecord value2(java.lang.Integer value) {
		setElementContratId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ElementContratToContratRecord values(java.lang.Integer value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(jooq.training.generated.tables.interfaces.IElementContratToContrat from) {
		setContratId(from.getContratId());
		setElementContratId(from.getElementContratId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends jooq.training.generated.tables.interfaces.IElementContratToContrat> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ElementContratToContratRecord
	 */
	public ElementContratToContratRecord() {
		super(jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT);
	}

	/**
	 * Create a detached, initialised ElementContratToContratRecord
	 */
	public ElementContratToContratRecord(java.lang.Integer contratId, java.lang.Integer elementContratId) {
		super(jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT);

		setValue(0, contratId);
		setValue(1, elementContratId);
	}
}
