import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class dnmg implements ibtx {
    final fryv a;
    final fryv b;

    public dnmg(fryv fryv0, fryv fryv1) {
        this.a = fryv0;
        this.b = fryv1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Card");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        fryv fryv0 = this.a;
        fryv fryv1 = this.b;
        dhg dhg0 = dho.g(16.0f);
        hey hey0 = hfc.e;
        iau iau0 = dll.b(dhg0, hei.j, ((goz)object1), 6);
        int v1 = dnme.a(gol.c(((goz)object1)));
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
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw2);
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object1), ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(((goz)object1), hfc0, ibtw3);
        hfc hfc1 = dls.u(dla.f(hey0, 24.0f, 20.0f, 24.0f, 20.0f));
        hfc hfc2 = dlo.a(dlq.a, hfc1, 1.0f);
        iau iau1 = dii.a(dho.e, hei.m, ((goz)object1), 6);
        int v2 = dnme.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc3 = hew.c(((goz)object1), hfc2);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw0);
        guo.b(((goz)object1), gzk1, ibtw1);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer1 = v2;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw2);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc3, ibtw3);
        jbn jbn0 = fsbt.a(fpu.d(((goz)object1)));
        ftzd.a(fryv0, null, fpu.a(((goz)object1)).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, ((goz)object1), 0, 0, 0x1FFFA);
        ((goz)object1).M(-309472441);
        ((goz)object1).M(-309472720);
        boolean z = fryv1 != null && fryv1.a(((Context)((goz)object1).h(AndroidCompositionLocals_androidKt.b))).length() > 0;
        ((goz)object1).A();
        if(z) {
            hfc hfc4 = dla.j(hey0, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            ((goz)object1).M(0x6E3C21FE);
            Object object3 = ((goz)object1).k();
            if(object3 == gop.a) {
                object3 = new dnmf();
                ((goz)object1).R(object3);
            }
            ((goz)object1).A();
            hfc hfc5 = iqn.a(iuc.d(hfc4, ((ibts)object3)), "CardRewardsPreviewActionText");
            jbn jbn1 = fpu.d(((goz)object1)).B;
            long v3 = fpu.a(((goz)object1)).a;
            goz0 = (goz)object1;
            ftzd.a(fryv1, hfc5, v3, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz0, 0, 0, 0x1FFF8);
        }
        else {
            goz0 = (goz)object1;
        }
        goz0.A();
        goz0.z();
        goz0.z();
        return ibom.a;
    }
}

