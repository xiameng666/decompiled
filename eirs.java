import android.database.sqlite.SQLiteException;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

public final class eirs {
    public String a;
    public final String b;
    private static final bboh c;
    private static final byte[][] d;
    private static final int[] e;
    private static final ExperimentTokens f;
    private static final byte[][] g;
    private final Set h;
    private final String i;

    static {
        eirs.c = bboh.b("GetExperimentTokensOp", bbcu.al);
        eirs.d = new byte[0][];
        eirs.e = new int[]{14900366};
        eirs.f = ExperimentTokens.b.b();
        eirs.g = new byte[0][];
    }

    public eirs(String s, String s1, Set set0, String s2) {
        this.a = s;
        this.b = s1;
        if(set0 == null) {
            set0 = ggnj.a;
        }
        this.h = set0;
        this.i = s2;
    }

    public final ExperimentTokens a(eiox eiox0) {
        ExperimentTokens experimentTokens2;
        ExperimentTokens experimentTokens3;
        String s4;
        List list0;
        eire eire1;
        ExperimentTokens experimentTokens0;
        String s = this.i;
        String s1 = eipn.c(this.a, s);
        this.a = s1;
        String s2 = this.b;
        Set set0 = this.h;
        String s3 = s1 == null ? s2 + ":" + s + ":" + set0.hashCode() : s1 + ":" + s + ":" + set0.hashCode();
        if(hxln.d()) {
            eire eire0 = new eire(this.a, s2, s, ggfp.G(set0));
            experimentTokens0 = (ExperimentTokens)eirf.a.c.get(eire0);
            eire1 = eire0;
        }
        else {
            experimentTokens0 = (ExperimentTokens)eirf.a.b.get(s3);
            eire1 = null;
        }
        ExperimentTokens experimentTokens1 = experimentTokens0;
        if(experimentTokens1 == null) {
            gdsp.e("com/google/android/gms/phenotype/service/operations/GetExperimentTokensOperation", "executeInternal", 0xA3, "GetTokens.cacheMiss").close();
            try(eiog eiog0 = eiox0.a().a()) {
                if(eiog0.f()) {
                    boolean z = eirs.c(eiog0);
                    list0 = eirs.b(eiog0, this.a, s2, s, set0, z, true);
                }
                else {
                    list0 = this.l(eiog0);
                }
                if(!list0.isEmpty()) {
                    int v = eiox0.i.get();
                    if(v != 0) {
                        s4 = ExperimentTokens.g(list0) ? ((ExperimentTokens)list0.get(0)).c : "";
                        list0.add(new ExperimentTokens(s4, null, eirs.d, eirs.d, eirs.d, eirs.d, new int[]{v}));
                    }
                    experimentTokens1 = ExperimentTokens.e(list0);
                }
                if(eire1 == null) {
                    eirf eirf1 = eirf.a;
                    experimentTokens3 = experimentTokens1 == null ? eirs.f : experimentTokens1;
                    eirf1.b.put(s3, experimentTokens3);
                }
                else {
                    eirf eirf0 = eirf.a;
                    experimentTokens2 = experimentTokens1 == null ? eirs.f : experimentTokens1;
                    synchronized(eirf0.c) {
                        eirf0.c.put(eire1, experimentTokens2);
                        eirf0.d.add(eire1);
                    }
                }
                eiog0.e();
            }
            return experimentTokens1;
        }
        gdsp.e("com/google/android/gms/phenotype/service/operations/GetExperimentTokensOperation", "executeInternal", 0xD3, "GetTokens.cacheHit").close();
        return experimentTokens1 == eirs.f ? null : experimentTokens1;
    }

    static List b(eiog eiog0, String s, String s1, String s2, Set set0, boolean z, boolean z1) {
        eirr eirr0;
        if(".metrics".equals(s) || hxkl.b().b.contains(s1)) {
            eirr0 = eirr.c;
        }
        else if(s != null && s.startsWith("app:")) {
            eirr0 = eirr.b;
        }
        else if(hxmo.c() && eirs.p(s1, s2)) {
            eirr0 = eirr.b;
        }
        else {
            eirr0 = eirr.a;
        }
        switch(eirr0.ordinal()) {
            case 0: {
                return z1 ? eirs.n(eiog0, s1, s, s2, set0, z) : eirs.o(eiog0, s1, s, s2, set0, z);
            }
            case 1: {
                return z1 ? eirs.h(eiog0, s, s2, set0, z) : eirs.i(eiog0, s, s2, set0, z);
            }
            case 2: {
                return z1 ? eirs.j(eiog0, set0, z) : eirs.k(eiog0, set0, z);
            }
            default: {
                throw new IncompatibleClassChangeError();
            }
        }
    }

