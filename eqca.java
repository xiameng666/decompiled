import android.os.Bundle;

public final class eqca implements Runnable {
    public final eqck a;
    public final int b;
    public final eqoc c;
    public final String d;

    public eqca(eqck eqck0, int v, eqoc eqoc0, String s) {
        this.a = eqck0;
        this.b = v;
        this.c = eqoc0;
        this.d = s;
    }

    @Override
    public final void run() {
        int v = this.b;
        eqck eqck0 = this.a;
        if(eqck0.v) {
            Object[] arr_object = {epzh.a(v)};
            eqck.h.d("Transfer canceled; dropping error %s", arr_object);
            return;
        }
        eqck0.l.o(v, this.c);
        eqck0.p.c(0x3F5, Bundle.EMPTY);
        eqck0.n.b(v, this.d);
        eqck0.b();
    }
}

