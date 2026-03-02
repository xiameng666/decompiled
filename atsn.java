import java.util.List;

public final class atsn implements Runnable {
    public final atss a;

    public atsn(atss atss0) {
        this.a = atss0;
    }

    @Override
    public final void run() {
        atss atss0 = this.a;
        atss0.a.m = -1;
        atss0.a.n = -1;
        atss0.a.i = null;
        atss0.a.j = null;
        atss0.a.k = 0.0;
        atss0.a.l = false;
        atss0.a.o = null;
        atss0.a.u = 1;
        List list0 = atss0.a.t;
        synchronized(list0) {
            for(Object object0: list0) {
                ((atrl)object0).d();
            }
        }
        atss0.a.g();
        atss0.a.n(atss0.a.b);
    }
}

