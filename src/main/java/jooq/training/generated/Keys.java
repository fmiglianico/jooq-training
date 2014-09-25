/**
 * This class is generated by jOOQ
 */
package jooq.training.generated;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.AssureRecord> SYS_PK_10092 = UniqueKeys0.SYS_PK_10092;
	public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ContratRecord> SYS_PK_10098 = UniqueKeys0.SYS_PK_10098;
	public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratRecord> SYS_PK_10110 = UniqueKeys0.SYS_PK_10110;
	public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratToContratRecord> SYS_PK_10117 = UniqueKeys0.SYS_PK_10117;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ContratRecord, jooq.training.generated.tables.records.AssureRecord> FK_CONTRAT_ASSURE = ForeignKeys0.FK_CONTRAT_ASSURE;
	public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, jooq.training.generated.tables.records.ContratRecord> FK_EC2C_CONTRAT = ForeignKeys0.FK_EC2C_CONTRAT;
	public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, jooq.training.generated.tables.records.ElementContratRecord> FK_EC2C_ELEMENT_CONTRAT = ForeignKeys0.FK_EC2C_ELEMENT_CONTRAT;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.AssureRecord> SYS_PK_10092 = createUniqueKey(jooq.training.generated.tables.Assure.ASSURE, jooq.training.generated.tables.Assure.ASSURE.ID);
		public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ContratRecord> SYS_PK_10098 = createUniqueKey(jooq.training.generated.tables.Contrat.CONTRAT, jooq.training.generated.tables.Contrat.CONTRAT.ID);
		public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratRecord> SYS_PK_10110 = createUniqueKey(jooq.training.generated.tables.ElementContrat.ELEMENT_CONTRAT, jooq.training.generated.tables.ElementContrat.ELEMENT_CONTRAT.ID);
		public static final org.jooq.UniqueKey<jooq.training.generated.tables.records.ElementContratToContratRecord> SYS_PK_10117 = createUniqueKey(jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.CONTRAT_ID, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.ELEMENT_CONTRAT_ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ContratRecord, jooq.training.generated.tables.records.AssureRecord> FK_CONTRAT_ASSURE = createForeignKey(jooq.training.generated.Keys.SYS_PK_10092, jooq.training.generated.tables.Contrat.CONTRAT, jooq.training.generated.tables.Contrat.CONTRAT.ASSURE_ID);
		public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, jooq.training.generated.tables.records.ContratRecord> FK_EC2C_CONTRAT = createForeignKey(jooq.training.generated.Keys.SYS_PK_10098, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.CONTRAT_ID);
		public static final org.jooq.ForeignKey<jooq.training.generated.tables.records.ElementContratToContratRecord, jooq.training.generated.tables.records.ElementContratRecord> FK_EC2C_ELEMENT_CONTRAT = createForeignKey(jooq.training.generated.Keys.SYS_PK_10110, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT, jooq.training.generated.tables.ElementContratToContrat.ELEMENT_CONTRAT_TO_CONTRAT.ELEMENT_CONTRAT_ID);
	}
}