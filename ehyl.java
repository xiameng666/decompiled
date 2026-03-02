public final class ehyl {
    public static final void a(hfc hfc0, clj clj0, goz goz0, int v) {
        ehzg ehzg0;
        hfc hfc1;
        goz goz2;
        ibuq.f(clj0, "stateTransition");
        goz goz1 = goz0.ao(1910141271);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.X(clj0) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.V(0x7F140134) ? 0x100 : 0x80);  // raw:dial
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc1 = hfc0;
        }
        else {
            hey hey0 = hfc.e;
            qpb[] arr_qpb = new qpb[1];
            goz1.M(0xD6A51829);
            Integer integer0 = hln.b(fpu.a(goz1).a);
            qpb qpb0 = qoz.b(qle.a, integer0, new String[]{"**"}, goz1);
            goz1.x();
            arr_qpb[0] = qpb0;
            qox qox0 = qoz.a(arr_qpb, goz1);
            gui gui0 = ehxu.a(clj0, goz1, v1 >> 3 & 14 | 0x30);
            cld cld0 = ehzj.b(clj0);
            goz1.M(95534805);
            qok qok0 = qpj.d(new qou(0x7F140134), goz1, 0);  // raw:dial
            eiaw eiaw0 = eiaw.a;
            eiaw eiaw1 = eiaw.b;
            if(clc.a(cld0, eiaw0, eiaw1)) {
                ehzg0 = new ehzg(((qop)qok0).b(), "in", 1, qoe.b, 24);
            }
            else {
                eiaw eiaw2 = eiaw.c;
                if(clc.a(cld0, eiaw2, eiaw1)) {
                    ehzg0 = new ehzg(((qop)qok0).b(), "in", 1, qoe.b, 24);
                }
                else {
                    eiaw eiaw3 = eiaw.d;
                    if(clc.a(cld0, eiaw3, eiaw1)) {
                        ehzg0 = new ehzg(((qop)qok0).b(), "in", 1, qoe.b, 24);
                    }
                    else if(!clc.a(cld0, eiaw1, eiaw2) && !clc.a(cld0, eiaw1, eiaw0) && !clc.a(cld0, eiaw1, eiaw3)) {
                        ehzg0 = new ehzg(((qop)qok0).b(), "hold", 1, null, 56);
                    }
                    else {
                        ehzg0 = new ehzg(((qop)qok0).b(), "out", 1, qoe.b, 24);
                    }
                }
            }
            qnu qnu0 = ehzj.c(ehzg0, goz1);
            goz1.x();
            if(((ehzi)cld0).a != eiaw1 && ((ehzi)cld0).b != eiaw1) {
                goz2 = goz1;
                hfc1 = hey0;
            }
            else {
                qkb qkb0 = qnu0.h();
                goz1.M(5004770);
                boolean z = goz1.X(qnu0);
                Object object0 = goz1.j();
                if(z || object0 == gop.a) {
                    object0 = new ehyi(qnu0);
                    goz1.P(object0);
                }
                goz1.x();
                goz1.M(5004770);
                boolean z1 = goz1.X(gui0);
                Object object1 = goz1.j();
                if(z1 || object1 == gop.a) {
                    object1 = new ehyj(gui0);
                    goz1.P(object1);
                }
                goz1.x();
                goz2 = goz1;
                hfc1 = hey0;
                qob.c(qkb0, ((ibth)object0), hlv.a(hey0, ((ibts)object1)), false, false, false, 0, false, qox0, null, null, false, 0, goz2, 0x8000000, 0, 0xFEF8);
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ehyk(hfc1, clj0, v);
        }
    }
}

