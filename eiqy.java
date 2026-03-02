import android.content.Context;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.phenotype.Flag;
import jeb.synthetic.TWR;

public final class eiqy {
    public final fpjk a;
    String b;
    int c;
    String d;
    public long e;
    private final String f;
    private final boolean g;
    private final String h;
    private final eiop i;

    static {
        bboh.b("CommitToConfigurationOperation", bbcu.al);
    }

    public eiqy(fpjk fpjk0, String s) {
        this.b = null;
        this.i = null;
        gftb.check(fpjk0);
        this.f = fpjk0.c;
        this.a = fpjk0;
        this.h = s;
        this.g = true;
        this.b = fpjk0.e;
    }

    public eiqy(String s, String s1) {
        this.b = null;
        this.i = null;
        this.f = s;
        this.a = null;
        this.h = s1;
        this.g = false;
    }

    public eiqy(String s, String s1, eiop eiop0) {
        this.b = null;
        this.f = s;
        this.a = null;
        this.h = s1;
        this.i = eiop0;
        this.g = false;
    }

    final void a(eiop eiop0, String s, long v) {
        eiop0.c("INSERT OR REPLACE INTO ApplicationStates (packageName, user, version) VALUES (?, ?, ?)").g(new Object[]{this.b, s, v}).d();
    }

    public final void b(Context context0, eiox eiox0) {
        String s = this.f;
        if(s == null) {
            throw new eipa(29500, "No snapshot token");
        }
        if(!this.g || !s.isEmpty()) {
            eiop eiop0 = this.i;
            if(eiop0 == null) {
                eior eior0 = eiox0.a();
                eior0.c.beginTransaction();
                try(eioq eioq0 = new eioq(eior0, true, false)) {
                    if(!this.d(context0, eioq0, true)) {
                        return;
                    }
                }
            }
            else if(!this.d(context0, eiop0, false)) {
                return;
            }
            if(hxln.d()) {
                eiop eiop1 = this.i;
                if(eiop1 != null) {
                    this.c(eiox0, eiop1);
                    return;
                }
                try(eiog eiog0 = eiox0.a().a()) {
                    this.c(eiox0, eiog0);
                }
                return;
            }
            eirf.a.e();
        }
    }

    private final void c(eiox eiox0, eiog eiog0) {
        if((eiog0.f() ? eirs.c(eiog0) : eirs.e(eiog0))) {
            eirf.a.e();
            return;
        }
        String s = this.b;
        gftb.check(s);
        eirf.a.b(eiox0, eiog0, s);
    }

