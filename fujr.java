import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class fujr implements ibtx {
    final fujt a;

    public fujr(fujt fujt0) {
        this.a = fujt0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$OutlinedCard");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dla.f(hey0, 8.0f, 6.0f, 16.0f, 6.0f);
        fujt fujt0 = this.a;
        iau iau0 = dll.b(dho.a, hei.k, ((goz)object1), 0x30);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        ((goz)object1).M(-2004274070);
        fujo fujo0 = fujt0.b;
        ((goz)object1).M(-2004273089);
        if(fujo0 != null) {
            fujs.b(fujo0, dla.j(hey0, 0.0f, 0.0f, 8.0f, 0.0f, 11), ((goz)object1), 0x30);
        }
        ((goz)object1).A();
        Context context0 = (Context)((goz)object1).h(AndroidCompositionLocals_androidKt.b);
        String s = fujt0.a.a(context0).toString();
        jbn jbn0 = fpu.d(((goz)object1)).m;
        gdh.b(s, null, fpu.a(((goz)object1)).q, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FFFA);
        ((goz)object1).A();
        ((goz)object1).z();
        return ibom.a;
    }
}

