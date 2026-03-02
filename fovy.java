import java.util.concurrent.TimeUnit;

public final class fovy implements Runnable {
    public final fowd a;

    public fovy(fowd fowd0) {
        this.a = fowd0;
    }

    @Override
    public final void run() {
        fowd fowd0 = this.a;
        if(((Boolean)fowd0.h.get()).booleanValue()) {
            fooe fooe0 = fowd0.j;
            for(Object object0: fooe0.c) {
                glzd.g(((foom)object0).a(), new fooc(fooe0), fooe0.a);
            }
        }
        foor foor0 = fowd0.k;
        if(!((Boolean)foor0.c.get()).booleanValue()) {
            return;
        }
        double f = (double)(((long)(((Long)foor0.d.get()))));
        double f1 = foor0.b.nextDouble() * ((double)(((long)(((Long)foor0.e.get())))));
        fooq fooq0 = new fooq(foor0);
        long v = (long)(((Long)foor0.e.get()));
        foor0.a.b(fooq0, Math.round(f + f1), v, TimeUnit.MILLISECONDS);
    }
}

