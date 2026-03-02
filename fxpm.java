import java.util.Random;

public final class fxpm extends fxpd {
    private final long a;
    private final long b;
    private final Random c;

    public fxpm(long v, long v1, Random random0) {
        super("Delay");
        this.a = v;
        this.b = v1;
        this.c = random0;
    }

    @Override  // fxpd
    public final void a() {
        long v = this.c.nextLong();
        this.h.l(15, this.a + Math.abs(v % (this.b - this.a)));
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        if(fxpj0.a == 15) {
            if(this.k()) {
                this.j();
            }
            return true;
        }
        return false;
    }
}