    static boolean c(eiog eiog0) {
        return eiog0.b("SELECT EXISTS(\n  SELECT NULL\n  FROM flag_overrides\n);\n").e(new String[]{"flag_overrides"}).g();
    }

    static boolean d(eiog eiog0) {
        return eiog0.b("SELECT EXISTS(\n  SELECT NULL\n  FROM experiment_states_to_overrides\n  CROSS JOIN config_packages\n    ON committed_experiment_state_id IS experiment_state_id\n  CROSS JOIN flag_overrides\n    USING (override_id)\n  WHERE flag_overrides.active IS 1\n);\n").e(new String[]{"experiment_states_to_overrides"}).g();
    }

    static boolean e(eiog eiog0) {
        return eiog0.b("SELECT EXISTS(SELECT NULL FROM FlagOverrides WHERE committed = 1)").e(new String[]{"FlagOverrides"}).g();
    }

    public final ExperimentTokens f(eiox eiox0) {
        String s = this.b;
        if(s == null && this.a == null) {
            throw new eipa(29500, "No package name or log source");
        }
        if(!this.h.isEmpty() && this.a != null) {
            throw new eipa(29500, "Can not pass a config package name and filter packages.");
        }
        if(s != null && this.a != null) {
            throw new eipa(29500, "Both package name and log source specified");
        }
        if(this.i == null) {
            throw new eipa(29500, "Calling package must be specified");
        }
        ExperimentTokens experimentTokens0 = this.a(eiox0);
        if(experimentTokens0 != null) {
            return experimentTokens0.b();
        }
        throw new eipa(29505, "No config packages for log source, or config package not registered");
    }

    private static eion g(eiog eiog0, Set set0) {
        if(!((eioh)eiog0).g("SELECT EXISTS(SELECT NULL FROM sqlite_temp_master WHERE name = ? AND type = \'table\');\n").h(new Object[]{"GetExperimentsTokensTempExcludedNames"}).e(new String[]{"sqlite_temp_master"}).g()) {
            new eiol(((eioh)eiog0).c, "CREATE TEMP TABLE GetExperimentsTokensTempExcludedNames(\nexcluded_name TEXT PRIMARY KEY\n) WITHOUT ROWID;\n", null, eior.b).d();
        }
        eion eion0 = new eion(((eioh)eiog0).c, "GetExperimentsTokensTempExcludedNames", false);
        try {
            for(Object object0: set0) {
                eion0.a("INSERT INTO GetExperimentsTokensTempExcludedNames VALUES (?)").g(new Object[]{((String)object0)}).d();
            }
            return eion0;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(eion0, throwable0);
            throw throwable0;
        }
    }

    private static List h(eiog eiog0, String s, String s1, Set set0, boolean z) {
        if(s != null) {
            s1 = s.substring(4);
        }
        try(eion eion0 = eirs.g(eiog0, set0); eioe eioe0 = ((eioh)eiog0).g("SELECT DISTINCT\n  -1 AS type,\n  \'\' AS account,\n  config_packages.experiment_token AS token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM config_packages\nINNER JOIN android_packages\n  USING (android_package_id)\nWHERE\n  android_packages.name = ?1\n  AND config_packages.name NOT IN (SELECT excluded_name FROM GetExperimentsTokensTempExcludedNames)\n\nUNION ALL\n\n/* Cross tokens */\nSELECT DISTINCT\n  cross_logged_tokens.diversion_provenance AS type,\n  \'\' AS account,\n  cross_logged_tokens.token AS token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM cross_logged_tokens\nINNER JOIN config_packages AS ToConfigPackage\n  ON cross_logged_tokens.to_config_package_id = ToConfigPackage.config_package_id\nINNER JOIN android_packages\n  ON android_packages.android_package_id = ToConfigPackage.android_package_id\nWHERE android_packages.name = ?1;\n").h(new Object[]{s1}).f()) {
            return eirs.m(eioe0, z);
        }
    }

