import android.content.Context;

final class buox implements ibtw {
    final ibth a;
    final Context b;
    final tyb c;
    final gui d;

    public buox(ibth ibth0, Context context0, tyb tyb0, gui gui0) {
        this.a = ibth0;
        this.b = context0;
        this.c = tyb0;
        this.d = gui0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gze gze0 = gzf.e(0x15E13750, new buot(this.a), ((goz)object0));
        gze gze1 = gzf.e(0xB0FC879, new buow(this.b, this.c, this.d), ((goz)object0));
        fiqk.a(bunm.a, null, gze0, gze1, 0.0f, null, null, null, ((goz)object0), 0xD86, 0xF2);
        return ibom.a;
    }
}

