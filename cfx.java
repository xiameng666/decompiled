import androidx.compose.animation.SharedBoundsNodeElement;

final class cfx extends ibur implements ibtx {
    final cft a;
    final clj b;
    final ibts c;
    final cfz d;
    final ccn e;
    final cga f;
    final cfr g;

    public cfx(cft cft0, clj clj0, ibts ibts0, cfz cfz0, cfr cfr0, cga cga0, ccn ccn0) {
        this.a = cft0;
        this.b = clj0;
        this.c = ibts0;
        this.d = cfz0;
        this.g = cfr0;
        this.f = cga0;
        this.e = ccn0;
        super(3);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ccl ccl0;
        cfj cfj1;
        clj clj1;
        ((Number)object2).intValue();
        ((goz)object1).M(0x921EBE6F);
        cft cft0 = this.a;
        Object object3 = cft0.a;
        ((goz)object1).K(-2056718059, object3);
        Object object4 = ((goz)object1).k();
        cfz cfz0 = this.d;
        Object object5 = gop.a;
        if(object4 == object5) {
            bzk bzk0 = cfz0.f;
            cfj cfj0 = (cfj)bzk0.a(object3);
            if(cfj0 == null) {
                cfj0 = new cfj(object3, cfz0);
                bzk0.k(object3, cfj0);
            }
            object4 = cfj0;
            ((goz)object1).R(object4);
        }
        clj clj0 = this.b;
        ((goz)object1).K(0x856907F9, clj0);
        if(clj0 == null) {
            ((goz)object1).M(0x27BC5709);
            ibvh.h(this.c, 1);
            Boolean boolean2 = (Boolean)this.c.a(ibom.a);
            boolean z1 = boolean2.booleanValue();
            Object object8 = ((goz)object1).k();
            if(object8 == object5) {
                if(!((cfj)object4).e.isEmpty()) {
                    z1 = !z1;
                }
                object8 = new cjh(Boolean.valueOf(z1));
                ((goz)object1).R(object8);
            }
            ((cjh)object8).d(boolean2);
            clj1 = clz.c(((cjh)object8), null, ((goz)object1), 0, 2);
        }
        else {
            ((goz)object1).M(666402505);
            ibts ibts0 = this.c;
            boolean z = ((goz)object1).X(clj0);
            Object object6 = ((goz)object1).k();
            if(z || object6 == object5) {
                object6 = clj0.f();
                ((goz)object1).R(object6);
            }
            if(clj0.z()) {
                object6 = clj0.f();
            }
            ((goz)object1).M(0x472F5E73);
            Boolean boolean0 = (Boolean)ibts0.a(object6);
            ((goz)object1).A();
            Object object7 = clj0.g();
            ((goz)object1).M(0x472F5E73);
            Boolean boolean1 = (Boolean)ibts0.a(object7);
            ((goz)object1).A();
            clj1 = clz.b(clj0, boolean0, boolean1, ((String)object3), ((goz)object1), 0);
        }
        ((goz)object1).A();
        ((goz)object1).K(0x856A0005, Boolean.valueOf(cfz0.d()));
        clb clb0 = clz.h(clj1, cmv.i, ((goz)object1), 0);
        ((goz)object1).y();
        boolean z2 = ((goz)object1).X(clj1);
        ccn ccn0 = this.e;
        Object object9 = ((goz)object1).k();
        if(z2 || object9 == object5) {
            object9 = new ccl(cfz0, clj1, clb0, ccn0);
            ((goz)object1).R(object9);
        }
        if(!ibuq.m(((ccl)object9).a(), clb0)) {
            ((ccl)object9).b.b(clb0);
            ((ccl)object9).e(null);
            ((ccl)object9).d = ccm.a;
        }
        ((ccl)object9).c.b(ccn0);
        ((goz)object1).y();
        cfr cfr0 = this.g;
        cga cga0 = this.f;
        Object object10 = ((goz)object1).k();
        if(object10 == object5) {
            cfj1 = (cfj)object4;
            ccl0 = (ccl)object9;
            cfk cfk0 = new cfk(cfj1, ccl0, cfr0, cga0, cft0);
            ((goz)object1).R(cfk0);
            object10 = cfk0;
        }
        else {
            cfj1 = (cfj)object4;
            ccl0 = (ccl)object9;
        }
        cft0.c.b(((cfk)object10));
        ((cfk)object10).b.b(cfj1);
        Boolean boolean3 = Boolean.valueOf(true);
        ((cfk)object10).e.b(boolean3);
        ((cfk)object10).c.b(ccl0);
        ((cfk)object10).d.b(cfr0);
        ((cfk)object10).f.b(cga0);
        ((cfk)object10).j.h(0.0f);
        ((cfk)object10).a.b(boolean3);
        ((cfk)object10).g.b(cft0);
        ((goz)object1).y();
        Object object11 = ((hfc)object0).a(new SharedBoundsNodeElement(((cfk)object10)));
        ((goz)object1).A();
        return object11;
    }
}

