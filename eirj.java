import android.os.Trace;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;
import jeb.synthetic.TWR;

public final class eirj {
    public String a;
    public final String b;

    static {
        bboh.b("GetCommittedConfigOp", bbcu.al);
    }

    public eirj(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public static Configurations a(eiog eiog0, String s) {
        TreeSet treeSet0;
        eirn eirn1;
        eirn eirn0;
        Flag[] arr_flag = eirj.c(eiog0, s);
        if(arr_flag == null) {
            eiok eiok1 = ((eioh)eiog0).g("SELECT experimentToken, serverToken, servingVersion FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 1 LIMIT 1").h(new Object[]{s}).i();
            try {
                if(eiok1 == null) {
                    goto label_27;
                }
                else {
                    eirn1 = new eirn(eiok1.k(0), eiok1.h(1), eiok1.f(2));
                    goto label_24;
                }
                goto label_32;
            }
            catch(Throwable throwable1) {
                goto label_30;
            }
        label_24:
            eiok1.close();
            eirn0 = eirn1;
            goto label_32;
            try {
            label_27:
                eirn0 = eirn.a;
            }
            catch(Throwable throwable1) {
            label_30:
                TWR.safeClose$NT(eiok1, throwable1);
                throw throwable1;
            }
        }
        else {
            int v = 0;
            while(v < arr_flag.length) {
                Flag flag0 = arr_flag[v];
                if(flag0.b.equals("__phenotype_server_token") && flag0.h == 4) {
                    eirn0 = new eirn(null, flag0.d(), 0L);
                    goto label_32;
                }
                ++v;
            }
            eiok eiok0 = ((eioh)eiog0).g("SELECT serverToken FROM ExperimentTokens WHERE packageName = ? AND isCommitted = 1 LIMIT 1").h(new Object[]{s}).i();
            try {
                if(eiok0 == null) {
                    goto label_16;
                }
                else {
                    eirn1 = new eirn(null, eiok0.h(0), 0L);
                    goto label_13;
                }
                goto label_32;
            }
            catch(Throwable throwable0) {
                goto label_19;
            }
        label_13:
            eiok0.close();
            eirn0 = eirn1;
            goto label_32;
            try {
            label_16:
                eirn0 = eirn.a;
            }
            catch(Throwable throwable0) {
            label_19:
                TWR.safeClose$NT(eiok0, throwable0);
                throw throwable0;
            }
        }
    label_32:
        treeSet0 = new TreeSet(Flag.a);
        try(eioe eioe0 = ((eioh)eiog0).g("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM Flags WHERE packageName = ? AND committed = 1").h(new Object[]{s}).f()) {
            while(true) {
                if(!eioe0.b()) {
                    break;
                }
                treeSet0.add(eiro.d(eioe0));
            }
        }
        if(arr_flag != null) {
            for(int v1 = 0; v1 < arr_flag.length; ++v1) {
                Flag flag1 = arr_flag[v1];
                treeSet0.remove(flag1);
                treeSet0.add(flag1);
            }
        }
        return eiro.b(treeSet0, Collections.EMPTY_SET, "", eirn0, false);
    }

    public static Configurations b(eiog eiog0, String s, boolean z) {
        Configurations configurations0;
        eioe eioe1;
        ArrayList arrayList1;
        HashMap hashMap0;
        fpkv fpkv0;
        eirn eirn1;
        eirn eirn0;
        String s2;
        eioh eioh1;
        Flag[] arr_flag;
        eioh eioh0;
        String s1;
        eipo.a(eirj.class, "getCommittedOverridesPhixit", s);
        try {
            s1 = z ? "SELECT flag_overrides.name, flag_overrides.type, flag_overrides.value\nFROM flag_overrides\nINNER JOIN config_packages\n  USING (config_package_id)\nWHERE config_packages.name = ?1;\n" : "WITH CommittedOverrides AS (\n  SELECT flag_overrides.name, flag_overrides.type, flag_overrides.value\n  FROM flag_overrides\n  INNER JOIN experiment_states_to_overrides\n    USING (override_id)\n  INNER JOIN config_packages\n    ON experiment_state_id IS committed_experiment_state_id\n  WHERE config_packages.name = ?1\n), OverridesToCommit AS (\n  /* Only consider overrides_to_commit when there is no committed state */\n  SELECT flag_overrides.name, flag_overrides.type, flag_overrides.value\n  FROM flag_overrides\n  INNER JOIN experiment_states_to_overrides\n    USING (override_id)\n  INNER JOIN config_packages\n    USING (config_package_id)\n  INNER JOIN flag_overrides_to_commit\n    ON flag_overrides.config_package_id = flag_overrides_to_commit.config_package_id\n  WHERE\n    config_packages.name = ?1\n    AND config_packages.committed_experiment_state_id IS NULL\n)\nSELECT * FROM CommittedOverrides\nUNION ALL\nSELECT * FROM OverridesToCommit;\n";
            eioh0 = (eioh)eiog0;
            try(eioe eioe0 = eioh0.g(s1).h(new Object[]{s}).f()) {
                if(eioe0.b()) {
                    ArrayList arrayList0 = new ArrayList();
                    do {
                        arrayList0.add(eiro.e(eioe0));
                    }
                    while(eioe0.b());
                    arr_flag = (Flag[])arrayList0.toArray(new Flag[0]);
                    goto label_25;
                }
                else {
                    goto label_27;
                }
            }
            goto label_29;
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
    label_25:
        Trace.endSection();
        goto label_29;
    label_27:
        Trace.endSection();
        arr_flag = null;
    label_29:
        if(arr_flag == null) {
            if(z) {
                eioh1 = (eioh)eiog0;
                s2 = "SELECT experiment_token, server_token, serving_version\nFROM config_packages\nWHERE config_packages.name = ?1;\n";
            }
            else {
                eioh1 = (eioh)eiog0;
                s2 = "SELECT experiment_token, server_token, serving_version\nFROM experiment_states\nINNER JOIN config_packages\n  ON experiment_state_id IS committed_experiment_state_id\nWHERE config_packages.name = ?1;\n";
            }
            eiok eiok1 = eioh1.g(s2).h(new Object[]{s}).i();
            try {
                if(eiok1 == null) {
                    goto label_60;
                }
                else {
                    eirn0 = new eirn(eiok1.j(0), eiok1.h(1), eiok1.f(2));
                    goto label_58;
                }
                goto label_65;
            }
            catch(Throwable throwable3) {
                goto label_63;
            }
        label_58:
            eiok1.close();
            goto label_65;
            try {
            label_60:
                eirn0 = eirn.a;
            }
            catch(Throwable throwable3) {
            label_63:
                TWR.safeClose$NT(eiok1, throwable3);
                throw throwable3;
            }
        }
        else {
            int v = 0;
            while(v < arr_flag.length) {
                Flag flag0 = arr_flag[v];
                if(flag0.b.equals("__phenotype_server_token") && flag0.h == 4) {
                    eirn0 = new eirn(null, flag0.d(), 0L);
                    goto label_65;
                }
                ++v;
            }
            eiok eiok0 = ((eioh)eiog0).g("SELECT server_token\nFROM experiment_states\nINNER JOIN config_packages\n  ON experiment_states.experiment_state_id IS committed_experiment_state_id\nINNER JOIN experiment_states_to_overrides\n  ON experiment_states_to_overrides.experiment_state_id IS committed_experiment_state_id\nINNER JOIN flag_overrides\n  USING (override_id)\nWHERE config_packages.name = ?1 AND flag_overrides.active IS 1\nLIMIT 1;\n").h(new Object[]{s}).i();
            try {
                if(eiok0 == null) {
                    goto label_44;
                }
                else {
                    eirn1 = new eirn(null, eiok0.h(0), 0L);
                    goto label_41;
                }
                goto label_65;
            }
            catch(Throwable throwable2) {
                goto label_47;
            }
        label_41:
            eiok0.close();
            eirn0 = eirn1;
            goto label_65;
            try {
            label_44:
                eirn0 = eirn.a;
            }
            catch(Throwable throwable2) {
            label_47:
                TWR.safeClose$NT(eiok0, throwable2);
                throw throwable2;
            }
        }
        try {
        label_65:
            fpkv0 = new fpkv();
        }
        catch(IOException iOException0) {
            throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
        }
        try {
            hashMap0 = new HashMap();
            if(arr_flag != null) {
                for(int v1 = 0; v1 < arr_flag.length; ++v1) {
                    Flag flag1 = arr_flag[v1];
                    hashMap0.put(flag1.b, flag1);
                }
            }
            eiod eiod0 = z ? ((eioh)eiog0).g("SELECT flags_content\nFROM config_packages\nWHERE config_packages.name = ?1 AND flags_content IS NOT NULL;\n") : ((eioh)eiog0).g("SELECT flags_content\nFROM param_partitions\nINNER JOIN experiment_states_to_partitions\n  USING (param_partition_id)\nINNER JOIN config_packages\n  ON experiment_state_id IS committed_experiment_state_id\nWHERE config_packages.name = ?1;\n");
            arrayList1 = new ArrayList();
            eioe1 = eiod0.h(new Object[]{s}).f();
        }
        catch(Throwable throwable4) {
            goto label_96;
        }
        while(true) {
            try {
                if(!eioe1.b()) {
                    goto label_84;
                }
                arrayList1.add(((fpkx)fpkv0.a(eioe1.k(0), new eiri())));
            }
            catch(Throwable throwable5) {
                try {
                    TWR.safeClose$NT(eioe1, throwable5);
                    throw throwable5;
                label_84:
                    eioe1.close();
                    for(Object object0: eiro.f(fpkx.c(arrayList1))) {
                        Flag flag2 = (Flag)object0;
                        String s3 = flag2.b;
                        if(!hashMap0.containsKey(s3)) {
                            hashMap0.put(s3, flag2);
                        }
                    }
                    configurations0 = new Configurations("", eirn0.c, (hashMap0.isEmpty() ? new Configuration[0] : new Configuration[]{new Configuration(0, ((Flag[])hashMap0.values().toArray(new Flag[0])), new String[0])}), false, eirn0.b, eirn0.d);
                    goto label_98;
                }
                catch(Throwable throwable4) {
                }
                break;
            }
        }
        try {
        label_96:
            TWR.safeClose$NT(fpkv0, throwable4);
            throw throwable4;
        label_98:
            fpkv0.close();
            return configurations0;
        }
        catch(IOException iOException0) {
            throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
        }
    }

    public static Flag[] c(eiog eiog0, String s) {
        Flag[] arr_flag;
        eipo.a(eirj.class, "getCommittedOverrides", s);
        try(eioe eioe0 = eiog0.b("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM FlagOverrides WHERE packageName = ? AND committed = 1").h(new Object[]{s}).f()) {
            if(eioe0.b()) {
                ArrayList arrayList0 = new ArrayList();
                do {
                    arrayList0.add(eiro.d(eioe0));
                }
                while(eioe0.b());
                arr_flag = (Flag[])arrayList0.toArray(new Flag[0]);
            }
            else {
                arr_flag = null;
            }
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
        return arr_flag;
    }
}

