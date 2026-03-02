import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import jeb.synthetic.TWR;

public final class eith extends eiqt {
    private final eiqg a;
    private final eiti b;

    public eith(eiqg eiqg0, String s, String s1, long v, gnzv gnzv0) {
        hlse hlse0;
        switch(gnzv0.ordinal()) {
            case 3: {
                hlse0 = hlse.r;
                break;
            }
            case 0: 
            case 4: {
                hlse0 = hlse.q;
                break;
            }
            default: {
                hlse0 = hlse.a;
            }
        }
        super("SyncAfterOperationCall", hlse0);
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = new eiti(s, s1, v, gnzv0);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        eiti eiti0 = this.b;
        String s = eiti0.b;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        String s1 = eiti0.c;
        if(s1 != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh1 = (hlrh)hlrg0.b_message;
            hlrh1.b |= 4;
            hlrh1.e = s1;
        }
        long v = eiti0.d;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh2 = (hlrh)hlrg0.b_message;
        hlrh2.b |= 0x40;
        hlrh2.h = v;
        gnzv gnzv0 = eiti0.e;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh3 = (hlrh)hlrg0.b_message;
        hlrh3.b |= 0x100;
        hlrh3.j = gnzv0.x;
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        eiok eiok1;
        String s3;
        int v3;
        eiok eiok0;
        long v2;
        eiti eiti0 = this.b;
        String s = eiti0.c;
        int v = 0;
        if(s != null && eiti0.b != null || s == null && eiti0.b == null) {
            throw new eipa(29500, "Exactly one of configPackage or callingPackage must be supplied.");
        }
        ggfp ggfp0 = ggnj.a;
        eior eior0 = eiox0.a();
        eiog eiog0 = eior0.a();
        long v1 = 0L;
        try {
            if(s == null) {
                goto label_52;
            }
            else {
                if(!((eioh)eiog0).g((eiog0.f() ? "SELECT EXISTS(SELECT NULL FROM android_packages WHERE name = ?);" : "SELECT EXISTS(SELECT NULL FROM Packages WHERE androidPackageName = ?)")).h(new Object[]{s}).g()) {
                    ((ggtj)eiti.a.h()).B("No config packages are registered from Android package: %s", s);
                    throw new eipa(0x733F);
                }
                eiod eiod0 = ((eioh)eiog0).g((eiog0.f() ? "SELECT EXISTS(SELECT NULL FROM android_packages WHERE name = ? AND last_syncafter_serving_version = ?);" : "SELECT EXISTS(SELECT NULL FROM LastSyncAfterRequest WHERE androidPackageName = ? AND servingVersion = ?)"));
                v2 = eiti0.d;
                if(eiod0.h(new Object[]{s, v2}).d().g()) {
                    ((ggtj)eiti.a.h()).A("Last successful syncAfter is equal to requested serving version (%d)", v2);
                    goto label_61;
                }
                else {
                    eiok0 = ((eioh)eiog0).g((eiog0.f() ? "WITH MinUncommittedServingVersion AS (\n  SELECT MIN(serving_version) as min_uncommitted_serving_version\n  FROM experiment_states\n  INNER JOIN config_packages\n    ON (experiment_states.config_package_id =\n          config_packages.config_package_id\n        AND experiment_state_id IS NOT committed_experiment_state_id)\n  INNER JOIN android_packages USING (android_package_id)\n  WHERE android_packages.name = ?1\n), CommittedServingVersion AS (\n  SELECT IFNULL(committed_experiment_state_id, 0)\n    as committed_serving_version\n  FROM config_packages\n  INNER JOIN android_packages USING (android_package_id)\n  WHERE android_packages.name = ?1\n)\nSELECT IFNULL(min_uncommitted_serving_version, committed_serving_version)\nFROM MinUncommittedServingVersion, CommittedServingVersion;\n" : "SELECT IFNULL(MIN(servingVersion), 0) FROM ExperimentTokens INNER JOIN Packages USING (packageName) WHERE Packages.androidPackageName = ? AND isCommitted = 0;")).h(new Object[]{s}).i();
                    goto label_19;
                }
            }
            goto label_121;
        }
        catch(Throwable throwable0) {
            goto label_80;
        }
        try {
        label_19:
            if(eiok0 == null) {
                v3 = 1;
            }
            else {
                v1 = eiok0.f(0);
                v3 = v1 >= v2 ? 0 : 1;
            }
            String s1 = "SELECT config_packages.name\nFROM config_packages\nINNER JOIN android_packages USING (android_package_id)\nWHERE android_packages.name = ?;\n";
            if(v3 != 0) {
                if(!eiog0.f()) {
                    s1 = "SELECT packageName FROM Packages WHERE androidPackageName = ?";
                }
                eioe eioe0 = ((eioh)eiog0).g(s1).h(new Object[]{s}).f();
                TWR.declareResource(eioe0);
                TWR.useResource$NT(eioe0);
                ggfn ggfn0 = new ggfn();
                while(true) {
                    TWR.useResource$NT(eioe0);
                    if(!eioe0.b()) {
                        break;
                    }
                    TWR.useResource$NT(eioe0);
                    String s2 = eioe0.g(0);
                    if(s2 != null) {
                        TWR.useResource$NT(eioe0);
                        ggfn0.i(s2);
                    }
                }
                TWR.useResource$NT(eioe0);
                ggfp0 = ggfn0.h();
            }
            goto label_49;
        }
        catch(Throwable throwable1) {
            try {
                TWR.safeClose$NT(eiok0, throwable1);
                throw throwable1;
            label_49:
                if(eiok0 == null) {
                    goto label_82;
                }
                else {
                    eiok0.close();
                    goto label_82;
                label_52:
                    eiod eiod1 = ((eioh)eiog0).g((eiog0.f() ? "SELECT NOT EXISTS(SELECT NULL FROM config_packages WHERE name = ?);" : "SELECT NOT EXISTS(SELECT NULL FROM Packages WHERE packageName = ?)"));
                    s3 = eiti0.b;
                    if(eiod1.h(new Object[]{s3}).g()) {
                        ((ggtj)eiti.a.h()).B("Cannot call syncAfter before register(): %s", s3);
                        throw new eipa(0x733F);
                    }
                    eiod eiod2 = ((eioh)eiog0).g((eiog0.f() ? "SELECT EXISTS(SELECT NULL FROM config_packages WHERE name = ? AND last_syncafter_serving_version = ?);" : "SELECT EXISTS(SELECT NULL FROM LastSyncAfterRequest WHERE packageName = ? AND servingVersion = ?)"));
                    long v4 = eiti0.d;
                    if(eiod2.h(new Object[]{s3, v4}).g()) {
                        ((ggtj)eiti.a.h()).A("Last successful syncAfter is equal to requested serving version (%d)", v4);
                        goto label_61;
                    }
                    else {
                        goto label_63;
                    }
                }
                goto label_121;
            }
            catch(Throwable throwable0) {
                goto label_80;
            }
        }
    label_61:
        eiog0.close();
        goto label_121;
        try {
        label_63:
            eiok1 = ((eioh)eiog0).g((eiog0.f() ? "WITH MinUncommittedServingVersion AS (\n  SELECT MIN(serving_version) as min_uncommitted_serving_version\n  FROM experiment_states\n  INNER JOIN config_packages\n    ON (experiment_states.config_package_id =\n          config_packages.config_package_id\n        AND experiment_state_id IS NOT committed_experiment_state_id)\n  WHERE config_packages.name = ?1\n), CommittedServingVersion AS (\n  SELECT IFNULL(committed_experiment_state_id, 0)\n    as committed_serving_version\n  FROM config_packages\n  WHERE config_packages.name = ?1\n)\nSELECT CASE WHEN min_uncommitted_serving_version IS NOT NULL\n  THEN min_uncommitted_serving_version\n  ELSE committed_serving_version\n  END\nFROM MinUncommittedServingVersion, CommittedServingVersion;\n" : "SELECT MIN(servingVersion) FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 0")).h(new Object[]{s3}).i();
        }
        catch(Throwable throwable0) {
            goto label_80;
        }
        try {
            if(eiok1 == null) {
                ((ggtj)eiti.a.h()).x("First sync");
                v3 = 1;
            }
            else {
                v1 = eiok1.c();
                if(v1 < v4) {
                    v = 1;
                }
                v3 = v;
            }
            goto label_76;
        }
        catch(Throwable throwable2) {
            try {
                TWR.safeClose$NT(eiok1, throwable2);
                throw throwable2;
            label_76:
                if(eiok1 != null) {
                    eiok1.close();
                }
                goto label_82;
            }
            catch(Throwable throwable0) {
            }
        }
    label_80:
        TWR.safeClose$NT(eiog0, throwable0);
        throw throwable0;
    label_82:
        eiog0.close();
        if(v3 != 0) {
            ggtj ggtj0 = (ggtj)eiti.a.h();
            long v5 = eiti0.d;
            ggtj0.K("New sync: %d > %d", v5, v1);
            eiud eiud0 = HeterodyneSyncTaskChimeraService.e(context0);
            hlrs hlrs0 = (hlrs)((ProtoLiteMessage)hlrv.a).v_newBuilder();
            String s4 = eiti0.c;
            if(s4 != null) {
                if(!hlrs0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hlrs0).ensureMutable();
                }
                hlrv hlrv0 = (hlrv)hlrs0.b_message;
                hlrv0.b |= 8;
                hlrv0.f = s4;
            }
            if(s == null) {
                eiud0.p(eiti0.e, eiti0.b, hlrs0);
            }
            else {
                String[] arr_s = eiud0.h();
                eiud0.q(eiti0.e, null, ggfp0, arr_s, arr_s, true, hlrs0);
            }
            switch(hlru.b(((hlrv)hlrs0.b_message).h)) {
                case 0: 
                case 1: {
                    eiop eiop0 = eior0.b();
                    try {
                        if(s == null) {
                            if(eiop0.f()) {
                                eiop0.c("UPDATE config_packages\nSET last_syncafter_serving_version = ?1\nWHERE name = ?2\n  AND last_syncafter_serving_version <> ?1;\n").g(new Object[]{v5, eiti0.b}).d();
                            }
                            else {
                                eiop0.c("INSERT OR REPLACE INTO LastSyncAfterRequest(packageName, servingVersion) VALUES (?, ?)").g(new Object[]{eiti0.b, v5}).d();
                            }
                        }
                        else if(eiop0.f()) {
                            eiop0.c("UPDATE android_packages\nSET last_syncafter_serving_version = ?1\nWHERE name = ?2\n  AND last_syncafter_serving_version <> ?1;\n").g(new Object[]{v5, s4}).d();
                        }
                        else {
                            eiop0.c("INSERT OR REPLACE INTO LastSyncAfterRequest(packageName, androidPackageName, servingVersion) VALUES (?1, ?1, ?2)").g(new Object[]{s4, v5}).d();
                        }
                        eiop0.e();
                    }
                    catch(Throwable throwable3) {
                        TWR.safeClose$NT(eiop0, throwable3);
                        throw throwable3;
                    }
                    eiop0.close();
                    break;
                }
                default: {
                    ((ggtj)eiti.a.h()).x("Sync as a result of syncAfter failed");
                    throw new eipa(0x7340);
                }
            }
        }
    label_121:
        this.a.o(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.o(status0);
    }
}