    private static List i(eiog eiog0, String s, String s1, Set set0, boolean z) {
        if(s != null) {
            s1 = s.substring(4);
        }
        try(eion eion0 = eirs.g(eiog0, set0); eioe eioe0 = ((eioh)eiog0).g("SELECT DISTINCT\n  -1 AS type,\n  IFNULL(accounts.name, \'\') AS account,\n  filtered_states.experiment_token AS token,\n  NULL AS external_token,\n  weak_packed_experiment_ids AS weak_ids\nFROM config_packages\nINNER JOIN android_packages USING (android_package_id)\nLEFT JOIN experiment_states ON\n  committed_experiment_state_id IS experiment_states.experiment_state_id\nLEFT JOIN accounts USING (account_id)\nLEFT JOIN experiment_states AS filtered_states ON\n  experiment_states.experiment_state_id = filtered_states.experiment_state_id\n  AND\n  config_packages.name NOT IN (SELECT excluded_name FROM GetExperimentsTokensTempExcludedNames)\nWHERE android_packages.name = ?1\n\nUNION ALL\n\n/* External IDs */\nSELECT DISTINCT\n  -2 AS type,\n  \'\' AS account,\n  NULL AS token,\n  NULL AS external_token,\n  packed_experiments AS weak_ids\nFROM external_experiments\nINNER JOIN android_packages USING (android_package_id)\nWHERE android_packages.name = ?1 AND packed_experiments NOT NULL\n\nUNION ALL\n\n/* Cross tokens */\nSELECT DISTINCT\n  diversion_provenance AS type,\n  IFNULL(accounts.name, \'\') AS account,\n  token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM cross_logged_tokens\nINNER JOIN config_packages AS ToCfgPkg ON\n  to_config_package_id = ToCfgPkg.config_package_id\nINNER JOIN config_packages AS FromCfgPkg ON\n  FromCfgPkg.committed_experiment_state_id IS cross_logged_tokens.experiment_state_id\nINNER JOIN android_packages ON\n  android_packages.android_package_id = ToCfgPkg.android_package_id\nINNER JOIN experiment_states ON\n  experiment_states.experiment_state_id = cross_logged_tokens.experiment_state_id\nLEFT JOIN experiment_states AS ToCommittedStates ON\n  ToCommittedStates.experiment_state_id IS ToCfgPkg.committed_experiment_state_id\nLEFT JOIN accounts ON ToCommittedStates.account_id IS accounts.account_id\nWHERE android_packages.name = ?1;\n").h(new Object[]{s1}).f()) {
            return eirs.m(eioe0, z);
        }
    }

    private static List j(eiog eiog0, Set set0, boolean z) {
        try(eion eion0 = eirs.g(eiog0, set0); eioe eioe0 = ((eioh)eiog0).g("SELECT DISTINCT\n  -1 AS type,\n  \'\' AS account,\n  experiment_token AS token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM config_packages\nWHERE name NOT IN (SELECT excluded_name FROM GetExperimentsTokensTempExcludedNames);\n").e(new String[]{"config_packages"}).f()) {
            return eirs.m(eioe0, z);
        }
    }

    private static List k(eiog eiog0, Set set0, boolean z) {
        try(eion eion0 = eirs.g(eiog0, set0); eioe eioe0 = ((eioh)eiog0).g("SELECT DISTINCT\n  -1 AS type,\n  IFNULL(accounts.name, \'\') AS account,\n  filtered_states.experiment_token AS token,\n  NULL AS external_token,\n  weak_packed_experiment_ids AS weak_ids\nFROM config_packages\nLEFT JOIN experiment_states\n    ON committed_experiment_state_id IS experiment_states.experiment_state_id\nLEFT JOIN experiment_states AS filtered_states\n    ON experiment_states.experiment_state_id = filtered_states.experiment_state_id\n    AND config_packages.name NOT IN (SELECT excluded_name FROM GetExperimentsTokensTempExcludedNames)\nLEFT JOIN accounts USING (account_id)\n\nUNION ALL\n\n/* External tokens / IDs*/\nSELECT DISTINCT\n  -2 AS type,\n  \'\' AS account,\n  NULL AS token,\n  external_token,\n  packed_experiments AS weak_ids\nFROM external_experiments\nWHERE external_token NOT NULL OR packed_experiments NOT NULL;\n").e(new String[]{"config_packages", "external_experiments"}).f()) {
            return eirs.m(eioe0, z);
        }
    }

