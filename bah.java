import java.util.concurrent.Executor;

public final class bah implements Runnable {
    public final bam a;
    public final jqt b;

    public bah(bam bam0, jqt jqt0) {
        this.a = bam0;
        this.b = jqt0;
    }

    @Override
    public final void run() {
        bam bam0 = this.a;
        aox aox0 = bam0.p;
        synchronized(aox0.c.a) {
            aox0.c.b.clear();
            aox0.c.c.clear();
            aox0.c.e.clear();
            aox0.c.d.clear();
            aox0.c.f = 0;
        }
        aox0.b.c();
        if(bam0.h != null) {
            Executor executor0 = bam0.f;
            if((executor0 instanceof azv)) {
                synchronized(((azv)executor0).a) {
                    if(!((azv)executor0).b.isShutdown()) {
                        ((azv)executor0).b.shutdown();
                    }
                }
            }
            bam0.h.quit();
        }
        this.b.b(null);
    }
}

