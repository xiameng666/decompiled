import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dpga extends ftqm {
    private static dpga a;

    private dpga(Context context0) {
        super(context0, "com.fitbit.FitbitMobile", "com.google.android.libraries.tapandpay.managedsecureelement.SERVICE", new bblp(1, 9));
    }

    public final ftdd a(long v, List list0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftcv)hftp0.b_message).d = v;
        ftco ftco0 = (ftco)((ProtoLiteMessage)ftcp.a).v_newBuilder();
        for(Object object0: list0) {
            fswv fswv0 = (fswv)((ProtoLiteMessage)fsww.a).v_newBuilder();
            String s = ((gtiu)object0).b;
            if(!fswv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fswv0).ensureMutable();
            }
            fsww fsww0 = (fsww)fswv0.b_message;
            s.getClass();
            fsww0.b |= 1;
            fsww0.c = s;
            String s1 = ((gtiu)object0).c;
            if(!fswv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fswv0).ensureMutable();
            }
            fsww fsww1 = (fsww)fswv0.b_message;
            s1.getClass();
            fsww1.b |= 2;
            fsww1.d = s1;
            fswv0.a(gggq.j(((gtiu)object0).d, new dpfz()));
            ftco0.a(fswv0);
        }
        ftcp ftcp0 = (ftcp)((ProtoLiteBuilder)ftco0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcv ftcv0 = (ftcv)hftp0.b_message;
        ftcp0.getClass();
        ftcv0.c = ftcp0;
        ftcv0.b = 9;
        ftdg ftdg0 = this.c(((ftcv)hftp0.N_build()));
        return ftdg0.b == 8 ? ((ftdd)ftdg0.c) : ftdd.a;
    }

    public final ftdf b(long v, ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftcv)hftp0.b_message).d = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftcu.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftcu ftcu0 = (ftcu)hftp1.b_message;
        hfsf0.getClass();
        ftcu0.b = hfsf0;
        ftcu ftcu1 = (ftcu)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcv ftcv0 = (ftcv)hftp0.b_message;
        ftcu1.getClass();
        ftcv0.c = ftcu1;
        ftcv0.b = 4;
        ftdg ftdg0 = this.c(((ftcv)hftp0.N_build()));
        return ftdg0.b == 3 ? ((ftdf)ftdg0.c) : ftdf.a;
    }

    public final ftdg c(ftcv ftcv0) {
        if(this.p()) {
            try {
                ftdg ftdg0 = (ftdg)evrg.o(this.l(((MessageLite)ftcv0), ((Parser)((ProtoLiteMessage)ftdg.a).jf(7, null))), 60L, TimeUnit.SECONDS);
                int v = 1;
                if(ftdg0.b == 1) {
                    int v1 = ftcy.a(((Integer)ftdg0.c).intValue());
                    if(v1 != 0) {
                        v = v1;
                    }
                    throw new dpje(v);
                }
                return ftdg0;
            }
            catch(TimeoutException timeoutException0) {
                throw new dpje(timeoutException0);
            }
            catch(ExecutionException | InterruptedException exception0) {
                throw new cjuh(8, null, null, exception0);
            }
        }
        throw new dpje(9);
    }

    public final ByteString d(long v, ByteString hfsf0, String s) {
        if(hfsf0.isEmpty()) {
            return ByteString.b;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftcv)hftp0.b_message).d = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftcm.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        hfsf0.getClass();
        ((ftcm)hftv0).b = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftcm ftcm0 = (ftcm)hftp1.b_message;
        s.getClass();
        ftcm0.c = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcv ftcv0 = (ftcv)hftp0.b_message;
        ftcm ftcm1 = (ftcm)hftp1.N_build();
        ftcm1.getClass();
        ftcv0.c = ftcm1;
        ftcv0.b = 8;
        ftdg ftdg0 = this.c(((ftcv)hftp0.N_build()));
        return ftdg0.b == 7 ? ((ByteString)ftdg0.c) : ByteString.b;
    }

    public final List e() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcv.a).v_newBuilder();
        hfsw hfsw0 = hfsw.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcv ftcv0 = (ftcv)hftp0.b_message;
        hfsw0.getClass();
        ftcv0.c = hfsw0;
        ftcv0.b = 3;
        ftdg ftdg0 = this.c(((ftcv)hftp0.N_build()));
        return ftdg0.b == 2 ? ((ftdc)ftdg0.c).b : ftdc.a.b;
    }

    public final void f(long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftcv)hftp0.b_message).d = v;
        hfsw hfsw0 = hfsw.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcv ftcv0 = (ftcv)hftp0.b_message;
        hfsw0.getClass();
        ftcv0.c = hfsw0;
        ftcv0.b = 5;
        this.c(((ftcv)hftp0.N_build()));
    }

    public final void g(long v, dpeb dpeb0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftcv)hftp0.b_message).d = v;
        ftcs ftcs0 = dpga.r(dpeb0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcv ftcv0 = (ftcv)hftp0.b_message;
        ftcs0.getClass();
        ftcv0.c = ftcs0;
        ftcv0.b = 7;
        this.c(((ftcv)hftp0.N_build()));
    }

    public final void h(long v, dpeb dpeb0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftcv)hftp0.b_message).d = v;
        ftcs ftcs0 = dpga.r(dpeb0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcv ftcv0 = (ftcv)hftp0.b_message;
        ftcs0.getClass();
        ftcv0.c = ftcs0;
        ftcv0.b = 7;
        this.l(((MessageLite)(((ftcv)hftp0.N_build()))), ((Parser)((ProtoLiteMessage)ftdg.a).jf(7, null)));
    }

    public final void i(long v, String s, ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftcv)hftp0.b_message).d = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftcn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((ftcn)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftcn ftcn0 = (ftcn)hftp1.b_message;
        hfsf0.getClass();
        ftcn0.c = hfsf0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcv ftcv0 = (ftcv)hftp0.b_message;
        ftcn ftcn1 = (ftcn)hftp1.N_build();
        ftcn1.getClass();
        ftcv0.c = ftcn1;
        ftcv0.b = 11;
        this.c(((ftcv)hftp0.N_build()));
    }

    static dpga j(Context context0) {
        synchronized(dpga.class) {
            if(dpga.a != null && !dpga.a.g.equals("com.fitbit.FitbitMobile")) {
                dpga.a.n();
                dpga.a = null;
            }
            if(dpga.a == null) {
                dpga.a = new dpga(context0);
            }
        }
        return dpga.a;
    }

    private static final ftcs r(dpeb dpeb0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcs.a).v_newBuilder();
        for(Object object0: dpeb0.o) {
            hkhr hkhr0 = (hkhr)object0;
            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
            if((hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)).equals(hkiq.d)) {
                hkhh hkhh1 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftdm.a).v_newBuilder();
                hkir hkir1 = hkhh1.g == null ? hkir.a : hkhh1.g;
                int v = (hktu.b(hkir1.f) == null ? hktu.D : hktu.b(hkir1.f)).ordinal();
                int v1 = 3;
                if(v != 1) {
                    switch(v) {
                        case 2: {
                            v1 = 4;
                            break;
                        }
                        case 3: {
                            v1 = 5;
                            break;
                        }
                        default: {
                            v1 = v == 7 ? 4 : 2;
                        }
                    }
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((ftdm)hftv0).b = v1 - 2;
                String s = hkhh1.c;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ftdm ftdm0 = (ftdm)hftp1.b_message;
                s.getClass();
                ftdm0.c = s;
                String s1 = hkhh1.d.replaceAll("\\D", "");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ftdm ftdm1 = (ftdm)hftp1.b_message;
                s1.getClass();
                ftdm1.d = s1;
                String s2 = (hkhh1.h == null ? hkgs.a : hkhh1.h).c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ftdm ftdm2 = (ftdm)hftp1.b_message;
                s2.getClass();
                ftdm2.e = s2;
                hkir hkir2 = hkhh1.g == null ? hkir.a : hkhh1.g;
                hfuo hfuo0 = (hkir2.j == null ? hkil.a : hkir2.j).c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ftdm ftdm3 = (ftdm)hftp1.b_message;
                hfuo hfuo1 = ftdm3.f;
                if(!hfuo1.c()) {
                    ftdm3.f = ProtoLiteMessage.E(hfuo1);
                }
                hfrj.E(hfuo0, ftdm3.f);
                int v2 = (hkhh1.f == null ? hkhd.a : hkhh1.f).c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((ftdm)hftp1.b_message).g = v2;
                ftdm ftdm4 = (ftdm)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ftcs ftcs0 = (ftcs)hftp0.b_message;
                ftdm4.getClass();
                hfuo hfuo2 = ftcs0.b;
                if(!hfuo2.c()) {
                    ftcs0.b = ProtoLiteMessage.E(hfuo2);
                }
                ftcs0.b.add(ftdm4);
            }
        }
        hfuh hfuh0 = new hfuh(dpeb0.u, dpeb.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftcs ftcs1 = (ftcs)hftp0.b_message;
        hfuf hfuf0 = ftcs1.c;
        if(!hfuf0.c()) {
            ftcs1.c = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object1: hfuh0) {
            ftcs1.c.i(((hksv)object1).a());
        }
        return (ftcs)hftp0.N_build();
    }
}

