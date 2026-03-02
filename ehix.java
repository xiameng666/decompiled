import jeb.synthetic.FIN;

public final class ehix implements AutoCloseable {
    private long a;
    private int b;

    public ehix() {
        this.b = 1;
        this.a = 0L;
    }

    public final boolean a() {
        long v2;
        long v1;
        synchronized(this) {
            v1 = System.currentTimeMillis() - this.a;
            v2 = hxdo.a.b().b();
        }
        return Long.compare(v1, v2) >= 0;
    }

    public final boolean b() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        int v1 = this.b;
        if(v1 != 0) {
            FIN.finallyCodeBegin$NT(v);
            return v1 == 2;
        }
        throw null;
    }

    public final boolean c() {
        synchronized(this) {
            if(!this.b()) {
                this.b = 2;
                this.a = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void close() {
        synchronized(this) {
            this.b = 1;
            this.a = 0L;
        }
    }
}

