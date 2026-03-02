import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class hmox implements hmnd {
    public static final String a = "hmox";
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public final byte[] g;
    protected final hmno h;
    protected final hmnf i;
    public final hmpv j;
    protected final hmps k;
    public final hmpt l;
    protected hmpn m;
    public final List n;
    public int o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private JSONObject s;
    private hmmi t;

    static {
        hmox.b = new byte[]{103, 0};
        hmpb.I("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        hmox.p = hmpb.I("800000000000000000000000");
        hmox.c = hmpb.r(0xFFFFFF90, new byte[]{0});
        hmox.q = new byte[]{90, 0, 1, 0, (byte)0x80};
        hmox.d = new byte[]{-91, 0, 1, 0, (byte)0x80};
        hmox.r = new byte[6];
        hmox.e = new byte[]{11};
        hmox.f = new byte[]{0x6F, 34, (byte)0x85, 0x20};
    }

    public hmox(hmno hmno0, hmnf hmnf0, hmmi hmmi0, hmpv hmpv0, int v) {
        this.o = 5;
        this.g = new byte[]{4, -94, 0, -15, 0, 24, 5, 4, -94, 6, 1, 0, 24, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 69, 24};
        hmps hmps0 = new hmps();
        this.k = hmps0;
        this.l = hmps0.a();
        this.n = new ArrayList();
        this.s = null;
        this.h = hmno0;
        this.i = hmnf0;
        this.j = hmpv0;
        this.t = hmmi0;
        this.o = v;
    }

    public hmox(hmno hmno0, hmnf hmnf0, hmpv hmpv0) {
        this.o = 5;
        this.g = new byte[]{4, -94, 0, -15, 0, 24, 5, 4, -94, 6, 1, 0, 24, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 69, 24};
        hmps hmps0 = new hmps();
        this.k = hmps0;
        this.l = hmps0.a();
        this.n = new ArrayList();
        this.s = null;
        this.h = hmno0;
        this.i = hmnf0;
        this.j = hmpv0;
    }

    protected final byte[] A(byte[] arr_b) {
        byte[] arr_b1 = this.Z(arr_b, false);
        this.k.l();
        return hmpb.w(arr_b1);
    }

    protected final byte[] B(byte[] arr_b) {
        byte[] arr_b1 = this.Z(arr_b, true);
        this.k.l();
        return hmpb.w(arr_b1);
    }

    public final byte[] C(byte[] arr_b) {
        int v = hmpb.c(arr_b);
        this.a(arr_b);
        hmpb.g(v);
        hmph hmph0 = this.m.a;
        hmpo hmpo0 = hmph0.c(v);
        this.N(v, hmpo0, 1);
        this.N(v, hmpo0, 4);
        byte[] arr_b1 = hmph0.b(v).b();
        this.k.l = new hmpu(hmpy.F(new byte[][]{new byte[0], arr_b1}));
        this.k.m();
        return new byte[]{(byte)0x90};
    }

    public final byte[] D(byte[] arr_b) {
        int v = hmpb.c(arr_b);
        hmpb.g(v);
        this.a(arr_b);
        this.V(v);
        this.k.m();
        return new byte[]{(byte)0x90};
    }

    protected final byte[] E(byte[] arr_b) {
        this.W(arr_b, true);
        this.k.m();
        return new byte[]{(byte)0x90};
    }

    protected final byte[] F(byte[] arr_b) {
        this.W(arr_b, false);
        this.k.m();
        return new byte[]{(byte)0x90};
    }

    protected final byte[] G(byte[] arr_b) {
        return this.h.i(this.k.v, arr_b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
    }

    protected final byte[] H() {
        return this.k.i;
    }

    protected final byte[] I(byte[] arr_b, boolean z) {
        int v = arr_b.length - 1;
        byte[] arr_b1 = new byte[arr_b.length];
        if(z) {
            byte[] arr_b2 = this.h.d(arr_b, 0, v);
            this.h.a(arr_b1, arr_b2, 1);
            byte[] arr_b3 = this.h.d(arr_b, v, 1);
            this.h.a(arr_b1, arr_b3, 0);
            return arr_b1;
        }
        byte[] arr_b4 = this.h.d(arr_b, 1, v);
        this.h.a(arr_b1, arr_b4, 0);
        byte[] arr_b5 = this.h.d(arr_b, 0, 1);
        this.h.a(arr_b1, arr_b5, v);
        return arr_b1;
    }

    protected final boolean J(int v, int v1) {
        hmps hmps0 = this.k;
        boolean z = false;
        if(hmps0.w != null) {
            int v2 = hmps0.f;
            if(v2 == 0x9000) {
                if(v1 == 0xB000) {
                    z = true;
                }
                hmpb.f(z, 6);
                return true;
            }
            if(v2 == 0x9001) {
                if(v1 == 0xB003) {
                    z = true;
                }
                hmpb.f(z, 6);
                return true;
            }
            hmpl hmpl0 = this.m.c;
            int v3 = hmpb.b(v1);
            hmpk hmpk0 = (hmpk)hmpl0.get(Integer.valueOf(v3 + v3 + 0x4000));
            hmpl hmpl1 = this.m.c;
            int v4 = hmpb.b(v1);
            hmpk hmpk1 = (hmpk)hmpl1.get(Integer.valueOf(v4 + v4 + 0x4001));
            int v5 = hmps0.f % 2 == 0 ? 1 : 2;
            hmno hmno0 = this.h;
            String s = null;
            boolean z1 = hmno0.j(hmps0.w.c, (hmpk0 == null ? null : hmpk0.a)) && v5 == 1;
            String s1 = hmps0.w.c;
            if(hmpk1 != null) {
                s = hmpk1.a;
            }
            boolean z2 = hmno0.j(s1, s) && v5 == 2;
            switch(v - 1) {
                case 0: {
                    return z1;
                }
                case 1: {
                    return z2;
                }
                case 2: {
                    return z1 ? true : z2;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public final hmoo K(boolean z) {
        JSONObject jSONObject11;
        hmpk hmpk0;
        JSONObject jSONObject10;
        Iterator iterator3;
        JSONArray jSONArray1;
        JSONObject jSONObject7;
        String s;
        hmpq hmpq0;
        List list1;
        JSONObject jSONObject6;
        Map.Entry map$Entry0;
        JSONArray jSONArray0;
        JSONObject jSONObject4;
        JSONObject jSONObject3;
        hmpm hmpm0;
        JSONObject jSONObject2;
        hmnh hmnh0;
        JSONObject jSONObject0 = this.m.i;
        List list0 = this.k.s;
        if(jSONObject0 != null) {
            try {
                hmqg hmqg0 = new hmqg();
                hmqc.a(jSONObject0, hmqg0);
                hmnh0 = new hmnh(hmqa.a(list0, hmqg0).a);
            }
            catch(hmou | hmov exception0) {
                this.i.a(exception0.getMessage(), exception0);
                hmnh0 = new hmnh(1);
            }
        }
        else if(list0.isEmpty()) {
            hmnh0 = new hmnh(4);
        }
        else {
            int v = 0;
            int v1 = 0;
            for(Object object0: list0) {
                hmqj hmqj0 = (hmqj)object0;
                if(hmqj0.b == null) {
                    hmnh0 = new hmnh(4);
                    goto label_49;
                }
                if(Integer.parseInt(hmqj0.a, 16) == 0xA4 && Integer.parseInt(hmqj0.c.substring(0, 2), 16) == 4 && Integer.parseInt(hmqj0.b, 16) != 0x9000) {
                    new hmoy(Integer.parseInt(hmqj0.a, 16));
                    hmnh0 = new hmnh(3);
                    goto label_49;
                }
                if(hmoy.b(Integer.parseInt(hmqj0.b, 16))) {
                    switch(((byte)Integer.parseInt(hmqj0.a, 16))) {
                        case -80: 
                        case 0xFFFFFFB1: 
                        case -78: 
                        case -77: {
                            ++v;
                        }
                    }
                }
                if(hmoy.b(Integer.parseInt(hmqj0.b, 16))) {
                    switch(((byte)Integer.parseInt(hmqj0.a, 16))) {
                        case -76: 
                        case -75: {
                            ++v1;
                        }
                    }
                }
                new hmoy(Integer.parseInt(hmqj0.b, 16));
                if(Integer.parseInt(hmqj0.b, 16) == 6) {
                    hmnh0 = new hmnh(6);
                    goto label_49;
                }
                if(Integer.parseInt(hmqj0.b, 16) == 11) {
                    hmnh0 = new hmnh(5);
                    goto label_49;
                }
                if(hmoy.b(Integer.parseInt(hmqj0.b, 16))) {
                    continue;
                }
                hmnh0 = new hmnh(1);
                goto label_49;
            }
            if(v == v1) {
                hmnh0 = this.k.p || this.k.q ? new hmnh(2) : new hmnh(7);
            }
            else {
                hmnh0 = new hmnh(4);
            }
        }
    label_49:
        boolean z1 = this.k.p;
        if(this.s == null || z1) {
            hmpn hmpn0 = this.m;
            if(hmpn0 == null) {
                jSONObject10 = null;
            }
            else {
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject2 = new JSONObject();
                    try {
                        jSONObject1.put("dfName", hmpy.C(hmpn0.e));
                        jSONObject1.put("fciData", new String(hmql.b(hmpn0.d), StandardCharsets.US_ASCII));
                        hmpm0 = hmpn0.g;
                        jSONObject3 = new JSONObject();
                    }
                    catch(JSONException jSONException0) {
                        throw new hmot(jSONException0.getMessage());
                    }
                    try {
                        if(hmpm.a != null && hmpm.a.has("maxUMRead")) {
                            jSONObject3.put("maxUMRead", ((int)hmpm0.b[0]));
                        }
                        if(hmpm.a != null && hmpm.a.has("defaultPlainAC")) {
                            jSONObject3.put("defaultPlainAC", ((int)hmpm0.b[1]));
                        }
                        if(hmpm.a != null && hmpm.a.has("keySystemDataWrite")) {
                            jSONObject3.put("keySystemDataWrite", hmpm0.b[3] & 0xFF);
                        }
                        goto label_68;
                    }
                    catch(JSONException jSONException1) {
                        try {
                            throw new hmot(jSONException1.getMessage());
                        label_68:
                            jSONObject1.put("mfpConfigurationBlock", jSONObject3);
                            jSONObject4 = new JSONObject();
                        }
                        catch(JSONException jSONException0) {
                            throw new hmot(jSONException0.getMessage());
                        }
                    }
                    try {
                        jSONObject4.put("vctIdOverride", ((int)hmpn0.h.a[0]));
                        jSONObject4.put("useRID", hmpn0.h.a[1] & 0xFF);
                        jSONObject4.put("pcMandatory", ((int)hmpn0.h.a[2]));
                        jSONObject4.put("pdCap1.2", ((int)hmpn0.h.a[4]));
                        jSONObject4.put("pdCap2.1", ((int)hmpn0.h.a[5]));
                        jSONObject4.put("pdCap2.5", ((int)hmpn0.h.a[9]));
                        jSONObject4.put("pdCap2.6", ((int)hmpn0.h.a[10]));
                        jSONObject4.put("authVCMandatory", ((int)hmpn0.h.a[11]));
                        goto label_81;
                    }
                    catch(JSONException jSONException2) {
                        try {
                            throw new hmot(jSONException2.getMessage());
                        label_81:
                            jSONObject1.put("fieldConfigurationBlock", jSONObject4);
                            jSONArray0 = new JSONArray();
                            Iterator iterator1 = hmpn0.a.entrySet().iterator();
                            while(true) {
                            label_84:
                                if(!iterator1.hasNext()) {
                                    goto label_97;
                                }
                                Object object1 = iterator1.next();
                                map$Entry0 = (Map.Entry)object1;
                                break;
                            }
                        }
                        catch(JSONException jSONException0) {
                            throw new hmot(jSONException0.getMessage());
                        }
                    }
                    try {
                        if(map$Entry0.getValue() == null && !hmpb.n(((Integer)map$Entry0.getKey()).intValue())) {
                            throw new hmot("Invalid block number or data");
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("blockNumber", map$Entry0.getKey());
                        jSONObject5.put("data", new String(hmql.b(((hmpf)map$Entry0.getValue()).b()), StandardCharsets.US_ASCII));
                        jSONArray0.put(jSONObject5);
                    }
                    catch(JSONException jSONException3) {
                        try {
                            throw new hmot(jSONException3.getMessage());
                        }
                        catch(JSONException jSONException0) {
                            throw new hmot(jSONException0.getMessage());
                        }
                    }
                    goto label_84;
                    try {
                    label_97:
                        jSONObject1.put("blocks", jSONArray0);
                        jSONObject6 = new JSONObject();
                    }
                    catch(JSONException jSONException0) {
                        throw new hmot(jSONException0.getMessage());
                    }
                    try {
                        list1 = hmpn0.b.a;
                        Iterator iterator2 = list1.iterator();
                        while(true) {
                        label_101:
                            if(!iterator2.hasNext()) {
                                goto label_119;
                            }
                            Object object2 = iterator2.next();
                            hmpq0 = (hmpq)object2;
                            s = hmpq0.g;
                            jSONObject7 = new JSONObject();
                            break;
                        }
                    }
                    catch(JSONException jSONException4) {
                        throw new hmot(jSONException4.getMessage());
                    }
                    try {
                        jSONObject7.put("commitReaderIdBlock", new String(hmql.b(hmpq0.c), StandardCharsets.US_ASCII));
                        jSONObject7.put("transactionMACBlock", new String(hmql.b(hmpq0.b), StandardCharsets.US_ASCII));
                        jSONObject7.put("tmcConfigurationBlock0", new String(hmql.b(hmpq0.d), StandardCharsets.US_ASCII));
                        jSONObject7.put("tmcConfigurationBlock1", new String(hmql.b(hmpq0.e), StandardCharsets.US_ASCII));
                        jSONObject7.put("tmcConfigurationBlock2", new String(hmql.b(hmpq0.f), StandardCharsets.US_ASCII));
                        goto label_114;
                    }
                    catch(JSONException jSONException5) {
                        try {
                            throw new hmot(jSONException5.getMessage());
                        label_114:
                            jSONObject6.put(s, jSONObject7);
                            list1 = list1;
                            goto label_101;
                        }
                        catch(JSONException jSONException4) {
                        }
                    }
                    try {
                        throw new hmot(jSONException4.getMessage());
                    label_119:
                        JSONObject jSONObject8 = list1.isEmpty() ? null : jSONObject6;
                        if(jSONObject8 != null) {
                            jSONObject1.put("transactionMACBlocks", jSONObject8);
                        }
                        jSONObject1.put("piccUid", hmpy.C(hmpn0.f));
                        jSONArray1 = new JSONArray();
                        iterator3 = hmpn0.c.entrySet().iterator();
                        while(true) {
                        label_125:
                            if(!iterator3.hasNext()) {
                                jSONObject1.put("keys", jSONArray1);
                                jSONObject2.put("MIFAREPlusState", jSONObject1);
                                JSONObject jSONObject9 = hmpn0.i;
                                if(jSONObject9 != null) {
                                    jSONObject2.put("transactionSequence", jSONObject9);
                                }
                                int v2 = hmpn0.j;
                                if(v2 != 0 && v2 != 5) {
                                    jSONObject2.put("persistenceMode", hmqh.a(v2));
                                }
                                jSONObject2.put("type", "MIFAREPlus");
                                jSONObject2.put("version", "1.1");
                                jSONObject2.put("lastModifiedDate", hmpy.C(hmpy.G()));
                                if(z) {
                                    break;
                                }
                                jSONObject10 = jSONObject2;
                                this.s = jSONObject10;
                                return new hmoo(hmnh0, this.s, z1);
                            }
                            goto label_141;
                        }
                    }
                    catch(JSONException jSONException0) {
                        throw new hmot(jSONException0.getMessage());
                    }
                }
                catch(hmot hmot0) {
                    this.S(hmot0.getMessage(), hmot0);
                    throw new JSONException(hmot0.getMessage());
                }
                this.k.b();
                jSONObject10 = jSONObject2;
                this.s = jSONObject10;
                return new hmoo(hmnh0, this.s, z1);
                try {
                    try {
                    label_141:
                        Object object3 = iterator3.next();
                        if(((Map.Entry)object3).getValue() == null) {
                            throw new hmot("Invalid block number or key");
                        }
                        hmpk0 = (hmpk)((Map.Entry)object3).getValue();
                        jSONObject11 = new JSONObject();
                    }
                    catch(JSONException jSONException0) {
                        throw new hmot(jSONException0.getMessage());
                    }
                    try {
                        jSONObject11.put("blockNumber", hmpk0.c);
                        jSONObject11.put("keyAlias", hmpk0.a);
                        jSONObject11.put("type", hmpk0.b);
                        goto label_152;
                    }
                    catch(JSONException jSONException6) {
                        try {
                            throw new hmot(jSONException6.getMessage());
                        label_152:
                            jSONArray1.put(jSONObject11);
                            goto label_125;
                        }
                        catch(JSONException jSONException0) {
                        }
                    }
                    throw new hmot(jSONException0.getMessage());
                }
                catch(hmot hmot0) {
                    this.S(hmot0.getMessage(), hmot0);
                    throw new JSONException(hmot0.getMessage());
                }
            }
            this.s = jSONObject10;
        }
        return new hmoo(hmnh0, this.s, z1);
    }

    public final hmnr L(int v) {
        hmpk hmpk0 = (hmpk)this.m.c.get(Integer.valueOf((v == 0 ? 0xC000 : 0xC000 + v * 16)));
        return this.h.e(hmpk0.a);
    }

    protected static final hmpk M() {
        throw new hmoy(6);
    }

    public final void N(int v, hmpo hmpo0, int v1) {
        int v2;
        boolean z = true;
        hmpg hmpg0 = hmpo0.c(v);
        switch(v1 - 1) {
            case 0: {
                v2 = hmpg0.a;
                hmpb.f(hmpo0.e(v2, v), 6);
                break;
            }
            case 1: {
                v2 = hmpg0.b;
                hmpb.f(hmpe.a(hmpo0.c(v).b).contains(hmpe.a(v2)), 6);
                break;
            }
            case 2: {
                v2 = hmpg0.c;
                if(hmpo0.c(v).c != v2) {
                    z = false;
                }
                hmpb.f(z, 6);
                break;
            }
            default: {
                v2 = hmpg0.d;
                if(hmpo0.c(v).d != v2) {
                    z = false;
                }
                hmpb.f(z, 6);
            }
        }
        hmpb.f(this.J(v2, v), 6);
    }

    public static final void O(Object[] arr_object) {
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if((object0 instanceof byte[])) {
                hmpy.C(((byte[])object0));
            }
            else {
                Objects.toString(object0);
            }
        }
    }

    protected static final void P(byte[] arr_b) {
        int v = arr_b[0];
        hmpy.C(arr_b);
    }

    public final hmpq Q(int v) {
        hmpq hmpq0;
        boolean z;
        Iterator iterator0 = this.m.b.a.iterator();
        do {
            z = true;
            if(!iterator0.hasNext()) {
                goto label_8;
            }
            Object object0 = iterator0.next();
            hmpq0 = (hmpq)object0;
            int v1 = v % 0x80 / 8;
        }
        while(!hmpb.E((v / 0x80 + 1 == 1 ? hmpq0.e[v1] : hmpq0.f[v1]), v % 8));
        goto label_9;
    label_8:
        hmpq0 = null;
    label_9:
        hmpt hmpt0 = this.l;
        if(hmpq0 == null) {
            z = false;
        }
        hmpt0.a = z;
        return hmpq0;
    }

    public final byte[] R(byte[] arr_b, hmpq hmpq0, byte[] arr_b1, byte[] arr_b2) {
        this.ae(hmpq0);
        hmpt hmpt0 = this.l;
        byte[] arr_b3 = hmpt0.b;
        if(arr_b3 == null) {
            hmpt0.b = hmpy.F(new byte[][]{new byte[]{arr_b[0]}, hmpb.J(hmpb.c(arr_b), 2), arr_b2, arr_b1});
            return this.h.i(hmpt0.g, hmpt0.b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
        }
        hmpt0.b = hmpy.F(new byte[][]{arr_b3, new byte[]{arr_b[0]}, hmpb.J(hmpb.c(arr_b), 2), arr_b2, arr_b1});
        return this.h.i(hmpt0.g, hmpt0.b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
    }

    protected final void S(String s, Exception exception0) {
        this.i.a(s, exception0);
    }

    private final void T(byte[] arr_b) {
        if(hmpb.k(arr_b[0])) {
            byte[] arr_b1 = hmpb.J(hmpb.a(arr_b, 3, 2), 2);
            this.l.b = hmpy.F(new byte[][]{this.l.b, arr_b1});
        }
    }

    private final void U(byte[] arr_b) {
        hmpb.f(hmpa.a(arr_b), 12);
        int v = arr_b.length - 8;
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 3, v);
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, v, arr_b.length);
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, 1, 3);
        byte[] arr_b4 = this.X(arr_b[0], arr_b3, arr_b1);
        hmox.O(new Object[]{"Key bytes dataForMac ==> ", arr_b4});
        this.i(arr_b4, arr_b2);
    }

    private final void V(int v) {
        hmph hmph0 = this.m.a;
        hmpo hmpo0 = hmph0.c(v);
        hmpf hmpf0 = hmph0.b(v);
        hmpb.f(this.k.j < 0xFFFF, 7);
        hmpb.f(this.m(v), 6);
        hmpb.f(this.k.l != null, 15);
        this.N(v, hmpo0, 4);
        hmpb.f(true, 6);
        hmpu hmpu0 = this.k.l;
        byte[] arr_b = new byte[16];
        byte[] arr_b1 = hmpy.J(hmpu0.a, 4);
        byte b = arr_b1[0];
        arr_b[0] = b;
        byte b1 = arr_b1[1];
        arr_b[1] = b1;
        byte b2 = arr_b1[2];
        arr_b[2] = b2;
        byte b3 = arr_b1[3];
        arr_b[3] = b3;
        arr_b[4] = (byte)(~b);
        arr_b[5] = (byte)(~b1);
        arr_b[6] = (byte)(~b2);
        arr_b[7] = (byte)(~b3);
        arr_b[8] = b;
        arr_b[9] = b1;
        arr_b[10] = b2;
        arr_b[11] = b3;
        arr_b[12] = (byte)hmpu0.b;
        arr_b[13] = (byte)(~hmpu0.b);
        arr_b[14] = (byte)hmpu0.b;
        arr_b[15] = (byte)(~hmpu0.b);
        hmpf0.a(arr_b);
        hmph0.put(Integer.valueOf(v), hmpf0);
    }

    private final void W(byte[] arr_b, boolean z) {
        boolean z11;
        boolean z10;
        boolean z9;
        boolean z8;
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z3;
        boolean z2;
        int v = hmpb.c(arr_b);
        byte b = 3;
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 3, arr_b.length - 8);
        int v1 = 6;
        if(!z) {
            hmpb.f(this.j(v), 6);
        }
        boolean z1 = true;
        hmpb.f(v != 0, 6);
        hmpb.f(v != 0x8000, 6);
        hmpb.f(v != 0xB004, 6);
        hmpb.f(!hmpb.p(v) && !hmpb.i(v), 6);
        hmpb.f(v < 0x9003 || v > 0x9007, 6);
        hmpb.f(!hmpb.p(v) && (v < 0xC000 || v > 0xC036) && !hmpb.i(v) && (v != 0x9000 && v != 0x9001 && v != 0xA080 && v != 0xA081), 9);
        this.U(arr_b);
        Integer integer0 = v;
        hmox.O(new Object[]{"Key bytes data ==> ", arr_b1, "blockNumber ==> ", integer0});
        int v2 = arr_b1.length >> 4;
        if(z) {
            arr_b1 = this.u(arr_b1);
        }
        if(hmpb.j(v)) {
            int v3 = v & 15;
            hmpb.f(hmpb.B(this.l.c) < 0xFFFFFFFFL, 5);
            if(v3 == 1) {
                hmpb.f(this.k.f == 0x9000, 6);
                hmox.M();
                v3 = 1;
            }
            if(v3 == 0) {
                switch(hmpy.z(v)) {
                    case 0: {
                        hmpb.f(this.k.f == 0xC001, 6);
                        break;
                    }
                    case 1: {
                        hmpb.f(this.k.f == 0xC011, 6);
                        break;
                    }
                    case 2: {
                        hmpb.f(this.k.f == 0xC021, 6);
                        break;
                    }
                    case 3: {
                        hmpb.f(this.k.f == 0xC031, 6);
                        break;
                    }
                    default: {
                        throw new hmoy(9);
                    }
                }
                hmox.M();
            }
            if(v3 == 0 || v3 == 1) {
                return;
            }
            List list0 = this.m.b.a;
            Integer integer1 = hmpy.z(v);
            hmpq hmpq0 = hmox.ai(list0, integer1);
            if(hmpq0 == null) {
                hmpq0 = new hmpq(null);
                hmpq0.a = integer1;
                list0.add(hmpq0);
            }
            if(v3 == 2) {
                hmpq0.b = arr_b1;
            }
            if(v3 == 3) {
                hmpq0.c = arr_b1;
            }
            if(v3 == 4) {
                hmpq0.d = arr_b1;
            }
            if(v3 == 5) {
                hmpq0.e = arr_b1;
            }
            if(v3 != 6) {
                return;
            }
            hmpq0.f = arr_b1;
            return;
        }
        if(hmpb.p(v) && v != 0xB002) {
            hmpb.f(!z || !hmpb.p(v) || arr_b1.length == 16, 10);
            if(v == 0xB000) {
                hmpb.f(z, 6);
                hmph hmph0 = this.m.a;
                hmpb.f(this.k.f == 0x9000, 6);
                hmpm hmpm0 = new hmpm();
                hmpm0.b = hmph0.b(0xB000).b();
                hmpm0.b[0] = arr_b1[0];
                byte b1 = arr_b1[3];
                switch(b1) {
                    case -86: {
                        z2 = true;
                        b1 = -86;
                        break;
                    }
                    case 0: 
                    case 85: {
                        z2 = true;
                        break;
                    }
                    default: {
                        z2 = false;
                    }
                }
                hmpb.f(z2, 15);
                if(b1 != -86) {
                    z3 = true;
                }
                else if(hmpm0.b[3] != 85) {
                    z3 = true;
                    b1 = -86;
                }
                else {
                    b1 = -86;
                    z3 = false;
                }
                hmpb.f(z3, 13);
                if(b1 != 0) {
                    hmpm0.b[3] = b1;
                }
                byte b2 = arr_b1[4];
                switch(b2) {
                    case -86: {
                        z4 = true;
                        b2 = -86;
                        break;
                    }
                    case 0: 
                    case 85: {
                        z4 = true;
                        break;
                    }
                    default: {
                        z4 = false;
                    }
                }
                hmpb.f(z4, 15);
                hmpb.f(b2 != -86, 13);
                if(b2 != 0) {
                    hmpm0.b[4] = b2;
                }
                byte b3 = arr_b1[5];
                switch(b3) {
                    case 0: 
                    case 1: {
                        b = b3;
                        z5 = true;
                        break;
                    }
                    case 3: {
                        z5 = true;
                        break;
                    }
                    default: {
                        b = b3;
                        z5 = false;
                    }
                }
                hmpb.f(z5, 15);
                hmpb.f(b != 1, 13);
                if(b != 0) {
                    hmpm0.b[5] = b;
                }
                byte b4 = arr_b1[6];
                switch(b4) {
                    case -86: {
                        z6 = true;
                        b4 = -86;
                        break;
                    }
                    case 0: 
                    case 85: {
                        z6 = true;
                        break;
                    }
                    default: {
                        z6 = false;
                    }
                }
                hmpb.f(z6, 15);
                hmpb.f(b4 != -86, 13);
                if(b4 != 0) {
                    hmpm0.b[6] = b4;
                }
                int v4 = arr_b1[2];
                for(int v5 = 7; v5 < 16; ++v5) {
                    v4 = (byte)(v4 | arr_b1[v5]);
                }
                hmpb.f(v4 == 0, 15);
                return;
            }
            if(v != 0xB003) {
                return;
            }
            hmpb.f(z, 6);
            hmph hmph1 = this.m.a;
            hmpb.f(this.k.f == 0x9001, 6);
            hmpj hmpj0 = new hmpj();
            hmpj0.a = hmph1.b(0xB003).b();
            hmpb.f(arr_b1[0] == 0, 13);
            int v6 = arr_b1[1];
            if(v6 != -86 && v6 != 0 && v6 != 85) {
                switch(v6) {
                    case -106: {
                        v6 = -106;
                        z7 = true;
                        break;
                    }
                    case -91: 
                    case 90: {
                        z7 = true;
                        break;
                    }
                    default: {
                        z7 = false;
                    }
                }
            }
            else {
                z7 = true;
            }
            hmpb.f(z7, 15);
            switch(v6) {
                case -86: {
                    z8 = true;
                    break;
                }
                case 0: {
                    z8 = true;
                    v6 = 0;
                    break;
                }
                default: {
                    z8 = false;
                }
            }
            hmpb.f(z8, 13);
            if(v6 == -86 || v6 == 0) {
                hmpj0.a[1] = -86;
            }
            int v7 = arr_b1[2];
            switch(v7) {
                case -86: {
                    z9 = true;
                    v7 = -86;
                    break;
                }
                case 0: 
                case 85: {
                    z9 = true;
                    break;
                }
                default: {
                    z9 = false;
                }
            }
            hmpb.f(z9, 15);
            switch(v7) {
                case 0: {
                    z10 = true;
                    v7 = 0;
                    break;
                }
                case 85: {
                    z10 = true;
                    break;
                }
                default: {
                    z10 = false;
                }
            }
            hmpb.f(z10, 13);
            if(v7 == 0 || v7 == 85) {
                hmpj0.a[2] = 85;
            }
            byte b5 = arr_b1[11];
            switch(b5) {
                case -86: {
                    z11 = true;
                    b5 = -86;
                    break;
                }
                case 0: 
                case 85: {
                    z11 = true;
                    break;
                }
                default: {
                    z11 = false;
                }
            }
            hmpb.f(z11, 15);
            switch(b5) {
                case -86: {
                    hmpj0.a[11] = -86;
                    break;
                }
                case 0: 
                case 85: {
                    hmpj0.a[11] = b5;
                }
            }
            int v8 = arr_b1[3];
            while(v1 < 16) {
                v8 = (byte)(v8 | arr_b1[v1]);
                if(v1 == 8) {
                    v1 = 12;
                }
                else {
                    ++v1;
                }
            }
            hmpb.f(v8 == 0, 15);
            return;
        }
        if(hmph.d(v)) {
            hmox.O(new Object[]{"Key bytes sector trailer data ==> ", arr_b1, "Writing to sector trailer ==> ", integer0, "  isDataEncrypted ===> ", Boolean.valueOf(z)});
            hmpb.f(arr_b1.length == 16, 6);
            hmpo hmpo0 = this.m.a.c(v);
            hmpp hmpp0 = hmpo0.d(v);
            byte[] arr_b2 = hmpo0.a;
            hmpb.f(this.m(v), 6);
            int v9 = hmpp0.d;
            boolean z12 = hmpo0.f(v9, v);
            int v10 = hmpp0.b;
            boolean z13 = hmpo0.g(v10, v);
            if(!z12 && !z13) {
                z1 = false;
            }
            hmpb.f(z1, 6);
            if(z12) {
                hmpb.f(this.J(v9, v), 6);
                System.arraycopy(arr_b1, 5, arr_b2, 5, 5);
            }
            if(z13) {
                hmpb.f(this.J(v10, v), 6);
                System.arraycopy(arr_b1, 10, arr_b2, 10, 6);
            }
            hmpo0.a(arr_b2);
            this.m.a.put(integer0, hmpo0);
            return;
        }
        if(v != 0x9000 && v != 0x9001 && (v != 0xA080 && v != 0xA081)) {
            if(hmpb.n(v)) {
                hmox.O(new Object[]{"Key bytes receivedData ==> ", arr_b1, "Writing to key block(s) ==> ", integer0, "  isDataEncrypted ==> ", Boolean.valueOf(z), " numberOfBlocksToWrite ==> ", v2});
                hmpb.f((arr_b1.length & 15) == 0, 12);
                int v11 = v > 0x7F ? 16 : 4;
                int v12 = v % v11 + v2;
                if(v11 == 4) {
                    hmpb.f(v12 <= 3, 6);
                }
                else {
                    hmpb.f(v12 <= 15, 6);
                }
                int v13 = 0;
                while(v13 < v2) {
                    if(!hmph.d(v)) {
                        hmpo hmpo1 = this.m.a.c(v);
                        hmpb.f(this.m(v), 6);
                        this.N(v, hmpo1, 2);
                        hmpq hmpq1 = this.Q(v);
                        this.ad(hmpq1);
                        if(hmpq1 != null && hmpq1.a()) {
                            hmpb.f(this.k.n == -56, 5);
                        }
                        hmpf hmpf0 = this.m.a.b(v);
                        hmpf0.a(Arrays.copyOfRange(arr_b1, v13 * 16, (v13 + 1) * 16));
                        this.m.a.put(Integer.valueOf(v), hmpf0);
                        v13 = (short)(v13 + 1);
                    }
                    ++v;
                }
                return;
            }
            if(!hmpb.i(v)) {
                return;
            }
            throw new hmoy(6);
        }
        hmox.O(new Object[]{"Key bytes receivedData ===> ", arr_b1, "Writing to key block(s) ==> ", integer0, "  isDataEncrypted ==> ", Boolean.valueOf(z)});
        if(arr_b1.length != 16) {
            z1 = false;
        }
        hmpb.f(z1, 10);
        hmox.M();
    }

    private final byte[] X(byte b, byte[] arr_b, byte[] arr_b1) {
        return hmpy.F(new byte[][]{new byte[]{b}, this.k.j(), this.H(), arr_b, arr_b1});
    }

    private final byte[] Y(byte b, boolean z) {
        return z ? hmpy.F(new byte[][]{new byte[]{b}, this.k.j(), this.H(), this.l.c, this.l.d}) : hmpy.F(new byte[][]{new byte[]{b}, this.k.j(), this.H()});
    }

    private final byte[] Z(byte[] arr_b, boolean z) {
        int v6;
        hmox.O(new Object[]{"Key bytes command ==> ", arr_b, " isMAConCommand ==> ", Boolean.valueOf(z)});
        hmpb.f(hmpa.a(arr_b), 12);
        int v = hmpb.c(arr_b);
        boolean z1 = true;
        int v1 = hmpb.a(arr_b, 3, 1);
        hmpb.f(v1 != 0, 10);
        int v2 = hmpb.c(arr_b);
        int v3 = hmpb.a(arr_b, 3, 1);
        hmpb.f(hmpb.n(v2) || hmpb.j(v2), 9);
        hmpb.f(!hmpb.i(v2) || !hmpb.p(v2), 9);
        if(!hmpb.j(v2) && !hmph.d(v2)) {
            int v4 = hmpb.e(v2);
            int v5 = hmpb.b(v2);
            if(v4 == 4) {
                v6 = v5 * 3;
            }
            else {
                v6 = v4 == 16 ? v5 % 16 * 15 + 0x60 : 0;
            }
            hmpb.f(v3 <= 0xD8 - (v6 + v2 % v4), 10);
        }
        if(z) {
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, 4, arr_b.length);
            byte[] arr_b2 = Arrays.copyOfRange(arr_b, 1, 3);
            byte b = arr_b[0];
            byte[] arr_b3 = {arr_b[3]};
            this.i(hmpy.F(new byte[][]{new byte[]{b}, this.k.h(), this.H(), arr_b2, arr_b3}), arr_b1);
        }
        if(hmpb.j(v)) {
            hmpq hmpq0 = hmox.ai(this.m.b.a, Integer.valueOf(hmpy.z(v)));
            if(hmpb.B(this.l.c) >= 0xFFFFFFFFL) {
                z1 = false;
            }
            hmpb.f(z1, 5);
            if(hmpq0 != null && (v & 15) == 2) {
                return hmpq0.b;
            }
            throw new hmoy(9);
        }
        if(hmph.d(v)) {
            hmpb.f(v1 == 1, 6);
            hmpo hmpo0 = this.m.a.c(v);
            hmpp hmpp0 = hmpo0.d(v);
            hmpb.f(this.m(v), 6);
            int v7 = hmpp0.c;
            hmpb.f(hmpo0.d(v).c == v7, 6);
            if(hmpb.o(arr_b[0])) {
                hmpb.f(this.j(v), 6);
            }
            hmpb.f(this.J(v7, v), 6);
            byte[] arr_b4 = hmpo0.a;
            byte[] arr_b5 = hmpp0.a == 1 ? hmpy.F(new byte[][]{hmpy.I("0000000000"), Arrays.copyOfRange(arr_b4, 5, 16)}) : hmpy.F(new byte[][]{hmpy.I("0000000000"), Arrays.copyOfRange(hmpo0.a, 5, 10), hmpy.I("000000000000")});
            this.b(arr_b, arr_b5, v);
            hmox.O(new Object[]{"Key bytes sectorTrailerData ==> ", arr_b5, " data read from sector trailer ==> ", v});
            return arr_b5;
        }
        byte[] arr_b6 = new byte[0];
        int v8 = v;
        int v9 = 0;
        while(v9 < v1) {
            if(!hmph.d(v8)) {
                ++v9;
                hmpo hmpo1 = this.m.a.c(v8);
                hmpg hmpg0 = hmpo1.c(v8);
                hmpb.f(this.m(v8), 6);
                int v10 = hmpg0.a;
                hmpb.f(hmpo1.e(v10, v8), 6);
                if(hmpb.o(arr_b[0])) {
                    hmpb.f(this.j(v8), 6);
                }
                hmpb.f(this.J(v10, v8), 6);
                byte[] arr_b7 = hmpy.F(new byte[][]{arr_b6, this.m.a.b(v8).b()});
                this.b(arr_b, arr_b7, v8);
                arr_b6 = arr_b7;
            }
            ++v8;
        }
        hmox.O(new Object[]{"Key bytes ==> ", arr_b6, " data read from data block(s) ==> ", v, " numberOfBlocksToBeRead ==> ", v1});
        return arr_b6;
    }

    private final void a(byte[] arr_b) {
        hmpb.f(hmpa.a(arr_b), 12);
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, arr_b.length - 8, arr_b.length);
        byte b = arr_b[0];
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, 1, 3);
        this.i(hmpy.F(new byte[][]{new byte[]{b}, this.k.j(), this.H(), arr_b2}), arr_b1);
    }

    private final void aa(int v, byte[] arr_b) {
        hmpb.f(hmpa.a(arr_b), 12);
        int v1 = arr_b.length - 8;
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 5, v1);
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, v1, arr_b.length);
        this.i(this.X(arr_b[0], Arrays.copyOfRange(arr_b, 1, 5), arr_b1), arr_b2);
        int v2 = hmpb.c(arr_b);
        int v3 = hmpb.a(arr_b, 3, 2);
        byte[] arr_b3 = this.u(Arrays.copyOfRange(arr_b, 5, v1));
        hmpb.f(Arrays.equals(Arrays.copyOfRange(arr_b3, 4, arr_b3.length), hmox.p), 6);
        byte[] arr_b4 = hmpb.L(Arrays.copyOfRange(arr_b3, 0, 4));
        this.ab(v2, arr_b4, v);
        hmox.O(new Object[]{"Key bytes value ==> ", arr_b4, "Transfer to ==> ", v3});
        this.V(v3);
        this.k.m();
    }

    private final void ab(int v, byte[] arr_b, int v1) {
        boolean z = true;
        hmox.O(new Object[]{"Key bytes value ==> ", arr_b, "ValueOperations ==> ", (v1 == 1 ? "INCREMENT" : "DECREMENT")});
        hmps hmps0 = this.k;
        hmpb.f(hmps0.j < 0xFFFF, 7);
        hmpb.g(v);
        hmph hmph0 = this.m.a;
        hmpo hmpo0 = hmph0.c(v);
        hmpb.f(this.m(v), 6);
        this.N(v, hmpo0, 1);
        if(v1 == 1) {
            this.N(v, hmpo0, 3);
        }
        else {
            this.N(v, hmpo0, 4);
            v1 = 2;
        }
        byte[] arr_b1 = hmph0.b(v).b();
        hmpu hmpu0 = new hmpu(hmpy.F(new byte[][]{new byte[0], arr_b1}));
        if(v1 - 1 == 0) {
            int v4 = hmpb.y(arr_b);
            int v5 = hmpu0.a;
            if(v5 > 0) {
                if(v5 >= 0x7FFFFFFF || v5 + v4 < 0) {
                    z = false;
                }
                hmpb.f(z, 15);
            }
            hmpu0.a += v4;
        }
        else {
            int v2 = hmpb.y(arr_b);
            int v3 = hmpu0.a;
            if(v3 < 0) {
                if(v3 <= 0x80000000 || v3 - v2 >= 0) {
                    z = false;
                }
                hmpb.f(z, 15);
            }
            hmpu0.a -= v2;
        }
        hmps0.l = hmpu0;
    }

    private static final boolean ac(byte b) {
        return (b & 1) == 1;
    }

    private final void ad(hmpq hmpq0) {
        if(hmpq0 == null) {
            return;
        }
        hmpt hmpt0 = this.l;
        Integer integer0 = hmpt0.e;
        if(integer0 == null) {
            hmpt0.e = hmpq0.a;
            return;
        }
        hmpb.f(integer0.equals(hmpq0.a), 5);
    }

    private final void ae(hmpq hmpq0) {
        hmnr hmnr0 = this.L(hmpq0.a.intValue());
        byte[] arr_b = hmpb.J(hmpb.y(hmpb.L(Arrays.copyOfRange(hmpq0.b, 0, 4))) + 1, 4);
        byte[] arr_b1 = hmpy.F(new byte[][]{hmox.q, arr_b, this.m.f});
        this.l.g = new hmnr(1, this.h.i(hmnr0, arr_b1, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 1), false);
    }

    private final void af(hmpq hmpq0, byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = Arrays.copyOfRange(hmpq0.b, 0, 4);
        int v = arr_b[0];
        if(v == -76 || v == -75 || hmpb.k(((byte)v))) {
            this.l.c = hmpb.L(hmpb.K(hmpb.B(hmpb.L(arr_b2)) + 1L));
        }
        hmpt hmpt0 = this.l;
        hmpt0.d = this.ah(arr_b, hmpq0, arr_b1);
        hmpq0.b = hmpy.F(new byte[][]{hmpt0.c, hmpt0.d, hmpy.I("00000000")});
        int v1 = arr_b[0];
        if(v1 != -74 && v1 != -73 && v1 != -72 && (v1 != -76 && v1 != -75 && v1 != -71)) {
            return;
        }
        hmpt0.b = null;
    }

    private final void ag(hmpq hmpq0, byte[] arr_b) {
        this.l.c = hmpb.L(hmpb.K(hmpb.B(hmpb.L(Arrays.copyOfRange(hmpq0.b, 0, 4))) + 1L));
        this.l.d = this.ah(arr_b, hmpq0, null);
        hmpq0.b = hmpy.F(new byte[][]{this.l.c, this.l.d, hmpy.I("00000000")});
    }

    private final byte[] ah(byte[] arr_b, hmpq hmpq0, byte[] arr_b1) {
        hmpt hmpt1;
        this.ae(hmpq0);
        byte b = arr_b[0];
        int v = (b & 0xF0) >> 4;
        if(v == 3) {
            int v1 = hmpb.a(arr_b, 3, 1);
            hmpt hmpt2 = this.l;
            byte[] arr_b5 = hmpt2.b;
            if(arr_b5 == null) {
                hmpt2.b = hmpy.F(new byte[][]{new byte[]{arr_b[0]}, hmpb.J(hmpb.c(arr_b), 2), new byte[]{((byte)v1)}, arr_b1});
                return this.h.i(this.l.g, this.l.b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
            }
            hmpt2.b = hmpy.F(new byte[][]{arr_b5, new byte[]{arr_b[0]}, hmpb.J(hmpb.c(arr_b), 2), new byte[]{((byte)v1)}, arr_b1});
        }
        else {
            switch(v) {
                case 10: {
                    byte[] arr_b2 = Arrays.copyOfRange(arr_b, 3, arr_b.length - 8);
                    switch(arr_b[0]) {
                        case 0xFFFFFFA0: 
                        case 0xFFFFFFA1: {
                            arr_b2 = this.m.a.b(hmpb.c(arr_b)).b();
                        }
                    }
                    hmpt hmpt0 = this.l;
                    byte[] arr_b3 = hmpt0.b;
                    byte b1 = (byte)(arr_b2.length >> 4);
                    if(arr_b3 == null) {
                        hmpt0.b = hmpy.F(new byte[][]{new byte[]{arr_b[0]}, hmpb.J(hmpb.c(arr_b), 2), new byte[]{b1}, arr_b2});
                        return this.h.i(this.l.g, this.l.b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
                    }
                    hmpt0.b = hmpy.F(new byte[][]{arr_b3, new byte[]{arr_b[0]}, hmpb.J(hmpb.c(arr_b), 2), new byte[]{b1}, arr_b2});
                    return this.h.i(this.l.g, this.l.b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
                }
                case 11: 
                case 12: {
                    hmpt1 = this.l;
                    byte[] arr_b4 = hmpt1.b;
                    hmpt1.b = arr_b4 == null ? hmpy.F(new byte[][]{new byte[]{b}, hmpb.J(hmpb.c(arr_b), 2)}) : hmpy.F(new byte[][]{arr_b4, new byte[]{b}, hmpb.J(hmpb.c(arr_b), 2)});
                    this.T(arr_b);
                    break;
                }
                default: {
                    return this.h.i(this.l.g, this.l.b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
                }
            }
            if(arr_b1 != null) {
                hmpt1.b = hmpy.F(new byte[][]{hmpt1.b, arr_b1});
                return this.h.i(this.l.g, this.l.b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
            }
        }
        return this.h.i(this.l.g, this.l.b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
    }

    private static final hmpq ai(List list0, Integer integer0) {
        for(Object object0: list0) {
            hmpq hmpq0 = (hmpq)object0;
            if(hmpq0.a.equals(integer0)) {
                return hmpq0;
            }
        }
        return null;
    }

    private final void b(byte[] arr_b, byte[] arr_b1, int v) {
        hmpq hmpq0 = this.Q(v);
        hmpt hmpt0 = this.l;
        if(hmpt0.a && hmpq0 != null) {
            this.ad(hmpq0);
            hmpt0.d = this.ah(arr_b, hmpq0, arr_b1);
            hmpq0.b = hmpy.F(new byte[][]{hmpt0.c, hmpt0.d, hmpy.I("00000000")});
        }
    }

    @Override  // hmnd
    public final void c(JSONObject jSONObject0) {
        hmpn hmpn0 = new hmpn();
        this.m = hmpn0;
        hmpn0.a(jSONObject0);
        hmpl hmpl0 = this.m.c;
        HashMap hashMap0 = new HashMap();
        for(Object object0: hmpl0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(!hashMap0.containsKey(((hmpk)map$Entry0.getValue()).a)) {
                hashMap0.put(((hmpk)map$Entry0.getValue()).a, new hmnr(((hmpk)map$Entry0.getValue()).a));
            }
        }
        ((hmnl)this.h).a = hashMap0;
    }

    public final void d(byte[] arr_b) {
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, 19, arr_b.length);
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, 1, 3);
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, 3, arr_b.length - 8);
        this.i(hmpy.F(new byte[][]{new byte[]{arr_b[0]}, this.k.j(), this.H(), arr_b2, arr_b3}), arr_b1);
    }

    public final void e(byte[] arr_b) {
        hmps hmps0 = this.k;
        if(hmps0.w != null && hmps0.a == 0) {
            hmpb.f(arr_b.length == 9, 12);
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, 1, arr_b.length);
            this.i(hmpy.F(new byte[][]{new byte[]{arr_b[0]}, hmps0.h(), this.H()}), arr_b1);
        }
    }

    public final void f() {
        try {
            if(this.t != null && this.l()) {
                JSONObject jSONObject0 = this.K(false).a;
                this.s = jSONObject0;
                this.t.e(jSONObject0);
                this.k.p = false;
                this.k.q = true;
            }
        }
        catch(JSONException jSONException0) {
            this.i.a(jSONException0.getMessage(), jSONException0);
        }
    }

    public final void g(int v) {
        hmpo hmpo0 = this.m.a.c(v);
        hmpp hmpp0 = hmpo0.d(v);
        int v1 = hmpp0.d;
        boolean z = hmpo0.f(v1, v);
        int v2 = hmpp0.b;
        boolean z1 = hmpo0.g(v2, v);
        hmpb.f(z || z1, 6);
        if(z) {
            hmpb.f(this.J(v1, v), 6);
        }
        if(z1) {
            hmpb.f(this.J(v2, v), 6);
        }
    }

    public final void h(byte b) {
        hmps hmps0 = this.k;
        if(hmps0.m) {
            int v = hmps0.n;
            if(v == 0x60) {
                if(b == -81) {
                    v = 0x60;
                    goto label_10;
                }
                hmps0.a = 0;
                hmps0.m = false;
                throw new hmoy(11);
            }
        label_10:
            if((v == 0x70 || v == 0x76) && b != 0x72) {
                hmps0.b();
                hmps0.m = false;
                throw new hmoy(11);
            }
        }
    }

    protected final void i(byte[] arr_b, byte[] arr_b1) {
        hmpb.f(Arrays.equals(this.h.i(this.k.v, arr_b, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2), arr_b1), 8);
    }

    public final boolean j(int v) {
        int v1 = this.m.a.c(v).a[5];
        if(v1 == 15) {
            return true;
        }
        int v2 = hmpb.e(v);
        int v3 = v % v2;
        if(v2 == 16) {
            v3 = hmpb.d(v3);
        }
        switch(v3) {
            case 0: {
                return hmpb.E(((byte)v1), ((byte)0)) && !hmpb.E(((byte)v1), ((byte)4));
            }
            case 1: {
                return hmpb.E(((byte)v1), ((byte)1)) && !hmpb.E(((byte)v1), ((byte)5));
            }
            case 2: {
                return hmpb.E(((byte)v1), ((byte)2)) && !hmpb.E(((byte)v1), ((byte)6));
            }
            case 3: {
                return hmpb.E(((byte)v1), ((byte)3)) && !hmpb.E(((byte)v1), ((byte)7));
            }
            default: {
                return false;
            }
        }
    }

    public final boolean k() {
        return this.m.h.a[11] == -86;
    }

    public final boolean l() {
        return this.m.j != 0 && this.m.j != 5;
    }

    public final boolean m(int v) {
        byte[] arr_b = this.m.a.c(v).a;
        int v1 = arr_b[5];
        int v2 = arr_b[6];
        int v3 = arr_b[7];
        int v4 = arr_b[8];
        return hmpb.E(((byte)v1), ((byte)0)) == (hmpb.E(((byte)v1), ((byte)4)) ^ 1) && hmpb.E(((byte)v1), ((byte)1)) == (hmpb.E(((byte)v1), ((byte)5)) ^ 1) && hmpb.E(((byte)v1), ((byte)2)) == (hmpb.E(((byte)v1), ((byte)6)) ^ 1) && hmpb.E(((byte)v1), ((byte)3)) == (hmpb.E(((byte)v1), ((byte)7)) ^ 1) && hmpb.h(((byte)v4), ((byte)v3)) && hmpb.E(((byte)v4), ((byte)3)) == (hmpb.E(((byte)v2), ((byte)7)) ^ 1) && hmpb.E(((byte)v4), ((byte)2)) == (hmpb.E(((byte)v2), ((byte)6)) ^ 1) && hmpb.E(((byte)v4), ((byte)1)) == (hmpb.E(((byte)v2), ((byte)5)) ^ 1) && hmpb.E(((byte)v4), ((byte)0)) == (hmpb.E(((byte)v2), ((byte)4)) ^ 1) && hmpb.h(((byte)v3), ((byte)v2));
    }

    public final byte[] n(byte[] arr_b) {
        byte[] arr_b1 = this.G(this.k.c);
        hmpy.C(this.k.c);
        this.k.c = null;
        return hmpy.F(new byte[][]{arr_b, arr_b1});
    }

    public final byte[] o(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        int v = hmpb.c(arr_b);
        int v1 = hmpb.a(arr_b, 3, 2);
        hmpq hmpq0 = v <= 0 || v > 0xFF ? null : this.Q(v);
        if(hmpq0 == null && v1 > 0 && v1 <= 0xFF) {
            hmpq0 = this.Q(v1);
        }
        hmpt hmpt0 = this.l;
        if(hmpt0.a && hmpq0 != null) {
            hmpb.f(Long.compare(hmpb.B(hmpt0.c), 0xFFFFFFFFL) < 0, 5);
            if(hmox.ac(arr_b[0])) {
                if(hmpq0.b()) {
                    this.af(hmpq0, arr_b, arr_b2);
                    return hmpy.F(new byte[][]{arr_b1, hmpt0.c, hmpt0.d, this.G(this.Y(arr_b1[0], true))});
                }
                return hmpy.F(new byte[][]{arr_b1, this.G(this.Y(arr_b1[0], false))});
            }
            if(hmpq0.b()) {
                this.af(hmpq0, arr_b, arr_b2);
                return hmpy.F(new byte[][]{arr_b1, Arrays.copyOfRange(hmpq0.b, 0, 4), Arrays.copyOfRange(hmpq0.b, 4, 12)});
            }
            return arr_b1;
        }
        this.k.e();
        return hmox.ac(arr_b[0]) ? hmpy.F(new byte[][]{arr_b1, this.G(this.Y(arr_b1[0], false))}) : arr_b1;
    }

    public final byte[] p(byte[] arr_b, byte[] arr_b1) {
        int v = hmpb.c(arr_b);
        hmpq hmpq0 = v <= 0 || v > 0xFF ? null : this.Q(v);
        hmpt hmpt0 = this.l;
        if(hmpt0.a && hmpq0 != null) {
            if(hmox.ac(arr_b[0])) {
                if(hmpq0.b()) {
                    this.ag(hmpq0, arr_b);
                    return hmpy.F(new byte[][]{arr_b1, hmpt0.c, hmpt0.d, this.G(this.Y(arr_b1[0], true))});
                }
                return hmpy.F(new byte[][]{arr_b1, this.G(this.Y(arr_b1[0], false))});
            }
            if(hmpq0.b()) {
                this.ag(hmpq0, arr_b);
                return hmpy.F(new byte[][]{arr_b1, Arrays.copyOfRange(hmpq0.b, 0, 4), Arrays.copyOfRange(hmpq0.b, 4, 12)});
            }
            return arr_b1;
        }
        return hmox.ac(arr_b[0]) ? hmpy.F(new byte[][]{arr_b1, this.G(this.Y(arr_b1[0], false))}) : arr_b1;
    }

    public final byte[] q(byte b, byte[] arr_b) {
        return hmpy.F(new byte[][]{new byte[]{b}, this.k.h(), this.H(), arr_b});
    }

    public final byte[] r() {
        byte[] arr_b = this.k.h();
        byte[] arr_b1 = this.k.j();
        return hmpy.F(new byte[][]{this.H(), arr_b, arr_b1, arr_b, arr_b1, arr_b, arr_b1});
    }

    public final byte[] s() {
        byte[] arr_b = this.k.h();
        byte[] arr_b1 = this.k.j();
        return hmpy.F(new byte[][]{arr_b, arr_b1, arr_b, arr_b1, arr_b, arr_b1, this.H()});
    }

    public final byte[] t(byte[] arr_b) {
        byte[] arr_b1 = hmpy.F(new byte[][]{new byte[]{(byte)0x90}, this.k.j(), this.H(), arr_b});
        return this.h.i(this.k.v, arr_b1, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2);
    }

    public final byte[] u(byte[] arr_b) {
        byte[] arr_b1;
        hmps hmps0 = this.k;
        if(hmps0.k() == 1) {
            arr_b1 = this.r();
        }
        else {
            byte[] arr_b2 = hmps0.h();
            byte[] arr_b3 = hmps0.j();
            byte[] arr_b4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.h.g(hmps0.u, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, hmpy.F(new byte[][]{new byte[]{-91, 90}, this.H(), arr_b2, arr_b3, hmox.r}), arr_b4, false);
            arr_b1 = arr_b4;
        }
        byte[] arr_b5 = new byte[arr_b.length];
        this.h.f(hmps0.u, arr_b1, arr_b, arr_b5, false);
        return arr_b5;
    }

    public final byte[] v(byte[] arr_b) {
        byte[] arr_b1;
        hmps hmps0 = this.k;
        if(hmps0.k() == 1) {
            arr_b1 = this.s();
        }
        else {
            byte[] arr_b2 = hmps0.h();
            byte[] arr_b3 = hmps0.j();
            byte[] arr_b4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            this.h.g(hmps0.u, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, hmpy.F(new byte[][]{new byte[]{90, -91}, this.H(), arr_b2, arr_b3, hmox.r}), arr_b4, false);
            arr_b1 = arr_b4;
        }
        byte[] arr_b5 = new byte[arr_b.length];
        this.h.g(hmps0.u, arr_b1, arr_b, arr_b5, false);
        return arr_b5;
    }

    public final byte[] w(byte[] arr_b) {
        int v = hmpb.c(arr_b);
        this.U(arr_b);
        byte[] arr_b1 = this.u(Arrays.copyOfRange(arr_b, 3, arr_b.length - 8));
        hmpb.f(Arrays.equals(Arrays.copyOfRange(arr_b1, 4, arr_b1.length), hmox.p), 6);
        byte[] arr_b2 = hmpb.L(Arrays.copyOfRange(arr_b1, 0, 4));
        hmpb.g(v);
        this.ab(v, arr_b2, 2);
        this.k.m();
        return new byte[]{(byte)0x90};
    }

    public final byte[] x(byte[] arr_b) {
        this.aa(2, arr_b);
        return new byte[]{(byte)0x90};
    }

    protected final byte[] y(byte[] arr_b) {
        int v = hmpb.c(arr_b);
        this.U(arr_b);
        byte[] arr_b1 = this.u(Arrays.copyOfRange(arr_b, 3, arr_b.length - 8));
        hmpb.f(Arrays.equals(Arrays.copyOfRange(arr_b1, 4, arr_b1.length), hmox.p), 6);
        byte[] arr_b2 = hmpb.L(Arrays.copyOfRange(arr_b1, 0, 4));
        hmpb.g(v);
        this.ab(v, arr_b2, 1);
        this.k.m();
        return new byte[]{(byte)0x90};
    }

    public final byte[] z(byte[] arr_b) {
        this.aa(1, arr_b);
        return new byte[]{(byte)0x90};
    }
}

