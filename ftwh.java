import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class ftwh implements ibtx {
    final fryv a;
    final ibth b;
    final boolean c;
    final fryk d;
    final long e;
    final long f;
    final fryv g;
    final long h;
    final fryk i;
    final long j;

    public ftwh(fryv fryv0, ibth ibth0, boolean z, fryk fryk0, long v, long v1, fryv fryv1, long v2, fryk fryk1, long v3) {
        this.a = fryv0;
        this.b = ibth0;
        this.c = z;
        this.d = fryk0;
        this.e = v;
        this.f = v1;
        this.g = fryv1;
        this.h = v2;
        this.i = fryk1;
        this.j = v3;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        long v15;
        hey hey3;
        ibtw ibtw7;
        ibth ibth3;
        hfc hfc10;
        hfc hfc9;
        boolean z3;
        Boolean boolean2;
        hey hey2;
        hek hek1;
        hey hey1;
        fryv fryv2;
        dlq dlq1;
        ibtw ibtw6;
        long v12;
        ibts ibts1;
        long v11;
        ibtw ibtw5;
        dim dim1;
        hfc hfc8;
        long v10;
        fryk fryk2;
        ibtw ibtw4;
        dhf dhf1;
        ibth ibth2;
        int v7;
        goz goz0 = (goz)object1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        Boolean boolean0 = Boolean.valueOf(true);
        if((v & 6) == 0) {
            v |= (goz0.X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && goz0.ac()) {
            goz0.G();
            return ibom.a;
        }
        int v1 = jkv.a(((dih)object0).d(), 840.0f) <= 0 ? 0 : 1;
        fryv fryv0 = this.a;
        hek hek0 = hei.k;
        hey hey0 = hfc.e;
        grx grx0 = AndroidCompositionLocals_androidKt.b;
        float f = !fryw.c(fryv0, ((Context)goz0.h(grx0))) || v1 != 0 ? 20.0f : 12.0f;
        hfc hfc0 = dla.f(hey0, 20.0f, 20.0f, (fryw.c(fryv0, ((Context)goz0.h(grx0))) ? 12.0f : 20.0f), f);
        ibth ibth0 = this.b;
        boolean z = this.c;
        fryk fryk0 = this.d;
        long v2 = this.e;
        long v3 = this.f;
        fryv fryv1 = this.g;
        long v4 = this.h;
        dhf dhf0 = dho.a;
        fryk fryk1 = this.i;
        iau iau0 = dll.b(dhf0, hek0, goz0, 0x30);
        int v5 = ftwe.a(gol.c(goz0));
        gzk gzk0 = goz0.ap();
        hfc hfc1 = hew.c(goz0, hfc0);
        long v6 = this.j;
        ibth ibth1 = iej.a;
        goz0.O();
        if(goz0.ab()) {
            goz0.t(ibth1);
        }
        else {
            goz0.T();
        }
        ibtw ibtw0 = iej.e;
        guo.b(goz0, iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(goz0, gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(goz0.ab()) {
            v7 = v1;
        label_46:
            Integer integer0 = v5;
            goz0.R(integer0);
            goz0.p(integer0, ibtw2);
        }
        else {
            v7 = v1;
            if(!ibuq.m(goz0.k(), Integer.valueOf(v5))) {
                goto label_46;
            }
        }
        ibts ibts0 = iej.g;
        guo.a(goz0, ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(goz0, hfc1, ibtw3);
        dlq dlq0 = dlq.a;
        hfc hfc2 = iqn.a(hey0, "ActionContainer").a(hhi.a(hey0, fpu.c(goz0).h));
        goz0.M(5004770);
        boolean z1 = goz0.X(ibth0);
        Object object3 = goz0.k();
        if(z1 || object3 == gop.a) {
            object3 = new ftwf(ibth0);
            goz0.R(object3);
        }
        goz0.A();
        hfc hfc3 = cru.d(hfc2, false, null, null, null, ((ibth)object3), 15);
        goz0.M(0x6E3C21FE);
        Object object4 = goz0.k();
        if(object4 == gop.a) {
            object4 = new ftwg();
            goz0.R(object4);
        }
        goz0.A();
        hfc hfc4 = iuc.d(hfc3, ((ibts)object4));
        hfc hfc5 = dlo.a(dlq0, hey0, 1.0f);
        iau iau1 = dii.a(dho.c, hei.m, goz0, 0);
        int v8 = ftwe.a(gol.c(goz0));
        gzk gzk1 = goz0.ap();
        hfc hfc6 = hew.c(goz0, hfc5);
        goz0.O();
        if(goz0.ab()) {
            goz0.t(ibth1);
        }
        else {
            goz0.T();
        }
        guo.b(goz0, iau1, ibtw0);
        guo.b(goz0, gzk1, ibtw1);
        if(goz0.ab() || !ibuq.m(goz0.k(), Integer.valueOf(v8))) {
            Integer integer1 = v8;
            goz0.R(integer1);
            goz0.p(integer1, ibtw2);
        }
        guo.a(goz0, ibts0);
        guo.b(goz0, hfc6, ibtw3);
        iau iau2 = dll.b(dhf0, hei.j, goz0, 0x30);
        int v9 = ftwe.a(gol.c(goz0));
        gzk gzk2 = goz0.ap();
        dim dim0 = dim.a;
        hfc hfc7 = hew.c(goz0, hey0);
        goz0.O();
        if(goz0.ab()) {
            goz0.t(ibth1);
        }
        else {
            goz0.T();
        }
        guo.b(goz0, iau2, ibtw0);
        guo.b(goz0, gzk2, ibtw1);
        if(goz0.ab() || !ibuq.m(goz0.k(), Integer.valueOf(v9))) {
            Integer integer2 = v9;
            goz0.R(integer2);
            goz0.p(integer2, ibtw2);
        }
        guo.a(goz0, ibts0);
        guo.b(goz0, hfc7, ibtw3);
        if(z) {
            goz0.M(0x1801E512);
            ibth2 = ibth1;
            dhf1 = dhf0;
            ibtw4 = ibtw2;
            fryk2 = fryk1;
            v10 = v6;
            hfc8 = hfc4;
            dim1 = dim0;
            ibtw5 = ibtw1;
            v11 = v4;
            ibts1 = ibts0;
            v12 = v3;
            ibtw6 = ibtw3;
            dlq1 = dlq0;
            fwy.g(iqn.a(dls.k(hey0, 24.0f), "Spinner"), fpu.a(goz0).i, 2.0f, 0L, 0, 0.0f, goz0, 390, 56);
            goz0 = goz0;
            goz0.A();
            fryv2 = fryv0;
            ibtw0 = ibtw0;
            hey1 = hey0;
            hek1 = hek0;
        }
        else {
            dhf1 = dhf0;
            hey1 = hey0;
            ibtw4 = ibtw2;
            ibtw5 = ibtw1;
            ibth2 = ibth1;
            fryk2 = fryk1;
            v10 = v6;
            hek1 = hek0;
            hfc8 = hfc4;
            dim1 = dim0;
            fryv2 = fryv0;
            ibts1 = ibts0;
            v12 = v3;
            v11 = v4;
            ibtw6 = ibtw3;
            dlq1 = dlq0;
            goz0.M(403040614);
            ftyy.c(fryk0, dls.k(iqn.a(hey1, "Icon"), 24.0f), null, new hll(v2), goz0, 0x1B0, 0);
            goz0.A();
        }
        jbn jbn0 = fpu.d(goz0).i;
        long v13 = feq.a(fpu.a(goz0), v12);
        boolean z2 = false;
        ftzd.a(fryv1, iqn.a(dla.j(dlq1.a(hey1, hek1), 12.0f, 0.0f, 0.0f, 0.0f, 14), "Message"), v13, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz0, 0, 0, 0x1FFF8);
        goz0.M(2091232130);
        if(fryw.c(fryv2, ((Context)goz0.h(grx0)))) {
            hey2 = hey1;
            dlv.a(dls.o(hey2, 12.0f), goz0);
        }
        else {
            hey2 = hey1;
        }
        goz0.A();
        goz0.z();
        goz0.M(0x81EFF20B);
        Boolean boolean1 = null;
        if(v7 == 0) {
            boolean2 = boolean0;
            z3 = ibuq.m((fryv2 == null ? null : Boolean.valueOf(fryw.b(fryv2, ((Context)goz0.h(grx0))))), boolean2);
        }
        else {
            boolean2 = boolean0;
            z3 = false;
        }
        goz0.A();
        if(z3) {
            hfc9 = hfc8;
            hfc10 = dla.d(dim1.a(hfc9, hei.o), 8.0f);
        }
        else {
            hfc9 = hfc8;
            hfc10 = dls.k(hfc9, 0.0f);
        }
        iau iau3 = dll.b(dhf1, hek1, goz0, 0x30);
        int v14 = ftwe.a(gol.c(goz0));
        gzk gzk3 = goz0.ap();
        hfc hfc11 = hew.c(goz0, hfc10);
        goz0.O();
        if(goz0.ab()) {
            ibth3 = ibth2;
            goz0.t(ibth3);
        }
        else {
            ibth3 = ibth2;
            goz0.T();
        }
        guo.b(goz0, iau3, ibtw0);
        guo.b(goz0, gzk3, ibtw5);
        if(!goz0.ab() && ibuq.m(goz0.k(), Integer.valueOf(v14))) {
            ibtw7 = ibtw4;
        }
        else {
            Integer integer3 = v14;
            goz0.R(integer3);
            ibtw7 = ibtw4;
            goz0.p(integer3, ibtw7);
        }
        guo.a(goz0, ibts1);
        guo.b(goz0, hfc11, ibtw6);
        fryv fryv3 = fryv2 == null ? new fryu("") : fryv2;
        ftzd.a(fryv3, iqn.a(hey2, "ActionText"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn.y(fpu.d(goz0).m, v11, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 0, null, 0xFFFFFE), goz0, 0x30, 0, 0x1FFFC);
        goz0.M(0x2C46AB44);
        if(fryl.c(fryk2)) {
            hey3 = hey2;
            v15 = v10;
            ftyy.c(fryk2, iqn.a(dls.k(dla.j(hey2, 8.0f, 0.0f, 4.0f, 0.0f, 10), 18.0f), "ActionIcon"), null, new hll(v15), goz0, 0x1B0, 0);
        }
        else {
            v15 = v10;
            hey3 = hey2;
        }
        goz0.A();
        goz0.z();
        goz0.z();
        goz0.M(0xC84DD994);
        if(v7 != 0) {
            if(fryv2 != null) {
                boolean1 = Boolean.valueOf(fryw.b(fryv2, ((Context)goz0.h(grx0))));
            }
            if(ibuq.m(boolean1, boolean2)) {
                z2 = true;
            }
        }
        goz0.A();
        dlv.a(dls.o(hey3, (z2 ? 24.0f : 0.0f)), goz0);
        hfc hfc12 = z2 ? dla.d(hfc9, 8.0f) : dls.k(hfc9, 0.0f);
        iau iau4 = dll.b(dhf1, hek1, goz0, 0x30);
        int v16 = ftwe.a(gol.c(goz0));
        gzk gzk4 = goz0.ap();
        hfc hfc13 = hew.c(goz0, hfc12);
        goz0.O();
        if(goz0.ab()) {
            goz0.t(ibth3);
        }
        else {
            goz0.T();
        }
        guo.b(goz0, iau4, ibtw0);
        guo.b(goz0, gzk4, ibtw5);
        if(goz0.ab() || !ibuq.m(goz0.k(), Integer.valueOf(v16))) {
            Integer integer4 = v16;
            goz0.R(integer4);
            goz0.p(integer4, ibtw7);
        }
        guo.a(goz0, ibts1);
        guo.b(goz0, hfc13, ibtw6);
        fryv fryv4 = fryv2 == null ? new fryu("") : fryv2;
        ftzd.a(fryv4, iqn.a(hey3, "ActionText"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn.y(fpu.d(goz0).m, v11, 0L, null, null, null, 0L, null, 0, 0L, null, null, 0, 0, null, 0xFFFFFE), goz0, 0x30, 0, 0x1FFFC);
        goz0.M(0x22720F87);
        if(fryl.c(fryk2)) {
            ftyy.c(fryk2, iqn.a(dls.k(dla.j(hey3, 8.0f, 0.0f, 4.0f, 0.0f, 10), 18.0f), "ActionIcon"), null, new hll(v15), goz0, 0x1B0, 0);
        }
        goz0.A();
        goz0.z();
        goz0.z();
        return ibom.a;
    }
}

