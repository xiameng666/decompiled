import android.content.Context;

final class ftxb implements ibtw {
    final ftxi a;
    final Context b;
    final gra c;

    public ftxb(ftxi ftxi0, Context context0, gra gra0) {
        this.a = ftxi0;
        this.b = context0;
        this.c = gra0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        String s = this.a.d.a(this.b).toString();
        hfc hfc0 = dla.i(hfc.e, 4.0f, 0.0f, 2);
        long v = fpu.a(((goz)object0)).d;
        jbn jbn0 = fpu.d(((goz)object0)).C;
        ((goz)object0).M(5004770);
        gra gra0 = this.c;
        Object object2 = ((goz)object0).k();
        if(object2 == gop.a) {
            object2 = new ftxa(gra0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        gdh.b(s, hfc0, v, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((ibts)object2), jbn0, ((goz)object0), 0x30, 0x180000, 0xFFF8);
        return ibom.a;
    }
}

