import java.util.Set;

final class ctkl implements ibtx {
    final Set a;
    final gra b;
    final ctho c;
    final ibts d;

    public ctkl(Set set0, gra gra0, ctho ctho0, ibts ibts0) {
        this.a = set0;
        this.b = gra0;
        this.c = ctho0;
        this.d = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        gra gra1;
        int v = ((Number)object2).intValue();
        ibuq.f(((fll)object0), "$this$ExposedDropdownMenuBox");
        if((v & 6) == 0) {
            v |= (((v & 8) == 0 ? ((goz)object1).X(((fll)object0)) : ((goz)object1).Z(((fll)object0))) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dls.w(hey0);
        Set set0 = this.a;
        int v1 = 1 ^ set0.isEmpty();
        ((goz)object1).M(5004770);
        gra gra0 = this.b;
        Object object3 = ((goz)object1).k();
        Object object4 = gop.a;
        if(object3 == object4) {
            object3 = new ctke(gra0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fcm.a(((ibth)object3), hfc0, ((boolean)v1), null, null, null, null, null, gzf.e(0x5FFDBF50, new ctkg(this.c), ((goz)object1)), ((goz)object1), 0x30000036, 504);
        boolean z = ctkm.b(gra0);
        eag eag0 = eah.b(24.0f);
        hfc hfc1 = dla.j(hzt.a(hey0, new flr(((fll)object0).a, ((fll)object0).b)), 0.0f, 0.0f, 0.0f, 16.0f, 7);
        ((goz)object1).M(5004770);
        Object object5 = ((goz)object1).k();
        if(object5 == object4) {
            gra1 = gra0;
            object5 = new ctkf(gra1);
            ((goz)object1).R(object5);
        }
        else {
            gra1 = gra0;
        }
        ((goz)object1).A();
        ezn.a(z, ((ibth)object5), hfc1, 0L, null, null, eag0, 0L, 0.0f, 0.0f, null, gzf.e(0xB0C5A4FB, new ctkk(set0, this.d, gra1), ((goz)object1)), ((goz)object1), 0x30, 0x30, 0x7B8);
        return ibom.a;
    }
}

