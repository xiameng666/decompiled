import java.util.Arrays;
import java.util.List;

public final class ehzx {
    public static final long a;
    public static final chz b;
    private static final long c;

    static {
        ehzx.a = ibzy.h(750, ibzz.c);
        ehzx.c = ibzy.h(500, ibzz.c);
        ehzx.b = new chz(0.44f, 0.69f, 0.64f, 1.0f);
    }

    public static final float a(gui gui0) {
        return ((Number)gui0.a()).floatValue();
    }

    public static final Object b(chb chb0, boolean z, ibrl ibrl0) {
        int v = z ? 90 : 36;
        float f = ((float)v) - ((Number)chb0.d()).floatValue() % ((float)v);
        if((f < ((float)v))) {
            f += (float)v;
        }
        Object object0 = chb.k(chb0, new Float(((Number)chb0.d()).floatValue() + f), chm.c(((int)ibzw.h(ehzx.a)), 0, ehzx.b, 2), null, ibrl0, 12);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public static final Object c(chb chb0, ibrl ibrl0) {
        ehzw ehzw0;
        if((ibrl0 instanceof ehzw)) {
            ehzw0 = (ehzw)ibrl0;
            int v = ehzw0.b;
            if((v & 0x80000000) == 0) {
                ehzw0 = new ehzw(ibrl0);
            }
            else {
                ehzw0.b = v - 0x80000000;
            }
        }
        else {
            ehzw0 = new ehzw(ibrl0);
        }
        Object object0 = ehzw0.a;
        Object object1 = ibrx.a;
        switch(ehzw0.b) {
            case 0: {
                ibnx.b(object0);
                ehzw0.c = chb0;
                ehzw0.b = 1;
                if(chb0.e(new Float(0.0f), ehzw0) != object1) {
                    goto label_20;
                }
                return object1;
            }
            case 1: {
                chb0 = ehzw0.c;
                ibnx.b(object0);
            label_20:
                cir cir0 = chm.d(chm.c(((int)ibzw.h(ehzx.c)), 0, cih.d, 2), 0, 0L, 6);
                ehzw0.c = null;
                ehzw0.b = 2;
                return chb.k(chb0, new Float(36.0f), cir0, null, ehzw0, 12) != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final void d(hfc hfc0, clj clj0, Integer integer0, goz goz0, int v) {
        Object object10;
        Object object2;
        ehzg ehzg0;
        Object object9;
        long v8;
        long v6;
        Object object1;
        long v2;
        hfc hfc1;
        ibuq.f(clj0, "stateTransition");
        goz goz1 = goz0.ao(0xC0168D5E);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(clj0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.V(0x7F14022C) ? 0x100 : 0x80);  // raw:outer_star
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.X(integer0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            goz1.M(0xE9B5E2B1);
            ehzq ehzq0 = ehzq.a;
            ehwv ehwv0 = (ehwv)clj0.g();
            goz1.M(0x5FA4011D);
            if(eiav.a(ehwv0)) {
                goz1.M(0x6A836AF);
                v2 = fpu.a(goz1).h;
            }
            else {
                goz1.M(0x6A83B2B);
                v2 = fpu.a(goz1).r;
            }
            goz1.x();
            goz1.x();
            hnl hnl0 = hll.f(v2);
            boolean z = goz1.X(hnl0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = ccs.a.a(hnl0);
                goz1.P(object0);
            }
            int v3 = (v1 >> 3 & 14 | 0x180) & 14 | 0xC00;
            int v4 = v3 & 14 ^ 6;
            if(clj0.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object1 = clj0.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z1 = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
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
            goz1.M(0x5FA4011D);
            if(eiav.a(((ehwv)object1))) {
                goz1.M(0x6A836AF);
                v6 = fpu.a(goz1).h;
            }
            else {
                goz1.M(0x6A83B2B);
                v6 = fpu.a(goz1).r;
            }
            goz1.x();
            goz1.x();
            hll hll0 = new hll(v6);
            int v7 = v3 & 14 | 0x30000;
            boolean z2 = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
            Object object3 = goz1.j();
            if(z2 || object3 == gop.a) {
                object3 = new gpx(new ehzo(clj0), null);
                goz1.P(object3);
            }
            ehwv ehwv1 = (ehwv)((gui)object3).a();
            goz1.M(0x5FA4011D);
            if(eiav.a(ehwv1)) {
                goz1.M(0x6A836AF);
                v8 = fpu.a(goz1).h;
            }
            else {
                goz1.M(0x6A83B2B);
                v8 = fpu.a(goz1).r;
            }
            goz1.x();
            goz1.x();
            hll hll1 = new hll(v8);
            boolean z3 = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
            Object object4 = goz1.j();
            if(z3 || object4 == gop.a) {
                gpx gpx0 = new gpx(new ehzp(clj0), null);
                goz1.P(gpx0);
                object4 = gpx0;
            }
            Integer integer1 = (int)0;
            gui gui0 = clz.g(clj0, hll0, hll1, ((cii)ehzq0.a(((gui)object4).a(), goz1, integer1)), ((cmc)object0), goz1, v7);
            qpb[] arr_qpb = new qpb[2];
            Integer integer2 = hln.b(ehzx.e(gui0));
            arr_qpb[0] = qoz.b(qle.b, integer2, new String[]{"**"}, goz1);
            Integer integer3 = hln.b(ehzx.e(gui0));
            arr_qpb[1] = qoz.b(qle.a, integer3, new String[]{"**"}, goz1);
            List list0 = ibpo.g(arr_qpb);
            goz1.x();
            qpb[] arr_qpb1 = (qpb[])list0.toArray(new qpb[0]);
            qox qox0 = qoz.a(((qpb[])Arrays.copyOf(arr_qpb1, arr_qpb1.length)), goz1);
            cld cld0 = ehzj.b(clj0);
            goz1.M(0xCFD7A080);
            goz1.M(0x6E3C21FE);
            Object object5 = goz1.j();
            Object object6 = gop.a;
            if(object5 == object6) {
                object5 = chc.a(0.0f);
                goz1.P(object5);
            }
            goz1.x();
            Object object7 = goz1.j();
            if(object7 == object6) {
                object7 = gqe.a(ibru.a, goz1);
                goz1.P(object7);
            }
            boolean z4 = ((ehzi)cld0).b == eiaw.d;
            boolean z5 = ((ehzi)cld0).b == eiaw.b;
            Boolean boolean0 = Boolean.valueOf(z4);
            Boolean boolean1 = Boolean.valueOf(z5);
            goz1.M(-1224400529);
            int v9 = goz1.Z(((icck)object7)) | goz1.Y(z4) | goz1.Z(((chb)object5)) | goz1.Y(z5);
            Object object8 = goz1.j();
            if(v9 != 0 || object8 == object6) {
                object8 = new ehzs(((icck)object7), z4, ((chb)object5), z5, null);
                goz1.P(object8);
            }
            goz1.x();
            gqe.e(boolean0, boolean1, ((ibtw)object8), goz1);
            goz1.x();
            ibuq.f(clj0, "stateTransition");
            goz1.M(0xC737D34F);
            ehzv ehzv0 = ehzv.a;
            cmc cmc0 = cmv.a;
            if(clj0.z()) {
                goz1.M(0x635A29CD);
                goz1.x();
                object9 = clj0.f();
            }
            else {
                goz1.M(0x63564970);
                boolean z6 = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
                object9 = goz1.j();
                if(z6 || object9 == object6) {
                    hbm hbm2 = hbl.a();
                    ibts ibts1 = hbm2 == null ? null : hbm2.i();
                    hbm hbm3 = hbl.b(hbm2);
                    try {
                        object10 = clj0.f();
                    }
                    finally {
                        hbl.d(hbm2, hbm3, ibts1);
                    }
                    goz1.P(object10);
                    object9 = object10;
                }
                goz1.x();
            }
            goz1.M(-1704690125);
            float f = 0.5f;
            float f1 = eiav.a(((ehwv)object9)) ? 1.0f : 0.5f;
            goz1.x();
            Float float0 = f1;
            boolean z7 = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
            Object object11 = goz1.j();
            if(z7 || object11 == gop.a) {
                object11 = new gpx(new ehzt(clj0), null);
                goz1.P(object11);
            }
            ehwv ehwv2 = (ehwv)((gui)object11).a();
            goz1.M(-1704690125);
            if(eiav.a(ehwv2)) {
                f = 1.0f;
            }
            goz1.x();
            Float float1 = f;
            boolean z8 = v4 > 4 && goz1.X(clj0) || (v3 & 6) == 4;
            Object object12 = goz1.j();
            if(z8 || object12 == gop.a) {
                object12 = new gpx(new ehzu(clj0), null);
                goz1.P(object12);
            }
            gui gui1 = clz.g(clj0, float0, float1, ((cii)ehzv0.a(((gui)object12).a(), goz1, integer1)), cmc0, goz1, v7);
            goz1.x();
            goz1.M(0xC8FD79ED);
            qok qok0 = qpj.d(new qou(0x7F14022C), goz1, 0);  // raw:outer_star
            goz1.M(0x7F86DF96);
            integer0.intValue();
            qok qok1 = qpj.d(new qou(0x7F14022D), goz1, 0);  // raw:outer_star_with_dial
            goz1.x();
            eiaw eiaw0 = eiaw.a;
            if(clc.a(cld0, eiaw0, eiaw0)) {
                ehzg0 = new ehzg(((qop)qok0).b(), "hold", 1, null, 56);
            }
            else {
                eiaw eiaw1 = eiaw.b;
                if(!clc.a(cld0, eiaw0, eiaw1) && !clc.a(cld0, eiaw1, eiaw0) && !clc.a(cld0, eiaw1, eiaw1)) {
                    eiaw eiaw2 = eiaw.c;
                    if(clc.a(cld0, eiaw0, eiaw2)) {
                        ehzg0 = new ehzg(((qop)qok0).b(), "hold", 1, null, 56);
                    }
                    else {
                        eiaw eiaw3 = eiaw.d;
                        if(clc.a(cld0, eiaw0, eiaw3) || clc.a(cld0, eiaw2, eiaw0) || clc.a(cld0, eiaw2, eiaw2) || clc.a(cld0, eiaw2, eiaw3) || clc.a(cld0, eiaw3, eiaw3)) {
                            ehzg0 = new ehzg(((qop)qok0).b(), "hold", 1, null, 56);
                        }
                        else if(clc.a(cld0, eiaw1, eiaw3) || clc.a(cld0, eiaw1, eiaw2)) {
                            ehzg0 = new ehzg((qok1 == null ? null : qok1.b()), "out", 1, qoe.b, 24);
                        }
                        else if(clc.a(cld0, eiaw2, eiaw1) || clc.a(cld0, eiaw3, eiaw1)) {
                            ehzg0 = new ehzg((qok1 == null ? null : qok1.b()), "in", 1, qoe.b, 24);
                        }
                        else if(!clc.a(cld0, eiaw3, eiaw2) && !clc.a(cld0, eiaw3, eiaw0)) {
                            ehzg0 = new ehzg(((qop)qok0).b(), "hold", 1, null, 56);
                        }
                        else {
                            ehzg0 = new ehzg(((qop)qok0).b(), "03 connected", 1, null, 56);
                        }
                    }
                }
                else {
                    ehzg0 = new ehzg((qok1 == null ? null : qok1.b()), "hold", 1, null, 56);
                }
            }
            qnu qnu0 = ehzj.c(ehzg0, goz1);
            goz1.x();
            int v11 = 1 ^ eiav.b(((ehwv)clj0.g()));
            cer cer0 = cef.p(chm.c(0xFA, 0, cih.d, 2), 2);
            ccf.b(((boolean)v11), null, cef.o(chm.c(0xFA, 0, cih.d, 2), 2), cer0, null, gzf.e(0x8C93B236, new ehzn(qnu0, hey0, gui1, ((chb)object5), qox0), goz1), goz1, 0x30000, 18);
            hfc1 = hey0;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ehzk(hfc1, clj0, integer0, v);
        }
    }

    private static final long e(gui gui0) {
        return ((hll)gui0.a()).j;
    }
}

