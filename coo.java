final class coo extends cpb {
    @Override  // cpb
    public final gui a(clj clj0, int v, goz goz0, int v1) {
        Object object2;
        long v8;
        long v7;
        Object object1;
        long v2;
        goz0.M(0x80D1CA4B);
        cpa cpa0 = new cpa(this, v);
        boolean z = ((Boolean)clj0.g()).booleanValue();
        goz0.M(1880460593);
        if(z) {
            cpe cpe0 = ((cpn)ibpo.W(this.a)).d;
            ibuq.d(cpe0, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            v2 = ((hll)((cot)ibpo.W(((cpg)cpe0).b)).b).j;
        }
        else {
            cpe cpe1 = ((cpn)ibpo.R(this.a)).d;
            ibuq.d(cpe1, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            v2 = ((hll)((cot)ibpo.R(((cpg)cpe1).b)).b).j;
        }
        goz0.x();
        hnl hnl0 = hll.f(v2);
        boolean z1 = goz0.X(hnl0);
        Object object0 = goz0.j();
        if(z1 || object0 == gop.a) {
            object0 = ccs.a.a(hnl0);
            goz0.P(object0);
        }
        int v3 = v1 << 3 & 0x380 | v1 & 14;
        int v4 = v3 & 14 | v3 << 3 & 0x1C00;
        int v5 = v4 & 14 ^ 6;
        if(clj0.z()) {
            goz0.M(0x635A29CD);
            goz0.x();
            object1 = clj0.f();
        }
        else {
            goz0.M(0x63564970);
            boolean z2 = v5 > 4 && goz0.X(clj0) || (v4 & 6) == 4;
            object1 = goz0.j();
            if(z2 || object1 == gop.a) {
                hbm hbm0 = hbl.a();
                ibts ibts0 = hbm0 == null ? null : hbm0.i();
                hbm hbm1 = hbl.b(hbm0);
                try {
                    object2 = clj0.f();
                }
                finally {
                    hbl.d(hbm0, hbm1, ibts0);
                }
                goz0.P(object2);
                object1 = object2;
            }
            goz0.x();
        }
        goz0.M(1880460593);
        if(((Boolean)object1).booleanValue()) {
            cpe cpe2 = ((cpn)ibpo.W(this.a)).d;
            ibuq.d(cpe2, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            v7 = ((hll)((cot)ibpo.W(((cpg)cpe2).b)).b).j;
        }
        else {
            cpe cpe3 = ((cpn)ibpo.R(this.a)).d;
            ibuq.d(cpe3, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            v7 = ((hll)((cot)ibpo.R(((cpg)cpe3).b)).b).j;
        }
        goz0.x();
        hll hll0 = new hll(v7);
        boolean z3 = v5 > 4 && goz0.X(clj0) || (v4 & 6) == 4;
        Object object3 = goz0.j();
        if(z3 || object3 == gop.a) {
            object3 = new gpx(new com(clj0), null);
            goz0.P(object3);
        }
        boolean z4 = ((Boolean)((gui)object3).a()).booleanValue();
        goz0.M(1880460593);
        if(z4) {
            cpe cpe4 = ((cpn)ibpo.W(this.a)).d;
            ibuq.d(cpe4, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            v8 = ((hll)((cot)ibpo.W(((cpg)cpe4).b)).b).j;
        }
        else {
            cpe cpe5 = ((cpn)ibpo.R(this.a)).d;
            ibuq.d(cpe5, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderColor");
            v8 = ((hll)((cot)ibpo.R(((cpg)cpe5).b)).b).j;
        }
        goz0.x();
        hll hll1 = new hll(v8);
        boolean z5 = v5 > 4 && goz0.X(clj0) || (v4 & 6) == 4;
        Object object4 = goz0.j();
        if(z5 || object4 == gop.a) {
            gpx gpx0 = new gpx(new con(clj0), null);
            goz0.P(gpx0);
            object4 = gpx0;
        }
        gui gui0 = clz.g(clj0, hll0, hll1, ((cii)cpa0.a(((gui)object4).a(), goz0, Integer.valueOf(0))), ((cmc)object0), goz0, v4 & 14 | v4 << 6 & 0x70000);
        goz0.x();
        return gui0;
    }
}

