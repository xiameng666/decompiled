final class fvqb {
    private final long a;
    private final fwyd b;
    private long c;

    protected fvqb(fwyd fwyd0, long v) {
        this.c = -1L;
        this.b = fwyd0;
        this.a = v;
    }

    protected final void a() {
        this.c = -1L;
    }

    protected final void b(long v) {
        if((v & this.a) != 0L) {
            this.c = this.b.b();
        }
    }

    protected final boolean c() {
        return this.c != -1L && this.b.b() - this.c < 10000L;
    }
}