    private List l(eiog eiog0) {
        byte[][] arr2_b2;
        Throwable throwable12;
        byte[][] arr2_b1;
        eiok eiok2;
        byte[][] arr2_b;
        ExperimentTokens experimentTokens0;
        int[] arr_v1;
        int[] arr_v;
        String s5;
        byte[] arr_b;
        Set set2;
        int v;
        Pair pair1;
        eiok eiok0;
        Object object1;
        HashSet hashSet1;
        Pair pair0;
        String s = this.a;
        if(s == null) {
            String s1 = this.b;
            if(hxkl.b().b.contains(s1)) {
                try(eioe eioe1 = ((eioh)eiog0).g("SELECT packageName FROM Packages").e(new String[]{"Packages"}).f()) {
                    HashSet hashSet2 = new HashSet();
                    while(true) {
                        if(!eioe1.b()) {
                            break;
                        }
                        hashSet2.add(eioe1.h(0));
                    }
                    pair0 = new Pair(hashSet2, eirr.c);
                }
            }
            else {
                String s2 = this.i;
                if(hxmo.c() && eirs.p(s1, s2)) {
                    try(eioe eioe2 = ((eioh)eiog0).g("SELECT DISTINCT packageName FROM Packages WHERE androidPackageName = ?").h(new Object[]{s2}).f()) {
                        HashSet hashSet3 = new HashSet();
                        while(true) {
                            if(!eioe2.b()) {
                                break;
                            }
                            hashSet3.add(eioe2.h(0));
                        }
                        pair0 = new Pair(hashSet3, eirr.b);
                    }
                }
                else {
                    try(eioe eioe3 = ((eioh)eiog0).g("SELECT DISTINCT LogSources.packageName FROM LogSources JOIN Packages ON LogSources.packageName = Packages.packageName WHERE logSourceName = ? AND androidPackageName = ?").h(new Object[]{s1, s2}).f()) {
                        HashSet hashSet4 = new HashSet();
                        if(eioe3.b()) {
                            while(true) {
                                hashSet4.add(eioe3.h(0));
                                if(eioe3.b()) {
                                    continue;
                                }
                                goto label_77;
                            }
                        }
                        else {
                        label_77:
                            pair0 = new Pair(hashSet4, eirr.a);
                        }
                    }
                }
            }
        }
        else if(".metrics".equals(s)) {
            try(eioa eioa0 = ((eioh)eiog0).g("SELECT packageName FROM Packages").e(new String[]{"Packages"}).c()) {
                HashSet hashSet0 = ggog.i(eioa0.a());
                while(true) {
                    if(!eioa0.b()) {
                        break;
                    }
                    hashSet0.add(eioa0.h(0));
                }
                pair0 = new Pair(hashSet0, eirr.c);
            }
        }
        else if(s.startsWith("app:")) {
            try(eioe eioe0 = ((eioh)eiog0).g("SELECT DISTINCT packageName FROM Packages WHERE androidPackageName = ?").h(new Object[]{s.substring(4)}).f()) {
                hashSet1 = new HashSet();
                while(true) {
                    if(!eioe0.b()) {
                        break;
                    }
                    hashSet1.add(eioe0.h(0));
                }
            }
            pair0 = new Pair(hashSet1, eirr.b);
        }
        else {
            pair0 = new Pair(Collections.singleton(s), eirr.a);
        }
        Set set0 = this.h;
        Set set1 = (Set)pair0.first;
        eirr eirr0 = (eirr)pair0.second;
        String s3 = this.b;
        List list0 = new ArrayList(set1.size());
        for(Object object0: set1) {
            String s4 = (String)object0;
            eipo.a(eirs.class, "getCommittedUserAndVersion", s4);
            try {
                object1 = null;
                eiok0 = ((eioh)eiog0).g("SELECT user, version FROM ApplicationStates WHERE packageName = ?").h(new Object[]{s4}).i();
            }
            catch(Throwable throwable5) {
                goto label_104;
            }
            if(eiok0 == null) {
                Trace.endSection();
                pair1 = null;
            }
            else {
                try {
                    pair1 = Pair.create(eiok0.h(0), Integer.valueOf(((int)eiok0.f(1))));
                    goto label_101;
                }
                catch(Throwable throwable6) {
                    try {
                        TWR.safeClose$NT(eiok0, throwable6);
                        throw throwable6;
                    label_101:
                        eiok0.close();
                        goto label_109;
                    }
                    catch(Throwable throwable5) {
                    }
                }
                try {
                label_104:
                    Trace.endSection();
                }
                catch(Throwable throwable7) {
                    throwable5.addSuppressed(throwable7);
                }
                throw throwable5;
            label_109:
                Trace.endSection();
            }
            if(pair1 == null) {
                v = (int)((eioh)eiog0).g("SELECT IFNULL(MAX(version), -1) FROM packages WHERE packageName = ?").h(new Object[]{s4}).b();
                if(v < 0) {
                    set2 = set0;
                    goto label_204;
                }
                else {
                    arr_b = null;
                    s5 = "";
                    goto label_141;
                }
                goto label_121;
            }
            else {
            label_121:
                String s6 = (String)pair1.first;
                Integer integer0 = (Integer)pair1.second;
                int v1 = (int)integer0;
                if(set0.contains(s4)) {
                    s5 = s6;
                    v = v1;
                    arr_b = null;
                }
                else {
                    eiok eiok1 = ((eioh)eiog0).g("SELECT experimentToken FROM ExperimentTokens WHERE user = ? AND packageName = ? AND version = ? AND isCommitted = 1").h(new Object[]{s6, s4, integer0}).i();
                    if(eiok1 == null) {
                        arr_b = null;
                    }
                    else {
                        try {
                            arr_b = eiok1.j(0);
                        }
                        catch(Throwable throwable8) {
                            TWR.safeClose$NT(eiok1, throwable8);
                            throw throwable8;
                        }
                        eiok1.close();
                    }
                    s5 = s6;
                    v = v1;
                }
            }
        label_141:
            if(arr_b == null) {
                eioa eioa1 = ((eioh)eiog0).g("SELECT experimentId FROM WeakExperimentIds WHERE packageName=?").h(new Object[]{s4}).e(new String[]{"WeakExperimentIds"}).c();
                try {
                    arr_v = new int[eioa1.a()];
                    int v2 = 0;
                    while(eioa1.b()) {
                        arr_v[v2] = (int)eioa1.f(0);
                        ++v2;
                        set0 = set0;
                    }
                }
                catch(Throwable throwable9) {
                    TWR.safeClose$NT(eioa1, throwable9);
                    throw throwable9;
                }
                set2 = set0;
                eioa1.close();
            }
            else {
                set2 = set0;
                arr_v = null;
            }
            if(eirs.e(eiog0)) {
                if(arr_v == null) {
                    arr_v1 = eirs.e;
                }
                else {
                    arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
                    arr_v1[arr_v1.length - 1] = 14900366;
                }
                experimentTokens0 = new ExperimentTokens(s5, null, eirs.d, eirs.d, eirs.d, eirs.d, arr_v1, null, null, null);
            }
            else if(eirr0 == eirr.c) {
                try {
                    arr2_b = eirs.d;
                    eiok2 = ((eioh)eiog0).g("SELECT experimentToken FROM ExternalExperimentTokens WHERE packageName = ?").h(new Object[]{s4}).i();
                    if(eiok2 == null) {
                        goto label_186;
                    }
                    else {
                        goto label_170;
                    }
                    goto label_187;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_183;
                }
                try {
                label_170:
                    arr2_b1 = ExperimentTokens.d(eiok2.h(0)).l;
                    goto label_179;
                }
                catch(Throwable throwable10) {
                    try {
                        throwable12 = throwable10;
                        eiok2.close();
                        throw throwable12;
                    }
                    catch(Throwable throwable11) {
                        try {
                            throwable12.addSuppressed(throwable11);
                            throw throwable12;
                        label_179:
                            eiok2.close();
                            arr2_b2 = arr2_b1;
                            goto label_187;
                        }
                        catch(SQLiteException sQLiteException0) {
                        }
                    }
                }
            label_183:
                ((ggtj)((ggtj)eirs.c.i()).s(sQLiteException0)).B("Could not get external experiment tokens %s", sQLiteException0);
                arr2_b2 = null;
                goto label_187;
            label_186:
                arr2_b2 = null;
            label_187:
                experimentTokens0 = new ExperimentTokens(s5, arr_b, arr2_b, arr2_b, arr2_b, arr2_b, arr_v, null, null, arr2_b2);
            }
            else {
                try(eioe eioe4 = ((eioh)eiog0).g("SELECT DISTINCT token, provenance, fromUser FROM CrossLoggedExperimentTokens WHERE isCommitted = 1 AND toPackageName = ? AND toVersion = ?").h(new Object[]{s4, v}).f()) {
                    if(eioe4.b()) {
                        object1 = new HashMap();
                        do {
                            eiqu.a(((Map)object1), Integer.valueOf(((int)eioe4.f(1))), eioe4.k(0));
                        }
                        while(eioe4.b());
                    }
                }
                experimentTokens0 = object1 == null ? new ExperimentTokens(s5, arr_b, eirs.d, eirs.d, eirs.d, eirs.d, arr_v, null, null, null) : new ExperimentTokens(s5, arr_b, eirs.q(((Collection)((Map)object1).get(Integer.valueOf(1)))), eirs.q(((Collection)((Map)object1).get(Integer.valueOf(2)))), eirs.q(((Collection)((Map)object1).get(Integer.valueOf(3)))), eirs.q(((Collection)((Map)object1).get(Integer.valueOf(4)))), arr_v, null, null, null);
            }
            object1 = experimentTokens0;
        label_204:
            if(object1 != null) {
                cjnf.a.f(s3, s4, object1.d);
                list0.add(object1);
            }
            set0 = set2;
        }
        return list0;
    }

