import android.os.Trace;
import java.util.List;
import jeb.synthetic.TWR;

public final class eitf {
    public static final int a;
    private static final bboh b;
    private static final gfrx c;
    private static final gfud d;

    static {
        eitf.b = bboh.b("SnapshotTokenCommon", bbcu.al);
        eitf.c = new gfrn(' ');
        eitf.d = gfud.e(' ');
    }

    public static eite a(String s, eiog eiog0) {
        return eitf.f(s, eiog0.f());
    }

    public static String b(eiof eiof0, String s, int v, String s1, boolean z) {
        String s2;
        eiok eiok0;
        eipo.a(eiox.class, "getConfigHash", s);
        try {
            eiok0 = eiof0.b("SELECT configHash FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = ?").h(new Object[]{s, v, s1, ((int)z)}).i();
        }
        catch(Throwable throwable0) {
            goto label_12;
        }
        try {
            if(eiok0 == null) {
                goto label_6;
            }
            else {
                s2 = eiok0.h(0);
                goto label_4;
            }
            goto label_17;
        }
        catch(Throwable throwable1) {
            goto label_9;
        }
        try {
        label_4:
            eiok0.close();
            goto label_17;
        }
        catch(Throwable throwable0) {
            goto label_12;
        }
        try {
        label_6:
            s2 = "";
            goto label_17;
        }
        catch(Throwable throwable1) {
            try {
            label_9:
                TWR.safeClose$NT(eiok0, throwable1);
                throw throwable1;
            }
            catch(Throwable throwable0) {
            }
        }
        try {
        label_12:
            Trace.endSection();
        }
        catch(Throwable throwable2) {
            throwable0.addSuppressed(throwable2);
        }
        throw throwable0;
    label_17:
        Trace.endSection();
        return s2;
    }

    public static String c(String s, String s1, String s2, int v, String s3, long v1, boolean z) {
        return s + " " + s1 + " " + v + " " + v1 + " " + s3 + " " + s1 + " " + s2 + " " + (z ? "1" : "0");
    }

