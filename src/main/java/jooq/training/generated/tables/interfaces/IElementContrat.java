/**
 * This class is generated by jOOQ
 */
package jooq.training.generated.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IElementContrat extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.ELEMENT_CONTRAT.ID</code>.
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.ELEMENT_CONTRAT.ID</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.ELEMENT_CONTRAT.CONDITION</code>.
	 */
	public void setCondition(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.ELEMENT_CONTRAT.CONDITION</code>.
	 */
	public java.lang.String getCondition();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IElementContrat
	 */
	public void from(jooq.training.generated.tables.interfaces.IElementContrat from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IElementContrat
	 */
	public <E extends jooq.training.generated.tables.interfaces.IElementContrat> E into(E into);
}