    private static List m(eioe eioe0, boolean z) {
        byte[] arr_b2;
        ExperimentTokens experimentTokens0;
        List list0 = new ArrayList();
        while(eioe0.b()) {
            if(z) {
                String s = eioe0.h(1);
                int[] arr_v = eios.c(eioe0.j(4));
                int[] arr_v1 = eirs.e;
                if(arr_v != null) {
                    arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
                    arr_v1[arr_v1.length - 1] = 14900366;
                }
                experimentTokens0 = new ExperimentTokens(s, null, eirs.d, eirs.d, eirs.d, eirs.d, arr_v1, null, null, null);
            }
            else {
                int v = (int)eioe0.f(0);
                String s1 = eioe0.h(1);
                byte[] arr_b = eioe0.j(2);
                byte[] arr_b1 = eioe0.j(3);
                if(arr_b == null && arr_b1 == null) {
                    v = -3;
                }
                int[] arr_v2 = eios.c(eioe0.j(4));
                byte[][] arr2_b = null;
                if(v == -1) {
                    arr_b2 = arr_b;
                }
                else {
                    arr_b2 = arr_b;
                    arr_b = null;
                }
                byte[][] arr2_b1 = v == 1 ? new byte[][]{arr_b2} : eirs.d;
                byte[][] arr2_b2 = v == 2 ? new byte[][]{arr_b2} : eirs.d;
                byte[][] arr2_b3 = v == 3 ? new byte[][]{arr_b2} : eirs.d;
                byte[][] arr2_b4 = v == 4 ? new byte[][]{arr_b2} : eirs.d;
                if(arr_b2 != null) {
                    arr_v2 = null;
                }
                if(v == -2 && arr_b1 != null) {
                    arr2_b = ExperimentTokens.c(new ByteArrayInputStream(arr_b1)).l;
                }
                experimentTokens0 = new ExperimentTokens(s1, arr_b, arr2_b1, arr2_b2, arr2_b3, arr2_b4, arr_v2, null, null, arr2_b);
            }
            list0.add(experimentTokens0);
        }
        return list0;
    }

