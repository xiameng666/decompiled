import j..util.DesugarCollections;
import java.util.Map.Entry;
import java.util.Map;

public final class aiyi implements gfsi {
    public final aizq a;
    public final gfsx b;

    public aiyi(aizq aizq0, gfsx gfsx0) {
        this.a = aizq0;
        this.b = gfsx0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx1;
        int v = 3;
        aizq aizq0 = this.a;
        int v1 = aizq0.a;
        switch(v1) {
            case 0: {
                v = 1;
                break;
            }
            case 1: {
                v = 2;
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                v = 4;
                break;
            }
            case 4: {
                v = 5;
                break;
            }
            default: {
                throw new UnsupportedOperationException("Unexpected BlockstoreClient.Access: " + v1);
            }
        }
        int v2 = aizq0.c;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ajbz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ajbz)object0))));
        if(v2 == 0) {
            throw null;
        }
        gfsx gfsx0 = this.b;
        switch(v2 - 1) {
            case 0: 
            case 1: {
                ggfp ggfp0 = aizq0.b;
                ggqj ggqj0 = ggfp0.om();
                while(ggqj0.hasNext()) {
                    Object object1 = ggqj0.next();
                    String s = (String)object1;
                    ajbc ajbc0 = ajbc.a;
                    s.getClass();
                    ajbc ajbc1 = (ajbc)((ajbz)object0).k.get(s);
                    if(ajbc1 != null) {
                        ajbc0 = ajbc1;
                    }
                    if(v2 != 2) {
                        ajbb ajbb0 = ajbc0.c == null ? ajbb.a : ajbc0.c;
                        if((ajbn.a(ajbb0.c) == 0 ? 1 : ajbn.a(ajbb0.c)) - 1 >= v - 1) {
                            gfsx1 = gfqx.a;
                            goto label_51;
                        }
                    }
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbc0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)ajbc0));
                    ajbb ajbb1 = ajbc0.c == null ? ajbb.a : ajbc0.c;
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbb1).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)ajbb1));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((ajbb)hftp2.b_message).c = v - 1;
                    ((ajbb)hftp2.b_message).b |= 1;
                    ajbb ajbb2 = (ajbb)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ajbc ajbc2 = (ajbc)hftp1.b_message;
                    ajbb2.getClass();
                    ajbc2.c = ajbb2;
                    ajbc2.b |= 1;
                    gfsx1 = gfsx.m(((ajbc)hftp1.N_build()));
                label_51:
                    if(gfsx1.i()) {
                        hftp0.bP(s, ((ajbc)gfsx1.d()));
                    }
                    aizr.u(hftp0, ((ajbz)object0), s, v, v2 == 2);
                }
                if(hpsk.d() && gfsx0.i() && ((ajbz)object0).g(((String)gfsx0.d()))) {
                    Object object2 = gfsx0.d();
                    if(!((ajbz)object0).g(((String)object2))) {
                        ((ggtj)aiyj.a.j()).x("Does not contain gms package key space.");
                        return (ajbz)hftp0.N_build();
                    }
                    ajbw ajbw0 = (ajbw)((ajbz)object0).e.get(object2);
                    if(ajbw0 == null) {
                        throw new IllegalArgumentException();
                    }
                    Map map0 = DesugarCollections.unmodifiableMap(ajbw0.c);
                    gged_interceptors gged0 = ggfp0.v();
                    int v3 = ajbt.a(((ajbz)object0).d);
                    bboh bboh0 = aiyj.a;
                    for(Object object3: aizr.p(((ajbz)object0), ((String)object2), gged0, (v3 == 0 ? 1 : v3), bboh0)) {
                        String s1 = (String)object3;
                        ((ggtj)bboh0.h()).B("Updating access for: %s", s1);
                        ajbr ajbr0 = (ajbr)map0.get(s1);
                        if(ajbr0 != null) {
                            gfsx gfsx2 = aizr.n((ajbr0.d == null ? ajbp.a : ajbr0.d), v, v2 == 2);
                            if(gfsx2.i()) {
                                aizr.t(hftp0, ((String)object2), s1, ((ajbp)gfsx2.d()));
                            }
                        }
                    }
                    return (ajbz)hftp0.N_build();
                }
                break;
            }
            case 2: {
                ggfp ggfp1 = aizq0.b;
                ggqj ggqj1 = ggfp1.om();
                while(ggqj1.hasNext()) {
                    Object object4 = ggqj1.next();
                    String s2 = (String)object4;
                    if(((ajbz)object0).i(s2)) {
                        s2.getClass();
                        ajbc ajbc3 = (ajbc)((ajbz)object0).k.get(s2);
                        if(ajbc3 == null) {
                            throw new IllegalArgumentException();
                        }
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbc3).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)ajbc3));
                        ajbb ajbb3 = ajbc3.c == null ? ajbb.a : ajbc3.c;
                        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbb3).jf(5, null);
                        hftp4.X(((ProtoLiteMessage)ajbb3));
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        ajbb ajbb4 = (ajbb)hftp4.b_message;
                        ajbb4.b &= -2;
                        ajbb4.c = 0;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ajbc ajbc4 = (ajbc)hftp3.b_message;
                        ajbb ajbb5 = (ajbb)hftp4.N_build();
                        ajbb5.getClass();
                        ajbc4.c = ajbb5;
                        ajbc4.b |= 1;
                        hftp0.bP(s2, ((ajbc)hftp3.N_build()));
                    }
                    for(Object object5: aizr.g(((ajbz)object0), gged_interceptors.l(s2))) {
                        ((String)object5).getClass();
                        ajbp ajbp0 = (ajbp)((ajbz)object0).g.get(((String)object5));
                        if(ajbp0 == null) {
                            throw new IllegalArgumentException();
                        }
                        ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbp0).jf(5, null);
                        hftp5.X(((ProtoLiteMessage)ajbp0));
                        ajbo ajbo0 = ajbp0.e == null ? ajbo.a : ajbp0.e;
                        ProtoLiteBuilder hftp6 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbo0).jf(5, null);
                        hftp6.X(((ProtoLiteMessage)ajbo0));
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        ajbo ajbo1 = (ajbo)hftp6.b_message;
                        ajbo1.b &= -3;
                        ajbo1.d = 0;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ajbp ajbp1 = (ajbp)hftp5.b_message;
                        ajbo ajbo2 = (ajbo)hftp6.N_build();
                        ajbo2.getClass();
                        ajbp1.e = ajbo2;
                        ajbp1.b |= 4;
                        aizr.t(hftp0, ((String)object5), "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY", ((ajbp)hftp5.N_build()));
                        continue;
                    }
                    for(Object object6: aizr.f(((ajbz)object0), gged_interceptors.l(s2))) {
                        String s3 = (String)object6;
                        s3.getClass();
                        ajbw ajbw1 = (ajbw)((ajbz)object0).e.get(s3);
                        if(ajbw1 == null) {
                            throw new IllegalArgumentException();
                        }
                        for(Object object7: DesugarCollections.unmodifiableMap(ajbw1.c).entrySet()) {
                            ajbp ajbp2 = ((ajbr)((Map.Entry)object7).getValue()).d;
                            if(ajbp2 == null) {
                                ajbp2 = ajbp.a;
                            }
                            ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbp2).jf(5, null);
                            hftp7.X(((ProtoLiteMessage)ajbp2));
                            ajbo ajbo3 = ajbp2.e == null ? ajbo.a : ajbp2.e;
                            ProtoLiteBuilder hftp8 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbo3).jf(5, null);
                            hftp8.X(((ProtoLiteMessage)ajbo3));
                            if(!hftp8.b_message.isImmutable()) {
                                hftp8.ensureMutable();
                            }
                            ajbo ajbo4 = (ajbo)hftp8.b_message;
                            ajbo4.b &= -3;
                            ajbo4.d = 0;
                            if(!hftp7.b_message.isImmutable()) {
                                hftp7.ensureMutable();
                            }
                            ajbp ajbp3 = (ajbp)hftp7.b_message;
                            ajbo ajbo5 = (ajbo)hftp8.N_build();
                            ajbo5.getClass();
                            ajbp3.e = ajbo5;
                            ajbp3.b |= 4;
                            ajbp ajbp4 = (ajbp)hftp7.N_build();
                            aizr.t(hftp0, s3, ((String)((Map.Entry)object7).getKey()), ajbp4);
                        }
                        continue;
                    }
                }
                if(hpsk.d() && gfsx0.i() && ((ajbz)object0).g(((String)gfsx0.d()))) {
                    Object object8 = gfsx0.d();
                    ajbw ajbw2 = (ajbw)((ajbz)object0).e.get(object8);
                    if(ajbw2 == null) {
                        throw new IllegalArgumentException();
                    }
                    Map map1 = DesugarCollections.unmodifiableMap(ajbw2.c);
                    gged_interceptors gged1 = ggfp1.v();
                    int v4 = ajbt.a(((ajbz)object0).d);
                    for(Object object9: aizr.p(((ajbz)object0), ((String)object8), gged1, (v4 == 0 ? 1 : v4), aiyj.a)) {
                        String s4 = (String)object9;
                        ajbr ajbr1 = (ajbr)map1.get(s4);
                        if(ajbr1 != null) {
                            ajbp ajbp5 = ajbr1.d == null ? ajbp.a : ajbr1.d;
                            ProtoLiteBuilder hftp9 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbp5).jf(5, null);
                            hftp9.X(((ProtoLiteMessage)ajbp5));
                            ajbo ajbo6 = ajbp5.e == null ? ajbo.a : ajbp5.e;
                            ProtoLiteBuilder hftp10 = (ProtoLiteBuilder)((ProtoLiteMessage)ajbo6).jf(5, null);
                            hftp10.X(((ProtoLiteMessage)ajbo6));
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            ajbo ajbo7 = (ajbo)hftp10.b_message;
                            ajbo7.b &= -3;
                            ajbo7.d = 0;
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            ajbp ajbp6 = (ajbp)hftp9.b_message;
                            ajbo ajbo8 = (ajbo)hftp10.N_build();
                            ajbo8.getClass();
                            ajbp6.e = ajbo8;
                            ajbp6.b |= 4;
                            aizr.t(hftp0, ((String)object8), s4, ((ajbp)hftp9.N_build()));
                        }
                    }
                    return (ajbz)hftp0.N_build();
                }
                break;
            }
            default: {
                return (ajbz)hftp0.N_build();
            }
        }
        return (ajbz)hftp0.N_build();
    }
}

