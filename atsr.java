import java.util.List;

public final class atsr implements Runnable {
    public final atss a;

    public atsr(atss atss0) {
        this.a = atss0;
    }

    @Override
    public final void run() {
        this.a.a.u = 4;
        List list0 = this.a.a.t;
        synchronized(list0) {
            for(Object object0: list0) {
                ((atrl)object0).c();
            }
        }
    }
}

