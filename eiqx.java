import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class eiqx extends eiqt {
    private static final bboh a;
    private static final Map b;
    private final eiqg c;
    private final eiqy d;

    static {
        eiqx.a = bboh.b("CommitToConfigurationGmsOperation", bbcu.al);
        eiqx.b = new HashMap();
    }

    public eiqx(eiqg eiqg0, fpjk fpjk0, String s) {
        super("CommitToConfigurationOperationCall", hlse.h);
        batl.s(eiqg0);
        this.c = eiqg0;
        this.d = new eiqy(fpjk0, s);
    }

    public eiqx(eiqg eiqg0, String s, String s1) {
        super("CommitToConfigurationOperationCall", hlse.h);
        batl.s(eiqg0);
        this.c = eiqg0;
        this.d = new eiqy(s, s1);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        eiqy eiqy0 = this.d;
        String s = eiqy0.b;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        int v = eiqy0.c;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh1 = (hlrh)hlrg0.b_message;
        hlrh1.b |= 2;
        hlrh1.d = v;
        long v1 = eiqy0.e;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh2 = (hlrh)hlrg0.b_message;
        hlrh2.b |= 0x80;
        hlrh2.i = v1;
        fpjk fpjk0 = eiqy0.a;
        if(fpjk0 != null && (((fpjk0.d == null ? fpjj.a : fpjk0.d).b & 1) != 0 || ((fpjk0.d == null ? fpjj.a : fpjk0.d).b & 2) != 0)) {
            fpjj fpjj0 = fpjk0.d == null ? fpjj.a : fpjk0.d;
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh3 = (hlrh)hlrg0.b_message;
            fpjj0.getClass();
            hlrh3.n = fpjj0;
            hlrh3.b |= 0x2000;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        this.d.b(context0, eiox0);
        eiqx.m(context0, eiox0, this.d);
        try {
            this.c.a(Status.b);
        }
        catch(evpt evpt0) {
            throw new eioz(0x7360, "Could not complete commit", evpt0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        if(fpjp.a(status0.i)) {
            status0 = new Status(29501, "Stale snapshot token");
        }
        this.c.a(status0);
    }

    public static void m(Context context0, eiox eiox0, eiqy eiqy0) {
        boolean z2;
        Boolean boolean0;
        Pair pair0;
        eiok eiok3;
        String s8;
        eioa eioa5;
        eioa eioa4;
        eioa eioa3;
        eioa eioa2;
        eioa eioa1;
        eioa eioa0;
        eiop eiop1;
        gdqb gdqb1;
        eioe eioe3;
        Long long0;
        eioe eioe2;
        eioe eioe1;
        eiol eiol0;
        long v3;
        byte[] arr_b1;
        long v2;
        String s3;
        byte[] arr_b;
        eiok eiok2;
        Throwable throwable11;
        eioe eioe0;
        ArrayList arrayList0;
        long v1;
        String s2;
        eiok eiok1;
        fple fple1;
        long v;
        eiok eiok0;
        fple fple0;
        fpkv fpkv0;
        gdqb gdqb0;
        String s1;
        eiop eiop0;
        String s = eiqy0.b;
        gftb.check(s);
        if(eiro.h(s)) {
            eiog eiog0 = eiox0.a().a();
            try {
                if(eiog0.f()) {
                    eiop0 = eiov.a(context0).a().b();
                    goto label_6;
                }
                else {
                    goto label_215;
                }
                goto label_345;
            }
            catch(Throwable throwable0) {
                goto label_340;
            }
            try {
            label_6:
                if(eiop0.f()) {
                    s1 = eiqy0.b;
                    gftb.check(s1);
                    try {
                        gdqb0 = gdsp.e("com/google/android/gms/phenotype/service/operations/CommitToConfigurationGmsOperation", "copyDataFromCeToDePhixit", 379, "Copy CE to DE for Phixit");
                        goto label_13;
                    }
                    catch(IOException iOException0) {
                        throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
                    }
                }
                else {
                    ((ggtj)eiqx.a.j()).x("Skipping copy from CE to DE; the CE database has been migrated to Phixit but the DE database has not.");
                    eiop0.e();
                    goto label_48;
                }
                goto label_345;
            }
            catch(Throwable throwable1) {
                goto label_210;
            }
            try {
            label_13:
                fpkv0 = new fpkv();
            }
            catch(Throwable throwable2) {
                goto label_202;
            }
            try {
                fple0 = new fple();
            }
            catch(Throwable throwable3) {
                goto label_196;
            }
            try {
                eiok0 = ((eioh)eiog0).g("SELECT committed_experiment_state_id FROM config_packages WHERE name = ?1;").h(new Object[]{s1}).i();
            }
            catch(Throwable throwable4) {
                fple1 = fple0;
                goto label_189;
            }
            if(eiok0 == null) {
                goto label_28;
            }
            else {
                try {
                    v = eiok0.i(0) ? -1L : eiok0.f(0);
                }
                catch(Throwable throwable5) {
                    try {
                        eiok0.close();
                        throw throwable5;
                    }
                    catch(Throwable throwable6) {
                        try {
                            throwable5.addSuppressed(throwable6);
                            throw throwable5;
                        label_28:
                            v = -1L;
                        label_29:
                            if(eiok0 != null) {
                                eiok0.close();
                            }
                            if(v == -1L) {
                                goto label_37;
                            }
                            else {
                                goto label_42;
                            }
                            goto label_345;
                        }
                        catch(Throwable throwable7) {
                            goto label_34;
                        }
                    }
                }
            }
            goto label_29;
        label_34:
            Throwable throwable8 = throwable7;
            fple1 = fple0;
            goto label_190;
            try {
            label_37:
                fple0.close();
            }
            catch(Throwable throwable3) {
                goto label_196;
            }
            try {
                fpkv0.close();
            }
            catch(Throwable throwable2) {
                goto label_202;
            }
            try {
                try {
                    gdqb0.close();
                }
                catch(IOException iOException0) {
                    throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
                }
                eiop0.e();
            }
            catch(Throwable throwable1) {
                goto label_210;
            }
            goto label_48;
            try {
            label_42:
                boolean z = ((eioh)eiop0).g("    SELECT EXISTS (\n      SELECT NULL\n      FROM config_packages\n      WHERE\n        name = ?1\n        AND experiment_state_id IS ?2\n    );\n").h(new Object[]{s1, v}).g();
            }
            catch(Throwable throwable4) {
                fple1 = fple0;
                goto label_189;
            }
            if(z) {
                try {
                    fple0.close();
                }
                catch(Throwable throwable3) {
                    goto label_196;
                }
                try {
                    fpkv0.close();
                }
                catch(Throwable throwable2) {
                    goto label_202;
                }
                try {
                    try {
                        gdqb0.close();
                    }
                    catch(IOException iOException0) {
                        throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
                    }
                    eiop0.e();
                }
                catch(Throwable throwable1) {
                    goto label_210;
                }
                try {
                label_48:
                    eiop0.close();
                }
                catch(Throwable throwable0) {
                    goto label_340;
                }
            }
            else {
                try {
                    eiok1 = ((eioh)eiog0).g("SELECT android_packages.name\nFROM config_packages\nINNER JOIN android_packages\n  USING (android_package_id)\nWHERE config_packages.name = ?1;\n").h(new Object[]{s1}).i();
                }
                catch(Throwable throwable4) {
                    fple1 = fple0;
                    goto label_189;
                }
                if(eiok1 != null) {
                    try {
                        s2 = eiok1.h(0);
                    }
                    catch(Throwable throwable9) {
                        fple1 = fple0;
                        goto label_182;
                    }
                    try {
                        eiok1.close();
                        v1 = eiqx.n(eiop0, s2);
                        arrayList0 = new ArrayList();
                        eioe0 = ((eioh)eiog0).g("SELECT flags_content\nFROM param_partitions\nINNER JOIN experiment_states_to_partitions\n  USING (param_partition_id)\nINNER JOIN experiment_states\n  USING (experiment_state_id)\nINNER JOIN config_packages\n  ON experiment_state_id IS committed_experiment_state_id\nWHERE config_packages.name = ?1;\n").h(new Object[]{s1}).f();
                    }
                    catch(Throwable throwable4) {
                        fple1 = fple0;
                        goto label_189;
                    }
                    while(true) {
                        try {
                        label_61:
                            boolean z1 = eioe0.b();
                        }
                        catch(Throwable throwable10) {
                            fple1 = fple0;
                            throwable11 = throwable10;
                            goto label_73;
                        }
                        if(!z1) {
                            goto label_78;
                        }
                        try {
                            arrayList0.add(((fpkx)fpkv0.a(eioe0.k(0), new eiqv())));
                            goto label_61;
                        }
                        catch(Throwable throwable12) {
                        }
                        break;
                    }
                    throwable11 = throwable12;
                    fple1 = fple0;
                    try {
                    label_73:
                        eioe0.close();
                        throw throwable11;
                    }
                    catch(Throwable throwable13) {
                        try {
                            throwable11.addSuppressed(throwable13);
                            throw throwable11;
                        }
                        catch(Throwable throwable4) {
                            goto label_189;
                        }
                    }
                    try {
                    label_78:
                        eioe0.close();
                        eiok2 = ((eioh)eiog0).g("SELECT experiment_token, server_token, serving_version\nFROM experiment_states\nINNER JOIN config_packages\n  ON experiment_state_id IS committed_experiment_state_id\nWHERE name = ?1;\n").h(new Object[]{s1}).i();
                    }
                    catch(Throwable throwable4) {
                        fple1 = fple0;
                        goto label_189;
                    }
                    if(eiok2 != null) {
                        try {
                            arr_b = eiok2.j(0);
                            s3 = eiok2.h(1);
                            v2 = eiok2.f(2);
                        }
                        catch(Throwable throwable14) {
                            fple1 = fple0;
                            goto label_173;
                        }
                        try {
                            eiok2.close();
                            fpkx fpkx0 = fpkx.c(arrayList0);
                            Objects.requireNonNull(fpkx0);
                            arr_b1 = fple0.a(new eiqw(fpkx0));
                            v3 = ((eioh)eiop0).g("SELECT IFNULL(MAX(config_package_id), -1) FROM config_packages WHERE name = ?1;").h(new Object[]{s1}).b();
                            if(v3 == -1L) {
                                eiol0 = eiop0.c("    INSERT INTO config_packages (name, android_package_id,\n      experiment_state_id, flags_content, experiment_token, server_token,\n      serving_version)\n    VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7);\n");
                                goto label_99;
                            }
                            else {
                                goto label_102;
                            }
                            goto label_104;
                        }
                        catch(Throwable throwable4) {
                            fple1 = fple0;
                            goto label_189;
                        }
                    label_99:
                        fple1 = fple0;
                        try {
                            v3 = eiol0.g(new Object[]{s1, v1, v, arr_b1, arr_b, s3, v2}).c();
                            goto label_104;
                        label_102:
                            fple1 = fple0;
                            eiop0.c("UPDATE config_packages\nSET android_package_id = ?2,\n  experiment_state_id = ?3,\n  flags_content = ?4,\n  experiment_token = ?5,\n  server_token = ?6,\n  serving_version = ?7\nWHERE config_package_id = ?1\nAND (\n  android_package_id <> ?2\n  OR experiment_state_id <> ?3\n  OR flags_content IS NOT ?4\n  OR experiment_token IS NOT ?5\n  OR server_token <> ?6\n  OR serving_version <> ?7\n);\n").g(new Object[]{v3, v1, v, arr_b1, arr_b, s3, v2}).d();
                        label_104:
                            eiop0.c("DELETE FROM config_packages_to_log_sources WHERE config_package_id = ?1;").g(new Object[]{v3}).d();
                            eioe1 = ((eioh)eiog0).g("SELECT log_sources.name\nFROM config_packages_to_log_sources\nINNER JOIN log_sources\n  USING (log_source_id)\nINNER JOIN config_packages\n  USING (config_package_id)\nWHERE config_packages.name = ?1;\n").h(new Object[]{s1}).f();
                        }
                        catch(Throwable throwable4) {
                            goto label_189;
                        }
                        while(true) {
                            try {
                                if(!eioe1.b()) {
                                    goto label_120;
                                }
                                String s4 = eioe1.h(0);
                                long v4 = ((eioh)eiop0).g("SELECT IFNULL(MAX(log_source_id), -1) FROM log_sources WHERE name = ?1;").h(new Object[]{s4}).b();
                                if(v4 == -1L) {
                                    v4 = eiop0.c("INSERT INTO log_sources (name) VALUES (?1);").g(new Object[]{s4}).c();
                                }
                                eiop0.c("    INSERT OR IGNORE INTO config_packages_to_log_sources\n      (config_package_id, log_source_id)\n    VALUES (?1, ?2);\n").g(new Object[]{v3, v4}).d();
                            }
                            catch(Throwable throwable15) {
                                try {
                                    eioe1.close();
                                    throw throwable15;
                                }
                                catch(Throwable throwable16) {
                                    try {
                                        throwable15.addSuppressed(throwable16);
                                        throw throwable15;
                                    label_120:
                                        eioe1.close();
                                        eiop0.c("DELETE FROM flag_overrides WHERE config_package_id = ?1;").g(new Object[]{v3}).d();
                                        eioe2 = ((eioh)eiog0).g("SELECT flag_overrides.name, flag_overrides.type, flag_overrides.value\nFROM flag_overrides\nINNER JOIN experiment_states_to_overrides\n  USING (override_id)\nINNER JOIN experiment_states\n  USING (experiment_state_id)\nINNER JOIN config_packages\n  ON experiment_states.experiment_state_id IS committed_experiment_state_id\nWHERE config_packages.name = ?1;\n").h(new Object[]{s1}).f();
                                        break;
                                    }
                                    catch(Throwable throwable4) {
                                        goto label_189;
                                    }
                                }
                            }
                        }
                        while(true) {
                            try {
                                if(!eioe2.b()) {
                                    goto label_144;
                                }
                                String s5 = eioe2.h(0);
                                int v5 = (int)eioe2.f(1);
                                switch(v5) {
                                    case 1: 
                                    case 2: {
                                        long0 = eioe2.f(2);
                                        break;
                                    }
                                    case 3: {
                                        long0 = eioe2.e(2);
                                        break;
                                    }
                                    case 4: {
                                        long0 = eioe2.h(2);
                                        break;
                                    }
                                    case 5: {
                                        long0 = eioe2.k(2);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalArgumentException("Unrecognized flag value type " + eioe2.f(1) + " for flag name " + s5);
                                    }
                                }
                                eiop0.c("    INSERT INTO flag_overrides (config_package_id, name, type, value)\n    VALUES (?1, ?2, ?3, ?4);\n").g(new Object[]{v3, s5, v5, long0}).d();
                            }
                            catch(Throwable throwable17) {
                                try {
                                    eioe2.close();
                                    throw throwable17;
                                }
                                catch(Throwable throwable18) {
                                    try {
                                        throwable17.addSuppressed(throwable18);
                                        throw throwable17;
                                    label_144:
                                        eioe2.close();
                                        eiop0.c("DELETE FROM cross_logged_tokens WHERE from_config_package_id = ?1;").g(new Object[]{v3}).d();
                                        eioe3 = ((eioh)eiog0).g("SELECT\n  ToAndroidPackage.name,\n  ToPackage.name,\n  cross_logged_tokens.token,\n  cross_logged_tokens.diversion_provenance\nFROM cross_logged_tokens\nINNER JOIN experiment_states\n  USING (experiment_state_id)\nINNER JOIN config_packages AS FromPackage\n  ON experiment_states.experiment_state_id IS FromPackage.committed_experiment_state_id\nINNER JOIN config_packages AS ToPackage\n  ON cross_logged_tokens.to_config_package_id = ToPackage.config_package_id\nINNER JOIN android_packages AS ToAndroidPackage\n  ON ToAndroidPackage.android_package_id = ToPackage.android_package_id\nWHERE FromPackage.name = ?1;\n").h(new Object[]{s1}).f();
                                        break;
                                    }
                                    catch(Throwable throwable4) {
                                        goto label_189;
                                    }
                                }
                            }
                        }
                        while(true) {
                            try {
                                if(!eioe3.b()) {
                                    goto label_163;
                                }
                                String s6 = eioe3.h(0);
                                String s7 = eioe3.h(1);
                                long v6 = eiqx.n(eiop0, s6);
                                long v7 = ((eioh)eiop0).g("SELECT IFNULL(MAX(config_package_id), -1) FROM config_packages WHERE name = ?1;").h(new Object[]{s7}).b();
                                if(v7 == -1L) {
                                    v7 = eiop0.c("INSERT INTO config_packages (name, android_package_id, experiment_state_id, flags_content,\n  experiment_token, server_token, serving_version)\nVALUES (?1, ?2, -1, NULL, NULL, \"\", 0);\n").g(new Object[]{s7, v6}).c();
                                }
                                eiop0.c("    INSERT INTO cross_logged_tokens\n      (from_config_package_id, to_config_package_id, token, diversion_provenance)\n    VALUES (?1, ?2, ?3, ?4);\n").g(new Object[]{v3, v7, eioe3.k(2), eioe3.f(3)}).d();
                            }
                            catch(Throwable throwable19) {
                                try {
                                    eioe3.close();
                                    throw throwable19;
                                }
                                catch(Throwable throwable20) {
                                    try {
                                        throwable19.addSuppressed(throwable20);
                                        throw throwable19;
                                    label_163:
                                        eioe3.close();
                                        break;
                                    }
                                    catch(Throwable throwable4) {
                                        goto label_189;
                                    }
                                }
                            }
                        }
                        try {
                            fple1.close();
                        }
                        catch(Throwable throwable3) {
                            goto label_196;
                        }
                        try {
                            fpkv0.close();
                        }
                        catch(Throwable throwable2) {
                            goto label_202;
                        }
                        try {
                            try {
                                gdqb0.close();
                            }
                            catch(IOException iOException0) {
                                throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
                            }
                            eiop0.e();
                        }
                        catch(Throwable throwable1) {
                            goto label_210;
                        }
                        try {
                            eiop0.close();
                        }
                        catch(Throwable throwable0) {
                            goto label_340;
                        }
                        goto label_345;
                    }
                    fple1 = fple0;
                    try {
                        throw new eipa(0x733F);
                    }
                    catch(Throwable throwable14) {
                    }
                label_173:
                    if(eiok2 != null) {
                        try {
                            eiok2.close();
                        }
                        catch(Throwable throwable21) {
                            try {
                                throwable14.addSuppressed(throwable21);
                                throw throwable14;
                            }
                            catch(Throwable throwable4) {
                                goto label_189;
                            }
                        }
                    }
                    throw throwable14;
                }
                fple1 = fple0;
                try {
                    throw new eipa(0x733F);
                }
                catch(Throwable throwable9) {
                }
            label_182:
                if(eiok1 != null) {
                    try {
                        eiok1.close();
                    }
                    catch(Throwable throwable22) {
                        try {
                            throwable9.addSuppressed(throwable22);
                            throw throwable9;
                        }
                        catch(Throwable throwable4) {
                            goto label_189;
                        }
                    }
                }
                throw throwable9;
            label_189:
                throwable8 = throwable4;
                try {
                label_190:
                    fple1.close();
                    throw throwable8;
                }
                catch(Throwable throwable23) {
                    try {
                        throwable8.addSuppressed(throwable23);
                        throw throwable8;
                    }
                    catch(Throwable throwable3) {
                    }
                }
                try {
                label_196:
                    fpkv0.close();
                    throw throwable3;
                }
                catch(Throwable throwable24) {
                    try {
                        throwable3.addSuppressed(throwable24);
                        throw throwable3;
                    }
                    catch(Throwable throwable2) {
                    }
                }
                try {
                label_202:
                    gdqb0.close();
                    throw throwable2;
                }
                catch(Throwable throwable25) {
                    try {
                        try {
                            throwable2.addSuppressed(throwable25);
                            throw throwable2;
                        }
                        catch(IOException iOException0) {
                            throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
                        }
                    }
                    catch(Throwable throwable1) {
                    }
                }
                try {
                label_210:
                    eiop0.close();
                    throw throwable1;
                }
                catch(Throwable throwable26) {
                    try {
                        throwable1.addSuppressed(throwable26);
                        throw throwable1;
                    label_215:
                        gdqb1 = gdsp.e("com/google/android/gms/phenotype/service/operations/CommitToConfigurationGmsOperation", "copyDataFromCeToDe", 0xDD, "Copy CE to DE");
                    }
                    catch(Throwable throwable0) {
                        goto label_340;
                    }
                }
                try {
                    eiop1 = eiov.a(context0).a().c();
                }
                catch(Throwable throwable27) {
                    goto label_332;
                }
                try {
                    eioa0 = ((eioh)eiog0).g("SELECT packageName, version, params, dynamicParams, weak, androidPackageName, isSynced, serializedDeclarativeRegInfo, configTier, baselineCl, heterodyneInfo, runtimeProperties FROM Packages WHERE packageName = ?").h(new Object[]{eiqy0.b}).c();
                }
                catch(Throwable throwable28) {
                    goto label_324;
                }
                while(true) {
                    try {
                        if(!eioa0.b()) {
                            goto label_228;
                        }
                        eiop1.c("INSERT OR REPLACE INTO Packages (packageName, version, params, dynamicParams, weak, androidPackageName, isSynced, serializedDeclarativeRegInfo, configTier, baselineCl, heterodyneInfo, runtimeProperties) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").h(eioa0).d();
                    }
                    catch(Throwable throwable29) {
                        try {
                            eioa0.close();
                            throw throwable29;
                        }
                        catch(Throwable throwable30) {
                            try {
                                throwable29.addSuppressed(throwable30);
                                throw throwable29;
                            label_228:
                                eioa0.close();
                                eiop1.c("DELETE FROM LogSources WHERE packageName = ?").g(new Object[]{eiqy0.b}).d();
                                eioa1 = ((eioh)eiog0).g("SELECT packageName, logSourceName FROM LogSources WHERE packageName = ?").h(new Object[]{eiqy0.b}).c();
                                break;
                            }
                            catch(Throwable throwable28) {
                                goto label_324;
                            }
                        }
                    }
                }
                while(true) {
                    try {
                        if(!eioa1.b()) {
                            goto label_241;
                        }
                        eiop1.c("INSERT INTO LogSources (packageName, logSourceName) VALUES (?, ?)").h(eioa1).d();
                    }
                    catch(Throwable throwable31) {
                        try {
                            eioa1.close();
                            throw throwable31;
                        }
                        catch(Throwable throwable32) {
                            try {
                                throwable31.addSuppressed(throwable32);
                                throw throwable31;
                            label_241:
                                eioa1.close();
                                eiop1.c("DELETE FROM Flags WHERE packageName = ? AND committed = 1").g(new Object[]{eiqy0.b}).d();
                                eioa2 = ((eioh)eiog0).g("SELECT packageName, version, flagType, partitionId, user, name, intVal, boolVal, floatVal, stringVal, extensionVal, committed FROM Flags WHERE packageName = ? AND committed = 1").h(new Object[]{eiqy0.b}).c();
                                break;
                            }
                            catch(Throwable throwable28) {
                                goto label_324;
                            }
                        }
                    }
                }
                while(true) {
                    try {
                        if(!eioa2.b()) {
                            goto label_254;
                        }
                        eiop1.c("INSERT INTO Flags (packageName, version, flagType, partitionId, user, name, intVal, boolVal, floatVal, stringVal, extensionVal, committed) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").h(eioa2).d();
                    }
                    catch(Throwable throwable33) {
                        try {
                            eioa2.close();
                            throw throwable33;
                        }
                        catch(Throwable throwable34) {
                            try {
                                throwable33.addSuppressed(throwable34);
                                throw throwable33;
                            label_254:
                                eioa2.close();
                                eiop1.c("DELETE FROM FlagOverrides WHERE packageName = ? AND committed = 1").g(new Object[]{eiqy0.b}).d();
                                eioa3 = ((eioh)eiog0).g("SELECT packageName, flagType, user, name, intVal, boolVal, floatVal, stringVal, extensionVal, committed FROM FlagOverrides WHERE packageName = ? AND committed = 1").h(new Object[]{eiqy0.b}).c();
                                break;
                            }
                            catch(Throwable throwable28) {
                                goto label_324;
                            }
                        }
                    }
                }
                while(true) {
                    try {
                        if(!eioa3.b()) {
                            goto label_267;
                        }
                        eiop1.c("INSERT INTO FlagOverrides (packageName, flagType, user, name, intVal, boolVal, floatVal, stringVal, extensionVal, committed) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").h(eioa3).d();
                    }
                    catch(Throwable throwable35) {
                        try {
                            eioa3.close();
                            throw throwable35;
                        }
                        catch(Throwable throwable36) {
                            try {
                                throwable35.addSuppressed(throwable36);
                                throw throwable35;
                            label_267:
                                eioa3.close();
                                eiop1.c("DELETE FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 1").g(new Object[]{eiqy0.b}).d();
                                eioa4 = ((eioh)eiog0).g("SELECT packageName, version, user, isCommitted, experimentToken, serverToken, configHash, flagsHash, servingVersion, tokensTag FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 1").h(new Object[]{eiqy0.b}).c();
                                break;
                            }
                            catch(Throwable throwable28) {
                                goto label_324;
                            }
                        }
                    }
                }
                while(true) {
                    try {
                        if(!eioa4.b()) {
                            goto label_280;
                        }
                        eiop1.c("INSERT INTO ExperimentTokens (packageName, version, user, isCommitted, experimentToken, serverToken, configHash, flagsHash, servingVersion, tokensTag) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)").h(eioa4).d();
                    }
                    catch(Throwable throwable37) {
                        try {
                            eioa4.close();
                            throw throwable37;
                        }
                        catch(Throwable throwable38) {
                            try {
                                throwable37.addSuppressed(throwable38);
                                throw throwable37;
                            label_280:
                                eioa4.close();
                                eiop1.c("DELETE FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND isCommitted = 1").g(new Object[]{eiqy0.b}).d();
                                eioa5 = ((eioh)eiog0).g("SELECT fromPackageName, fromVersion, fromUser, toPackageName, toVersion, isCommitted, token, provenance FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND isCommitted = 1").h(new Object[]{eiqy0.b}).c();
                                break;
                            }
                            catch(Throwable throwable28) {
                                goto label_324;
                            }
                        }
                    }
                }
                while(true) {
                    try {
                        if(!eioa5.b()) {
                            goto label_293;
                        }
                        eiop1.c("INSERT INTO CrossLoggedExperimentTokens (fromPackageName, fromVersion, fromUser, toPackageName, toVersion, isCommitted, token, provenance) VALUES (?, ?, ?, ?, ?, ?, ?, ?)").h(eioa5).d();
                    }
                    catch(Throwable throwable39) {
                        try {
                            eioa5.close();
                            throw throwable39;
                        }
                        catch(Throwable throwable40) {
                            try {
                                throwable39.addSuppressed(throwable40);
                                throw throwable39;
                            label_293:
                                eioa5.close();
                                s8 = eiqy0.b;
                                gftb.check(s8);
                                eipo.a(eiqy.class, "getCommittedUserAndVersion", s8);
                                break;
                            }
                            catch(Throwable throwable28) {
                                goto label_324;
                            }
                        }
                    }
                }
                try {
                    eiok3 = ((eioh)eiog0).g("SELECT user, version FROM ApplicationStates WHERE packageName = ?").h(new Object[]{s8}).i();
                }
                catch(Throwable throwable41) {
                    goto label_310;
                }
                if(eiok3 == null) {
                    goto label_317;
                }
                else {
                    try {
                        pair0 = Pair.create(eiok3.h(0), Integer.valueOf(((int)eiok3.f(1))));
                        goto label_307;
                    }
                    catch(Throwable throwable42) {
                        try {
                            eiok3.close();
                            throw throwable42;
                        }
                        catch(Throwable throwable43) {
                            try {
                                throwable42.addSuppressed(throwable43);
                                throw throwable42;
                            label_307:
                                eiok3.close();
                                goto label_315;
                            }
                            catch(Throwable throwable41) {
                            }
                        }
                    }
                    try {
                    label_310:
                        Trace.endSection();
                        throw throwable41;
                    }
                    catch(Throwable throwable44) {
                        try {
                            throwable41.addSuppressed(throwable44);
                            throw throwable41;
                        label_315:
                            Trace.endSection();
                            goto label_319;
                        label_317:
                            Trace.endSection();
                            pair0 = null;
                        label_319:
                            if(pair0 != null) {
                                eiqy0.a(eiop1, ((String)pair0.first), ((long)(((int)(((Integer)pair0.second))))));
                            }
                            eiop1.e();
                            goto label_329;
                        }
                        catch(Throwable throwable28) {
                        }
                        goto label_324;
                    }
                }
                goto label_319;
                try {
                label_324:
                    eiop1.close();
                    throw throwable28;
                }
                catch(Throwable throwable45) {
                    try {
                        throwable28.addSuppressed(throwable45);
                        throw throwable28;
                    label_329:
                        eiop1.close();
                        goto label_337;
                    }
                    catch(Throwable throwable27) {
                    }
                }
                try {
                label_332:
                    gdqb1.close();
                    throw throwable27;
                }
                catch(Throwable throwable46) {
                    try {
                        throwable27.addSuppressed(throwable46);
                        throw throwable27;
                    label_337:
                        gdqb1.close();
                        goto label_345;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                try {
                label_340:
                    eiog0.close();
                }
                catch(Throwable throwable47) {
                    throwable0.addSuppressed(throwable47);
                }
                throw throwable0;
            }
        label_345:
            eiog0.close();
        }
        ContentResolver contentResolver0 = context0.getContentResolver();
        String s9 = eiqy0.b;
        gftb.check(s9);
        contentResolver0.notifyChange(fpib.a(s9), null);
        for(Object object0: eipv.a) {
            String s10 = (String)object0;
            Map map0 = eiqx.b;
            synchronized(map0) {
                boolean0 = (Boolean)map0.get(s10);
            }
            if(boolean0 == null) {
                boolean z3 = bbmq.U(context0, s10);
                Boolean boolean1 = Boolean.valueOf(z3);
                synchronized(map0) {
                    map0.put(s10, boolean1);
                }
                boolean1.getClass();
                z2 = z3;
            }
            else {
                z2 = boolean0.booleanValue();
            }
            if(z2) {
                context0.sendBroadcast(new Intent("com.google.android.gms.phenotype.COMMIT").setFlags(0x40000000).setPackage(s10).putExtra("package_name", eiqy0.b));
            }
        }
    }

    private static long n(eiop eiop0, String s) {
        long v = ((eioh)eiop0).g("SELECT IFNULL(MAX(android_package_id), -1) FROM android_packages WHERE name = ?1;").h(new Object[]{s}).b();
        return v == -1L ? eiop0.c("INSERT INTO android_packages (name) VALUES (?1);").g(new Object[]{s}).c() : v;
    }
}

