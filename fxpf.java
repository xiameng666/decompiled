import java.util.concurrent.atomic.AtomicInteger;

public final class fxpf implements Runnable {
    public final fxpk a;
    public final boolean b;
    public final int c;
    public final fxnv d;

    public fxpf(fxpk fxpk0, boolean z, int v, fxnv fxnv0) {
        this.a = fxpk0;
        this.b = z;
        this.c = v;
        this.d = fxnv0;
    }

    @Override
    public final void run() {
        fxpk fxpk0 = this.a;
        int v = this.c;
        if(this.b) {
            synchronized(fxpk0.c) {
                ((AtomicInteger)fxpk0.c.get(Integer.valueOf(v))).set(0);
            }
        }
        fxpk0.c(new fxpj(v, this.d));
    }
}

