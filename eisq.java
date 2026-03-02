import android.content.Context;
import android.content.res.Resources.NotFoundException;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import jeb.synthetic.TWR;

public final class eisq {
    public static final bboh a;

    static {
        eisq.a = bboh.b("RegistrationCommon", bbcu.al);
    }

    static long a(eiop eiop0, String s) {
        long v = ((eioh)eiop0).g("SELECT IFNULL(MAX(android_package_id), -1) FROM android_packages WHERE name = ?1;").h(new Object[]{s}).b();
        return v == -1L ? eiop0.c("INSERT INTO android_packages (name, secret, device_encrypted_secret)\nVALUES (?1, ?2, ?3);\n").g(new Object[]{s, fplb.c(), fplb.c()}).c() : v;
    }

    static eisn b(Context context0, eiox eiox0, gocn gocn0, String s) {
        String s3;
        eisn eisn0;
        String s2;
        gocn gocn1;
        String s1 = "";
        if(gocn0 == null) {
            throw new IllegalArgumentException("Null RegistrationInfo");
        }
        if(gocm.a(gocn0.m) == 3) {
            gocn1 = gocn0;
        }
        else {
            try(gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/service/operations/RegistrationCommon", "register", 0xD8, "Read Single Resource")) {
                fprr fprr0 = new fprr(context0.getPackageManager());
                s2 = gocn0.e == 7 ? ((String)gocn0.f) : "";
                gocn1 = fprr0.b(s2, gocn0.g);
            }
        }
        try(eiop eiop0 = eiox0.a().b()) {
            eisn0 = eisq.c(context0, eiox0, eiop0, gocn0, s, gocn1);
            if(!eiop0.f() && !gocn0.g.startsWith("__internal.")) {
                try {
                    s3 = gocn0.e == 7 ? ((String)gocn0.f) : "";
                    eitg.b(context0, eiop0, s3);
                }
                catch(eioz eioz0) {
                    String s4 = eioz0.getMessage();
                    if(s4 == null) {
                        ((ggtj)((ggtj)eisq.a.j()).s(eioz0)).B("Failed to create storageInfo for %s.", new gpnd(gpnc.b, gocn0.g));
                    }
                    else if(!s4.contains("Storage info not created for GMS or Play Store")) {
                        ((ggtj)((ggtj)eisq.a.j()).s(eioz0)).B("Failed to create storageInfo for %s.", new gpnd(gpnc.b, gocn0.g));
                    }
                }
            }
            if(hxln.d()) {
                eisp eisp0 = eisn0.c;
                if(eisp0.a || gocn0.l) {
                    if(gocn0.g.startsWith("__internal.")) {
                        eirf eirf0 = eirf.a;
                        String s5 = gocn0.g;
                        if(gocn0.e == 7) {
                            s1 = (String)gocn0.f;
                        }
                        eirf0.d(eiox0, eiop0, eipn.c(s5, s1), eisp0.b);
                    }
                    else {
                        eirf eirf1 = eirf.a;
                        String s6 = gocn0.g;
                        if(gocn0.e == 7) {
                            s1 = (String)gocn0.f;
                        }
                        eirf1.c(eiox0, eiop0, eipn.c(s6, s1), eisp0.b);
                    }
                }
            }
            eiop0.e();
        }
        if((eisn0.c.a || gocn0.l) && !hxln.d()) {
            eirf.a.e();
        }
        return eisn0;
    }

