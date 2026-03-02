import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Base64;
import j..util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class aizr {
    static int a(ajbz ajbz0) {
        return aizr.h(ajbz0).size();
    }

    static ajbp b(ajbp ajbp0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbp0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ajbp0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ajbp ajbp1 = (ajbp)hftp0.b_message;
        ajbp1.b &= -3;
        ajbp1.d = false;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ajbp)hftp0.b_message).e = null;
        ((ajbp)hftp0.b_message).b &= -5;
        return (ajbp)hftp0.N_build();
    }

    public static gfsx c(ajbz ajbz0, String s, String s1) {
        if(ajca.b(s1)) {
            ByteString hfsf0 = (ByteString)DesugarCollections.unmodifiableMap(ajbz0.f).get(s);
            ajbp ajbp0 = (ajbp)DesugarCollections.unmodifiableMap(ajbz0.g).get(s);
            if(hfsf0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ajbr.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((ajbr)hftv0).b |= 1;
                ((ajbr)hftv0).c = hfsf0;
                if(ajbp0 != null) {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((ajbr)hftp0.b_message).d = ajbp0;
                    ((ajbr)hftp0.b_message).b |= 2;
                }
                return gfsx.m(((ajbr)hftp0.N_build()));
            }
            return gfqx.a;
        }
        String s2 = aizr.e(s1);
        ajbw ajbw0 = ajbw.a;
        ajbw ajbw1 = (ajbw)ajbz0.e.get(s);
        if(ajbw1 != null) {
            ajbw0 = ajbw1;
        }
        return gfsx.l(((ajbr)DesugarCollections.unmodifiableMap(ajbw0.c).get(s2)));
    }

    public static gfsx d(String s, Signature[] arr_signature, bboh bboh0) {
        if(TextUtils.isEmpty(s)) {
            ((ggtj)bboh0.i()).x("Empty package name");
            return gfqx.a;
        }
        if(arr_signature.length <= 0) {
            ((ggtj)bboh0.i()).x("Empty signatures");
            return gfqx.a;
        }
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
            messageDigest0.update(s.getBytes());
            messageDigest0.update(arr_signature[0].toByteArray());
            return gfsx.m(Base64.encodeToString(messageDigest0.digest(), 0));
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            a.ae(bboh0.i(), "SHA-256 digest not present", noSuchAlgorithmException0);
            return gfqx.a;
        }
    }

    public static String e(String s) {
        return Base64.encodeToString(s.getBytes(StandardCharsets.UTF_8), 2);
    }

    public static List f(ajbz ajbz0, List list0) {
        List list1 = new ArrayList();
        for(Object object0: DesugarCollections.unmodifiableMap(ajbz0.e).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(list0.contains(((ajbw)map$Entry0.getValue()).d)) {
                ((ArrayList)list1).add(((String)map$Entry0.getKey()));
            }
        }
        return list1;
    }

    public static List g(ajbz ajbz0, List list0) {
        List list1 = new ArrayList();
        for(Object object0: DesugarCollections.unmodifiableMap(ajbz0.g).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(list0.contains(((ajbp)map$Entry0.getValue()).c)) {
                ((ArrayList)list1).add(((String)map$Entry0.getKey()));
            }
        }
        return list1;
    }

    public static Set h(ajbz ajbz0) {
        Set set0 = new HashSet();
        ((HashSet)set0).addAll(DesugarCollections.unmodifiableMap(ajbz0.e).keySet());
        ((HashSet)set0).addAll(DesugarCollections.unmodifiableMap(ajbz0.f).keySet());
        return set0;
    }

    static boolean i(ajbp ajbp0) {
        return !(ajbp0.e == null ? ajbo.a : ajbp0.e).c;
    }

    static ajae j(int v) {
        ajad ajad0 = ajae.a();
        ajad0.a = ByteString.b;
        ajad0.b = v;
        ajad0.b(0);
        return ajad0.a();
    }

    public static int k(int v) {
        switch(v - 1) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            default: {
                return v - 1 == 2 || v - 1 == 3 ? 1 : 4;
            }
        }
    }

    static aizv l(int v) {
        switch(v - 1) {
            case 0: {
                if(aiyd.a == null) {
                    Class class0 = aiyd.class;
                    synchronized(class0) {
                        if(aiyd.a == null) {
                            aiyd.a = new aiyd();
                        }
                    }
                    return aiyd.a;
                }
                return aiyd.a;
            }
            case 1: {
                if(ajac.a == null) {
                    Class class1 = ajac.class;
                    synchronized(class1) {
                        if(ajac.a == null) {
                            ajac.a = new ajac();
                        }
                    }
                    return ajac.a;
                }
                return ajac.a;
            }
            default: {
                throw new UnsupportedOperationException("FOLSOM encryption is not yet available");
            }
        }
    }

    static ajbz m(ajbz ajbz0, int v) {
        int v1 = ajbt.a(ajbz0.d) == 0 ? 1 : ajbt.a(ajbz0.d);
        if(v != v1) {
            aizv aizv0 = aizr.l(v1);
            aizv aizv1 = aizr.l(v);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbz0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ajbz0));
            for(Object object0: DesugarCollections.unmodifiableMap(ajbz0.f).entrySet()) {
                byte[] arr_b = aizv1.b(aizv0.a(((ByteString)((Map.Entry)object0).getValue()).toByteArray()));
                hftp0.bM(((String)((Map.Entry)object0).getKey()), ByteString.copyFrom(arr_b));
            }
            for(Object object1: DesugarCollections.unmodifiableMap(ajbz0.e).entrySet()) {
                ajbw ajbw0 = (ajbw)((Map.Entry)object1).getValue();
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbw0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)ajbw0));
                for(Object object2: DesugarCollections.unmodifiableMap(((ajbw)((Map.Entry)object1).getValue()).c).entrySet()) {
                    byte[] arr_b1 = aizv1.b(aizv0.a(((ajbr)((Map.Entry)object2).getValue()).c.toByteArray()));
                    ajbr ajbr0 = (ajbr)((Map.Entry)object2).getValue();
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbr0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)ajbr0));
                    ByteString hfsf0 = ByteString.copyFrom(arr_b1);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ajbr ajbr1 = (ajbr)hftp2.b_message;
                    ajbr1.b |= 1;
                    ajbr1.c = hfsf0;
                    ajbr ajbr2 = (ajbr)hftp2.N_build();
                    hftp1.bU(((String)((Map.Entry)object2).getKey()), ajbr2);
                }
                hftp0.bN(((String)((Map.Entry)object1).getKey()), ((ajbw)hftp1.N_build()));
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ajbz)hftp0.b_message).d = v - 1;
            ((ajbz)hftp0.b_message).b |= 4;
            return (ajbz)hftp0.N_build();
        }
        return ajbz0;
    }

    static gfsx n(ajbp ajbp0, int v, boolean z) {
        if(!z) {
            ajbo ajbo0 = ajbp0.e == null ? ajbo.a : ajbp0.e;
            if((ajbn.a(ajbo0.d) == 0 ? 1 : ajbn.a(ajbo0.d)) - 1 >= v - 1) {
                return gfqx.a;
            }
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbp0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ajbp0));
        ajbo ajbo1 = ajbp0.e == null ? ajbo.a : ajbp0.e;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbo1).jf(5, null);
        hftp1.X(((ProtoLiteMessage)ajbo1));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ajbo)hftp1.b_message).d = v - 1;
        ((ajbo)hftp1.b_message).b |= 2;
        ajbo ajbo2 = (ajbo)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ajbp ajbp1 = (ajbp)hftp0.b_message;
        ajbo2.getClass();
        ajbp1.e = ajbo2;
        ajbp1.b |= 4;
        return gfsx.m(((ajbp)hftp0.N_build()));
    }

    static gfsx o(String s, ajbr ajbr0, int v, String s1, int v1, bboh bboh0) {
        ajbp ajbp0 = ajbr0.d == null ? ajbp.a : ajbr0.d;
        int v2 = ajbn.a((ajbp0.e == null ? ajbo.a : ajbp0.e).d);
        boolean z = true;
        if(v2 == 0) {
            v2 = 1;
        }
        int v3 = aizr.k(v2);
        if(v3 != 0 || !ajca.b(s)) {
            v1 = v3;
        }
        if(!hprv.a.f().p() && !hprv.e().b.contains(s1)) {
            if(v1 == 0 || v1 == 1 || v1 == 2) {
                return gfqx.a;
            }
            if(v1 != 3 && v1 != 4) {
                ((ggtj)((ggtj)bboh0.j()).ar(835)).H("Unexpected access %d for package \'%s\', Denying", v1, s1);
                return gfqx.a;
            }
        }
        byte[] arr_b = aizr.q(ajbr0.c.toByteArray(), v);
        gftb.check(arr_b);
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if((ajbp0.b & 2) == 0 || !ajbp0.d) {
            z = false;
        }
        return gfsx.m(new ajaf(hfsf0, z, v1));
    }

    static List p(ajbz ajbz0, String s, List list0, int v, bboh bboh0) {
        List list1 = new ArrayList();
        if(ajbz0.g(s)) {
            ajbw ajbw0 = (ajbw)ajbz0.e.get(s);
            if(ajbw0 == null) {
                throw new IllegalArgumentException();
            }
            for(Object object0: DesugarCollections.unmodifiableMap(ajbw0.c).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                try {
                    byte[] arr_b = aizr.q(((ajbr)map$Entry0.getValue()).c.toByteArray(), v);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ajbh.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    if(!list0.contains(((ajbh)hftv0).g)) {
                        continue;
                    }
                    list1.add(((String)map$Entry0.getKey()));
                }
                catch(hfur hfur0) {
                    a.ae(bboh0.j(), "The data was not a restore credential", hfur0);
                }
                catch(aizu aizu0) {
                    a.ae(bboh0.j(), "Unable to decrypt the potential restore credential entry.", aizu0);
                }
            }
            return list1;
        }
        ((ggtj)bboh0.j()).x("Does not contain gms package key space.");
        return list1;
    }

    static byte[] q(byte[] arr_b, int v) {
        return aizr.l(v).a(arr_b);
    }

    public static int r(int v) {
        if(v != 0) {
            switch(v - 1) {
                case 1: {
                    return 2;
                }
                case 2: {
                    return 4;
                }
                default: {
                    switch(v - 1) {
                        case 3: {
                            return 5;
                        }
                        case 4: {
                            return 6;
                        }
                        default: {
                            return 1;
                        }
                    }
                }
            }
        }
        throw null;
    }

    static void s(ProtoLiteBuilder hftp0, String s, List list0) {
        if(list0.isEmpty()) {
            return;
        }
        ajbw ajbw0 = hftp0.bI(s, ajbw.a);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbw0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)ajbw0));
        for(Object object0: list0) {
            String s1 = (String)object0;
            if("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY".equals(s1)) {
                hftp0.bQ(s);
                hftp0.bS(s);
            }
            else {
                s1.getClass();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((ajbw)hftp1.b_message).b().remove(s1);
            }
        }
        if(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ajbw)hftp1.b_message).c)).isEmpty()) {
            hftp0.bR(s);
            return;
        }
        hftp0.bN(s, ((ajbw)hftp1.N_build()));
    }

    static void t(ProtoLiteBuilder hftp0, String s, String s1, ajbp ajbp0) {
        if(!"com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY".equals(s1)) {
            s.getClass();
            Map map0 = DesugarCollections.unmodifiableMap(((ajbz)hftp0.b_message).e);
            if(!map0.containsKey(s)) {
                throw new IllegalArgumentException();
            }
            ajbw ajbw0 = (ajbw)map0.get(s);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbw0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)ajbw0));
            s1.getClass();
            Map map1 = DesugarCollections.unmodifiableMap(((ajbw)hftp1.b_message).c);
            if(!map1.containsKey(s1)) {
                throw new IllegalArgumentException();
            }
            ajbr ajbr0 = (ajbr)map1.get(s1);
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbr0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)ajbr0));
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ajbr ajbr1 = (ajbr)hftp2.b_message;
            ajbp0.getClass();
            ajbr1.d = ajbp0;
            ajbr1.b |= 2;
            hftp1.bU(s1, ((ajbr)hftp2.N_build()));
            hftp0.bN(s, ((ajbw)hftp1.N_build()));
            return;
        }
        hftp0.bO(s, ajbp0);
    }

    static void u(ProtoLiteBuilder hftp0, ajbz ajbz0, String s, int v, boolean z) {
        for(Object object0: aizr.g(ajbz0, gged_interceptors.l(s))) {
            String s1 = (String)object0;
            s1.getClass();
            ajbp ajbp0 = (ajbp)ajbz0.g.get(s1);
            if(ajbp0 == null) {
                throw new IllegalArgumentException();
            }
            gfsx gfsx0 = aizr.n(ajbp0, v, z);
            if(!gfsx0.i()) {
                continue;
            }
            aizr.t(hftp0, s1, "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY", ((ajbp)gfsx0.d()));
            continue;
        }
        for(Object object1: aizr.f(ajbz0, gged_interceptors.l(s))) {
            String s2 = (String)object1;
            s2.getClass();
            ajbw ajbw0 = (ajbw)ajbz0.e.get(s2);
            if(ajbw0 == null) {
                throw new IllegalArgumentException();
            }
            for(Object object2: DesugarCollections.unmodifiableMap(ajbw0.c).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                ajbp ajbp1 = ((ajbr)map$Entry0.getValue()).d;
                if(ajbp1 == null) {
                    ajbp1 = ajbp.a;
                }
                gfsx gfsx1 = aizr.n(ajbp1, v, z);
                if(gfsx1.i()) {
                    aizr.t(hftp0, s2, ((String)map$Entry0.getKey()), ((ajbp)gfsx1.d()));
                }
            }
            continue;
        }
    }
}

