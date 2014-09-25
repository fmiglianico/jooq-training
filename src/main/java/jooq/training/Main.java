package jooq.training;

/*
    François Miglianico
    Presentation jOOQ
    24/09/2014
 */

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Timestamp;
import java.util.List;

import jooq.training.generated.tables.interfaces.IAssure;
import jooq.training.generated.tables.interfaces.IContrat;
import jooq.training.generated.tables.records.AssureRecord;
import jooq.training.generated.tables.records.ContratRecord;
import static jooq.training.generated.Tables.*;
import static jooq.training.generated.Keys.*;


public class Main {
    public static void main(String[] args) {
        Connection conn = null;

        String userName = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/jooq";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            doSQLStuff(create);
        } catch (Exception e) {
            // For the sake of this tutorial, let's keep exception handling simple
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    private static void doSQLStuff(final DSLContext create) {

        /****************** Creation entités ********************/

        create.insertInto(ASSURE, ASSURE.FIRST_NAME, ASSURE.LAST_NAME, ASSURE.DATE_OF_BIRTH)
                .values("Bastien", "Hubert", Timestamp.valueOf("1983-01-01 00:00:00")).execute();

        create.insertInto(ASSURE, ASSURE.FIRST_NAME, ASSURE.LAST_NAME, ASSURE.DATE_OF_BIRTH)
                .values("François", "Miglianico", Timestamp.valueOf("1988-10-25 00:00:00")).execute();

        create.insertInto(CONTRAT, CONTRAT.ASSURE_ID, CONTRAT.FRANCHISE, CONTRAT.LIMITE_MAX)
                .values(1, 100, 10000).execute();
        create.insertInto(CONTRAT, CONTRAT.ASSURE_ID, CONTRAT.FRANCHISE, CONTRAT.LIMITE_MAX)
                .values(1, 500, 100000).execute();

        create.insertInto(CONTRAT, CONTRAT.ASSURE_ID, CONTRAT.FRANCHISE, CONTRAT.LIMITE_MAX)
                .values(2, 10, 1000000).execute();
        create.insertInto(CONTRAT, CONTRAT.ASSURE_ID, CONTRAT.FRANCHISE, CONTRAT.LIMITE_MAX)
                .values(2, 20, 10000000).execute();


        /****************** Recupération entités ********************/

//        List<IAssure> assures = create.fetch(ASSURE).into(IAssure.class);
//        for (IAssure assure : assures) {
//            System.out.println("Assure : " + assure.getFirstName() + " " + assure.getLastName());
//            List<IContrat> contrats = create.select().from(CONTRAT).where(CONTRAT.ASSURE_ID.eq(assure.getId())).fetch().into(IContrat.class);
//            for (IContrat contrat : contrats) {
//                System.out.println("\tContrat " + contrat.getId() + " : Franchise = " + contrat.getFranchise() + ", Limite max = " + contrat.getLimiteMax());
//            }
//
//        }


        /****************** Recupération entités par FK********************/

        Result<AssureRecord> assuresFK = create.fetch(ASSURE);
        for (AssureRecord assure : assuresFK) {
            System.out.println("Assure : " + assure.getFirstName() + " " + assure.getLastName());
            List<ContratRecord> contrats = assure.fetchChildren(FK_CONTRAT_ASSURE);
            for (IContrat contrat : contrats) {
                System.out.println("\tContrat " + contrat.getId() + " : Franchise = " + contrat.getFranchise() + ", Limite max = " + contrat.getLimiteMax());
            }
        }

    }


}
