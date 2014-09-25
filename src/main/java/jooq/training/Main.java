package jooq.training;

/*
    François Miglianico
    Presentation jOOQ
    24/09/2014
 */

import jooq.training.generated.Sequences;
import jooq.training.generated.tables.pojos.Assure;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import static jooq.training.generated.Tables.ASSURE;


public class Main {
    public static void main(String[] args) {
        Connection conn = null;

        String userName = "SA";
        String password = "";
        String url = "jdbc:hsqldb:file:d:\\hsqldbfile.mem";

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver").newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            DSLContext create = DSL.using(conn, SQLDialect.HSQLDB);
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


        int id = create.nextval(Sequences.SEQASSURE);
        create.insertInto(ASSURE, ASSURE.ID, ASSURE.FIRST_NAME, ASSURE.LAST_NAME, ASSURE.DATE_OF_BIRTH)
                .values(id, "Bastien", "Hubert", Timestamp.valueOf("1983-01-01 00:00:00"));

        int id2 = create.nextval(Sequences.SEQASSURE);
        create.insertInto(ASSURE, ASSURE.ID, ASSURE.FIRST_NAME, ASSURE.LAST_NAME, ASSURE.DATE_OF_BIRTH)
                .values(id2, "François", "Miglianico", Timestamp.valueOf("1988-10-25 00:00:00"));

        List<Assure> assures = create.fetch(ASSURE).into(Assure.class);
        for (Assure assure : assures) {
            System.out.println("Assure : " + assure.getFirstName() + " " + assure.getLastName());
        }


    }


}
