import android.content.Context;
import android.database.SQLException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.phenotype.Flag;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

public abstract class eiud {
    private static final bboh a;
    protected final Context b;
    protected final eiox c;
    public static final int d;
    private static final Object e;
    private static final byte[] f;
    private static final ggfp g;
    private static final byte[] h;
    private final eiox i;
    private final eiuo j;
    private final fpjt k;
    private final ibnf l;
    private final int m;

    static {
        eiud.a = bboh.b("HeterodyneSyncer", bbcu.al);
        eiud.e = new Object();
        eiud.f = new byte[0];
        eiud.g = ggnj.a;
        eiud.h = new byte[0];
    }

    public eiud(Context context0, eiox eiox0, eiox eiox1, eiuo eiuo0, fpjt fpjt0, int v, ibnf ibnf0) {
        this.b = context0;
        this.c = eiox0;
        this.i = eiox1;
        this.k = fpjt0;
        this.j = eiuo0;
        this.m = v;
        this.l = ibnf0;
    }

    private final void A(gnzv gnzv0, String s, String[] arr_s, String[] arr_s1, boolean z, hlrs hlrs0) {
        this.q(gnzv0, s, eiud.g, arr_s, arr_s1, z, hlrs0);
    }

    private static void B(eiop eiop0, String s, String s1, eiuc eiuc0, long v) {
        eitz eitz0 = new eitz(s, s1);
        Long long0 = (Long)eiuc0.c.get(eitz0);
        if(long0 == null) {
            ((ggtj)eiud.a.j()).x("Unable to update the serving_version and registration_generation for an experiment state because no experiment state was found when the request was generated.");
            return;
        }
        eity eity0 = (eity)eiuc0.d.get(s);
        if(eity0 == null) {
            ((ggtj)eiud.a.j()).x("Unable to update the serving_version and registration_generation for an experiment state because no registration_generation was found when the request was generated.");
            return;
        }
        eiop0.c("UPDATE experiment_states\nSET serving_version = ?2,\n  registration_generation = ?3\nWHERE\n  experiment_state_id = ?1\n  AND (serving_version <> ?2 OR registration_generation <> ?3);\n").g(new Object[]{long0, v, ((long)eity0.b)}).d();
    }

    private static void C(eiop eiop0, goab goab0, String s, long v) {
        if(eiop0.f()) {
            String s1 = (goab0.c == null ? goau.a : goab0.c).c;
            eiop0.c("UPDATE experiment_states\nSET serving_version = ?1\nWHERE\n  experiment_state_id = (\n    SELECT experiment_state_id\n    FROM experiment_states\n    INNER JOIN config_packages\n      USING (config_package_ID)\n    INNER JOIN accounts\n      USING (account_id)\n    WHERE\n      config_packages.name = ?2\n      AND accounts.name = ?3\n    ORDER BY experiment_state_id DESC\n  )\n  AND serving_version <> ?1\n").g(new Object[]{v, s1, s}).d();
            return;
        }
        goau goau0 = goab0.c == null ? goau.a : goab0.c;
        String s2 = goab0.d.size() <= 0 ? null : Integer.toString(eiud.k(goab0));
        Long long0 = v;
        eiop0.c("UPDATE ExperimentTokens SET flagsHash = NULL, servingVersion = ?, configHash = IFNULL(?, configHash) WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").g(new Object[]{long0, s2, goau0.c, ((long)goau0.d), s}).d();
        eiop0.c("INSERT OR IGNORE INTO ExperimentTokens (packageName, user, servingVersion, version, configHash, serverToken, experimentToken, isCommitted) VALUES (?, ?, ?, ?, ?, \'\', zeroblob(0), 0)").g(new Object[]{goau0.c, s, long0, ((long)goau0.d), s2}).d();
    }

    private static boolean D(String s) {
        return s.endsWith("@google.com");
    }

    private final int E(File file0) {
        String[] arr_s = file0.list();
        int v = 0;
        if(arr_s != null) {
            int v1 = 0;
            while(v < arr_s.length) {
                String s = arr_s[v];
                if(s != null) {
                    arr_s[v] = null;
                    File file1 = new File(file0, s);
                    if(file1.isDirectory()) {
                        v1 += this.E(file1);
                    }
                    if(!file1.delete()) {
                        ((ggtj)eiud.a.j()).B("Failed to delete shared storage file for %s", null);
                        ++v1;
                    }
                }
                ++v;
            }
            v = v1;
        }
        if(!file0.delete()) {
            ((ggtj)eiud.a.j()).B("Failed to delete shared storage directory for %s", null);
        }
        return v;
    }

    private static final void F(eiop eiop0, String s, long v, String s1, long v1) {
        eiop0.c("DELETE FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND partitionId = ? AND committed = 0").g(new Object[]{s, v, s1, v1}).d();
    }

    private static final Set G(eiog eiog0) {
        Set set0;
        if(eiog0.f()) {
            try(eioe eioe0 = eiog0.b("With CommittedIds AS (\n  SELECT DISTINCT experiment_states.account_id FROM config_packages\n  INNER JOIN experiment_states ON (experiment_state_id IS committed_experiment_state_id)\n)\nSELECT accounts.name FROM accounts INNER JOIN CommittedIds\nUSING (account_id) WHERE accounts.name != ?1 AND accounts.name != ?2;\n").h(new Object[]{"", "*"}).e(new String[]{"config_packages"}).f()) {
                ggfn ggfn0 = new ggfn();
                while(true) {
                    if(!eioe0.b()) {
                        break;
                    }
                    ggfn0.i(eioe0.h(0));
                }
                return ggfn0.h();
            }
        }
        try(eioa eioa0 = eiog0.b("SELECT user FROM ApplicationStates").d().c()) {
            set0 = new HashSet(eioa0.a());
            while(true) {
                if(!eioa0.b()) {
                    break;
                }
                set0.add(eioa0.h(0));
            }
        }
        return set0;
    }

    private static final byte[] H(eiog eiog0) {
        byte[] arr_b1;
        byte[] arr_b;
        if(eiog0.f()) {
            eiok eiok0 = ((eioh)eiog0).g("SELECT token FROM dogfood_token WHERE token_key = 0;").i();
            if(eiok0 != null) {
                try {
                    arr_b = eiok0.j(0);
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(eiok0, throwable0);
                    throw throwable0;
                }
                if(arr_b != null) {
                    eiok0.close();
                    return arr_b;
                }
            }
            if(eiok0 != null) {
                eiok0.close();
                return eiud.f;
            }
        }
        else {
            eiok eiok1 = ((eioh)eiog0).g("SELECT token FROM DogfoodsToken").d().i();
            if(eiok1 != null) {
                try {
                    arr_b1 = eiok1.j(0);
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(eiok1, throwable1);
                    throw throwable1;
                }
                if(arr_b1 != null) {
                    eiok1.close();
                    return arr_b1;
                }
            }
            if(eiok1 != null) {
                eiok1.close();
            }
        }
        return eiud.f;
    }

    private static final long I(eiop eiop0, String s, goas goas0, fple fple0, Map map0, long v, String s1) {
        String s4;
        int v9;
        String s3;
        fpkw fpkw0;
        eiua eiua0 = new eiua(v, (goas0.b == null ? goat.a : goas0.b).d, goas0);
        Long long0 = (Long)map0.get(eiua0);
        if(long0 != null) {
            return (long)long0;
        }
        try {
            ggga ggga0 = new ggga(ggmi.a);
            Iterator iterator0 = goas0.c.iterator();
            while(true) {
                int v1 = 1;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                goap goap0 = (goap)object0;
                long v2 = fpkw.d(goap0.c);
                String s2 = v2 == 0L ? goap0.c : null;
                int v3 = goap0.i;
                int v4 = goao.a(v3) == 0 ? 1 : goao.a(v3);
                switch(v4 - 1) {
                    case 1: {
                        fpkw0 = new fpkw(v2, s2, 2, goap0.d, null);
                        break;
                    }
                    case 2: {
                        fpkw0 = new fpkw(v2, s2, ((int)goap0.e), 0L, null);
                        break;
                    }
                    case 3: {
                        fpkw0 = new fpkw(v2, s2, 3, Double.doubleToRawLongBits(goap0.f), null);
                        break;
                    }
                    case 4: {
                        fpkw0 = new fpkw(v2, s2, 4, 0L, goap0.g);
                        break;
                    }
                    default: {
                        if(v4 - 1 != 5) {
                            int v5 = goao.a(v3);
                            if(v5 != 0) {
                                v1 = v5;
                            }
                            throw new IllegalArgumentException("Unrecognized flag value type " + (v1 - 1) + " for name " + goap0.c + " Was forced: " + goap0.j);
                        }
                        fpkw0 = new fpkw(v2, s2, 5, 0L, (goap0.h == null ? goam.a : goap0.h).c);
                    }
                }
                ggga0.o(fpkw0);
            }
            fpkx fpkx0 = new fpkx(ggga0.n());
            Objects.requireNonNull(fpkx0);
            byte[] arr_b = fple0.a(new eitu(fpkx0));
            byte[] arr_b1 = (goas0.b == null ? goat.a : goas0.b).d.toByteArray();
            Long long1 = v;
            long v6 = ((eioh)eiop0).g("  SELECT IFNULL(MAX(param_partition_id), -1)\n  FROM param_partitions\n  WHERE\n    static_config_package_id = ?1\n    AND tag = ?2\n    AND flags_content = ?3;\n").h(new Object[]{long1, arr_b1, arr_b}).b();
            if(v6 == -1L) {
                v6 = eiop0.c("INSERT INTO param_partitions (static_config_package_id, tag, flags_content)\nVALUES (?1, ?2, ?3);\n").g(new Object[]{long1, arr_b1, arr_b}).c();
            }
            map0.put(eiua0, Long.valueOf(v6));
            if(!hxku.c() || eiop0.a() < 0x40BL) {
                return v6;
            }
            ggdy ggdy0 = new ggdy();
            Iterator iterator1 = goas0.c.iterator();
            while(true) {
                if(!iterator1.hasNext()) {
                    if(((Flag[])ggdy0.h().toArray(new Flag[0])).length > 0) {
                        eitb.a(eiop0, s, s1, ((Flag[])ggdy0.h().toArray(new Flag[0])), false);
                    }
                    return v6;
                }
                Object object1 = iterator1.next();
                goap goap1 = (goap)object1;
                if(goap1.j) {
                    int v7 = goap1.i;
                    int v8 = goao.a(v7) == 0 ? 1 : goao.a(v7);
                    switch(v8 - 1) {
                        case 1: {
                            s3 = String.valueOf(goap1.d);
                            v9 = 1;
                            break;
                        }
                        case 2: {
                            s3 = String.valueOf(goap1.e);
                            v9 = 2;
                            break;
                        }
                        case 3: {
                            s3 = String.valueOf(goap1.f);
                            v9 = 3;
                            break;
                        }
                        case 4: {
                            s3 = goap1.g;
                            v9 = 4;
                            break;
                        }
                        default: {
                            if(v8 - 1 == 5) {
                                s3 = Base64.encodeToString((goap1.h == null ? goam.a : goap1.h).c.toByteArray(), 0);
                                v9 = 5;
                                break;
                            }
                            else {
                                ggtj ggtj0 = (ggtj)eiud.a.j();
                                int v10 = goao.a(v7);
                                if(v10 == 0) {
                                    s4 = "UNKNOWN";
                                }
                                else {
                                    switch(v10) {
                                        case 1: {
                                            s4 = "UNKNOWN";
                                            break;
                                        }
                                        case 2: {
                                            s4 = "INT_VALUE";
                                            break;
                                        }
                                        case 3: {
                                            s4 = "BOOL_VALUE";
                                            break;
                                        }
                                        case 4: {
                                            s4 = "FLOAT64_VALUE";
                                            break;
                                        }
                                        default: {
                                            s4 = v10 == 5 ? "STRING_VALUE" : "EXTENSION_VALUE";
                                            break;
                                        }
                                    }
                                }
                                ggtj0.R("Unknown value type %s for draft flag %s", s4, goap1.c);
                                continue;
                            }
                            s3 = String.valueOf(goap1.d);
                            v9 = 1;
                            break;
                        }
                    }
                    if(s3 != null) {
                        ggdy0.i(new Flag(goap1.c, s3, v9, 0, 1));
                    }
                }
            }
        }
        catch(IOException iOException0) {
            throw new eipa(0x7340, a.a(s, "Failed to compress param partition for config package ", "."), iOException0);
        }
    }

    private static final void J(eiop eiop0, String s, long v, String s1, goaf goaf0, boolean z) {
        eiop0.c("INSERT INTO CrossLoggedExperimentTokens (fromPackageName, fromVersion, fromUser, toPackageName, toVersion, isCommitted, token, provenance) VALUES (?, ?, ?, ?, ?, ?, ?, ?)").g(new Object[]{(goaf0.b == null ? goau.a : goaf0.b).c, ((long)(goaf0.b == null ? goau.a : goaf0.b).d), s1, s, v, ((int)z), goaf0.c.toByteArray(), ((int)((goae.a(goaf0.d) == 0 ? 1 : goae.a(goaf0.d)) - 1))}).d();
    }

    private static int K(eitw eitw0) {
        if(!eitw0.b()) {
            return eitw0.a <= 0 || eitw0.c == 1 && eitw0.d == 0 || eitw0.b() || eitw0.b >= eitw0.a && eitw0.f - eitw0.g >= eitw0.f ? 1 : 10;
        }
        return 4;
    }

