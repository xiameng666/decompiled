import android.content.Context;

final class ddbd implements ibtw {
    final float a;
    final boolean b;
    final Context c;

    public ddbd(float f, boolean z, Context context0) {
        this.a = f;
        this.b = z;
        this.c = context0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(0x6E3C21FE);
        Context context0 = this.c;
        Object object2 = ((goz)object0).k();
        if(object2 == gop.a) {
            object2 = djbm.d(context0);
            ((goz)object0).R(object2);
        }
        int v = ((Number)object2).intValue();
        ((goz)object0).A();
        ddbf.b(v, ddhw.a(((goz)object0)).g, ddhw.a(((goz)object0)).f, this.a, this.b, ((goz)object0), 6, 0);
        return ibom.a;
    }
}

