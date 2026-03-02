import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jeb.synthetic.TWR;

public final class eira extends eiqt {
    private final eiqg a;
    private final eirb b;

    public eira(eiqg eiqg0, String s, String s1, String s2, String s3) {
        super("DeleteFlagOverridesOperationCall", hlse.S);
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = new eirb(s1, s2, s3, s, new eiqz());
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        String s = this.b.b;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final List d() {
        return this.b.c;
    }

    @Override  // eiqt
    public final List e() {
        return this.b.d;
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        Iterator iterator3;
        ArrayList arrayList2;
        Flag flag0;
        eirb eirb0 = this.b;
        String s = eirb0.f;
        if(s != null && s.endsWith("*")) {
            throw new eipa(29500, "Prefix deletes are no longer supported");
        }
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        eiop eiop0 = eiox0.a().b();
        try {
            eirb0.b = eipn.c(eirb0.b, eirb0.g);
            if(eiop0.f()) {
                eion eion0 = eiop0.d("OverridesToDelete", "CREATE TEMP TABLE OverridesToDelete(override_id INTEGER PRIMARY KEY);");
                try {
                    eioe eioe1 = ((eioh)eiop0).g("SELECT DISTINCT\n  config_packages.name,\n  accounts.name,\n  flag_overrides.override_id,\n  flag_overrides.name,\n  flag_overrides.type,\n  flag_overrides.value\nFROM flag_overrides\nINNER JOIN experiment_states_to_overrides\n  USING (override_id)\nINNER JOIN config_packages\n  USING (config_package_id)\nINNER JOIN accounts\n  USING (account_id)\nLEFT OUTER JOIN flag_overrides_to_commit\n  USING (override_id)\nWHERE\n  IFNULL(config_packages.name = ?1, 1)\n  AND IFNULL(accounts.name = ?2, 1)\n  AND IFNULL(flag_overrides.name = ?3, 1);\n").h(new Object[]{eirb0.b, eirb0.e, eirb0.f}).e(new String[]{"experiment_states_to_overrides", "flag_overrides"}).f();
                    while(true) {
                        try {
                            if(!eioe1.b()) {
                                break;
                            }
                            switch(((int)eioe1.f(4))) {
                                case 1: {
                                    flag0 = new Flag(eioe1.h(3), eioe1.f(5), 0);
                                    break;
                                }
                                case 2: {
                                    flag0 = new Flag(eioe1.h(3), eioe1.f(5) == 1L, 0);
                                    break;
                                }
                                case 3: {
                                    flag0 = new Flag(eioe1.h(3), eioe1.e(5), 0);
                                    break;
                                }
                                case 4: {
                                    flag0 = new Flag(eioe1.h(3), eioe1.h(5), 0);
                                    break;
                                }
                                case 5: {
                                    flag0 = new Flag(eioe1.h(3), eioe1.k(5), 0);
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("Found flag override with unknown type: " + eioe1.h(3));
                                }
                            }
                            FlagOverride flagOverride1 = new FlagOverride(eioe1.h(0), eioe1.h(1), flag0, false);
                            arrayList0.add(flagOverride1);
                            hashSet0.add(eioe1.h(0));
                            ((ggtj)eirb.a.h()).B("Deleting override %s", flagOverride1);
                            eiop0.c("INSERT INTO TEMP.OverridesToDelete (override_id) VALUES (?1);").g(new Object[]{eioe1.f(2)}).d();
                        }
                        catch(Throwable throwable3) {
                            TWR.safeClose$NT(eioe1, throwable3);
                            throw throwable3;
                        }
                    }
                    eioe1.close();
                    eiop0.c("UPDATE flag_overrides\nSET active = NULL\nWHERE override_id IN (SELECT override_id FROM TEMP.OverridesToDelete);\n").d();
                    try(eioe eioe2 = ((eioh)eiop0).g("SELECT MAX(experiment_state_id) AS latest_experiment_state_id, config_packages.name, accounts.name\nFROM experiment_states\nINNER JOIN config_packages\n  USING (config_package_id)\nINNER JOIN accounts\n  USING (account_id)\nINNER JOIN experiment_states_to_overrides\n USING (experiment_state_id)\nINNER JOIN TEMP.OverridesToDelete\n USING (override_id)\nGROUP BY config_package_id, account_id;\n").h(new Object[0]).e(new String[]{"experiment_states_to_overrides"}).f()) {
                        while(true) {
                            if(!eioe2.b()) {
                                break;
                            }
                            Long long0 = eioe2.f(0);
                            Long long1 = eiop0.c("INSERT INTO experiment_states (experiment_token, server_token, serving_version, tokens_tag,\n  config_hash, registration_generation, account_id, config_package_id)\nSELECT experiment_token, server_token, serving_version, tokens_tag, config_hash,\n  registration_generation, account_id, config_package_id\nFROM experiment_states\nWHERE experiment_state_id = ?1;\n").g(new Object[]{long0}).c();
                            ((ggtj)eirb.a.h()).Y("Created new experiment state ID%d from ID%d for config package %s and account %s", long1, long0, eioe2.h(1), eioe2.h(2));
                            eiop0.c("INSERT INTO experiment_states_to_partitions (experiment_state_id, ordinal, param_partition_id)\nSELECT ?1, ordinal, param_partition_id\nFROM experiment_states_to_partitions\nWHERE experiment_state_id = ?2;\n").g(new Object[]{long1, long0}).d();
                            eiop0.c("INSERT INTO experiment_states_to_overrides (experiment_state_id, override_id)\nSELECT ?1, override_id\nFROM experiment_states_to_overrides\nINNER JOIN flag_overrides\n  USING (override_id)\nWHERE\n  experiment_state_id = ?2\n  AND active IS 1;\n").g(new Object[]{long1, long0}).d();
                        }
                    }
                }
                catch(Throwable throwable2) {
                    TWR.safeClose$NT(eion0, throwable2);
                    throw throwable2;
                }
                eion0.close();
            }
            else {
                eioe eioe0 = ((eioh)eiop0).g("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal, packageName, user FROM FlagOverrides WHERE IFNULL(packageName = ?, 1) AND IFNULL(user = ?, 1) AND IFNULL(name = ?, 1) AND committed = 0").h(new Object[]{eirb0.b, eirb0.e, s}).e(new String[]{"FlagOverrides"}).f();
                while(true) {
                    try {
                        if(!eioe0.b()) {
                            break;
                        }
                        String s1 = eioe0.h(7);
                        String s2 = eioe0.h(8);
                        String s3 = eioe0.h(1);
                        FlagOverride flagOverride0 = new FlagOverride(s1, s2, eiro.d(eioe0), false);
                        arrayList0.add(flagOverride0);
                        hashSet0.add(flagOverride0.a);
                        eiop0.c("DELETE FROM FlagOverrides WHERE packageName = ? AND user = ? AND name = ? AND committed = 0").g(new Object[]{s1, s2, s3}).d();
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(eioe0, throwable1);
                        throw throwable1;
                    }
                }
                eioe0.close();
                for(Object object0: hashSet0) {
                    einw.b(eiop0, ((String)object0));
                }
            }
            eiop0.e();
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(eiop0, throwable0);
            throw throwable0;
        }
        eiop0.close();
        eiot.c(eiox0, hashSet0);
        eiog eiog0 = eiox0.a().a();
        try {
            ArrayList arrayList1 = new ArrayList();
            eioe eioe3 = ((eioh)eiog0).g((eiog0.f() ? "SELECT name FROM accounts;" : "SELECT user FROM RequestTags;")).e(new String[]{"accounts", "RequestTags"}).f();
            while(true) {
                try {
                    if(!eioe3.b()) {
                        break;
                    }
                    arrayList1.add(eioe3.h(0));
                }
                catch(Throwable throwable5) {
                    TWR.safeClose$NT(eioe3, throwable5);
                    throw throwable5;
                }
            }
            eioe3.close();
            int v = "com.google.android.apps.mobileutilities".equals(eirb0.g) ? 22 : 21;
            for(Iterator iterator1 = hashSet0.iterator(); iterator1.hasNext(); iterator1 = iterator3) {
                Object object1 = iterator1.next();
                String s4 = (String)object1;
                eiok eiok0 = ((eioh)eiog0).g((eiog0.f() ? "SELECT android_packages.name\nFROM android_packages\nINNER JOIN config_packages\n  USING (android_package_id)\nWHERE config_packages.name = ?1;\n" : "SELECT androidPackageName FROM Packages WHERE packageName = ? LIMIT 1;")).h(new Object[]{s4}).i();
                if(eiok0 == null) {
                    arrayList2 = arrayList1;
                    iterator3 = iterator1;
                }
                else {
                    try {
                        String s5 = eiok0.h(0);
                        eiui eiui0 = new eiui(context0, 0L);
                        try {
                            for(Object object2: arrayList1) {
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)goab.a).v_newBuilder();
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)goau.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                goau goau0 = (goau)hftp1.b_message;
                                s4.getClass();
                                goau0.b |= 1;
                                goau0.c = s4;
                                goau goau1 = (goau)hftp1.N_build();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                goab goab0 = (goab)hftp0.b_message;
                                goau1.getClass();
                                goab0.c = goau1;
                                goab0.b |= 1;
                                eiui0.b(((goab)hftp0.N_build()), s5, ((String)object2), eiog0);
                                arrayList1 = arrayList1;
                                iterator1 = iterator1;
                            }
                            arrayList2 = arrayList1;
                            iterator3 = iterator1;
                            eiui0.c();
                        }
                        catch(Throwable throwable7) {
                            TWR.safeClose$NT(eiui0, throwable7);
                            throw throwable7;
                        }
                        eiui0.close();
                        eipp eipp0 = eipr.a(context0, eirb0.h, s4, s5, v, true);
                        hlri hlri0 = eipp0.a;
                        if(hlri0 != null) {
                            eirb0.c.add(hlri0);
                        }
                        hlrk hlrk0 = eipp0.b;
                        if(hlrk0 != null) {
                            eirb0.d.add(hlrk0);
                        }
                    }
                    catch(Throwable throwable6) {
                        TWR.safeClose$NT(eiok0, throwable6);
                        throw throwable6;
                    }
                }
                if(eiok0 != null) {
                    eiok0.close();
                }
                arrayList1 = arrayList2;
            }
        }
        catch(Throwable throwable4) {
            TWR.safeClose$NT(eiog0, throwable4);
            throw throwable4;
        }
        eiog0.close();
        FlagOverrides flagOverrides0 = new FlagOverrides(arrayList0);
        eipw.a(context0).b(this.b.b);
        this.a.i(Status.b, flagOverrides0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.i(status0, null);
    }
}

