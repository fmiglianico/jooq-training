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
public class ContratRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.training.generated.tables.records.ContratRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer>, jooq.training.generated.tables.interfaces.IContrat {

	private static final long serialVersionUID = -2081962054;

	/**
	 * Setter for <code>jooq.contrat.id</code>.
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jooq.contrat.id</code>.
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>jooq.contrat.assure_id</code>.
	 */
	@Override
	public void setAssureId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jooq.contrat.assure_id</code>.
	 */
	@Override
	public java.lang.Integer getAssureId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>jooq.contrat.franchise</code>.
	 */
	@Override
	public void setFranchise(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>jooq.contrat.franchise</code>.
	 */
	@Override
	public java.lang.Integer getFranchise() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>jooq.contrat.limite_max</code>.
	 */
	@Override
	public void setLimiteMax(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>jooq.contrat.limite_max</code>.
	 */
	@Override
	public java.lang.Integer getLimiteMax() {
		return (java.lang.Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return jooq.training.generated.tables.Contrat.CONTRAT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return jooq.training.generated.tables.Contrat.CONTRAT.ASSURE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return jooq.training.generated.tables.Contrat.CONTRAT.FRANCHISE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return jooq.training.generated.tables.Contrat.CONTRAT.LIMITE_MAX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAssureId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getFranchise();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getLimiteMax();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContratRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContratRecord value2(java.lang.Integer value) {
		setAssureId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContratRecord value3(java.lang.Integer value) {
		setFranchise(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContratRecord value4(java.lang.Integer value) {
		setLimiteMax(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContratRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(jooq.training.generated.tables.interfaces.IContrat from) {
		setId(from.getId());
		setAssureId(from.getAssureId());
		setFranchise(from.getFranchise());
		setLimiteMax(from.getLimiteMax());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends jooq.training.generated.tables.interfaces.IContrat> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ContratRecord
	 */
	public ContratRecord() {
		super(jooq.training.generated.tables.Contrat.CONTRAT);
	}

	/**
	 * Create a detached, initialised ContratRecord
	 */
	public ContratRecord(java.lang.Integer id, java.lang.Integer assureId, java.lang.Integer franchise, java.lang.Integer limiteMax) {
		super(jooq.training.generated.tables.Contrat.CONTRAT);

		setValue(0, id);
		setValue(1, assureId);
		setValue(2, franchise);
		setValue(3, limiteMax);
	}
}