    public static String d(String s, String s1, eiog eiog0, boolean z) {
        eiok eiok2;
        String s3;
        long v5;
        long v4;
        long v3;
        long v2;
        long v1;
        long v;
        eiok eiok1;
        Throwable throwable2;
        eiok eiok0;
        String s2 = null;
        eipo.a(eitf.class, "getSnapshotTokenInTransaction", s);
        try {
            if(eiog0.f()) {
                eiok0 = eiog0.b("WITH CommittedState AS (\n  SELECT config_packages.config_package_id, experiment_state_id, config_hash\n  FROM experiment_states\n  INNER JOIN config_packages\n    ON (experiment_state_id IS committed_experiment_state_id)\n  INNER JOIN accounts\n    USING (account_id)\n  WHERE\n    config_packages.name = ?1\n), UncommittedState AS (\n  SELECT\n    config_packages.config_package_id,\n    experiment_states.experiment_state_id,\n    experiment_states.config_hash\n  FROM experiment_states\n  INNER JOIN config_packages\n    USING (config_package_id)\n  INNER JOIN accounts\n    USING (account_id)\n  LEFT OUTER JOIN CommittedState\n    USING (config_package_id)\n  WHERE\n    config_packages.name = ?1\n    AND accounts.name = ?2\n  ORDER BY experiment_states.experiment_state_id DESC\n  LIMIT 1\n), LatestState AS (\n  SELECT\n    config_packages.config_package_id,\n    experiment_states.experiment_state_id\n  FROM experiment_states\n  INNER JOIN config_packages\n    USING (config_package_id)\n  INNER JOIN accounts\n    USING (account_id)\n  WHERE\n    config_packages.name = ?1\n    AND accounts.name = ?2\n  ORDER BY experiment_states.experiment_state_id DESC\n  LIMIT 1\n)\nSELECT\n  config_packages.version,\n  UncommittedState.config_hash AS config_hash,\n  CommittedState.config_hash AS committed_config_hash,\n  UncommittedState.experiment_state_id,\n  CommittedState.experiment_state_id AS committed_experiment_state_id,\nLatestState.experiment_state_id\nFROM config_packages\nLEFT OUTER JOIN CommittedState\n  USING (config_package_id)\nLEFT OUTER JOIN UncommittedState\n  USING (config_package_id)\nLEFT OUTER JOIN LatestState\n  USING (config_package_id)\nWHERE config_packages.name = ?1;\n").h(new Object[]{s, s1}).e(new String[]{"CommittedState", "UncommittedState", "LatestState"}).i();
                if(eiok0 == null) {
                    goto label_5;
                }
                else {
                    goto label_11;
                }
            }
            else {
                goto label_35;
            }
            goto label_52;
        }
        catch(Throwable throwable0) {
            goto label_47;
        }
        try {
        label_5:
            ((ggtj)eitf.b.j()).B("Package not registered: %s", s);
            goto label_52;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            eiok1 = null;
            goto label_24;
        }
        try {
        label_11:
            v = eiok0.f(0);
            v1 = 0L;
            v2 = eiok0.i(1) ? 0L : eiok0.f(1);
            if(!eiok0.i(2)) {
                v1 = eiok0.f(2);
            }
            v3 = eiok0.i(3) ? -1L : eiok0.f(3);
            v4 = eiok0.i(4) ? -1L : eiok0.f(4);
            v5 = eiok0.i(5) ? -1L : eiok0.f(5);
            s3 = "1";
            goto label_30;
        }
        catch(Throwable throwable3) {
            eiok1 = eiok0;
            throwable2 = throwable3;
        }
    label_24:
        if(eiok1 != null) {
            try {
                eiok1.close();
            }
            catch(Throwable throwable4) {
                try {
                    throwable2.addSuppressed(throwable4);
                    throw throwable2;
                label_30:
                    if(!z) {
                        s3 = "0";
                    }
                    s2 = s1 + " " + s + " " + v + " 0 " + v2 + " " + s + " " + v1 + " " + s3 + " " + v3 + " " + v4 + " " + v5;
                    eiok0.close();
                    goto label_52;
                label_35:
                    eiok2 = eiog0.b("SELECT\n  IFNULL(CommittedConfigHash.configHash, \'\') AS configHash,\n  COALESCE(UncommittedToken.version, Packages.version) AS newVersion,\n  IFNULL(UncommittedToken.configHash, \'\') AS newConfigHash,\n  IFNULL(ChangeCounts.count, 0) AS changeCount\nFROM Packages\nLEFT OUTER JOIN ChangeCounts\n  USING (packageName)\nLEFT OUTER JOIN ExperimentTokens AS CommittedConfigHash\n    ON (\n        Packages.packageName = CommittedConfigHash.packageName\n        AND CommittedConfigHash.isCommitted = 1\n    )\nLEFT OUTER JOIN ApplicationStates\n    ON (\n        CommittedConfigHash.packageName = ApplicationStates.packageName\n        AND CommittedConfigHash.version = ApplicationStates.version\n        AND CommittedConfigHash.user = ApplicationStates.user\n    )\nLEFT OUTER JOIN ExperimentTokens AS UncommittedToken\n    ON (\n        Packages.packageName = UncommittedToken.packageName\n        AND UncommittedToken.version <= Packages.version\n        AND UncommittedToken.user = ?2\n        AND UncommittedToken.isCommitted = 0\n    )\nWHERE Packages.packageName = ?1\nORDER BY UncommittedToken.version DESC\nLIMIT 1;\n").h(new Object[]{s, s1}).i();
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    goto label_47;
                }
            }
        }
        throw throwable2;
        try {
        label_36:
            if(eiok2 == null) {
                ((ggtj)eitf.b.j()).B("Package not registered: %s", s);
            }
            else {
                s2 = eitf.c(s1, s, eiok2.h(0), ((int)eiok2.f(1)), eiok2.h(2), eiok2.f(3), false);
                goto label_44;
            }
            goto label_52;
        }
        catch(Throwable throwable5) {
            try {
                TWR.safeClose$NT(eiok2, throwable5);
                throw throwable5;
            label_44:
                eiok2.close();
                goto label_52;
            }
            catch(Throwable throwable0) {
            }
        }
        try {
        label_47:
            Trace.endSection();
        }
        catch(Throwable throwable6) {
            throwable0.addSuppressed(throwable6);
        }
        throw throwable0;
    label_52:
        Trace.endSection();
        return s2;
    }

    public static String e(String s) {
        eite eite0 = eitf.f(s, eiox.i());
        return eite0 == null ? "" : eite0.f;
    }

    private static eite f(String s, boolean z) {
        long v2;
        long v1;
        long v;
        boolean z2;
        if(s != null && eitf.c.l(s) >= 6) {
            List list0 = eitf.d.c((z ? 11 : 8)).n(s);
            boolean z1 = list0.size() <= 7 || ((String)list0.get(7)).equals("1");
            try {
                if(list0.size() == 11) {
                    z2 = true;
                    v = Long.parseLong(((String)list0.get(8)));
                    v1 = Long.parseLong(((String)list0.get(9)));
                    v2 = Long.parseLong(((String)list0.get(10)));
                }
                else {
                    v = -1L;
                    v1 = -1L;
                    v2 = -1L;
                    z2 = false;
                }
                return new eite(((String)list0.get(0)), ((String)list0.get(1)), Integer.parseInt(((String)list0.get(2))), Long.parseLong(((String)list0.get(3))), ((String)list0.get(4)), ((String)list0.get(5)), ((String)list0.get(6)), z1, v, v1, v2, z2);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }
}

