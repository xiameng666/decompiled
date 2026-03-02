public final class ctdo {
    public final chgu a;
    public final cmdb b;
    public final ccmg c;

    public ctdo(chgu chgu0, cmdb cmdb0, ccmg ccmg0) {
        ibuq.f(ccmg0, "facetEventLogger");
        super();
        this.a = chgu0;
        this.b = cmdb0;
        this.c = ccmg0;
    }

    public final void a(int v, ctec ctec0, cteb cteb0) {
        haag haag1;
        haag haag0;
        haah haah0;
        ibuq.f(ctec0, "mainFeatureStatus");
        ibuq.f(cteb0, "featureStatus");
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haai.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        switch(v) {
            case 0: {
                haah0 = haah.b;
                break;
            }
            case 1: 
            case 2: {
                haah0 = haah.b;
                break;
            }
            case 3: 
            case 4: {
                haah0 = haah.c;
                break;
            }
            case 5: {
                haah0 = haah.d;
                break;
            }
            case 6: {
                haah0 = haah.e;
                break;
            }
            default: {
                haah0 = haah.a;
            }
        }
        ibuq.f(haah0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haai haai0 = (haai)hftp0.b_message;
        haai0.b = haah0.a();
        ibuq.f(ctec0, "<this>");
        switch(ctec0.ordinal()) {
            case 0: {
                haag0 = haag.a;
                break;
            }
            case 1: 
            case 2: {
                haag0 = haag.c;
                break;
            }
            case 3: 
            case 4: {
                haag0 = haag.d;
                break;
            }
            case 5: {
                haag0 = haag.a;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(haag0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haai haai1 = (haai)hftp0.b_message;
        haai1.c = haag0.a();
        ibuq.f(cteb0, "<this>");
        switch(cteb0.ordinal()) {
            case 0: {
                haag1 = haag.b;
                break;
            }
            case 1: {
                haag1 = haag.c;
                break;
            }
            case 2: {
                haag1 = haag.d;
                break;
            }
            case 3: {
                haag1 = haag.a;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(haag1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haai haai2 = (haai)hftp0.b_message;
        haai2.d = haag1.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((haai)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((haai)hftv0).getClass();
        habi0.c = (haai)hftv0;
        habi0.b = 14;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
    }

    public final void b(ctdi ctdi0, ctdh ctdh0) {
        haaj haaj0;
        haak haak0;
        ibuq.f(ctdi0, "actionStatus");
        ibuq.f(ctdh0, "action");
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haal.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(ctdi0, "<this>");
        switch(ctdi0.ordinal()) {
            case 0: {
                haak0 = haak.a;
                break;
            }
            case 1: {
                haak0 = haak.b;
                break;
            }
            case 2: {
                haak0 = haak.c;
                break;
            }
            case 3: {
                haak0 = haak.d;
                break;
            }
            case 4: {
                haak0 = haak.e;
                break;
            }
            case 5: {
                haak0 = haak.f;
                break;
            }
            case 6: {
                haak0 = haak.g;
                break;
            }
            case 7: {
                haak0 = haak.h;
                break;
            }
            case 8: {
                haak0 = haak.i;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(haak0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haal haal0 = (haal)hftp0.b_message;
        haal0.b = haak0.a();
        ibuq.f(ctdh0, "<this>");
        switch(ctdh0.ordinal()) {
            case 0: {
                haaj0 = haaj.a;
                break;
            }
            case 1: {
                haaj0 = haaj.b;
                break;
            }
            case 2: {
                haaj0 = haaj.c;
                break;
            }
            case 3: {
                haaj0 = haaj.d;
                break;
            }
            case 4: {
                haaj0 = haaj.e;
                break;
            }
            case 5: {
                haaj0 = haaj.f;
                break;
            }
            case 6: {
                haaj0 = haaj.g;
                break;
            }
            case 7: {
                haaj0 = haaj.h;
                break;
            }
            case 8: {
                haaj0 = haaj.i;
                break;
            }
            case 9: {
                haaj0 = haaj.j;
                break;
            }
            case 10: {
                haaj0 = haaj.k;
                break;
            }
            case 11: {
                haaj0 = haaj.l;
                break;
            }
            case 12: {
                haaj0 = haaj.m;
                break;
            }
            case 13: {
                haaj0 = haaj.n;
                break;
            }
            case 14: {
                haaj0 = haaj.o;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(haaj0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haal haal1 = (haal)hftp0.b_message;
        haal1.c = haaj0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((haal)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((haal)hftv0).getClass();
        habi0.c = (haal)hftv0;
        habi0.b = 9;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
        ctdh ctdh1 = ctdh.g;
        if(ctdh0 == ctdh1 && ctdi0 == ctdi.c) {
            this.c.a(bbdg.qH);
            return;
        }
        if(ctdh0 == ctdh1) {
            ibuq.f(ctdi0, "<this>");
            switch(ctdi0.ordinal()) {
                case 0: 
                case 1: 
                case 2: {
                    break;
                }
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: {
                    this.c.a(bbdg.qI);
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
    }

    public final void c(ctdh ctdh0) {
        ibuq.f(ctdh0, "action");
        this.b(ctdi.d, ctdh0);
    }

    public final void d(ctdh ctdh0) {
        ibuq.f(ctdh0, "action");
        this.b(ctdi.b, ctdh0);
    }

    public final void e(ctdh ctdh0) {
        ibuq.f(ctdh0, "action");
        this.b(ctdi.c, ctdh0);
    }

    public final void f(boolean z) {
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haap.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        haao haao0 = z ? haao.b : haao.c;
        ibuq.f(haao0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haap haap0 = (haap)hftp0.b_message;
        haap0.b = haao0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((haap)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((haap)hftv0).getClass();
        habi0.c = (haap)hftv0;
        habi0.b = 11;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
        if(z) {
            this.c.a(bbdg.qF);
            return;
        }
        this.c.a(bbdg.qG);
    }

    public final void g(haaq haaq0, haan haan0) {
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haar.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(haaq0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haar haar0 = (haar)hftp0.b_message;
        haar0.c = haaq0.a();
        ibuq.f(haan0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haar haar1 = (haar)hftp0.b_message;
        haan0.getClass();
        haar1.d = haan0;
        haar1.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((haar)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((haar)hftv0).getClass();
        habi0.c = (haar)hftv0;
        habi0.b = 4;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
    }

    public final void h(ctdl ctdl0) {
        ibuq.f(ctdl0, "source");
        int v = ctdn.c(ctdl0);
        this.r(haat.b, v);
    }

    public final void i(int v, ctdg ctdg0, ctdl ctdl0) {
        ibuq.f(ctdg0, "changeResult");
        ibuq.f(ctdl0, "source");
        this.s(haba.b, habc.b, ctdl0, 1, v, ctdg0);
    }

    public final void j(boolean z, int v, int v1, ctdg ctdg0, ctdl ctdl0) {
        ibuq.f(ctdg0, "changeResult");
        ibuq.f(ctdl0, "source");
        this.s(haba.b, (z ? habc.b : habc.c), ctdl0, v, v1, ctdg0);
        if(ctdg0 != ctdg.a) {
            return;
        }
        if(z) {
            this.c.a(bbdg.qr);
            return;
        }
        this.c.a(bbdg.qs);
    }

    public final void k(String s) {
        haad haad0;
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haaf.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(hvmv.a.c().c()) {
            try {
                switch(((ctdj)Enum.valueOf(ctdj.class, s)).ordinal()) {
                    case 0: {
                        haad0 = haad.a;
                        break;
                    }
                    case 1: {
                        haad0 = haad.b;
                        break;
                    }
                    case 2: {
                        haad0 = haad.c;
                        break;
                    }
                    case 3: {
                        haad0 = haad.d;
                        break;
                    }
                    case 4: {
                        haad0 = haad.e;
                        break;
                    }
                    case 5: {
                        haad0 = haad.f;
                        break;
                    }
                    case 6: {
                        haad0 = haad.g;
                        break;
                    }
                    case 7: {
                        haad0 = haad.h;
                        break;
                    }
                    case 8: {
                        haad0 = haad.i;
                        break;
                    }
                    case 9: {
                        haad0 = haad.j;
                        break;
                    }
                    case 10: {
                        haad0 = haad.k;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
            catch(IllegalArgumentException unused_ex) {
                haad0 = haad.a;
            }
        }
        else {
            haad[] arr_haad = haad.values();
            for(int v = 0; true; ++v) {
                haad0 = null;
                if(v >= arr_haad.length) {
                    break;
                }
                haad haad1 = arr_haad[v];
                if(ibuq.m(haad1.name(), s)) {
                    haad0 = haad1;
                    break;
                }
            }
            if(haad0 == null) {
                haad0 = haad.a;
            }
        }
        ibuq.f(haad0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haaf haaf0 = (haaf)hftp0.b_message;
        haaf0.b = haad0.a();
        haae haae0 = haae.b;
        ibuq.f(haae0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haaf haaf1 = (haaf)hftp0.b_message;
        haaf1.c = haae0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((haaf)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((haaf)hftv0).getClass();
        habi0.c = (haaf)hftv0;
        habi0.b = 10;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
    }

    public final void l(haav haav0) {
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haaw.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(haav0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haaw haaw0 = (haaw)hftp0.b_message;
        haaw0.b = haav0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((haaw)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((haaw)hftv0).getClass();
        habi0.c = (haaw)hftv0;
        habi0.b = 6;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
    }

    public final void m(habg habg0) {
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)habh.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(habg0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        habh habh0 = (habh)hftp0.b_message;
        habh0.b = habg0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((habh)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((habh)hftv0).getClass();
        habi0.c = (habh)hftv0;
        habi0.b = 7;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
    }

    public static void n(ctdo ctdo0, haat haat0) {
        ctdo0.r(haat0, 0);
    }

    public final void o(ctdd ctdd0, int v, Integer integer0) {
        this.q(7, 4, ctdn.d(v), ctdn.b(integer0), (ctdd0 == null ? null : ctdn.a(ctdd0)));
    }

    public final void p(int v, Integer integer0) {
        this.q(6, 3, ctdn.d(v), ctdn.b(integer0), null);
        this.c.a(bbdg.qp);
    }

    public final void q(int v, int v1, haay haay0, haan haan0, haac haac0) {
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haas.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((haas)hftv0).c = v - 2;
        if(v1 != 0) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            haas haas0 = (haas)hftp0.b_message;
            if(v1 == 1) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            haas0.d = v1 - 2;
        }
        if(haay0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((haas)hftp0.b_message).e = haay0;
            ((haas)hftp0.b_message).b |= 1;
        }
        if(haan0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((haas)hftp0.b_message).f = haan0;
            ((haas)hftp0.b_message).b |= 2;
        }
        if(haac0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((haas)hftp0.b_message).g = haac0;
            ((haas)hftp0.b_message).b |= 4;
        }
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((haas)hftv1), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((haas)hftv1).getClass();
        habi0.c = (haas)hftv1;
        habi0.b = 5;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
    }

    public final void r(haat haat0, int v) {
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haau.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(haat0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        haau haau0 = (haau)hftp0.b_message;
        haau0.b = haat0.a();
        if(v != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            haau haau1 = (haau)hftp0.b_message;
            if(v == 1) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            haau1.c = v - 2;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((haau)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((haau)hftv0).getClass();
        habi0.c = (haau)hftv0;
        habi0.b = 13;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
    }

    private final void s(haba haba0, habc habc0, ctdl ctdl0, int v, int v1, ctdg ctdg0) {
        haaz haaz0;
        habb habb0;
        gzzz gzzz0 = gzzy.a(((ProtoLiteMessage)habi.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)habd.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(haba0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        habd habd0 = (habd)hftp0.b_message;
        habd0.c = haba0.a();
        ibuq.f(habc0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        habd habd1 = (habd)hftp0.b_message;
        habd1.d = habc0.a();
        ibuq.f(ctdl0, "<this>");
        switch(ctdl0.ordinal()) {
            case 0: {
                habb0 = habb.a;
                break;
            }
            case 1: {
                habb0 = habb.b;
                break;
            }
            case 2: {
                habb0 = habb.c;
                break;
            }
            case 3: {
                habb0 = habb.d;
                break;
            }
            case 4: {
                habb0 = habb.e;
                break;
            }
            case 5: {
                habb0 = habb.f;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(habb0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        habd habd2 = (habd)hftp0.b_message;
        habd2.h = habb0.a();
        haan haan0 = ctdn.b(Integer.valueOf(v));
        if(haan0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((habd)hftp0.b_message).e = haan0;
            ((habd)hftp0.b_message).b |= 1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((habd)hftp0.b_message).f = v1;
        ibuq.f(ctdg0, "<this>");
        switch(ctdg0.ordinal()) {
            case 0: {
                haaz0 = haaz.b;
                break;
            }
            case 1: {
                haaz0 = haaz.c;
                break;
            }
            case 2: {
                haaz0 = haaz.d;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        ibuq.f(haaz0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        habd habd3 = (habd)hftp0.b_message;
        habd3.g = haaz0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((habd)hftv0), "value");
        ProtoLiteBuilder hftp1 = gzzz0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habi habi0 = (habi)hftp1.b_message;
        ((habd)hftv0).getClass();
        habi0.c = (habd)hftv0;
        habi0.b = 8;
        habi habi1 = gzzz0.a();
        this.a.j(((ProtoLiteMessage)habi1));
    }
}

