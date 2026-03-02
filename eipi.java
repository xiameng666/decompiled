import j..util.Objects;
import java.util.Arrays;
import java.util.Set;
import jeb.synthetic.TWR;

public final class eipi {
    public static final bboh a;

    static {
        eipi.a = bboh.b("PhenotypeDbUpgradeHelper", bbcu.al);
    }

    public static void a(eiop eiop0, Set set0, long v, boolean z, fple fple0, eiph eiph0) {
        long v35;
        byi byi4;
        long v30;
        int v28;
        long v27;
        int v26;
        eioe eioe3;
        boolean z1;
        int v10;
        Throwable throwable4;
        eioe eioe2;
        Long long0;
        long v9;
        String s;
        long v7;
        int v6;
        long v3;
        eioa eioa0 = ((eioh)eiop0).g("SELECT\n  CASE WHEN committed THEN -1 ELSE account_id END,\n  Flags.partitionId,\n  Flags.name,\n  CASE\n    WHEN boolVal NOT NULL THEN boolVal\n    WHEN intVal NOT NULL THEN 2\n    WHEN floatVal NOT NULL THEN 3\n    WHEN stringVal NOT NULL THEN 4\n    ELSE 5\n  END,\n  COALESCE(intVal, floatVal, stringVal, extensionVal)\nFROM Flags\nCROSS JOIN (\n  SELECT\n    accounts.name AS tokenUser,\n    0 as tokenCommitted,\n    account_id,\n    IFNULL(MAX(ExperimentTokens.version), ?2) AS tokenVersion\n  FROM accounts\n  LEFT JOIN ExperimentTokens ON accounts.name = ExperimentTokens.user\n  WHERE\n    ExperimentTokens.packageName = ?1\n      AND\n    ExperimentTokens.version <= ?2\n      AND\n    ExperimentTokens.isCommitted = 0\n  GROUP BY accounts.name\n  UNION ALL\n  SELECT\n    accounts.name AS tokenUser,\n    1 as tokenCommitted,\n    account_id,\n    ApplicationStates.version AS tokenVersion\n  FROM ApplicationStates\n  INNER JOIN accounts ON accounts.name = ApplicationStates.user\n  WHERE ApplicationStates.packageName = ?1\n) AS accounts_tokens_versions\nON (\nFlags.committed = tokenCommitted\nAND\nFlags.user = tokenUser\nAND\nFlags.version = tokenVersion\n)\nWHERE Flags.packageName = ?1;\n").h(new Object[]{eiph0.c, ((long)eiph0.d)}).e(new String[]{"accounts_tokens_versions"}).c();
        while(true) {
            try {
            label_1:
                if(!eioa0.b()) {
                    break;
                }
                long v1 = eioa0.f(0);
                long v2 = eioa0.f(1);
                if(v1 == -1L) {
                    fpky fpky0 = eiph0.f.a(v2).a;
                    gftb.check(fpky0);
                    fpky0.b(eioa0.a);
                    goto label_1;
                }
                fpky fpky1 = eiph0.a(v1).a(v2).a;
                gftb.check(fpky1);
                fpky1.b(eioa0.a);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(eioa0, throwable0);
                throw throwable0;
            }
        }
        eioa0.close();
        try(eioe eioe0 = ((eioh)eiop0).g("SELECT account_id, partitionId, tag\nFROM ApplicationTags\nINNER JOIN accounts ON accounts.name = ApplicationTags.user\nWHERE packageName = ?;\n").h(new Object[]{eiph0.c}).f()) {
            while(true) {
                v3 = 0L;
                if(!eioe0.b()) {
                    break;
                }
                long v4 = eioe0.f(0);
                long v5 = eioe0.f(1);
                eipf eipf0 = eiph0.a(v4).a(v5);
                eipf0.c = eioe0.k(2);
            }
        }
        if(z) {
            eioe eioe1 = ((eioh)eiop0).g("WITH ConvertedOverrides AS (\n  SELECT\n    user,\n    name,\n    CASE\n      WHEN FlagOverrides.intVal NOT NULL THEN 1\n      WHEN FlagOverrides.boolVal NOT NULL THEN 2\n      WHEN FlagOverrides.floatVal NOT NULL THEN 3\n      WHEN FlagOverrides.stringVal NOT NULL THEN 4\n      ELSE 5\n    END AS type,\n    COALESCE(intVal, boolVal, floatVal, stringVal, extensionVal) AS value,\n    IFNULL(committed, 0) AS committed\n  FROM FlagOverrides\n  WHERE packageName = ?1\n),\n/* This bit of SQL aims to get us the unique set of overrides using the matched_committed column to\n   note whether it was committed, uncommitted, or in both.*/\nUniqueOverrides AS (\n  SELECT\n    user,\n    name,\n    type,\n    value,\n    CASE WHEN COUNT(*) > 1 THEN 2 ELSE MAX(committed) = 1 END AS matched_committed\n  FROM ConvertedOverrides\n  WHERE value NOT NULL\n  GROUP BY user, name, type, value\n)\nSELECT\n  matched_committed,\n  account_id,\n  user = \'*\',\n  UniqueOverrides.name,\n  type,\n  value\nFROM UniqueOverrides\nINNER JOIN accounts ON (UniqueOverrides.user = accounts.name);\n").h(new Object[]{eiph0.c}).f();
            while(true) {
                try {
                label_34:
                    if(!eioe1.b()) {
                        break;
                    }
                    v6 = (int)eioe1.f(0);
                    v7 = eioe1.f(1);
                    long v8 = eioe1.f(2);
                    s = eioe1.h(3);
                    v9 = eioe1.f(4);
                    switch(((int)v9)) {
                        case 1: {
                            goto label_50;
                        }
                        case 2: {
                            goto label_55;
                        }
                    }
                }
                catch(Throwable throwable2) {
                    goto label_53;
                }
                try {
                    switch(((int)v9)) {
                        case 3: {
                            long0 = eioe1.e(5);
                            break;
                        }
                        case 4: {
                            long0 = eioe1.h(5);
                            break;
                        }
                        case 5: {
                            long0 = eioe1.k(5);
                            break;
                        }
                        default: {
                            throw new AssertionError();
                        }
                    }
                }
                catch(Throwable throwable3) {
                    goto label_58;
                }
                goto label_61;
                try {
                label_50:
                    long0 = eioe1.f(5);
                    goto label_61;
                }
                catch(Throwable throwable2) {
                label_53:
                    eioe2 = eioe1;
                    goto label_91;
                }
                try {
                label_55:
                    long0 = (long)(eioe1.f(5) == 0L ? 0L : 1L);
                }
                catch(Throwable throwable3) {
                label_58:
                    throwable4 = throwable3;
                    eioe2 = eioe1;
                    goto label_92;
                }
            label_61:
                switch(v6) {
                    case 0: {
                        v10 = 0;
                        z1 = true;
                        eioe3 = eioe1;
                        break;
                    }
                    case 2: {
                        eioe3 = eioe1;
                        v10 = 2;
                        z1 = true;
                        break;
                    }
                    default: {
                        v10 = v6;
                        z1 = false;
                        eioe3 = eioe1;
                    }
                }
                try {
                    eioe2 = eioe3;
                    Objects.requireNonNull(eiph0);
                    eioe2 = eioe3;
                    eipd eipd0 = new eipd(eiph0, v7, s, v9, long0, z1);
                    if(v10 != 0) {
                        eiph0.f.b.add(eipd0);
                    }
                    if(z1) {
                        if(v8 == 0L) {
                            eiph0.a(v7).b.add(eipd0);
                        }
                        else {
                            for(Object object0: set0) {
                                eiph0.a(((Long)object0).longValue()).b.add(eipd0);
                            }
                        }
                    }
                    eioe1 = eioe2;
                    goto label_34;
                }
                catch(Throwable throwable2) {
                }
            label_91:
                throwable4 = throwable2;
                try {
                label_92:
                    eioe2.close();
                }
                catch(Throwable throwable5) {
                    throwable4.addSuppressed(throwable5);
                }
                throw throwable4;
            }
            eioe1.close();
        }
        byi byi0 = eiph0.e;
        int v11 = 0;
        while(v11 < byi0.b()) {
            long v12 = byi0.c(v11);
            eipg eipg0 = (eipg)byi0.f(v11);
            eiod eiod0 = ((eioh)eiop0).g("SELECT IFNULL(MAX(experiment_state_id), -1) FROM experiment_states\nWHERE\nconfig_package_id = ?1\nAND\nexperiment_states.account_id = ?2;\n");
            Long long1 = (long)eiph0.a;
            Long long2 = v12;
            long v13 = eiod0.h(new Object[]{long1, long2}).b();
            if(v13 == -1L) {
                v13 = eiop0.c("INSERT INTO experiment_states (experiment_token, server_token, account_id,\n  config_package_id, serving_version, tokens_tag, config_hash,\n  registration_generation)\nSELECT\n  zeroblob(0) AS experiment_token,\n  \'\' AS server_token,\n  ?2 AS account_id,\n  ?1 AS config_package_id,\n  0 AS serving_version,\n  NULL AS tokens_tag,\n  0 AS config_hash,\n  0 AS registration_generation\n").g(new Object[]{long1, long2}).c();
            }
            eipg0.c = v13;
            byi byi1 = eipg0.a;
            int v14 = 0;
            while(v14 < byi1.b()) {
                long v15 = byi1.c(v14);
                eipf eipf1 = (eipf)byi1.f(v14);
                eipf1.a(fple0);
                eiod eiod1 = ((eioh)eiop0).g("SELECT IFNULL(MAX(param_partition_id), -1)\nFROM param_partitions\nWHERE static_config_package_id = ?1\n  AND param_partitions.tag = ?2\n  AND param_partitions.flags_content = ?3;\n");
                Long long3 = (long)eiph0.b;
                long v16 = eiod1.h(new Object[]{long3, eipf1.c, eipf1.b}).b();
                if(v16 == -1L) {
                    v16 = eiop0.c("INSERT INTO param_partitions (static_config_package_id, tag, flags_content) VALUES (?, ?, ?);\n").g(new Object[]{long3, eipf1.c, eipf1.b}).c();
                    if(eiph0.c.equals(null)) {
                        throw new NullPointerException("Whoops, guess I messed up");
                    }
                }
                eiop0.c("INSERT INTO experiment_states_to_partitions (experiment_state_id, ordinal, param_partition_id)\nVALUES (?, ?, ?);\n").g(new Object[]{v13, v15, v16}).d();
                eipf1.d = v16;
                eipf1.a = null;
                ++v14;
                byi0 = byi0;
                byi1 = byi1;
                v13 = v13;
                v11 = v11;
            }
            bxe bxe0 = new bxe(eipg0.b);
            while(bxe0.hasNext()) {
                Object object1 = bxe0.next();
                long v17 = ((eipd)object1).a(eiop0);
                eiop0.c("INSERT INTO experiment_states_to_overrides(experiment_state_id, override_id) VALUES (?, ?);\n").g(new Object[]{v13, v17}).d();
            }
            ++v11;
            byi0 = byi0;
        }
        eiod eiod2 = ((eioh)eiop0).g("SELECT IFNULL(MAX(account_id), -1)\nFROM ApplicationStates\nINNER JOIN accounts ON accounts.name = user\nWHERE packageName = ?;\n");
        String s1 = eiph0.c;
        long v18 = eiod2.h(new Object[]{s1}).b();
        if(v18 == -1L) {
            long v19 = -1L;
            boolean z2 = false;
            bxe bxe1 = new bxe(eiph0.f.b);
            while(bxe1.hasNext()) {
                Object object2 = bxe1.next();
                long v20 = ((eipd)object2).a;
                if(!set0.contains(Long.valueOf(v20))) {
                    z2 = true;
                    continue;
                }
                else if(v19 == -1L) {
                    v19 = v20;
                    continue;
                }
                else {
                    if(v19 == v20) {
                        continue;
                    }
                    v19 = -1L;
                }
                break;
            }
            if(v19 != -1L) {
                v3 = v19;
            }
            else if(!z2) {
                v3 = -1L;
            }
            v18 = v3;
        }
        eipg eipg1 = eiph0.f;
        bxf bxf0 = eipg1.b;
        bxe bxe2 = new bxe(bxf0);
        while(bxe2.hasNext()) {
            Object object3 = bxe2.next();
            long v21 = ((eipd)object3).a;
            if(v21 != v18 && set0.contains(Long.valueOf(v21))) {
                bxe2.remove();
            }
        }
        if(v18 != -1L) {
            byi byi2 = eipg1.a;
            for(int v22 = 0; v22 < byi2.b(); ++v22) {
                ((eipf)byi2.f(v22)).a(fple0);
            }
            eipg eipg2 = eiph0.a(v18);
            int v23 = 0;
            int v24 = 1;
            while(true) {
                byi byi3 = eipg2.a;
                if(v23 >= byi3.b()) {
                    break;
                }
                long v25 = byi3.c(v23);
                eipf eipf2 = (eipf)byi3.f(v23);
                eipf eipf3 = (eipf)byi2.d(v25);
                if(eipf3 == null) {
                    v26 = v23;
                }
                else {
                    v26 = v23;
                    if(Arrays.equals(eipf2.b, eipf3.b)) {
                        eipf3.c = eipf2.c;
                        v27 = v18;
                        eipf3.d = eipf2.d;
                        v28 = 1;
                        goto label_202;
                    }
                }
                v27 = v18;
                v28 = 0;
            label_202:
                v24 &= v28;
                v23 = v26 + 1;
                v18 = v27;
            }
            if(v24 != 0 && byi3.b() == byi2.b() && eipg2.b.equals(bxf0) && ((eioh)eiop0).g("SELECT EXISTS(\n  SELECT NULL FROM\n  ExperimentTokens AS C\n  INNER JOIN ExperimentTokens AS U\n  USING (\n    packageName, version, user, experimentToken, serverToken, configHash, servingVersion, tokensTag\n  )\n  INNER JOIN ApplicationStates USING (packageName, user, version)\n  WHERE C.isCommitted = 1 AND U.isCommitted = 0 AND C.packageName = ?\n);\n").h(new Object[]{s1}).g()) {
                if(eipg2.c == -1L) {
                    long v29 = ((eioh)eiop0).g("SELECT IFNULL(MAX(experiment_state_id), -1) FROM experiment_states\nWHERE account_id = ?1 AND config_package_id = ?2;\n").h(new Object[]{v18, ((long)eiph0.a)}).b();
                    if(v29 != -1L) {
                        eipg2.c = v29;
                    }
                }
                v30 = eipg2.c;
            }
            else {
                long v31 = eiop0.c("INSERT INTO experiment_states (\n    experiment_state_id,\n    experiment_token,\n    server_token,\n    account_id,\n    config_package_id,\n    serving_version,\n    tokens_tag,\n    config_hash,\n    registration_generation)\nSELECT\n  (SELECT IFNULL(MIN(experiment_state_id) - 1, ?2)\n    FROM experiment_states) AS experiment_state_id,\n  experimentToken AS experiment_token,\n  serverToken AS server_token,\n  account_id,\n  config_package_id,\n  ExperimentTokens.servingVersion AS serving_version,\n  tokensTag AS tokens_tag,\n  configHash AS config_hash,\n  0 AS registration_generation\nFROM ExperimentTokens\nINNER JOIN ApplicationStates USING (packageName, user, version)\nINNER JOIN accounts\nINNER JOIN config_packages\n    ON accounts.name = ExperimentTokens.user\n    AND config_packages.name = ExperimentTokens.packageName\nWHERE ExperimentTokens.isCommitted = 1 AND ExperimentTokens.packageName = ?1;\n").g(new Object[]{s1, v}).c();
                if(v31 == -1L) {
                    v31 = eiop0.c("INSERT INTO experiment_states (\n    experiment_state_id,\n    experiment_token,\n    server_token,\n    account_id,\n    config_package_id,\n    serving_version,\n    tokens_tag,\n    config_hash,\n    registration_generation)\n  SELECT\n    (SELECT IFNULL(MIN(experiment_state_id) - 1, ?2) FROM experiment_states) AS experiment_state_id,\n    NULL AS experiment_token,\n    \'\' AS server_token,\n    ?1 AS account_id,\n    ?2 AS config_package_id,\n    0 AS serving_version,\n    NULL AS tokens_tag,\n    0 AS config_hash,\n    0 AS registration_generation\n").g(new Object[]{v18, ((long)eiph0.a)}).c();
                }
                int v32 = 0;
                while(v32 < byi2.b()) {
                    long v33 = byi2.c(v32);
                    eipf eipf4 = (eipf)byi2.f(v32);
                    long v34 = eipf4.d;
                    if(v34 == -1L) {
                        byi4 = byi2;
                        v35 = v31;
                        v34 = ((eioh)eiop0).g("SELECT IFNULL(MAX(param_partition_id), -1) FROM param_partitions\nWHERE static_config_package_id = ?1 AND flags_content = ?2;\n").h(new Object[]{((long)eiph0.b), eipf4.b}).b();
                        eipf4.d = v34;
                    }
                    else {
                        byi4 = byi2;
                        v35 = v31;
                    }
                    if(v34 == -1L) {
                        eipf4.d = eiop0.c("INSERT INTO param_partitions (static_config_package_id, tag, flags_content)\nVALUES (?1, CAST(?1 AS BLOB), ?2);\n").g(new Object[]{((long)eiph0.b), eipf4.b}).c();
                    }
                    eiop0.c("INSERT INTO experiment_states_to_partitions (experiment_state_id, ordinal, param_partition_id)\nVALUES (?, ?, ?);\n").g(new Object[]{v35, v33, ((long)eipf4.d)}).d();
                    ++v32;
                    v31 = v35;
                    byi2 = byi4;
                }
                bxe bxe3 = new bxe(bxf0);
                while(bxe3.hasNext()) {
                    Object object4 = bxe3.next();
                    long v36 = ((eipd)object4).a(eiop0);
                    eiop0.c("INSERT INTO experiment_states_to_overrides(experiment_state_id, override_id) VALUES (?, ?);\n").g(new Object[]{v31, v36}).d();
                }
                v30 = v31;
            }
            if(v30 != -1L) {
                eiop0.c("UPDATE config_packages SET committed_experiment_state_id = ?1 WHERE name = ?2;\n").g(new Object[]{v30, s1}).d();
            }
        }
    }
}

