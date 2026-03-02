public final class ehze {
    public static final long a;

    static {
        ehze.a = ibzy.h(1250, ibzz.c);
    }

    public static final void a(hfc hfc0, clj clj0, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(clj0, "stateTransition");
        goz goz1 = goz0.ao(0x4B523FBF);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(clj0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.V(0x7F140152) ? 0x100 : 0x80);  // raw:inner_star
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else {
            hfc1 = hfc.e;
            float f = ((Number)((ehwv)clj0.g()).b.f(Float.valueOf(0.0f))).floatValue();
            goz1.M(-767890305);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new ehyx();
                goz1.P(object0);
            }
            goz1.x();
            gtj gtj0 = (gtj)had.c(new Object[0], ((ibth)object0), goz1, 0x30);
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = chc.a(0.0f);
                goz1.P(object2);
            }
            goz1.x();
            if(Float.compare(f, gtj0.e()) >= 0) {
                goz1.M(0xB70BE1FE);
                Float float0 = f;
                goz1.M(-1633490746);
                int v2 = goz1.X(gtj0) | goz1.U(f);
                Object object3 = goz1.j();
                if(v2 != 0 || object3 == object1) {
                    object3 = new ehzc(gtj0, f, null);
                    goz1.P(object3);
                }
                goz1.x();
                gqe.f(float0, ((ibtw)object3), goz1);
            }
            else {
                goz1.M(0xB710749B);
                ibom ibom0 = ibom.a;
                goz1.M(5004770);
                boolean z = goz1.Z(((chb)object2));
                Object object4 = goz1.j();
                if(z || object4 == object1) {
                    object4 = new ehzd(((chb)object2), null);
                    goz1.P(object4);
                }
                goz1.x();
                gqe.f(ibom0, ((ibtw)object4), goz1);
            }
            goz1.x();
            eibd eibd0 = new eibd(gtj0, ((chb)object2));
            goz1.x();
            qpb[] arr_qpb = new qpb[1];
            goz1.M(0x68D7F57B);
            Integer integer0 = hln.b(fpu.a(goz1).h);
            qpb qpb0 = qoz.b(qle.a, integer0, new String[]{"**"}, goz1);
            goz1.x();
            arr_qpb[0] = qpb0;
            qox qox0 = qoz.a(arr_qpb, goz1);
            qok qok0 = qpj.d(new qou(0x7F140152), goz1, 0);  // raw:inner_star
            qnu qnu0 = ehzj.c(new ehzg(((qop)qok0).b(), "Circle pulsating", 0, null, 44), goz1);
            ehzi ehzi0 = (ehzi)ehzj.b(clj0);
            ccf.b(ehzi0.b == eiaw.c && ehzi0.a != eiaw.b, null, cef.o(null, 3), cef.p(null, 3), null, gzf.e(0xA5220A97, new ehzb(qnu0, hfc1, eibd0, qox0, qok0), goz1), goz1, 200064, 18);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ehyy(hfc1, clj0, v);
        }
    }
}

