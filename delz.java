import android.graphics.DashPathEffect;

final class delz implements ibtx {
    final ibth a;
    final dema b;
    final gui c;

    public delz(ibth ibth0, dema dema0, gui gui0) {
        this.a = ibth0;
        this.b = dema0;
        this.c = gui0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        jks jks0 = (jks)((goz)object1).h(ipa.d);
        ((goz)object1).M(5004770);
        boolean z = ((goz)object1).X(jks0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            hph hph0 = new hph(jks0.eg(2.0f), 0.0f, 0, 0, new hkt(new DashPathEffect(new float[]{jks0.eg(4.0f), jks0.eg(4.0f)}, 0.0f)), 14);
            ((goz)object1).R(hph0);
            object3 = hph0;
        }
        ((goz)object1).A();
        ibth ibth0 = cmig.a(((cmhw)object0), this.a);
        long v = ((hll)this.c.a()).j;
        eaa eaa0 = fpu.c(((goz)object1)).d;
        dele dele0 = new dele(fpu.a(((goz)object1)).c, ((hph)object3));
        hfc hfc0 = hhm.a(hfc.e, dele0);
        ((goz)object1).M(0x6E3C21FE);
        Object object4 = ((goz)object1).k();
        if(object4 == gop.a) {
            object4 = new dely();
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        gaq.e(ibth0, cwp.a(hfc0, ((ibts)object4), this.b), false, eaa0, v, 0L, 0.0f, 0.0f, null, null, defg.e, ((goz)object1), 996);
        return ibom.a;
    }
}

