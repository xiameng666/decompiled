import android.content.Context;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import jeb.synthetic.TWR;

public final class eiro {
    public final String a;
    public static final int b;
    private static final bboh c;
    private static final Flag[] d;
    private static final String[] e;
    private static final Configurations f;
    private final String g;
    private final String h;
    private eiog i;

    static {
        eiro.c = bboh.b("GetConfigSnapshotOp", bbcu.al);
        eiro.d = new Flag[0];
        eiro.e = new String[0];
        eiro.f = new Configurations("", "", new Configuration[0], false, null, 0L);
    }

    public eiro(String s, String s1, String s2, eiog eiog0) {
        this.i = null;
        this.a = eipn.c(s, s2);
        this.g = s1;
        this.h = null;
        this.i = eiog0;
    }

    public eiro(String s, String s1, String s2, String s3) {
        this.i = null;
        this.a = eipn.c(s, s3);
        this.g = s1;
        this.h = s2;
    }

    public static int a(eiog eiog0, String s, String s1) {
        long v1;
        eiok eiok1;
        long v;
        Class class0 = eiro.class;
        eipo.a(class0, "getVersion_packageVersion", s);
        try(eiok eiok0 = eiog0.b("SELECT version FROM Packages WHERE packageName = ?").h(new Object[]{s}).i()) {
            if(eiok0 == null) {
                TWR.useResource$NT(null);
                throw new eipa(0x733F);
            }
            v = eiok0.f(0);
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
        eipo.a(class0, "getVersion_tokenVersion", s);
        try {
            eiok1 = eiog0.b("SELECT version FROM ExperimentTokens WHERE packageName = ? AND version <= ? AND user = ? AND isCommitted = 0 ORDER BY version DESC LIMIT 1").h(new Object[]{s, ((int)v), s1}).i();
        }
        catch(Throwable throwable2) {
            goto label_28;
        }
        if(eiok1 != null) {
            try {
                v1 = eiok1.f(0);
                goto label_25;
            }
            catch(Throwable throwable3) {
                try {
                    TWR.safeClose$NT(eiok1, throwable3);
                    throw throwable3;
                label_25:
                    eiok1.close();
                    goto label_33;
                }
                catch(Throwable throwable2) {
                }
            }
            try {
            label_28:
                Trace.endSection();
            }
            catch(Throwable throwable4) {
                throwable2.addSuppressed(throwable4);
            }
            throw throwable2;
        label_33:
            Trace.endSection();
            return (int)v1;
        }
        Trace.endSection();
        return (int)v;
    }

    static Configurations b(Set set0, Set set1, String s, eirn eirn0, boolean z) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: set0) {
            eiqu.a(hashMap0, Integer.valueOf(((Flag)object0).i), ((Flag)object0));
        }
        HashMap hashMap1 = new HashMap();
        for(Object object1: set1) {
            eiqu.a(hashMap1, Integer.valueOf(((Flag)object1).i), ((Flag)object1));
        }
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(hashMap0.keySet());
        hashSet0.addAll(hashMap1.keySet());
        for(Object object2: hashSet0) {
            Collection collection0 = (Collection)hashMap0.get(((Integer)object2));
            Collection collection1 = (Collection)hashMap1.get(((Integer)object2));
            Flag[] arr_flag = collection0 == null ? eiro.d : ((Flag[])collection0.toArray(new Flag[collection0.size()]));
            String[] arr_s = eiro.e;
            if(collection1 != null) {
                arr_s = new String[collection1.size()];
                int v = 0;
                for(Object object3: collection1) {
                    arr_s[v] = ((Flag)object3).b;
                    ++v;
                }
            }
            arrayList0.add(new Configuration(((int)(((Integer)object2))), arr_flag, arr_s));
        }
        return new Configurations(s, eirn0.c, ((Configuration[])arrayList0.toArray(new Configuration[arrayList0.size()])), z, eirn0.b, eirn0.d);
    }

    public final Configurations c(Context context0, eiox eiox0) {
        Configurations configurations0;
        String s = this.a;
        if(s == null) {
            throw new eipa(29500, "No source package");
        }
        String s1 = this.g;
        if(s1 == null) {
            throw new eipa(29500, "No user");
        }
        if(!s1.equals("") && !eipt.a(s1, context0)) {
            throw new eipa(29500, "Invalid user");
        }
        if(eiro.h(s) && !s1.equals("")) {
            throw new eipa(29500, "Can\'t commit to " + this.g + " for direct boot aware package " + this.a);
        }
        try {
            eiog eiog0 = this.i;
            if(eiog0 != null) {
                return eiog0.f() ? this.k(this.i) : this.j(this.i);
            }
            eipo.a(eiro.class, "transaction", s);
        }
        catch(eipa eipa0) {
            goto label_35;
        }
        try {
            eior eior0 = eiox0.a();
            eior.d(eior0.c);
            try(eioh eioh0 = new eioh(eior0, false, false)) {
                configurations0 = eioh0.f() ? this.k(eioh0) : this.j(eioh0);
                eioh0.e();
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
                throw throwable0;
            }
            catch(Throwable throwable1) {
                try {
                    throwable0.addSuppressed(throwable1);
                    throw throwable0;
                label_32:
                    Trace.endSection();
                    return configurations0;
                }
                catch(eipa eipa0) {
                }
            }
        }
    label_35:
        if(eipa0.a != 0x733F) {
            throw eipa0;
        }
        ((ggtj)eiro.c.j()).B("Succeeded but not registered: %s", new gpnd(gpnc.b, this.a));
        return eiro.f;
    }

    static Flag d(eioi eioi0) {
        boolean z = false;
        int v = (int)eioi0.f(0);
        String s = eioi0.h(1);
        if(!eioi0.i(2)) {
            return new Flag(s, eioi0.f(2), v);
        }
        if(!eioi0.i(3)) {
            if(eioi0.f(3) != 0L) {
                z = true;
            }
            return new Flag(s, z, v);
        }
        if(!eioi0.i(4)) {
            return new Flag(s, eioi0.e(4), v);
        }
        if(!eioi0.i(5)) {
            return new Flag(s, eioi0.h(5), v);
        }
        if(!eioi0.i(6)) {
            return new Flag(s, eioi0.k(6), v);
        }
        throw new IllegalStateException("Flag without value: " + s);
    }

    static Flag e(eioe eioe0) {
        String s = eioe0.h(0);
        boolean z = true;
        switch(((int)eioe0.f(1))) {
            case 1: {
                return new Flag(eioe0.h(0), eioe0.f(2), 0);
            }
            case 2: {
                if(eioe0.f(2) != 1L) {
                    z = false;
                }
                return new Flag(s, z, 0);
            }
            case 3: {
                return new Flag(eioe0.h(0), eioe0.e(2), 0);
            }
            case 4: {
                return new Flag(eioe0.h(0), eioe0.h(2), 0);
            }
            case 5: {
                return new Flag(eioe0.h(0), eioe0.k(2), 0);
            }
            default: {
                throw new IllegalStateException("Unrecognized flag value type " + eioe0.f(1) + " for flag name " + eioe0.g(0));
            }
        }
    }

    public static List f(fpkx fpkx0) {
        List list0 = new ArrayList();
        ggqj ggqj0 = fpkx0.b.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            fpkw fpkw0 = (fpkw)object0;
            int v = fpkw0.c;
            switch(v) {
                case 0: {
                    list0.add(new Flag(fpkw0.h(), false, 0));
                    break;
                }
                case 1: {
                    list0.add(new Flag(fpkw0.h(), true, 0));
                    break;
                }
                case 2: {
                    list0.add(new Flag(fpkw0.h(), fpkw0.c(), 0));
                    break;
                }
                case 3: {
                    list0.add(new Flag(fpkw0.h(), fpkw0.a(), 0));
                    break;
                }
                case 4: {
                    list0.add(new Flag(fpkw0.h(), fpkw0.g(), 0));
                    break;
                }
                case 5: {
                    if((fpkw0.e() instanceof byte[])) {
                        list0.add(new Flag(fpkw0.h(), ((byte[])fpkw0.e()), 0));
                    }
                    else {
                        list0.add(new Flag(fpkw0.h(), ((ByteString)fpkw0.e()).toByteArray(), 0));
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException("Unrecognized flag value type " + v);
                }
            }
        }
        return list0;
    }

    public static Map g(eiog eiog0, String s, long v) {
        if(v == -1L) {
            return new HashMap();
        }
        Map map0 = new HashMap();
        eipo.a(eiro.class, "getActiveOverridesPhixit", s);
        try(eioe eioe0 = eiog0.b("WITH UserOverrides AS (\n  SELECT flag_overrides.name, flag_overrides.type, flag_overrides.value\n  FROM flag_overrides\n  INNER JOIN experiment_states_to_overrides\n    USING (override_id)\n  INNER JOIN accounts\n    USING (account_id)\n  WHERE\n    experiment_state_id = ?1\n    AND active IS 1\n    AND accounts.name <> \'*\'\n), StarOverrides AS (\n  SELECT flag_overrides.name, flag_overrides.type, flag_overrides.value\n  FROM flag_overrides\n  INNER JOIN experiment_states_to_overrides\n    USING (override_id)\n  INNER JOIN accounts\n    USING (account_id)\n  WHERE\n    experiment_state_id = ?1\n    AND active IS 1\n    AND accounts.name = \'*\'\n    /* Exclude star override if there is a user override with the same name. */\n    AND NOT EXISTS (\n      SELECT NULL FROM UserOverrides WHERE UserOverrides.name = flag_overrides.name)\n)\nSELECT * FROM StarOverrides\nUNION ALL\nSELECT * FROM UserOverrides;\n").h(new Object[]{v}).e(new String[]{"UserOverrides"}).f()) {
            while(true) {
                if(!eioe0.b()) {
                    break;
                }
                Flag flag0 = eiro.e(eioe0);
                map0.put(flag0.b, flag0);
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
        return map0;
    }

    public static boolean h(String s) {
        return hxkp.b().b.contains(s);
    }

    static Flag[] i(eiog eiog0, String s, String s1) {
        Flag[] arr_flag;
        boolean z1;
        eioe eioe1;
        eioe eioe0;
        Class class0 = eiro.class;
        eipo.a(class0, "getUncommittedOverrides_allOverrides", s);
        try {
            if(eiog0.b("SELECT EXISTS(SELECT NULL FROM FlagOverrides)").d().g()) {
                goto label_10;
            }
            goto label_61;
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
    label_10:
        Trace.endSection();
        eipo.a(class0, "getUncommittedOverrides_uncommittedOverridesAllUsers", s);
        try {
            eioe0 = eiog0.b("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM FlagOverrides WHERE packageName = ? AND user = \'*\' AND committed = 0").h(new Object[]{s}).f();
        }
        catch(Throwable throwable2) {
            goto label_54;
        }
        try {
            eipo.a(class0, "getUncommittedOverrides_uncommittedOverridesForUser", s);
        }
        catch(Throwable throwable3) {
            goto label_49;
        }
        try(eioe1 = eiog0.b("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM FlagOverrides WHERE packageName = ? AND user = ? AND committed = 0").h(new Object[]{s, s1}).f()) {
            boolean z = eioe0.b();
            z1 = eioe1.b();
            if(!z) {
                goto label_20;
            }
            goto label_26;
        }
        catch(Throwable throwable4) {
            goto label_41;
        }
    label_20:
        if(!z1) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable3) {
                goto label_49;
            }
            try {
                eioe0.close();
            }
            catch(Throwable throwable2) {
                goto label_54;
            }
            Trace.endSection();
            return null;
        }
        z1 = true;
        try {
        label_26:
            TWR.useResource$NT(eioe1);
            ArrayList arrayList0 = new ArrayList();
            if(z) {
                while(true) {
                    TWR.useResource$NT(eioe1);
                    arrayList0.add(eiro.d(eioe0));
                    if(eioe0.b()) {
                        continue;
                    }
                    goto label_32;
                }
            }
            else {
            label_32:
                TWR.useResource$NT(eioe1);
                if(z1) {
                    while(true) {
                        TWR.useResource$NT(eioe1);
                        arrayList0.add(eiro.d(eioe1));
                        if(eioe1.b()) {
                            continue;
                        }
                        goto label_37;
                    }
                }
                else {
                label_37:
                    TWR.useResource$NT(eioe1);
                    arr_flag = (Flag[])arrayList0.toArray(new Flag[0]);
                }
            }
            goto label_46;
        }
        catch(Throwable throwable4) {
            try {
            label_41:
                Trace.endSection();
                throw throwable4;
            }
            catch(Throwable throwable5) {
                try {
                    throwable4.addSuppressed(throwable5);
                    throw throwable4;
                label_46:
                    Trace.endSection();
                    goto label_51;
                }
                catch(Throwable throwable3) {
                }
            }
        }
        try {
        label_49:
            TWR.safeClose$NT(eioe0, throwable3);
            throw throwable3;
        label_51:
            eioe0.close();
        }
        catch(Throwable throwable2) {
            try {
            label_54:
                Trace.endSection();
            }
            catch(Throwable throwable6) {
                throwable2.addSuppressed(throwable6);
            }
            throw throwable2;
        }
        Trace.endSection();
        return arr_flag;
    label_61:
        Trace.endSection();
        return null;
    }

    private final Configurations j(eiog eiog0) {
        Configurations configurations2;
        TreeSet treeSet6;
        String s9;
        TreeSet treeSet5;
        Comparator comparator1;
        Configurations configurations1;
        TreeSet treeSet4;
        Configurations configurations0;
        TreeSet treeSet3;
        TreeSet treeSet2;
        int v2;
        TreeSet treeSet1;
        Comparator comparator0;
        TreeSet treeSet0;
        Integer integer0;
        String s8;
        boolean z;
        String s5;
        Pair pair1;
        Pair pair0;
        eiok eiok2;
        eirn eirn1;
        eiok eiok0;
        eirn eirn0;
        eiok eiok1;
        String s = this.a;
        String s1 = this.g;
        int v = eiro.a(eiog0, s, s1);
        Flag[] arr_flag = eiro.i(eiog0, s, s1);
        String s2 = null;
        Class class0 = eiro.class;
        if(arr_flag == null) {
            eipo.a(class0, "getUncommittedTokens_tokens", this.a);
            try {
                eiok1 = eiog0.b("SELECT experimentToken,serverToken,servingVersion FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").h(new Object[]{this.a, v, this.g}).i();
            }
            catch(Throwable throwable3) {
                goto label_46;
            }
            try {
                if(eiok1 == null) {
                    goto label_40;
                }
                else {
                    eirn1 = new eirn(eiok1.j(0), eiok1.h(1), eiok1.f(2));
                    goto label_36;
                }
                goto label_52;
            }
            catch(Throwable throwable4) {
                goto label_43;
            }
            try {
            label_36:
                eiok1.close();
            }
            catch(Throwable throwable3) {
                goto label_46;
            }
        label_37:
            Trace.endSection();
            eirn0 = eirn1;
            goto label_52;
            try {
            label_40:
                eirn0 = eirn.a;
                goto label_51;
            }
            catch(Throwable throwable4) {
                try {
                label_43:
                    TWR.safeClose$NT(eiok1, throwable4);
                    throw throwable4;
                }
                catch(Throwable throwable3) {
                }
            }
            try {
            label_46:
                Trace.endSection();
            }
            catch(Throwable throwable5) {
                throwable3.addSuppressed(throwable5);
            }
            throw throwable3;
        label_51:
            Trace.endSection();
        }
        else {
            int v1 = 0;
            while(v1 < arr_flag.length) {
                Flag flag0 = arr_flag[v1];
                if(flag0.b.equals("__phenotype_server_token") && flag0.h == 4) {
                    eirn0 = new eirn(null, flag0.d(), 0L);
                    goto label_52;
                }
                ++v1;
            }
            eipo.a(class0, "getUncommittedTokens_serverToken", s);
            try {
                eiok0 = eiog0.b("SELECT serverToken FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").h(new Object[]{s, v, s1}).i();
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
            try {
                if(eiok0 == null) {
                    goto label_21;
                }
                else {
                    eirn1 = new eirn(null, eiok0.h(0), 0L);
                    goto label_19;
                }
                goto label_52;
            }
            catch(Throwable throwable1) {
                goto label_24;
            }
            try {
            label_19:
                eiok0.close();
                goto label_37;
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
            try {
            label_21:
                eirn0 = eirn.a;
                goto label_51;
            }
            catch(Throwable throwable1) {
                try {
                label_24:
                    TWR.safeClose$NT(eiok0, throwable1);
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                }
            }
            try {
            label_27:
                Trace.endSection();
            }
            catch(Throwable throwable2) {
                throwable0.addSuppressed(throwable2);
            }
            throw throwable0;
        }
    label_52:
        eipo.a(class0, "getCommittedUserAndVersion", this.a);
        try {
            eiok2 = eiog0.b("SELECT user, version FROM ApplicationStates WHERE packageName = ?").h(new Object[]{this.a}).i();
        }
        catch(Throwable throwable6) {
            goto label_63;
        }
        if(eiok2 == null) {
            Trace.endSection();
            pair1 = null;
        }
        else {
            try {
                pair0 = Pair.create(eiok2.h(0), Integer.valueOf(((int)eiok2.f(1))));
                goto label_60;
            }
            catch(Throwable throwable7) {
                try {
                    TWR.safeClose$NT(eiok2, throwable7);
                    throw throwable7;
                label_60:
                    eiok2.close();
                    goto label_68;
                }
                catch(Throwable throwable6) {
                }
            }
            try {
            label_63:
                Trace.endSection();
            }
            catch(Throwable throwable8) {
                throwable6.addSuppressed(throwable8);
            }
            throw throwable6;
        label_68:
            Trace.endSection();
            pair1 = pair0;
        }
        String s3 = this.a;
        if(pair1 != null) {
            s2 = eitf.b(eiog0, s3, ((Integer)pair1.second).intValue(), ((String)pair1.first), true);
        }
        String s4 = this.h;
        eite eite0 = eitf.a(s4, eiog0);
        if(arr_flag == null && (eite0 == null ? "!" : eite0.e).equals(s2)) {
            s5 = s2;
            z = true;
        }
        else {
            s5 = s2;
            z = false;
        }
        String s6 = this.g;
        String s7 = eitf.c(s6, s3, gfta.b(s5), v, eitf.b(eiog0, s3, v, s6, false), einw.a(eiog0, s3), z);
        if(z) {
            gftb.check(pair1);
            gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/service/operations/GetConfigurationSnapshotOperation", "getDeltaConfigurations", 0x4C6, "Get delta configuration");
            try {
                s8 = (String)pair1.first;
                integer0 = (Integer)pair1.second;
                treeSet0 = new TreeSet();
                comparator0 = Flag.a;
                treeSet1 = new TreeSet(comparator0);
                Flag[] arr_flag1 = eirj.c(eiog0, s3);
                if(arr_flag1 == null) {
                    v2 = v;
                }
                else {
                    v2 = v;
                    for(int v3 = 0; v3 < arr_flag1.length; ++v3) {
                        Flag flag1 = arr_flag1[v3];
                        treeSet0.add(flag1);
                        treeSet1.add(flag1);
                    }
                }
                eipo.a(class0, "getDeltaConfigurations_committedFlags", s3);
            }
            catch(Throwable throwable9) {
                goto label_149;
            }
            try(eioe eioe0 = eiog0.b("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 1 ORDER BY name").h(new Object[]{s3, integer0, s8}).f()) {
                while(true) {
                    if(!eioe0.b()) {
                        goto label_124;
                    }
                    Flag flag2 = eiro.d(eioe0);
                    if(!treeSet1.contains(flag2)) {
                        treeSet0.add(flag2);
                        treeSet1.add(flag2);
                    }
                }
            }
            catch(Throwable throwable10) {
                try {
                    Trace.endSection();
                    throw throwable10;
                }
                catch(Throwable throwable11) {
                    try {
                        throwable10.addSuppressed(throwable11);
                        throw throwable10;
                    label_124:
                        Trace.endSection();
                        treeSet2 = new TreeSet();
                        treeSet3 = new TreeSet(comparator0);
                        eipo.a(class0, "getDeltaConfigurations_pendingFlags", s3);
                    }
                    catch(Throwable throwable9) {
                        goto label_149;
                    }
                }
            }
            try(eioe eioe1 = eiog0.b("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 0 ORDER BY name").h(new Object[]{s3, v2, s6}).f()) {
                while(true) {
                    if(!eioe1.b()) {
                        goto label_143;
                    }
                    Flag flag3 = eiro.d(eioe1);
                    treeSet2.add(flag3);
                    treeSet3.add(flag3);
                }
            }
            catch(Throwable throwable12) {
                try {
                    Trace.endSection();
                    throw throwable12;
                }
                catch(Throwable throwable13) {
                    try {
                        throwable12.addSuppressed(throwable13);
                        throw throwable12;
                    label_143:
                        Trace.endSection();
                        treeSet2.removeAll(treeSet0);
                        treeSet1.removeAll(treeSet3);
                        configurations0 = eiro.b(treeSet2, treeSet1, s7, eirn0, true);
                        goto label_151;
                    }
                    catch(Throwable throwable9) {
                    }
                }
            }
        label_149:
            TWR.safeClose$NT(gdqb0, throwable9);
            throw throwable9;
        label_151:
            gdqb0.close();
            return configurations0;
        }
        if(s4 == null) {
            gdqb gdqb1 = gdsp.e("com/google/android/gms/phenotype/service/operations/GetConfigurationSnapshotOperation", "getFullConfigurationsOnly", 0x552, "Get full configuration");
            try {
                treeSet4 = new TreeSet(Flag.a);
                eipo.a(class0, "getFullConfigurations_userFlags", this.a);
            }
            catch(Throwable throwable14) {
                goto label_195;
            }
            try(eioe eioe2 = eiog0.b("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 0 ORDER BY name").h(new Object[]{this.a, v, this.g}).f()) {
                while(true) {
                    if(!eioe2.b()) {
                        goto label_170;
                    }
                    treeSet4.add(eiro.d(eioe2));
                }
            }
            catch(Throwable throwable15) {
                try {
                    Trace.endSection();
                    throw throwable15;
                }
                catch(Throwable throwable16) {
                    try {
                        throwable15.addSuppressed(throwable16);
                        throw throwable15;
                    label_170:
                        Trace.endSection();
                        if(arr_flag != null) {
                            for(int v4 = 0; v4 < arr_flag.length; ++v4) {
                                Flag flag4 = arr_flag[v4];
                                treeSet4.remove(flag4);
                                treeSet4.add(flag4);
                            }
                        }
                        HashMap hashMap0 = new HashMap();
                        for(Object object0: treeSet4) {
                            eiqu.a(hashMap0, Integer.valueOf(((Flag)object0).i), ((Flag)object0));
                        }
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object1: hashMap0.keySet()) {
                            List list0 = (List)hashMap0.get(((Integer)object1));
                            arrayList0.add(new Configuration(((int)(((Integer)object1))), (list0 == null ? eiro.d : ((Flag[])list0.toArray(new Flag[0]))), eiro.e));
                        }
                        configurations1 = new Configurations(s7, eirn0.c, ((Configuration[])arrayList0.toArray(new Configuration[arrayList0.size()])), false, eirn0.b, eirn0.d);
                        goto label_197;
                    }
                    catch(Throwable throwable14) {
                    }
                }
            }
        label_195:
            TWR.safeClose$NT(gdqb1, throwable14);
            throw throwable14;
        label_197:
            gdqb1.close();
            return configurations1;
        }
        gdqb gdqb2 = gdsp.e("com/google/android/gms/phenotype/service/operations/GetConfigurationSnapshotOperation", "getFullConfigurationsWithDeleted", 1303, "Get delta config with unmatched base");
        try {
            comparator1 = Flag.a;
            treeSet5 = new TreeSet(comparator1);
            s9 = this.a;
            eipo.a(class0, "getFullConfigurations_flags", s9);
        }
        catch(Throwable throwable17) {
            goto label_248;
        }
        try(eioe eioe3 = eiog0.b("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM Flags WHERE packageName = ?").h(new Object[]{s9}).f()) {
            while(true) {
                if(!eioe3.b()) {
                    goto label_217;
                }
                treeSet5.add(eiro.d(eioe3));
            }
        }
        catch(Throwable throwable18) {
            try {
                Trace.endSection();
                throw throwable18;
            }
            catch(Throwable throwable19) {
                try {
                    throwable18.addSuppressed(throwable19);
                    throw throwable18;
                label_217:
                    Trace.endSection();
                    treeSet6 = new TreeSet(comparator1);
                    eipo.a(class0, "getFullConfigurations_userFlags", s9);
                }
                catch(Throwable throwable17) {
                    goto label_248;
                }
            }
        }
        try(eioe eioe4 = eiog0.b("SELECT flagType, name, intVal, boolVal, floatVal, stringVal, extensionVal FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 0 ORDER BY name").h(new Object[]{s9, v, this.g}).f()) {
            while(true) {
                if(!eioe4.b()) {
                    goto label_235;
                }
                Flag flag5 = eiro.d(eioe4);
                treeSet6.add(flag5);
                treeSet5.remove(flag5);
            }
        }
        catch(Throwable throwable20) {
            try {
                Trace.endSection();
                throw throwable20;
            }
            catch(Throwable throwable21) {
                try {
                    throwable20.addSuppressed(throwable21);
                    throw throwable20;
                label_235:
                    Trace.endSection();
                    if(arr_flag != null) {
                        for(int v5 = 0; v5 < arr_flag.length; ++v5) {
                            Flag flag6 = arr_flag[v5];
                            treeSet6.remove(flag6);
                            treeSet6.add(flag6);
                            treeSet5.remove(flag6);
                        }
                    }
                    configurations2 = eiro.b(treeSet6, treeSet5, s7, eirn0, false);
                    goto label_250;
                }
                catch(Throwable throwable17) {
                }
            }
        }
    label_248:
        TWR.safeClose$NT(gdqb2, throwable17);
        throw throwable17;
    label_250:
        gdqb2.close();
        return configurations2;
    }

    private final Configurations k(eiog eiog0) {
        Configurations configurations3;
        Iterator iterator4;
        HashSet hashSet1;
        eioe eioe4;
        ArrayList arrayList8;
        ArrayList arrayList7;
        Map map1;
        fpkv fpkv4;
        gdqb gdqb5;
        Configurations configurations2;
        eioe eioe3;
        ArrayList arrayList6;
        Map map0;
        fpkv fpkv3;
        gdqb gdqb4;
        Configurations configurations1;
        boolean z8;
        eioe eioe2;
        ArrayList arrayList4;
        ArrayList arrayList3;
        eioe eioe1;
        eiod eiod1;
        long v6;
        TreeSet treeSet1;
        TreeSet treeSet0;
        gdqb gdqb3;
        fpkv fpkv2;
        gdqb gdqb2;
        fpkv fpkv1;
        byte[] arr_b;
        ByteString hfsf0;
        Throwable throwable12;
        fpkw fpkw1;
        fpkw fpkw0;
        Throwable throwable11;
        Configurations configurations0;
        gghb gghb1;
        gghb gghb0;
        ggga ggga1;
        ggga ggga0;
        boolean z4;
        Throwable throwable5;
        eioe eioe0;
        ArrayList arrayList1;
        ArrayList arrayList0;
        Long long0;
        gdqb gdqb1;
        fpkv fpkv0;
        gdqb gdqb0;
        String s = this.a;
        if(!eiog0.b("SELECT EXISTS (\n    SELECT NULL\n    FROM config_packages\n    WHERE name = ?1\n    );\n").h(new Object[]{s}).g()) {
            throw new eipa(0x733F);
        }
        eite eite0 = eitf.a(this.h, eiog0);
        int v = eite0 != null && (eite0.i != -1L && eiog0.b("    SELECT EXISTS (\n      SELECT NULL\n      FROM config_packages\n      WHERE\n        name = ?1\n        AND committed_experiment_state_id IS ?2\n    );\n").h(new Object[]{s, ((long)eite0.i)}).g()) ? 1 : 0;
        eiod eiod0 = eiog0.b("    SELECT EXISTS (\n      SELECT NULL\n      FROM flag_overrides\n      LEFT OUTER JOIN config_packages\n        USING (config_package_id)\n      INNER JOIN accounts\n        USING (account_id)\n      WHERE\n        (config_packages.name = ?1 OR flag_overrides.config_package_name IS ?1)\n        AND (accounts.name = ?2 OR accounts.name = \'*\')\n        AND active IS 1\n    );\n");
        String s1 = this.g;
        boolean z = eiod0.h(new Object[]{s, s1}).e(new String[]{"flag_overrides"}).g();
        boolean z1 = v != 0 && !z;
        String s2 = eitf.d(s, s1, eiog0, z1);
        eite eite1 = eitf.a(s2, eiog0);
        if(eite1 == null) {
            throw new eipa(0x733F, s2);
        }
        long v1 = eite1.i;
        long v2 = eite1.j;
        Class class0 = eiro.class;
        if(z1) {
            gftb.check(s2);
            try {
                gdqb0 = gdsp.e("com/google/android/gms/phenotype/service/operations/GetConfigurationSnapshotOperation", "getDeltaConfigurationsPhixit", 294, "Get delta configurations for Phixit");
            }
            catch(IOException iOException0) {
                throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
            }
            try {
                fpkv0 = new fpkv();
            }
            catch(Throwable throwable0) {
                gdqb1 = gdqb0;
                goto label_293;
            }
            try {
                long0 = v2;
                boolean z2 = eiog0.b("    SELECT EXISTS (\n      SELECT NULL\n      FROM experiment_states_to_overrides\n      INNER JOIN flag_overrides\n        USING (override_id)\n      WHERE\n        experiment_state_id = ?1\n        AND active IS NULL\n    );\n").h(new Object[]{long0}).g();
            }
            catch(Throwable throwable1) {
                gdqb1 = gdqb0;
                fpkv1 = fpkv0;
                goto label_284;
            }
            if(!z2) {
                try {
                    arrayList0 = new ArrayList();
                    arrayList1 = new ArrayList();
                    eipo.a(class0, "getDeltaConfigurationsPhixit_getDeltaFlags", this.a);
                }
                catch(Throwable throwable2) {
                    gdqb1 = gdqb0;
                    throwable12 = throwable2;
                    fpkv1 = fpkv0;
                    goto label_285;
                }
                try {
                    eioe0 = eiog0.b("WITH CommittedPartitions AS (\n  SELECT param_partition_id\n  FROM param_partitions\n  INNER JOIN experiment_states_to_partitions\n    USING (param_partition_id)\n  WHERE experiment_state_id = ?1\n  ORDER BY ordinal\n), UncommittedPartitions AS (\n  SELECT param_partition_id\n  FROM param_partitions\n  INNER JOIN experiment_states_to_partitions\n    USING (param_partition_id)\n  WHERE experiment_state_id = ?2\n  ORDER BY ordinal\n), NewPartitions AS (\n  SELECT param_partition_id FROM UncommittedPartitions\n  EXCEPT\n  SELECT param_partition_id FROM CommittedPartitions\n), DeletedPartitions AS (\n  SELECT param_partition_id FROM CommittedPartitions\n  EXCEPT\n  SELECT param_partition_id FROM UncommittedPartitions\n)\n/* Return 0 to indicate uncommitted flags. */\nSELECT 0 AS committed, flags_content\nFROM param_partitions\nINNER JOIN NewPartitions\n  USING (param_partition_id)\nUNION ALL\n/* Return 1 to indicate committed flags. */\nSELECT 1 AS committed, flags_content\nFROM param_partitions\nINNER JOIN DeletedPartitions\n  USING (param_partition_id);\n").h(new Object[]{long0, v1}).f();
                }
                catch(Throwable throwable3) {
                    goto label_73;
                }
                while(true) {
                    try {
                    label_39:
                        boolean z3 = eioe0.b();
                    }
                    catch(Throwable throwable4) {
                        gdqb1 = gdqb0;
                        throwable5 = throwable4;
                        goto label_63;
                    }
                    if(!z3) {
                        goto label_70;
                    }
                    try {
                        long v3 = eioe0.f(0);
                        if(v3 != 0L) {
                            if(v3 == 1L) {
                                v3 = 1L;
                            }
                            else {
                                z4 = false;
                                goto label_54;
                            }
                        }
                        z4 = true;
                    label_54:
                        gftb.q(z4);
                        if(v3 == 0L) {
                            arrayList0.add(((fpkx)fpkv0.a(eioe0.k(1), new eirm())));
                            goto label_39;
                        }
                        arrayList1.add(((fpkx)fpkv0.a(eioe0.k(1), new eirm())));
                        goto label_39;
                    }
                    catch(Throwable throwable6) {
                    }
                    break;
                }
                throwable5 = throwable6;
                gdqb1 = gdqb0;
                try {
                label_63:
                    eioe0.close();
                    throw throwable5;
                }
                catch(Throwable throwable7) {
                    try {
                        throwable5.addSuppressed(throwable7);
                        throw throwable5;
                    }
                    catch(Throwable throwable3) {
                    }
                }
                goto label_74;
                try {
                label_70:
                    eioe0.close();
                    goto label_79;
                }
                catch(Throwable throwable3) {
                label_73:
                    gdqb1 = gdqb0;
                }
                try {
                label_74:
                    Trace.endSection();
                    throw throwable3;
                }
                catch(Throwable throwable8) {
                    try {
                        throwable3.addSuppressed(throwable8);
                        throw throwable3;
                    }
                    catch(Throwable throwable2) {
                        throwable12 = throwable2;
                        fpkv1 = fpkv0;
                        goto label_285;
                    }
                }
                try {
                label_79:
                    Trace.endSection();
                    fpkx fpkx0 = fpkx.c(arrayList0);
                    fpkx fpkx1 = fpkx.c(arrayList1);
                    ggga0 = new ggga(ggmi.a);
                    ggga1 = new ggga(ggmi.a);
                    gghb0 = gghd.r(fpkx1.b.om());
                    gghb1 = gghd.r(fpkx0.b.om());
                    while(true) {
                    label_86:
                        boolean z5 = gghb0.hasNext();
                        break;
                    }
                }
                catch(Throwable throwable2) {
                    gdqb1 = gdqb0;
                    throwable12 = throwable2;
                    fpkv1 = fpkv0;
                    goto label_285;
                }
                if(!z5) {
                    try {
                        if(!gghb1.hasNext()) {
                            fpkx fpkx2 = new fpkx(ggga0.n());
                            gggc gggc0 = ggga1.n();
                            ArrayList arrayList2 = new ArrayList();
                            if(fpkx2.a() > 0 || !gggc0.isEmpty()) {
                                arrayList2.add(new Configuration(0, ((Flag[])eiro.f(fpkx2).toArray(new Flag[0])), ((String[])gggc0.toArray(new String[0]))));
                            }
                            eirn eirn0 = this.l(eiog0, v1, new ArrayList());
                            configurations0 = new Configurations(s2, eirn0.c, ((Configuration[])arrayList2.toArray(new Configuration[arrayList2.size()])), true, eirn0.b, eirn0.d);
                            goto label_96;
                        }
                        goto label_104;
                    }
                    catch(Throwable throwable9) {
                        throwable12 = throwable9;
                        gdqb1 = gdqb0;
                        fpkv1 = fpkv0;
                        goto label_285;
                    }
                    try {
                    label_96:
                        fpkv0.close();
                    }
                    catch(Throwable throwable10) {
                        throwable11 = throwable10;
                        gdqb1 = gdqb0;
                        goto label_294;
                    }
                    try {
                        gdqb0.close();
                    }
                    catch(IOException iOException0) {
                        throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
                    }
                    return configurations0;
                }
                try {
                label_104:
                    boolean z6 = gghb1.hasNext();
                }
                catch(Throwable throwable2) {
                    gdqb1 = gdqb0;
                    throwable12 = throwable2;
                    fpkv1 = fpkv0;
                    goto label_285;
                }
                if(!z6) {
                    try {
                        ggga1.o(((fpkw)gghb0.next()).h());
                    }
                    catch(Throwable throwable9) {
                        throwable12 = throwable9;
                        gdqb1 = gdqb0;
                        fpkv1 = fpkv0;
                        goto label_285;
                    }
                    goto label_86;
                }
                try {
                    boolean z7 = gghb0.hasNext();
                }
                catch(Throwable throwable2) {
                    gdqb1 = gdqb0;
                    throwable12 = throwable2;
                    fpkv1 = fpkv0;
                    goto label_285;
                }
                if(!z7) {
                    try {
                        ggga0.r(gghb1);
                    }
                    catch(Throwable throwable9) {
                        throwable12 = throwable9;
                        gdqb1 = gdqb0;
                        fpkv1 = fpkv0;
                        goto label_285;
                    }
                    goto label_86;
                }
                try {
                    fpkw0 = (fpkw)gghb0.a();
                    fpkw1 = (fpkw)gghb1.a();
                    int v4 = fpkw0.b(fpkw1);
                }
                catch(Throwable throwable2) {
                    gdqb1 = gdqb0;
                    throwable12 = throwable2;
                    fpkv1 = fpkv0;
                    goto label_285;
                }
                try {
                    if(v4 < 0) {
                        ggga1.o(((fpkw)gghb0.next()).h());
                        goto label_86;
                    }
                    if(v4 > 0) {
                        ggga0.o(((fpkw)gghb1.next()));
                        goto label_86;
                    }
                }
                catch(Throwable throwable9) {
                    throwable12 = throwable9;
                    gdqb1 = gdqb0;
                    fpkv1 = fpkv0;
                    goto label_285;
                }
                if(fpkw0.c == fpkw1.c) {
                    gghb gghb2 = gghb1;
                    gdqb1 = gdqb0;
                    try {
                        if(fpkw0.d == fpkw1.d) {
                            Object object0 = fpkw0.e;
                            Object object1 = fpkw1.e;
                            if(!Objects.equals(object0, object1)) {
                                if((object0 instanceof ByteString) && (object1 instanceof byte[])) {
                                    hfsf0 = (ByteString)object0;
                                    arr_b = (byte[])object1;
                                }
                                else if((object1 instanceof ByteString) && (object0 instanceof byte[])) {
                                    arr_b = (byte[])object0;
                                    hfsf0 = (ByteString)object1;
                                }
                                else {
                                    ggga0.o(fpkw1);
                                    gghb0.next();
                                    gghb2.next();
                                    gghb1 = gghb2;
                                    gdqb0 = gdqb1;
                                    goto label_86;
                                }
                                int v5 = hfsf0.size();
                                if(arr_b.length != v5 || !Arrays.equals(hfsf0.toByteArray(), arr_b)) {
                                    goto label_152;
                                }
                            }
                        }
                        else {
                            ggga0.o(fpkw1);
                            goto label_153;
                        label_150:
                            gghb2 = gghb1;
                            gdqb1 = gdqb0;
                        label_152:
                            ggga0.o(fpkw1);
                        }
                    label_153:
                        gghb0.next();
                        gghb2.next();
                        gghb1 = gghb2;
                        gdqb0 = gdqb1;
                        goto label_86;
                    }
                    catch(Throwable throwable2) {
                    }
                    throwable12 = throwable2;
                    fpkv1 = fpkv0;
                    goto label_285;
                }
                else {
                    goto label_150;
                }
                goto label_153;
            }
            gdqb1 = gdqb0;
            try {
                gdqb2 = gdsp.e("com/google/android/gms/phenotype/service/operations/GetConfigurationSnapshotOperation", "getDeltaConfigurationsWithOverridesPhixit", 422, "Get delta configurations with overrides for Phixit");
                goto label_172;
            }
            catch(IOException iOException1) {
                fpkv1 = fpkv0;
                throw new eipa(0x734E, "Failed to parse flags content.", iOException1);
            }
            catch(Throwable throwable1) {
            }
            fpkv1 = fpkv0;
            goto label_284;
            try {
            label_172:
                fpkv2 = new fpkv();
            }
            catch(Throwable throwable13) {
                gdqb3 = gdqb2;
                fpkv1 = fpkv0;
                goto label_274;
            }
            try {
                treeSet0 = new TreeSet();
                treeSet1 = new TreeSet();
                v6 = Math.max(v2, v1);
            }
            catch(Throwable throwable14) {
                gdqb3 = gdqb2;
                fpkv1 = fpkv0;
                goto label_266;
            }
            gdqb3 = gdqb2;
            try {
                eiod1 = eiog0.b("SELECT flag_overrides.name, flag_overrides.type, flag_overrides.value\nFROM flag_overrides\nINNER JOIN experiment_states_to_overrides\n  USING (override_id)\nWHERE\n  experiment_state_id = ?1\n  AND active IS NULL;\n");
            }
            catch(Throwable throwable14) {
                fpkv1 = fpkv0;
                goto label_266;
            }
            fpkv1 = fpkv0;
            try {
                eioe1 = eiod1.h(new Object[]{long0}).f();
            }
            catch(Throwable throwable14) {
                goto label_266;
            }
            while(true) {
                try {
                    if(!eioe1.b()) {
                        goto label_205;
                    }
                    Flag flag0 = eiro.e(eioe1);
                    treeSet0.add(flag0);
                    treeSet1.add(flag0.b);
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
                        label_205:
                            eioe1.close();
                            arrayList3 = new ArrayList();
                            arrayList4 = new ArrayList();
                            eipo.a(class0, "getDeltaConfigurationsPhixit_getDeltaFlags", s);
                            break;
                        }
                        catch(Throwable throwable14) {
                            goto label_266;
                        }
                    }
                }
            }
            try {
                eioe2 = eiog0.b("WITH OldPartitions AS (\n  SELECT flags_content\n  FROM param_partitions\n  INNER JOIN experiment_states_to_partitions\n    USING (param_partition_id)\n  WHERE experiment_state_id = ?1\n), NewPartitions AS (\n  SELECT flags_content\n  FROM param_partitions\n  INNER JOIN experiment_states_to_partitions\n    USING (param_partition_id)\n  WHERE experiment_state_id = ?2\n)\n/* Return 0 to indicate old flags. */\nSELECT 0 AS new_flag, flags_content\nFROM OldPartitions\nUNION ALL\n/* Return 1 to indicate new flags. */\nSELECT 1 AS new_flag, flags_content\nFROM NewPartitions;\n").h(new Object[]{v2, v6}).f();
            }
            catch(Throwable throwable17) {
                goto label_235;
            }
            while(true) {
                try {
                label_210:
                    if(!eioe2.b()) {
                        goto label_232;
                    }
                    long v7 = eioe2.f(0);
                    if(v7 != 0L) {
                        if(v7 == 1L) {
                            v7 = 1L;
                        }
                        else {
                            z8 = false;
                            goto label_219;
                        }
                    }
                    z8 = true;
                label_219:
                    gftb.q(z8);
                    if(v7 == 0L) {
                        arrayList3.add(((fpkx)fpkv2.a(eioe2.k(1), new eirm())));
                        goto label_210;
                    }
                    arrayList4.add(((fpkx)fpkv2.a(eioe2.k(1), new eirm())));
                }
                catch(Throwable throwable18) {
                    try {
                        eioe2.close();
                        throw throwable18;
                    }
                    catch(Throwable throwable19) {
                        try {
                            throwable18.addSuppressed(throwable19);
                            throw throwable18;
                        label_232:
                            eioe2.close();
                            goto label_240;
                        }
                        catch(Throwable throwable17) {
                        }
                        break;
                    }
                }
            }
            try {
            label_235:
                Trace.endSection();
                throw throwable17;
            }
            catch(Throwable throwable20) {
                try {
                    throwable17.addSuppressed(throwable20);
                    throw throwable17;
                label_240:
                    Trace.endSection();
                    eirn eirn1 = this.l(eiog0, v6, new ArrayList());
                    for(Object object2: eiro.f(fpkx.c(arrayList3))) {
                        Flag flag1 = (Flag)object2;
                        String s3 = flag1.b;
                        if(!treeSet1.contains(s3)) {
                            treeSet0.add(flag1);
                            treeSet1.add(s3);
                        }
                    }
                    TreeSet treeSet2 = new TreeSet(eiro.f(fpkx.c(arrayList4)));
                    HashSet hashSet0 = new HashSet();
                    for(Object object3: treeSet2) {
                        hashSet0.add(((Flag)object3).b);
                    }
                    treeSet2.removeAll(treeSet0);
                    treeSet1.removeAll(hashSet0);
                    ArrayList arrayList5 = new ArrayList();
                    if(!treeSet2.isEmpty() || !treeSet1.isEmpty()) {
                        arrayList5.add(new Configuration(0, ((Flag[])treeSet2.toArray(new Flag[treeSet2.size()])), ((String[])treeSet1.toArray(new String[treeSet1.size()]))));
                    }
                    configurations1 = new Configurations(s2, eirn1.c, ((Configuration[])arrayList5.toArray(new Configuration[arrayList5.size()])), true, eirn1.b, eirn1.d);
                    goto label_271;
                }
                catch(Throwable throwable14) {
                }
            }
            try {
            label_266:
                fpkv2.close();
                throw throwable14;
            }
            catch(Throwable throwable21) {
                try {
                    throwable14.addSuppressed(throwable21);
                    throw throwable14;
                label_271:
                    fpkv2.close();
                    goto label_279;
                }
                catch(Throwable throwable13) {
                }
            }
            try {
            label_274:
                gdqb3.close();
                throw throwable13;
            }
            catch(Throwable throwable22) {
                try {
                    throwable13.addSuppressed(throwable22);
                    throw throwable13;
                label_279:
                    gdqb3.close();
                    goto label_290;
                }
                catch(IOException iOException1) {
                }
                catch(Throwable throwable1) {
                    goto label_284;
                }
            }
            try {
                throw new eipa(0x734E, "Failed to parse flags content.", iOException1);
            }
            catch(Throwable throwable1) {
            }
        label_284:
            throwable12 = throwable1;
            try {
            label_285:
                fpkv1.close();
                throw throwable12;
            }
            catch(Throwable throwable23) {
                try {
                    throwable12.addSuppressed(throwable23);
                    throw throwable12;
                label_290:
                    fpkv1.close();
                    goto label_299;
                }
                catch(Throwable throwable0) {
                }
            }
        label_293:
            throwable11 = throwable0;
            try {
            label_294:
                gdqb1.close();
                throw throwable11;
            }
            catch(Throwable throwable24) {
                try {
                    throwable11.addSuppressed(throwable24);
                    throw throwable11;
                label_299:
                    gdqb1.close();
                    return configurations1;
                }
                catch(IOException iOException0) {
                }
            }
            throw new eipa(0x734E, "Failed to parse flags content.", iOException0);
        }
        if(this.h == null) {
            gftb.check(s2);
            try {
                gdqb4 = gdsp.e("com/google/android/gms/phenotype/service/operations/GetConfigurationSnapshotOperation", "getFullConfigurationsOnlyPhixit", 579, "Get full configurations for Phixit");
            }
            catch(IOException iOException2) {
                throw new eipa(0x734E, "Failed to parse flags content.", iOException2);
            }
            try {
                fpkv3 = new fpkv();
            }
            catch(Throwable throwable25) {
                goto label_362;
            }
            try {
                map0 = new HashMap();
                if(z) {
                    map0 = eiro.g(eiog0, this.a, v1);
                }
                arrayList6 = new ArrayList();
                eipo.a(class0, "getFullConfigurationsOnlyPhixit_getFlags", this.a);
            }
            catch(Throwable throwable26) {
                goto label_354;
            }
            try {
                eioe3 = eiog0.b("SELECT flags_content\nFROM param_partitions\nINNER JOIN experiment_states_to_partitions\n  USING (param_partition_id)\nWHERE experiment_state_id = ?1;\n").h(new Object[]{v1}).f();
            }
            catch(Throwable throwable27) {
                goto label_326;
            }
            while(true) {
                try {
                    if(!eioe3.b()) {
                        goto label_323;
                    }
                    arrayList6.add(((fpkx)fpkv3.a(eioe3.k(0), new eirm())));
                }
                catch(Throwable throwable28) {
                    try {
                        eioe3.close();
                        throw throwable28;
                    }
                    catch(Throwable throwable29) {
                        try {
                            throwable28.addSuppressed(throwable29);
                            throw throwable28;
                        label_323:
                            eioe3.close();
                            goto label_331;
                        }
                        catch(Throwable throwable27) {
                        }
                        break;
                    }
                }
            }
            try {
            label_326:
                Trace.endSection();
                throw throwable27;
            }
            catch(Throwable throwable30) {
                try {
                    throwable27.addSuppressed(throwable30);
                    throw throwable27;
                label_331:
                    Trace.endSection();
                    List list0 = eiro.f(fpkx.c(arrayList6));
                    if(!map0.isEmpty()) {
                        HashMap hashMap0 = new HashMap();
                        for(Object object4: list0) {
                            hashMap0.put(((Flag)object4).b, ((Flag)object4));
                        }
                        for(Object object5: map0.entrySet()) {
                            hashMap0.put(((String)((Map.Entry)object5).getKey()), ((Flag)((Map.Entry)object5).getValue()));
                        }
                        list0.clear();
                        list0.addAll(hashMap0.values());
                    }
                    eirn eirn2 = this.l(eiog0, v1, new ArrayList(map0.values()));
                    Configuration[] arr_configuration = new Configuration[0];
                    if(!list0.isEmpty()) {
                        arr_configuration = new Configuration[]{new Configuration(0, ((Flag[])list0.toArray(new Flag[list0.size()])), new String[0])};
                    }
                    configurations2 = new Configurations(s2, eirn2.c, arr_configuration, false, eirn2.b, eirn2.d);
                    goto label_359;
                }
                catch(Throwable throwable26) {
                }
            }
            try {
            label_354:
                fpkv3.close();
                throw throwable26;
            }
            catch(Throwable throwable31) {
                try {
                    throwable26.addSuppressed(throwable31);
                    throw throwable26;
                label_359:
                    fpkv3.close();
                    goto label_367;
                }
                catch(Throwable throwable25) {
                }
            }
            try {
            label_362:
                gdqb4.close();
                throw throwable25;
            }
            catch(Throwable throwable32) {
                try {
                    throwable25.addSuppressed(throwable32);
                    throw throwable25;
                label_367:
                    gdqb4.close();
                    return configurations2;
                }
                catch(IOException iOException2) {
                }
            }
            throw new eipa(0x734E, "Failed to parse flags content.", iOException2);
        }
        gftb.check(s2);
        try {
            gdqb5 = gdsp.e("com/google/android/gms/phenotype/service/operations/GetConfigurationSnapshotOperation", "getFullConfigurationsWithDeletedPhixit", 666, "Get full configurations with deleted for Phixit");
        }
        catch(IOException iOException3) {
            throw new eipa(0x734E, "Failed to parse flags content.", iOException3);
        }
        try {
            fpkv4 = new fpkv();
        }
        catch(Throwable throwable33) {
            goto label_453;
        }
        try {
            map1 = new HashMap();
            if(z) {
                map1 = eiro.g(eiog0, this.a, v1);
            }
            arrayList7 = new ArrayList();
            arrayList8 = new ArrayList();
            eipo.a(class0, "getFullConfigurationsWithDeletedPhixit_allFlags", this.a);
        }
        catch(Throwable throwable34) {
            goto label_447;
        }
        try {
            eioe4 = eiog0.b("WITH LatestPartitions AS (\n  SELECT flags_content, experiment_state_id, param_partition_id\n  FROM param_partitions\n  INNER JOIN experiment_states_to_partitions\n    USING (param_partition_id)\n  WHERE experiment_state_id = ?1\n), AllPartitionIds AS (\n  SELECT DISTINCT param_partition_id\n  FROM param_partitions\n  INNER JOIN experiment_states_to_partitions\n    USING (param_partition_id)\n  INNER JOIN experiment_states\n    USING (experiment_state_id)\n  INNER JOIN config_packages\n    USING (config_package_id)\n  WHERE config_packages.name = ?2\n), DeltaPartitionIds AS (\n  SELECT param_partition_id FROM AllPartitionIds\n  EXCEPT\n  SELECT param_partition_id FROM LatestPartitions\n), DeltaPartitions AS (\n  SELECT flags_content, -1 AS experiment_state_id\n  FROM DeltaPartitionIds\n  INNER JOIN param_partitions\n    USING (param_partition_id)\n)\nSELECT flags_content, experiment_state_id FROM LatestPartitions\nUNION ALL\nSELECT * FROM DeltaPartitions;\n").h(new Object[]{v1, this.a}).f();
        }
        catch(Throwable throwable35) {
            goto label_397;
        }
        while(true) {
            try {
            label_381:
                if(!eioe4.b()) {
                    goto label_394;
                }
                if(eioe4.f(1) == v1 && v1 != -1L) {
                    arrayList8.add(((fpkx)fpkv4.a(eioe4.k(0), new eirm())));
                    goto label_381;
                }
                arrayList7.add(((fpkx)fpkv4.a(eioe4.k(0), new eirm())));
            }
            catch(Throwable throwable36) {
                try {
                    eioe4.close();
                    throw throwable36;
                }
                catch(Throwable throwable37) {
                    try {
                        throwable36.addSuppressed(throwable37);
                        throw throwable36;
                    label_394:
                        eioe4.close();
                        goto label_402;
                    }
                    catch(Throwable throwable35) {
                    }
                    break;
                }
            }
        }
        try {
        label_397:
            Trace.endSection();
            throw throwable35;
        }
        catch(Throwable throwable38) {
            try {
                throwable35.addSuppressed(throwable38);
                throw throwable35;
            label_402:
                Trace.endSection();
                List list1 = eiro.f(fpkx.c(arrayList8));
                hashSet1 = new HashSet();
                iterator4 = arrayList7.iterator();
                while(true) {
                label_406:
                    if(!iterator4.hasNext()) {
                        for(Object object6: list1) {
                            hashSet1.remove(((Flag)object6).b);
                        }
                        eirn eirn3 = this.l(eiog0, v1, new ArrayList(map1.values()));
                        if(map1.isEmpty()) {
                            Configuration[] arr_configuration2 = new Configuration[0];
                            if(!list1.isEmpty() || !hashSet1.isEmpty()) {
                                arr_configuration2 = new Configuration[]{new Configuration(0, ((Flag[])list1.toArray(new Flag[list1.size()])), ((String[])hashSet1.toArray(new String[hashSet1.size()])))};
                            }
                            configurations3 = new Configurations(s2, eirn3.c, arr_configuration2, false, eirn3.b, eirn3.d);
                        }
                        else {
                            HashMap hashMap1 = new HashMap();
                            for(Object object7: list1) {
                                hashMap1.put(((Flag)object7).b, ((Flag)object7));
                            }
                            for(Object object8: map1.entrySet()) {
                                hashMap1.put(((String)((Map.Entry)object8).getKey()), ((Flag)((Map.Entry)object8).getValue()));
                                hashSet1.remove(((Map.Entry)object8).getKey());
                            }
                            list1.clear();
                            list1.addAll(hashMap1.values());
                            Configuration[] arr_configuration1 = new Configuration[0];
                            if(!list1.isEmpty() || !hashSet1.isEmpty()) {
                                arr_configuration1 = new Configuration[]{new Configuration(0, ((Flag[])list1.toArray(new Flag[list1.size()])), ((String[])hashSet1.toArray(new String[hashSet1.size()])))};
                            }
                            configurations3 = new Configurations(s2, eirn3.c, arr_configuration1, false, eirn3.b, eirn3.d);
                        }
                        break;
                    }
                    goto label_440;
                }
            }
            catch(Throwable throwable34) {
                goto label_447;
            }
        }
        try {
            fpkv4.close();
        }
        catch(Throwable throwable33) {
            goto label_453;
        }
        try {
            gdqb5.close();
        }
        catch(IOException iOException3) {
            throw new eipa(0x734E, "Failed to parse flags content.", iOException3);
        }
        return configurations3;
        try {
        label_440:
            Object object9 = iterator4.next();
            Iterator iterator8 = eiro.f(((fpkx)object9)).iterator();
            while(true) {
                if(!iterator8.hasNext()) {
                    goto label_406;
                }
                Object object10 = iterator8.next();
                hashSet1.add(((Flag)object10).b);
            }
        }
        catch(Throwable throwable34) {
            try {
            label_447:
                fpkv4.close();
                throw throwable34;
            }
            catch(Throwable throwable39) {
                try {
                    throwable34.addSuppressed(throwable39);
                    throw throwable34;
                }
                catch(Throwable throwable33) {
                }
            }
        }
        try {
        label_453:
            gdqb5.close();
            throw throwable33;
        }
        catch(Throwable throwable40) {
            try {
                throwable33.addSuppressed(throwable40);
                throw throwable33;
            }
            catch(IOException iOException3) {
            }
        }
        throw new eipa(0x734E, "Failed to parse flags content.", iOException3);
    }

    private final eirn l(eiog eiog0, long v, List list0) {
        eiok eiok1;
        eiok eiok0;
        eirn eirn0;
        eipo.a(eiro.class, "getUncommittedTokensPhixit", this.a);
        try {
            if(list0.isEmpty()) {
                eiok1 = eiog0.b("SELECT experiment_token, server_token, serving_version\nFROM experiment_states\nWHERE experiment_state_id = ?1;\n").h(new Object[]{v}).i();
                goto label_24;
            }
            else {
                for(Object object0: list0) {
                    Flag flag0 = (Flag)object0;
                    if(!flag0.b.equals("__phenotype_server_token") || flag0.h != 4) {
                        continue;
                    }
                    eirn0 = new eirn(null, flag0.d(), 0L);
                    goto label_43;
                }
                eiok0 = eiog0.b("SELECT server_token\nFROM experiment_states\nWHERE experiment_state_id = ?1;\n").h(new Object[]{v}).i();
                goto label_10;
            }
            goto label_43;
        }
        catch(Throwable throwable0) {
            goto label_38;
        }
        try {
        label_10:
            if(eiok0 == null) {
                eirn0 = eirn.a;
            }
            else {
                eirn0 = new eirn(null, eiok0.h(0), 0L);
                goto label_12;
            }
            goto label_43;
        }
        catch(Throwable throwable1) {
            goto label_17;
        }
        try {
        label_12:
            eiok0.close();
        }
        catch(Throwable throwable0) {
            goto label_38;
        }
        goto label_43;
        try {
            eirn0 = eirn.a;
            goto label_43;
        }
        catch(Throwable throwable1) {
        label_17:
            if(eiok0 != null) {
                try {
                    eiok0.close();
                }
                catch(Throwable throwable2) {
                    try {
                        throwable1.addSuppressed(throwable2);
                        throw throwable1;
                    }
                    catch(Throwable throwable0) {
                        goto label_38;
                    }
                }
            }
            throw throwable1;
        }
        try {
        label_24:
            if(eiok1 == null) {
                eirn0 = eirn.a;
            }
            else {
                eirn0 = new eirn(eiok1.j(0), eiok1.h(1), eiok1.f(2));
                goto label_26;
            }
            goto label_43;
        }
        catch(Throwable throwable3) {
            goto label_31;
        }
        try {
        label_26:
            eiok1.close();
        }
        catch(Throwable throwable0) {
            goto label_38;
        }
        goto label_43;
        try {
            eirn0 = eirn.a;
            goto label_43;
        }
        catch(Throwable throwable3) {
        label_31:
            if(eiok1 != null) {
                try {
                    eiok1.close();
                }
                catch(Throwable throwable4) {
                    try {
                        throwable3.addSuppressed(throwable4);
                        throw throwable3;
                    }
                    catch(Throwable throwable0) {
                        goto label_38;
                    }
                }
            }
            throw throwable3;
        }
        try {
        label_38:
            Trace.endSection();
        }
        catch(Throwable throwable5) {
            throwable0.addSuppressed(throwable5);
        }
        throw throwable0;
    label_43:
        Trace.endSection();
        return eirn0;
    }
}

