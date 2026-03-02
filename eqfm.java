import android.os.Bundle;
import j..util.Objects;

final class eqfm implements Runnable {
    final int a;
    final eqoc b;
    final String c;
    final eqfo d;

    public eqfm(eqfo eqfo0, int v, eqoc eqoc0, String s) {
        this.a = v;
        this.b = eqoc0;
        this.c = s;
        Objects.requireNonNull(eqfo0);
        this.d = eqfo0;
        super();
    }

    @Override
    public final void run() {
        eqfo eqfo0 = this.d;
        if(eqfo0.p) {
            Object[] arr_object = {epzh.a(this.a)};
            eqfo.h.d("Dropping error %s", arr_object);
            return;
        }
        eqfo0.k.o(this.a, this.b);
        eqfo0.n.c(0x803, Bundle.EMPTY);
        eqfo0.l.b(this.a, this.c);
        eqfo0.b();
    }
}

