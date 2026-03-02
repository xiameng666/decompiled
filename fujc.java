import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class fujc implements ibtw {
    final fuic a;
    final float b;
    final dih c;

    public fujc(dih dih0, fuic fuic0, float f) {
        this.c = dih0;
        this.a = fuic0;
        this.b = f;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        goz goz0;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        float f = fujj.j(this.c, 12.0f, ((goz)object0));
        float f1 = fujj.j(this.c, 24.0f, ((goz)object0));
        hfc hfc0 = dla.e(hfc.e, f1, f);
        dhg dhg0 = dho.g(fujj.j(this.c, 4.0f, ((goz)object0)));
        fuic fuic0 = this.a;
        float f2 = this.b;
        iau iau0 = dii.a(dhg0, hei.m, ((goz)object0), 0);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        ((goz)object0).M(0x720D85A0);
        ((goz)object0).A();
        fryv fryv0 = fuic0.a;
        ((goz)object0).M(0x720DB85D);
        if(fryv0 == null) {
            goz0 = (goz)object0;
        }
        else {
            jbn jbn0 = fpu.d(((goz)object0)).h;
            Context context0 = (Context)((goz)object0).h(AndroidCompositionLocals_androidKt.b);
            long v2 = fuic0.b.a(context0);
            goz0 = (goz)object0;
            ftzd.b(fryv0, null, v2, 0L, 0, false, 2, 0, null, null, jbn0, jlq.e(22), 76.0f, f2, goz0, 0, 0xD80030, 0x77FA);
        }
        goz0.A();
        goz0.z();
        return ibom.a;
    }
}

