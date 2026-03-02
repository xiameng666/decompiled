public final class ehyw {
    public static final float a(gui gui0) {
        return ((Number)gui0.a()).floatValue();
    }

    public static final cii b() {
        return chm.c(750, 0, cih.a, 2);
    }

    public static final void c(hfc hfc0, clj clj0, Integer integer0, Integer integer1, goz goz0, int v) {
        Object object6;
        Object object2;
        ehzg ehzg0;
        Object object5;
        Object object1;
        int v1;
        hfc hfc1;
        ibuq.f(clj0, "stateTransition");
        goz goz1 = goz0.ao(0x11FE8A21);
        if((v & 6) == 0) {
            hfc1 = hfc0;
            v1 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v1 = v;
        }
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(clj0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.V(0x7F140152) ? 0x100 : 0x80);  // raw:inner_star
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.X(integer0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.X(integer1) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            qpb[] arr_qpb = new qpb[1];
            goz1.M(2014069038);
            int v2 = v1 >> 3 & 14;
            ehys ehys0 = ehys.a;
            ehwv ehwv0 = (ehwv)clj0.g();
            goz1.M(0x76A556FF);
            float f = 1.0f;
            float f1 = eiav.b(ehwv0) ? 1.0f : ((Number)ehwv0.b.f(Float.valueOf(0.0f))).floatValue();
            long v3 = hln.h(fpu.a(goz1).a, fpu.a(goz1).h, f1);
            goz1.x();
            hnl hnl0 = hll.f(v3);
            boolean z = goz1.X(hnl0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = ccs.a.a(hnl0);
                goz1.P(object0);
            }
            int v4 = (v2 | 0x180) & 14 | 0xC00;
            int v5 = v4 & 14 ^ 6;
            if(clj0.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object1 = clj0.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z1 = v5 > 4 && goz1.X(clj0) || (v4 & 6) == 4;
                object1 = goz1.j();
                if(z1 || object1 == gop.a) {
                    hbm hbm0 = hbl.a();
                    ibts ibts0 = hbm0 == null ? null : hbm0.i();
                    hbm hbm1 = hbl.b(hbm0);
                    try {
                        object2 = clj0.f();
                    }
                    finally {
                        hbl.d(hbm0, hbm1, ibts0);
                    }
                    goz1.P(object2);
                    object1 = object2;
                }
                goz1.x();
            }
            goz1.M(0x76A556FF);
            float f2 = eiav.b(((ehwv)object1)) ? 1.0f : ((Number)((ehwv)object1).b.f(Float.valueOf(0.0f))).floatValue();
            long v7 = hln.h(fpu.a(goz1).a, fpu.a(goz1).h, f2);
            goz1.x();
            hll hll0 = new hll(v7);
            boolean z2 = v5 > 4 && goz1.X(clj0) || (v4 & 6) == 4;
            Object object3 = goz1.j();
            if(z2 || object3 == gop.a) {
                object3 = new gpx(new ehyq(clj0), null);
                goz1.P(object3);
            }
            ehwv ehwv1 = (ehwv)((gui)object3).a();
            goz1.M(0x76A556FF);
            float f3 = eiav.b(ehwv1) ? 1.0f : ((Number)ehwv1.b.f(Float.valueOf(0.0f))).floatValue();
            long v8 = hln.h(fpu.a(goz1).a, fpu.a(goz1).h, f3);
            goz1.x();
            hll hll1 = new hll(v8);
            boolean z3 = v5 > 4 && goz1.X(clj0) || (v4 & 6) == 4;
            Object object4 = goz1.j();
            if(z3 || object4 == gop.a) {
                object4 = new gpx(new ehyr(clj0), null);
                goz1.P(object4);
            }
            Integer integer2 = (int)0;
            int v9 = v4 & 14 | 0x30000;
            Integer integer3 = hln.b(((hll)clz.g(clj0, hll0, hll1, ((cii)ehys0.a(((gui)object4).a(), goz1, integer2)), ((cmc)object0), goz1, v9).a()).j);
            qpb qpb0 = qoz.b(qle.a, integer3, new String[]{"**"}, goz1);
            goz1.x();
            arr_qpb[0] = qpb0;
            qox qox0 = qoz.a(arr_qpb, goz1);
            ibuq.f(clj0, "uiStateTransition");
            goz1.M(0x2A84DB19);
            ehyv ehyv0 = ehyv.a;
            cmc cmc0 = cmv.a;
            if(clj0.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object5 = clj0.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z4 = v5 > 4 && goz1.X(clj0) || (v4 & 6) == 4;
                object5 = goz1.j();
                if(z4 || object5 == gop.a) {
                    hbm hbm2 = hbl.a();
                    ibts ibts1 = hbm2 == null ? null : hbm2.i();
                    hbm hbm3 = hbl.b(hbm2);
                    try {
                        object6 = clj0.f();
                    }
                    finally {
                        hbl.d(hbm2, hbm3, ibts1);
                    }
                    goz1.P(object6);
                    object5 = object6;
                }
                goz1.x();
            }
            goz1.M(0xFDB185FD);
            float f4 = eiav.b(((ehwv)object5)) ? 1.0f : Math.max(((Number)((ehwv)object5).b.f(Float.valueOf(0.0f))).floatValue(), 0.3f);
            goz1.x();
            Float float0 = f4;
            boolean z5 = v5 > 4 && goz1.X(clj0) || (v4 & 6) == 4;
            Object object7 = goz1.j();
            if(z5 || object7 == gop.a) {
                object7 = new gpx(new ehyt(clj0), null);
                goz1.P(object7);
            }
            ehwv ehwv2 = (ehwv)((gui)object7).a();
            goz1.M(0xFDB185FD);
            if(!eiav.b(ehwv2)) {
                f = Math.max(((Number)ehwv2.b.f(Float.valueOf(0.0f))).floatValue(), 0.3f);
            }
            goz1.x();
            Float float1 = f;
            boolean z6 = v5 > 4 && goz1.X(clj0) || (v4 & 6) == 4;
            Object object8 = goz1.j();
            if(z6 || object8 == gop.a) {
                gpx gpx0 = new gpx(new ehyu(clj0), null);
                goz1.P(gpx0);
                object8 = gpx0;
            }
            gui gui0 = clz.g(clj0, float0, float1, ((cii)ehyv0.a(((gui)object8).a(), goz1, integer2)), cmc0, goz1, v9);
            goz1.x();
            gui gui1 = ehxu.a(clj0, goz1, v2 | 0x30);
            cld cld0 = ehzj.b(clj0);
            goz1.M(0xEF32634F);
            qok qok0 = qpj.d(new qou(0x7F140152), goz1, 0);  // raw:inner_star
            goz1.M(0xEC26FBB9);
            qok qok1 = qpj.d(new qou(integer0.intValue()), goz1, 0);
            goz1.x();
            goz1.M(0xEC270D43);
            qok qok2 = qpj.d(new qou(integer1.intValue()), goz1, 0);
            goz1.x();
            eiaw eiaw0 = eiaw.a;
            if(clc.a(cld0, eiaw0, eiaw0)) {
                ehzg0 = new ehzg(((qop)qok0).b(), "Celebration loop", 1, null, 56);
            }
            else {
                eiaw eiaw1 = eiaw.b;
                if(clc.a(cld0, eiaw0, eiaw1)) {
                    ehzg0 = new ehzg((qok2 == null ? null : qok2.b()), "reverse", 1, qoe.b, 24);
                }
                else {
                    eiaw eiaw2 = eiaw.c;
                    if(clc.a(cld0, eiaw0, eiaw2)) {
                        ehzg0 = new ehzg(((qop)qok0).b(), "Circle to meteoroid", 1, qoe.b, 24);
                    }
                    else {
                        eiaw eiaw3 = eiaw.d;
                        if(clc.a(cld0, eiaw0, eiaw3)) {
                            ehzg0 = new ehzg(((qop)qok0).b(), "Circle to meteoroid", 1, qoe.b, 24);
                        }
                        else if(clc.a(cld0, eiaw1, eiaw0)) {
                            ehzg0 = new ehzg(((qop)qok0).b(), "Pointer to circle", 1, qoe.b, 24);
                        }
                        else if(clc.a(cld0, eiaw1, eiaw1)) {
                            ehzg0 = new ehzg((qok1 == null ? null : qok1.b()), "hold", 1, null, 56);
                        }
                        else if(clc.a(cld0, eiaw1, eiaw2) || clc.a(cld0, eiaw1, eiaw3)) {
                            ehzg0 = new ehzg((qok1 == null ? null : qok1.b()), "out", 1, null, 56);
                        }
                        else if(clc.a(cld0, eiaw2, eiaw0) || clc.a(cld0, eiaw3, eiaw0)) {
                            ehzg0 = new ehzg(((qop)qok0).b(), "Meteoroid to circle", 1, qoe.b, 24);
                        }
                        else if(clc.a(cld0, eiaw2, eiaw1) || clc.a(cld0, eiaw3, eiaw1)) {
                            ehzg0 = new ehzg((qok1 == null ? null : qok1.b()), "in", 1, null, 56);
                        }
                        else if(!clc.a(cld0, eiaw2, eiaw2) && !clc.a(cld0, eiaw3, eiaw2) && !clc.a(cld0, eiaw2, eiaw3) && !clc.a(cld0, eiaw3, eiaw3)) {
                            ehzg0 = new ehzg(((qop)qok0).b(), "Circle pulsating", 0, null, 44);
                        }
                        else {
                            ehzg0 = new ehzg(((qop)qok0).b(), "Circle pulsating", 0, null, 60);
                        }
                    }
                }
            }
            qnu qnu0 = ehzj.c(ehzg0, goz1);
            goz1.x();
            ccf.b(eiav.a(((ehwv)clj0.g())), null, cef.o(new cmb(200, 200, cih.d), 2).a(cef.q(new cmb(400, 100, cih.a), 0.16f, 4)), cef.p(null, 3), null, gzf.e(0x5F2D82F9, new ehyp(qnu0, hfc1, gui0, gui1, qox0), goz1), goz1, 0x30C00, 18);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ehym(hfc0, clj0, integer0, integer1, v);
        }
    }
}

