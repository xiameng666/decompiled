import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public final class flzj implements flzo {
    private final Context a;
    private final AccountContext b;
    private final fmga c;
    private final hnry d;
    private final Map e;

    public flzj(Context context0, AccountContext accountContext0, fmga fmga0, hnry hnry0, Map map0) {
        this.a = context0;
        this.b = accountContext0;
        this.c = fmga0;
        this.d = hnry0;
        this.e = map0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgjg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.d.getClass();
        ((hgjg)hftv0).d = this.d;
        ((hgjg)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjg hgjg0 = (hgjg)hftp0.b_message;
        hnxl0.getClass();
        hgjg0.c = hnxl0;
        hgjg0.b |= 1;
        fmga fmga0 = this.c;
        Map map0 = this.e;
        hnub hnub0 = hnub.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnub0).v_newBuilder();
        fmfr fmfr0 = fmga0.f;
        switch(fmfr0.a() - 1) {
            case 1: {
                hnsv hnsv1 = hnsv.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnub hnub2 = (hnub)hftp1.b_message;
                hnub2.n = hnsv1.a();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnuh.a).v_newBuilder();
                String s = fmfr0.d();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hnuh hnuh0 = (hnuh)hftp2.b_message;
                s.getClass();
                hnuh0.b = s;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnub hnub3 = (hnub)hftp1.b_message;
                hnuh hnuh1 = (hnuh)hftp2.N_build();
                hnuh1.getClass();
                hnub3.f = hnuh1;
                hnub3.e = 102;
                break;
            }
            case 2: {
                if(map0.containsKey(fmfr0.b().a)) {
                    switch(fmfr0.b().a) {
                        case "photos": {
                            hftp1 = ((flws)map0.get(fmfr0.b().a)).a().d(fmga0);
                            break;
                        }
                        case "rich_card": {
                            hftp1 = ((flws)map0.get(fmfr0.b().a)).a().d(fmga0);
                            hnsv hnsv4 = hnsv.j;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hnub hnub6 = (hnub)hftp1.b_message;
                            hnub6.n = hnsv4.a();
                            break;
                        }
                        default: {
                            hftp1 = ((ProtoLiteMessage)hnub0).v_newBuilder();
                            hnsv hnsv3 = hnsv.a;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            hnub hnub5 = (hnub)hftp1.b_message;
                            hnub5.n = hnsv3.a();
                        }
                    }
                }
                else {
                    hftp1 = ((ProtoLiteMessage)hnub0).v_newBuilder();
                    hnsv hnsv2 = hnsv.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hnub hnub4 = (hnub)hftp1.b_message;
                    hnub4.n = hnsv2.a();
                }
                break;
            }
            case 3: {
                hnsv hnsv5 = hnsv.h;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnub hnub7 = (hnub)hftp1.b_message;
                hnub7.n = hnsv5.a();
                hnve hnve0 = flxs.a(fmfr0.c());
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnub hnub8 = (hnub)hftp1.b_message;
                hnve0.getClass();
                hnub8.f = hnve0;
                hnub8.e = 106;
                break;
            }
            default: {
                hnsv hnsv0 = hnsv.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnub hnub1 = (hnub)hftp1.b_message;
                hnub1.n = hnsv0.a();
            }
        }
        int v = fmga0.j;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hnub)hftv1).s = v;
        String s1 = fmga0.a;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub9 = (hnub)hftp1.b_message;
        s1.getClass();
        hnub9.i = s1;
        hnry hnry0 = flxa.b(fmga0.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub10 = (hnub)hftp1.b_message;
        hnry0.getClass();
        hnub10.k = hnry0;
        hnub10.b |= 1;
        hnrr hnrr0 = flwy.b(fmga0.c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub11 = (hnub)hftp1.b_message;
        hnrr0.getClass();
        hnub11.l = hnrr0;
        hnub11.b |= 2;
        gfsx gfsx0 = fmga0.e;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hnub)hftp1.b_message).m = (String)object0;
        }
        gfsx gfsx1 = fmga0.h;
        if(gfsx1.i()) {
            Object object1 = gfsx1.d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hnub)hftp1.b_message).p = (String)object1;
        }
        ggeo ggeo0 = fmga0.i;
        if(!ggeo0.isEmpty()) {
            ggqj ggqj0 = ggeo0.w().om();
            while(ggqj0.hasNext()) {
                Object object2 = ggqj0.next();
                String s2 = (String)object2;
                try {
                    ByteString hfsf0 = (ByteString)ggeo0.get(s2);
                    hftc hftc0 = hftc.a();
                    hfsl hfsl0 = hfsf0.k();
                    ProtoLiteMessage hftv2 = ((ProtoLiteMessage)hfrn.a).x_newMutableInstance();
                    try {
                        hfwc hfwc0 = hfvu.a.c(hftv2);
                        hfwc0.l(hftv2, hfsm.p(hfsl0), hftc0);
                        hfwc0.g(hftv2);
                    }
                    catch(hfur hfur1) {
                        if(hfur1.b) {
                            hfur1 = new hfur(hfur1);
                        }
                        hfur1.a = hftv2;
                        throw hfur1;
                    }
                    catch(hfwr hfwr0) {
                        hfur hfur2 = hfwr0.a();
                        hfur2.a = hftv2;
                        throw hfur2;
                    }
                    catch(IOException iOException0) {
                        if((iOException0.getCause() instanceof hfur)) {
                            throw (hfur)iOException0.getCause();
                        }
                        hfur hfur3 = new hfur(iOException0);
                        hfur3.a = hftv2;
                        throw hfur3;
                    }
                    catch(RuntimeException runtimeException0) {
                        if((runtimeException0.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException0.getCause();
                        }
                        throw runtimeException0;
                    }
                    try {
                        hfsl0.z(0);
                    }
                    catch(hfur hfur4) {
                        hfur4.a = hftv2;
                        throw hfur4;
                    }
                    ProtoLiteMessage.P_makeImmutable(hftv2);
                    s2.getClass();
                    ((hfrn)hftv2).getClass();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hnub hnub12 = (hnub)hftp1.b_message;
                    hfvh hfvh0 = hnub12.o;
                    if(!hfvh0.b) {
                        hnub12.o = hfvh0.a();
                    }
                    hnub12.o.put(s2, ((hfrn)hftv2));
                }
                catch(hfur hfur0) {
                    flbj.d("MsgProtoConverter", "Error parsing metadata map", hfur0);
                }
            }
        }
        gfsx gfsx2 = fmga0.o;
        if(gfsx2.i()) {
            switch(((fmfq)gfsx2.d()).ordinal()) {
                case 1: {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hnub)hftp1.b_message).w = 1;
                    break;
                }
                case 2: {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hnub)hftp1.b_message).w = 2;
                    break;
                }
                default: {
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hnub)hftp1.b_message).w = 0;
                }
            }
        }
        ByteString hfsf1 = fmga0.n;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub13 = (hnub)hftp1.b_message;
        hfsf1.getClass();
        hnub13.v = hfsf1;
        hnub hnub14 = (hnub)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjg hgjg1 = (hgjg)hftp0.b_message;
        hnub14.getClass();
        hgjg1.e = hnub14;
        hgjg1.b |= 4;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hnsn.a).v_newBuilder();
        String s3 = flbi.a(this.a);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hnsn hnsn0 = (hnsn)hftp3.b_message;
        s3.getClass();
        hnsn0.b = s3;
        hnsn hnsn1 = (hnsn)hftp3.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjg hgjg2 = (hgjg)hftp0.b_message;
        hnsn1.getClass();
        hgjg2.f = hnsn1;
        hgjg2.b |= 8;
        return gmbu.i(((hgjg)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flzi(((hgjg)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        return new flkw(gfsx.m(Long.valueOf(((hgjh)object0).b)));
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(this.c.a);
        fmai0.d(this.c.c);
        fmai0.j(12);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flkw flkw0 = (flkw)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(this.c.a);
        fmai0.d(this.c.c);
        fmai0.j(12);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

