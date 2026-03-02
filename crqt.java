import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import j..time.ZonedDateTime;
import j..time.format.DateTimeFormatter;
import j..time.format.DateTimeParseException;
import j..util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

public final class crqt extends crqc {
    private long a;

    public crqt(crqq crqq0) {
        super(crqq0);
    }

    static final void A(crsn crsn0, String s, Object object0) {
        List list0 = DesugarCollections.unmodifiableList(((crso)crsn0.b_message).c);
        int v;
        for(v = 0; true; ++v) {
            if(v >= list0.size()) {
                v = -1;
                break;
            }
            if(s.equals(((crsq)list0.get(v)).c)) {
                break;
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crsq crsq0 = (crsq)hftp0.b_message;
        crsq0.b |= 1;
        crsq0.c = s;
        long v1 = (long)(((Long)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crsq crsq1 = (crsq)hftp0.b_message;
        crsq1.b |= 4;
        crsq1.e = v1;
        if(v >= 0) {
            crsn0.o(v, hftp0);
            return;
        }
        crsn0.n(hftp0);
    }

    public static final void B(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
    }

    static final Bundle C(List list0) {
        Bundle bundle0 = new Bundle();
        for(Object object0: list0) {
            crsq crsq0 = (crsq)object0;
            String s = crsq0.c;
            int v = crsq0.b;
            if((v & 16) != 0) {
                bundle0.putDouble(s, crsq0.g);
            }
            else if((v & 8) != 0) {
                bundle0.putFloat(s, crsq0.f);
            }
            else if((v & 2) != 0) {
                bundle0.putString(s, crsq0.d);
            }
            else if((v & 4) != 0) {
                bundle0.putLong(s, crsq0.e);
            }
        }
        return bundle0;
    }

    static final crsq D(crso crso0, String s) {
        for(Object object0: crso0.c) {
            crsq crsq0 = (crsq)object0;
            if(crsq0.c.equals(s)) {
                return crsq0;
            }
        }
        return null;
    }

    public static final String E(boolean z, boolean z1, boolean z2) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            stringBuilder0.append("Dynamic ");
        }
        if(z1) {
            stringBuilder0.append("Sequence ");
        }
        if(z2) {
            stringBuilder0.append("Session-Scoped ");
        }
        return stringBuilder0.toString();
    }

    static final String F(Map map0, String s) {
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(s.equalsIgnoreCase(((String)map$Entry0.getKey()))) {
                    return map$Entry0.getValue() == null || ((List)map$Entry0.getValue()).isEmpty() ? null : ((String)((List)map$Entry0.getValue()).get(0));
                }
            }
        }
        return null;
    }

    public static final Object G(crsq crsq0) {
        int v = crsq0.b;
        if((v & 2) != 0) {
            return crsq0.d;
        }
        if((v & 4) != 0) {
            return (long)crsq0.e;
        }
        if((v & 16) != 0) {
            return (double)crsq0.g;
        }
        return crsq0.h.size() > 0 ? crqt.z(crsq0.h) : null;
    }

