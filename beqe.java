import java.util.ArrayList;

public final class beqe implements evqf {
    public final beqo a;
    public final gged_interceptors b;

    public beqe(beqo beqo0, gged_interceptors gged0) {
        this.a = beqo0;
        this.b = gged0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        beqo beqo0 = this.a;
        grbi grbi0 = (grbi)object0;
        gfsx gfsx0 = beqo0.q.b();
        if(!gfsx0.i()) {
            ((ggtj)beqo.a.j()).x("Could not determine whether userRequiresPrivacyPreservation");
        }
        if(((Boolean)gfsx0.f(Boolean.valueOf(true))).booleanValue()) {
            ibuq.f(grbi0, "<this>");
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)grbi0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)grbi0));
            ibuq.f(((graw)hftp0), "builder");
            hfxu hfxu0 = grbl.a(((graw)hftp0));
            ArrayList arrayList0 = new ArrayList(ibpo.q(hfxu0, 10));
            for(Object object1: hfxu0) {
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((grbg)object1))).jf(5, null);
                hftp1.X(((ProtoLiteMessage)(((grbg)object1))));
                grbf grbf0 = (grbf)hftp1;
                ibuq.f(grbf0, "builder");
                hfxu hfxu1 = grbk.a(grbf0);
                ArrayList arrayList1 = new ArrayList(ibpo.q(hfxu1, 10));
                for(Object object2: hfxu1) {
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((grbe)object2))).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)(((grbe)object2))));
                    grbb grbb0 = (grbb)hftp2;
                    ibuq.f(grbb0, "builder");
                    hfxu hfxu2 = grbj.a(grbb0);
                    ArrayList arrayList2 = new ArrayList(ibpo.q(hfxu2, 10));
                    for(Object object3: hfxu2) {
                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)(((grax)object3))).jf(5, null);
                        hftp3.X(((ProtoLiteMessage)(((grax)object3))));
                        ibuq.f(hftp3, "builder");
                        hhyo hhyo0 = ((grax)hftp3.b_message).d;
                        if(hhyo0 == null) {
                            hhyo0 = hhyo.a;
                        }
                        ibuq.e(hhyo0, "getBrandingInfo(...)");
                        hhyo hhyo1 = beoe.a(hhyo0);
                        ibuq.f(hhyo1, "value");
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        grax grax0 = (grax)hftp3.b_message;
                        hhyo1.getClass();
                        grax0.d = hhyo1;
                        grax0.b |= 1;
                        ProtoLiteMessage hftv0 = hftp3.N_build();
                        ibuq.e(hftv0, "build(...)");
                        arrayList2.add(((grax)hftv0));
                    }
                    grbj.a(grbb0);
                    if(!grbb0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)grbb0).ensureMutable();
                    }
                    ((grbe)grbb0.b_message).c = hfvv.a;
                    grbj.a(grbb0);
                    grbb0.k(arrayList2);
                    ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)grbb0).N_build();
                    ibuq.e(hftv1, "build(...)");
                    arrayList1.add(((grbe)hftv1));
                }
                grbk.a(grbf0);
                if(!grbf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)grbf0).ensureMutable();
                }
                ((grbg)grbf0.b_message).e = hfvv.a;
                grbk.a(grbf0);
                if(!grbf0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)grbf0).ensureMutable();
                }
                grbg grbg0 = (grbg)grbf0.b_message;
                grbg0.b();
                hfrj.E(arrayList1, grbg0.e);
                ProtoLiteMessage hftv2 = ((ProtoLiteBuilder)grbf0).N_build();
                ibuq.e(hftv2, "build(...)");
                arrayList0.add(((grbg)hftv2));
            }
            grbl.a(((graw)hftp0));
            if(!((graw)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((graw)hftp0))).ensureMutable();
            }
            ((grbi)((graw)hftp0).b_message).d = hfvv.a;
            grbl.a(((graw)hftp0));
            ((graw)hftp0).a(arrayList0);
            ProtoLiteMessage hftv3 = ((ProtoLiteBuilder)(((graw)hftp0))).N_build();
            ibuq.e(hftv3, "build(...)");
            grbi0 = (grbi)hftv3;
        }
        beqo0.f.l(grbi0);
        lqi lqi0 = beqo0.h;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gqxn.a).v_newBuilder();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        for(Object object4: grbi0.d) {
            grbg grbg1 = (grbg)object4;
            int v6 = (graz.b(grbg1.c) == null ? graz.a : graz.b(grbg1.c)).ordinal();
            if(v6 == 1) {
                v1 = grbg1.d;
                v2 = grbg1.e.size();
            }
            else {
                switch(v6) {
                    case 2: {
                        v3 = grbg1.d;
                        break;
                    }
                    case 3: {
                        v4 = grbg1.d;
                        v5 = grbg1.e.size();
                    }
                }
            }
        }
        gged_interceptors gged0 = this.b;
        int v7 = gged0.size();
        int v8 = 0;
        for(int v = 0; v < v7; ++v) {
            v8 += ((ggna)((gqlt)gged0.get(v)).c).c;
        }
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp4.b_message;
        ((gqxn)hftv4).b |= 2;
        ((gqxn)hftv4).d = v1;
        if(!hftv4.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp4.b_message;
        ((gqxn)hftv5).b |= 0x800;
        ((gqxn)hftv5).i = v8;
        if(!hftv5.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp4.b_message;
        ((gqxn)hftv6).b |= 8;
        ((gqxn)hftv6).e = v2;
        if(!hftv6.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp4.b_message;
        ((gqxn)hftv7).b |= 0x100;
        ((gqxn)hftv7).h = v3;
        if(!hftv7.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv8 = hftp4.b_message;
        ((gqxn)hftv8).b |= 0x40;
        ((gqxn)hftv8).f = v4;
        if(!hftv8.isImmutable()) {
            hftp4.ensureMutable();
        }
        gqxn gqxn0 = (gqxn)hftp4.b_message;
        gqxn0.b |= 0x80;
        gqxn0.g = v5;
        lqi0.l(((gqxn)hftp4.N_build()));
    }
}

