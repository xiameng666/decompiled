final class zzh implements ibtx {
    final znx a;

    public zzh(znx znx0) {
        this.a = znx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        float f = ((dih)object0).d();
        znx znx0 = this.a;
        gged_interceptors gged0 = znx0.a;
        ((goz)object1).M(0x97EA02AA);
        int v1 = ((goz)object1).U(f);
        int v2 = ((goz)object1).V(znx0.b);
        Object object3 = ((goz)object1).k();
        if((v1 | ((goz)object1).V(gged0.size()) | v2) != 0 || object3 == gop.a) {
            object3 = new gpx(new zzg(((dih)object0), znx0), null);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        ibns ibns0 = (ibns)((gui)object3).a();
        int v3 = ((Number)ibns0.a).intValue();
        int v4 = ((Number)ibns0.b).intValue();
        hey hey0 = hfc.e;
        iau iau0 = dll.b(dho.g, hei.k, ((goz)object1), 54);
        int v5 = zzf.a(gol.c(((goz)object1)));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc0 = hew.c(((goz)object1), hey0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object1), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v5))) {
            Integer integer0 = v5;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw2);
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object1), ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(((goz)object1), hfc0, ibtw3);
        dhg dhg0 = dho.g(24.0f);
        hfc hfc1 = dlo.a(dlq.a, hey0, 1.0f);
        iau iau1 = dll.b(dhg0, hei.j, ((goz)object1), 6);
        int v6 = zzf.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc2 = hew.c(((goz)object1), hfc1);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw0);
        guo.b(((goz)object1), gzk1, ibtw1);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v6))) {
            Integer integer1 = v6;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw2);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc2, ibtw3);
        ((goz)object1).M(0x6910DB1F);
        for(int v7 = 0; v7 < v3; ++v7) {
            Object object4 = gged0.get(v7);
            ibuq.e(object4, "get(...)");
            aadq.b(((zhr)object4), hys.a, null, 0L, 24, 24, ((goz)object1), 0x36030, 12);
        }
        ((goz)object1).A();
        ((goz)object1).z();
        ((goz)object1).M(0x81765DDA);
        if(v4 > 0) {
            zzm.b(null, "+" + v4, null, fpu.a(((goz)object1)).G, fpu.a(((goz)object1)).q, ((goz)object1), 0, 5);
        }
        ((goz)object1).A();
        ((goz)object1).z();
        return ibom.a;
    }
}

