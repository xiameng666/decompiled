import j..util.Objects;

public final class czjn extends cvxn {
    final czjq a;
    private final cvxn b;

    public czjn(czjq czjq0, cvxn cvxn0) {
        Objects.requireNonNull(czjq0);
        this.a = czjq0;
        super(cvxn0.c);
        this.b = cvxn0;
    }

    @Override  // cvxn
    public final void a(cuwd cuwd0, cuuz cuuz0) {
        this.b.a(cuwd0, cuuz0);
    }

    @Override  // cvxn
    public final void b(cuwd cuwd0, cvxm cvxm0) {
        if(cvxm0.a == 1) {
            String s = cuwd0.e();
            this.a.h(s);
        }
        this.b.b(cuwd0, cvxm0);
    }

    @Override  // cvxn
    public final void c(cuwd cuwd0, cvxq cvxq0) {
        if(!cvxq0.a.e()) {
            String s = cuwd0.e();
            this.a.i(s);
        }
        this.b.c(cuwd0, cvxq0);
    }

    @Override  // cvxn
    public final void d(cuwd cuwd0, int v) {
        String s = cuwd0.e();
        this.a.i(s);
        this.b.d(cuwd0, v);
    }

    @Override  // cvxn
    public final void e(cuwd cuwd0, cuwq cuwq0) {
        bjrt.f();
    }
}

