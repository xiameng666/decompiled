import android.content.Context;
import android.util.Base64;
import android.util.Log;
import j..util.Objects;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class fdtx {
    public final hlan a;
    public final fdwc b;
    public long c;
    private final fdvx d;
    private final fdxz e;
    private final fdye f;

    public fdtx(Context context0, fdye fdye0, fdxz fdxz0, fdvx fdvx0, fdwc fdwc0) {
        fhad fhad0 = fhae.a();
        fhad0.b(context0);
        fhae fhae0 = fhad0.a();
        fhbw fhbw0 = new fhbw();
        fhbw0.a(new hkzx());
        iakr iakr0 = cmma.f(0x706, -1, cmml.a, fhae0, fhbw0).a(hlcg.u);
        hlan hlan0 = (hlan)hlan.k(new hlam(), iakr0);
        String s = hzzi.a.i().Y();
        long v = hzzi.a.i().m();
        super();
        this.c = 0L;
        this.f = fdye0;
        this.b = fdwc0;
        this.d = fdvx0;
        this.e = fdxz0;
        this.a = (hlan)hlan0.q(gpho.a, s + ":" + v);
    }

    public final fdsj a(String s, Iterator iterator0, int v, boolean z) {
        fdsj fdsj0;
        String s10;
        hlba hlba0;
        fdwc fdwc0 = this.b;
        fdwc0.a(":putDataItems");
        String s1 = "";
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlaz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlaz)hftp0.b_message).g = 2;
            long v1 = Long.parseLong(s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlaz)hftp0.b_message).d = v1;
            String s2 = this.f();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlaz hlaz0 = (hlaz)hftp0.b_message;
            s2.getClass();
            hlaz0.e = s2;
            List list0 = fdsq.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlaz hlaz1 = (hlaz)hftp0.b_message;
            hfuo hfuo0 = hlaz1.h;
            if(!hfuo0.c()) {
                hlaz1.h = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, hlaz1.h);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlaz)hftp0.b_message).i = z;
            while(iterator0.hasNext() && ((hlaz)hftp0.b_message).f.size() < v) {
                Object object0 = iterator0.next();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlbi.a).v_newBuilder();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hlbg.a).v_newBuilder();
                fdpl fdpl0 = ((fduq)object0).a;
                String s3 = fdpl0.d;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                s3.getClass();
                ((hlbg)hftv0).c = s3;
                String s4 = fdpl0.b;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hlbg hlbg0 = (hlbg)hftp2.b_message;
                s4.getClass();
                hlbg0.b = s4;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hlbi hlbi0 = (hlbi)hftp1.b_message;
                hlbg hlbg1 = (hlbg)hftp2.N_build();
                hlbg1.getClass();
                hlbi0.e = hlbg1;
                hlbi0.b |= 1;
                String s5 = ((fduq)object0).b.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((hlbi)hftv1).c = s5;
                String s6 = ((fduq)object0).b.b;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((hlbi)hftv2).d = s6;
                long v2 = ((fduq)object0).h;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((hlbi)hftv3).g = v2;
                long v3 = ((fduq)object0).f;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp1.b_message;
                ((hlbi)hftv4).h = v3;
                boolean z1 = ((fduq)object0).c;
                if(!hftv4.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp1.b_message;
                ((hlbi)hftv5).i = z1;
                boolean z2 = ((fduq)object0).i;
                if(!hftv5.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp1.b_message;
                ((hlbi)hftv6).l = z2;
                String s7 = ((fduq)object0).e;
                if(s7 != null) {
                    if(!hftv6.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlbi)hftp1.b_message).j = s7;
                }
                byte[] arr_b = ((fduq)object0).b.e;
                if(arr_b != null) {
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hlbi)hftp1.b_message).f = hfsf0;
                }
                for(Object object1: ((fduq)object0).b.b().entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    String s8 = ((fdpo)map$Entry0.getValue()).b;
                    if(s8 != null) {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hlbj.a).v_newBuilder();
                        String s9 = (String)map$Entry0.getKey();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv7 = hftp3.b_message;
                        s9.getClass();
                        ((hlbj)hftv7).b = s9;
                        if(!hftv7.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ((hlbj)hftp3.b_message).c = s8;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hlbi hlbi1 = (hlbi)hftp1.b_message;
                        hlbj hlbj0 = (hlbj)hftp3.N_build();
                        hlbj0.getClass();
                        hfuo hfuo1 = hlbi1.k;
                        if(!hfuo1.c()) {
                            hlbi1.k = ProtoLiteMessage.E(hfuo1);
                        }
                        hlbi1.k.add(hlbj0);
                    }
                }
                hlbi hlbi2 = (hlbi)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlaz hlaz2 = (hlaz)hftp0.b_message;
                hlbi2.getClass();
                hfuo hfuo2 = hlaz2.f;
                if(!hfuo2.c()) {
                    hlaz2.f = ProtoLiteMessage.E(hfuo2);
                }
                hlaz2.f.add(hlbi2);
            }
            hlaz hlaz3 = (hlaz)hftp0.N_build();
            fdtg fdtg0 = new fdtg();
            fdth fdth0 = new fdth();
            hlan hlan0 = this.e(clan.b);
            Objects.requireNonNull(hlan0);
            hlba0 = (hlba)this.c("PutDataItems", ((MessageLite)hlaz3), fdtg0, fdth0, new fdti(hlan0));
            s10 = String.format(Locale.US, "numItems: %d, hasPendingAssets=%b", ((hlaz)hftp0.b_message).f.size(), Boolean.valueOf(hlba0.d.size() > 0));
        }
        catch(Throwable throwable0) {
            this.b.c(":putDataItems", s1);
            throw throwable0;
        }
        try {
            if(Log.isLoggable("CloudNode", 2)) {
                Locale locale0 = Locale.US;
                Long long0 = (long)hlba0.c;
                hlbm hlbm0 = hlba0.e == null ? hlbm.a : hlba0.e;
                StringBuilder stringBuilder0 = new StringBuilder("{");
                for(Object object2: hlbm0.b) {
                    stringBuilder0.append(s1);
                    stringBuilder0.append(((hlbk)object2).b);
                    stringBuilder0.append(":");
                    stringBuilder0.append(((hlbk)object2).c);
                    s1 = ", ";
                }
                stringBuilder0.append("}");
                Log.v("CloudNode", String.format(locale0, "putDataItems %s, seqId=%d, syncTable=%s", s10, long0, stringBuilder0.toString()));
            }
            fdsj0 = new fdsj();
            fdsj0.a = hlba0.c;
            if((hlba0.b & 1) != 0) {
                fdsj0.b = fdtx.g((hlba0.e == null ? hlbm.a : hlba0.e));
            }
            if(hlba0.d.size() > 0) {
                fdsj0.a(fdtx.h(hlba0.d));
            }
        }
        catch(Throwable throwable0) {
            s1 = s10;
            this.b.c(":putDataItems", s1);
            throw throwable0;
        }
        fdwc0.c(":putDataItems", s10);
        return fdsj0;
    }

    final MessageLite b(fdvw fdvw0, MessageLite hfvm0, fdtv fdtv0, fdtw fdtw0, fdtu fdtu0) {
        return this.j(fdvw0, hfvm0, fdtv0, fdtw0, fdtu0, true);
    }

    final MessageLite c(String s, MessageLite hfvm0, fdtv fdtv0, fdtw fdtw0, fdtu fdtu0) {
        return this.b(new fdvw(s), hfvm0, fdtv0, fdtw0, fdtu0);
    }

    public final MessageLite d(String s, MessageLite hfvm0, fdtu fdtu0) {
        fdvw fdvw0 = new fdvw(s);
        int v = hfvm0.getSerializedSize();
        this.d.a(fdvw0, "bytesSent", v);
        try {
            MessageLite hfvm1 = fdtu0.a(hfvm0);
            int v1 = hfvm1.getSerializedSize();
            this.d.a(fdvw0, "bytesRecv", v1);
            this.d.a(fdvw0, "success", 1);
            return hfvm1;
        }
        catch(iapn iapn0) {
            this.d.a(fdvw0, fdtx.k(iapn0), 1);
            fdtx.i(iapn0);
            throw new AssertionError("unreachable", iapn0);
        }
    }

    public final hlan e(ckcq ckcq0) {
        return (hlan)this.a.q(cmlp.a, ckcq0);
    }

    public final String f() {
        return this.f.a().a;
    }

    static Map g(hlbm hlbm0) {
        Map map0 = new HashMap();
        for(Object object0: hlbm0.b) {
            map0.put(((hlbk)object0).b, Long.valueOf(((hlbk)object0).c));
        }
        return map0;
    }

    static Set h(List list0) {
        Set set0 = new HashSet();
        for(Object object0: list0) {
            set0.add(new fdty(((hlbl)object0).b, ((hlbl)object0).c));
        }
        return set0;
    }

    public static final void i(iapn iapn0) {
        switch(iapn0.a.t.ordinal()) {
            case 4: {
                throw new IOException("Timed out", iapn0);
            }
            case 9: {
                throw new fdsp(5, "Got FAILED_PRECONDITION response", iapn0);
            }
            case 2: 
            case 14: {
                throw new IOException("Network error", iapn0);
            }
            case 16: {
                throw new fdsp(4, "Received UNAUTHENTICATED response from server", iapn0);
            }
            default: {
                throw new fdsp(3, "Error reading gRPC response.", iapn0);
            }
        }
    }

    private final MessageLite j(fdvw fdvw0, MessageLite hfvm0, fdtv fdtv0, fdtw fdtw0, fdtu fdtu0, boolean z) {
        long v4;
        fdvx fdvx0;
        MessageLite hfvm1;
        fdtw fdtw1;
        hlbb hlbb2;
        fdtv fdtv1;
        long v;
        try {
            v = System.currentTimeMillis();
            hfst hfst0 = hfyf.k(this.c);
            fdtv1 = fdtv0;
            hfwn hfwn0 = hfyn.m(hfyn.h(System.currentTimeMillis()), hfst0);
            fdtv1 = fdtv0;
            byte[] arr_b = fdtv1.a(hfvm0, hfwn0);
            byte[] arr_b1 = new gnqh(((ECPrivateKey)this.e.c().getPrivate()), gnrh.c, gnqq.b).a(arr_b);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlbb.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlbb hlbb0 = (hlbb)hftp0.b_message;
            hfwn0.getClass();
            hlbb0.c = hfwn0;
            hlbb0.b |= 1;
            String s = Base64.encodeToString(arr_b1, 2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlbb hlbb1 = (hlbb)hftp0.b_message;
            s.getClass();
            hlbb1.d = s;
            hlbb2 = (hlbb)hftp0.N_build();
            fdtw1 = fdtw0;
            goto label_26;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            Log.e("CloudNode", "Error signing request", generalSecurityException0);
            throw new fdsp(3, "Error signing request", generalSecurityException0);
        }
        catch(iapn iapn0) {
        }
        fdtw1 = fdtw0;
        goto label_33;
        try {
        label_26:
            hfvm1 = fdtw1.a(hfvm0, hlbb2);
            fdvx0 = this.d;
            fdvx0.a(fdvw0, "bytesSent", hfvm1.getSerializedSize());
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "Making request: " + hfvm1);
            }
            goto label_35;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            Log.e("CloudNode", "Error signing request", generalSecurityException0);
            throw new fdsp(3, "Error signing request", generalSecurityException0);
        }
        catch(iapn iapn0) {
        }
    label_33:
        fdtu fdtu1 = fdtu0;
        goto label_44;
        try {
        label_35:
            fdtu1 = fdtu0;
            MessageLite hfvm2 = fdtu1.a(hfvm1);
            fdvx0.a(fdvw0, "bytesRecv", hfvm2.getSerializedSize());
            fdvx0.a(fdvw0, "success", 1);
            return hfvm2;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            Log.e("CloudNode", "Error signing request", generalSecurityException0);
            throw new fdsp(3, "Error signing request", generalSecurityException0);
        }
        catch(iapn iapn0) {
        }
    label_44:
        this.d.a(fdvw0, fdtx.k(iapn0), 1);
        if(iapn0.a.t == iaph.q) {
            long v1 = System.currentTimeMillis() - v;
            if(v1 >= hzuz.f()) {
                throw new IOException("Request took longer (" + v1 + "ms) than skew window (" + hzuz.f() + "ms).", iapn0);
            }
            if(Long.compare(v1, 0L) < 0) {
                throw new IOException(a.D(v1, "Request took negative time (", "ms)!"), iapn0);
            }
            if(z) {
                Log.i("CloudNode", "Request failed due to UNAUTHENTICATED. Attempting time update...");
                long v2 = System.currentTimeMillis();
                try {
                    this.b.a(":getServerTime");
                    try {
                        hlan hlan0 = this.e(clal.b);
                        Objects.requireNonNull(hlan0);
                        fdtn fdtn0 = new fdtn(hlan0);
                        hfwn hfwn1 = ((hlaw)this.d("GetServerTime", ((MessageLite)hfsw.a), fdtn0)).b;
                        if(hfwn1 == null) {
                            hfwn1 = hfwn.a;
                        }
                        v4 = hfyn.b(hfwn1);
                    }
                    finally {
                        this.b.b(":getServerTime");
                    }
                }
                catch(fdsp fdsp0) {
                    throw new IOException(fdsp0);
                }
                if(v4 > 0L) {
                    long v5 = System.currentTimeMillis();
                    long v6 = System.currentTimeMillis() - v2;
                    if(v6 > hzuz.f()) {
                        throw new IOException("Time sync request took " + v6 + "ms, longer than the permitted " + hzuz.f() + "ms.");
                    }
                    if(v6 < 0L) {
                        throw new IOException(a.D(v6, "Time sync request took negative time (", "ms)!"));
                    }
                    long v7 = v5 - v4;
                    if(Math.abs(v7 - this.c) > hzuz.f()) {
                        this.c = v7;
                        Log.i("CloudNode", a.D(v7, "Clock skew updated to ", "ms. Retrying request..."));
                        return this.j(fdvw0, hfvm0, fdtv1, fdtw1, fdtu1, false);
                    }
                }
                Log.i("CloudNode", "No significant time change, accepting request failure.");
            }
            else {
                Log.e("CloudNode", "Clock skew already updated and we still failed; aborting.");
            }
        }
        fdtx.i(iapn0);
        throw new AssertionError("unreachable", iapn0);
    }

    private static final String k(iapn iapn0) {
        return iapn0.a.t.ordinal() == 2 || iapn0.a.t.ordinal() == 4 || iapn0.a.t.ordinal() == 14 ? "IOException" : "400s";
    }
}

