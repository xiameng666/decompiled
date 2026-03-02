import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import java.util.ArrayList;
import jeb.synthetic.TWR;

public final class eisb extends eiqt {
    private final eiqg a;
    private final eisc b;

    public eisb(eiqg eiqg0, String s, String s1, String s2, String s3) {
        super("ListFlagOverridesOperationCall", hlse.T);
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = new eisc(s1, s2, s3, s);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        String s = this.b.a;
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
    public final void i(Context context0, eiox eiox0) {
        FlagOverrides flagOverrides0;
        boolean z1;
        Flag flag0;
        boolean z;
        eisc eisc0 = this.b;
        String s = eisc0.c;
        if(s != null && s.endsWith("*")) {
            throw new eipa(29500, "Prefix searches are no longer supported");
        }
        eiog eiog0 = eiox0.a().a();
        try {
            eisc0.a = eipn.c(eisc0.a, eisc0.d);
            ArrayList arrayList0 = new ArrayList();
            if(eiog0.f()) {
                eioe eioe0 = ((eioh)eiog0).g("SELECT\n  COALESCE(flag_overrides.config_package_name, config_packages.name) AS\n    config_package_name,\n  accounts.name AS account_name,\n  flag_overrides.override_id,\n  flag_overrides.name AS override_name,\n  flag_overrides.type AS override_type,\n  flag_overrides.value AS override_value,\n  (\n    EXISTS (\n        SELECT NULL\n        FROM config_packages\n        INNER JOIN experiment_states_to_overrides\n            ON (\n              committed_experiment_state_id IS experiment_state_id\n              AND experiment_states_to_overrides.override_id =\n                flag_overrides.override_id\n            )\n    ) OR EXISTS (\n        SELECT NULL\n        FROM flag_overrides_to_commit\n        WHERE flag_overrides_to_commit.override_id = flag_overrides.override_id\n    )\n  ) AS override_committed\nFROM flag_overrides\nLEFT OUTER JOIN config_packages\n  USING (config_package_id)\nINNER JOIN accounts\n  USING (account_id)\nWHERE\n  (\n    (\n      flag_overrides.config_package_name IS NOT NULL\n      AND IFNULL(flag_overrides.config_package_name = ?1, 1)\n    )\n    OR (\n      config_packages.name IS NOT NULL\n      AND IFNULL(config_packages.name = ?1, 1)\n    )\n  )\n  AND IFNULL(accounts.name = ?2, 1)\n  AND IFNULL(flag_overrides.name = ?3, 1)\n  AND flag_overrides.active IS 1;\n").h(new Object[]{eisc0.a, eisc0.b, s}).d().f();
                TWR.declareResource(eioe0);
                while(true) {
                    TWR.useResource$NT(eioe0);
                    if(!eioe0.b()) {
                        break;
                    }
                    TWR.useResource$NT(eioe0);
                    String s1 = eioe0.h(3);
                    if(((int)eioe0.f(6)) == 1) {
                        TWR.useResource$NT(eioe0);
                        z = true;
                    }
                    else {
                        TWR.useResource$NT(eioe0);
                        z = false;
                    }
                    TWR.useResource$NT(eioe0);
                    int v = (int)eioe0.f(4);
                    if(v == 1) {
                        TWR.useResource$NT(eioe0);
                        flag0 = new Flag(s1, eioe0.f(5), 0);
                    }
                    else {
                        TWR.useResource$NT(eioe0);
                        switch(v) {
                            case 2: {
                                TWR.useResource$NT(eioe0);
                                if(eioe0.f(5) == 1L) {
                                    TWR.useResource$NT(eioe0);
                                    z1 = true;
                                }
                                else {
                                    TWR.useResource$NT(eioe0);
                                    z1 = false;
                                }
                                TWR.useResource$NT(eioe0);
                                flag0 = new Flag(s1, z1, 0);
                                break;
                            }
                            case 3: {
                                TWR.useResource$NT(eioe0);
                                flag0 = new Flag(s1, eioe0.e(5), 0);
                                break;
                            }
                            case 4: {
                                TWR.useResource$NT(eioe0);
                                flag0 = new Flag(s1, eioe0.h(5), 0);
                                break;
                            }
                            case 5: {
                                TWR.useResource$NT(eioe0);
                                flag0 = new Flag(s1, eioe0.k(5), 0);
                                break;
                            }
                            default: {
                                TWR.useResource$NT(eioe0);
                                throw new IllegalStateException("Found flag override with unknown type: " + s1);
                            }
                        }
                    }
                    TWR.useResource$NT(eioe0);
                    arrayList0.add(new FlagOverride(eioe0.h(0), eioe0.h(1), flag0, z));
                }
            }
            else {
                eioe eioe1 = ((eioh)eiog0).g("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal, packageName, user, committed FROM FlagOverrides WHERE IFNULL(packageName = ?, 1) AND IFNULL(user = ?, 1) AND IFNULL(name = ?, 1)").h(new Object[]{eisc0.a, eisc0.b, eisc0.c}).d().f();
                while(true) {
                    try {
                        if(!eioe1.b()) {
                            break;
                        }
                        String s2 = eioe1.h(7);
                        String s3 = eioe1.h(8);
                        boolean z2 = eioe1.f(9) != 0L;
                        arrayList0.add(new FlagOverride(s2, s3, eiro.d(eioe1), z2));
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(eioe1, throwable1);
                        throw throwable1;
                    }
                }
                eioe1.close();
                eiog0.e();
            }
            flagOverrides0 = new FlagOverrides(arrayList0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(eiog0, throwable0);
            throw throwable0;
        }
        eiog0.close();
        this.a.i(Status.b, flagOverrides0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        FlagOverrides flagOverrides0 = new FlagOverrides(new ArrayList());
        this.a.i(status0, flagOverrides0);
    }
}

