final class zwv implements ibtw {
    final znn a;
    final aacf b;
    final fby c;
    final fby d;
    final aacd e;

    public zwv(znn znn0, aacf aacf0, fby fby0, fby fby1, aacd aacd0) {
        this.a = znn0;
        this.b = aacf0;
        this.c = fby0;
        this.d = fby1;
        this.e = aacd0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        goz goz0 = (goz)object0;
        if((((Number)object1).intValue() & 3) == 2 && goz0.ac()) {
            goz0.G();
            return ibom.a;
        }
        znn znn0 = this.a;
        ggqk ggqk0 = znn0.e.E();
        ibuq.e(ggqk0, "iterator(...)");
        while(ggqk0.hasNext()) {
            znd znd0 = (znd)ggqk0.next();
            if((znd0 instanceof znb)) {
                goz0.M(0xE31C18DA);
                goz0.M(-1633490746);
                aacf aacf0 = this.b;
                int v = goz0.Z(aacf0) | goz0.Z(znd0);
                Object object2 = goz0.k();
                if(v != 0 || object2 == gop.a) {
                    object2 = new zwp(aacf0, znd0);
                    goz0.R(object2);
                }
                goz0.A();
                gze gze0 = gzf.e(2084718030, new zws(znd0), goz0);
                fiqv.a(((ibth)object2), null, false, null, this.c, null, null, null, gze0, goz0, 0x30000000, 494);
                goz0 = goz0;
                goz0.A();
                continue;
            }
            if((znd0 instanceof znc)) {
                goz0.M(0x806AC748);
                goz0.M(-1633490746);
                aacf aacf1 = this.b;
                int v1 = goz0.Z(aacf1) | goz0.Z(znd0);
                Object object3 = goz0.k();
                if(v1 != 0 || object3 == gop.a) {
                    object3 = new zwq(aacf1, znd0);
                    goz0.R(object3);
                }
                goz0.A();
                gze gze1 = gzf.e(0x69565BC4, new zwt(znd0), goz0);
                fiqv.c(((ibth)object3), null, false, null, this.d, null, null, gze1, goz0, 0x30000000, 494);
                goz0.A();
                continue;
            }
            if((znd0 instanceof zna)) {
                goz0.M(0xE31C5D00);
                goz0.M(-1633490746);
                aacd aacd0 = this.e;
                int v2 = goz0.Z(aacd0) | goz0.Z(znn0);
                Object object4 = goz0.k();
                if(v2 != 0 || object4 == gop.a) {
                    object4 = new zwr(aacd0, znn0);
                    goz0.R(object4);
                }
                goz0.A();
                gze gze2 = gzf.e(735806051, new zwu(znd0), goz0);
                fiqv.c(((ibth)object4), null, false, null, this.d, null, null, gze2, goz0, 0x30000000, 494);
                goz0.A();
                continue;
            }
            goz0.M(-484699098);
            goz0.A();
            throw new ibnq();
        }
        return ibom.a;
    }
}