    public static eisn c(Context context0, eiox eiox0, eiop eiop0, gocn gocn0, String s, gocn gocn1) {
        eisp eisp0;
        Set set0;
        byte[] arr_b2;
        HashSet hashSet0;
        String s1;
        boolean z;
        if(gocn0.g.isEmpty()) {
            throw new eipa(29500, "No package name");
        }
        Iterator iterator0 = gocn0.i.iterator();
        while(true) {
            z = true;
            s1 = "";
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            if(gfta.c(((String)object0))) {
                throw new eipa(29500, "Invalid log source");
            }
        }
        if(!gocn0.l && !gocn0.j.isEmpty()) {
            throw new eipa(29500, "Experiment ids for weak registration only");
        }
        if((gocn0.e == 7 ? ((String)gocn0.f) : "").isEmpty()) {
            throw new eipa(29500, "No Android package");
        }
        if(gocm.a(gocn0.m) != 0 && gocm.a(gocn0.m) != 1) {
            String s2 = gocn0.g;
            String s3 = gocn0.e == 7 ? ((String)gocn0.f) : "";
            String s4 = eipn.c(s2, s3);
            if(!s4.equals(s2)) {
                if(eiop0.f()) {
                    eitk.b(eiox0, eiop0, s2);
                }
                else {
                    eitk.a(eiop0, s2, s3);
                    if(hxln.d()) {
                        eirf.a.b(eiox0, eiop0, s2);
                    }
                    else {
                        eirf.a.e();
                    }
                }
            }
            if(!gocn0.g.equals(s4)) {
                goci goci0 = (goci)((ProtoLiteMessage)gocn.a).w(((ProtoLiteMessage)gocn0));
                if(!goci0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)goci0).ensureMutable();
                }
                gocn gocn2 = (gocn)goci0.b_message;
                s4.getClass();
                gocn2.b |= 1;
                gocn2.g = s4;
                gocn0 = (gocn)((ProtoLiteBuilder)goci0).N_build();
            }
            String s5 = gocn0.g;
            String s6 = gocn0.e == 7 ? ((String)gocn0.f) : "";
            if(eiop0.f()) {
                eiok eiok0 = ((eioh)eiop0).g("SELECT android_packages.name\nFROM config_packages\nINNER JOIN android_packages\n  USING (android_package_id)\nWHERE\n  config_packages.name = ?1\n  AND android_packages.name != ?2;\n").h(new Object[]{s5, s6}).i();
                if(eiok0 == null) {
                    goto label_45;
                }
                try {
                    throw new eipa(29506, "Failed registering config package " + s5 + " with Android package " + s6 + ". The config package is already registered with a different Android package: " + eiok0.h(0));
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(eiok0, throwable0);
                    throw throwable0;
                }
            }
            eiok eiok1 = ((eioh)eiop0).g("SELECT androidPackageName FROM Packages WHERE packageName = ? AND androidPackageName != ?").h(new Object[]{s5, s6}).i();
            if(eiok1 == null) {
            label_45:
                gnzv gnzv0 = gnzv.a;
                String s7 = gocn0.g;
                if(eiop0.f()) {
                    boolean z1 = eisq.g(s7);
                    eiod eiod0 = ((eioh)eiop0).g((z1 ? "SELECT log_sources.name\nFROM external_experiments_to_log_sources\nINNER JOIN external_experiments\n  USING (namespace_id)\nINNER JOIN log_sources\n  USING (log_source_id)\nWHERE external_experiments.namespace = ?1;\n" : "SELECT log_sources.name\nFROM config_packages_to_log_sources\nINNER JOIN config_packages\n  USING (config_package_id)\nINNER JOIN log_sources\n  USING (log_source_id)\nWHERE config_packages.name = ?1;\n"));
                    if(z1) {
                        s7 = s7.substring(11);
                    }
                    try(eioa eioa0 = eiod0.h(new Object[]{s7}).c()) {
                        ggfn ggfn0 = ggfp.D(eioa0.a());
                        while(true) {
                            if(!eioa0.b()) {
                                break;
                            }
                            ggfn0.i(eioa0.h(0));
                        }
                        hashSet0 = ggfn0.h();
                    }
                }
                else {
                    try(eioa eioa1 = ((eioh)eiop0).g("SELECT logSourceName FROM LogSources WHERE packageName = ?").h(new Object[]{s7}).c()) {
                        hashSet0 = ggog.i(eioa1.a());
                        while(true) {
                            if(!eioa1.b()) {
                                break;
                            }
                            hashSet0.add(eioa1.h(0));
                        }
                    }
                }
                if(gocm.a(gocn0.m) == 3 && (eiop0.f() ? ((eioh)eiop0).g("SELECT EXISTS(\n  SELECT NULL\n  FROM config_packages\n  WHERE\n    name = ?1\n    AND declarative_registration_info_from_client IS ?2\n);\n").h(new Object[]{gocn0.g, gocn0.toBytesArray()}).g() : ((eioh)eiop0).g("SELECT EXISTS(SELECT NULL FROM Packages WHERE packageName = ? AND serializedDeclarativeRegInfo = ?)").h(new Object[]{gocn0.g, gocn0.toBytesArray()}).g())) {
                    if(!gocn0.q.isEmpty()) {
                        if(eiop0.f()) {
                            eiop0.c("UPDATE config_packages\nSET heterodyne_info = ?1\nWHERE\n  name = ?2\n  AND heterodyne_info IS NOT ?1;\n").g(new Object[]{gocn0.q.toByteArray(), gocn0.g}).d();
                        }
                        else {
                            eiok eiok2 = ((eioh)eiop0).g("SELECT heterodyneInfo FROM Packages WHERE packageName = ?").h(new Object[]{gocn0.g}).i();
                            byte[] arr_b = null;
                            if(eiok2 != null) {
                                try {
                                    byte[] arr_b1 = eiok2.j(0);
                                    arr_b2 = gocn0.q.toByteArray();
                                    if(arr_b1 == null || !Arrays.equals(arr_b1, arr_b2)) {
                                        goto label_94;
                                    }
                                    goto label_95;
                                }
                                catch(Throwable throwable3) {
                                    TWR.safeClose$NT(eiok2, throwable3);
                                    throw throwable3;
                                }
                            label_94:
                                arr_b = arr_b2;
                            }
                        label_95:
                            if(eiok2 != null) {
                                eiok2.close();
                            }
                            if(arr_b != null) {
                                eiop0.c("UPDATE Packages SET heterodyneInfo = ? WHERE packageName = ?").g(new Object[]{arr_b, gocn0.g}).d();
                            }
                        }
                    }
                    set0 = eisq.f(hashSet0, gocn0.g);
                }
                else {
                    if(!eiop0.f()) {
                        String s9 = gocn0.g;
                        hfuf hfuf0 = gocn0.j;
                        eiop0.c("DELETE FROM WeakExperimentIds WHERE packageName = ?").g(new Object[]{s9}).e().d();
                        if(hfuf0 != null) {
                            for(Object object1: hfuf0) {
                                eiop0.c("INSERT INTO WeakExperimentIds (packageName, experimentId) VALUES (?, ?)").g(new Object[]{s9, ((Integer)object1)}).d();
                            }
                        }
                        gnzv0 = eisq.d(context0, eiop0, gocn0, s, gocn1);
                    }
                    else if(gocn0.g.startsWith("__internal.")) {
                        String s8 = gocn0.g.substring(11);
                        byte[] arr_b3 = eios.a(gocn0);
                        if(((eioh)eiop0).g("SELECT EXISTS(SELECT NULL FROM external_experiments WHERE namespace = ?);").h(new Object[]{s8}).g()) {
                            eiop0.c("UPDATE external_experiments\nSET packed_experiments = ?1\nWHERE\n  namespace = ?2\n  AND packed_experiments IS NOT ?1;\n").g(new Object[]{arr_b3, s8}).d();
                        }
                        else {
                            if(gocn0.e == 7) {
                                s1 = (String)gocn0.f;
                            }
                            long v = eisq.a(eiop0, s1);
                            eiop0.c("INSERT INTO external_experiments\n  (namespace, android_package_id, packed_experiments)\nVALUES (?1, ?2, ?3);\n").g(new Object[]{s8, v, arr_b3}).d();
                        }
                    }
                    else {
                        gnzv0 = eisq.e(context0, eiop0, gocn0, s, gocn1);
                    }
                    set0 = eisq.f(gocn0.i, gocn0.g);
                }
                String s10 = gocn0.g;
                ggoe ggoe0 = ggog.d(hashSet0, set0);
                ggoe ggoe1 = ggog.d(set0, hashSet0);
                if(ggoe0.isEmpty() && ggoe1.isEmpty()) {
                    z = false;
                }
                if(!eiop0.f()) {
                    ggqj ggqj4 = ((ggny)ggoe0).c();
                    while(ggqj4.hasNext()) {
                        Object object6 = ggqj4.next();
                        eiop0.c("DELETE FROM LogSources WHERE packageName = ? AND logSourceName = ?").g(new Object[]{s10, ((String)object6)}).d();
                    }
                    ggqj ggqj5 = ((ggny)ggoe1).c();
                    while(ggqj5.hasNext()) {
                        Object object7 = ggqj5.next();
                        eiop0.c("INSERT OR REPLACE INTO LogSources (packagename, logSourceName) VALUES (?, ?)").g(new Object[]{s10, ((String)object7)}).d();
                    }
                }
                else if(eisq.g(s10)) {
                    long v1 = ((eioh)eiop0).g("SELECT IFNULL(MAX(namespace_id), -1) FROM external_experiments WHERE namespace = ?1;\n").h(new Object[]{s10.substring(11)}).b();
                    if(v1 == -1L) {
                        eisp0 = new eisp(false, ggnj.a);
                        return new eisn(gocn0.g, gnzv0, eisp0);
                    }
                    ggqj ggqj0 = ((ggny)ggoe0).c();
                    while(ggqj0.hasNext()) {
                        Object object2 = ggqj0.next();
                        eiop0.c("DELETE FROM external_experiments_to_log_sources\nWHERE\n  namespace_id = ?1\n  AND log_source_id = (\n    SELECT log_sources.log_source_id FROM log_sources WHERE name = ?2\n  );\n").g(new Object[]{v1, ((String)object2)}).d();
                    }
                    ggqj ggqj1 = ((ggny)ggoe1).c();
                    while(ggqj1.hasNext()) {
                        Object object3 = ggqj1.next();
                        eiop0.c("INSERT OR IGNORE INTO log_sources (name) VALUES (?1);").g(new Object[]{((String)object3)}).d();
                        eiop0.c("INSERT INTO external_experiments_to_log_sources\n  (namespace_id, log_source_id)\nVALUES (\n  ?1,\n  (SELECT log_sources.log_source_id FROM log_sources WHERE name = ?2)\n);\n").g(new Object[]{v1, ((String)object3)}).d();
                    }
                }
                else {
                    long v2 = ((eioh)eiop0).g("SELECT IFNULL(MAX(config_package_id), -1) FROM config_packages WHERE name = ?1;\n").h(new Object[]{s10}).b();
                    if(v2 == -1L) {
                        eisp0 = new eisp(false, ggnj.a);
                        return new eisn(gocn0.g, gnzv0, eisp0);
                    }
                    ggqj ggqj2 = ((ggny)ggoe0).c();
                    while(ggqj2.hasNext()) {
                        Object object4 = ggqj2.next();
                        eiop0.c("DELETE FROM config_packages_to_log_sources\nWHERE\n  config_package_id = ?1\n  AND log_source_id = (\n    SELECT log_sources.log_source_id FROM log_sources WHERE name = ?2\n  );\n").g(new Object[]{v2, ((String)object4)}).d();
                    }
                    ggqj ggqj3 = ((ggny)ggoe1).c();
                    while(ggqj3.hasNext()) {
                        Object object5 = ggqj3.next();
                        eiop0.c("INSERT OR IGNORE INTO log_sources (name) VALUES (?1);").g(new Object[]{((String)object5)}).d();
                        eiop0.c("INSERT INTO config_packages_to_log_sources\n  (config_package_id, log_source_id)\nVALUES (\n  ?1,\n  (SELECT log_source_id FROM log_sources WHERE name = ?2)\n);\n").g(new Object[]{v2, ((String)object5)}).d();
                    }
                }
                eisp0 = new eisp(z, ggfp.G(ggoe0));
                return new eisn(gocn0.g, gnzv0, eisp0);
            }
            try {
                throw new eipa(29506, "Failed registering with Android package: " + s6 + ". Config package already registered with a different Android package: " + eiok1.g(0));
            }
            catch(Throwable throwable4) {
                TWR.safeClose$NT(eiok1, throwable4);
                throw throwable4;
            }
        }
        throw new eipa(29500, "Unknown registration type");
    }

    private static gnzv d(Context context0, eiop eiop0, gocn gocn0, String s, gocn gocn1) {
        eioh eioh0;
        byte[] arr_b11;
        byte[] arr_b8;
        byte[] arr_b7;
        byte[] arr_b6;
        byte[] arr_b5;
        boolean z6;
        boolean z5;
        byte[] arr_b2;
        boolean z4;
        boolean z3;
        boolean z2;
        boolean z;
        long v;
        String s1 = "";
        byte[] arr_b = gocn0.k.toByteArray();
        byte[] arr_b1 = arr_b.length == 0 ? null : arr_b;
        try {
            v = gocn0.p;
            v = gnup.a(context0.getPackageManager(), (gocn0.e == 7 ? ((String)gocn0.f) : "")).d;
            z = true;
        }
        catch(IOException | Resources.NotFoundException | NullPointerException unused_ex) {
            z = false;
        }
        eiok eiok0 = ((eioh)eiop0).g("SELECT\n  version = ?1 AS versionMatch,\n  params IS ?2 AS paramsMatch,\n  dynamicParams NOT NULL AND (?3 OR (dynamicParams IS ?2)) AS dynamicParamsDeleted,\n  /* Skip setting dynamicParams if getDeleteRuntimeProperties() or they\'re the\n   same as passedParams and the existing value is not null.*/\n  CASE\n    WHEN (?3 OR (dynamicParams IS ?2)) THEN NULL\n    ELSE dynamicParams\n  END AS dynamicParams,\n  weak = ?4 AS weakMatch,\n  serializedDeclarativeRegInfo,\n  /* Set baselineClMatch to true if:\n   1. newBaselineClReadSuccessful and it matches with the db, or\n   2. !newBaselineClReadSuccessful. In this case, treat it as a match so that\n      the db value will be preserved. */\n  IFNULL(baselineCl = ?5, 1) AS baselineClMatch,\n  heterodyneInfo,\n  runtimeProperties,\n  declarativeRegistrationInfo\nFROM Packages WHERE packageName = ?6 AND IFNULL(isSynced = ?7, 1);\n").h(new Object[]{((int)(gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0)), arr_b1, ((int)gocn0.o), ((int)gocn0.l), (z ? v : null), gocn0.g, (s == null ? null : ((int)1))}).i();
        boolean z1 = eiok0 != null;
        if(eiok0 == null) {
            z2 = false;
            z3 = false;
            z6 = false;
            z4 = false;
            z5 = false;
            eiok0 = null;
            arr_b5 = null;
            arr_b6 = null;
            arr_b7 = null;
            arr_b8 = null;
            arr_b2 = null;
        }
        else {
            try {
                z2 = eiok0.f(0) != 0L;
                z3 = eiok0.f(1) != 0L;
                z4 = eiok0.f(2) != 0L;
                arr_b2 = eiok0.j(3);
                z5 = eiok0.f(4) != 0L;
                byte[] arr_b3 = eiok0.j(5);
                z6 = eiok0.f(6) != 0L;
                byte[] arr_b4 = eiok0.j(7);
                arr_b5 = eiok0.j(8);
                arr_b6 = arr_b3;
                arr_b7 = arr_b4;
                arr_b8 = eiok0.j(9);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(eiok0, throwable0);
                throw throwable0;
            }
        }
        if(eiok0 != null) {
            eiok0.close();
        }
        byte[] arr_b9 = gocn0.q.toByteArray();
        if(arr_b9.length == 0) {
            arr_b9 = null;
        }
        byte[] arr_b10 = gocn1 == null ? new byte[0] : gocn1.toBytesArray();
        if(gocn1 == null) {
            arr_b11 = null;
        }
        else {
            switch(gocm.a(gocn0.m)) {
                case 0: {
                    arr_b11 = null;
                    break;
                }
                case 2: {
                    arr_b11 = arr_b10;
                    break;
                }
                default: {
                    arr_b11 = null;
                }
            }
            if((gocn0.b & 0x100) == 0 && (gocn1.b & 0x100) != 0) {
                arr_b9 = gocn1.q.toByteArray();
            }
        }
        boolean z7 = !z1 || !z2 || !z3 || !z5 || z4 || !z6 || !Arrays.equals(arr_b6, arr_b11) || !Arrays.equals(arr_b7, arr_b9);
        int v1 = gocn1 == null ? 0 : Arrays.equals(arr_b8, arr_b10) ^ 1;
        if(z7) {
        label_60:
            Object[] arr_object = new Object[12];
            arr_object[0] = gocn0.g;
            arr_object[1] = (int)(gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0);
            arr_object[2] = arr_b1;
            arr_object[3] = arr_b2;
            arr_object[4] = (int)gocn0.l;
            if(gocn0.e == 7) {
                s1 = (String)gocn0.f;
            }
            arr_object[5] = s1;
            arr_object[6] = (int)0;
            arr_object[7] = arr_b11;
            arr_object[8] = v;
            arr_object[9] = arr_b5;
            arr_object[10] = arr_b9;
            if(v1 != 0) {
                if(gocn1 != null) {
                    arr_b8 = arr_b10;
                }
                arr_object[11] = arr_b8;
            }
            eiop0.c("INSERT OR REPLACE INTO Packages (\n  packageName,\n  version,\n  params,\n  dynamicParams,\n  weak,\n  androidPackageName,\n  isSynced,\n  serializedDeclarativeRegInfo,\n  baselineCl,\n  runtimeProperties,\n  heterodyneInfo,\n  declarativeRegistrationInfo\n)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);\n").g(arr_object).d();
        }
        else if(v1 != 0) {
            v1 = 1;
            goto label_60;
        }
        if(!z2 && (z3 || arr_b2 != null) && s == null) {
            eioh0 = (eioh)eiop0;
            z2 = eioh0.g("SELECT EXISTS(SELECT NULL FROM ExperimentTokens WHERE packageName = ? AND version = ?)").h(new Object[]{gocn0.g, ((int)(gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0))}).g();
        }
        else {
            eioh0 = (eioh)eiop0;
        }
        if(s != null && eioh0.g("SELECT NOT EXISTS(SELECT NULL FROM RequestTags WHERE user = ?)").h(new Object[]{s}).g()) {
            return gnzv.m;
        }
        if(!z1) {
            return s == null ? gnzv.h : gnzv.n;
        }
        if(!z2) {
            return s == null ? gnzv.i : gnzv.o;
        }
        if(!z3 && arr_b2 == null) {
            return s == null ? gnzv.j : gnzv.p;
        }
        return gnzv.a;
    }

    private static gnzv e(Context context0, eiop eiop0, gocn gocn0, String s, gocn gocn1) {
        long v20;
        long v16;
        byte[] arr_b5;
        byte[] arr_b4;
        long v12;
        byte[] arr_b3;
        boolean z;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        long v5;
        int v4;
        int v3;
        int v2;
        int v1;
        gocn gocn2 = gocn1;
        byte[] arr_b = (gocn0.b & 4) == 0 || gocn0.k.isEmpty() ? null : gocn0.k.toByteArray();
        byte[] arr_b1 = gocn2 == null || (gocn0.b & 0x100) != 0 || (gocn2.b & 0x100) == 0 ? gocn0.q.toByteArray() : gocn2.q.toByteArray();
        byte[] arr_b2 = arr_b1.length == 0 ? null : arr_b1;
        long v = gocn0.p;
        String s1 = "";
        if((gocn0.b & 0x80) == 0 || gocm.a(gocn0.m) != 3) {
            if(hxmc.a.b().b() && Objects.equals((gocn0.e == 7 ? ((String)gocn0.f) : ""), "com.google.android.gms")) {
                v = 0x2F7C1ACDL;
            }
            else {
                try {
                    v = gnup.a(context0.getPackageManager(), (gocn0.e == 7 ? ((String)gocn0.f) : "")).d;
                }
                catch(IOException | Resources.NotFoundException | NullPointerException unused_ex) {
                }
            }
        }
        eiok eiok0 = ((eioh)eiop0).g("SELECT\n  params IS ?1 AS params_match,\n  dynamic_params IS NULL AS dynamic_params_is_null,\n  dynamic_params NOT NULL AND (?2 OR dynamic_params IS ?1) AS delete_dynamic_params,\n  version IS ?3 AS version_match,\n  EXISTS (\n    SELECT NULL\n    FROM experiment_states\n    WHERE\n      experiment_states.config_package_id = config_packages.config_package_id\n      AND experiment_states.registration_generation = config_packages.registration_generation\n  )\nFROM config_packages\nWHERE config_packages.name = ?4;\n").h(new Object[]{arr_b, ((int)gocn0.o), ((int)(gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0)), gocn0.g}).i();
        if(eiok0 == null) {
            v6 = gocn2 == null ? 1 : 0;
            v8 = 0;
            v7 = 0;
            v10 = 0;
            v11 = 0;
            v9 = 0;
            z = false;
        }
        else {
            try {
                v1 = eiok0.f(0) == 1L ? 1 : 0;
                v2 = eiok0.f(1) == 1L ? 1 : 0;
                v3 = eiok0.f(2) == 1L ? 1 : 0;
                v4 = eiok0.f(3) == 1L ? 1 : 0;
                v5 = eiok0.f(4);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(eiok0, throwable0);
                throw throwable0;
            }
            v6 = gocn2 == null ? 1 : 0;
            v7 = v4;
            v8 = v3;
            v9 = v5 == 1L ? 1 : 0;
            v10 = v1;
            v11 = v2;
            z = true;
        }
        if(eiok0 != null) {
            eiok0.close();
        }
        if(z) {
            eiol eiol0 = eiop0.c("UPDATE config_packages\nSET params = ?1,\n  declarative_registration_info = ?2,\n  declarative_registration_info_from_client = ?3,\n  heterodyne_info = ?4,\n  version = ?5,\n  baseline_cl = ?6,\n  weak_packed_experiment_ids = ?7,\n  dynamic_params =\n    CASE\n      WHEN ?9 THEN NULL\n      ELSE dynamic_params\n    END\nWHERE\n  name = ?8\n  AND (\n    params IS NOT ?1\n    OR declarative_registration_info IS NOT ?2\n    OR declarative_registration_info_from_client IS NOT ?3\n    OR heterodyne_info IS NOT ?4\n    OR version <> ?5\n    OR baseline_cl <> ?6\n    OR weak_packed_experiment_ids IS NOT ?7\n    OR ?9\n  );\n");
            if(1 == v6) {
                gocn2 = null;
                arr_b3 = null;
            }
            else {
                arr_b3 = gocn2.toBytesArray();
            }
            if(gocn2 != null && gocm.a(gocn0.m) == 2) {
                v12 = v;
                arr_b4 = gocn2.toBytesArray();
            }
            else {
                v12 = v;
                arr_b4 = null;
            }
            eiol0.g(new Object[]{arr_b, arr_b3, arr_b4, arr_b2, ((int)(gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0)), v12, eios.a(gocn0), gocn0.g, v8}).d();
        }
        else {
            if(gocn0.e == 7) {
                s1 = (String)gocn0.f;
            }
            long v13 = eisq.a(eiop0, s1);
            long v14 = ((eioh)eiop0).g("SELECT IFNULL(MAX(static_config_package_id), -1) FROM static_config_packages WHERE name = ?1").h(new Object[]{eipn.d(gocn0.g)}).b();
            if(v14 == -1L) {
                v14 = eiop0.c("INSERT INTO static_config_packages (name) VALUES (?1);").g(new Object[]{eipn.d(gocn0.g)}).c();
            }
            eiol eiol1 = eiop0.c("INSERT INTO config_packages (name, static_config_package_id, android_package_id, params,\n    declarative_registration_info, declarative_registration_info_from_client,\n    heterodyne_info, version, baseline_cl,\n    weak_packed_experiment_ids)\nVALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10);\n");
            String s2 = gocn0.g;
            Long long0 = v14;
            Long long1 = v13;
            if(1 == v6) {
                gocn2 = null;
                arr_b5 = null;
            }
            else {
                arr_b5 = gocn2.toBytesArray();
            }
            byte[] arr_b6 = gocn2 == null || gocm.a(gocn0.m) != 2 ? null : gocn2.toBytesArray();
            int v15 = gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0;
            v16 = eiol1.g(new Object[]{s2, long0, long1, arr_b, arr_b5, arr_b6, arr_b2, v15, v, eios.a(gocn0)}).c();
            HashMap hashMap0 = new HashMap();
            try(eioe eioe0 = ((eioh)eiop0).g("SELECT flag_overrides.override_id, flag_overrides.account_id\nFROM flag_overrides\nINNER JOIN config_packages\n  ON flag_overrides.config_package_name IS config_packages.name\nWHERE config_packages.config_package_id = ?1;\n").h(new Object[]{v16}).f()) {
                while(true) {
                    if(!eioe0.b()) {
                        break;
                    }
                    hashMap0.put(Long.valueOf(eioe0.f(0)), Long.valueOf(eioe0.f(1)));
                }
            }
            if(!hashMap0.isEmpty()) {
                long v17 = ((eioh)eiop0).g("SELECT IFNULL(MAX(account_id), -1) FROM accounts WHERE name = \'*\';").b();
                ArrayList arrayList0 = new ArrayList();
                if(v17 != -1L) {
                    try(eioe eioe1 = ((eioh)eiop0).g("SELECT account_id FROM accounts WHERE name <> \'*\';").e(new String[]{"accounts"}).f()) {
                        while(true) {
                            if(!eioe1.b()) {
                                break;
                            }
                            arrayList0.add(Long.valueOf(eioe1.f(0)));
                        }
                    }
                }
                HashMap hashMap1 = new HashMap();
                for(Object object0: hashMap0.entrySet()) {
                    Long long2 = (Long)((Map.Entry)object0).getKey();
                    Long long3 = (Long)((Map.Entry)object0).getValue();
                    ArrayList arrayList1 = new ArrayList();
                    if(((long)long3) == v17) {
                        arrayList1.addAll(arrayList0);
                    }
                    else {
                        arrayList1.add(long3);
                    }
                    int v18 = arrayList1.size();
                    for(int v19 = 0; v19 < v18; ++v19) {
                        Long long4 = (Long)arrayList1.get(v19);
                        if(hashMap1.containsKey(long4)) {
                            v20 = (long)(((Long)hashMap1.get(long4)));
                        }
                        else {
                            v20 = eiop0.c("    INSERT INTO experiment_states (experiment_token, server_token,\n      serving_version, tokens_tag, config_hash, registration_generation,\n      account_id, config_package_id)\n    VALUES (NULL, \'\', 0, NULL, 0, 0, ?1, ?2);\n").g(new Object[]{long4, v16}).c();
                            hashMap1.put(long4, Long.valueOf(v20));
                        }
                        eiop0.c("    INSERT INTO experiment_states_to_overrides (experiment_state_id, override_id)\n    VALUES (?1, ?2);\n").g(new Object[]{v20, long2}).d();
                        eiop0.c("    UPDATE flag_overrides\n    SET config_package_id = ?1,\n      config_package_name = NULL\n    WHERE override_id = ?2;\n").g(new Object[]{v16, long2}).d();
                    }
                }
            }
        }
        if(s != null && ((eioh)eiop0).g("SELECT NOT EXISTS(SELECT NULL FROM accounts WHERE name = ?1);").h(new Object[]{s}).g()) {
            return gnzv.m;
        }
        if(!z) {
            return s == null ? gnzv.h : gnzv.n;
        }
        if(s != null && v9 == 0) {
            return gnzv.n;
        }
        if(v7 == 0) {
            return s == null ? gnzv.i : gnzv.o;
        }
        if(v10 == 0 && v11 != 0) {
            return s == null ? gnzv.j : gnzv.p;
        }
        return gnzv.a;
    }

    private static Set f(Collection collection0, String s) {
        gobe gobe0 = eipn.a(s);
        if((gobe0.b & 1) == 0) {
            String s1 = eipn.d(s);
            if(!s.equals(s1)) {
                gobe0 = eipn.a(s1);
            }
        }
        if((gobe0.b & 1) != 0) {
            gobd gobd0 = gobe0.c == null ? gobd.a : gobe0.c;
            if(gobd0.b) {
                return ggfp.G(gobd0.c);
            }
            ggfn ggfn0 = new ggfn();
            ggfn0.k(collection0);
            ggfn0.k(gobd0.c);
            return ggfn0.h();
        }
        return ggfp.G(collection0);
    }

    private static boolean g(String s) {
        return s.startsWith("__internal.");
    }
}