    final void H(ProtoLiteBuilder hftp0, Object object0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crtg crtg0 = (crtg)hftp0.b_message;
        crtg0.b &= -5;
        crtg0.e = crtg.a.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((crtg)hftv0).b &= -9;
        ((crtg)hftv0).f = 0L;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((crtg)hftv1).b &= -33;
        ((crtg)hftv1).h = 0.0;
        if((object0 instanceof String)) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            crtg crtg1 = (crtg)hftp0.b_message;
            crtg1.b |= 4;
            crtg1.e = (String)object0;
            return;
        }
        if((object0 instanceof Long)) {
            long v = (long)(((Long)object0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crtg crtg2 = (crtg)hftp0.b_message;
            crtg2.b |= 8;
            crtg2.f = v;
            return;
        }
        if((object0 instanceof Double)) {
            double f = (double)(((Double)object0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crtg crtg3 = (crtg)hftp0.b_message;
            crtg3.b |= 0x20;
            crtg3.h = f;
            return;
        }
        this.aJ().c.b("Ignoring invalid (type) user attribute value", object0);
    }

    public static final void I(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 == null) {
            return;
        }
        crqt.B(stringBuilder0, v + 1);
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
        stringBuilder0.append('\n');
    }

    static final boolean J(AppMetadata appMetadata0) {
        batl.s(appMetadata0);
        return !TextUtils.isEmpty(appMetadata0.b);
    }

    static final Object K(crso crso0, String s) {
        crsq crsq0 = crqt.D(crso0, s);
        return crsq0 == null ? null : crqt.G(crsq0);
    }

    final void L(ProtoLiteBuilder hftp0, Object object0) {
        batl.s(object0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crsq crsq0 = (crsq)hftp0.b_message;
        crsq0.b &= -3;
        crsq crsq1 = crsq.a;
        crsq0.d = crsq1.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crsq crsq2 = (crsq)hftp0.b_message;
        crsq2.b &= -5;
        crsq2.e = 0L;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        crsq crsq3 = (crsq)hftp0.b_message;
        crsq3.b &= -17;
        crsq3.g = 0.0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((crsq)hftp0.b_message).h = hfvv.a;
        if((object0 instanceof String)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crsq crsq4 = (crsq)hftp0.b_message;
            ((String)object0).getClass();
            crsq4.b |= 2;
            crsq4.d = (String)object0;
            return;
        }
        if((object0 instanceof Long)) {
            long v = (long)(((Long)object0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crsq crsq5 = (crsq)hftp0.b_message;
            crsq5.b |= 4;
            crsq5.e = v;
            return;
        }
        if((object0 instanceof Double)) {
            double f = (double)(((Double)object0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crsq crsq6 = (crsq)hftp0.b_message;
            crsq6.b |= 16;
            crsq6.g = f;
            return;
        }
        if((object0 instanceof Bundle[])) {
            ArrayList arrayList0 = new ArrayList();
            int v1 = 0;
            while(v1 < ((Bundle[])object0).length) {
                Bundle bundle0 = ((Bundle[])object0)[v1];
                if(bundle0 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crsq1).v_newBuilder();
                    for(Object object1: bundle0.keySet()) {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)crsq1).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        crsq crsq7 = (crsq)hftp2.b_message;
                        ((String)object1).getClass();
                        crsq7.b |= 1;
                        crsq7.c = (String)object1;
                        Object object2 = bundle0.get(((String)object1));
                        if((object2 instanceof Long)) {
                            long v2 = (long)(((Long)object2));
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            crsq crsq8 = (crsq)hftp2.b_message;
                            crsq8.b |= 4;
                            crsq8.e = v2;
                        }
                        else if((object2 instanceof String)) {
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            crsq crsq9 = (crsq)hftp2.b_message;
                            ((String)object2).getClass();
                            crsq9.b |= 2;
                            crsq9.d = (String)object2;
                        }
                        else {
                            if(!(object2 instanceof Double)) {
                                continue;
                            }
                            double f1 = (double)(((Double)object2));
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            crsq crsq10 = (crsq)hftp2.b_message;
                            crsq10.b |= 16;
                            crsq10.g = f1;
                        }
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        crsq crsq11 = (crsq)hftp1.b_message;
                        crsq crsq12 = (crsq)hftp2.N_build();
                        crsq12.getClass();
                        crsq11.b();
                        crsq11.h.add(crsq12);
                    }
                    if(((crsq)hftp1.b_message).h.size() > 0) {
                        arrayList0.add(((crsq)hftp1.N_build()));
                    }
                }
                ++v1;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crsq crsq13 = (crsq)hftp0.b_message;
            crsq13.b();
            hfrj.E(arrayList0, crsq13.h);
            return;
        }
        this.aJ().c.b("Ignoring invalid (type) event param value", object0);
    }

    public static final void M(StringBuilder stringBuilder0, int v, String s, crrj crrj0) {
        String s1;
        if(crrj0 == null) {
            return;
        }
        crqt.B(stringBuilder0, v);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if((crrj0.b & 1) != 0) {
            int v1 = crri.a(crrj0.c);
            if(v1 == 0) {
                s1 = "UNKNOWN_COMPARISON_TYPE";
            }
            else {
                switch(v1) {
                    case 1: {
                        s1 = "UNKNOWN_COMPARISON_TYPE";
                        break;
                    }
                    case 2: {
                        s1 = "LESS_THAN";
                        break;
                    }
                    case 3: {
                        s1 = "GREATER_THAN";
                        break;
                    }
                    case 4: {
                        s1 = "EQUAL";
                        break;
                    }
                    default: {
                        s1 = "BETWEEN";
                    }
                }
            }
            crqt.I(stringBuilder0, v, "comparison_type", s1);
        }
        if((crrj0.b & 2) != 0) {
            crqt.I(stringBuilder0, v, "match_as_float", Boolean.valueOf(crrj0.d));
        }
        if((crrj0.b & 4) != 0) {
            crqt.I(stringBuilder0, v, "comparison_value", crrj0.e);
        }
        if((crrj0.b & 8) != 0) {
            crqt.I(stringBuilder0, v, "min_comparison_value", crrj0.f);
        }
        if((crrj0.b & 16) != 0) {
            crqt.I(stringBuilder0, v, "max_comparison_value", crrj0.g);
        }
        crqt.B(stringBuilder0, v);
        stringBuilder0.append("}\n");
    }

    static final Object N(crso crso0, String s, Object object0) {
        Object object1 = crqt.K(crso0, s);
        return object1 == null ? object0 : object1;
    }

    private final void O(StringBuilder stringBuilder0, int v, List list0) {
        if(list0 != null) {
            for(Object object0: list0) {
                crsq crsq0 = (crsq)object0;
                if(crsq0 != null) {
                    crqt.B(stringBuilder0, v + 1);
                    stringBuilder0.append("param {\n");
                    Double double0 = null;
                    crqt.I(stringBuilder0, v + 1, "name", ((crsq0.b & 1) == 0 ? null : this.ao().d(crsq0.c)));
                    crqt.I(stringBuilder0, v + 1, "string_value", ((crsq0.b & 2) == 0 ? null : crsq0.d));
                    crqt.I(stringBuilder0, v + 1, "int_value", ((crsq0.b & 4) == 0 ? null : ((long)crsq0.e)));
                    if((crsq0.b & 16) != 0) {
                        double0 = (double)crsq0.g;
                    }
                    crqt.I(stringBuilder0, v + 1, "double_value", double0);
                    if(crsq0.h.size() > 0) {
                        this.O(stringBuilder0, v + 1, crsq0.h);
                    }
                    crqt.B(stringBuilder0, v + 1);
                    stringBuilder0.append("}\n");
                }
            }
        }
    }

    private static final void P(Uri.Builder uri$Builder0, String s, String s1, Set set0) {
        if(!set0.contains(s) && !TextUtils.isEmpty(s1)) {
            uri$Builder0.appendQueryParameter(s, s1);
        }
    }

    private static final void Q(Uri.Builder uri$Builder0, String[] arr_s, Bundle bundle0, Set set0) {
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split(",");
            String s = arr_s1[0];
            String s1 = arr_s1[arr_s1.length - 1];
            String s2 = bundle0.getString(s);
            if(s2 != null) {
                crqt.P(uri$Builder0, s1, s2, set0);
            }
        }
    }

    private static final void R(StringBuilder stringBuilder0, String s, crsx crsx0) {
        if(crsx0 == null) {
            return;
        }
        crqt.B(stringBuilder0, 3);
        stringBuilder0.append(s);
        stringBuilder0.append(" {\n");
        if(crsx0.c.size() != 0) {
            crqt.B(stringBuilder0, 4);
            stringBuilder0.append("results: ");
            int v = 0;
            for(Object object0: crsx0.c) {
                if(v != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object0));
                ++v;
            }
            stringBuilder0.append('\n');
        }
        if(crsx0.b.size() != 0) {
            crqt.B(stringBuilder0, 4);
            stringBuilder0.append("status: ");
            int v1 = 0;
            for(Object object1: crsx0.b) {
                if(v1 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((Long)object1));
                ++v1;
            }
            stringBuilder0.append('\n');
        }
        if(crsx0.d.size() != 0) {
            crqt.B(stringBuilder0, 4);
            stringBuilder0.append("dynamic_filter_timestamps: {");
            int v2 = 0;
            for(Object object2: crsx0.d) {
                crsm crsm0 = (crsm)object2;
                if(v2 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((crsm0.b & 1) == 0 ? null : ((int)crsm0.c)));
                stringBuilder0.append(":");
                stringBuilder0.append(((crsm0.b & 2) == 0 ? null : ((long)crsm0.d)));
                ++v2;
            }
            stringBuilder0.append("}\n");
        }
        if(crsx0.e.size() != 0) {
            crqt.B(stringBuilder0, 4);
            stringBuilder0.append("sequence_filter_timestamps: {");
            int v3 = 0;
            for(Object object3: crsx0.e) {
                crsy crsy0 = (crsy)object3;
                if(v3 != 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((crsy0.b & 1) == 0 ? null : ((int)crsy0.c)));
                stringBuilder0.append(": [");
                int v4 = 0;
                for(Object object4: crsy0.d) {
                    long v5 = (long)(((Long)object4));
                    if(v4 != 0) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(v5);
                    ++v4;
                }
                stringBuilder0.append("]");
                ++v3;
            }
            stringBuilder0.append("}\n");
        }
        crqt.B(stringBuilder0, 3);
        stringBuilder0.append("}\n");
    }

    @Override  // crqc
    protected final void aM() {
    }

    static int b(crst crst0, String s) {
        if(crst0 != null) {
            for(int v = 0; v < ((crsu)crst0.b_message).f.size(); ++v) {
                if(s.equals(((crtg)((crsu)crst0.b_message).f.get(v)).d)) {
                    return v;
                }
            }
        }
        return -1;
    }

    final long c(String s) {
        return TextUtils.isEmpty(s) ? 0L : this.d(s.getBytes(Charset.forName("UTF-8")));
    }

    final long d(byte[] arr_b) {
        batl.s(arr_b);
        this.aq().n();
        MessageDigest messageDigest0 = crqx.D();
        if(messageDigest0 == null) {
            this.aJ().c.a("Failed to get MD5");
            return 0L;
        }
        return crqx.s(messageDigest0.digest(arr_b));
    }

    final long e(String s) {
        try {
            return ZonedDateTime.parse(s, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        }
        catch(DateTimeParseException unused_ex) {
            this.aJ().f.b("Unable to parse header time, time", s);
            return 0L;
        }
    }

    final Bundle g(Map map0, boolean z) {
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Object object1 = map0.get(s);
            if(object1 == null) {
                bundle0.putString(s, null);
            }
            else if((object1 instanceof Long)) {
                bundle0.putLong(s, ((Long)object1).longValue());
            }
            else if((object1 instanceof Double)) {
                bundle0.putDouble(s, ((Double)object1).doubleValue());
            }
            else if(!(object1 instanceof ArrayList)) {
                bundle0.putString(s, object1.toString());
            }
            else if(z) {
                ArrayList arrayList0 = new ArrayList();
                int v = ((ArrayList)object1).size();
                for(int v1 = 0; v1 < v; ++v1) {
                    arrayList0.add(this.g(((Map)((ArrayList)object1).get(v1)), false));
                }
                bundle0.putParcelableArray(s, ((Parcelable[])arrayList0.toArray(new Parcelable[0])));
            }
        }
        return bundle0;
    }

    final Parcelable i(byte[] arr_b, Parcelable.Creator parcelable$Creator0) {
        Parcelable parcelable0 = null;
        if(arr_b == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.unmarshall(arr_b, 0, arr_b.length);
            parcel0.setDataPosition(0);
            parcelable0 = (Parcelable)parcelable$Creator0.createFromParcel(parcel0);
        }
        catch(batz unused_ex) {
            this.aJ().c.a("Failed to load parcelable from buffer");
        }
        finally {
            parcel0.recycle();
        }
        return parcelable0;
    }

    final EventParcel j(vzo vzo0) {
        Bundle bundle0 = this.g(vzo0.c, true);
        if(bundle0.containsKey("_o")) {
            Object object0 = bundle0.get("_o");
            return object0 == null ? new EventParcel((crmc.b(vzo0.a) == null ? vzo0.a : crmc.b(vzo0.a)), new EventParams(bundle0), "app", vzo0.b, 0L) : new EventParcel((crmc.b(vzo0.a) == null ? vzo0.a : crmc.b(vzo0.a)), new EventParams(bundle0), object0.toString(), vzo0.b, 0L);
        }
        return new EventParcel((crmc.b(vzo0.a) == null ? vzo0.a : crmc.b(vzo0.a)), new EventParams(bundle0), "app", vzo0.b, 0L);
    }

    final TriggerUriParcel k(String s, crst crst0, crsn crsn0, String s1) {
        hvhs.c();
        if(!this.am().u(s, crif.aC)) {
            return null;
        }
        long v = System.currentTimeMillis();
        HashSet hashSet0 = new HashSet(Arrays.asList(this.am().r(s, crif.an).split(",")));
        crpy crpy0 = this.ay();
        String s2 = crpy0.au().f(s);
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme(crpy0.am().r(s, crif.ag));
        if(TextUtils.isEmpty(s2)) {
            uri$Builder0.authority(crpy0.am().r(s, crif.ah));
        }
        else {
            uri$Builder0.authority(s2 + "." + crpy0.am().r(s, crif.ah));
        }
        uri$Builder0.path(crpy0.am().r(s, crif.ai));
        crqt.P(uri$Builder0, "gmp_app_id", ((crsu)crst0.b_message).B, hashSet0);
        crqt.P(uri$Builder0, "gmp_version", String.valueOf(this.am().i()), hashSet0);
        String s3 = ((crsu)crst0.b_message).x;
        crie crie0 = crif.aF;
        if(this.am().u(s, crie0) && this.au().s(s)) {
            s3 = "";
        }
        crqt.P(uri$Builder0, "app_instance_id", s3, hashSet0);
        crqt.P(uri$Builder0, "rdid", ((crsu)crst0.b_message).v, hashSet0);
        crqt.P(uri$Builder0, "bundle_id", ((crsu)crst0.b_message).r, hashSet0);
        String s4 = ((crso)crsn0.b_message).d;
        String s5 = crmc.a(s4);
        if(!TextUtils.isEmpty(s5)) {
            s4 = s5;
        }
        crqt.P(uri$Builder0, "app_event_name", s4, hashSet0);
        crqt.P(uri$Builder0, "app_version", String.valueOf(((crsu)crst0.b_message).F), hashSet0);
        String s6 = ((crsu)crst0.b_message).m;
        if(this.am().u(s, crie0) && this.au().t(s) && !TextUtils.isEmpty(s6)) {
            int v1 = s6.indexOf(".");
            if(v1 != -1) {
                s6 = s6.substring(0, v1);
            }
        }
        crqt.P(uri$Builder0, "os_version", s6, hashSet0);
        crqt.P(uri$Builder0, "timestamp", String.valueOf(((crso)crsn0.b_message).e), hashSet0);
        String s7 = "1";
        if(((crsu)crst0.b_message).w) {
            crqt.P(uri$Builder0, "lat", "1", hashSet0);
        }
        crqt.P(uri$Builder0, "privacy_sandbox_version", String.valueOf(((crsu)crst0.b_message).W), hashSet0);
        crqt.P(uri$Builder0, "trigger_uri_source", "1", hashSet0);
        crqt.P(uri$Builder0, "trigger_uri_timestamp", String.valueOf(v), hashSet0);
        crqt.P(uri$Builder0, "request_uuid", s1, hashSet0);
        List list0 = DesugarCollections.unmodifiableList(((crso)crsn0.b_message).c);
        Bundle bundle0 = new Bundle();
        for(Object object0: list0) {
            crsq crsq0 = (crsq)object0;
            String s8 = crsq0.c;
            int v2 = crsq0.b;
            if((v2 & 16) != 0) {
                bundle0.putString(s8, String.valueOf(crsq0.g));
            }
            else if((v2 & 8) != 0) {
                bundle0.putString(s8, String.valueOf(crsq0.f));
            }
            else if((v2 & 2) != 0) {
                bundle0.putString(s8, crsq0.d);
            }
            else if((v2 & 4) != 0) {
                bundle0.putString(s8, String.valueOf(crsq0.e));
            }
        }
        crqt.Q(uri$Builder0, this.am().r(s, crif.am).split("\\|"), bundle0, hashSet0);
        List list1 = DesugarCollections.unmodifiableList(((crsu)crst0.b_message).f);
        Bundle bundle1 = new Bundle();
        for(Object object1: list1) {
            crtg crtg0 = (crtg)object1;
            String s9 = crtg0.d;
            int v3 = crtg0.b;
            if((v3 & 0x20) != 0) {
                bundle1.putString(s9, String.valueOf(crtg0.h));
            }
            else if((v3 & 16) != 0) {
                bundle1.putString(s9, String.valueOf(crtg0.g));
            }
            else if((v3 & 4) != 0) {
                bundle1.putString(s9, crtg0.e);
            }
            else if((v3 & 8) != 0) {
                bundle1.putString(s9, String.valueOf(crtg0.f));
            }
        }
        crqt.Q(uri$Builder0, this.am().r(s, crif.al).split("\\|"), bundle1, hashSet0);
        if(!((crsu)crst0.b_message).U) {
            s7 = "0";
        }
        crqt.P(uri$Builder0, "dma", s7, hashSet0);
        if(!((crsu)crst0.b_message).V.isEmpty()) {
            crqt.P(uri$Builder0, "dma_cps", ((crsu)crst0.b_message).V, hashSet0);
        }
        crsu crsu0 = (crsu)crst0.b_message;
        if((crsu0.c & 0x1000000) != 0) {
            crsd crsd0 = crsu0.Z == null ? crsd.a : crsu0.Z;
            if(!crsd0.c.isEmpty()) {
                crqt.P(uri$Builder0, "dl_gclid", crsd0.c, hashSet0);
            }
            if(!crsd0.d.isEmpty()) {
                crqt.P(uri$Builder0, "dl_gbraid", crsd0.d, hashSet0);
            }
            if(!crsd0.e.isEmpty()) {
                crqt.P(uri$Builder0, "dl_gs", crsd0.e, hashSet0);
            }
            long v4 = crsd0.f;
            if(v4 > 0L) {
                crqt.P(uri$Builder0, "dl_ss_ts", String.valueOf(v4), hashSet0);
            }
            if(!crsd0.g.isEmpty()) {
                crqt.P(uri$Builder0, "mr_gclid", crsd0.g, hashSet0);
            }
            if(!crsd0.h.isEmpty()) {
                crqt.P(uri$Builder0, "mr_gbraid", crsd0.h, hashSet0);
            }
            if(!crsd0.i.isEmpty()) {
                crqt.P(uri$Builder0, "mr_gs", crsd0.i, hashSet0);
            }
            long v5 = crsd0.j;
            if(v5 > 0L) {
                crqt.P(uri$Builder0, "mr_click_ts", String.valueOf(v5), hashSet0);
            }
        }
        return new TriggerUriParcel(uri$Builder0.build().toString(), v, 1);
    }

    final crso l(crdm crdm0) {
        crsn crsn0 = (crsn)((ProtoLiteMessage)crso.a).v_newBuilder();
        if(!crsn0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)crsn0).ensureMutable();
        }
        crso crso0 = (crso)crsn0.b_message;
        crso0.b |= 4;
        crso0.f = crdm0.e;
        EventParams eventParams0 = crdm0.f;
        crdo crdo0 = new crdo(eventParams0);
        while(crdo0.hasNext()) {
            String s = crdo0.a();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crsq crsq0 = (crsq)hftp0.b_message;
            s.getClass();
            crsq0.b |= 1;
            crsq0.c = s;
            Object object0 = eventParams0.c(s);
            batl.s(object0);
            this.L(hftp0, object0);
            crsn0.n(hftp0);
        }
        String s1 = crdm0.c;
        if(!TextUtils.isEmpty(s1) && eventParams0.c("_o") == null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crsq.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            crsq crsq1 = (crsq)hftp1.b_message;
            crsq1.b |= 1;
            crsq1.c = "_o";
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            crsq crsq2 = (crsq)hftp1.b_message;
            s1.getClass();
            crsq2.b |= 2;
            crsq2.d = s1;
            crsn0.k(((crsq)hftp1.N_build()));
        }
        return (crso)((ProtoLiteBuilder)crsn0).N_build();
    }

    static Builder o(Builder hfvl0, byte[] arr_b) {
        hftc hftc0 = hftc.a();
        return hftc0 == null ? hfvl0.mergeFromBytes(arr_b) : hfvl0.D(arr_b, hftc0);
    }

    final String p(crss crss0) {
        String s3;
        String s2;
        String s1;
        String s;
        if(crss0 == null) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\nbatch {\n");
        if((crss0.b & 2) != 0) {
            crqt.I(stringBuilder0, 0, "upload_subdomain", crss0.e);
        }
        if((crss0.b & 1) != 0) {
            crqt.I(stringBuilder0, 0, "sgtm_join_id", crss0.d);
        }
        for(Object object0: crss0.c) {
            crsu crsu0 = (crsu)object0;
            if(crsu0 != null) {
                crqt.B(stringBuilder0, 1);
                stringBuilder0.append("bundle {\n");
                if((crsu0.b & 1) != 0) {
                    crqt.I(stringBuilder0, 1, "protocol_version", Integer.valueOf(crsu0.d));
                }
                hvih.c();
                if(this.am().u(crsu0.r, crif.az) && (crsu0.c & 0x2000) != 0) {
                    crqt.I(stringBuilder0, 1, "session_stitching_token", crsu0.O);
                }
                crqt.I(stringBuilder0, 1, "platform", crsu0.l);
                if((crsu0.b & 0x4000) != 0) {
                    crqt.I(stringBuilder0, 1, "gmp_version", Long.valueOf(crsu0.t));
                }
                if((crsu0.b & 0x8000) != 0) {
                    crqt.I(stringBuilder0, 1, "uploading_gmp_version", Long.valueOf(crsu0.u));
                }
                if((crsu0.c & 16) != 0) {
                    crqt.I(stringBuilder0, 1, "dynamite_version", Long.valueOf(crsu0.L));
                }
                if((crsu0.b & 0x20000000) != 0) {
                    crqt.I(stringBuilder0, 1, "config_version", Long.valueOf(crsu0.H));
                }
                crqt.I(stringBuilder0, 1, "gmp_app_id", crsu0.B);
                crqt.I(stringBuilder0, 1, "app_id", crsu0.r);
                crqt.I(stringBuilder0, 1, "app_version", crsu0.s);
                if((crsu0.b & 0x2000000) != 0) {
                    crqt.I(stringBuilder0, 1, "app_version_major", Integer.valueOf(crsu0.F));
                }
                crqt.I(stringBuilder0, 1, "firebase_instance_id", crsu0.E);
                if((crsu0.b & 0x80000) != 0) {
                    crqt.I(stringBuilder0, 1, "dev_cert_hash", Long.valueOf(crsu0.y));
                }
                crqt.I(stringBuilder0, 1, "app_store", crsu0.q);
                if((crsu0.b & 2) != 0) {
                    crqt.I(stringBuilder0, 1, "upload_timestamp_millis", Long.valueOf(crsu0.g));
                }
                if((crsu0.b & 4) != 0) {
                    crqt.I(stringBuilder0, 1, "start_timestamp_millis", Long.valueOf(crsu0.h));
                }
                if((crsu0.b & 8) != 0) {
                    crqt.I(stringBuilder0, 1, "end_timestamp_millis", Long.valueOf(crsu0.i));
                }
                if((crsu0.b & 16) != 0) {
                    crqt.I(stringBuilder0, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(crsu0.j));
                }
                if((crsu0.b & 0x20) != 0) {
                    crqt.I(stringBuilder0, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(crsu0.k));
                }
                crqt.I(stringBuilder0, 1, "app_instance_id", crsu0.x);
                crqt.I(stringBuilder0, 1, "resettable_device_id", crsu0.v);
                crqt.I(stringBuilder0, 1, "ds_id", crsu0.I);
                if((crsu0.b & 0x20000) != 0) {
                    crqt.I(stringBuilder0, 1, "limited_ad_tracking", Boolean.valueOf(crsu0.w));
                }
                crqt.I(stringBuilder0, 1, "os_version", crsu0.m);
                crqt.I(stringBuilder0, 1, "device_model", crsu0.n);
                crqt.I(stringBuilder0, 1, "user_default_language", crsu0.o);
                if((crsu0.b & 0x400) != 0) {
                    crqt.I(stringBuilder0, 1, "time_zone_offset_minutes", Integer.valueOf(crsu0.p));
                }
                if((crsu0.b & 0x100000) != 0) {
                    crqt.I(stringBuilder0, 1, "bundle_sequential_index", Integer.valueOf(crsu0.z));
                }
                if((crsu0.c & 0x800000) != 0) {
                    crqt.I(stringBuilder0, 1, "delivery_index", Integer.valueOf(crsu0.Y));
                }
                if((crsu0.b & 0x800000) != 0) {
                    crqt.I(stringBuilder0, 1, "service_upload", Boolean.valueOf(crsu0.C));
                }
                crqt.I(stringBuilder0, 1, "health_monitor", crsu0.A);
                if((crsu0.c & 2) != 0) {
                    crqt.I(stringBuilder0, 1, "retry_counter", Integer.valueOf(crsu0.J));
                }
                if((crsu0.c & 0x80) != 0) {
                    crqt.I(stringBuilder0, 1, "consent_signals", crsu0.N);
                }
                if((crsu0.c & 0x40000) != 0) {
                    crqt.I(stringBuilder0, 1, "is_dma_region", Boolean.valueOf(crsu0.U));
                }
                if((crsu0.c & 0x80000) != 0) {
                    crqt.I(stringBuilder0, 1, "core_platform_services", crsu0.V);
                }
                if((crsu0.c & 0x20000) != 0) {
                    crqt.I(stringBuilder0, 1, "consent_diagnostics", crsu0.T);
                }
                if((crsu0.c & 0x8000) != 0) {
                    crqt.I(stringBuilder0, 1, "target_os_version", Long.valueOf(crsu0.R));
                }
                hvhs.c();
                if(this.am().u(crsu0.r, crif.aC)) {
                    crqt.I(stringBuilder0, 1, "ad_services_version", Integer.valueOf(crsu0.W));
                    if((crsu0.c & 0x400000) != 0) {
                        crse crse0 = crsu0.X == null ? crse.a : crsu0.X;
                        if(crse0 != null) {
                            crqt.B(stringBuilder0, 2);
                            stringBuilder0.append("attribution_eligibility_status {\n");
                            crqt.I(stringBuilder0, 2, "eligible", Boolean.valueOf(crse0.c));
                            crqt.I(stringBuilder0, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(crse0.d));
                            crqt.I(stringBuilder0, 2, "pre_r", Boolean.valueOf(crse0.e));
                            crqt.I(stringBuilder0, 2, "r_extensions_too_old", Boolean.valueOf(crse0.f));
                            crqt.I(stringBuilder0, 2, "adservices_extension_too_old", Boolean.valueOf(crse0.g));
                            crqt.I(stringBuilder0, 2, "ad_storage_not_allowed", Boolean.valueOf(crse0.h));
                            crqt.I(stringBuilder0, 2, "measurement_manager_disabled", Boolean.valueOf(crse0.i));
                            crqt.B(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                if((crsu0.c & 0x1000000) != 0) {
                    crsd crsd0 = crsu0.Z == null ? crsd.a : crsu0.Z;
                    crqt.B(stringBuilder0, 2);
                    stringBuilder0.append("ad_campaign_info {\n");
                    if((crsd0.b & 1) != 0) {
                        crqt.I(stringBuilder0, 2, "deep_link_gclid", crsd0.c);
                    }
                    if((crsd0.b & 2) != 0) {
                        crqt.I(stringBuilder0, 2, "deep_link_gbraid", crsd0.d);
                    }
                    if((crsd0.b & 4) != 0) {
                        crqt.I(stringBuilder0, 2, "deep_link_gad_source", crsd0.e);
                    }
                    if((crsd0.b & 8) != 0) {
                        crqt.I(stringBuilder0, 2, "deep_link_session_millis", Long.valueOf(crsd0.f));
                    }
                    if((crsd0.b & 16) != 0) {
                        crqt.I(stringBuilder0, 2, "market_referrer_gclid", crsd0.g);
                    }
                    if((crsd0.b & 0x20) != 0) {
                        crqt.I(stringBuilder0, 2, "market_referrer_gbraid", crsd0.h);
                    }
                    if((crsd0.b & 0x40) != 0) {
                        crqt.I(stringBuilder0, 2, "market_referrer_gad_source", crsd0.i);
                    }
                    if((crsd0.b & 0x80) != 0) {
                        crqt.I(stringBuilder0, 2, "market_referrer_click_millis", Long.valueOf(crsd0.j));
                    }
                    crqt.B(stringBuilder0, 2);
                    stringBuilder0.append("}\n");
                }
                if((crsu0.c & 0x8000000) != 0) {
                    crqt.I(stringBuilder0, 1, "batching_timestamp_millis", Long.valueOf(crsu0.ab));
                }
                if((crsu0.c & 0x4000000) != 0) {
                    crtf crtf0 = crsu0.aa == null ? crtf.a : crsu0.aa;
                    crqt.B(stringBuilder0, 2);
                    stringBuilder0.append("sgtm_diagnostics {\n");
                    int v = crte.a(crtf0.c);
                    if(v != 0) {
                        switch(v) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                s = "GA_UPLOAD";
                                goto label_134;
                            }
                            case 3: {
                                s = "SDK_CLIENT_UPLOAD";
                                goto label_134;
                            }
                            case 4: {
                                s = "PACKAGE_SERVICE_UPLOAD";
                                goto label_134;
                            }
                            default: {
                                s = "SDK_SERVICE_UPLOAD";
                                goto label_134;
                            }
                        }
                    }
                    s = "UPLOAD_TYPE_UNKNOWN";
                label_134:
                    crqt.I(stringBuilder0, 2, "upload_type", s);
                    crqt.I(stringBuilder0, 2, "client_upload_eligibility", (crta.b(crtf0.d) == null ? crta.a : crta.b(crtf0.d)).name());
                    int v1 = crtc.a(crtf0.e);
                    if(v1 != 0) {
                        switch(v1) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                s1 = "SERVICE_UPLOAD_ELIGIBLE";
                                goto label_151;
                            }
                            case 3: {
                                s1 = "NOT_IN_ROLLOUT";
                                goto label_151;
                            }
                            case 4: {
                                s1 = "MISSING_SGTM_SETTINGS";
                                goto label_151;
                            }
                            default: {
                                s1 = v1 == 5 ? "MISSING_SGTM_PROXY_INFO" : "NON_PLAY_MISSING_SGTM_SERVER_URL";
                                goto label_151;
                            }
                        }
                    }
                    s1 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                label_151:
                    crqt.I(stringBuilder0, 2, "service_upload_eligibility", s1);
                    crqt.B(stringBuilder0, 2);
                    stringBuilder0.append("}\n");
                }
                if((crsu0.c & 0x20000000) != 0) {
                    crsl crsl0 = crsu0.ac == null ? crsl.a : crsu0.ac;
                    crqt.B(stringBuilder0, 2);
                    stringBuilder0.append("consent_info_extra {\n");
                    for(Object object1: crsl0.b) {
                        crqt.B(stringBuilder0, 3);
                        stringBuilder0.append("limited_data_modes {\n");
                        int v2 = crsh.a(((crsi)object1).c);
                        if(v2 != 0) {
                            switch(v2) {
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    s2 = "AD_STORAGE";
                                    goto label_175;
                                }
                                case 3: {
                                    s2 = "ANALYTICS_STORAGE";
                                    goto label_175;
                                }
                                case 4: {
                                    s2 = "AD_USER_DATA";
                                    goto label_175;
                                }
                                default: {
                                    s2 = "AD_PERSONALIZATION";
                                    goto label_175;
                                }
                            }
                        }
                        s2 = "CONSENT_TYPE_UNSPECIFIED";
                    label_175:
                        crqt.I(stringBuilder0, 3, "type", s2);
                        int v3 = crsk.a(((crsi)object1).d);
                        if(v3 != 0) {
                            switch(v3) {
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    s3 = "LIMITED_MODE";
                                    goto label_184;
                                }
                                default: {
                                    s3 = "NO_DATA_MODE";
                                    goto label_184;
                                }
                            }
                        }
                        s3 = "NOT_LIMITED";
                    label_184:
                        crqt.I(stringBuilder0, 3, "mode", s3);
                        crqt.B(stringBuilder0, 3);
                        stringBuilder0.append("}\n");
                    }
                    crqt.B(stringBuilder0, 2);
                    stringBuilder0.append("}\n");
                }
                hfuo hfuo0 = crsu0.f;
                if(hfuo0 != null) {
                    for(Object object2: hfuo0) {
                        crtg crtg0 = (crtg)object2;
                        if(crtg0 != null) {
                            crqt.B(stringBuilder0, 2);
                            stringBuilder0.append("user_property {\n");
                            Double double0 = null;
                            crqt.I(stringBuilder0, 2, "set_timestamp_millis", ((crtg0.b & 1) == 0 ? null : ((long)crtg0.c)));
                            crqt.I(stringBuilder0, 2, "name", this.ao().e(crtg0.d));
                            crqt.I(stringBuilder0, 2, "string_value", crtg0.e);
                            crqt.I(stringBuilder0, 2, "int_value", ((crtg0.b & 8) == 0 ? null : ((long)crtg0.f)));
                            if((crtg0.b & 0x20) != 0) {
                                double0 = (double)crtg0.h;
                            }
                            crqt.I(stringBuilder0, 2, "double_value", double0);
                            crqt.B(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                hfuo hfuo1 = crsu0.D;
                if(hfuo1 != null) {
                    for(Object object3: hfuo1) {
                        crsf crsf0 = (crsf)object3;
                        if(crsf0 != null) {
                            crqt.B(stringBuilder0, 2);
                            stringBuilder0.append("audience_membership {\n");
                            if((crsf0.b & 1) != 0) {
                                crqt.I(stringBuilder0, 2, "audience_id", Integer.valueOf(crsf0.c));
                            }
                            if((crsf0.b & 8) != 0) {
                                crqt.I(stringBuilder0, 2, "new_audience", Boolean.valueOf(crsf0.f));
                            }
                            crqt.R(stringBuilder0, "current_data", (crsf0.d == null ? crsx.a : crsf0.d));
                            if((crsf0.b & 4) != 0) {
                                crqt.R(stringBuilder0, "previous_data", (crsf0.e == null ? crsx.a : crsf0.e));
                            }
                            crqt.B(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                hfuo hfuo2 = crsu0.e;
                if(hfuo2 != null) {
                    for(Object object4: hfuo2) {
                        crso crso0 = (crso)object4;
                        if(crso0 != null) {
                            crqt.B(stringBuilder0, 2);
                            stringBuilder0.append("event {\n");
                            crqt.I(stringBuilder0, 2, "name", this.ao().c(crso0.d));
                            if((crso0.b & 2) != 0) {
                                crqt.I(stringBuilder0, 2, "timestamp_millis", Long.valueOf(crso0.e));
                            }
                            if((crso0.b & 4) != 0) {
                                crqt.I(stringBuilder0, 2, "previous_timestamp_millis", Long.valueOf(crso0.f));
                            }
                            if((crso0.b & 8) != 0) {
                                crqt.I(stringBuilder0, 2, "count", Integer.valueOf(crso0.g));
                            }
                            if(crso0.c.size() != 0) {
                                this.O(stringBuilder0, 2, crso0.c);
                            }
                            crqt.B(stringBuilder0, 2);
                            stringBuilder0.append("}\n");
                        }
                    }
                }
                crqt.B(stringBuilder0, 1);
                stringBuilder0.append("}\n");
            }
        }
        stringBuilder0.append("} // End-of-batch\n");
        return stringBuilder0.toString();
    }

    final List q(List list0, List list1) {
        int v3;
        ArrayList arrayList0 = new ArrayList(list0);
        for(Object object0: list1) {
            Integer integer0 = (Integer)object0;
            if(((int)integer0) < 0) {
                this.aJ().f.b("Ignoring negative bit index to be cleared", integer0);
            }
            else {
                int v = ((int)integer0) / 0x40;
                if(v >= arrayList0.size()) {
                    this.aJ().f.c("Ignoring bit index greater than bitSet size", integer0, Integer.valueOf(arrayList0.size()));
                }
                else {
                    arrayList0.set(v, Long.valueOf(((long)(((Long)arrayList0.get(v)))) & ~(1L << ((int)integer0) % 0x40)));
                }
            }
        }
        int v1 = arrayList0.size();
        for(int v2 = arrayList0.size() - 1; true; v2 = v1 - 1) {
            v3 = v1;
            v1 = v2;
            if(v1 < 0 || ((long)(((Long)arrayList0.get(v1)))) != 0L) {
                break;
            }
        }
        return arrayList0.subList(0, v3);
    }

    static List r(BitSet bitSet0) {
        int v = (bitSet0.length() + 0x3F) / 0x40;
        List list0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = 0L;
            for(int v3 = 0; v3 < 0x40; ++v3) {
                int v4 = v1 * 0x40 + v3;
                if(v4 >= bitSet0.length()) {
                    break;
                }
                if(bitSet0.get(v4)) {
                    v2 |= 1L << v3;
                }
            }
            ((ArrayList)list0).add(Long.valueOf(v2));
        }
        return list0;
    }

    final Map s(Bundle bundle0, boolean z) {
        Map map0 = new HashMap();
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            Object object1 = bundle0.get(s);
            boolean z1 = object1 instanceof Parcelable[];
            if(z1 || (object1 instanceof ArrayList) || (object1 instanceof Bundle)) {
                if(!z) {
                    continue;
                }
                ArrayList arrayList0 = new ArrayList();
                if(z1) {
                    for(int v = 0; v < ((Parcelable[])object1).length; ++v) {
                        Parcelable parcelable0 = ((Parcelable[])object1)[v];
                        if((parcelable0 instanceof Bundle)) {
                            arrayList0.add(this.s(((Bundle)parcelable0), false));
                        }
                    }
                }
                else if((object1 instanceof ArrayList)) {
                    int v1 = ((ArrayList)object1).size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Object object2 = ((ArrayList)object1).get(v2);
                        if((object2 instanceof Bundle)) {
                            arrayList0.add(this.s(((Bundle)object2), false));
                        }
                    }
                }
                else if((object1 instanceof Bundle)) {
                    arrayList0.add(this.s(((Bundle)object1), false));
                }
                map0.put(s, arrayList0);
            }
            else if(object1 != null) {
                map0.put(s, object1);
            }
        }
        return map0;
    }

    public final void t(StringBuilder stringBuilder0, int v, crrg crrg0) {
        String s;
        if(crrg0 == null) {
            return;
        }
        crqt.B(stringBuilder0, v);
        stringBuilder0.append("filter {\n");
        if((crrg0.b & 4) != 0) {
            crqt.I(stringBuilder0, v, "complement", Boolean.valueOf(crrg0.e));
        }
        if((crrg0.b & 8) != 0) {
            crqt.I(stringBuilder0, v, "param_name", this.ao().d(crrg0.f));
        }
        if((crrg0.b & 1) != 0) {
            crrn crrn0 = crrg0.c == null ? crrn.a : crrg0.c;
            if(crrn0 != null) {
                crqt.B(stringBuilder0, v + 1);
                stringBuilder0.append("string_filter {\n");
                if((crrn0.b & 1) != 0) {
                    int v1 = crrm.a(crrn0.c);
                    if(v1 == 0) {
                        s = "UNKNOWN_MATCH_TYPE";
                    }
                    else {
                        switch(v1) {
                            case 1: {
                                s = "UNKNOWN_MATCH_TYPE";
                                break;
                            }
                            case 2: {
                                s = "REGEXP";
                                break;
                            }
                            case 3: {
                                s = "BEGINS_WITH";
                                break;
                            }
                            case 4: {
                                s = "ENDS_WITH";
                                break;
                            }
                            case 5: {
                                s = "PARTIAL";
                                break;
                            }
                            case 6: {
                                s = "EXACT";
                                break;
                            }
                            default: {
                                s = "IN_LIST";
                            }
                        }
                    }
                    crqt.I(stringBuilder0, v + 1, "match_type", s);
                }
                if((crrn0.b & 2) != 0) {
                    crqt.I(stringBuilder0, v + 1, "expression", crrn0.d);
                }
                if((crrn0.b & 4) != 0) {
                    crqt.I(stringBuilder0, v + 1, "case_sensitive", Boolean.valueOf(crrn0.e));
                }
                if(crrn0.f.size() > 0) {
                    crqt.B(stringBuilder0, v + 2);
                    stringBuilder0.append("expression_list {\n");
                    for(Object object0: crrn0.f) {
                        crqt.B(stringBuilder0, v + 3);
                        stringBuilder0.append(((String)object0));
                        stringBuilder0.append("\n");
                    }
                    stringBuilder0.append("}\n");
                }
                crqt.B(stringBuilder0, v + 1);
                stringBuilder0.append("}\n");
            }
        }
        if((crrg0.b & 2) != 0) {
            crqt.M(stringBuilder0, v + 1, "number_filter", (crrg0.d == null ? crrj.a : crrg0.d));
        }
        crqt.B(stringBuilder0, v);
        stringBuilder0.append("}\n");
    }

    public final void u(Map map0) {
        String s = crqt.F(map0, "Date");
        if(!TextUtils.isEmpty(s)) {
            long v = this.e(s);
            if(v > 0L) {
                SystemClock.elapsedRealtime();
                this.n();
                if(this.a == 0L) {
                    this.a = v;
                }
            }
        }
    }

    static boolean v(List list0, int v) {
        return v < list0.size() * 0x40 && (1L << v % 0x40 & ((long)(((Long)list0.get(v / 0x40))))) != 0L;
    }

    final boolean w(long v, long v1) {
        return v == 0L || v1 <= 0L || Math.abs(System.currentTimeMillis() - v) > v1;
    }

    static boolean x(String s) {
        return s != null && s.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && s.length() <= 310;
    }

    final byte[] y(byte[] arr_b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
            gZIPOutputStream0.write(arr_b);
            gZIPOutputStream0.close();
            byteArrayOutputStream0.close();
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            this.aJ().c.b("Failed to gzip content", iOException0);
            throw iOException0;
        }
    }

    static Bundle[] z(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            crsq crsq0 = (crsq)object0;
            if(crsq0 != null) {
                Bundle bundle0 = new Bundle();
                for(Object object1: crsq0.h) {
                    crsq crsq1 = (crsq)object1;
                    int v = crsq1.b;
                    if((v & 2) != 0) {
                        bundle0.putString(crsq1.c, crsq1.d);
                    }
                    else if((v & 4) != 0) {
                        bundle0.putLong(crsq1.c, crsq1.e);
                    }
                    else if((v & 16) != 0) {
                        bundle0.putDouble(crsq1.c, crsq1.g);
                    }
                }
                if(!bundle0.isEmpty()) {
                    arrayList0.add(bundle0);
                }
            }
        }
        return (Bundle[])arrayList0.toArray(new Bundle[arrayList0.size()]);
    }
}

