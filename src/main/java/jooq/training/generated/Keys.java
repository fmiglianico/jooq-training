/**
 * This class is generated by jOOQ
 */
package jooq.training.generated;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>jooq</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<jooq.training.generated.tables.records.AssureRecord, java.lang.Integer> IDENTITY_ASSURE = Identities0.IDENTITY_ASSURE;
	public static final org.jooq.Identity<jooq.training.generated.tables.records.ContratRecord, java.lang.Integer> IDENTITY_CONTRAT = Identities0.IDENTITY_CONTRAT;
	public static final org.jooq.Identity<jooq.training.generated.tables.records.ElementContratRecord, java.lang.Integer> IDENTITY_ELEMENT_CONTRAT = Identities0.IDENTITY_ELEMENT_CONTRAT;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.AssureRecord> KEY_ASSURE_PRIMARY = UniqueKeys0.KEY_ASSURE_PRIMARY;
	public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ContratRecord> KEY_CONTRAT_PRIMARY = UniqueKeys0.KEY_CONTRAT_PRIMARY;
	public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratRecord> KEY_ELEMENT_CONTRAT_PRIMARY = UniqueKeys0.KEY_ELEMENT_CONTRAT_PRIMARY;
	public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratToContratRecord> KEY_ELEMENT_CONTRAT_TO_CONTRAT_PRIMARY = UniqueKeys0.KEY_ELEMENT_CONTRAT_TO_CONTRAT_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ContratRecord, jooq.training.generated.tables.records.AssureRecord> FK_CONTRAT_ASSURE = ForeignKeys0.FK_CONTRAT_ASSURE;
	public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, jooq.training.generated.tables.records.ContratRecord> FK_EC2C_CONTRAT = ForeignKeys0.FK_EC2C_CONTRAT;
	public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, jooq.training.generated.tables.records.ElementContratRecord> FK_EC2C_ELEMENT_CONTRAT = ForeignKeys0.FK_EC2C_ELEMENT_CONTRAT;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<jooq.training.generated.tables.records.AssureRecord, java.lang.Integer> IDENTITY_ASSURE = createIdentity(jooq.training.generated.tables.Assure.ASSURE, jooq.training.generated.tables.Assure.ASSURE.ID);
		public static org.jooq.Identity<jooq.training.generated.tables.records.ContratRecord, java.lang.Integer> IDENTITY_CONTRAT = createIdentity(jooq.training.generated.tables.Contrat.CONTRAT, jooq.training.generated.tables.Contrat.CONTRAT.ID);
		public static org.jooq.Identity<jooq.training.generated.tables.records.ElementContratRecord, java.lang.Integer> IDENTITY_ELEMENT_CONTRAT = createIdentity(jooq.training.generated.tables.ElementContrat.ELEMENT_CONTRAT, jooq.training.generated.tables.ElementContrat.ELEMENT_CONTRAT.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.AssureRecord> KEY_ASSURE_PRIMARY = createUniqueKey(jooq.training.generated.tables.Assure.ASSURE, jooq.training.generated.tables.Assure.ASSURE.ID);
		public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ContratRecord> KEY_CONTRAT_PRIMARY = createUniqueKey(jooq.training.generated.tables.Contrat.CONTRAT, jooq.training.generated.tables.Contrat.CONTRAT.ID);
		public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratRecord> KEY_ELEMENT_CONTRAT_PRIMARY = createUniqueKey(jooq.training.generated.tables.ElementContrat.ELEMENT_CONTRAT, jooq.training.generated.tables.ElementContrat.ELEMENT_CONTRAT.ID);
		public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratToContratRecord> KEY_ELEMENT_CONTRAT_TO_CONTRAT_PRIMARY = createUniqueKey(jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.CONTRAT_ID, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.ELEMENT_CONTRAT_ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ContratRecord, jooq.training.generated.tables.records.AssureRecord> FK_CONTRAT_ASSURE = createForeignKey(jooq.training.generated.Keys.KEY_ASSURE_PRIMARY, jooq.training.generated.tables.Contrat.CONTRAT, jooq.training.generated.tables.Contrat.CONTRAT.ASSURE_ID);
		public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, jooq.training.generated.tables.records.ContratRecord> FK_EC2C_CONTRAT = createForeignKey(jooq.training.generated.Keys.KEY_CONTRAT_PRIMARY, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.CONTRAT_ID);
		public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, jooq.training.generated.tables.records.ElementContratRecord> FK_EC2C_ELEMENT_CONTRAT = createForeignKey(jooq.training.generated.Keys.KEY_ELEMENT_CONTRAT_PRIMARY, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.ELEMENT_CONTRAT_ID);
	}
}