    private static List n(eiog eiog0, String s, String s1, String s2, Set set0, boolean z) {
        if(s1 != null) {
            try(eioe eioe0 = ((eioh)eiog0).g("SELECT\n  -1 AS type,\n  \'\' AS account,\n  experiment_token AS token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM config_packages\nWHERE name = ?1\n\nUNION ALL\n\n/* Cross tokens */\nSELECT DISTINCT\n  cross_logged_tokens.diversion_provenance AS type,\n  \'\' AS account,\n  cross_logged_tokens.token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM cross_logged_tokens\nINNER JOIN config_packages AS ToConfigPackage\n  ON cross_logged_tokens.to_config_package_id = ToConfigPackage.config_package_id\nWHERE ToConfigPackage.name = ?1;\n").h(new Object[]{s1}).f()) {
                return eirs.m(eioe0, z);
            }
        }
        try(eion eion0 = eirs.g(eiog0, set0); eioe eioe1 = ((eioh)eiog0).g("SELECT DISTINCT\n  -1 AS type,\n  \'\' AS account,\n  config_packages.experiment_token AS token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM config_packages\nINNER JOIN android_packages\n  USING (android_package_id)\nINNER JOIN config_packages_to_log_sources\n  USING (config_package_id)\nINNER JOIN log_sources\n  USING (log_source_id)\nWHERE\n  log_sources.name = ?1\n  AND android_packages.name = ?2\n  AND config_packages.name NOT IN (SELECT excluded_name FROM GetExperimentsTokensTempExcludedNames)\n\nUNION ALL\n\n/* Cross tokens */\nSELECT DISTINCT\n  cross_logged_tokens.diversion_provenance AS type,\n  \'\' AS account,\n  cross_logged_tokens.token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM cross_logged_tokens\nINNER JOIN config_packages AS ToConfigPackage\n  ON cross_logged_tokens.to_config_package_id = ToConfigPackage.config_package_id\nINNER JOIN android_packages\n  ON ToConfigPackage.android_package_id = android_packages.android_package_id\nINNER JOIN config_packages_to_log_sources\n  ON ToConfigPackage.config_package_id = config_packages_to_log_sources.config_package_id\nINNER JOIN log_sources\n  ON config_packages_to_log_sources.log_source_id = log_sources.log_source_id\nWHERE log_sources.name = ?1 AND android_packages.name = ?2;\n").h(new Object[]{s, s2}).f()) {
            return eirs.m(eioe1, z);
        }
    }

