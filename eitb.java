import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import jeb.synthetic.TWR;

public final class eitb {
    String a;
    public final ArrayList b;
    public final ArrayList c;
    public final String d;
    public final Flag[] e;
    public final String f;
    public final eipq g;
    boolean h;

    static {
        bboh.b("SetFlagOverridesOperation", bbcu.al);
    }

    public eitb(String s, String s1, Flag[] arr_flag, String s2, eipq eipq0) {
        this.h = false;
        this.a = s;
        this.d = s1;
        this.e = arr_flag;
        this.f = s2;
        this.g = eipq0;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static boolean a(eiop eiop0, String s, String s1, Flag[] arr_flag, boolean z) {
        Map.Entry map$Entry2;
        long v12;
        long v11;
        Map.Entry map$Entry1;
        long v9;
        long v8;
        int v7;
        boolean z2;
        Long long0;
        eiop eiop1 = eiop0;
        Flag[] arr_flag1 = arr_flag;
        long v = ((eioh)eiop1).g("SELECT IFNULL(MAX(config_package_id), -1) FROM config_packages WHERE name = ?1;").h(new Object[]{s}).b();
        long v1 = ((eioh)eiop1).g("SELECT IFNULL(MAX(account_id), -1) FROM accounts WHERE name = ?1;").h(new Object[]{s1}).b();
        if(v1 == -1L) {
            v1 = eiop1.c("INSERT INTO accounts (name) VALUES (?1);").g(new Object[]{s1}).c();
        }
        long v2 = v1;
        HashMap hashMap0 = new HashMap();
        eioe eioe0 = ((eioh)eiop1).g("WITH UncommittedStates AS (\n  SELECT account_id, MAX(experiment_state_id) AS experiment_state_id\n  FROM experiment_states\n  INNER JOIN config_packages\n    ON (experiment_states.config_package_id = config_packages.config_package_id)\n  WHERE\n    config_packages.name = ?1\n    AND experiment_states.experiment_state_id IS NOT committed_experiment_state_id\n  GROUP BY account_id\n), CommittedState AS (\n  SELECT account_id, committed_experiment_state_id AS experiment_state_id\n  FROM experiment_states\n  INNER JOIN config_packages\n      ON (experiment_state_id IS committed_experiment_state_id)\n  WHERE config_packages.name = ?1\n)\nSELECT\n    account_id,\n    IFNULL(UncommittedStates.experiment_state_id, -1) AS uncommitted_experiment_state_id,\n    IFNULL(CommittedState.experiment_state_id, -1) AS committed_experiment_state_id,\n    accounts.name AS account_name\nFROM accounts\nLEFT OUTER JOIN UncommittedStates\n    USING (account_id)\nLEFT OUTER JOIN CommittedState\n    USING (account_id)\nWHERE accounts.name <> \'*\';\n").h(new Object[]{s}).d().f();
        while(true) {
            try {
                if(!eioe0.b()) {
                    break;
                }
                hashMap0.put(Long.valueOf(eioe0.f(0)), new eita(eioe0.f(1), eioe0.f(2)));
                eioe0.g(3);
                eioe0.f(1);
                eioe0.f(2);
                v = v;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(eioe0, throwable0);
                throw throwable0;
            }
        }
        long v3 = v;
        eioe0.close();
        int v4 = 0;
        boolean z1 = false;
        while(v4 < arr_flag1.length) {
            Flag flag0 = arr_flag1[v4];
            int v5 = flag0.h;
            switch(v5) {
                case 1: {
                    long0 = flag0.b();
                    break;
                }
                case 2: {
                    long0 = (long)(flag0.f() ? 1L : 0L);
                    break;
                }
                case 3: {
                    long0 = flag0.a();
                    break;
                }
                case 4: {
                    long0 = flag0.d();
                    break;
                }
                case 5: {
                    long0 = flag0.g();
                    break;
                }
                default: {
                    throw new eipa(29500, "Unrecognized flag type");
                }
            }
            int v6 = flag0.j;
            if(v6 != 1) {
                v7 = v6;
                z2 = false;
            }
            else if(eiop1.a() >= 0x40BL && !z) {
                z2 = true;
                v7 = 1;
            }
            else {
                z2 = false;
                v7 = 1;
            }
            eiod eiod0 = ((eioh)eiop1).g("    SELECT EXISTS (\n      SELECT NULL\n      FROM flag_overrides\n      WHERE\n        (\n          config_package_id = ?1\n          OR config_package_name IS ?2\n        )\n        AND account_id = ?3\n        AND name = ?4\n        AND type = ?5\n        AND value = ?6\n        AND active IS 1\n    )\n");
            Long long1 = v3;
            Long long2 = v2;
            String s2 = flag0.b;
            Integer integer0 = v5;
            Long long3 = long1;
            if(!eiod0.h(new Object[]{long1, s, long2, s2, integer0, long0}).g() && (!z2 || !((eioh)eiop1).g("    SELECT EXISTS (\n      SELECT NULL\n      FROM flag_overrides\n      WHERE\n        (\n          config_package_id = ?1\n          OR config_package_name IS ?2\n        )\n        AND account_id = ?3\n        AND name = ?4\n        AND type = ?5\n        AND source = 0\n        AND active IS 1\n    )\n").h(new Object[]{long3, s, long2, s2, integer0}).g())) {
                eiop1.c("    UPDATE flag_overrides\n    SET active = NULL\n    WHERE\n      (\n        config_package_id = ?1\n        OR config_package_name IS ?2\n      )\n      AND account_id = ?3\n      AND name = ?4\n      AND active IS 1;\n").g(new Object[]{long3, s, long2, s2}).d();
                if(v3 == -1L) {
                    if(eiop1.a() >= 0x40BL && !z) {
                        eiop1.c("      INSERT INTO flag_overrides (config_package_name, account_id, name, value,\n        type, source)\n      VALUES (?1, ?2, ?3, ?4, ?5, ?6);\n").g(new Object[]{s, long2, s2, long0, integer0, v7}).d();
                    }
                    else {
                        eiop1.c("      INSERT INTO flag_overrides (config_package_name, account_id, name, value,\n        type)\n      VALUES (?1, ?2, ?3, ?4, ?5);\n").g(new Object[]{s, long2, s2, long0, integer0}).d();
                    }
                    v8 = v2;
                    v9 = -1L;
                }
                else {
                    long v10 = eiop1.a() < 0x40BL || z ? eiop1.c("    INSERT INTO flag_overrides (config_package_id, account_id, name, value, type)\n    VALUES (?1, ?2, ?3, ?4, ?5);\n").g(new Object[]{long3, long2, s2, long0, integer0}).c() : eiop1.c("    INSERT INTO flag_overrides (config_package_id, account_id, name, value, type, source)\n    VALUES (?1, ?2, ?3, ?4, ?5, ?6);\n").g(new Object[]{long3, long2, s2, long0, integer0, v7}).c();
                    if(flag0.i == -1000) {
                        for(Object object0: hashMap0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object0;
                            if(((eita)map$Entry0.getValue()).b() != -1L && ((eita)map$Entry0.getValue()).b() != ((eita)map$Entry0.getValue()).a()) {
                                eita eita0 = (eita)map$Entry0.getValue();
                                map$Entry0.getKey();
                                map$Entry1 = map$Entry0;
                                v11 = v10;
                                v12 = v3;
                                eitb.b(eiop1, ((eita)map$Entry0.getValue()).b(), v11, v12, ((Long)map$Entry0.getKey()).longValue());
                            }
                            else {
                                map$Entry1 = map$Entry0;
                                v12 = v3;
                                v11 = v10;
                            }
                            eita eita1 = (eita)map$Entry1.getValue();
                            map$Entry1.getKey();
                            eiop1 = eiop0;
                            long v13 = eitb.b(eiop1, ((eita)map$Entry1.getValue()).a(), v11, v12, ((Long)map$Entry1.getKey()).longValue());
                            if(v13 == -1L) {
                                v3 = v12;
                                map$Entry2 = map$Entry1;
                            }
                            else {
                                v3 = v12;
                                map$Entry2 = map$Entry1;
                                map$Entry2.setValue(new eita(v13, ((eita)map$Entry1.getValue()).a));
                            }
                            if(((eita)map$Entry2.getValue()).a == -1L) {
                                eiop1.c("  INSERT INTO flag_overrides_to_commit (override_id, config_package_id,\n    account_id)\n  VALUES (?1, ?2, ?3);\n").g(new Object[]{v11, v3, map$Entry2.getKey()}).d();
                            }
                            v10 = v11;
                        }
                        v8 = v2;
                        v9 = v3;
                        z1 = true;
                    }
                    else {
                        long v14 = v10;
                        if(s1.equals("*")) {
                            for(Object object1: hashMap0.entrySet()) {
                                long v15 = ((eita)((Map.Entry)object1).getValue()).b();
                                long v16 = (long)(((Long)((Map.Entry)object1).getKey()));
                                Map.Entry map$Entry3 = (Map.Entry)object1;
                                long v17 = eitb.b(eiop1, v15, v14, v3, v16);
                                v14 = v14;
                                if(v17 != -1L) {
                                    map$Entry3.setValue(new eita(v17, ((eita)map$Entry3.getValue()).a));
                                    eitb.c(eiop1, ((eita)map$Entry3.getValue()).a, v17);
                                }
                                v3 = v3;
                            }
                            v8 = v2;
                            v9 = v3;
                        }
                        else {
                            eita eita2 = (eita)hashMap0.get(long2);
                            if(eita2 == null) {
                                v8 = v2;
                                v9 = v3;
                            }
                            else {
                                v9 = v3;
                                v8 = v2;
                                long v18 = eitb.b(eiop1, eita2.b(), v14, v9, v8);
                                if(v18 != -1L) {
                                    hashMap0.put(long2, new eita(v18, eita2.a));
                                    eitb.c(eiop1, eita2.a, v18);
                                }
                            }
                        }
                    }
                }
            }
            else {
                v8 = v2;
                v9 = v3;
            }
            ++v4;
            arr_flag1 = arr_flag;
            v3 = v9;
            v2 = v8;
        }
        return z1;
    }

    private static long b(eiop eiop0, long v, long v1, long v2, long v3) {
        long v4 = -1L;
        if(v == -1L) {
            Long long0 = v3;
            Long long1 = v2;
            long v5 = eiop0.c("INSERT INTO experiment_states (experiment_token, server_token,\n  serving_version, tokens_tag, config_hash, registration_generation,\n  account_id, config_package_id)\nVALUES (NULL, \'\', 0, NULL, 0, 0, ?1, ?2);\n").g(new Object[]{long0, long1}).c();
            Long long2 = v5;
            eiok eiok0 = ((eioh)eiop0).g("SELECT experiment_state_id\nFROM experiment_states\nWHERE\n  config_package_id = ?1\n  AND account_id = ?2\n  AND experiment_state_id IS NOT ?3\nORDER BY experiment_state_id DESC\nLIMIT 1;\n").h(new Object[]{long1, long0, long2}).i();
            if(eiok0 != null) {
                try {
                    eiok0.f(0);
                    eiop0.c("  INSERT INTO experiment_states_to_partitions\n    (experiment_state_id, ordinal, param_partition_id)\n  SELECT ?1, ordinal, param_partition_id\n  FROM experiment_states_to_partitions\n  WHERE experiment_state_id = ?2;\n").g(new Object[]{long2, eiok0.f(0)}).d();
                    eiok0.f(0);
                    eiop0.c("WITH source AS (\n  SELECT experiment_token, server_token, serving_version, tokens_tag, config_hash,\n    registration_generation\n  FROM experiment_states\n  WHERE experiment_state_id = ?1\n)\nUPDATE experiment_states\nSET experiment_token = (SELECT experiment_token FROM source),\n    server_token = (SELECT server_token FROM source),\n    serving_version = (SELECT serving_version FROM source),\n    tokens_tag = (SELECT tokens_tag FROM source),\n    config_hash = (SELECT config_hash FROM source),\n    registration_generation = (SELECT registration_generation FROM source)\nWHERE experiment_state_id = ?2;\n").g(new Object[]{eiok0.f(0), long2}).d();
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(eiok0, throwable0);
                    throw throwable0;
                }
            }
            if(eiok0 != null) {
                eiok0.close();
            }
            v = v5;
            v4 = v;
        }
        eiop0.c("    INSERT INTO experiment_states_to_overrides (experiment_state_id, override_id)\n    VALUES (?1, ?2);\n").g(new Object[]{v, v1}).d();
        return v4;
    }

    private static void c(eiop eiop0, long v, long v1) {
        if(v != -1L && v1 != -1L) {
            try(eioe eioe0 = ((eioh)eiop0).g("SELECT override_id\nFROM experiment_states_to_overrides\nINNER JOIN flag_overrides\n  USING (override_id)\nWHERE\n  experiment_state_id = ?1\n  AND active IS 1;\n").h(new Object[]{v}).f()) {
                while(true) {
                    if(!eioe0.b()) {
                        break;
                    }
                    eioe0.f(0);
                    eiop0.c("    INSERT INTO experiment_states_to_overrides (experiment_state_id, override_id)\n    VALUES (?1, ?2);\n").g(new Object[]{v1, eioe0.f(0)}).d();
                }
            }
        }
    }
}

