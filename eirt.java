import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import java.io.IOException;

public final class eirt extends eiqt {
    private final eiqg a;
    private final eirv b;

    public eirt(eiqg eiqg0, String s, String s1, int v, String s2) {
        super("GetFlagOperationCall", hlse.n);
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = new eirv(s, s1, v, s2);
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
        Flag flag1;
        eiok eiok2;
        eiok eiok1;
        Flag flag2;
        fpkv fpkv0;
        eioe eioe0;
        eiok eiok0;
        String s2;
        int v;
        Flag flag0;
        eirv eirv0 = this.b;
        if(eirv0.a == null) {
            throw new eipa(29500, "No package name");
        }
        String s = eirv0.b;
        if(s == null) {
            throw new eipa(29500, "No flag name");
        }
        eiog eiog0 = eiox0.a().a();
        try {
            eirv0.a = eipn.c(eirv0.a, eirv0.d);
            String s1 = eiog0.f() ? "SELECT EXISTS (SELECT NULL FROM config_packages WHERE name = ?1);" : "SELECT EXISTS(SELECT NULL FROM Packages WHERE packageName=?)";
            flag0 = null;
            if(!((eioh)eiog0).g(s1).h(new Object[]{eirv0.a}).g()) {
                throw new eipa(0x733F);
            }
            if(eiog0.f()) {
                v = 1;
                eiod eiod0 = ((eioh)eiog0).g("SELECT\n  flag_overrides.name AS override_name,\n  flag_overrides.type AS override_type,\n  flag_overrides.value AS override_value\nFROM flag_overrides\nINNER JOIN experiment_states_to_overrides\n  USING (override_id)\nINNER JOIN experiment_states\n  USING (experiment_state_id)\nINNER JOIN config_packages\n  ON committed_experiment_state_id IS experiment_state_id\nWHERE\n  config_packages.name = ?1\n  AND flag_overrides.name = ?2\nLIMIT 1;\n");
                s2 = eirv0.b;
                eiok0 = eiod0.h(new Object[]{eirv0.a, s2}).i();
                goto label_18;
            }
            else {
                goto label_96;
            }
            goto label_119;
        }
        catch(Throwable throwable0) {
            goto label_122;
        }
    label_18:
        if(eiok0 == null) {
            try {
                eioe0 = ((eioh)eiog0).g("SELECT flags_content\nFROM param_partitions\nINNER JOIN experiment_states_to_partitions\n  USING (param_partition_id)\nINNER JOIN experiment_states\n  USING (experiment_state_id)\nINNER JOIN config_packages\n  ON experiment_state_id IS committed_experiment_state_id\nINNER JOIN accounts\n  USING (account_id)\nWHERE config_packages.name = ?1;\n").h(new Object[]{eirv0.a}).f();
            }
            catch(IOException iOException0) {
                throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
            }
            catch(Throwable throwable0) {
                goto label_122;
            }
            try {
                fpkv0 = new fpkv();
            }
            catch(Throwable throwable3) {
                goto label_87;
            }
            while(true) {
                try {
                    if(!eioe0.b()) {
                        goto label_84;
                    }
                    ggqk ggqk0 = ((gged_interceptors)fpkv0.a(eioe0.k(0), new eiru())).E();
                    while(true) {
                        if(!ggqk0.hasNext()) {
                            break;
                        }
                        Object object0 = ggqk0.next();
                        goap goap0 = (goap)object0;
                        if(!goap0.c.equals(s2)) {
                            continue;
                        }
                        int v1 = goap0.i;
                        int v2 = goao.a(v1);
                        if(v2 == 0) {
                            v2 = 1;
                        }
                        switch(v2 - 1) {
                            case 1: {
                                flag2 = new Flag(s2, goap0.d, 0);
                                break;
                            }
                            case 2: {
                                flag2 = new Flag(s2, goap0.e, 0);
                                break;
                            }
                            case 3: {
                                flag2 = new Flag(s2, goap0.f, 0);
                                break;
                            }
                            case 4: {
                                flag2 = new Flag(s2, goap0.g, 0);
                                break;
                            }
                            case 5: {
                                goam goam0 = goap0.h;
                                if(goam0 == null) {
                                    goam0 = goam.a;
                                }
                                flag2 = new Flag(s2, goam0.c.toByteArray(), 0);
                                break;
                            }
                            default: {
                                int v3 = goao.a(v1);
                                if(v3 != 0) {
                                    v = v3;
                                }
                                throw new IllegalArgumentException("Unrecognized flag value type " + (v - 1));
                            }
                        }
                        flag0 = flag2;
                        goto label_84;
                    }
                }
                catch(Throwable throwable4) {
                    try {
                        fpkv0.close();
                        throw throwable4;
                    }
                    catch(Throwable throwable5) {
                        try {
                            throwable4.addSuppressed(throwable5);
                            throw throwable4;
                        label_84:
                            fpkv0.close();
                            goto label_92;
                        }
                        catch(Throwable throwable3) {
                        }
                        break;
                    }
                }
            }
            try {
            label_87:
                eioe0.close();
                throw throwable3;
            }
            catch(Throwable throwable6) {
                try {
                    try {
                        throwable3.addSuppressed(throwable6);
                        throw throwable3;
                    label_92:
                        eioe0.close();
                        goto label_119;
                    }
                    catch(IOException iOException0) {
                        throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
                    }
                label_96:
                    eiok1 = ((eioh)eiog0).g("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM FlagOverrides WHERE packageName = ? AND name = ? AND flagType = ? AND committed = 1 LIMIT 1").h(new Object[]{eirv0.a, s, ((int)eirv0.c)}).i();
                }
                catch(Throwable throwable0) {
                    goto label_122;
                }
            }
            if(eiok1 == null) {
                eiok2 = ((eioh)eiog0).g("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM Flags WHERE packageName = ? AND name = ? AND flagType = ? AND committed = 1 LIMIT 1").h(new Object[]{eirv0.a, eirv0.b, ((int)eirv0.c)}).i();
                if(eiok2 != null) {
                    try {
                        flag0 = eiro.d(eiok2);
                        goto label_118;
                    }
                    catch(Throwable throwable9) {
                        try {
                            eiok2.close();
                            throw throwable9;
                        }
                        catch(Throwable throwable10) {
                            try {
                                throwable9.addSuppressed(throwable10);
                                throw throwable9;
                            label_118:
                                eiok2.close();
                            label_119:
                                eiog0.e();
                                goto label_127;
                            }
                            catch(Throwable throwable0) {
                            }
                            goto label_122;
                        }
                    }
                }
            }
            else {
                try {
                    flag0 = eiro.d(eiok1);
                    goto label_106;
                }
                catch(Throwable throwable7) {
                    try {
                        eiok1.close();
                        throw throwable7;
                    }
                    catch(Throwable throwable8) {
                        try {
                            throwable7.addSuppressed(throwable8);
                            throw throwable7;
                        label_106:
                            eiok1.close();
                        }
                        catch(Throwable throwable0) {
                            goto label_122;
                        }
                    }
                }
            }
        }
        else {
            try {
                switch(((int)eiok0.f(1))) {
                    case 1: {
                        flag1 = new Flag(eiok0.h(0), eiok0.f(2), 0);
                        goto label_43;
                    }
                    case 2: {
                        String s3 = eirv0.b;
                        if(eiok0.f(2) != 1L) {
                            v = 0;
                        }
                        flag1 = new Flag(s3, ((boolean)v), 0);
                        goto label_43;
                    }
                    case 3: {
                        double f = eiok0.e(2);
                        flag1 = new Flag(eirv0.b, f, 0);
                        goto label_43;
                    }
                    case 4: {
                        String s4 = eiok0.h(2);
                        flag1 = new Flag(eirv0.b, s4, 0);
                        goto label_43;
                    }
                    case 5: {
                        byte[] arr_b = eiok0.k(2);
                        flag1 = new Flag(eirv0.b, arr_b, 0);
                        goto label_43;
                    }
                    default: {
                        throw new IllegalStateException("Found flag override with unknown type: " + eirv0.b);
                    }
                }
            }
            catch(Throwable throwable1) {
                try {
                    eiok0.close();
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    try {
                        throwable1.addSuppressed(throwable2);
                        throw throwable1;
                    label_43:
                        flag0 = flag1;
                        eiok0.close();
                    }
                    catch(Throwable throwable0) {
                        goto label_122;
                    }
                }
            }
        }
        goto label_119;
        try {
        label_122:
            eiog0.close();
        }
        catch(Throwable throwable11) {
            throwable0.addSuppressed(throwable11);
        }
        throw throwable0;
    label_127:
        eiog0.close();
        this.a.g(Status.b, flag0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.g(status0, null);
    }
}