    private static List o(eiog eiog0, String s, String s1, String s2, Set set0, boolean z) {
        List list0;
        if(s1 != null) {
            if(s1.startsWith("__internal.")) {
                try(eiok eiok0 = ((eioh)eiog0).g("SELECT packed_experiments FROM external_experiments\nWHERE external_experiments.namespace = ? AND packed_experiments NOT NULL\n").h(new Object[]{s1.substring(11)}).i()) {
                    list0 = new ArrayList();
                    if(eiok0 != null) {
                        int[] arr_v = eios.c(eiok0.k(0));
                        list0.add(new ExperimentTokens("", null, eirs.d, eirs.d, eirs.d, eirs.d, arr_v, null, null, null));
                    }
                }
                return list0;
            }
            try(eioe eioe0 = ((eioh)eiog0).g("SELECT\n  -1 AS type,\n  IFNULL(accounts.name, \'\') AS account,\n  experiment_token AS token,\n  NULL AS external_token,\n  weak_packed_experiment_ids AS weak_ids\nFROM config_packages\nLEFT JOIN experiment_states ON\n  config_packages.committed_experiment_state_id IS experiment_states.experiment_state_id\nLEFT JOIN accounts ON\n  experiment_states.account_id = accounts.account_id\nWHERE config_packages.name = ?1\n\nUNION ALL\n\n/* Cross tokens */\nSELECT DISTINCT\n  diversion_provenance,\n  IFNULL(accounts.name, \'\'),\n  token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM cross_logged_tokens\nINNER JOIN config_packages AS ToCfgPkg ON\n  to_config_package_id = ToCfgPkg.config_package_id\nINNER JOIN config_packages AS FromCfgPkg ON\n  FromCfgPkg.committed_experiment_state_id IS cross_logged_tokens.experiment_state_id\nINNER JOIN experiment_states ON\n  experiment_states.experiment_state_id = cross_logged_tokens.experiment_state_id\nLEFT JOIN experiment_states AS ToCommittedStates ON\n  ToCommittedStates.experiment_state_id IS ToCfgPkg.committed_experiment_state_id\nLEFT JOIN accounts ON ToCommittedStates.account_id IS accounts.account_id\nWHERE ToCfgPkg.name = ?1;\n").h(new Object[]{s1}).f()) {
                return eirs.m(eioe0, z);
            }
        }
        try(eion eion0 = eirs.g(eiog0, set0); eioe eioe1 = ((eioh)eiog0).g("SELECT DISTINCT\n  -1 AS type,\n  IFNULL(accounts.name, \'\') AS account,\n  filtered_states.experiment_token AS token,\n  NULL AS external_token,\n  weak_packed_experiment_ids AS weak_ids\nFROM config_packages\nINNER JOIN android_packages USING (android_package_id)\nINNER JOIN config_packages_to_log_sources USING (config_package_id)\nINNER JOIN log_sources USING (log_source_id)\nLEFT JOIN experiment_states ON\n  committed_experiment_state_id IS experiment_states.experiment_state_id\nLEFT JOIN accounts USING (account_id)\nLEFT JOIN experiment_states AS filtered_states ON\n  experiment_states.experiment_state_id = filtered_states.experiment_state_id\n  AND\n  config_packages.name NOT IN (SELECT excluded_name FROM GetExperimentsTokensTempExcludedNames)\nWHERE log_sources.name = ?1 AND android_packages.name = ?2\n\nUNION ALL\n\n/* External IDs */\nSELECT DISTINCT\n  -2 AS type,\n  \'\' AS account,\n  NULL AS token,\n  NULL AS external_token,\n  packed_experiments AS weak_ids\nFROM external_experiments\nINNER JOIN android_packages USING (android_package_id)\nINNER JOIN external_experiments_to_log_sources USING (namespace_id)\nINNER JOIN log_sources USING (log_source_id)\nWHERE log_sources.name = ?1 AND android_packages.name = ?2 AND packed_experiments NOT NULL\n\nUNION ALL\n\n/* Cross tokens */\nSELECT DISTINCT\n  diversion_provenance AS type,\n  IFNULL(accounts.name, \'\') AS account,\n  token,\n  NULL AS external_token,\n  NULL AS weak_ids\nFROM cross_logged_tokens\nINNER JOIN config_packages AS ToCfgPkg ON\n  to_config_package_id = ToCfgPkg.config_package_id\nINNER JOIN config_packages AS FromCfgPkg ON\n  FromCfgPkg.committed_experiment_state_id IS cross_logged_tokens.experiment_state_id\nINNER JOIN experiment_states ON\n  experiment_states.experiment_state_id = cross_logged_tokens.experiment_state_id\nINNER JOIN android_packages ON\n  ToCfgPkg.android_package_id = android_packages.android_package_id\nINNER JOIN config_packages_to_log_sources AS cptls ON\n  ToCfgPkg.config_package_id = cptls.config_package_id\nINNER JOIN log_sources USING (log_source_id)\nLEFT JOIN experiment_states AS to_committed_states ON\n  to_committed_states.experiment_state_id IS ToCfgPkg.committed_experiment_state_id\nLEFT JOIN accounts ON to_committed_states.account_id IS accounts.account_id\nWHERE log_sources.name = ?1 AND android_packages.name = ?2;\n").h(new Object[]{s, s2}).f()) {
            return eirs.m(eioe1, z);
        }
    }

    private static boolean p(String s, String s1) {
        gfsx gfsx0 = hxlb.a.b().a().a("dynamic_ph_appcfg_" + eipn.b(s1));
        if(gfsx0.i()) {
            hfuo hfuo0 = ((hgfj)gfsx0.d()).b;
            return hfuo0.contains(s) || hfuo0.contains("_ALL_APP_LOG_SOURCES") || hxkx.a.b().a().b.contains(s);
        }
        return ggna.a.contains(s) || ggna.a.contains("_ALL_APP_LOG_SOURCES") || hxkx.a.b().a().b.contains(s);
    }

    private static byte[][] q(Collection collection0) {
        return collection0 == null ? eirs.g : ((byte[][])collection0.toArray(eirs.g));
    }
}