    private final boolean d(Context context0, eiop eiop0, boolean z) {
        byte[] arr_b;
        String s13;
        Double double0;
        Long long1;
        Long long0;
        int v10;
        long v9;
        long v7;
        eiok eiok2;
        String s8;
        Pair pair0;
        eiok eiok1;
        long v2;
        String s = this.f;
        if(s.startsWith("CURRENT")) {
            String[] arr_s = s.split(":", 3);
            if(arr_s.length != 3) {
                throw new eipa(29500, "Empty or malformed snapshot token: " + s);
            }
            this.d = arr_s[1];
            if(!arr_s[1].equals("") && !eipt.a(this.d, context0)) {
                throw new eipa(29500, "Invalid user");
            }
            this.b = eipn.c(arr_s[2], this.h);
            if(eiop0.f()) {
                long v1 = ((eioh)eiop0).g("SELECT IFNULL(MAX(version), -1) from config_packages WHERE name = ?1;").h(new Object[]{this.b}).b();
                if(v1 == -1L) {
                    throw new eipa(0x733F);
                }
                this.c = (int)v1;
                eiok eiok0 = ((eioh)eiop0).g("SELECT experiment_state_id\nFROM experiment_states\nINNER JOIN config_packages\n  USING (config_package_id)\nINNER JOIN accounts\n  USING (account_id)\nWHERE\n  config_packages.name = ?1\n  AND accounts.name = ?2\nORDER BY experiment_states.experiment_state_id DESC\nLIMIT 1;\n").h(new Object[]{this.b, this.d}).i();
                if(eiok0 != null) {
                    try {
                        v2 = eiok0.f(0);
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(eiok0, throwable0);
                        throw throwable0;
                    }
                    eiok0.close();
                    goto label_115;
                }
                v2 = -1L;
                goto label_115;
            }
            String s1 = this.b;
            gftb.check(s1);
            this.c = eiro.a(eiop0, s1, this.d);
            v2 = -1L;
        }
        else {
            String s2 = this.f;
            eite eite0 = eitf.a(s2, eiop0);
            if(eite0 == null) {
                throw new eipa(29500, "Empty (package not registered?) or malformed snapshot token for " + this.b + ": " + s2);
            }
            String s3 = eite0.a;
            this.d = s3;
            this.b = eite0.f;
            if(!eite0.f.equals(eite0.b)) {
                throw new eipa(29500, "Malformed snapshot token for " + this.b + ": " + s2);
            }
            this.c = eite0.c;
            if(eiop0.f()) {
                if(eite0.l) {
                    if(eite0.i != -1L && ((eioh)eiop0).g("    SELECT NOT EXISTS (\n      SELECT NULL\n      FROM experiment_states\n      INNER JOIN config_packages\n        USING (config_package_id)\n      WHERE\n        config_packages.name = ?1\n        AND experiment_state_id IS ?2\n    );\n").h(new Object[]{this.b, ((long)eite0.i)}).g()) {
                        throw new eipa(0x7367, "Stale snapshot for " + this.b + "(new configuration available)");
                    }
                    if(!((eioh)eiop0).g("SELECT EXISTS (\n  SELECT NULL\n  FROM experiment_states\n  INNER JOIN config_packages\n    USING (config_package_id)\n  INNER JOIN accounts\n    USING (account_id)\n  WHERE\n    config_packages.name = ?1\n    AND experiment_state_id > ?2\n    AND accounts.name = ?3\n);\n").h(new Object[]{this.b, ((long)eite0.k), s3}).g()) {
                        goto label_54;
                    }
                    throw new eipa(0x7366, "Stale snapshot for " + this.b + "(new configuration available)");
                }
                if(((eioh)eiop0).g("    SELECT EXISTS (\n      SELECT NULL\n      FROM ChangeCounts\n      WHERE\n        packageName = ?1\n        AND count > ?2\n    );\n").h(new Object[]{this.b, ((long)eite0.d)}).g()) {
                    throw new eipa(0x7361, "Stale snapshot for " + this.b + "(new configuration available)");
                }
                if(!((eioh)eiop0).g("    SELECT EXISTS (\n      SELECT NULL\n      FROM experiment_states\n      INNER JOIN config_packages\n        USING (config_package_id)\n      LEFT OUTER JOIN config_packages_to_experiment_states_for_migration\n        USING (config_package_id)\n      WHERE\n        config_packages.name = ?1\n        AND (\n          config_packages_to_experiment_states_for_migration.experiment_state_id IS NULL\n          OR experiment_states.experiment_state_id >\n            config_packages_to_experiment_states_for_migration.experiment_state_id\n        )\n    );\n").h(new Object[]{this.b}).g()) {
                    goto label_54;
                }
                throw new eipa(0x7368, "Stale snapshot for " + this.b + "(new configuration available)");
            }
            long v3 = eite0.d;
            String s4 = this.b;
            gftb.check(s4);
            long v4 = einw.a(eiop0, s4);
            if(v4 != v3) {
                throw new eipa(0x7362, "Stale snapshot for " + this.b + "(change count changed - expected " + v4 + "  but was " + v3 + ")");
            }
        label_54:
            if(eite0.h) {
                if(!eiop0.f()) {
                    String s5 = eite0.g;
                    String s6 = this.b;
                    gftb.check(s6);
                    eipo.a(eiqy.class, "getCommittedUserAndVersion", s6);
                    try {
                        eiok1 = ((eioh)eiop0).g("SELECT user, version FROM ApplicationStates WHERE packageName = ?").h(new Object[]{s6}).i();
                    }
                    catch(Throwable throwable1) {
                        goto label_78;
                    }
                    if(eiok1 == null) {
                        Trace.endSection();
                        pair0 = null;
                    }
                    else {
                        try {
                            pair0 = Pair.create(eiok1.h(0), Integer.valueOf(((int)eiok1.f(1))));
                            goto label_75;
                        }
                        catch(Throwable throwable2) {
                            try {
                                TWR.safeClose$NT(eiok1, throwable2);
                                throw throwable2;
                            label_75:
                                eiok1.close();
                                goto label_83;
                            }
                            catch(Throwable throwable1) {
                            }
                        }
                        try {
                        label_78:
                            Trace.endSection();
                        }
                        catch(Throwable throwable3) {
                            throwable1.addSuppressed(throwable3);
                        }
                        throw throwable1;
                    label_83:
                        Trace.endSection();
                    }
                    if(pair0 == null) {
                        s8 = "";
                    }
                    else {
                        String s7 = this.b;
                        gftb.check(s7);
                        s8 = eitf.b(eiop0, s7, ((Integer)pair0.second).intValue(), ((String)pair0.first), true);
                    }
                    if(!s5.equals(s8)) {
                        throw new eipa(0x7365, "Stale snapshot (committed configuration changed) for " + this.b);
                    }
                }
                else if(!eite0.l) {
                    try {
                        long v5 = Long.parseLong(eite0.g);
                        if(((eioh)eiop0).g("    SELECT NOT EXISTS (\n      SELECT NULL\n      FROM experiment_states\n      INNER JOIN config_packages\n        ON experiment_state_id IS committed_experiment_state_id\n      WHERE\n        config_packages.name = ?1\n        AND config_hash IS ?2\n    );\n").h(new Object[]{this.b, v5}).g()) {
                            throw new eipa(29540, "Stale snapshot for " + this.b + "(committed configuration changed)");
                        }
                    }
                    catch(NumberFormatException numberFormatException0) {
                        throw new eipa(0x734D, "Malformed snapshot token for " + this.b + ": " + this.f, numberFormatException0);
                    }
                }
                else if(!((eioh)eiop0).g("    SELECT EXISTS (\n      SELECT NULL\n      FROM config_packages\n      WHERE\n        name = ?1\n        AND committed_experiment_state_id IS ?2\n    );\n").h(new Object[]{this.b, ((long)eite0.j)}).g()) {
                    throw new eipa(0x7363, "Stale snapshot for " + this.b + "(committed configuration changed)");
                }
            }
            if(!eiop0.f()) {
                v2 = -1L;
            }
            else if(eite0.l) {
                v2 = eite0.i;
            }
            else {
                try {
                    long v6 = Long.parseLong(eite0.e);
                    eiok2 = ((eioh)eiop0).g("SELECT experiment_states.experiment_state_id\nFROM experiment_states\nINNER JOIN config_packages\n  USING (config_package_id)\nINNER JOIN config_packages_to_experiment_states_for_migration\n  USING (config_package_id)\nINNER JOIN accounts\n  USING (account_id)\nWHERE\n  config_packages.name = ?1\n  AND accounts.name = ?2\n  AND experiment_states.config_hash IS ?3\n  AND experiment_states.experiment_state_id <=\n    config_packages_to_experiment_states_for_migration.experiment_state_id\nORDER BY experiment_states.experiment_state_id DESC\nLIMIT 1;\n").h(new Object[]{this.b, this.d, v6}).i();
                }
                catch(NumberFormatException numberFormatException1) {
                    throw new eipa(0x734D, "Malformed snapshot token for " + this.b + ": " + this.f, numberFormatException1);
                }
                if(eiok2 == null) {
                    v2 = -1L;
                }
                else {
                    try {
                        v7 = eiok2.f(0);
                        goto label_107;
                    }
                    catch(Throwable throwable4) {
                        try {
                            TWR.safeClose$NT(eiok2, throwable4);
                            throw throwable4;
                        label_107:
                            eiok2.close();
                            v2 = v7;
                            goto label_115;
                        }
                        catch(NumberFormatException numberFormatException1) {
                        }
                    }
                    throw new eipa(0x734D, "Malformed snapshot token for " + this.b + ": " + this.f, numberFormatException1);
                }
            }
        }
    label_115:
        if(eiop0.f()) {
            this.e = ((eioh)eiop0).g("SELECT IFNULL(MAX(serving_version), -1) FROM experiment_states WHERE experiment_state_id = ?1;\n").h(new Object[]{v2}).b();
        }
        else {
            String s9 = this.b;
            gftb.check(s9);
            int v8 = this.c;
            String s10 = this.d;
            eiok eiok3 = ((eioh)eiop0).g("SELECT servingVersion FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").h(new Object[]{s9, v8, s10}).i();
            if(eiok3 == null) {
                v9 = -1L;
            }
            else {
                try {
                    v9 = eiok3.f(0);
                }
                catch(Throwable throwable5) {
                    TWR.safeClose$NT(eiok3, throwable5);
                    throw throwable5;
                }
                eiok3.close();
            }
            this.e = v9;
        }
        String s11 = this.b;
        gftb.check(s11);
        if(eiro.h(s11) && !this.d.equals("")) {
            throw new eipa(29500, "Can\'t commit to a user for direct boot aware package " + this.b);
        }
        if(eiop0.f()) {
            v10 = ((int)z) ^ 1;
            if(v2 != -1L) {
                if(eiop0.c("    UPDATE config_packages\n    SET committed_experiment_state_id = ?2\n    WHERE\n      name = ?1\n      AND committed_experiment_state_id IS NOT ?2;\n").g(new Object[]{this.b, v2}).b() == 0) {
                    if(((int)z) != 0) {
                        eiop0.e();
                    }
                    return false;
                }
                eiop0.c("DELETE FROM flag_overrides_to_commit\nWHERE\n  config_package_id = (\n    SELECT config_package_id FROM config_packages WHERE name = ?1)\n  AND account_id = (SELECT account_id FROM accounts WHERE name = ?2);\n").g(new Object[]{this.b, this.d}).d();
            }
            else if(eiop0.c("    UPDATE config_packages\n    SET committed_experiment_state_id = NULL\n    WHERE\n      name = ?1\n      AND committed_experiment_state_id IS NOT NULL;\n").g(new Object[]{this.b}).b() == 0) {
                if(((int)z) != 0) {
                    eiop0.e();
                }
                return false;
            }
        }
        else {
            eiop0.c("DELETE FROM Flags WHERE packageName = ? AND committed = 1").g(new Object[]{this.b}).d();
            eiop0.c("INSERT INTO Flags SELECT packageName, version, flagType, partitionId, user, name, intVal, boolVal, floatVal, stringVal, extensionVal, 1 AS committed FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 0").g(new Object[]{this.b, ((int)this.c), this.d}).d();
            String s12 = this.b;
            gftb.check(s12);
            Flag[] arr_flag = eiro.i(eiop0, s12, this.d);
            eiop0.c("DELETE FROM FlagOverrides WHERE packageName = ? AND committed = 1").g(new Object[]{this.b}).d();
            if(arr_flag != null) {
                for(int v = 0; v < arr_flag.length; ++v) {
                    Flag flag0 = arr_flag[v];
                    switch(flag0.h) {
                        case 1: {
                            long0 = flag0.b();
                            long1 = null;
                            double0 = null;
                            s13 = null;
                            arr_b = null;
                            break;
                        }
                        case 2: {
                            long1 = (long)(flag0.f() ? 1L : 0L);
                            long0 = null;
                            double0 = null;
                            s13 = null;
                            arr_b = null;
                            break;
                        }
                        case 3: {
                            double0 = flag0.a();
                            long0 = null;
                            long1 = null;
                            s13 = null;
                            arr_b = null;
                            break;
                        }
                        case 4: {
                            s13 = flag0.d();
                            long0 = null;
                            long1 = null;
                            double0 = null;
                            arr_b = null;
                            break;
                        }
                        case 5: {
                            arr_b = flag0.g();
                            long0 = null;
                            long1 = null;
                            double0 = null;
                            s13 = null;
                            break;
                        }
                        default: {
                            throw new RuntimeException("bad Flag type - should not happen!");
                        }
                    }
                    eiop0.c("INSERT OR REPLACE INTO FlagOverrides (packageName, user, name, flagType, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, 1, ?, ?, ?, ?, ?)").g(new Object[]{this.b, this.d, flag0.b, ((int)flag0.i), long0, long1, double0, s13, arr_b}).d();
                }
            }
            if(arr_flag == null) {
                eiop0.c("DELETE FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 1").g(new Object[]{this.b}).d();
                eiop0.c("INSERT INTO ExperimentTokens SELECT packageName, version, user, 1 AS isCommitted, experimentToken, serverToken, configHash, servingVersion, tokensTag, flagsHash FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").g(new Object[]{this.b, ((int)this.c), this.d}).d();
                int v11 = this.c;
                String s14 = this.d;
                eiop0.c("DELETE FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND isCommitted = 1").g(new Object[]{this.b}).d();
                eiop0.c("INSERT INTO CrossLoggedExperimentTokens SELECT fromPackageName, fromVersion, fromUser, toPackageName, toVersion, 1 AS isCommitted, token, provenance FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND fromVersion = ? AND fromUser = ? AND isCommitted = 0").g(new Object[]{this.b, v11, s14}).d();
            }
            this.a(eiop0, this.d, ((long)this.c));
            v10 = ((int)z) ^ 1;
        }
        if(1 != v10) {
            eiop0.e();
        }
        return true;
    }
}

