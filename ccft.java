import android.net.Uri;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.TrainingInterval;
import j..util.Objects;
import java.util.HashSet;
import java.util.List;

public final class ccft implements ccgn {
    public final ccgo a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final Uri f;
    public final Uri g;
    public final Uri h;
    public final List i;
    public final InAppTrainerOptions j;
    public final String k;
    public final long l;
    public final int m;

    public ccft(ccgo ccgo0, String s, boolean z, int v, String s1, Uri uri0, Uri uri1, Uri uri2, List list0, InAppTrainerOptions inAppTrainerOptions0, String s2, int v1, long v2) {
        this.a = ccgo0;
        this.b = s;
        this.c = z;
        this.d = v;
        this.e = s1;
        this.f = uri0;
        this.g = uri1;
        this.h = uri2;
        this.i = list0;
        this.j = inAppTrainerOptions0;
        this.k = s2;
        this.m = v1;
        this.l = v2;
    }

    @Override  // ccgn
    public final gfsz a(fnap fnap0) {
        int v16;
        int v14;
        fnal fnal0;
        int v8;
        int v6;
        long v5;
        fnan fnan11;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fnap0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fnap0));
        String s = this.b;
        fnan fnan0 = ccgo.e(((fnao)hftp0), s);
        HashSet hashSet0 = new HashSet();
        boolean z = this.c;
        ccgo ccgo0 = this.a;
        int v = this.d;
        if(z) {
            ccgo0.n(v, ((fnao)hftp0));
            fnan fnan1 = ccgo.d(((fnao)hftp0), new ccga(this.e));
            if(fnan1 != null) {
                ccgo0.d.c(0x48D);
                hashSet0.add(fnan1);
            }
        }
        else {
            String s1 = this.f.toString();
            String s2 = this.g.toString();
            ccgo0.n(v, ((fnao)hftp0));
            fnan fnan2 = ccgo.d(((fnao)hftp0), new ccgf(s1, (this.h == null ? "" : this.h.toString())));
            if(fnan2 != null) {
                ccgo0.d.c(0x465);
                hashSet0.add(fnan2);
            }
            fnan fnan3 = ccgo.d(((fnao)hftp0), new ccfw(s1, this.i));
            if(fnan3 != null) {
                ccgo0.d.c(0x465);
                hashSet0.add(fnan3);
            }
            fnan fnan4 = ccgo.d(((fnao)hftp0), new ccfs(s2));
            if(fnan4 != null) {
                ccgo0.d.c(0x47A);
                hashSet0.add(fnan4);
            }
        }
        String s3 = this.k;
        InAppTrainerOptions inAppTrainerOptions0 = this.j;
        long v1 = ccgo0.e.a();
        hfwn hfwn0 = hfyn.h(v1);
        int v2 = 2;
        int v3 = 1;
        if(fnan0 == null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fnan.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            "com.google.android.gms".getClass();
            ((fnan)hftv0).e = "com.google.android.gms";
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            s.getClass();
            ((fnan)hftv1).f = s;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((fnan)hftp1.b_message).g = v;
            ProtoLiteBuilder hftp2 = ccgo0.s(inAppTrainerOptions0, s3);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fnan fnan5 = (fnan)hftp1.b_message;
            fnaj fnaj0 = (fnaj)hftp2.N_build();
            fnaj0.getClass();
            fnan5.n = fnaj0;
            fnan5.b |= 0x20;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            hfwn0.getClass();
            ((fnan)hftv2).h = hfwn0;
            ((fnan)hftv2).b |= 1;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp1.b_message;
            hfwn0.getClass();
            ((fnan)hftv3).i = hfwn0;
            ((fnan)hftv3).b |= 2;
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            fnan fnan6 = (fnan)hftp1.b_message;
            fnan6.o = fnam.a(3);
            ByteString hfsf0 = ByteString.copyFrom(inAppTrainerOptions0.c());
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((fnan)hftp1.b_message).p = hfsf0;
            ByteString hfsf1 = ByteString.copyFrom(inAppTrainerOptions0.m);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((fnan)hftp1.b_message).q = hfsf1;
            if(z) {
                fnaf fnaf0 = cccg.b(inAppTrainerOptions0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fnan fnan7 = (fnan)hftp1.b_message;
                fnaf0.getClass();
                fnan7.d = fnaf0;
                fnan7.c = 4;
                hfwn hfwn1 = ccgo0.l(v1, 0L, inAppTrainerOptions0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fnan fnan8 = (fnan)hftp1.b_message;
                hfwn1.getClass();
                fnan8.l = hfwn1;
                fnan8.b |= 16;
            }
            else {
                fnah fnah0 = cccg.c(inAppTrainerOptions0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fnan fnan9 = (fnan)hftp1.b_message;
                fnah0.getClass();
                fnan9.d = fnah0;
                fnan9.c = 13;
                hfwn hfwn2 = ccgo0.m(v1, 0L, inAppTrainerOptions0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fnan fnan10 = (fnan)hftp1.b_message;
                hfwn2.getClass();
                fnan10.l = hfwn2;
                fnan10.b |= 16;
            }
            fnan11 = (fnan)hftp1.N_build();
        }
        else {
            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)fnan0).jf(5, null);
            hftp3.X(((ProtoLiteMessage)fnan0));
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((fnan)hftp3.b_message).g = v;
            ProtoLiteBuilder hftp4 = ccgo0.s(inAppTrainerOptions0, s3);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            fnan fnan12 = (fnan)hftp3.b_message;
            fnaj fnaj1 = (fnaj)hftp4.N_build();
            fnaj1.getClass();
            fnan12.n = fnaj1;
            fnan12.b |= 0x20;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            fnan fnan13 = (fnan)hftp3.b_message;
            hfwn0.getClass();
            fnan13.i = hfwn0;
            fnan13.b |= 2;
            ByteString hfsf2 = ByteString.copyFrom(inAppTrainerOptions0.c());
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((fnan)hftp3.b_message).p = hfsf2;
            ByteString hfsf3 = ByteString.copyFrom(inAppTrainerOptions0.m);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((fnan)hftp3.b_message).q = hfsf3;
            boolean z1 = fnan0.g != inAppTrainerOptions0.b;
            if(z1) {
                ccgo0.d.c(0x48C);
                hashSet0.add(fnan0);
            }
            String s4 = inAppTrainerOptions0.d;
            Uri uri0 = inAppTrainerOptions0.f;
            int v4 = gfta.c(s4) || fnan0.c != 13 ? 0 : 1;
            if(uri0 == null) {
                v5 = v1;
                v6 = 0;
            }
            else {
                v5 = v1;
                v6 = fnan0.c == 4 ? 1 : 0;
            }
            int v7 = v6 | v4;
            if(v7 != 0) {
                ccgo0.d.c(0x484);
            }
            boolean z2 = fnan0.c == 4 && !((fnaf)fnan0.d).c.equals(s4);
            if(z2) {
                ccgo0.d.c(0x48B);
            }
            boolean z3 = fnan0.c == 13 && (!ccgo.q(uri0, ((fnah)fnan0.d).c) || !ccgo.q(inAppTrainerOptions0.k, (fnan0.c == 13 ? ((fnah)fnan0.d) : fnah.a).g) || !(fnan0.c == 13 ? ((fnah)fnan0.d) : fnah.a).h.equals(cccg.e(inAppTrainerOptions0.l)));
            if(z3) {
                ccgo0.d.c(0x483);
            }
            boolean z4 = fnan0.c == 13 && !((fnah)fnan0.d).e.equals(inAppTrainerOptions0.i.toString());
            if(z4) {
                v8 = v7;
                ccgo0.d.c(0x479);
            }
            else {
                v8 = v7;
            }
            TrainingInterval trainingInterval0 = inAppTrainerOptions0.j;
            int v9 = fnan0.c;
            if(v9 == 4) {
                fnaf fnaf1 = (fnaf)fnan0.d;
                if((fnaf1.b & 1) == 0) {
                    fnal0 = null;
                }
                else {
                    fnal0 = fnaf1.e;
                    if(fnal0 == null) {
                        fnal0 = fnal.a;
                    }
                }
            }
            else {
                fnah fnah1 = v9 == 13 ? ((fnah)fnan0.d) : fnah.a;
                if((fnah1.b & 1) == 0) {
                    fnal0 = null;
                }
                else {
                    fnal0 = fnah1.f;
                    if(fnal0 == null) {
                        fnal0 = fnal.a;
                    }
                }
            }
            boolean z5 = Objects.equals((trainingInterval0 == null ? null : cccg.d(trainingInterval0)), fnal0);
            if(!z5) {
                if(s4 == null) {
                    ccgo0.d.c(0x46D);
                }
                else {
                    ccgo0.d.c(1130);
                }
            }
            if(!z1 && v8 == 0 && !z2 && !z3 && !z4 && z5) {
                long v10 = hfyn.b((fnan0.l == null ? hfwn.a : fnan0.l)) - v5;
                if(trainingInterval0 != null) {
                    v2 = cccg.g(trainingInterval0.a);
                }
                long v11 = ccgo0.r(v10, v2, z);
                if(z) {
                    fnan fnan14 = (fnan)hftp3.b_message;
                    fnaf fnaf2 = fnan14.c == 4 ? ((fnaf)fnan14.d) : fnaf.a;
                    ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)fnaf2).jf(5, null);
                    hftp5.X(((ProtoLiteMessage)fnaf2));
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    fnaf fnaf3 = (fnaf)hftp5.b_message;
                    fnaf3.d = fnae.a(this.m);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    fnan fnan15 = (fnan)hftp3.b_message;
                    fnaf fnaf4 = (fnaf)hftp5.N_build();
                    fnaf4.getClass();
                    fnan15.d = fnaf4;
                    fnan15.c = 4;
                }
                long v12 = ccgo0.c.p(s3) + 30L;
                int v13 = hfyn.b((fnan0.j == null ? hfwn.a : fnan0.j)) >= v5 || v5 - hfyn.b((fnan0.j == null ? hfwn.a : fnan0.j)) >= v12 * 1000L || hfym.a((fnan0.j == null ? hfwn.a : fnan0.j), (fnan0.k == null ? hfwn.a : fnan0.k)) <= 0 ? 0 : 1;
                v14 = v13 ^ 1;
                hfwn hfwn3 = hfyn.h(v5 + v11);
                if(v13 != 0) {
                    hfwn3 = fnan0.l;
                    if(hfwn3 == null) {
                        hfwn3 = hfwn.a;
                    }
                }
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fnan fnan16 = (fnan)hftp3.b_message;
                hfwn3.getClass();
                fnan16.l = hfwn3;
                fnan16.b |= 16;
            }
            else {
                hfwn hfwn4 = ((fnan)hftp3.b_message).k;
                if(hfwn4 == null) {
                    hfwn4 = hfwn.a;
                }
                long v15 = hfyn.b(hfwn4);
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp3.b_message;
                if(((fnan)hftv4).c == 4) {
                    ((fnan)hftv4).c = 0;
                    ((fnan)hftv4).d = null;
                }
                if(!hftv4.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp3.b_message;
                if(((fnan)hftv5).c == 13) {
                    ((fnan)hftv5).c = 0;
                    ((fnan)hftv5).d = null;
                }
                if(!hftv5.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp3.b_message;
                ((fnan)hftv6).j = null;
                ((fnan)hftv6).b &= -5;
                if(!hftv6.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp3.b_message;
                ((fnan)hftv7).k = null;
                ((fnan)hftv7).b &= -9;
                if(!hftv7.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((fnan)hftp3.b_message).m = fnan.a.m;
                if(z) {
                    fnaf fnaf5 = cccg.b(inAppTrainerOptions0);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    fnan fnan17 = (fnan)hftp3.b_message;
                    fnaf5.getClass();
                    fnan17.d = fnaf5;
                    fnan17.c = 4;
                    hfwn hfwn5 = ccgo0.l(v5, v15, inAppTrainerOptions0);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    fnan fnan18 = (fnan)hftp3.b_message;
                    hfwn5.getClass();
                    fnan18.l = hfwn5;
                    fnan18.b |= 16;
                }
                else {
                    fnah fnah2 = cccg.c(inAppTrainerOptions0);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    fnan fnan19 = (fnan)hftp3.b_message;
                    fnah2.getClass();
                    fnan19.d = fnah2;
                    fnan19.c = 13;
                    hfwn hfwn6 = ccgo0.m(v5, v15, inAppTrainerOptions0);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    fnan fnan20 = (fnan)hftp3.b_message;
                    hfwn6.getClass();
                    fnan20.l = hfwn6;
                    fnan20.b |= 16;
                }
                v14 = 1;
            }
            if(v14 == 0) {
                v16 = fnam.b(fnan0.o);
                if(v16 == 0) {
                    v16 = 1;
                }
            }
            else {
                v16 = 3;
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            fnan fnan21 = (fnan)hftp3.b_message;
            fnan21.o = fnam.a(v16);
            fnan11 = (fnan)hftp3.N_build();
            v3 = v14;
        }
        ((fnao)hftp0).k(fnan11);
        fnap fnap1 = (fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build();
        if(v3 != 0) {
            ccgo0.f.b(fnan11, this.l);
        }
        for(Object object0: hashSet0) {
            ccgo0.f.a(((fnan)object0));
        }
        return new gfsz(fnap1, null);
    }
}

