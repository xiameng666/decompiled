import java.util.ArrayList;

public final class flwo {
    public static hnrp a(fmbi fmbi0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnrp.a).v_newBuilder();
        flwo.g(fmbi0, hftp0);
        switch(fmbi0.a().ordinal()) {
            case 0: {
                throw new IllegalArgumentException("Got unknown action type integer.");
            }
            case 1: {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnsm.a).v_newBuilder();
                fmaz fmaz0 = fmbi0.f;
                String s = fmaz0.d().a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hnsm hnsm0 = (hnsm)hftp1.b_message;
                s.getClass();
                hnsm0.b = s;
                String s1 = fmaz0.d().b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s1.getClass();
                ((hnsm)hftv0).d = s1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hnsm)hftp1.b_message).c = false;
                hnsm hnsm1 = (hnsm)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp0 = (hnrp)hftp0.b_message;
                hnsm1.getClass();
                hnrp0.d = hnsm1;
                hnrp0.c = 101;
                break;
            }
            case 2: {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnsm.a).v_newBuilder();
                fmaz fmaz1 = fmbi0.f;
                String s2 = fmaz1.c().a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hnsm hnsm2 = (hnsm)hftp2.b_message;
                s2.getClass();
                hnsm2.b = s2;
                String s3 = fmaz1.c().b;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                s3.getClass();
                ((hnsm)hftv1).d = s3;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((hnsm)hftp2.b_message).c = true;
                hnsm hnsm3 = (hnsm)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp1 = (hnrp)hftp0.b_message;
                hnsm3.getClass();
                hnrp1.d = hnsm3;
                hnrp1.c = 101;
                break;
            }
            case 3: {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hnrj.a).v_newBuilder();
                String s4 = fmbi0.f.i();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hnrj hnrj0 = (hnrj)hftp3.b_message;
                s4.getClass();
                hnrj0.b = s4;
                hnrj hnrj1 = (hnrj)hftp3.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp2 = (hnrp)hftp0.b_message;
                hnrj1.getClass();
                hnrp2.d = hnrj1;
                hnrp2.c = 102;
                break;
            }
            case 4: {
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hnss.a).v_newBuilder();
                String s5 = fmbi0.f.k();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hnss hnss0 = (hnss)hftp4.b_message;
                s5.getClass();
                hnss0.b = s5;
                hnss hnss1 = (hnss)hftp4.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp3 = (hnrp)hftp0.b_message;
                hnss1.getClass();
                hnrp3.d = hnss1;
                hnrp3.c = 103;
                break;
            }
            case 5: {
                fmbe fmbe0 = new fmbe(null);
                fmbe0.b(fmbi0.f.f());
                hnsk hnsk0 = flwo.d(fmbe0.a());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp4 = (hnrp)hftp0.b_message;
                hnsk0.getClass();
                hnrp4.d = hnsk0;
                hnrp4.c = 104;
                break;
            }
            case 7: {
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hnrh.a).v_newBuilder();
                String s6 = fmbi0.f.h();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                hnrh hnrh0 = (hnrh)hftp5.b_message;
                s6.getClass();
                hnrh0.b = s6;
                hnrh hnrh1 = (hnrh)hftp5.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp5 = (hnrp)hftp0.b_message;
                hnrh1.getClass();
                hnrp5.d = hnrh1;
                hnrp5.c = 105;
                break;
            }
            case 8: {
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hnso.a).v_newBuilder();
                String s7 = fmbi0.f.j();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hnso hnso0 = (hnso)hftp6.b_message;
                s7.getClass();
                hnso0.b = s7;
                hnso hnso1 = (hnso)hftp6.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp6 = (hnrp)hftp0.b_message;
                hnso1.getClass();
                hnrp6.d = hnso1;
                hnrp6.c = 106;
                break;
            }
            case 9: {
                hnsk hnsk1 = flwo.d(fmbi0.f.b());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp7 = (hnrp)hftp0.b_message;
                hnsk1.getClass();
                hnrp7.d = hnsk1;
                hnrp7.c = 104;
                break;
            }
            case 10: {
                fmhv fmhv0 = fmbi0.f.g();
                ArrayList arrayList0 = new ArrayList();
                gged_interceptors gged0 = fmhv0.b;
                for(int v = 0; v < ((ggna)gged0).c; ++v) {
                    fmhu fmhu0 = (fmhu)gged0.get(v);
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hnsr.a).v_newBuilder();
                    String s8 = fmhu0.a;
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp7.b_message;
                    s8.getClass();
                    ((hnsr)hftv2).b = s8;
                    int v1 = fmhu0.b;
                    if(!hftv2.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    ((hnsr)hftp7.b_message).c = v1;
                    arrayList0.add(((hnsr)hftp7.N_build()));
                }
                ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hnsq.a).v_newBuilder();
                String s9 = fmhv0.a;
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp8.b_message;
                s9.getClass();
                ((hnsq)hftv3).b = s9;
                if(!hftv3.isImmutable()) {
                    hftp8.ensureMutable();
                }
                hnsq hnsq0 = (hnsq)hftp8.b_message;
                hfuo hfuo0 = hnsq0.c;
                if(!hfuo0.c()) {
                    hnsq0.c = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(arrayList0, hnsq0.c);
                hnsq hnsq1 = (hnsq)hftp8.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp8 = (hnrp)hftp0.b_message;
                hnsq1.getClass();
                hnrp8.d = hnsq1;
                hnrp8.c = 107;
                break;
            }
            case 11: {
                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hnrm.a).v_newBuilder();
                ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)hnrl.a).v_newBuilder();
                fmaz fmaz2 = fmbi0.f;
                gged_interceptors gged1 = fmaz2.e().b;
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                hnrl hnrl0 = (hnrl)hftp10.b_message;
                hfuo hfuo1 = hnrl0.b;
                if(!hfuo1.c()) {
                    hnrl0.b = ProtoLiteMessage.E(hfuo1);
                }
                hfrj.E(gged1, hnrl0.b);
                gged_interceptors gged2 = fmaz2.e().c;
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                hnrl hnrl1 = (hnrl)hftp10.b_message;
                hfuo hfuo2 = hnrl1.c;
                if(!hfuo2.c()) {
                    hnrl1.c = ProtoLiteMessage.E(hfuo2);
                }
                hfrj.E(gged2, hnrl1.c);
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                hnrm hnrm0 = (hnrm)hftp9.b_message;
                hnrl hnrl2 = (hnrl)hftp10.N_build();
                hnrl2.getClass();
                hnrm0.c = hnrl2;
                hnrm0.b |= 1;
                hnrm hnrm1 = (hnrm)hftp9.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp9 = (hnrp)hftp0.b_message;
                hnrm1.getClass();
                hnrp9.d = hnrm1;
                hnrp9.c = 108;
            }
        }
        switch(fmbi0.b().ordinal()) {
            case 6: {
                break;
            }
            case 8: {
                ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)hnso.a).v_newBuilder();
                String s10 = fmbi0.g.j();
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                hnso hnso2 = (hnso)hftp11.b_message;
                s10.getClass();
                hnso2.b = s10;
                hnso hnso3 = (hnso)hftp11.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnrp hnrp10 = (hnrp)hftp0.b_message;
                hnso3.getClass();
                hnrp10.f = hnso3;
                hnrp10.e = 201;
                break;
            }
            default: {
                throw new IllegalArgumentException("Got unknown callback failure action type integer: " + fmbi0.b().m);
            }
        }
        return (hnrp)hftp0.N_build();
    }

    public static gfsx b(hnrp hnrp0, gfsx gfsx0, gfsx gfsx1) {
        gfsx gfsx3;
        fmbb fmbb0 = fmbi.c();
        flwo.f(fmbb0, hnrp0, gfsx0, gfsx1);
        int v = 2;
        switch((hnst.b(hnrp0.j) == 0 ? 1 : hnst.b(hnrp0.j)) - 2) {
            case 1: {
                fmbg fmbg0 = new fmbg();
                fmbg0.c((hnrp0.c == 101 ? ((hnsm)hnrp0.d) : hnsm.a).b);
                fmbg0.b((hnrp0.c == 101 ? ((hnsm)hnrp0.d) : hnsm.a).d);
                fmbh fmbh0 = fmbg0.a();
                if((hnrp0.c == 101 ? ((hnsm)hnrp0.d) : hnsm.a).c) {
                    fmbb0.j(fmbh0);
                }
                else {
                    fmbb0.k(fmbh0);
                }
                goto label_64;
            }
            case 2: {
                fmbb0.d((hnrp0.c == 102 ? ((hnrj)hnrp0.d) : hnrj.a).b);
                goto label_64;
            }
            case 3: {
                fmbb0.o((hnrp0.c == 103 ? ((hnss)hnrp0.d) : hnss.a).b);
                goto label_64;
            }
            case 4: {
                hnsk hnsk0 = hnrp0.c == 104 ? ((hnsk)hnrp0.d) : hnsk.a;
                fmbe fmbe0 = new fmbe(null);
                if((1 & hnsk0.b) == 0) {
                label_27:
                    if((hnsk0.b & 2) == 0) {
                        gfsx3 = gfsx.m(fmbe0.a());
                    }
                    else {
                        fmfb fmfb0 = new fmfb();
                        fmfb0.b((hnsk0.d == null ? hnrk.a : hnsk0.d).d);
                        hnrk hnrk0 = hnsk0.d == null ? hnrk.a : hnsk0.d;
                        gfsx gfsx4 = flwo.c((hnrk0.c == null ? hnsl.a : hnrk0.c));
                        if(gfsx4.i()) {
                            fmfb0.a = (fmfw)gfsx4.d();
                            fmbe0.c(fmfb0.a());
                            gfsx3 = gfsx.m(fmbe0.a());
                        }
                        else {
                            gfsx3 = gfqx.a;
                        }
                    }
                }
                else {
                    gfsx gfsx2 = flwo.c((hnsk0.c == null ? hnsl.a : hnsk0.c));
                    if(gfsx2.i()) {
                        fmbe0.b(((fmfw)gfsx2.d()));
                        goto label_27;
                    }
                    else {
                        gfsx3 = gfqx.a;
                    }
                }
                if(!gfsx3.i()) {
                    return gfqx.a;
                }
                fmbb0.p(((fmbf)gfsx3.d()));
                return gfsx.m(fmbb0.a());
            }
            case 5: {
                fmbb0.r();
                goto label_64;
            }
            case 6: {
                fmbb0.c((hnrp0.c == 105 ? ((hnrh)hnrp0.d) : hnrh.a).b);
                goto label_64;
            }
            case 7: {
                fmbb0.l((hnrp0.c == 106 ? ((hnso)hnrp0.d) : hnso.a).b);
                goto label_64;
            }
            case 8: {
                hnsq hnsq0 = hnrp0.c == 107 ? ((hnsq)hnrp0.d) : hnsq.a;
                fmhs fmhs0 = new fmhs();
                fmhs0.c(hnsq0.b);
                ggdy ggdy0 = new ggdy();
                for(Object object0: hnsq0.c) {
                    fmht fmht0 = new fmht();
                    fmht0.b(((hnsr)object0).b);
                    fmht0.c(((hnsr)object0).c);
                    ggdy0.i(((gftm)gfsx.m(fmht0.a())).a);
                }
                fmhs0.b(ggdy0.h());
                fmbb0.n(((fmhv)((gftm)gfsx.m(fmhs0.a())).a));
            label_64:
                switch(hnrp0.k) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        v = 3;
                        break;
                    }
                    default: {
                        v = 0;
                    }
                }
                if(v == 3) {
                    fmbb0.g((hnrp0.e == 201 ? ((hnso)hnrp0.f) : hnso.a).b);
                    return gfsx.m(fmbb0.a());
                }
                fmbb0.q();
                return gfsx.m(fmbb0.a());
            }
            case 9: {
                flbj.e("ActionProtoConverter", "Decoration transitions not enabled.");
                return gfqx.a;
            }
            default: {
                flbj.c("ActionProtoConverter", "Unknown or missing action proto type.");
                return gfqx.a;
            }
        }
    }

    private static gfsx c(hnsl hnsl0) {
        if(hnst.b((hnsl0.c == null ? hnrp.a : hnsl0.c).j) != 7) {
            return gfqx.a;
        }
        fmbb fmbb0 = fmbi.c();
        flwo.f(fmbb0, (hnsl0.c == null ? hnrp.a : hnsl0.c), gfqx.a, gfqx.a);
        fmbb0.r();
        fmfv fmfv0 = fmfw.a();
        fmfv0.e(hnsl0.e);
        fmfv0.d(hnsl0.d);
        fmfv0.k(hnsl0.f);
        fmfv0.b(fmbb0.a());
        fmfv0.i(flwz.a((hnsl0.g == null ? hnrx.a : hnsl0.g)));
        fmfv0.j(hnsl0.h);
        fmfv0.h(hnsl0.i);
        fmfv0.c(hnsl0.k);
        fmfv0.g(hnsl0.j);
        return gfsx.m(fmfv0.a());
    }

    private static hnsk d(fmbf fmbf0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnsk.a).v_newBuilder();
        gfsx gfsx0 = fmbf0.a;
        if(gfsx0.i()) {
            hnsl hnsl0 = flwo.e(((fmfw)gfsx0.d()));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnsk hnsk0 = (hnsk)hftp0.b_message;
            hnsl0.getClass();
            hnsk0.c = hnsl0;
            hnsk0.b |= 1;
        }
        gfsx gfsx1 = fmbf0.b;
        if(gfsx1.i()) {
            Object object0 = gfsx1.d();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnrk.a).v_newBuilder();
            String s = ((fmfc)object0).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hnrk hnrk0 = (hnrk)hftp1.b_message;
            s.getClass();
            hnrk0.d = s;
            hnsl hnsl1 = flwo.e(((fmfc)object0).a);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hnrk hnrk1 = (hnrk)hftp1.b_message;
            hnsl1.getClass();
            hnrk1.c = hnsl1;
            hnrk1.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnsk hnsk1 = (hnsk)hftp0.b_message;
            hnrk hnrk2 = (hnrk)hftp1.N_build();
            hnrk2.getClass();
            hnsk1.d = hnrk2;
            hnsk1.b |= 2;
        }
        return (hnsk)hftp0.N_build();
    }

    private static hnsl e(fmfw fmfw0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnrp.a).v_newBuilder();
        gfsx gfsx0 = fmfw0.a;
        if(gfsx0.i()) {
            flwo.g(((fmbi)gfsx0.d()), hftp0);
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnsl.a).v_newBuilder();
        int v = fmfw0.j;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hnsl)hftp1.b_message).h = v;
        gfsx gfsx1 = fmfw0.b;
        if(gfsx1.i()) {
            Object object0 = gfsx1.d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hnsl)hftp1.b_message).d = (ByteString)object0;
        }
        gfsx gfsx2 = fmfw0.d;
        if(gfsx2.i()) {
            Object object1 = gfsx2.d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hnsl)hftp1.b_message).e = (String)object1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnrp)hftp0.b_message).j = 5;
        hnrp hnrp0 = (hnrp)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        hnrp0.getClass();
        ((hnsl)hftv0).c = hnrp0;
        ((hnsl)hftv0).b |= 1;
        int v1 = fmfw0.e;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hnsl)hftv1).f = v1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hnsl)hftp1.b_message).h = v;
        return (hnsl)hftp1.N_build();
    }

    private static void f(fmbb fmbb0, hnrp hnrp0, gfsx gfsx0, gfsx gfsx1) {
        gfsx gfsx2;
        fmbb0.b(hnrp0.i);
        if(!hnrp0.g.isEmpty()) {
            fmbb0.h(hnrp0.g);
        }
        hnry hnry0 = hnrp0.h == null ? hnry.a : hnrp0.h;
        switch((hnta.b(hnry0.b) == 0 ? 1 : hnta.b(hnry0.b)) - 2) {
            case 4: {
                fmex fmex0 = new fmex();
                fmex0.c(hnry0.c);
                fmex0.b(hnry0.e);
                gfsx2 = gfsx.m(fmcc.b(fmex0.a()));
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: {
                gfsx2 = gfsx.m(fmcc.a(flxa.a(hnry0)));
                break;
            }
            default: {
                gfsx2 = gfqx.a;
            }
        }
        if(gfsx2.i()) {
            fmbb0.f(((fmbc)gfsx2.d()));
        }
        if(gfsx0.i()) {
            fmbb0.m(((String)gfsx0.d()));
        }
        if(gfsx1.i()) {
            fmbb0.i(((String)gfsx1.d()));
        }
    }

    private static void g(fmbi fmbi0, ProtoLiteBuilder hftp0) {
        int v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnrp)hftp0.b_message).i = fmbi0.e;
        gfsx gfsx0 = fmbi0.c;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnrp)hftp0.b_message).g = (String)object0;
        }
        gfsx gfsx1 = fmbi0.d;
        if(gfsx1.i()) {
            hnry hnry0 = flxa.c(((fmbc)gfsx1.d()));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnrp hnrp0 = (hnrp)hftp0.b_message;
            hnry0.getClass();
            hnrp0.h = hnry0;
            hnrp0.b |= 1;
        }
        int v = 2;
        switch(fmba.a(fmbi0.a().m).ordinal()) {
            case 1: 
            case 2: {
                v1 = 3;
                break;
            }
            case 3: {
                v1 = 4;
                break;
            }
            case 4: {
                v1 = 5;
                break;
            }
            case 6: {
                v1 = 7;
                break;
            }
            case 7: {
                v1 = 8;
                break;
            }
            case 8: {
                v1 = 9;
                break;
            }
            case 5: 
            case 9: {
                v1 = 6;
                break;
            }
            case 10: {
                v1 = 10;
                break;
            }
            case 11: {
                v1 = 11;
                break;
            }
            default: {
                v1 = 2;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnrp)hftp0.b_message).j = v1 - 2;
        switch(fmba.a(fmbi0.b().m).ordinal()) {
            case 6: {
                break;
            }
            case 8: {
                v = 3;
                break;
            }
            default: {
                v = 1;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnrp hnrp1 = (hnrp)hftp0.b_message;
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        hnrp1.k = v - 2;
    }
}

