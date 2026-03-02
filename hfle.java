import j..util.Collection.-EL;
import j..util.Optional;
import java.util.ArrayList;
import java.util.List;

public final class hfle {
    public static final int a;
    private static final ggfp b;
    private static final ggfp c;
    private final hflo d;
    private final hflo e;
    private final hflo f;
    private final Optional g;

    static {
        hfle.b = ggfp.L("dma52_data_sharing_v4_prod", "dma52_data_sharing_v5", "dma52_data_sharing_v6");
        hfle.c = ggfp.K("dma52_data_sharing_v4", "workspace_processing_user_consent");
    }

    public hfle(hflo hflo0, hflo hflo1, hflo hflo2, Optional optional0) {
        this.d = hflo0;
        this.e = hflo1;
        this.f = hflo2;
        this.g = optional0;
    }

    public final gmcd a(hfnh hfnh0, hfnp hfnp0, hfnl hfnl0, hfni hfni0) {
        gmcd gmcd0;
        hhex hhex0;
        ggdy ggdy0 = new ggdy();
        if(hfni0.b.size() == 0) {
            ggdy0.k(hfle.b);
        }
        else {
            for(Object object0: hfni0.b) {
                hfoa hfoa0 = (hfoa)object0;
                if(!hfle.b.contains(hfoa0.c) && !hfle.c.contains(hfoa0.c)) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfnm.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hfnm hfnm0 = (hfnm)hftp0.b_message;
                    hfnm0.b |= 1;
                    hfnm0.c = false;
                    hfnm hfnm1 = (hfnm)hftp0.N_build();
                    this.b(hfnm1, hfnh0, hfnl0, hfoa0.c);
                    return gmbu.i(hfnm1);
                }
                ggdy0.i(hfoa0.c);
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        ArrayList arrayList0 = new ArrayList();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            switch(((String)gged0.get(v1))) {
                case "dma52_data_sharing_v4": 
                case "dma52_data_sharing_v4_prod": {
                    arrayList0.add(this.d.c(hfnh0, hfnp0, hfnl0));
                    break;
                }
                case "dma52_data_sharing_v5": {
                    arrayList0.add(this.e.c(hfnh0, hfnp0, hfnl0));
                    break;
                }
                case "dma52_data_sharing_v6": {
                    arrayList0.add(this.f.c(hfnh0, hfnp0, hfnl0));
                    break;
                }
                case "workspace_processing_user_consent": {
                    try {
                        hfky hfky0 = hfkt.a(hfnh0);
                        boolean z = hfky0.b.size() == 1 ? true : 0;
                        gftb.d(z, "Unexpected number of scalar ptokens: %s", hfky0.b.size());
                        hfkx hfkx0 = (hfkx)hfky0.b.get(0);
                        hfkw hfkw0 = hfkx0.b == 1 ? ((hfkw)hfkx0.c) : hfkw.a;
                        hhex0 = hfkw0.c == null ? hhex.a : hfkw0.c;
                    }
                    catch(IllegalArgumentException unused_ex) {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((hfns)hftp2.b_message).c = 2;
                        ((hfns)hftp2.b_message).b |= 1;
                        gmcd0 = gmbu.i(((hfns)hftp2.N_build()));
                        arrayList0.add(gmcd0);
                        break;
                    }
                    gged_interceptors gged1 = hflg.a((hhex0.c == null ? hhew.a : hhex0.c), hfnl0);
                    gged_interceptors gged2 = hfmb.a(gged1);
                    boolean z1 = Collection.-EL.stream(gged2).anyMatch(new hflw());
                    boolean z2 = Collection.-EL.stream(gged2).anyMatch(new hfly());
                    if(!z1 && !z2) {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp3.b_message;
                        ((hfns)hftv0).c = 1;
                        ((hfns)hftv0).b |= 1;
                        if(!hftv0.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        hfns hfns0 = (hfns)hftp3.b_message;
                        hfns0.b |= 2;
                        hfns0.d = 2;
                        gmcd0 = gmbu.i(((hfns)hftp3.N_build()));
                    }
                    else {
                        hfuf hfuf0 = (hfnl0.c == null ? hfno.a : hfnl0.c).d;
                        gged_interceptors gged3 = hfmb.a(hfuf0);
                        if(!gged2.isEmpty() && Collection.-EL.stream(gged2).allMatch(new hflu())) {
                            if(Collection.-EL.stream(gged3).allMatch(new hflt())) {
                                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ProtoLiteMessage hftv1 = hftp4.b_message;
                                ((hfns)hftv1).c = 1;
                                ((hfns)hftv1).b |= 1;
                                if(!hftv1.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                hfns hfns1 = (hfns)hftp4.b_message;
                                hfns1.b |= 2;
                                hfns1.d = 3;
                                gmcd0 = gmbu.i(((hfns)hftp4.N_build()));
                                arrayList0.add(gmcd0);
                                break;
                            }
                            else if(!hfuf0.isEmpty() && Collection.-EL.stream(hfuf0).allMatch(new hflz())) {
                                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                                if(!hftp5.b_message.isImmutable()) {
                                    hftp5.ensureMutable();
                                }
                                ProtoLiteMessage hftv2 = hftp5.b_message;
                                ((hfns)hftv2).c = 1;
                                ((hfns)hftv2).b |= 1;
                                if(!hftv2.isImmutable()) {
                                    hftp5.ensureMutable();
                                }
                                hfns hfns2 = (hfns)hftp5.b_message;
                                hfns2.b |= 2;
                                hfns2.d = 17;
                                gmcd0 = gmbu.i(((hfns)hftp5.N_build()));
                                arrayList0.add(gmcd0);
                                break;
                            }
                        }
                        boolean z3 = Collection.-EL.stream(gged3).anyMatch(new hflv());
                        if(!z1 && !z3 && (((ggna)gged1).c == 1 && hfuf0.size() == 1 && ((Integer)gged1.get(0)).equals(hfuf0.get(0)))) {
                            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                            if(!hftp6.b_message.isImmutable()) {
                                hftp6.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp6.b_message;
                            ((hfns)hftv3).c = 1;
                            ((hfns)hftv3).b |= 1;
                            if(!hftv3.isImmutable()) {
                                hftp6.ensureMutable();
                            }
                            hfns hfns3 = (hfns)hftp6.b_message;
                            hfns3.b |= 2;
                            hfns3.d = 4;
                            gmcd0 = gmbu.i(((hfns)hftp6.N_build()));
                        }
                        else {
                            gmcd0 = glzd.f(gmbu.i(new hflq()), new hflx(z1, z3, gged3, z2), gmap.a);
                        }
                    }
                    arrayList0.add(gmcd0);
                    break;
                }
                default: {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hfns)hftp1.b_message).c = 2;
                    ((hfns)hftp1.b_message).b |= 1;
                    arrayList0.add(gmbu.i(((hfns)hftp1.N_build())));
                }
            }
        }
        return gmbu.a(arrayList0).a(new hfld(this, gged0, arrayList0, hfnh0, hfnl0), gmap.a);
    }

    public final void b(hfnm hfnm0, hfnh hfnh0, hfnl hfnl0, String s) {
        hfnr hfnr0;
        Optional optional0 = this.g;
        if(optional0.isPresent()) {
            Object object0 = optional0.get();
            hflb hflb0 = new hflb(hfnl0);
            hflc hflc0 = new hflc(hfnh0);
            switch(s) {
                case "dma52_data_sharing_v4": {
                    hfnr0 = hfnr.g;
                    break;
                }
                case "dma52_data_sharing_v4_prod": {
                    hfnr0 = hfnr.h;
                    break;
                }
                case "dma52_data_sharing_v5": {
                    hfnr0 = hfnr.i;
                    break;
                }
                case "dma52_data_sharing_v6": {
                    hfnr0 = hfnr.j;
                    break;
                }
                case "workspace_processing_user_consent": {
                    hfnr0 = hfnr.k;
                    break;
                }
                default: {
                    hfnr0 = hfnr.a;
                }
            }
            boolean z = hfnm0.c;
            ibuq.f(hfnr0, "policy");
            Object object1 = ((hfmz)object0).d.mr();
            ibuq.e(object1, "get(...)");
            int v = ((Number)object1).intValue();
            if(v > 0 && ((hfmz)object0).e.nextInt(v) == 0) {
                Object object2 = ((gful_cronetEngineProvider)hflb0).mr();
                ibuq.e(object2, "get(...)");
                if(((List)object2).isEmpty()) {
                    ((ggsc)hfmz.a.j().ar(20380)).x("readerProductId is empty");
                    return;
                }
                Object object3 = ((gful_cronetEngineProvider)hflc0).mr();
                ibuq.e(object3, "get(...)");
                if(((List)object3).isEmpty()) {
                    ((ggsc)hfmz.a.j().ar(0x4F9B)).x("dataProductId is empty");
                    return;
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgxr.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                String s1 = ((hfmz)object0).c;
                ibuq.f(s1, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxr hgxr0 = (hgxr)hftp0.b_message;
                s1.getClass();
                hgxr0.b |= 1;
                hgxr0.c = s1;
                long v1 = (long)((Number)((List)object2).get(0)).intValue();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxr hgxr1 = (hgxr)hftp0.b_message;
                hgxr1.b |= 2;
                hgxr1.d = v1;
                long v2 = (long)((Number)((List)object3).get(0)).intValue();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxr hgxr2 = (hgxr)hftp0.b_message;
                hgxr2.b |= 4;
                hgxr2.e = v2;
                ibuq.f(hfnr0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxr hgxr3 = (hgxr)hftp0.b_message;
                hgxr3.f = hfnr0.a();
                hgxr3.b |= 8;
                hgxv hgxv0 = z ? hgxv.b : hgxv.c;
                ibuq.f(hgxv0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgxr)hftp0.b_message).g = hgxv0.d;
                ((hgxr)hftp0.b_message).b |= 0x20;
                hgxt hgxt0 = hgxt.c;
                ibuq.f(hgxt0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((hgxr)hftv0).h = hgxt0.d;
                ((hgxr)hftv0).b |= 0x40;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgxr hgxr4 = (hgxr)hftp0.b_message;
                hgxr4.b |= 0x80;
                hgxr4.i = (long)v;
                ProtoLiteMessage hftv1 = hftp0.N_build();
                ibuq.e(hftv1, "build(...)");
                ((hfmz)object0).b.j(((MessageLite)(((hgxr)hftv1))), ((hfmz)object0).f).d();
            }
        }
    }
}

