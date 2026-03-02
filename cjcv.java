import j..util.Objects;

public final class cjcv implements AutoCloseable {
    final cjcw a;
    private int b;
    private boolean c;

    public cjcv(cjcw cjcw0) {
        Objects.requireNonNull(cjcw0);
        this.a = cjcw0;
        super();
        this.b = 0;
        this.c = false;
    }

    final void a() {
        synchronized(this) {
            gftb.q(this.b());
            this.c = true;
        }
    }

    final boolean b() {
        synchronized(this) {
        }
        return this.b != 0;
    }

    final void c() {
        synchronized(this) {
            ++this.b;
        }
    }

    @Override
    public final void close() {
        boolean z = false;
        synchronized(this) {
            gftb.q(this.b > 0);
            int v1 = this.b - 1;
            this.b = v1;
            if(v1 == 0) {
                boolean z1 = this.c;
                this.c = false;
                z = z1;
            }
        }
        if(z) {
            this.a.B();
        }
    }
}

