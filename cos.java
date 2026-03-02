final class cos extends cpb {
    @Override  // cpb
    public final gui a(clj clj0, int v, goz goz0, int v1) {
        Object object1;
        float f1;
        float f;
        Object object0;
        goz0.M(2006928772);
        cpa cpa0 = new cpa(this, v);
        int v2 = v1 << 3 & 0x380 | v1 & 14;
        int v3 = v2 & 14 | v2 << 3 & 0x1C00;
        int v4 = v3 & 14 ^ 6;
        cmc cmc0 = cmv.a;
        boolean z = true;
        if(clj0.z()) {
            goz0.M(0x635A29CD);
            goz0.x();
            object0 = clj0.f();
        }
        else {
            goz0.M(0x63564970);
            boolean z1 = v4 > 4 && goz0.X(clj0) || (v3 & 6) == 4;
            object0 = goz0.j();
            if(z1 || object0 == gop.a) {
                hbm hbm0 = hbl.a();
                ibts ibts0 = hbm0 == null ? null : hbm0.i();
                hbm hbm1 = hbl.b(hbm0);
                try {
                    object1 = clj0.f();
                }
                finally {
                    hbl.d(hbm0, hbm1, ibts0);
                }
                goz0.P(object1);
                object0 = object1;
            }
            goz0.x();
        }
        goz0.M(0x98153DDC);
        if(((Boolean)object0).booleanValue()) {
            cpe cpe0 = ((cpn)ibpo.W(this.a)).d;
            ibuq.d(cpe0, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat");
            f = ((Number)((cot)ibpo.W(((cpi)cpe0).b)).b).floatValue();
        }
        else {
            cpe cpe1 = ((cpn)ibpo.R(this.a)).d;
            ibuq.d(cpe1, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat");
            f = ((Number)((cot)ibpo.R(((cpi)cpe1).b)).b).floatValue();
        }
        goz0.x();
        Float float0 = f;
        boolean z2 = v4 > 4 && goz0.X(clj0) || (v3 & 6) == 4;
        Object object2 = goz0.j();
        if(z2 || object2 == gop.a) {
            gpx gpx0 = new gpx(new coq(clj0), null);
            goz0.P(gpx0);
            object2 = gpx0;
        }
        boolean z3 = ((Boolean)((gui)object2).a()).booleanValue();
        goz0.M(0x98153DDC);
        if(z3) {
            cpe cpe2 = ((cpn)ibpo.W(this.a)).d;
            ibuq.d(cpe2, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat");
            f1 = ((Number)((cot)ibpo.W(((cpi)cpe2).b)).b).floatValue();
        }
        else {
            cpe cpe3 = ((cpn)ibpo.R(this.a)).d;
            ibuq.d(cpe3, "null cannot be cast to non-null type androidx.compose.animation.graphics.vector.PropertyValuesHolderFloat");
            f1 = ((Number)((cot)ibpo.R(((cpi)cpe3).b)).b).floatValue();
        }
        goz0.x();
        Float float1 = f1;
        if((v4 <= 4 || !goz0.X(clj0)) && (v3 & 6) != 4) {
            z = false;
        }
        Object object3 = goz0.j();
        if(z || object3 == gop.a) {
            gpx gpx1 = new gpx(new cor(clj0), null);
            goz0.P(gpx1);
            object3 = gpx1;
        }
        gui gui0 = clz.g(clj0, float0, float1, ((cii)cpa0.a(((gui)object3).a(), goz0, Integer.valueOf(0))), cmc0, goz0, v3 & 14 | v3 << 6 & 0x70000);
        goz0.x();
        return gui0;
    }
}