    private final void L(eiop eiop0, Set set0, long v, goak goak0, goal goal0, ggfp ggfp0, ggeo ggeo0, ProtoLiteBuilder hftp0, eitw eitw0, boolean z, Map map0, eiui eiui0) {
        eiud eiud0;
        Iterator iterator6;
        int v16;
        int v15;
        eiok eiok0;
        Long long9;
        String s11;
        byte[] arr_b3;
        long v14;
        long v13;
        long v12;
        goas goas2;
        String s10;
        Long long5;
        String s8;
        long v8;
        String s3;
        goab goab0;
        Long long2;
        ArrayList arrayList1;
        ArrayList arrayList0;
        eioe eioe0;
        HashMap hashMap0;
        String s;
        boolean z1;
        Long long1;
        long v1;
        eiop eiop1;
        try {
            eiop1 = eiop0;
            v1 = eiud.n(eiop1);
            if(Long.compare(v1, v) != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hlrr)hftp0.b_message).d = 7;
                ((hlrr)hftp0.b_message).b |= 2;
                throw new eipa(0x7340, String.format("Bad change count. Expecting %d, got %d", v, v1));
            }
            long v2 = goal0.e;
            Integer integer0 = (int)1;
            eiop1.c("INSERT OR REPLACE INTO LastFetch (\"key\", servertimestamp) VALUES (?, ?)").g(new Object[]{integer0, v2}).d();
            long v3 = ((eioh)eiop1).g("SELECT IFNULL(MAX(servertimestamp), 0) FROM LastFetch WHERE \"key\" = ?").h(new Object[]{integer0}).b();
            if(v3 > v2) {
                Integer integer1 = (int)2;
                if(((eioh)eiop1).g("SELECT IFNULL(MAX(servertimestamp), 0) FROM LastFetch WHERE \"key\" = ?").h(new Object[]{integer1}).b() == v3) {
                    long1 = null;
                }
                else {
                    Long long0 = v3;
                    eiop1.c("INSERT OR REPLACE INTO LastFetch (\"key\", servertimestamp) VALUES (?, ?)").g(new Object[]{integer1, long0}).d();
                    long1 = long0;
                }
            }
            else {
                long1 = null;
            }
            z1 = false;
            if(!goal0.c.isEmpty()) {
                s = z ? "ALL_USERS" : ((String)gggq.r(ggfp0));
                hashMap0 = new HashMap();
                eioe0 = ((eioh)eiop1).g("SELECT user, bytesTag FROM RequestTags").e(new String[]{"RequestTags"}).f();
                goto label_27;
            }
            goto label_53;
        }
        catch(Throwable throwable0) {
            goto label_300;
        }
    alab1:
        while(true) {
            try {
            label_27:
                if(!eioe0.b()) {
                    goto label_34;
                }
                hashMap0.put(eioe0.h(0), eioe0.k(1));
            }
            catch(Throwable throwable1) {
                try {
                    TWR.safeClose$NT(eioe0, throwable1);
                    throw throwable1;
                label_34:
                    eioe0.close();
                    byte[] arr_b = goal0.c.toByteArray();
                    if(!hashMap0.containsKey(s)) {
                        eiop1.c("INSERT INTO RequestTags (user, bytesTag) VALUES (?, ?)").g(new Object[]{s, arr_b}).d();
                    label_41:
                        if("ALL_USERS".equals(s)) {
                            ggqj ggqj0 = ggfp0.om();
                            while(ggqj0.hasNext()) {
                                Object object0 = ggqj0.next();
                                String s1 = (String)object0;
                                if(!hashMap0.containsKey(s1) || !Arrays.equals(((byte[])hashMap0.get(s1)), eiud.h)) {
                                    eiop1.c("INSERT OR REPLACE INTO RequestTags (user, bytesTag) VALUES (?, ?)").g(new Object[]{s1, eiud.h}).d();
                                }
                            }
                        }
                        else {
                            eiop1.c("DELETE FROM RequestTags WHERE user = ?").g(new Object[]{"ALL_USERS"}).d();
                        }
                        z1 = true;
                    }
                    else if(!Arrays.equals(((byte[])hashMap0.get(s)), arr_b)) {
                        eiop1.c("UPDATE RequestTags SET user = ?1, bytesTag = ?2 WHERE user = ?1").g(new Object[]{s, arr_b}).d();
                        goto label_41;
                    }
                label_53:
                    boolean z2 = goal0.b.size() > 0 || z1;
                    arrayList0 = new ArrayList();
                    arrayList1 = new ArrayList();
                    if(z2) {
                        einw.b(eiop1, "__sync");
                        long2 = (long)(v1 + 1L);
                        Iterator iterator0 = goal0.b.iterator();
                        while(true) {
                        label_60:
                            if(!iterator0.hasNext()) {
                                goto label_222;
                            }
                            Object object1 = iterator0.next();
                            goab0 = (goab)object1;
                            String s2 = (goab0.c == null ? goau.a : goab0.c).c;
                            goau goau0 = goab0.c;
                            long v4 = (goau0 == null ? goau.a : goau0).d;
                            if(goau0 == null) {
                                goau0 = goau.a;
                            }
                            s3 = eiud.x(ggeo0, goau0);
                            cjnf.a.g(s2, goab0.e);
                            goau goau1 = goab0.c;
                            String s4 = (goau1 == null ? goau.a : goau1).c;
                            if(goau1 == null) {
                                goau1 = goau.a;
                            }
                            long v5 = goau1.d;
                            for(Object object2: goab0.d) {
                                goas goas0 = (goas)object2;
                                switch(goar.a(goas0.d)) {
                                    case 0: {
                                        goto label_85;
                                    }
                                    case 3: {
                                        goto label_89;
                                    }
                                }
                                long v6 = v4;
                                String s5 = s3;
                                long v7 = v5;
                                eiop1 = eiop0;
                                goto label_98;
                            label_85:
                                v6 = v4;
                                s5 = s3;
                                v7 = v5;
                                goto label_98;
                            label_89:
                                v6 = v4;
                                s5 = s3;
                                eiop1 = eiop0;
                                eiud.F(eiop1, s4, v5, s5, (goas0.b == null ? goat.a : goas0.b).c);
                                v7 = v5;
                                eiop1.c("DELETE FROM ApplicationTags WHERE packageName = ? AND version = ? AND user = ? AND partitionId = ?").g(new Object[]{s4, v5, s5, ((long)(goas0.b == null ? goat.a : goas0.b).c)}).d();
                                s4 = s4;
                                goab0 = goab0;
                                s2 = s2;
                            label_98:
                                v5 = v7;
                                s3 = s5;
                                v4 = v6;
                            }
                            v8 = v4;
                            long v9 = v5;
                            String s6 = s2;
                            String s7 = s4;
                            int v10 = 0;
                            for(Object object3: goab0.d) {
                                goas goas1 = (goas)object3;
                                if(goar.a(goas1.d) == 3) {
                                label_174:
                                    v10 = 1;
                                }
                                else {
                                    long v11 = (goas1.b == null ? goat.a : goas1.b).c;
                                    byte[] arr_b1 = (goas1.b == null ? goat.a : goas1.b).d.toByteArray();
                                    if(arr_b1 != null && arr_b1.length != 0) {
                                        Long long3 = v9;
                                        s8 = s6;
                                        Long long4 = v11;
                                        long5 = long1;
                                        if(((eioh)eiop1).g("SELECT EXISTS(SELECT NULL FROM ApplicationTags WHERE packageName = ? AND version = ? AND partitionId = ? AND user = ? AND tag = ?)").h(new Object[]{s7, long3, long4, s3, arr_b1}).g()) {
                                            s10 = s7;
                                            goto label_168;
                                        }
                                        else {
                                            eiop1.c("INSERT OR REPLACE INTO ApplicationTags (packageName, version, partitionId, user, tag) VALUES (?, ?, ?, ?, ?)").g(new Object[]{s7, long3, long4, s3, arr_b1}).d();
                                            if(goar.a(goas1.d) != 0 && goar.a(goas1.d) != 1) {
                                                goas2 = goas1;
                                                v12 = v9;
                                                v13 = v11;
                                            }
                                            else {
                                                goas2 = goas1;
                                                v12 = v9;
                                                v13 = v11;
                                                eiud.F(eiop1, s7, v12, s3, v13);
                                            }
                                            for(Object object4: goas2.c) {
                                                goap goap0 = (goap)object4;
                                                switch((goao.a(goap0.i) == 0 ? 1 : goao.a(goap0.i)) - 1) {
                                                    case 1: {
                                                        goto label_137;
                                                    }
                                                    case 2: {
                                                        goto label_141;
                                                    }
                                                    case 3: {
                                                        goto label_145;
                                                    }
                                                    case 4: {
                                                        goto label_149;
                                                    }
                                                    case 5: {
                                                        goto label_153;
                                                    }
                                                }
                                                ((ggtj)eiud.a.j()).B("Value type not set for flag %s, ignoring", goap0.c);
                                                goto label_156;
                                            label_137:
                                                Long long6 = (long)goap0.d;
                                                Integer integer2 = (int)0;
                                                eiop1.c("INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").g(new Object[]{s7, v12, integer2, v13, s3, goap0.c, integer2, long6, null, null, null, null}).d();
                                                goto label_156;
                                            label_141:
                                                Long long7 = (long)(goap0.e ? 1L : 0L);
                                                integer2 = (int)0;
                                                eiop1.c("INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").g(new Object[]{s7, v12, integer2, v13, s3, goap0.c, integer2, null, long7, null, null, null}).d();
                                                goto label_156;
                                            label_145:
                                                Double double0 = (double)goap0.f;
                                                integer2 = (int)0;
                                                eiop1.c("INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").g(new Object[]{s7, v12, integer2, v13, s3, goap0.c, integer2, null, null, double0, null, null}).d();
                                                goto label_156;
                                            label_149:
                                                String s9 = goap0.g;
                                                integer2 = (int)0;
                                                eiop1.c("INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").g(new Object[]{s7, v12, integer2, v13, s3, goap0.c, integer2, null, null, null, s9, null}).d();
                                                goto label_156;
                                            label_153:
                                                byte[] arr_b2 = (goap0.h == null ? goam.a : goap0.h).c.toByteArray();
                                                integer2 = (int)0;
                                                eiop1.c("INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").g(new Object[]{s7, v12, integer2, v13, s3, goap0.c, integer2, null, null, null, null, arr_b2}).d();
                                            label_156:
                                                s7 = s7;
                                                v12 = v12;
                                            }
                                            v9 = v12;
                                            s6 = s8;
                                            long1 = long5;
                                            goto label_174;
                                        }
                                        goto label_165;
                                    }
                                    else {
                                    label_165:
                                        s10 = s7;
                                        s8 = s6;
                                        long5 = long1;
                                    }
                                label_168:
                                    s7 = s10;
                                    v10 = v10;
                                    s6 = s8;
                                    long1 = long5;
                                    v9 = v9;
                                }
                            }
                            v14 = goal0.e;
                            arr_b3 = goab0.h.isEmpty() ? null : goab0.h.toByteArray();
                            if((goab0.b & 8) == 0 && (goab0.b & 2) == 0 && (goab0.b & 4) == 0) {
                                eiud.C(eiop1, goab0, s3, v14);
                                s11 = s6;
                            }
                            else {
                                Long long8 = v8;
                                s11 = s6;
                                long9 = long8;
                                eiok0 = ((eioh)eiop1).g("SELECT experimentToken IS ? AND serverToken IS ? AND tokensTag IS ?, configHash FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").h(new Object[]{goab0.e.toByteArray(), goab0.f, arr_b3, s6, long8, s3}).i();
                                break alab1;
                            }
                            goto label_199;
                        }
                    }
                    else {
                        goto label_225;
                    }
                    goto label_227;
                }
                catch(Throwable throwable0) {
                    goto label_300;
                }
            }
        }
        if(eiok0 == null) {
            goto label_193;
        }
        else {
            try {
                v15 = eiok0.f(0) == 0L ? 1 : 0;
                v16 = (int)eiok0.a.d();
            }
            catch(Throwable throwable2) {
                try {
                    TWR.safeClose$NT(eiok0, throwable2);
                    throw throwable2;
                label_193:
                    v16 = 0;
                    v15 = 1;
                label_195:
                    if(eiok0 != null) {
                        eiok0.close();
                    }
                    if(v15 == 0) {
                        eiud.C(eiop1, goab0, s3, v14);
                    }
                    else {
                        goto label_203;
                    }
                label_199:
                    if(v10 == 0) {
                        arrayList0 = arrayList0;
                        long1 = long1;
                        goto label_60;
                    label_203:
                        eiop1.c("DELETE FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").g(new Object[]{s11, long9, s3}).d();
                        if(goab0.d.size() > 0) {
                            v16 = eiud.k(goab0);
                        }
                        eiop1.c("INSERT INTO ExperimentTokens (packageName, version, user, isCommitted, experimentToken, serverToken, configHash, servingVersion, tokensTag, flagsHash) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").g(new Object[]{s11, long9, s3, ((int)0), goab0.e.toByteArray(), goab0.f, Integer.toString(v16), v14, arr_b3, 0}).d();
                        goau goau2 = goab0.c == null ? goau.a : goab0.c;
                        eiop1.c("DELETE FROM CrossLoggedExperimentTokens WHERE fromUser = ? AND toPackageName = ? AND toVersion = ? AND isCommitted != 1").g(new Object[]{s3, goau2.c, ((long)goau2.d)}).d();
                        arrayList1.add(goab0);
                        for(Object object5: goab0.g) {
                            eiud.J(eiop1, s11, v8, s3, ((goaf)object5), false);
                            s11 = s11;
                            v8 = v8;
                        }
                    }
                    arrayList0.add(new gfsz(s11, goab0));
                    long1 = long1;
                    arrayList0 = arrayList0;
                    goto label_60;
                label_222:
                    ArrayList arrayList2 = arrayList0;
                    Long long10 = long2;
                    goto label_227;
                label_225:
                    arrayList2 = arrayList0;
                    long10 = null;
                label_227:
                    for(Object object6: arrayList2) {
                        einw.b(eiop1, ((String)((gfsz)object6).a));
                    }
                    iterator6 = arrayList1.iterator();
                    while(true) {
                    label_233:
                        if(!iterator6.hasNext()) {
                            if(goak0.d.size() > 0) {
                                for(Object object7: eiud.y(goak0, goal0)) {
                                    String s12 = eiud.x(ggeo0, ((goau)object7));
                                    eiop1.c("UPDATE ExperimentTokens SET servingVersion = ? WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").g(new Object[]{((long)goal0.e), ((goau)object7).c, ((long)((goau)object7).d), s12}).d();
                                }
                                HashSet hashSet0 = new HashSet();
                                for(Object object8: goak0.d) {
                                    goau goau3 = ((goaa)object8).c;
                                    if(goau3 == null) {
                                        goau3 = goau.a;
                                    }
                                    if(!goal0.f.contains(Integer.valueOf((goau3.e == null ? goag.a : goau3.e).c))) {
                                        hashSet0.add(goau3.c);
                                    }
                                }
                                for(Object object9: hashSet0) {
                                    eiop1.c("UPDATE Packages SET isSynced = 1 WHERE packageName = ?").g(new Object[]{((String)object9)}).d();
                                }
                            }
                            for(Object object10: arrayList2) {
                                String s13 = (String)((gfsz)object10).a;
                                goab goab1 = (goab)((gfsz)object10).b;
                                gftb.check(goab1);
                                String s14 = eiud.x(ggeo0, (goab1.c == null ? goau.a : goab1.c));
                                String s15 = (String)map0.get(s13);
                                if(s15 != null) {
                                    eiui0.b(goab1, s15, s14, eiop1);
                                }
                                goau goau4 = goab1.c == null ? goau.a : goab1.c;
                                set0.add(new gfsz(((int)(goau4.e == null ? goag.a : goau4.e).c), s13));
                            }
                            eiop1.e();
                            eiui0.c();
                            if(goal0.f.size() > 0) {
                                goto label_272;
                            }
                            goto label_273;
                        }
                        goto label_281;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_300;
                }
            }
        }
        goto label_195;
    label_272:
        eitw0.g = goal0.f.size();
    label_273:
        if(long1 == null) {
            eiud0 = this;
        }
        else {
            eiud0 = this;
            eiud0.f(long1.longValue());
        }
        if(long10 != null && ((long)long10) % hxly.a.f().g() == 0L) {
            eiud0.s();
        }
        return;
        try {
        label_281:
            Object object11 = iterator6.next();
            goab goab2 = (goab)object11;
            String s16 = eiud.x(ggeo0, (goab2.c == null ? goau.a : goab2.c));
            for(Object object12: goab2.g) {
                eiod eiod0 = ((eioh)eiop1).g("SELECT EXISTS (SELECT NULL FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 1)");
                goau goau5 = ((goaf)object12).b;
                String s17 = (goau5 == null ? goau.a : goau5).c;
                if(goau5 == null) {
                    goau5 = goau.a;
                }
                if(eiod0.h(new Object[]{s17, ((long)goau5.d), s16}).g()) {
                    goau goau6 = goab2.c;
                    String s18 = (goau6 == null ? goau.a : goau6).c;
                    if(goau6 == null) {
                        goau6 = goau.a;
                    }
                    eiud.J(eiop1, s18, goau6.d, s16, ((goaf)object12), true);
                }
            }
        }
        catch(Throwable throwable0) {
        label_300:
            if(goal0.f.size() > 0) {
                eitw0.g = goal0.f.size();
            }
            throw throwable0;
        }
        goto label_233;
    }

    private final void M(Set set0, ggfp ggfp0, gnzv gnzv0, String s, boolean z, ProtoLiteBuilder hftp0, eitw eitw0, ggeo ggeo0, ggfp ggfp1, boolean z1, hlrs hlrs0) {
        eion eion1;
        ggoe ggoe0;
        eioe eioe0;
        HashSet hashSet0;
        ggfp ggfp4;
        eiop eiop1;
        Iterator iterator2;
        long v12;
        Iterator iterator1;
        long v11;
        List list0;
        long v10;
        eiud eiud1;
        goal goal2;
        eiui eiui1;
        Throwable throwable12;
        gdqb gdqb1;
        eiui eiui0;
        eiop eiop0;
        hlrr hlrr2;
        Throwable throwable5;
        long v9;
        ggeo ggeo1;
        long v4;
        eiud eiud0;
        eiun eiun0;
        long v2;
        hlrv hlrv0;
        String s3;
        goak goak0;
        gdqb gdqb0;
        String s2;
        eiuc eiuc0;
        int v1;
        ProtoLiteBuilder hftp1 = hftp0;
        eitw eitw1 = eitw0;
        long v = SystemClock.elapsedRealtime();
        String s1 = z1 ? null : ((String)gggq.r(ggfp0));
        if(z1) {
            v1 = 4;
        }
        else {
            v1 = "".equals(s1) ? 2 : 3;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hlrr)hftp1.b_message).c = v1 - 1;
        ((hlrr)hftp1.b_message).b |= 1;
        Object object0 = eiud.e;
        __monitor_enter(object0);
        try {
            eiuc0 = this.t(ggfp0, gnzv0, s, z, ggeo0, ggfp1, z1, hftp1);
            s2 = TextUtils.join("+", ggeo0.g());
        }
        catch(Throwable throwable0) {
            goto label_422;
        }
        try {
            gdqb0 = gdsp.e("com/google/android/gms/phenotype/sync/HeterodyneSyncer", "sync", 885, "Send heterodyne request");
        }
        catch(IOException iOException0) {
            goto label_158;
        }
        catch(Throwable throwable1) {
            goto label_161;
        }
        try {
            goak0 = eiuc0.a;
            s3 = this.d();
            hlrv0 = (hlrv)((ProtoLiteBuilder)hlrs0).N_build();
            v2 = SystemClock.elapsedRealtime();
        }
        catch(Throwable throwable2) {
            goto label_147;
        }
        try {
            this.j();
            eiun0 = this.j.b(goak0, s2, s3, hlrv0);
            int v3 = eiun0.b;
            if(v3 > 0) {
                this.g(v3);
            }
            if(eiun0.c) {
                goto label_51;
            }
            else {
                goto label_32;
            }
            goto label_83;
        }
        catch(IOException iOException1) {
            eiud0 = this;
            v4 = v;
            goto label_109;
            try {
            label_32:
                if(z1) {
                    ggqj ggqj0 = ggeo0.g().om();
                    while(ggqj0.hasNext()) {
                        Object object1 = ggqj0.next();
                        this.e(((String)object1));
                    }
                    eitw1.g = ggfp0.size() - 1;
                    ggeo1 = ggeo0;
                }
                else {
                    ggeo1 = ggeo0;
                    String s4 = (String)ggeo1.get(gggq.r(ggfp0));
                    if(s4 != null) {
                        this.e(s4);
                    }
                    eitw1.g = 1;
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hlrr)hftp1.b_message).d = 3;
                ((hlrr)hftp1.b_message).b |= 2;
                goto label_83;
            label_51:
                ggeo1 = ggeo0;
                goal goal0 = eiun0.a;
                if(goal0 != null && goal0.f.size() > 0) {
                    for(Object object2: goal0.f) {
                        this.e(((String)ggeo1.g().v().get(((Integer)object2).intValue())));
                    }
                }
                int v5 = eiun0.d;
                if(v5 == 0) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlrr)hftp1.b_message).d = 4;
                    ((hlrr)hftp1.b_message).b |= 2;
                }
                else if(v5 < 200 || v5 >= 300) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlrr)hftp1.b_message).d = 6;
                    ((hlrr)hftp1.b_message).b |= 2;
                }
                else if(goal0 == null) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlrr)hftp1.b_message).d = 5;
                    ((hlrr)hftp1.b_message).b |= 2;
                }
                else if(goal0.f.size() > 0) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlrr)hftp1.b_message).d = 9;
                    ((hlrr)hftp1.b_message).b |= 2;
                }
            label_83:
                int v6 = eiun0.d;
                if(v6 != 200) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlrr hlrr0 = (hlrr)hftp1.b_message;
                    hlrr0.b |= 4;
                    hlrr0.e = v6;
                }
                goto label_99;
            }
            catch(IOException iOException1) {
            }
            catch(Throwable throwable3) {
                goto label_96;
            }
            eiud0 = this;
            v4 = v;
            goto label_109;
        }
        catch(Throwable throwable3) {
        label_96:
            eiud0 = this;
            v4 = v;
            goto label_119;
        }
    label_99:
        goal goal1 = eiun0.a;
        if(goal1 == null) {
            try {
                Integer integer0 = (int)((hlrr)hftp1.b_message).e;
                int v7 = hlrq.b(((hlrr)hftp1.b_message).d);
                if(v7 == 0) {
                    v7 = 1;
                }
                throw new eipa(0x7340, String.format("Null server response, http status code %d: %s", integer0, Integer.toString(v7 - 1)));
            }
            catch(IOException iOException1) {
                eiud0 = this;
                v4 = v;
                try {
                label_109:
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlrr)hftp1.b_message).d = 2;
                    ((hlrr)hftp1.b_message).b |= 2;
                    throw iOException1;
                }
                catch(Throwable throwable3) {
                }
            }
            catch(Throwable throwable3) {
                eiud0 = this;
                v4 = v;
            }
            try {
            label_119:
                long v8 = SystemClock.elapsedRealtime() - v2;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hlrr hlrr1 = (hlrr)hftp1.b_message;
                hlrr1.b |= 8;
                hlrr1.f = (int)v8;
                eiud0.i();
                throw throwable3;
            }
            catch(Throwable throwable2) {
                goto label_148;
            }
        }
        try {
            v9 = SystemClock.elapsedRealtime() - v2;
            if(!hftp1.b_message.isImmutable()) {
                goto label_131;
            }
            goto label_137;
        }
        catch(Throwable throwable2) {
            goto label_140;
        }
        try {
        label_131:
            hftp1.ensureMutable();
        }
        catch(Throwable throwable4) {
            throwable5 = throwable4;
            v4 = v;
            goto label_149;
        }
        try {
        label_137:
            hlrr2 = (hlrr)hftp1.b_message;
        }
        catch(Throwable throwable2) {
        label_140:
            v4 = v;
            goto label_148;
        }
        try {
            hlrr2.b |= 8;
            hlrr2.f = (int)v9;
            this.i();
            goto label_154;
        }
        catch(Throwable throwable2) {
        label_147:
            v4 = v;
        }
    label_148:
        throwable5 = throwable2;
        try {
        label_149:
            gdqb0.close();
            throw throwable5;
        }
        catch(Throwable throwable6) {
            try {
                throwable5.addSuppressed(throwable6);
                throw throwable5;
            }
            catch(IOException iOException0) {
                throw new eipa(0x7340, "Network error", iOException0);
            }
            catch(Throwable throwable1) {
                goto label_405;
            }
        }
        try {
        label_154:
            gdqb0.close();
            eiop0 = this.c.a().b();
        }
        catch(IOException iOException0) {
        label_158:
            v4 = v;
            throw new eipa(0x7340, "Network error", iOException0);
        }
        catch(Throwable throwable1) {
        label_161:
            v4 = v;
            goto label_405;
        }
        try {
            eiui0 = new eiui(this.b, goal1.e);
        }
        catch(Throwable throwable7) {
            try {
                v4 = v;
                eiop0.close();
                throw throwable7;
            }
            catch(Throwable throwable8) {
                try {
                    throwable7.addSuppressed(throwable8);
                    throw throwable7;
                }
                catch(IOException iOException0) {
                    throw new eipa(0x7340, "Network error", iOException0);
                }
                catch(Throwable throwable1) {
                    goto label_405;
                }
            }
        }
        try {
            gdqb1 = gdsp.e("com/google/android/gms/phenotype/sync/HeterodyneSyncer", "sync", 901, "Process heterodyne response");
        }
        catch(Throwable throwable9) {
            try {
                v4 = v;
                eiui0.close();
                throw throwable9;
            }
            catch(Throwable throwable10) {
                try {
                    throwable9.addSuppressed(throwable10);
                    throw throwable9;
                }
                catch(Throwable throwable7) {
                    goto label_338;
                }
            }
        }
        if(!goal1.d.isEmpty()) {
            try {
                try {
                    ejjz ejjz0 = new ejjz(goal1.d, ((goak0.c == null ? goac.a : goak0.c).e.isEmpty() ? null : (goak0.c == null ? goac.a : goak0.c).e));
                    this.k.b(ejjz0);
                }
                catch(eipa eipa0) {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlrr)hftp1.b_message).d = 11;
                    ((hlrr)hftp1.b_message).b |= 2;
                    throw eipa0;
                }
            }
            catch(Throwable throwable11) {
                throwable12 = throwable11;
                eiui1 = eiui0;
                v4 = v;
                goto label_325;
            }
        }
        try {
            if(eiop0.f()) {
                goto label_202;
            }
            else {
                goto label_214;
            }
            goto label_235;
        }
        catch(Throwable throwable13) {
            eiui1 = eiui0;
            v4 = v;
            goto label_263;
        }
        try {
        label_202:
            goal2 = goal1;
            eiui1 = eiui0;
            eiud.O(eiop0, set0, eiuc0, goal2, ggeo1, eitw1, eiui1);
            eitw1 = eitw0;
            eiop0 = eiop0;
            eiud1 = this;
            v4 = v;
            goto label_235;
        }
        catch(Throwable throwable13) {
            eitw1 = eitw0;
            eiop0 = eiop0;
            goto label_224;
        }
        try {
        label_214:
            eitw1 = eitw0;
            v10 = eiud.n(eiop0);
            eitw1 = eitw0;
            eiop0 = eiop0;
            eiud1 = this;
            v4 = v;
            goto label_226;
        }
        catch(Throwable throwable13) {
            eiop0 = eiop0;
            eiui1 = eiui0;
        }
    label_224:
        v4 = v;
        goto label_263;
        try {
        label_226:
            eiud1.L(eiop0, set0, v10, eiuc0.a, goal1, ggfp0, ggeo0, hftp1, eitw1, z1, eiuc0.b, eiui0);
            goal2 = goal1;
            hftp1 = hftp1;
            eiui1 = eiui0;
        }
        catch(Throwable throwable13) {
            hftp1 = hftp1;
            eiui1 = eiui0;
            goto label_263;
        }
        try {
        label_235:
            list0 = eiui1.a;
            v11 = 0L;
            iterator1 = list0.iterator();
        label_238:
            while(!iterator1.hasNext()) {
                goto label_243;
            }
        }
        catch(Throwable throwable13) {
            goto label_263;
        }
        try {
            Object object3 = iterator1.next();
            if(!((eiuh)object3).m) {
                goto label_238;
            }
            ++v11;
            goto label_238;
        label_243:
            if(!hlrs0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrs0).ensureMutable();
            }
        }
        catch(Throwable throwable14) {
            goto label_324;
        }
        try {
            hlrv hlrv1 = (hlrv)hlrs0.b_message;
            hlrv1.b |= 0x100;
            hlrv1.j = v11;
            v12 = 0L;
            iterator2 = list0.iterator();
        label_250:
            while(!iterator2.hasNext()) {
                goto label_255;
            }
        }
        catch(Throwable throwable13) {
            goto label_263;
        }
        try {
            Object object4 = iterator2.next();
            if(!((eiuh)object4).n) {
                goto label_250;
            }
            ++v12;
            goto label_250;
        label_255:
            if(!hlrs0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrs0).ensureMutable();
            }
        }
        catch(Throwable throwable14) {
            goto label_324;
        }
        try {
            hlrv hlrv2 = (hlrv)hlrs0.b_message;
            hlrv2.b |= 0x200;
            hlrv2.k = v12;
            if(hxmk.a.c().r()) {
                goto label_265;
            }
            goto label_330;
        }
        catch(Throwable throwable13) {
        }
    label_263:
        throwable12 = throwable13;
        goto label_325;
        try {
        label_265:
            ggfn ggfn0 = new ggfn();
            for(Object object5: list0) {
                eiuh eiuh0 = (eiuh)object5;
                if(eiuh0.m) {
                    ggfn0.i(new gfsz(((int)eiuh0.d), eiuh0.a));
                }
            }
            ggfp ggfp2 = ggfn0.h();
            ggfn ggfn1 = new ggfn();
            for(Object object6: list0) {
                eiuh eiuh1 = (eiuh)object6;
                if(eiuh1.n) {
                    ggfn1.i(new gfsz(((int)eiuh1.d), eiuh1.a));
                }
            }
            ggfp ggfp3 = ggfn1.h();
            Iterator iterator5 = set0.iterator();
            while(true) {
                if(!iterator5.hasNext()) {
                    goto label_330;
                }
                Object object7 = iterator5.next();
                Integer integer1 = (Integer)((gfsz)object7).a;
                String s5 = (String)((gfsz)object7).b;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hlrl.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hlrl hlrl0 = (hlrl)hftp2.b_message;
                s5.getClass();
                hlrl0.b |= 1;
                hlrl0.c = s5;
                long v13 = (long)(((int)integer1));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hlrl hlrl1 = (hlrl)hftp2.b_message;
                hlrl1.b |= 2;
                hlrl1.d = v13;
                if(ggfp2.contains(((gfsz)object7))) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hlrl hlrl2 = (hlrl)hftp2.b_message;
                    hlrl2.b |= 4;
                    hlrl2.e = true;
                }
                if(ggfp3.contains(((gfsz)object7))) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hlrl hlrl3 = (hlrl)hftp2.b_message;
                    hlrl3.b |= 8;
                    hlrl3.f = true;
                }
                if(!hlrs0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs0).ensureMutable();
                }
                hlrv hlrv3 = (hlrv)hlrs0.b_message;
                hlrl hlrl4 = (hlrl)hftp2.N_build();
                hlrl4.getClass();
                hfuo hfuo0 = hlrv3.o;
                if(!hfuo0.c()) {
                    hlrv3.o = ProtoLiteMessage.E(hfuo0);
                }
                hlrv3.o.add(hlrl4);
            }
        }
        catch(Throwable throwable14) {
        label_324:
            throwable12 = throwable14;
        }
        try {
        label_325:
            gdqb1.close();
            throw throwable12;
        }
        catch(Throwable throwable15) {
            try {
                throwable12.addSuppressed(throwable15);
                throw throwable12;
            label_330:
                gdqb1.close();
                goto label_335;
            }
            catch(Throwable throwable9) {
            }
        }
        try {
            TWR.safeClose$NT(eiui1, throwable9);
            throw throwable9;
        label_335:
            eiui1.close();
            goto label_340;
        }
        catch(Throwable throwable7) {
            try {
            label_338:
                TWR.safeClose$NT(eiop0, throwable7);
                throw throwable7;
            label_340:
                eiop0.close();
                eiow.b();
                eiox eiox0 = eiud1.i;
                if(eiox0 != null) {
                    eiop1 = eiox0.a().b();
                    goto label_345;
                }
                goto label_390;
            }
            catch(IOException iOException0) {
                throw new eipa(0x7340, "Network error", iOException0);
            }
            catch(Throwable throwable1) {
                goto label_405;
            }
        }
        try {
        label_345:
            if(eiop1.f()) {
                eion eion0 = eiop1.d("ConfigPackagesToKeep", "CREATE TEMP TABLE ConfigPackagesToKeep(name TEXT NOT NULL PRIMARY KEY) WITHOUT ROWID;\n");
                TWR.declareResource(eion0);
                TWR.useResource$NT(eion0);
                Iterator iterator6 = hxkp.b().b.iterator();
                while(true) {
                    TWR.useResource$NT(eion0);
                    if(!iterator6.hasNext()) {
                        break;
                    }
                    TWR.useResource$NT(eion0);
                    Object object8 = iterator6.next();
                    eiop1.c("INSERT OR IGNORE INTO TEMP.ConfigPackagesToKeep (name) VALUES (?1);").g(new Object[]{((String)object8)}).d();
                }
                TWR.useResource$NT(eion0);
                eiop1.c("DELETE FROM config_packages\nWHERE name NOT IN (\n  SELECT name from TEMP.ConfigPackagesToKeep\n);\n").f(new String[]{"config_packages"}).d();
            }
            else {
                ggfp4 = ggfp.G(hxkp.b().b);
                hashSet0 = new HashSet();
                eioe0 = ((eioh)eiop1).g("SELECT packageName FROM Packages").d().f();
                goto label_362;
            }
            goto label_384;
        }
        catch(Throwable throwable16) {
            goto label_387;
        }
        while(true) {
            try {
            label_362:
                if(!eioe0.b()) {
                    goto label_369;
                }
                hashSet0.add(eioe0.h(0));
            }
            catch(Throwable throwable17) {
                try {
                    TWR.safeClose$NT(eioe0, throwable17);
                    throw throwable17;
                label_369:
                    eioe0.close();
                    ggoe0 = ggog.d(hashSet0, ggfp4);
                    eion1 = eiop1.d("temp_deleted_pkgs", "CREATE TEMP TABLE temp_deleted_pkgs (packageName TEXT PRIMARY KEY) WITHOUT ROWID;\n");
                    break;
                }
                catch(Throwable throwable16) {
                    goto label_387;
                }
            }
        }
        try {
            ggqj ggqj1 = ((ggny)ggoe0).c();
            while(ggqj1.hasNext()) {
                Object object9 = ggqj1.next();
                eiop1.c("INSERT INTO temp_deleted_pkgs VALUES (?)").g(new Object[]{((String)object9)}).d();
            }
            eitk.c(eiop1);
            goto label_382;
        }
        catch(Throwable throwable18) {
            try {
                TWR.safeClose$NT(eion1, throwable18);
                throw throwable18;
            label_382:
                eion1.close();
                eiop1.c("DELETE FROM StorageInfos WHERE StorageInfos.androidPackageName NOT IN (SELECT Packages.androidPackageName FROM Packages)").e().d();
            label_384:
                eiop1.e();
                goto label_389;
            }
            catch(Throwable throwable16) {
            }
        }
        try {
        label_387:
            TWR.safeClose$NT(eiop1, throwable16);
            throw throwable16;
        label_389:
            eiop1.close();
        label_390:
            if(((hlrv)hlrs0.b_message).k > 0L) {
                if(!hlrs0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs0).ensureMutable();
                }
                ((hlrv)hlrs0.b_message).h = 5;
                ((hlrv)hlrs0.b_message).b |= 16;
                throw new eipa(0x7340, "Shared storage write failure");
            }
            if(!goal2.f.isEmpty()) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hlrr)hftp1.b_message).d = 9;
                ((hlrr)hftp1.b_message).b |= 2;
                throw new eipa(0x7340, "Partial authentication failure");
            }
            goto label_413;
        }
        catch(IOException iOException0) {
            try {
                throw new eipa(0x7340, "Network error", iOException0);
            }
            catch(Throwable throwable1) {
            }
        }
        catch(Throwable throwable1) {
        }
        try {
        label_405:
            long v14 = SystemClock.elapsedRealtime() - v4;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlrr hlrr3 = (hlrr)hftp1.b_message;
            hlrr3.b |= 16;
            hlrr3.g = (int)v14;
            eitw1.e = ggfp0.size();
            throw throwable1;
        label_413:
            long v15 = SystemClock.elapsedRealtime() - v4;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlrr hlrr4 = (hlrr)hftp1.b_message;
            hlrr4.b |= 16;
            hlrr4.g = (int)v15;
            eitw1.e = ggfp0.size();
        }
        catch(Throwable throwable0) {
        label_422:
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
    }

    private static final ProtoLiteBuilder N(eitw eitw0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlsg.a).v_newBuilder();
        int v = eitw0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hlsg)hftv0).b |= 0x20;
        ((hlsg)hftv0).g = v;
        int v1 = eitw0.a();
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hlsg)hftv1).b |= 0x40;
        ((hlsg)hftv1).h = v1;
        int v2 = eitw0.g;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hlsg)hftv2).b |= 0x80;
        ((hlsg)hftv2).i = v2;
        int v3 = eitw0.a;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((hlsg)hftv3).b |= 1;
        ((hlsg)hftv3).c = v3;
        int v4 = eitw0.b;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((hlsg)hftv4).b |= 2;
        ((hlsg)hftv4).d = v4;
        int v5 = eitw0.d;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((hlsg)hftv5).b |= 4;
        ((hlsg)hftv5).e = v5;
        int v6 = eitw0.f;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlsg hlsg0 = (hlsg)hftp0.b_message;
        hlsg0.b |= 8;
        hlsg0.f = v6;
        return hftp0;
    }

    private static final void O(eiop eiop0, Set set0, eiuc eiuc0, goal goal0, ggeo ggeo0, eitw eitw0, eiui eiui0) {
        long v21;
        goat goat4;
        Long long6;
        eiol eiol2;
        long v20;
        String s7;
        goas goas2;
        goat goat1;
        Long long5;
        eiol eiol1;
        long v16;
        HashMap hashMap5;
        gghb gghb2;
        fple fple3;
        goab goab1;
        String s6;
        long v15;
        Long long4;
        goau goau6;
        goat goat0;
        goas goas0;
        String s5;
        gghb gghb1;
        gghb gghb0;
        HashMap hashMap4;
        ArrayList arrayList2;
        HashSet hashSet1;
        eioe eioe0;
        long v13;
        ArrayList arrayList1;
        long v11;
        long v10;
        long v9;
        goau goau4;
        Long long3;
        Long long2;
        Long long1;
        String s4;
        eiol eiol0;
        String s3;
        long v8;
        eity eity0;
        goau goau3;
        ggeo ggeo3;
        long v6;
        byte[] arr_b3;
        byte[] arr_b2;
        long v4;
        int v3;
        byte[] arr_b1;
        byte[] arr_b;
        Long long0;
        HashMap hashMap3;
        goau goau2;
        ggeo ggeo2;
        long v1;
        fple fple2;
        String s2;
        Throwable throwable4;
        goau goau1;
        String s1;
        goau goau0;
        goab goab0;
        HashMap hashMap2;
        HashMap hashMap1;
        eion eion1;
        Iterator iterator1;
        HashMap hashMap0;
        ArrayList arrayList0;
        HashSet hashSet0;
        fple fple1;
        eion eion0;
        fple fple0;
        eiop eiop1 = eiop0;
        eiuc eiuc1 = eiuc0;
        goal goal1 = goal0;
        ggeo ggeo1 = ggeo0;
        try {
            fple0 = new fple();
        }
        catch(Throwable throwable0) {
            goto label_439;
        }
        try {
            eion0 = eiop1.d("OmittedConfigPackages", "CREATE TEMP TABLE OmittedConfigPackages (config_package_id INTEGER PRIMARY KEY);\n");
        }
        catch(Throwable throwable1) {
            fple1 = fple0;
            goto label_428;
        }
        try {
            hashSet0 = new HashSet();
            arrayList0 = new ArrayList();
            hashMap0 = new HashMap();
            eiop1.c("INSERT OR REPLACE INTO last_fetch (type, serving_version) VALUES (?, ?);").g(new Object[]{((int)1), ((long)goal1.e)}).d();
            goak goak0 = eiuc1.a;
        }
        catch(Throwable throwable2) {
            fple1 = fple0;
            eion1 = eion0;
            goto label_416;
        }
        if(goak0.d.size() > 0) {
            try {
                for(Object object0: eiud.y(goak0, goal1)) {
                    String s = eiud.x(ggeo1, ((goau)object0));
                    eiud.B(eiop1, ((goau)object0).c, s, eiuc1, goal1.e);
                    hashSet0.add(((goau)object0).c);
                }
            }
            catch(Throwable throwable3) {
                throwable4 = throwable3;
                fple1 = fple0;
                eion1 = eion0;
                goto label_417;
            }
        }
        try {
            iterator1 = hashSet0.iterator();
            while(true) {
            label_24:
                boolean z = iterator1.hasNext();
                break;
            }
        }
        catch(Throwable throwable2) {
            fple1 = fple0;
            eion1 = eion0;
            goto label_416;
        }
        if(z) {
            try {
                Object object1 = iterator1.next();
                eiop1.c("INSERT OR REPLACE INTO OmittedConfigPackages (config_package_id)\nSELECT config_package_id FROM config_packages WHERE name = ?1;\n").g(new Object[]{((String)object1)}).d();
            }
            catch(Throwable throwable3) {
                throwable4 = throwable3;
                fple1 = fple0;
                eion1 = eion0;
                goto label_417;
            }
            try {
                goto label_24;
            }
            catch(Throwable throwable2) {
                fple1 = fple0;
                eion1 = eion0;
                goto label_416;
            }
        }
        if(goal1.b.size() > 0) {
            try {
                hashMap1 = new HashMap();
                hashMap2 = new HashMap();
                Iterator iterator2 = goal1.b.iterator();
                while(true) {
                label_37:
                    if(!iterator2.hasNext()) {
                        goto label_359;
                    }
                    Object object2 = iterator2.next();
                    goab0 = (goab)object2;
                    goau0 = goab0.c;
                    break;
                }
            }
            catch(Throwable throwable2) {
                fple1 = fple0;
                eion1 = eion0;
                goto label_415;
            }
            if(goau0 == null) {
                try {
                    goau0 = goau.a;
                    try {
                    label_43:
                        s1 = goau0.c;
                        goau1 = goab0.c;
                    }
                    catch(Throwable throwable2) {
                        fple1 = fple0;
                        eion1 = eion0;
                        goto label_415;
                    }
                    if(goau1 == null) {
                        try {
                            goau1 = goau.a;
                            goto label_53;
                        }
                        catch(Throwable throwable3) {
                        }
                        throwable4 = throwable3;
                        fple1 = fple0;
                        eion1 = eion0;
                        goto label_417;
                    }
                    goto label_53;
                }
                catch(Throwable throwable3) {
                    throwable4 = throwable3;
                    fple1 = fple0;
                    eion1 = eion0;
                    goto label_417;
                }
            }
            goto label_43;
            try {
            label_53:
                s2 = eiud.x(ggeo1, goau1);
                boolean z1 = hashMap2.containsKey(s1);
            }
            catch(Throwable throwable2) {
                try {
                    fple1 = fple0;
                    eion1 = eion0;
                }
                catch(Throwable throwable2) {
                }
                goto label_415;
            }
            if(z1) {
                fple2 = fple0;
            }
            else {
                fple2 = fple0;
                try {
                    long v = ((eioh)eiop1).g("SELECT IFNULL(MAX(static_config_package_id), -1)\nFROM config_packages\nWHERE name = ?1;\n").h(new Object[]{s1}).b();
                    if(v == -1L) {
                        fple0 = fple2;
                        goto label_37;
                    }
                    else {
                        hashMap2.put(s1, Long.valueOf(v));
                        goto label_69;
                    }
                    fple2 = fple0;
                }
                catch(Throwable throwable5) {
                    throwable4 = throwable5;
                    eion1 = eion0;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            try {
            label_69:
                if(((eioh)eiop1).g("SELECT NOT EXISTS (SELECT NULL FROM accounts WHERE name = ?1);").h(new Object[]{s2}).g()) {
                    goto label_354;
                }
                cjnf.a.g(s1, goab0.e);
                v1 = goal1.e;
                int v2 = goab0.d.size() > 0 ? 1 : 0;
                ggeo2 = eiuc1.c;
                goau2 = goab0.c;
            }
            catch(Throwable throwable2) {
                eion1 = eion0;
                fple1 = fple2;
                goto label_415;
            }
            if(goau2 == null) {
                try {
                    goau2 = goau.a;
                }
                catch(Throwable throwable5) {
                    throwable4 = throwable5;
                    eion1 = eion0;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            try {
                hashMap3 = hashMap1;
                long0 = (Long)ggeo2.get(new eitz(goau2.c, s2));
            }
            catch(Throwable throwable2) {
                eion1 = eion0;
                fple1 = fple2;
                goto label_415;
            }
            if(long0 == null) {
                try {
                    long0 = (long)-1L;
                }
                catch(Throwable throwable5) {
                    throwable4 = throwable5;
                    eion1 = eion0;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            try {
                arr_b = goab0.e.toByteArray();
                boolean z2 = goab0.h.isEmpty();
            }
            catch(Throwable throwable2) {
                eion1 = eion0;
                fple1 = fple2;
                goto label_415;
            }
            if(z2) {
                arr_b1 = null;
            }
            else {
                try {
                    arr_b1 = goab0.h.toByteArray();
                }
                catch(Throwable throwable5) {
                    throwable4 = throwable5;
                    eion1 = eion0;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            try {
                if((goab0.b & 2) == 0 && (goab0.b & 4) == 0 && (goab0.b & 8) == 0) {
                    eion1 = eion0;
                    v3 = 0;
                }
                else {
                    goto label_97;
                }
                goto label_109;
            }
            catch(Throwable throwable2) {
                eion1 = eion0;
                fple1 = fple2;
                goto label_415;
            }
            v3 = 0;
            goto label_109;
        label_97:
            if(((long)long0) == -1L) {
                eion1 = eion0;
            }
            else {
                eion1 = eion0;
                try {
                    boolean z3 = ((eioh)eiop1).g("                      SELECT IFNULL(\n                        (\n                          SELECT NOT (\n                            experiment_token IS ?1\n                            AND server_token IS ?2\n                            AND tokens_tag IS ?3\n                          )\n                          FROM experiment_states\n                          WHERE experiment_state_id IS ?4\n                        ),\n                        1\n                      );\n").h(new Object[]{arr_b, goab0.f, arr_b1, long0}).g();
                }
                catch(Throwable throwable6) {
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
                if(!z3) {
                    try {
                        v3 = 0;
                        goto label_109;
                    }
                    catch(Throwable throwable2) {
                        try {
                            eion1 = eion0;
                            fple1 = fple2;
                        }
                        catch(Throwable throwable2) {
                        }
                        goto label_415;
                    }
                }
            }
            v3 = 1;
            try {
            label_109:
                v4 = 0L;
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(goab0.d.size() > 0) {
                try {
                    int v5 = eiud.k(goab0);
                    arr_b2 = arr_b;
                    arr_b3 = arr_b1;
                    v6 = (long)v5;
                }
                catch(Throwable throwable6) {
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            else {
                arr_b2 = arr_b;
                arr_b3 = arr_b1;
                v6 = ((long)long0) == -1L ? 0L : ((eioh)eiop1).g("SELECT IFNULL(MAX(config_hash), 0)\nFROM experiment_states\nWHERE experiment_state_id = ?1;\n").h(new Object[]{long0}).b();
            }
            try {
                ggeo3 = eiuc1.d;
                goau3 = goab0.c;
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(goau3 == null) {
                try {
                    goau3 = goau.a;
                }
                catch(Throwable throwable6) {
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            try {
                eity0 = (eity)ggeo3.get(goau3.c);
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(eity0 == null) {
                goto label_131;
            }
            else {
                int v7 = v3;
                try {
                    v4 = eity0.b;
                    goto label_132;
                label_131:
                    v7 = v3;
                label_132:
                    if(v7 == 0 && v2 == 0) {
                        v8 = -1L;
                        s3 = s2;
                    }
                    else {
                        if(v7 == 0 && ((long)long0) != -1L) {
                            v8 = eiop1.c("INSERT INTO experiment_states (experiment_token, server_token, serving_version, tokens_tag,\n  config_hash, registration_generation, account_id, config_package_id)\nSELECT experiment_token, server_token, ?1, tokens_tag, ?2, ?3, account_id, config_package_id\nFROM experiment_states WHERE experiment_state_id = ?4;\n").g(new Object[]{v1, v6, v4, long0}).c();
                            s3 = s2;
                            goto label_151;
                        }
                        goto label_141;
                    }
                    goto label_151;
                }
                catch(Throwable throwable6) {
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            goto label_132;
            try {
            label_141:
                eiol0 = eiop1.c("INSERT INTO experiment_states (experiment_token, server_token, serving_version, tokens_tag,\n  config_hash, registration_generation, account_id, config_package_id)\nVALUES (?1, ?2, ?3, ?4, ?5, ?6,\n  (SELECT account_id FROM accounts WHERE name = ?7),\n  (SELECT config_package_id FROM config_packages WHERE name = ?8)\n);\n");
                s4 = goab0.f;
                long1 = v1;
                long2 = v6;
                long3 = v4;
                goau4 = goab0.c;
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(goau4 == null) {
                try {
                    goau4 = goau.a;
                }
                catch(Throwable throwable6) {
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            try {
                s3 = s2;
                v8 = eiol0.g(new Object[]{arr_b2, s4, long1, arr_b3, long2, long3, s2, goau4.c}).c();
            label_151:
                v9 = (long)long0;
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(v8 == -1L) {
                goto label_156;
            }
            else {
                try {
                    hashMap0.put(new eitz(s1, s3), Long.valueOf(v8));
                    v10 = v8;
                    goto label_157;
                label_156:
                    v10 = -1L;
                label_157:
                    if(goab0.g.size() > 0) {
                        arrayList0.add(goab0);
                    }
                    if(v7 == 0 && v2 == 0) {
                        eiop1 = eiop0;
                        eiud.B(eiop1, s1, s3, eiuc0, goal1.e);
                        eiuc1 = eiuc0;
                        fple0 = fple2;
                        hashMap1 = hashMap3;
                        eion0 = eion1;
                        goto label_37;
                    }
                    eiop1 = eiop0;
                    goto label_165;
                }
                catch(Throwable throwable6) {
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            goto label_157;
            try {
            label_165:
                boolean z4 = hxku.c();
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(z4) {
                try {
                    if(eiop1.a() >= 0x40BL) {
                        eiop1.c("UPDATE flag_overrides\nSET active = NULL\nWHERE override_id IN (\n  SELECT override_id\n  FROM experiment_states_to_overrides\n  WHERE experiment_state_id = ?1\n)\nAND source = ?2\nAND active IS 1;\n").g(new Object[]{long0, ((int)1)}).d();
                    }
                }
                catch(Throwable throwable6) {
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            try {
                v11 = (long)(((Long)hashMap2.get(s1)));
                arrayList1 = new ArrayList();
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            int v12 = Long.compare(v9, -1L);
            if(v12 == 0) {
                v13 = v11;
                hashSet1 = hashSet0;
                arrayList2 = arrayList0;
                hashMap4 = hashMap0;
            }
            else {
                v13 = v11;
                try {
                    eioe0 = ((eioh)eiop1).g("SELECT param_partition_id, ordinal\nFROM experiment_states_to_partitions\nWHERE experiment_state_id = ?1\nORDER BY ordinal ASC;\n").h(new Object[]{long0}).f();
                }
                catch(Throwable throwable6) {
                    goal1 = goal0;
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
                try {
                    while(eioe0.b()) {
                        arrayList1.add(new eiub(eioe0.f(0), eioe0.f(1)));
                        hashSet0 = hashSet0;
                        arrayList0 = arrayList0;
                        hashMap0 = hashMap0;
                    }
                    hashSet1 = hashSet0;
                    arrayList2 = arrayList0;
                    hashMap4 = hashMap0;
                    goto label_194;
                }
                catch(Throwable throwable7) {
                    try {
                        eioe0.close();
                        throw throwable7;
                    }
                    catch(Throwable throwable8) {
                        try {
                            throwable7.addSuppressed(throwable8);
                            throw throwable7;
                        label_194:
                            eioe0.close();
                        }
                        catch(Throwable throwable6) {
                            goal1 = goal0;
                            throwable4 = throwable6;
                            fple1 = fple2;
                            goto label_417;
                        }
                    }
                }
            }
            try {
                gghb0 = gghd.r(arrayList1.iterator());
                ArrayList arrayList3 = new ArrayList(goab0.d);
                Collections.sort(arrayList3, new eitv());
                gghb1 = gghd.r(arrayList3.iterator());
                while(true) {
                label_204:
                    boolean z5 = gghb0.hasNext();
                    break;
                }
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(!z5) {
                try {
                    if(!gghb1.hasNext()) {
                        if(v12 != 0 && v10 != -1L) {
                            eiop1.c("    INSERT INTO experiment_states_to_overrides (experiment_state_id, override_id)\n    SELECT ?1, override_id\n    FROM experiment_states_to_overrides\n    INNER JOIN flag_overrides\n      USING (override_id)\n    WHERE\n      experiment_state_id = ?2\n      AND active IS 1;\n").g(new Object[]{v10, long0}).d();
                        }
                        goau goau5 = goab0.c;
                        if(goau5 == null) {
                            goau5 = goau.a;
                        }
                        goag goag0 = goau5.e;
                        if(goag0 == null) {
                            goag0 = goag.a;
                        }
                        set0.add(new gfsz(((int)goag0.c), s1));
                        eity eity1 = (eity)ggeo3.get(s1);
                        if(eity1 != null) {
                            eiui0.b(goab0, eity1.a, s3, eiop1);
                        }
                        if(!hashSet1.isEmpty() && v12 != 0) {
                            eiop1.c("INSERT INTO cross_logged_tokens (experiment_state_id, to_config_package_id, token,\n  diversion_provenance)\nSELECT\n  ?2,\n  cross_logged_tokens.to_config_package_id,\n  cross_logged_tokens.token,\n  cross_logged_tokens.diversion_provenance\nFROM cross_logged_tokens\nINNER JOIN OmittedConfigPackages\n  ON cross_logged_tokens.to_config_package_id = OmittedConfigPackages.config_package_id\nWHERE cross_logged_tokens.experiment_state_id = ?1;\n").g(new Object[]{long0, v10}).d();
                        }
                        eiuc1 = eiuc0;
                        goal1 = goal0;
                        ggeo1 = ggeo0;
                        hashSet0 = hashSet1;
                        arrayList0 = arrayList2;
                        hashMap0 = hashMap4;
                        fple0 = fple2;
                        hashMap1 = hashMap3;
                        eion0 = eion1;
                        goto label_37;
                    }
                    goto label_231;
                }
                catch(Throwable throwable6) {
                    goal1 = goal0;
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
                fple0 = fple2;
                hashMap1 = hashMap3;
                eion0 = eion1;
                goto label_37;
            }
            try {
            label_231:
                boolean z6 = gghb1.hasNext();
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(!z6) {
                try {
                    eiub eiub0 = (eiub)gghb0.next();
                    s5 = s1;
                    eiop1.c("    INSERT INTO experiment_states_to_partitions (experiment_state_id, ordinal,\n      param_partition_id) VALUES (?1, ?2, ?3);\n").g(new Object[]{v10, ((long)eiub0.b), ((long)eiub0.a)}).d();
                }
                catch(Throwable throwable6) {
                    goal1 = goal0;
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
                s1 = s5;
                goto label_204;
            }
            s5 = s1;
            try {
                boolean z7 = gghb0.hasNext();
                if(!z7) {
                    goas0 = (goas)gghb1.next();
                    int v14 = goar.a(goas0.d);
                    if(v14 == 0) {
                        v14 = 1;
                    }
                    switch(v14 - 1) {
                        case 0: {
                            goat0 = goas0.b;
                            goto label_247;
                        }
                        case 2: {
                            goto label_280;
                        }
                        default: {
                            s1 = s5;
                            goto label_204;
                        }
                    }
                }
                goto label_289;
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
        label_247:
            if(goat0 == null) {
                try {
                    goat0 = goat.a;
                }
                catch(Throwable throwable6) {
                    goal1 = goal0;
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
            }
            try {
                boolean z8 = goat0.d.isEmpty();
            }
            catch(Throwable throwable2) {
                fple1 = fple2;
                goto label_415;
            }
            if(z8) {
                try {
                    ((ggtj)eiud.a.j()).x("Received a param partition without a tag.");
                }
                catch(Throwable throwable6) {
                    goal1 = goal0;
                    throwable4 = throwable6;
                    fple1 = fple2;
                    goto label_417;
                }
                s1 = s5;
                goto label_204;
            }
            else {
                try {
                    goau6 = goab0.c;
                }
                catch(Throwable throwable2) {
                    try {
                        fple1 = fple2;
                    }
                    catch(Throwable throwable2) {
                    }
                    goto label_415;
                }
                if(goau6 == null) {
                    try {
                        goau6 = goau.a;
                    }
                    catch(Throwable throwable6) {
                        goal1 = goal0;
                        throwable4 = throwable6;
                        fple1 = fple2;
                        goto label_417;
                    }
                }
                long4 = long0;
                v15 = v13;
                s6 = s5;
                goab1 = goab0;
                fple3 = fple2;
                gghb2 = gghb0;
                hashMap5 = hashMap3;
                try {
                    v16 = eiud.I(eiop1, goau6.c, goas0, fple3, hashMap5, v15, s3);
                }
                catch(Throwable throwable2) {
                    fple1 = fple3;
                    goto label_415;
                }
                try {
                    eiol1 = eiop1.c("    INSERT INTO experiment_states_to_partitions (experiment_state_id, ordinal,\n      param_partition_id) VALUES (?1, ?2, ?3);\n");
                    long5 = v10;
                    goat1 = goas0.b;
                    goto label_275;
                }
                catch(Throwable throwable2) {
                    try {
                        fple1 = fple3;
                        goto label_415;
                    label_275:
                        if(goat1 == null) {
                            goat1 = goat.a;
                        }
                        fple1 = fple3;
                        eiol1.g(new Object[]{long5, ((long)goat1.c), v16}).d();
                        goto label_336;
                    }
                    catch(Throwable throwable2) {
                        goto label_415;
                    }
                }
            }
            try {
            label_280:
                ((ggtj)eiud.a.j()).x("Received a param partition with DELETE update type after processing all partitions in the database; this should not happen.");
                s1 = s5;
                goto label_204;
            }
            catch(Throwable throwable6) {
                goal1 = goal0;
            }
            throwable4 = throwable6;
            fple1 = fple2;
            goto label_417;
            try {
            label_289:
                long4 = long0;
                fple1 = fple2;
                gghb2 = gghb0;
                s6 = s5;
                goab1 = goab0;
                eiub eiub1 = (eiub)gghb2.a();
                goas goas1 = (goas)gghb1.a();
                long v17 = eiub1.b;
                goat goat2 = goas1.b;
                if(goat2 == null) {
                    goat2 = goat.a;
                }
                int v18 = Long.compare(v17, goat2.c);
                if(v18 >= 0) {
                    if(v18 <= 0) {
                        eiub eiub2 = (eiub)gghb2.next();
                    }
                    goas2 = (goas)gghb1.next();
                    int v19 = goar.a(goas2.d);
                    if(v19 == 0) {
                        v19 = 1;
                    }
                    if(v19 - 1 == 0) {
                        goat goat3 = goas2.b;
                        if(goat3 == null) {
                            goat3 = goat.a;
                        }
                        if(goat3.d.isEmpty()) {
                            ((ggtj)eiud.a.j()).x("Received a param partition without a tag.");
                            goto label_346;
                        }
                        else {
                            goau goau7 = goab1.c;
                            if(goau7 == null) {
                                goau7 = goau.a;
                            }
                            s7 = goau7.c;
                            goto label_321;
                        }
                        goto label_336;
                    }
                }
                else {
                    goto label_344;
                }
                goto label_346;
            }
            catch(Throwable throwable2) {
                goto label_415;
            }
        label_321:
            hashMap5 = hashMap3;
            fple3 = fple1;
            v15 = v13;
            try {
                v20 = eiud.I(eiop1, s7, goas2, fple3, hashMap5, v15, s3);
                eiol2 = eiop1.c("    INSERT INTO experiment_states_to_partitions (experiment_state_id, ordinal,\n      param_partition_id) VALUES (?1, ?2, ?3);\n");
                long6 = v10;
                goat4 = goas2.b;
                goto label_332;
            }
            catch(Throwable throwable2) {
                try {
                    fple1 = fple3;
                    goto label_415;
                label_332:
                    if(goat4 == null) {
                        goat4 = goat.a;
                    }
                    fple1 = fple3;
                    eiol2.g(new Object[]{long6, ((long)goat4.c), v20}).d();
                label_336:
                    goab0 = goab1;
                    s1 = s6;
                    gghb0 = gghb2;
                    fple2 = fple1;
                    hashMap3 = hashMap5;
                    long0 = long4;
                    v13 = v15;
                    goto label_204;
                label_344:
                    eiub eiub3 = (eiub)gghb2.next();
                    eiop1.c("    INSERT INTO experiment_states_to_partitions (experiment_state_id, ordinal,\n      param_partition_id) VALUES (?1, ?2, ?3);\n").g(new Object[]{v10, ((long)eiub3.b), ((long)eiub3.a)}).d();
                label_346:
                    goab0 = goab1;
                    s1 = s6;
                    long0 = long4;
                    gghb0 = gghb2;
                    fple2 = fple1;
                    v13 = v13;
                    hashMap3 = hashMap3;
                    goto label_204;
                label_354:
                    goal1 = goal0;
                    ggeo1 = ggeo0;
                    hashMap0 = hashMap0;
                    fple0 = fple2;
                    goto label_37;
                label_359:
                    fple1 = fple0;
                    eion1 = eion0;
                    HashMap hashMap6 = hashMap0;
                    eiui eiui1 = eiui0;
                    for(Object object3: arrayList0) {
                        goab goab2 = (goab)object3;
                        for(Object object4: goab2.g) {
                            goaf goaf0 = (goaf)object4;
                            goau goau8 = goaf0.b;
                            if(goau8 == null) {
                                goau8 = goau.a;
                            }
                            String s8 = goau8.c;
                            goau goau9 = goab2.c;
                            goau goau10 = goau9 == null ? goau.a : goau9;
                            String s9 = goau10.c;
                            if(goau9 == null) {
                                goau9 = goau.a;
                            }
                            String s10 = eiud.x(ggeo0, goau9);
                            Long long7 = (Long)hashMap6.get(new eitz(s8, s10));
                            if(long7 == null) {
                                eitz eitz0 = new eitz(s8, s10);
                                Long long8 = (Long)eiuc1.c.get(eitz0);
                                v21 = long8 == null ? -1L : ((long)long8);
                            }
                            else {
                                v21 = (long)long7;
                            }
                            if(v21 == -1L) {
                                ((ggtj)eiud.a.i()).R("Failed to add cross-logged token from config package \'%s\' to config package \'%s\' because the from package does not have an experiment state matching the cross-logged token.", s8, s9);
                            }
                            else {
                                eiol eiol3 = eiop1.c("INSERT INTO cross_logged_tokens (experiment_state_id, to_config_package_id, token,\n  diversion_provenance)\nVALUES (\n    ?1,\n    (SELECT config_package_id FROM config_packages WHERE name = ?2),\n    ?3,\n    ?4\n    );\n");
                                Long long9 = v21;
                                byte[] arr_b4 = goaf0.c.toByteArray();
                                int v22 = goae.a(goaf0.d);
                                if(v22 == 0) {
                                    v22 = 1;
                                }
                                eiol3.g(new Object[]{long9, s9, arr_b4, ((int)(v22 - 1))}).d();
                            }
                            hashMap6 = hashMap6;
                        }
                    }
                    goto label_411;
                label_408:
                    eiui1 = eiui0;
                    fple1 = fple0;
                    eion1 = eion0;
                label_411:
                    eiop1.e();
                    eiui1.c();
                    goto label_424;
                }
                catch(Throwable throwable2) {
                }
                goto label_415;
            }
        }
        else {
            goto label_408;
        }
        goto label_411;
    label_415:
        goal1 = goal0;
    label_416:
        throwable4 = throwable2;
        try {
        label_417:
            eion1.close();
            throw throwable4;
        }
        catch(Throwable throwable9) {
            try {
                throwable4.addSuppressed(throwable9);
                throw throwable4;
            }
            catch(Throwable throwable1) {
            }
        }
        goto label_428;
        try {
        label_424:
            eion1.close();
            goto label_435;
        }
        catch(Throwable throwable1) {
            goal1 = goal0;
        }
        try {
        label_428:
            fple1.close();
            throw throwable1;
        }
        catch(Throwable throwable10) {
            try {
                throwable1.addSuppressed(throwable10);
                throw throwable1;
            }
            catch(Throwable throwable0) {
            }
        }
        goto label_439;
        try {
        label_435:
            fple1.close();
            goto label_442;
        }
        catch(Throwable throwable0) {
            goal1 = goal0;
        }
    label_439:
        if(goal1.f.size() > 0) {
            eitw0.g = goal1.f.size();
        }
        throw throwable0;
    label_442:
        if(goal0.f.size() > 0) {
            eitw0.g = goal0.f.size();
        }
    }

    protected abstract hlph b();

    protected abstract String c(String arg1);

    protected abstract String d();

    protected abstract void e(String arg1);

    protected abstract void f(long arg1);

    protected abstract void g(int arg1);

    public abstract String[] h();

    protected void hA(gnzv gnzv0, ggfp ggfp0, hlrv hlrv0) {
    }

    protected void i() {
    }

    protected void j() {
    }

    static int k(goab goab0) {
        int v = 0;
        for(Object object0: goab0.d) {
            goat goat0 = ((goas)object0).b;
            if(goat0 == null) {
                goat0 = goat.a;
            }
            long v1 = goat0.c;
            goat goat1 = ((goas)object0).b;
            long v2 = v1 ^ (goat1 == null ? goat.a : goat1).c >>> 0x20;
            if(goat1 == null) {
                goat1 = goat.a;
            }
            int v3 = (int)v2;
            byte[] arr_b = goat1.d.toByteArray();
            for(int v4 = 0; v4 < arr_b.length; ++v4) {
                v3 = v3 * 0x1F + arr_b[v4];
            }
            v = v * 17 ^ v3;
        }
        return v;
    }

    final int l(String[] arr_s, ggfp ggfp0) {
        int v1;
        eiop eiop0 = this.c.a().b();
        try {
            if(eiop0.f()) {
                HashSet hashSet2 = new HashSet(Arrays.asList(arr_s));
                hashSet2.add("");
                hashSet2.add("*");
                eion eion0 = eiop0.d("AccountsToKeep", "CREATE TEMP TABLE AccountsToKeep(account_id INTEGER PRIMARY KEY);");
                TWR.declareResource(eion0);
                TWR.useResource$NT(eion0);
                eion0.a("INSERT INTO TEMP.AccountsToKeep SELECT DISTINCT account_id\nFROM experiment_states\nINNER JOIN config_packages\n  ON (experiment_state_id IS committed_experiment_state_id);\n").f(new String[]{"config_packages"}).d();
                Iterator iterator3 = hashSet2.iterator();
                while(true) {
                    TWR.useResource$NT(eion0);
                    if(!iterator3.hasNext()) {
                        break;
                    }
                    TWR.useResource$NT(eion0);
                    Object object3 = iterator3.next();
                    eiop0.c("INSERT OR IGNORE INTO TEMP.AccountsToKeep\nSELECT account_id\nFROM accounts\nWHERE name = ?1;\n").g(new Object[]{((String)object3)}).d();
                }
                TWR.useResource$NT(eion0);
                v1 = eiop0.c("DELETE FROM accounts\nWHERE account_id NOT IN (\n  SELECT account_id FROM TEMP.AccountsToKeep);\n").f(new String[]{"accounts", "flag_overrides_to_commit", "flag_overrides", "experiment_states"}).b();
            }
            else {
                eioa eioa0 = ((eioh)eiop0).g("SELECT user FROM RequestTags").d().c();
                TWR.declareResource(eioa0);
                TWR.useResource$NT(eioa0);
                HashSet hashSet0 = ggog.i(eioa0.a());
                while(true) {
                    TWR.useResource$NT(eioa0);
                    if(!eioa0.b()) {
                        break;
                    }
                    TWR.useResource$NT(eioa0);
                    hashSet0.add(eioa0.h(0));
                }
                for(int v = 0; v < arr_s.length; ++v) {
                    hashSet0.remove(arr_s[v]);
                }
                for(Object object0: eiud.G(eiop0)) {
                    hashSet0.remove(((String)object0));
                }
                hashSet0.remove("");
                HashSet hashSet1 = new HashSet();
                Iterator iterator1 = hashSet0.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        for(Object object1: hashSet1) {
                            String s = (String)object1;
                            if(!ggfp0.contains(s)) {
                                einw.b(eiop0, s);
                            }
                        }
                        v1 = hashSet0.size();
                        break;
                    }
                    Object object2 = iterator1.next();
                    eioe eioe0 = ((eioh)eiop0).g("SELECT packageName FROM ExperimentTokens WHERE user = ?").h(new Object[]{((String)object2)}).d().f();
                    while(true) {
                        try {
                            if(!eioe0.b()) {
                                break;
                            }
                            hashSet1.add(eioe0.h(0));
                        }
                        catch(Throwable throwable1) {
                            TWR.safeClose$NT(eioe0, throwable1);
                            throw throwable1;
                        }
                    }
                    eioe0.close();
                    eiop0.c("DELETE FROM ExperimentTokens WHERE user = ?").g(new Object[]{((String)object2)}).e().d();
                    eiop0.c("DELETE FROM Flags WHERE user = ?").g(new Object[]{((String)object2)}).e().d();
                    eiop0.c("DELETE FROM RequestTags WHERE user = ?").g(new Object[]{((String)object2)}).d();
                    eiop0.c("DELETE FROM ApplicationTags WHERE user = ?").g(new Object[]{((String)object2)}).e().d();
                    eiop0.c("DELETE FROM CrossLoggedExperimentTokens WHERE fromUser = ?").g(new Object[]{((String)object2)}).e().d();
                }
            }
            eiop0.e();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(eiop0, throwable0);
            throw throwable0;
        }
        eiop0.close();
        return v1;
    }

    public final int m(ggfp ggfp0) {
        int v7;
        int v6;
        int v5;
        int v4;
        int v;
        eiop eiop0 = this.c.a().b();
        try {
            if(eiop0.f()) {
                v = eiop0.c("        WITH ExperimentStatesToKeep AS (\n            SELECT MAX(experiment_states.experiment_state_id) AS experiment_state_id\n            FROM experiment_states\n            INNER JOIN config_packages\n              USING (config_package_id)\n            LEFT OUTER JOIN experiment_states AS CommittedStates\n              ON (config_packages.committed_experiment_state_id =\n                CommittedStates.experiment_state_id)\n            GROUP BY experiment_states.config_package_id, experiment_states.account_id,\n              experiment_states.experiment_state_id IS\n              config_packages.committed_experiment_state_id\n        )\n    DELETE FROM experiment_states\n    WHERE experiment_state_id NOT IN (\n        SELECT experiment_state_id FROM ExperimentStatesToKeep);\n").f(new String[]{"experiment_states"}).b();
            }
            else {
                eioe eioe0 = ((eioh)eiop0).g("SELECT packageName, version FROM Packages").d().f();
                while(true) {
                    try {
                    label_5:
                        if(!eioe0.b()) {
                            break;
                        }
                        String s = eioe0.h(0);
                        int v1 = (int)eioe0.f(1);
                        eioe eioe1 = ((eioh)eiop0).g("SELECT MAX(version), user FROM ExperimentTokens WHERE packageName = ? AND version <= ? AND isCommitted = 0 GROUP BY user").h(new Object[]{s, v1}).f();
                        int v2 = 0;
                        while(true) {
                            try {
                                if(!eioe1.b()) {
                                    break;
                                }
                                int v3 = (int)eioe1.f(0);
                                String s1 = eioe1.g(1);
                                Integer integer0 = v3;
                                v4 = eiop0.c("DELETE FROM Flags WHERE packageName = ? AND user = ? AND version != ? AND committed = 0").g(new Object[]{s, s1, integer0}).b() <= 0 ? 0 : 1;
                                v5 = eiop0.c("DELETE FROM ExperimentTokens WHERE packageName = ? AND user = ? AND version != ? AND isCommitted = 0").g(new Object[]{s, s1, integer0}).b() <= 0 ? 0 : 1;
                                v6 = eiop0.c("DELETE FROM ApplicationTags WHERE packageName = ? AND user = ? AND version != ?").g(new Object[]{s, s1, integer0}).b() <= 0 ? 0 : 1;
                                v7 = eiop0.c("DELETE FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND fromUser = ? AND fromVersion != ? AND isCommitted = 0").g(new Object[]{s, s1, integer0}).b() <= 0 ? 0 : 1;
                                if(eiop0.c("DELETE FROM CrossLoggedExperimentTokens WHERE toPackageName = ? AND fromUser = ? AND toVersion != ? AND isCommitted = 0").g(new Object[]{s, s1, integer0}).b() > 0) {
                                    goto label_23;
                                }
                                else {
                                    goto label_25;
                                }
                                goto label_26;
                            }
                            catch(Throwable throwable2) {
                                TWR.safeClose$NT(eioe1, throwable2);
                                throw throwable2;
                            }
                        label_23:
                            int v8 = 1;
                            goto label_26;
                        label_25:
                            v8 = 0;
                        label_26:
                            v2 = v2 | v4 | v5 | v6 | v7 | v8;
                        }
                        eioe1.close();
                        if(v2 == 0 || ggfp0.contains(s)) {
                            goto label_5;
                        }
                        einw.b(eiop0, s);
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(eioe0, throwable1);
                        throw throwable1;
                    }
                }
                eioe0.close();
                v = -1;
            }
            eiop0.e();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(eiop0, throwable0);
            throw throwable0;
        }
        eiop0.close();
        return v;
    }

    public static long n(eiof eiof0) {
        return einw.a(eiof0, "__sync");
    }

    public static eiul o(Context context0) {
        String s1;
        String s = fppd.a;
        if(s == null) {
            synchronized(fppd.class) {
                s = fppd.a;
                if(s == null) {
                    s = hxly.a.f().j();
                    try {
                        s1 = s;
                        s1 = fftn.g(context0.getContentResolver(), "gms:phenotype:configurator:service_url", s);
                    }
                    catch(SecurityException unused_ex) {
                    }
                    if(!fppc.a(context0)) {
                        s = s1;
                    }
                }
                fppd.a = s;
            }
            return new eiul(s);
        }
        return new eiul(s);
    }

    public final void p(gnzv gnzv0, String s, hlrs hlrs0) {
        String[] arr_s = this.h();
        this.A(gnzv0, s, arr_s, arr_s, true, hlrs0);
    }

    public final void q(gnzv gnzv0, String s, ggfp ggfp0, String[] arr_s, String[] arr_s1, boolean z, hlrs hlrs0) {
        int v30;
        int v29;
        int v28;
        int v27;
        int v26;
        int v21;
        int v20;
        int v19;
        int v18;
        int v17;
        ggoh ggoh0;
        ProtoLiteBuilder hftp5;
        String s4;
        ggqj ggqj0;
        ProtoLiteBuilder hftp4;
        HashSet hashSet3;
        int v13;
        ggfp ggfp2;
        ggfn ggfn2;
        bboh bboh0;
        ggtj ggtj0;
        ArrayList arrayList3;
        int v10;
        int v8;
        int v7;
        int v6;
        Throwable throwable10;
        boolean z2;
        eiog eiog1;
        boolean z1;
        ggqk ggqk0;
        gged_interceptors gged1;
        gged_interceptors gged0;
        ggek ggek1;
        ArrayList arrayList1;
        eiog eiog0;
        int v3;
        ArrayList arrayList0;
        ggfn ggfn0;
        HashSet hashSet2;
        ggeo ggeo0;
        int v2;
        gdqb gdqb0;
        ProtoLiteBuilder hftp2;
        eitw eitw1;
        Throwable throwable1;
        ProtoLiteBuilder hftp1;
        HashSet hashSet1;
        ProtoLiteBuilder hftp0;
        eitw eitw0;
        eiud eiud0 = this;
        gnzv gnzv1 = gnzv0;
        long v = SystemClock.elapsedRealtime();
        hlrs hlrs1 = hlrs0 == null ? ((hlrs)((ProtoLiteMessage)hlrv.a).v_newBuilder()) : hlrs0;
        int v1 = eiud0.m;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        ((hlrv)hlrs1.b_message).c = v1 - 1;
        ((hlrv)hlrs1.b_message).b |= 1;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        ((hlrv)hlrs1.b_message).d = gnzv1.x;
        ((hlrv)hlrs1.b_message).b |= 2;
        String s1 = gfta.b(s);
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv0 = (hlrv)hlrs1.b_message;
        hlrv0.b |= 4;
        hlrv0.e = s1;
        HashSet hashSet0 = new HashSet();
        try {
            eitw0 = null;
            hftp0 = ((ProtoLiteMessage)hlrr.a).v_newBuilder();
        }
        catch(RuntimeException runtimeException0) {
            hashSet1 = hashSet0;
            hftp1 = null;
            goto label_521;
        }
        catch(Throwable throwable0) {
            hashSet1 = hashSet0;
            throwable1 = throwable0;
            hftp1 = null;
            goto label_534;
        }
        try {
            eitw1 = new eitw();
        }
        catch(RuntimeException runtimeException0) {
            hftp2 = hftp0;
            hashSet1 = hashSet0;
            goto label_520;
        }
        catch(Throwable throwable2) {
            hftp2 = hftp0;
            hashSet1 = hashSet0;
            throwable1 = throwable2;
            goto label_533;
        }
        try {
            gdqb0 = gdsp.e("com/google/android/gms/phenotype/sync/HeterodyneSyncer", "getAllAccountsAndAuthTokens", 0xFF, "Get accounts and auth tokens");
        }
        catch(RuntimeException runtimeException0) {
            hashSet1 = hashSet0;
            hftp2 = hftp0;
            goto label_519;
        }
        catch(Throwable throwable3) {
            hashSet1 = hashSet0;
            hftp2 = hftp0;
            goto label_531;
        }
        try {
            v2 = arr_s1.length;
            eitw1.a = v2;
            if(v2 <= 10) {
                ggek ggek0 = new ggek();
                eiud0.z(ggek0, arr_s1);
                ggeo0 = ggek0.g();
                hashSet2 = hashSet0;
                eitw1.b = ((ggnf)ggeo0).d;
                goto label_113;
            }
            ggfn0 = ggfp.D(v2);
            arrayList0 = new ArrayList();
            hashSet2 = hashSet0;
            v3 = 0;
        }
        catch(Throwable throwable4) {
            hashSet1 = hashSet0;
            goto label_110;
        }
        while(v3 < v2) {
            try {
                String s2 = arr_s1[v3];
                if(eiud.D(s2)) {
                    arrayList0.add(s2);
                }
                ++v3;
                v2 = v2;
            }
            catch(Throwable throwable5) {
                goto label_510;
            }
        }
        try {
            Collections.sort(arrayList0);
            ggfn0.k(arrayList0);
            eiog0 = eiud0.c.a().a();
        }
        catch(Throwable throwable4) {
            goto label_109;
        }
        try {
            arrayList1 = new ArrayList(eiud.G(eiog0));
        }
        catch(Throwable throwable6) {
            try {
                hashSet1 = hashSet2;
                hftp2 = hftp0;
                eiog0.close();
                throw throwable6;
            }
            catch(Throwable throwable7) {
                try {
                    throwable6.addSuppressed(throwable7);
                    throw throwable6;
                }
                catch(Throwable throwable4) {
                }
            }
            goto label_111;
        }
        try {
            eiog0.close();
            arrayList1.remove("");
            Collections.sort(arrayList1);
            ggfn0.k(arrayList1);
            ArrayList arrayList2 = new ArrayList(Arrays.asList(arr_s1));
            Collections.sort(arrayList2);
            ggfn0.k(arrayList2);
            ggek1 = new ggek();
            gged0 = ggfn0.h().v();
        }
        catch(Throwable throwable4) {
            goto label_109;
        }
        try {
            gged1 = gged0.b(0, 10);
        }
        catch(Throwable throwable4) {
            hashSet1 = hashSet2;
            goto label_110;
        }
        try {
            ggqk0 = gged1.E();
            while(true) {
            label_104:
                if(!ggqk0.hasNext()) {
                    ggeo0 = ggek1.g();
                    eitw1.b = ((ggnf)ggeo0).d;
                    goto label_113;
                }
                goto label_506;
            }
        }
        catch(Throwable throwable4) {
        label_109:
            hashSet1 = hashSet2;
        }
    label_110:
        hftp2 = hftp0;
    label_111:
        Throwable throwable8 = throwable4;
        goto label_513;
        try {
        label_113:
            z1 = false;
            gdqb0.close();
            for(int v4 = 0; v4 < arr_s1.length; ++v4) {
                if(eiud.D(arr_s1[v4])) {
                    z1 = true;
                    break;
                }
            }
            eiog1 = eiud0.c.a().a();
        }
        catch(RuntimeException runtimeException0) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_519;
        }
        catch(Throwable throwable3) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_531;
        }
        try {
            z2 = eiog1.f() ? ((eioh)eiog1).g("SELECT EXISTS (SELECT NULL FROM config_packages WHERE name NOT GLOB \'__internal.*\');").e(new String[]{"config_packages"}).g() : ((eioh)eiog1).g("SELECT EXISTS (SELECT NULL FROM Packages WHERE packageName NOT GLOB \'__internal.*\')").d().g();
            goto label_141;
        }
        catch(Throwable throwable9) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            throwable10 = throwable9;
            goto label_136;
        }
        try {
            z2 = ((eioh)eiog1).g("SELECT EXISTS (SELECT NULL FROM config_packages WHERE name NOT GLOB \'__internal.*\');").e(new String[]{"config_packages"}).g();
            goto label_141;
        }
        catch(Throwable throwable11) {
            throwable10 = throwable11;
            hashSet1 = hashSet2;
            hftp2 = hftp0;
        }
        try {
        label_136:
            eiog1.close();
            throw throwable10;
        }
        catch(Throwable throwable12) {
            try {
                throwable10.addSuppressed(throwable12);
                throw throwable10;
            }
            catch(RuntimeException runtimeException0) {
                goto label_519;
            }
            catch(Throwable throwable3) {
                goto label_531;
            }
        }
        try {
        label_141:
            eiog1.close();
            if(z2) {
                goto label_232;
            }
            else {
                if(!hlrs1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs1).ensureMutable();
                }
                goto label_152;
            }
            goto label_492;
        }
        catch(RuntimeException runtimeException0) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_519;
        }
        catch(Throwable throwable3) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_531;
        }
        try {
        label_152:
            hlrv hlrv1 = (hlrv)hlrs1.b_message;
            hlrv1.h = 2;
            hlrv1.b |= 16;
            if(hftp0 != null) {
                goto label_156;
            }
            goto label_178;
        }
        catch(RuntimeException runtimeException0) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_519;
        }
        catch(Throwable throwable3) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_531;
        }
    label_156:
        ProtoLiteMessage hftv0 = hftp0.b_message;
        switch(hlrq.b(((hlrr)hftv0).d)) {
            case 0: 
            case 1: {
                int v5 = eiud.K(eitw1);
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hlrr)hftp0.b_message).d = v5 - 1;
                ((hlrr)hftp0.b_message).b |= 2;
            }
        }
        ProtoLiteBuilder hftp3 = eiud.N(eitw1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlrr hlrr0 = (hlrr)hftp0.b_message;
        hlsg hlsg0 = (hlsg)hftp3.N_build();
        hlsg0.getClass();
        hlrr0.h = hlsg0;
        hlrr0.b |= 0x40;
        hlrs1.a(hftp0);
        if(eiud.K(eitw1) != 1) {
            if(!hlrs1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrs1).ensureMutable();
            }
            ((hlrv)hlrs1.b_message).h = 4;
            ((hlrv)hlrs1.b_message).b |= 16;
        }
    label_178:
        ggfn ggfn1 = new ggfn();
        for(Object object0: hashSet2) {
            ggfn1.i(((String)((gfsz)object0).b));
        }
        ggfp ggfp1 = ggfn1.h();
        try {
            v6 = eiud0.l(arr_s1, ggfp1);
        }
        catch(RuntimeException runtimeException1) {
            v7 = 0;
            goto label_194;
        }
        try {
            v8 = eiud0.m(ggfp1);
            goto label_196;
        }
        catch(RuntimeException runtimeException1) {
            v7 = v6;
        }
    label_194:
        int v9 = 0;
        goto label_202;
    label_196:
        if(gnzv1 == gnzv.b || gnzv1 == gnzv.c) {
            try {
                v10 = eiud0.w();
                goto label_208;
            }
            catch(RuntimeException runtimeException1) {
                v9 = v8;
                v7 = v6;
            }
        label_202:
            a.ae(eiud.a.i(), "Garbage collection failed", runtimeException1);
            v6 = v7;
            v8 = v9;
        }
        v10 = 0;
    label_208:
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv2 = (hlrv)hlrs1.b_message;
        hlrv2.b |= 0x400;
        hlrv2.l = (long)v6;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv3 = (hlrv)hlrs1.b_message;
        hlrv3.b |= 0x800;
        hlrv3.m = (long)v8;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv4 = (hlrv)hlrs1.b_message;
        hlrv4.b |= 0x1000;
        hlrv4.n = (long)v10;
        ggdy ggdy0 = new ggdy();
        for(Object object1: DesugarCollections.unmodifiableList(((hlrv)hlrs1.b_message).g)) {
            int v11 = ((hlrr)object1).d;
            if(hlrq.b(v11) != 0 && hlrq.b(v11) != 1) {
                ggdy0.i(hlrq.a((hlrq.b(v11) == 0 ? 1 : hlrq.b(v11))));
            }
        }
        goto label_492;
        try {
        label_232:
            arrayList3 = new ArrayList(arr_s.length);
        }
        catch(RuntimeException runtimeException0) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_519;
        }
        catch(Throwable throwable3) {
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_531;
        }
        try {
            for(int v12 = 0; v12 < arr_s.length; ++v12) {
                String s3 = arr_s[v12];
                if(ggeo0.containsKey(s3)) {
                    arrayList3.add(s3);
                }
            }
            ggtj0 = (ggtj)eiud.a.h();
            bboh0 = eiud.a;
            goto label_256;
        }
        catch(RuntimeException runtimeException0) {
            eiud0 = this;
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_519;
        }
        catch(Throwable throwable3) {
            eiud0 = this;
        }
        hashSet1 = hashSet2;
        hftp2 = hftp0;
        goto label_531;
        try {
        label_256:
            ggtj0.z("Removed %d invalid users", arr_s.length - arrayList3.size());
            eitw1.d = arr_s.length;
            eitw1.f = arrayList3.size();
            ggfn2 = new ggfn();
            if(z) {
                ggfn2.i("");
            }
            if(arrayList3.size() <= 10) {
                ggfn2.k(arrayList3);
                ggfp2 = ggfn2.h();
                v13 = arr_s.length;
            }
            else {
                ggtj ggtj1 = (ggtj)bboh0.h();
                v13 = arr_s.length;
                ggtj1.F("users truncated from %d to %d", arrayList3.size(), 10);
                goto label_279;
            }
            goto label_292;
        }
        catch(RuntimeException runtimeException0) {
            eiud0 = this;
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_519;
        }
        catch(Throwable throwable3) {
            eiud0 = this;
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_531;
        }
        try {
        label_279:
            ggfn2.k(arrayList3.subList(0, 10));
            ggfp2 = ggfn2.h();
            goto label_292;
        }
        catch(RuntimeException runtimeException0) {
            eiud0 = this;
            hashSet1 = hashSet2;
            hftp2 = hftp0;
            goto label_519;
        }
        catch(Throwable throwable3) {
            eiud0 = this;
            hashSet1 = hashSet2;
        }
        hftp2 = hftp0;
        goto label_531;
    label_292:
        int v14 = v13 - eitw1.f;
        int v15 = ggfp2.size();
        eitw1.e = v15;
        eitw1.c = v15 <= eitw1.f ? eitw1.d : eitw1.d + 1;
        if(ggfp2.size() > 1) {
            try {
                hashSet3 = hashSet2;
                this.M(hashSet3, ggfp2, gnzv1, s, z1, hftp0, eitw1, ggeo0, ggfp0, true, hlrs1);
                gnzv1 = gnzv0;
                hftp2 = hftp0;
                hashSet1 = hashSet3;
                eiud0 = this;
                goto label_409;
            }
            catch(eipa eipa0) {
            }
            catch(RuntimeException runtimeException0) {
                hftp4 = hftp0;
                goto label_392;
            }
            catch(Throwable throwable3) {
                hftp4 = hftp0;
                goto label_398;
            }
            try {
                hftp4 = hftp0;
                a.ae(eiud.a.j(), "SyncInBatch failed", eipa0);
                if(!hlrs1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs1).ensureMutable();
                }
                ((hlrv)hlrs1.b_message).h = 4;
                ((hlrv)hlrs1.b_message).b |= 16;
                ProtoLiteMessage hftv1 = hftp4.b_message;
                if((((hlrr)hftv1).b & 2) == 0) {
                    if(!hftv1.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ((hlrr)hftp4.b_message).d = 1;
                    ((hlrr)hftp4.b_message).b |= 2;
                }
                throw eipa0;
            label_324:
                hftp4 = hftp0;
                hashSet3 = hashSet2;
                ggqj0 = ggfp2.om();
                while(true) {
                label_327:
                    if(!ggqj0.hasNext()) {
                        goto label_403;
                    }
                    goto label_328;
                }
            }
            catch(RuntimeException runtimeException0) {
                goto label_392;
            }
            catch(Throwable throwable3) {
                goto label_398;
            }
        }
        else {
            goto label_324;
            try {
            label_328:
                Object object2 = ggqj0.next();
                s4 = (String)object2;
                hftp5 = hftp4 == null ? ((ProtoLiteMessage)hlrr.a).v_newBuilder() : hftp4;
                goto label_344;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Throwable throwable3) {
                goto label_339;
            }
            try {
                gnzv1 = gnzv0;
                hftp2 = hftp4;
                hashSet1 = hashSet3;
                eiud0 = this;
                goto label_519;
            label_339:
                gnzv1 = gnzv0;
                hftp2 = hftp4;
                hashSet1 = hashSet3;
                eiud0 = this;
                goto label_531;
            }
            catch(RuntimeException runtimeException0) {
                goto label_519;
            }
            catch(Throwable throwable3) {
                goto label_531;
            }
            try {
            label_344:
                gnzv1 = gnzv0;
                hftp2 = hftp4;
                ggoh0 = new ggoh(s4);
                gnzv1 = gnzv0;
                hftp2 = hftp4;
                eiud0 = this;
            }
            catch(eipa eipa1) {
                gnzv1 = gnzv0;
                hftp2 = hftp4;
                hashSet1 = hashSet3;
                eiud0 = this;
                goto label_367;
            }
            catch(Throwable throwable13) {
                hashSet1 = hashSet3;
                eiud0 = this;
                goto label_383;
            }
            try {
                hashSet1 = hashSet3;
                eiud0.M(hashSet3, ggoh0, gnzv1, s, z1, hftp5, eitw1, ggeo0, ggfp0, false, hlrs1);
                hashSet1 = hashSet3;
                goto label_386;
            }
            catch(eipa eipa1) {
            }
            catch(Throwable throwable13) {
                goto label_383;
            }
            hashSet1 = hashSet3;
            try {
            label_367:
                a.ae(eiud.a.j(), "Sync failed", eipa1);
                if(!hlrs1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs1).ensureMutable();
                }
                ((hlrv)hlrs1.b_message).h = 4;
                ((hlrv)hlrs1.b_message).b |= 16;
                ProtoLiteMessage hftv2 = hftp5.b_message;
                if((((hlrr)hftv2).b & 2) == 0) {
                    if(!hftv2.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ((hlrr)hftp5.b_message).d = 1;
                    ((hlrr)hftp5.b_message).b |= 2;
                }
            }
            catch(Throwable throwable13) {
                goto label_383;
            }
            try {
                if(hftp2 == null) {
                    hlrs1.a(hftp5);
                }
                eitw0 = eipa1;
                hashSet3 = hashSet1;
                hftp4 = hftp2;
                goto label_327;
            label_383:
                if(hftp2 == null) {
                    hlrs1.a(hftp5);
                }
                throw throwable13;
            label_386:
                if(hftp2 == null) {
                    hlrs1.a(hftp5);
                }
            }
            catch(RuntimeException runtimeException0) {
                goto label_519;
            }
            catch(Throwable throwable3) {
                goto label_531;
            }
            try {
                hashSet3 = hashSet1;
                hftp4 = hftp2;
                goto label_327;
            }
            catch(RuntimeException runtimeException0) {
            label_392:
                gnzv1 = gnzv0;
                hftp2 = hftp4;
                hashSet1 = hashSet3;
                eiud0 = this;
                goto label_519;
            }
            catch(Throwable throwable3) {
            }
        label_398:
            gnzv1 = gnzv0;
            hftp2 = hftp4;
            hashSet1 = hashSet3;
            eiud0 = this;
            goto label_531;
            try {
            label_403:
                gnzv1 = gnzv0;
                hftp2 = hftp4;
                hashSet1 = hashSet3;
                eiud0 = this;
                if(eitw0 != null) {
                    throw eitw0;
                }
            label_409:
                if(arr_s.length > 0 && (v14 > 0 || eitw1.a > eitw1.b)) {
                    if(!hlrs1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hlrs1).ensureMutable();
                    }
                    ((hlrv)hlrs1.b_message).h = 4;
                    ((hlrv)hlrs1.b_message).b |= 16;
                    throw new eipa(0x7340, "Could not find valid auth token for all requested accounts");
                }
                goto label_415;
            }
            catch(RuntimeException runtimeException0) {
                goto label_519;
            }
            catch(Throwable throwable3) {
                goto label_531;
            }
        }
        goto label_409;
    label_415:
        if(hftp2 != null) {
            ProtoLiteMessage hftv3 = hftp2.b_message;
            switch(hlrq.b(((hlrr)hftv3).d)) {
                case 0: 
                case 1: {
                    int v16 = eiud.K(eitw1);
                    if(!hftv3.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((hlrr)hftp2.b_message).d = v16 - 1;
                    ((hlrr)hftp2.b_message).b |= 2;
                }
            }
            ProtoLiteBuilder hftp6 = eiud.N(eitw1);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hlrr hlrr1 = (hlrr)hftp2.b_message;
            hlsg hlsg1 = (hlsg)hftp6.N_build();
            hlsg1.getClass();
            hlrr1.h = hlsg1;
            hlrr1.b |= 0x40;
            hlrs1.a(hftp2);
            if(eiud.K(eitw1) != 1) {
                if(!hlrs1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs1).ensureMutable();
                }
                ((hlrv)hlrs1.b_message).h = 4;
                ((hlrv)hlrs1.b_message).b |= 16;
            }
        }
        ggfn ggfn3 = new ggfn();
        for(Object object3: hashSet1) {
            ggfn3.i(((String)((gfsz)object3).b));
        }
        ggfp1 = ggfn3.h();
        try {
            v17 = eiud0.l(arr_s1, ggfp1);
        }
        catch(RuntimeException runtimeException2) {
            v18 = 0;
            v19 = 0;
            goto label_463;
        }
        try {
            v20 = eiud0.m(ggfp1);
        }
        catch(RuntimeException runtimeException2) {
            v18 = v17;
            v19 = 0;
            goto label_463;
        }
        if(gnzv1 == gnzv.b || gnzv1 == gnzv.c) {
            try {
                v21 = eiud0.w();
                goto label_469;
            }
            catch(RuntimeException runtimeException2) {
                v19 = v20;
                v18 = v17;
            }
        label_463:
            a.ae(eiud.a.i(), "Garbage collection failed", runtimeException2);
            v17 = v18;
            v20 = v19;
        }
        v21 = 0;
    label_469:
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv5 = (hlrv)hlrs1.b_message;
        hlrv5.b |= 0x400;
        hlrv5.l = (long)v17;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv6 = (hlrv)hlrs1.b_message;
        hlrv6.b |= 0x800;
        hlrv6.m = (long)v20;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv7 = (hlrv)hlrs1.b_message;
        hlrv7.b |= 0x1000;
        hlrv7.n = (long)v21;
        ggdy0 = new ggdy();
        for(Object object4: DesugarCollections.unmodifiableList(((hlrv)hlrs1.b_message).g)) {
            int v22 = ((hlrr)object4).d;
            if(hlrq.b(v22) != 0 && hlrq.b(v22) != 1) {
                ggdy0.i(hlrq.a((hlrq.b(v22) == 0 ? 1 : hlrq.b(v22))));
            }
        }
    label_492:
        bboh bboh1 = eiud.a;
        ggtj ggtj2 = (ggtj)bboh1.h();
        String s5 = ((hlrv)hlrs1.b_message).e;
        int v23 = hlru.b(((hlrv)hlrs1.b_message).h);
        ggtj2.Y("Sync completed. fetchReason: %s, fetchPackageName: %s, syncErrorType: %s, individual sync errors: %s.", gnzv1.name(), s5, hlru.a((v23 == 0 ? 1 : v23)), new gfss(",").b(ggdy0.h()));
        eiud0.hA(gnzv1, ggfp1, ((hlrv)((ProtoLiteBuilder)hlrs1).N_build()));
        long v24 = SystemClock.elapsedRealtime() - v;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv8 = (hlrv)hlrs1.b_message;
        hlrv8.b |= 0x20;
        hlrv8.i = (int)v24;
        ((ggtj)bboh1.h()).A("Finished notifying packages after sync. syncLatency: %d", v24);
        return;
        try {
        label_506:
            Object object5 = ggqk0.next();
            eiud0.z(ggek1, new String[]{((String)object5)});
            goto label_104;
        }
        catch(Throwable throwable5) {
        label_510:
            throwable8 = throwable5;
            hashSet1 = hashSet2;
            hftp2 = hftp0;
        }
        try {
        label_513:
            gdqb0.close();
            throw throwable8;
        }
        catch(Throwable throwable14) {
            try {
                throwable8.addSuppressed(throwable14);
                throw throwable8;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Throwable throwable3) {
                goto label_531;
            }
        }
    label_519:
        eitw0 = eitw1;
    label_520:
        hftp1 = hftp2;
        try {
        label_521:
            if((((hlrv)hlrs1.b_message).b & 16) == 0) {
                if(!hlrs1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs1).ensureMutable();
                }
                ((hlrv)hlrs1.b_message).h = 3;
                ((hlrv)hlrs1.b_message).b |= 16;
            }
            throw runtimeException0;
        }
        catch(Throwable throwable15) {
            throwable1 = throwable15;
            goto label_534;
        }
    label_531:
        throwable1 = throwable3;
        eitw0 = eitw1;
    label_533:
        hftp1 = hftp2;
    label_534:
        if(hftp1 != null && eitw0 != null) {
            ProtoLiteMessage hftv4 = hftp1.b_message;
            switch(hlrq.b(((hlrr)hftv4).d)) {
                case 0: 
                case 1: {
                    int v25 = eiud.K(eitw0);
                    if(!hftv4.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlrr)hftp1.b_message).d = v25 - 1;
                    ((hlrr)hftp1.b_message).b |= 2;
                }
            }
            ProtoLiteBuilder hftp7 = eiud.N(eitw0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlrr hlrr2 = (hlrr)hftp1.b_message;
            hlsg hlsg2 = (hlsg)hftp7.N_build();
            hlsg2.getClass();
            hlrr2.h = hlsg2;
            hlrr2.b |= 0x40;
            hlrs1.a(hftp1);
            if(eiud.K(eitw0) != 1) {
                if(!hlrs1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs1).ensureMutable();
                }
                ((hlrv)hlrs1.b_message).h = 4;
                ((hlrv)hlrs1.b_message).b |= 16;
            }
        }
        ggfn ggfn4 = new ggfn();
        for(Object object6: hashSet1) {
            ggfn4.i(((String)((gfsz)object6).b));
        }
        ggfp ggfp3 = ggfn4.h();
        try {
            v26 = eiud0.l(arr_s1, ggfp3);
        }
        catch(RuntimeException runtimeException3) {
            v27 = 0;
            v28 = 0;
            goto label_582;
        }
        try {
            v29 = eiud0.m(ggfp3);
        }
        catch(RuntimeException runtimeException3) {
            v27 = v26;
            v28 = 0;
            goto label_582;
        }
        if(gnzv1 == gnzv.b || gnzv1 == gnzv.c) {
            try {
                v30 = eiud0.w();
                goto label_588;
            }
            catch(RuntimeException runtimeException3) {
                v28 = v29;
                v27 = v26;
            }
        label_582:
            a.ae(eiud.a.i(), "Garbage collection failed", runtimeException3);
            v26 = v27;
            v29 = v28;
        }
        v30 = 0;
    label_588:
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv9 = (hlrv)hlrs1.b_message;
        hlrv9.b |= 0x400;
        hlrv9.l = (long)v26;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv10 = (hlrv)hlrs1.b_message;
        hlrv10.b |= 0x800;
        hlrv10.m = (long)v29;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv11 = (hlrv)hlrs1.b_message;
        hlrv11.b |= 0x1000;
        hlrv11.n = (long)v30;
        ggdy ggdy1 = new ggdy();
        for(Object object7: DesugarCollections.unmodifiableList(((hlrv)hlrs1.b_message).g)) {
            int v31 = ((hlrr)object7).d;
            if(hlrq.b(v31) != 0 && hlrq.b(v31) != 1) {
                ggdy1.i(hlrq.a((hlrq.b(v31) == 0 ? 1 : hlrq.b(v31))));
            }
        }
        int v32 = 1;
        bboh bboh2 = eiud.a;
        ggtj ggtj3 = (ggtj)bboh2.h();
        String s6 = gnzv1.name();
        String s7 = ((hlrv)hlrs1.b_message).e;
        int v33 = hlru.b(((hlrv)hlrs1.b_message).h);
        if(v33 != 0) {
            v32 = v33;
        }
        ggtj3.Y("Sync completed. fetchReason: %s, fetchPackageName: %s, syncErrorType: %s, individual sync errors: %s.", s6, s7, hlru.a(v32), new gfss(",").b(ggdy1.h()));
        eiud0.hA(gnzv1, ggfp3, ((hlrv)((ProtoLiteBuilder)hlrs1).N_build()));
        long v34 = SystemClock.elapsedRealtime() - v;
        if(!hlrs1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrs1).ensureMutable();
        }
        hlrv hlrv12 = (hlrv)hlrs1.b_message;
        hlrv12.b |= 0x20;
        hlrv12.i = (int)v34;
        ((ggtj)bboh2.h()).A("Finished notifying packages after sync. syncLatency: %d", v34);
        throw throwable1;
    }

    public final void r(gnzv gnzv0, String s, String s1, hlrs hlrs0) {
        String[] arr_s = this.h();
        if("".equals(s1)) {
            this.A(gnzv0, s, new String[0], arr_s, true, hlrs0);
            return;
        }
        this.A(gnzv0, s, new String[]{s1}, arr_s, false, hlrs0);
    }

    final void s() {
        bboh bboh0 = eiud.a;
        ((ggtj)bboh0.h()).x("vacuuming");
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/sync/HeterodyneSyncer", "vacuum", 0xC61, "VACUUM phenotype db")) {
            new einy(this.c.a()).c("VACUUM").d();
            eiox eiox0 = this.i;
            if(eiox0 != null) {
                new einy(eiox0.a()).c("VACUUM").d();
            }
            ((ggtj)bboh0.h()).x("done vacuuming");
        }
        catch(SQLException sQLException0) {
            a.ae(eiud.a.j(), "SQLException when vacuuming:", sQLException0);
        }
    }

    final eiuc t(ggfp ggfp0, gnzv gnzv0, String s, boolean z, ggeo ggeo0, ggfp ggfp1, boolean z1, ProtoLiteBuilder hftp0) {
        eioe eioe8;
        gged_interceptors gged2;
        eioe eioe7;
        ggek ggek3;
        long v14;
        String s16;
        gged_interceptors gged1;
        ProtoLiteBuilder hftp11;
        HashMap hashMap1;
        Iterator iterator2;
        gnzz gnzz1;
        eitx eitx0;
        Iterator iterator1;
        String s14;
        byte[] arr_b13;
        byte[] arr_b12;
        long v11;
        byte[] arr_b10;
        byte[] arr_b9;
        long v10;
        String s13;
        long v9;
        eioe eioe6;
        List list1;
        Long long0;
        long v8;
        byte[] arr_b8;
        String s12;
        String s11;
        long v7;
        Throwable throwable22;
        eion eion3;
        eion eion2;
        eioe eioe5;
        eiop eiop3;
        eion eion1;
        eion eion0;
        ggek ggek2;
        HashMap hashMap0;
        ggek ggek1;
        eiop eiop2;
        eiuc eiuc0;
        byte[] arr_b7;
        eiok eiok1;
        ggeo ggeo2;
        gfsz gfsz0;
        gged_interceptors gged0;
        eioe eioe4;
        eiok eiok0;
        goau goau4;
        String s7;
        goau goau0;
        gnzz gnzz0;
        eioe eioe3;
        ProtoLiteBuilder hftp5;
        String s6;
        String s5;
        byte[] arr_b5;
        byte[] arr_b4;
        long v3;
        byte[] arr_b3;
        byte[] arr_b2;
        long v2;
        String s4;
        ggdy ggdy0;
        eiop eiop1;
        eioe eioe2;
        ggek ggek0;
        eiop eiop0;
        eioe eioe1;
        hftc hftc0;
        ProtoLiteBuilder hftp3;
        byte[] arr_b;
        String s2;
        eioe eioe0;
        eiog eiog0;
        Throwable throwable2;
        hlpl hlpl1;
        hlph hlph0;
        ProtoLiteBuilder hftp2;
        gdqb gdqb1;
        String s1;
        int v1;
        goav goav0;
        ProtoLiteBuilder hftp1;
        goai goai0;
        ggeo ggeo1 = ggeo0;
        gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/sync/HeterodyneSyncer", "createRequest", 0x539, "Create heterodyne request");
        try {
            goai0 = (goai)((ProtoLiteMessage)goak.a).v_newBuilder();
            hftp1 = ((ProtoLiteMessage)goac.a).v_newBuilder();
            goav0 = (goav)this.l.get();
            if(goav0 != null) {
                goto label_6;
            }
            goto label_10;
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
        try {
        label_6:
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((goac)hftp1.b_message).h = goav0;
            ((goac)hftp1.b_message).b |= 0x80;
        label_10:
            if(!z1) {
                long v = "".equals(gggq.r(ggfp0)) ? 0L : 1L;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                goac goac0 = (goac)hftp1.b_message;
                goac0.b |= 2;
                goac0.c = v;
            }
            if(!goai0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goai0).ensureMutable();
            }
        }
        catch(Throwable throwable1) {
            goto label_71;
        }
        try {
            ((goak)goai0.b_message).f = gnzv0.x;
            ((goak)goai0.b_message).b |= 4;
            if(s != null) {
                goto label_22;
            }
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
        try {
        label_22:
            if(!goai0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goai0).ensureMutable();
            }
            goak goak0 = (goak)goai0.b_message;
            goak0.b |= 8;
            goak0.g = s;
        }
        catch(Throwable throwable1) {
            goto label_71;
        }
        try {
        label_27:
            v1 = this.m - 1;
            if(!goai0.b_message.isImmutable()) {
                goto label_29;
            }
            goto label_30;
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
        try {
        label_29:
            ((ProtoLiteBuilder)goai0).ensureMutable();
        }
        catch(Throwable throwable1) {
            goto label_71;
        }
        try {
        label_30:
            goak goak1 = (goak)goai0.b_message;
            goak1.b |= 0x20;
            goak1.h = v1;
            try {
                s1 = this.k.a();
                goto label_42;
            }
            catch(eipa eipa0) {
            }
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
        try {
            gdqb1 = gdqb0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlrr)hftp0.b_message).d = 10;
            ((hlrr)hftp0.b_message).b |= 2;
            throw eipa0;
        }
        catch(Throwable throwable0) {
            goto label_748;
        }
    label_42:
        if(s1 != null) {
            try {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                goac goac1 = (goac)hftp1.b_message;
                goac1.b |= 16;
                goac1.e = s1;
            }
            catch(Throwable throwable1) {
                goto label_71;
            }
        }
        try {
            hftp2 = ((ProtoLiteMessage)hlpl.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                goto label_50;
            }
            goto label_51;
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
        try {
        label_50:
            hftp2.ensureMutable();
        }
        catch(Throwable throwable1) {
            goto label_71;
        }
        try {
        label_51:
            ((hlpl)hftp2.b_message).c = 4;
            ((hlpl)hftp2.b_message).b |= 1;
            hlph0 = this.b();
            if(!hftp2.b_message.isImmutable()) {
                goto label_55;
            }
            goto label_56;
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
        try {
        label_55:
            hftp2.ensureMutable();
        }
        catch(Throwable throwable1) {
            goto label_71;
        }
        try {
        label_56:
            hlpl hlpl0 = (hlpl)hftp2.b_message;
            hlph0.getClass();
            hlpl0.d = hlph0;
            hlpl0.b |= 8;
            hlpl1 = (hlpl)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                goto label_62;
            }
            goto label_63;
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
        try {
        label_62:
            hftp1.ensureMutable();
        }
        catch(Throwable throwable1) {
            goto label_71;
        }
        try {
        label_63:
            ProtoLiteMessage hftv0 = hftp1.b_message;
            hlpl1.getClass();
            ((goac)hftv0).d = hlpl1;
            ((goac)hftv0).b |= 8;
            if(!hftv0.isImmutable()) {
                goto label_68;
            }
            goto label_74;
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
        try {
        label_68:
            hftp1.ensureMutable();
        }
        catch(Throwable throwable1) {
        label_71:
            throwable2 = throwable1;
            gdqb1 = gdqb0;
            goto label_749;
        }
        try {
        label_74:
            goac goac2 = (goac)hftp1.b_message;
            goac2.b |= 0x40;
            goac2.g = z;
            if(hxjz.c()) {
                eiog0 = this.c.a().a();
                goto label_83;
            }
            else {
                goto label_164;
            }
            goto label_165;
        }
        catch(Throwable throwable0) {
        label_81:
            gdqb1 = gdqb0;
            goto label_748;
        }
        try {
        label_83:
            if(eiog0.f()) {
                eioe0 = ((eioh)eiog0).g("SELECT name, app_wide_properties\nFROM android_packages;\n").e(new String[]{"android_packages"}).f();
                goto label_93;
            }
            else {
                goto label_134;
            }
            goto label_162;
        }
        catch(Throwable throwable3) {
            gdqb1 = gdqb0;
            try {
                eiog0.close();
                throw throwable3;
            }
            catch(Throwable throwable4) {
                try {
                    throwable3.addSuppressed(throwable4);
                    throw throwable3;
                }
                catch(Throwable throwable0) {
                    goto label_748;
                }
            }
        }
        try {
            while(true) {
            label_93:
                if(!eioe0.b()) {
                    goto label_123;
                }
                s2 = eioe0.h(0);
                try {
                    arr_b = eioe0.j(1);
                    if(arr_b == null) {
                        continue;
                    }
                    hftp3 = ((ProtoLiteMessage)gnzy.a).v_newBuilder();
                    hftc0 = hftc.a;
                }
                catch(hfur hfur0) {
                    gdqb1 = gdqb0;
                    goto label_116;
                }
                gdqb1 = gdqb0;
                break;
            }
        }
        catch(Throwable throwable5) {
            goto label_126;
        }
        try {
            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fpji.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv1);
            ByteString hfsf0 = ((fpji)hftv1).b;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gnzy gnzy0 = (gnzy)hftp3.b_message;
            hfsf0.getClass();
            gnzy0.b |= 1;
            gnzy0.c = hfsf0;
            goai0.a(s2, ((gnzy)hftp3.N_build()));
        }
        catch(hfur hfur0) {
            try {
            label_116:
                a.e(eiud.a.j(), "Failed to parse AppWideProperties from Phixit schema for Android package %s", s2, hfur0);
                goto label_121;
            }
            catch(Throwable throwable5) {
            }
            goto label_119;
        }
        catch(Throwable throwable5) {
            try {
            label_119:
                TWR.safeClose$NT(eioe0, throwable5);
                throw throwable5;
            }
            catch(Throwable throwable3) {
                goto label_160;
            }
        }
    label_121:
        gdqb0 = gdqb1;
        goto label_93;
        try {
        label_123:
            gdqb1 = gdqb0;
            goto label_132;
        }
        catch(Throwable throwable5) {
            try {
            label_126:
                gdqb1 = gdqb0;
                eioe0.close();
                throw throwable5;
            }
            catch(Throwable throwable6) {
                try {
                    throwable5.addSuppressed(throwable6);
                    throw throwable5;
                label_132:
                    eioe0.close();
                    goto label_162;
                label_134:
                    gdqb1 = gdqb0;
                    eioe1 = ((eioh)eiog0).g("SELECT androidPackageName, appWideProperties\nFROM AppWideProperties;\n").d().f();
                }
                catch(Throwable throwable3) {
                    goto label_160;
                }
            }
        }
        try {
            while(true) {
                if(!eioe1.b()) {
                    goto label_157;
                }
                String s3 = eioe1.h(0);
                try {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gnzy.a).v_newBuilder();
                    byte[] arr_b1 = eioe1.k(1);
                    ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fpji.a), arr_b1, 0, arr_b1.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv2);
                    ByteString hfsf1 = ((fpji)hftv2).b;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    gnzy gnzy1 = (gnzy)hftp4.b_message;
                    hfsf1.getClass();
                    gnzy1.b |= 1;
                    gnzy1.c = hfsf1;
                    goai0.a(s3, ((gnzy)hftp4.N_build()));
                }
                catch(hfur hfur1) {
                    a.e(eiud.a.j(), "Failed to parse AppWideProperties from pre-Phixit schema for Android package %s", s3, hfur1);
                }
            }
        }
        catch(Throwable throwable7) {
            try {
                TWR.safeClose$NT(eioe1, throwable7);
                throw throwable7;
            label_157:
                eioe1.close();
                goto label_162;
            }
            catch(Throwable throwable3) {
            }
        }
        try {
        label_160:
            TWR.safeClose$NT(eiog0, throwable3);
            throw throwable3;
        label_162:
            eiog0.close();
            goto label_165;
        label_164:
            gdqb1 = gdqb0;
        label_165:
            eiop0 = this.c.a().c();
        }
        catch(Throwable throwable0) {
            goto label_748;
        }
        try {
            if(eiop0.f()) {
                goto label_400;
            }
            else {
                ggek0 = new ggek();
                eioe2 = ((eioh)eiop0).g("SELECT packageName, version, params, dynamicParams, baselineCl, heterodyneInfo, runtimeProperties, androidPackageName FROM Packages WHERE packageName NOT GLOB \'__internal.*\'").d().f();
                goto label_173;
            }
            goto label_754;
        }
        catch(Throwable throwable8) {
            eiop1 = eiop0;
            goto label_396;
        }
        try {
        label_173:
            ggdy0 = new ggdy();
        alab1:
            while(true) {
            label_174:
                if(!eioe2.b()) {
                    goto label_347;
                }
                s4 = eioe2.h(0);
                if(ggfp1.isEmpty() || ggfp1.contains(s4)) {
                    v2 = eioe2.f(1);
                    arr_b2 = eioe2.j(2);
                    arr_b3 = eioe2.j(3);
                    if(arr_b3 == null) {
                        arr_b3 = arr_b2;
                    }
                    v3 = eioe2.f(4);
                    arr_b4 = eioe2.j(5);
                    arr_b5 = eioe2.j(6);
                    s5 = eioe2.h(7);
                    ggek0.i(s4, s5);
                    ggqj ggqj0 = ggfp0.om();
                    while(true) {
                    label_188:
                        if(!ggqj0.hasNext()) {
                            goto label_344;
                        }
                        Object object0 = ggqj0.next();
                        s6 = (String)object0;
                        hftp5 = ((ProtoLiteMessage)goaa.a).v_newBuilder();
                        eioe3 = eioe2;
                        break alab1;
                    }
                }
            }
        }
        catch(Throwable throwable9) {
            goto label_337;
        }
        try {
            gnzz0 = (gnzz)hftp5;
            goau0 = goau.a;
            goto label_198;
        }
        catch(Throwable throwable9) {
            try {
                goto label_338;
            label_198:
                eiop1 = eiop0;
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)goau0).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp6.b_message;
                s4.getClass();
                ((goau)hftv3).b |= 1;
                ((goau)hftv3).c = s4;
                if(!hftv3.isImmutable()) {
                    hftp6.ensureMutable();
                }
                goau goau1 = (goau)hftp6.b_message;
                goau1.b |= 2;
                goau1.d = v2;
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)goag.a).v_newBuilder();
                if("".equals(s6)) {
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    goag goag0 = (goag)hftp7.b_message;
                    s7 = s4;
                    goag0.b |= 1;
                    goag0.c = -1;
                }
                else {
                    s7 = s4;
                    int v4 = eiud.v(ggeo1, s6);
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    goag goag1 = (goag)hftp7.b_message;
                    goag1.b |= 1;
                    goag1.c = v4;
                }
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                goau goau2 = (goau)hftp6.b_message;
                goag goag2 = (goag)hftp7.N_build();
                goag2.getClass();
                goau2.e = goag2;
                goau2.b |= 4;
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp6.b_message;
                ((goau)hftv4).b |= 8;
                ((goau)hftv4).f = v3;
                if(!hftv4.isImmutable()) {
                    hftp6.ensureMutable();
                }
                goau goau3 = (goau)hftp6.b_message;
                s5.getClass();
                goau3.b |= 16;
                goau3.g = s5;
                if(arr_b4 != null) {
                    ByteString hfsf2 = ByteString.copyFrom(arr_b4);
                    if(!gnzz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gnzz0).ensureMutable();
                    }
                    goaa goaa0 = (goaa)gnzz0.b_message;
                    goaa0.b |= 0x20;
                    goaa0.h = hfsf2;
                }
                goau4 = (goau)hftp6.N_build();
                if(!gnzz0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gnzz0).ensureMutable();
                }
                goaa goaa1 = (goaa)gnzz0.b_message;
                goau4.getClass();
                goaa1.c = goau4;
                goaa1.b |= 1;
                if(arr_b5 != null) {
                    ByteString hfsf3 = ByteString.copyFrom(arr_b5);
                    if(!gnzz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gnzz0).ensureMutable();
                    }
                    goaa goaa2 = (goaa)gnzz0.b_message;
                    goaa2.b |= 4;
                    goaa2.e = hfsf3;
                    if(arr_b2 != null) {
                        ByteString hfsf4 = ByteString.copyFrom(arr_b2);
                        if(!gnzz0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)gnzz0).ensureMutable();
                        }
                        goaa goaa3 = (goaa)gnzz0.b_message;
                        goaa3.b |= 2;
                        goaa3.d = hfsf4;
                    }
                }
                else if(arr_b3 != null) {
                    ByteString hfsf5 = ByteString.copyFrom(arr_b3);
                    if(!gnzz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gnzz0).ensureMutable();
                    }
                    goaa goaa4 = (goaa)gnzz0.b_message;
                    goaa4.b |= 2;
                    goaa4.d = hfsf5;
                }
                eiod eiod0 = ((eioh)eiop1).g("SELECT tokensTag FROM ExperimentTokens WHERE packageName = ? AND user = ? AND version = ? AND isCommitted = 0");
                goau goau5 = ((goaa)gnzz0.b_message).c;
                String s8 = (goau5 == null ? goau0 : goau5).c;
                if(goau5 == null) {
                    goau5 = goau0;
                }
                eiok0 = eiod0.h(new Object[]{s8, s6, ((long)goau5.d)}).i();
            }
            catch(Throwable throwable9) {
                goto label_352;
            }
        }
        if(eiok0 != null) {
            try {
                byte[] arr_b6 = eiok0.j(0);
                if(arr_b6 != null) {
                    ByteString hfsf6 = ByteString.copyFrom(arr_b6);
                    if(!gnzz0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gnzz0).ensureMutable();
                    }
                    goaa goaa5 = (goaa)gnzz0.b_message;
                    goaa5.b |= 8;
                    goaa5.g = hfsf6;
                }
            }
            catch(Throwable throwable10) {
                try {
                    TWR.safeClose$NT(eiok0, throwable10);
                    throw throwable10;
                label_300:
                    if(eiok0 != null) {
                        eiok0.close();
                    }
                    eioe4 = ((eioh)eiop1).g("SELECT partitionId, tag FROM ApplicationTags WHERE packageName = ? AND user = ? AND version = ?").h(new Object[]{goau4.c, s6, ((long)goau4.d)}).f();
                    goto label_303;
                }
                catch(Throwable throwable9) {
                    goto label_352;
                }
            }
        }
        goto label_300;
        try {
        label_303:
            ggdy ggdy1 = new ggdy();
            while(eioe4.b()) {
                ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)goat.a).v_newBuilder();
                long v5 = eioe4.f(0);
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                goat goat0 = (goat)hftp8.b_message;
                goat0.b |= 1;
                goat0.c = v5;
                ByteString hfsf7 = ByteString.copyFrom(eioe4.k(1));
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                goat goat1 = (goat)hftp8.b_message;
                goat1.b |= 2;
                goat1.d = hfsf7;
                ggdy1.i(((goat)hftp8.N_build()));
            }
            gged0 = ggdy1.h();
            goto label_325;
        }
        catch(Throwable throwable11) {
            try {
                TWR.safeClose$NT(eioe4, throwable11);
                throw throwable11;
            label_325:
                eioe4.close();
                gnzz0.a(gged0);
                ggdy0.i(((goaa)((ProtoLiteBuilder)gnzz0).N_build()));
            }
            catch(Throwable throwable9) {
                goto label_352;
            }
        }
        try {
            eioe2 = eioe3;
            ggeo1 = ggeo0;
            eiop0 = eiop1;
            arr_b2 = arr_b2;
            s4 = s7;
            arr_b3 = arr_b3;
            v3 = v3;
            goto label_188;
        }
        catch(Throwable throwable9) {
        label_337:
            eioe3 = eioe2;
        }
    label_338:
        eiop1 = eiop0;
        try {
            eioe3.close();
            throw throwable9;
        }
        catch(Throwable throwable12) {
            try {
                throwable9.addSuppressed(throwable12);
                throw throwable9;
            }
            catch(Throwable throwable8) {
                goto label_396;
            }
        }
        try {
        label_344:
            ggeo1 = ggeo0;
            hftp1 = hftp1;
            goto label_174;
        label_347:
            eioe3 = eioe2;
            eiop1 = eiop0;
            gfsz0 = new gfsz(ggdy0.h(), ggek0.g());
            goto label_354;
        }
        catch(Throwable throwable9) {
            try {
            label_352:
                TWR.safeClose$NT(eioe3, throwable9);
                throw throwable9;
            label_354:
                eioe3.close();
                List list0 = (List)gfsz0.a;
                ggeo2 = (ggeo)gfsz0.b;
                if(!goai0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)goai0).ensureMutable();
                }
                goak goak2 = (goak)goai0.b_message;
                goak2.b();
                hfrj.E(list0, goak2.d);
                String s9 = z1 ? "ALL_USERS" : ((String)gggq.r(ggfp0));
                eiok1 = ((eioh)eiop1).g("SELECT bytesTag FROM RequestTags WHERE user = ?").h(new Object[]{s9}).i();
            }
            catch(Throwable throwable8) {
                goto label_396;
            }
        }
        try {
            if(eiok1 == null) {
                goto label_368;
            }
            else {
                arr_b7 = eiok1.k(0);
                goto label_366;
            }
            goto label_373;
        }
        catch(Throwable throwable13) {
            goto label_371;
        }
        try {
        label_366:
            eiok1.close();
            goto label_373;
        }
        catch(Throwable throwable8) {
            goto label_396;
        }
        try {
        label_368:
            arr_b7 = eiud.f;
            goto label_373;
        }
        catch(Throwable throwable13) {
            try {
            label_371:
                TWR.safeClose$NT(eiok1, throwable13);
                throw throwable13;
            label_373:
                ByteString hfsf8 = ByteString.copyFrom(arr_b7);
                if(!goai0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)goai0).ensureMutable();
                }
                goak goak3 = (goak)goai0.b_message;
                goak3.b |= 2;
                goak3.e = hfsf8;
                ByteString hfsf9 = ByteString.copyFrom(eiud.H(eiop1));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                goac goac3 = (goac)hftp1.b_message;
                goac3.b |= 0x20;
                goac3.f = hfsf9;
                if(!goai0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)goai0).ensureMutable();
                }
                goak goak4 = (goak)goai0.b_message;
                goac goac4 = (goac)hftp1.N_build();
                goac4.getClass();
                goak4.c = goac4;
                goak4.b |= 1;
                eiop1.e();
                eiuc0 = new eiuc(((goak)((ProtoLiteBuilder)goai0).N_build()), ggeo2, ggnf.a, ggnf.a);
                goto label_398;
            }
            catch(Throwable throwable8) {
            }
        }
    label_396:
        Throwable throwable14 = throwable8;
        goto label_405;
        try {
        label_398:
            eiop1.close();
            goto label_754;
        }
        catch(Throwable throwable0) {
            goto label_748;
        }
        try {
        label_400:
            eiop0.e();
            goto label_410;
        }
        catch(Throwable throwable15) {
            throwable14 = throwable15;
            eiop1 = eiop0;
        }
        try {
        label_405:
            eiop1.close();
            throw throwable14;
        }
        catch(Throwable throwable16) {
            try {
                throwable14.addSuppressed(throwable16);
                throw throwable14;
            label_410:
                eiop0.close();
                eiop2 = this.c.a().b();
            }
            catch(Throwable throwable0) {
                goto label_748;
            }
        }
        try {
            ByteString hfsf10 = ByteString.copyFrom(eiud.H(eiop2));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            goac goac5 = (goac)hftp1.b_message;
            goac5.b |= 0x20;
            goac5.f = hfsf10;
            if(!goai0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)goai0).ensureMutable();
            }
            goak goak5 = (goak)goai0.b_message;
            goac goac6 = (goac)hftp1.N_build();
            goac6.getClass();
            goak5.c = goac6;
            goak5.b |= 1;
            ggek1 = new ggek();
            hashMap0 = new HashMap();
            ggek2 = new ggek();
            eion0 = eiop2.d("ApplicationRequestAccounts", "CREATE TEMP TABLE ApplicationRequestAccounts (account_id INTEGER PRIMARY KEY);");
        }
        catch(Throwable throwable17) {
            try {
                TWR.safeClose$NT(eiop2, throwable17);
                throw throwable17;
            }
            catch(Throwable throwable0) {
                goto label_748;
            }
        }
        try {
            for(Object object1: new HashSet(ggfp0)) {
                String s10 = (String)object1;
                if(eiop2.c("    INSERT INTO TEMP.ApplicationRequestAccounts\n    SELECT account_id\n    FROM accounts\n    WHERE name = ?1;\n").g(new Object[]{s10}).c() < 0L) {
                    long v6 = eiop2.c("INSERT INTO accounts (name) VALUES (?1);").g(new Object[]{s10}).c();
                    eiop2.c("INSERT INTO TEMP.ApplicationRequestAccounts (account_id) VALUES (?1);").g(new Object[]{v6}).d();
                }
            }
            eion1 = eiop2.d("ApplicationRequestConfigPackages", "CREATE TEMP TABLE ApplicationRequestConfigPackages (config_package_id INTEGER PRIMARY KEY);\n");
        }
        catch(Throwable throwable18) {
            eiop3 = eiop2;
            try {
                eion0.close();
                throw throwable18;
            }
            catch(Throwable throwable19) {
                try {
                    throwable18.addSuppressed(throwable19);
                    throw throwable18;
                }
                catch(Throwable throwable17) {
                    goto label_743;
                }
            }
        }
        try {
            if(ggfp1.isEmpty()) {
                eiop2.c("INSERT OR IGNORE INTO TEMP.ApplicationRequestConfigPackages\nSELECT config_package_id\nFROM config_packages;\n").f(new String[]{"config_packages"}).d();
            }
            else {
                ggqj ggqj1 = ggfp1.om();
                while(ggqj1.hasNext()) {
                    Object object2 = ggqj1.next();
                    eiop2.c("INSERT OR IGNORE INTO TEMP.ApplicationRequestConfigPackages\nSELECT config_package_id\nFROM config_packages\nWHERE name = ?1;\n").g(new Object[]{((String)object2)}).d();
                }
            }
            eioe5 = ((eioh)eiop2).g("WITH TokensTags AS (\n  SELECT\n    experiment_states.config_package_id,\n    account_id,\n    tokens_tag,\n    MAX(experiment_state_id) AS experiment_state_id\n  FROM experiment_states\n  INNER JOIN TEMP.ApplicationRequestConfigPackages\n    USING (config_package_id)\n  INNER JOIN TEMP.ApplicationRequestAccounts\n    USING (account_id)\n  GROUP BY experiment_states.config_package_id, experiment_states.account_id\n)\nSELECT\n  TEMP.ApplicationRequestConfigPackages.config_package_id,\n  config_packages.name,\n  accounts.name,\n  tokens_tag,\n  IFNULL(experiment_state_id, -1) AS experiment_state_id\nFROM TEMP.ApplicationRequestConfigPackages\nCROSS JOIN TEMP.ApplicationRequestAccounts\nINNER JOIN config_packages\n  USING (config_package_id)\nINNER JOIN accounts\n  USING (account_id)\nLEFT OUTER JOIN TokensTags\n  USING (config_package_id, account_id)\nORDER BY TEMP.ApplicationRequestConfigPackages.config_package_id;\n").e(new String[]{"TokensTags", "experiment_states", "ApplicationRequestConfigPackages", "ApplicationRequestAccounts", "materialized subquery"}).f();
        }
        catch(Throwable throwable20) {
            eiop3 = eiop2;
            eion2 = eion1;
            eion3 = eion0;
            goto label_519;
        }
        while(true) {
            try {
                boolean z2 = eioe5.b();
            }
            catch(Throwable throwable21) {
                eiop3 = eiop2;
                eion2 = eion1;
                eion3 = eion0;
                throwable22 = throwable21;
                goto label_504;
            }
            if(!z2) {
                break;
            }
            try {
                v7 = eioe5.f(0);
                s11 = eioe5.h(1);
                s12 = eioe5.h(2);
                arr_b8 = eioe5.j(3);
            }
            catch(Throwable throwable23) {
                eiop3 = eiop2;
                eion3 = eion0;
                goto label_502;
            }
            try {
                eion3 = eion0;
                v8 = eioe5.f(4);
                long0 = v7;
                list1 = (List)hashMap0.get(long0);
            }
            catch(Throwable throwable23) {
                eiop3 = eiop2;
                goto label_502;
            }
            if(list1 == null) {
                try {
                    eiop3 = eiop2;
                    List list2 = new ArrayList();
                    hashMap0.put(long0, list2);
                    goto label_498;
                label_496:
                    eiop3 = eiop2;
                    list2 = list1;
                label_498:
                    list2.add(new eitx(s12, arr_b8, v8));
                    ggek1.i(new eitz(s11, s12), Long.valueOf(v8));
                    goto label_509;
                }
                catch(Throwable throwable23) {
                }
                goto label_502;
            }
            else {
                goto label_496;
            }
            goto label_498;
        label_502:
            throwable22 = throwable23;
            eion2 = eion1;
            try {
            label_504:
                eioe5.close();
                throw throwable22;
            }
            catch(Throwable throwable24) {
                try {
                    throwable22.addSuppressed(throwable24);
                    throw throwable22;
                }
                catch(Throwable throwable20) {
                    goto label_728;
                }
            }
        label_509:
            eion0 = eion3;
            eiop2 = eiop3;
        }
        try {
            eiop3 = eiop2;
            eion3 = eion0;
            eioe5.close();
            eioe6 = ((eioh)eiop3).g("SELECT\n  config_package_id,\n  config_packages.name,\n  version,\n  params,\n  dynamic_params,\n  baseline_cl,\n  heterodyne_info,\n  runtime_properties,\n  android_packages.name,\n  registration_generation\nFROM config_packages\nINNER JOIN TEMP.ApplicationRequestConfigPackages\n  USING (config_package_id)\nINNER JOIN android_packages\n  USING (android_package_id)\nWHERE config_packages.name NOT GLOB \'__internal.*\';\n").e(new String[]{"config_packages"}).f();
            goto label_524;
        }
        catch(Throwable throwable20) {
            eion2 = eion1;
        }
        try {
        label_519:
            eion2.close();
            throw throwable20;
        }
        catch(Throwable throwable25) {
            try {
                throwable20.addSuppressed(throwable25);
                throw throwable20;
            }
            catch(Throwable throwable18) {
                goto label_733;
            }
        }
        try {
            while(true) {
            label_524:
                if(!eioe6.b()) {
                    goto label_715;
                }
                v9 = eioe6.f(0);
                s13 = eioe6.h(1);
                v10 = eioe6.f(2);
                arr_b9 = eioe6.j(3);
                arr_b10 = eioe6.j(4);
                if(arr_b10 == null) {
                    break;
                }
                else {
                    goto label_533;
                }
                goto label_534;
            }
        }
        catch(Throwable throwable26) {
            goto label_718;
        }
        byte[] arr_b11 = arr_b9;
        goto label_534;
    label_533:
        arr_b11 = arr_b10;
        try {
        label_534:
            eion2 = eion1;
            v11 = eioe6.f(5);
            arr_b12 = eioe6.j(6);
            arr_b13 = eioe6.j(7);
            s14 = eioe6.h(8);
            ggek2.i(s13, new eity(s14, eioe6.f(9)));
            List list3 = (List)hashMap0.get(Long.valueOf(v9));
            if(list3 == null) {
                goto label_709;
            }
            else {
                iterator1 = list3.iterator();
                while(true) {
                label_543:
                    if(!iterator1.hasNext()) {
                        goto label_708;
                    }
                    Object object3 = iterator1.next();
                    eitx0 = (eitx)object3;
                    gnzz1 = (gnzz)((ProtoLiteMessage)goaa.a).v_newBuilder();
                    goto label_547;
                }
            }
            goto label_710;
        }
        catch(Throwable throwable26) {
            goto label_713;
        }
        try {
        label_547:
            byte[] arr_b14 = eitx0.b;
            if(arr_b14 == null) {
                iterator2 = iterator1;
                hashMap1 = hashMap0;
            }
            else {
                ByteString hfsf11 = ByteString.copyFrom(arr_b14);
                iterator2 = iterator1;
                if(!gnzz1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gnzz1).ensureMutable();
                }
                goaa goaa6 = (goaa)gnzz1.b_message;
                hashMap1 = hashMap0;
                goaa6.b |= 8;
                goaa6.g = hfsf11;
            }
            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)goau.a).v_newBuilder();
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp9.b_message;
            s13.getClass();
            ((goau)hftv5).b |= 1;
            ((goau)hftv5).c = s13;
            if(!hftv5.isImmutable()) {
                hftp9.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp9.b_message;
            ((goau)hftv6).b |= 2;
            ((goau)hftv6).d = v10;
            if(!hftv6.isImmutable()) {
                hftp9.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp9.b_message;
            ((goau)hftv7).b |= 8;
            ((goau)hftv7).f = v11;
            if(!hftv7.isImmutable()) {
                hftp9.ensureMutable();
            }
            goau goau6 = (goau)hftp9.b_message;
            s14.getClass();
            goau6.b |= 16;
            goau6.g = s14;
            ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)goag.a).v_newBuilder();
            String s15 = eitx0.a;
            if(s15.equals("")) {
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                goag goag3 = (goag)hftp10.b_message;
                goag3.b |= 1;
                goag3.c = -1;
                hftp11 = hftp10;
            }
            else {
                int v12 = eiud.v(ggeo1, s15);
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                goag goag4 = (goag)hftp10.b_message;
                hftp11 = hftp10;
                goag4.b |= 1;
                goag4.c = v12;
            }
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            goau goau7 = (goau)hftp9.b_message;
            goag goag5 = (goag)hftp11.N_build();
            goag5.getClass();
            goau7.e = goag5;
            goau7.b |= 4;
            if(!gnzz1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gnzz1).ensureMutable();
            }
            goaa goaa7 = (goaa)gnzz1.b_message;
            goau goau8 = (goau)hftp9.N_build();
            goau8.getClass();
            goaa7.c = goau8;
            goaa7.b |= 1;
            if(arr_b9 != null) {
                ByteString hfsf12 = ByteString.copyFrom(arr_b9);
                if(!gnzz1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gnzz1).ensureMutable();
                }
                goaa goaa8 = (goaa)gnzz1.b_message;
                goaa8.b |= 2;
                goaa8.d = hfsf12;
            }
            if(arr_b12 != null) {
                ByteString hfsf13 = ByteString.copyFrom(arr_b12);
                if(!gnzz1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gnzz1).ensureMutable();
                }
                goaa goaa9 = (goaa)gnzz1.b_message;
                goaa9.b |= 0x20;
                goaa9.h = hfsf13;
            }
            if(arr_b13 != null) {
                ByteString hfsf14 = ByteString.copyFrom(arr_b13);
                if(!gnzz1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gnzz1).ensureMutable();
                }
                goaa goaa10 = (goaa)gnzz1.b_message;
                goaa10.b |= 4;
                goaa10.e = hfsf14;
                if(arr_b9 != null) {
                    ByteString hfsf15 = ByteString.copyFrom(arr_b9);
                    if(!gnzz1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gnzz1).ensureMutable();
                    }
                    goaa goaa11 = (goaa)gnzz1.b_message;
                    goaa11.b |= 2;
                    goaa11.d = hfsf15;
                }
            }
            else if(arr_b11 != null) {
                ByteString hfsf16 = ByteString.copyFrom(arr_b11);
                if(!gnzz1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gnzz1).ensureMutable();
                }
                goaa goaa12 = (goaa)gnzz1.b_message;
                goaa12.b |= 2;
                goaa12.d = hfsf16;
            }
            long v13 = eitx0.c;
            if(v13 == -1L) {
                gged1 = ggna.a;
                s16 = s14;
                v14 = v11;
                ggek3 = ggek2;
            }
            else {
                eioe7 = ((eioh)eiop3).g("SELECT ordinal, tag\nFROM param_partitions\nINNER JOIN experiment_states_to_partitions\n  USING (param_partition_id)\nWHERE experiment_state_id = ?1;\n").h(new Object[]{v13}).f();
                goto label_658;
            }
            goto label_688;
        }
        catch(Throwable throwable26) {
            goto label_698;
        }
        try {
        label_658:
            ggdy ggdy2 = new ggdy();
            while(eioe7.b()) {
                ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)goat.a).v_newBuilder();
                long v15 = eioe7.f(0);
                if(!hftp12.b_message.isImmutable()) {
                    hftp12.ensureMutable();
                }
                goat goat2 = (goat)hftp12.b_message;
                goat2.b |= 1;
                goat2.c = v15;
                ByteString hfsf17 = ByteString.copyFrom(eioe7.k(1));
                if(!hftp12.b_message.isImmutable()) {
                    hftp12.ensureMutable();
                }
                goat goat3 = (goat)hftp12.b_message;
                goat3.b |= 2;
                goat3.d = hfsf17;
                ggdy2.i(((goat)hftp12.N_build()));
                ggek2 = ggek2;
                v11 = v11;
                s14 = s14;
            }
            s16 = s14;
            v14 = v11;
            ggek3 = ggek2;
            gged2 = ggdy2.h();
            goto label_686;
        }
        catch(Throwable throwable27) {
            try {
                TWR.safeClose$NT(eioe7, throwable27);
                throw throwable27;
            label_686:
                eioe7.close();
                gged1 = gged2;
            label_688:
                gnzz1.a(gged1);
                goaa goaa13 = (goaa)((ProtoLiteBuilder)gnzz1).N_build();
                if(!goai0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)goai0).ensureMutable();
                }
                goak goak6 = (goak)goai0.b_message;
                goaa13.getClass();
                goak6.b();
                goak6.d.add(goaa13);
                goto label_700;
            }
            catch(Throwable throwable26) {
            }
        }
        try {
        label_698:
            TWR.safeClose$NT(eioe6, throwable26);
            throw throwable26;
        }
        catch(Throwable throwable20) {
            goto label_728;
        }
        try {
        label_700:
            ggek2 = ggek3;
            eioe6 = eioe6;
            iterator1 = iterator2;
            hashMap0 = hashMap1;
            s13 = s13;
            v11 = v14;
            s14 = s16;
            goto label_543;
        label_708:
            goto label_710;
        label_709:
            ((ggtj)eiud.a.j()).x("Missing token tags and experiment state per account for config package while generating the application request.");
        label_710:
            eion1 = eion2;
            goto label_524;
        }
        catch(Throwable throwable26) {
        label_713:
            eioe8 = eioe6;
            goto label_720;
        }
        try {
        label_715:
            eion2 = eion1;
            goto label_725;
        }
        catch(Throwable throwable26) {
        label_718:
            eioe8 = eioe6;
            eion2 = eion1;
        }
        try {
        label_720:
            eioe8.close();
            throw throwable26;
        }
        catch(Throwable throwable28) {
            try {
                throwable26.addSuppressed(throwable28);
                throw throwable26;
            label_725:
                eioe6.close();
                goto label_730;
            }
            catch(Throwable throwable20) {
            }
        }
        try {
        label_728:
            TWR.safeClose$NT(eion2, throwable20);
            throw throwable20;
        label_730:
            eion2.close();
            goto label_735;
        }
        catch(Throwable throwable18) {
            try {
            label_733:
                TWR.safeClose$NT(eion3, throwable18);
                throw throwable18;
            label_735:
                eion3.close();
                goak goak7 = (goak)((ProtoLiteBuilder)goai0).N_build();
                ggeo ggeo3 = ggek1.b();
                ggeo ggeo4 = ggek2.b();
                eiuc0 = new eiuc(goak7, ggnf.a, ggeo3, ggeo4);
                eiop3.e();
                goto label_745;
            }
            catch(Throwable throwable17) {
            }
        }
        try {
        label_743:
            TWR.safeClose$NT(eiop3, throwable17);
            throw throwable17;
        label_745:
            eiop3.close();
            goto label_754;
        }
        catch(Throwable throwable0) {
        }
    label_748:
        throwable2 = throwable0;
        try {
        label_749:
            gdqb1.close();
        }
        catch(Throwable throwable29) {
            throwable2.addSuppressed(throwable29);
        }
        throw throwable2;
    label_754:
        gdqb1.close();
        return eiuc0;
    }

    private final int u(File file0, ggeo ggeo0) {
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            int v1 = 0;
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(((String)ggeo0.get(file1.getName())) == null && file1.exists() && file1.isDirectory()) {
                    v1 += this.E(file1);
                }
            }
            return v1;
        }
        return 0;
    }

    private static int v(ggeo ggeo0, String s) {
        int v = ggeo0.w().v().indexOf(s);
        if(v >= 0) {
            return v;
        }
        throw new AssertionError(a.a(s, "Impossible State: Could not find key ", " in map"));
    }

    private final int w() {
        String s;
        ggek ggek0;
        ggek0 = new ggek();
        try(eiog eiog0 = this.c.a().a()) {
            s = eiog0.f() ? "SELECT name, secret, device_encrypted_secret FROM android_packages" : "SELECT androidPackageName, secret, deviceEncryptedSecret FROM StorageInfos";
            try(eioe eioe0 = ((eioh)eiog0).g(s).e(new String[]{"android_packages", "StorageInfos"}).f()) {
                while(true) {
                    if(!eioe0.b()) {
                        break;
                    }
                    String s1 = eioe0.h(0);
                    ggek0.i(new fplb(ByteString.copyFrom(eioe0.k(1)), "", "").b().toString(), s1);
                    ggek0.i(new fplb(ByteString.copyFrom(eioe0.k(2)), "", "").b().toString(), s1);
                }
            }
        }
        ggeo ggeo0 = ggek0.g();
        return this.u(this.b.getDir("phenotype_shared", 0), ggeo0) + this.u(fhcd.a(this.b).getDir("phenotype_shared", 0), ggeo0);
    }

    private static String x(ggeo ggeo0, goau goau0) {
        int v = (goau0.e == null ? goag.a : goau0.e).c;
        return v == -1 ? "" : ((String)ggeo0.w().v().get(v));
    }

    private static Set y(goak goak0, goal goal0) {
        ggfn ggfn0 = ggfp.D(goal0.b.size());
        for(Object object0: goal0.b) {
            goau goau0 = ((goab)object0).c;
            if(goau0 == null) {
                goau0 = goau.a;
            }
            ggfn0.i(goau0);
        }
        ggfp ggfp0 = ggfn0.h();
        ggfn ggfn1 = ggfp.D(Math.max(goak0.d.size() - goal0.b.size(), 0));
        bxx bxx0 = new bxx(goal0.f.size());
        for(int v = 0; v < goal0.f.size(); ++v) {
            bxx0.d(goal0.f.d(v));
        }
        for(Object object1: goak0.d) {
            goau goau1 = ((goaa)object1).c;
            if(goau1 == null) {
                goau1 = goau.a;
            }
            if(!bxx0.a((goau1.e == null ? goag.a : goau1.e).c) && !ggfp0.contains(goau1)) {
                ggfn1.i(goau1);
            }
        }
        return ggfn1.h();
    }

    private final void z(ggek ggek0, String[] arr_s) {
        String s1;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            try {
                s1 = null;
                s1 = this.c(s);
            }
            catch(eipa unused_ex) {
            }
            if(s1 != null) {
                ggek0.i(s, s1);
            }
        }
    }
}

