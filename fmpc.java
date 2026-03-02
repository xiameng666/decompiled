import j..util.Objects;

final class fmpc {
    public final fmpa a;
    public boolean b;
    final fmpe c;
    private final fmoz d;

    public fmpc(fmpe fmpe0, fmpa fmpa0) {
        Objects.requireNonNull(fmpe0);
        this.c = fmpe0;
        super();
        this.b = false;
        this.a = fmpa0;
        this.d = new fmpb(this);
    }

    public final void a() {
        synchronized(this) {
            this.b = false;
            this.a.j(this.d);
        }
    }

    public final void b() {
        synchronized(this) {
            this.a.l(this.d);
            this.b = false;
        }
    }
}

