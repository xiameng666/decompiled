public final class ddfh {
    public static final jhk a(gra gra0) {
        return (jhk)gra0.a();
    }

    public static final void b(ibts ibts0, ibth ibth0, gra gra0) {
        ibts0.a(ddfh.a(gra0).a());
        ibth0.a();
    }

    public static final void c(gra gra0, jhk jhk0) {
        gra0.b(jhk0);
    }

    public static final void d(String s, ibts ibts0, ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xADAD9EC);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            hax hax0 = jhk.a;
            goz1.M(5004770);
            Object object0 = goz1.j();
            if((v1 & 14) == 4 || object0 == gop.a) {
                object0 = new ddeq(s);
                goz1.P(object0);
            }
            goz1.x();
            gra gra0 = had.b(new Object[0], hax0, ((ibth)object0), goz1, 0);
            goz1.M(0x6E3C21FE);
            Object object1 = goz1.j();
            Object object2 = gop.a;
            if(object1 == object2) {
                object1 = new hix();
                goz1.P(object1);
            }
            goz1.x();
            goz1.M(5004770);
            Object object3 = goz1.j();
            if(object3 == object2) {
                object3 = new ddes(((hix)object1), null);
                goz1.P(object3);
            }
            goz1.x();
            gqe.f(((hix)object1), ((ibtw)object3), goz1);
            cmig.f(0x403A0, gzf.e(2321006, new ddfg(ibth0, ibts0, gra0, s, ((hix)object1)), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dder(s, ibts0, ibth0, v);
        }
    }
}

