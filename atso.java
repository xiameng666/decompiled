import java.util.List;

public final class atso implements Runnable {
    public final atss a;
    public final int b;

    public atso(atss atss0, int v) {
        this.a = atss0;
        this.b = v;
    }

    @Override
    public final void run() {
        atss atss0 = this.a;
        int v = this.b;
        if(v == 0) {
            atss0.a.u = 3;
            atss0.a.c = true;
            atss0.a.d = true;
            List list0 = atss0.a.t;
            synchronized(list0) {
                for(Object object0: list0) {
                    ((atrl)object0).a();
                }
            }
            return;
        }
        atss0.a.u = 1;
        List list1 = atss0.a.t;
        synchronized(list1) {
            for(Object object1: list1) {
                ((atrl)object1).b(v);
            }
        }
        atss0.a.g();
    }
}

