import j..util.Objects;

public final class czdp extends cvxe {
    final czdu a;
    private final cvxe b;

    public czdp(czdu czdu0, cvxe cvxe0) {
        Objects.requireNonNull(czdu0);
        this.a = czdu0;
        super();
        this.b = cvxe0;
    }

    @Override  // cvxe
    public final void a(cuwd cuwd0, cuuz cuuz0) {
        this.b.a(cuwd0, cuuz0);
    }

    @Override  // cvxe
    public final void b(cuwd cuwd0, cuvf cuvf0) {
        if(cuvf0.d) {
            String s = cuwd0.e();
            this.a.cA(s);
        }
        this.b.b(cuwd0, cuvf0);
    }

    @Override  // cvxe
    public final void c(cuwd cuwd0, cuvl cuvl0) {
        if(!cuvl0.a.e()) {
            String s = cuwd0.e();
            this.a.cB(s);
        }
        this.b.c(cuwd0, cuvl0);
    }

    @Override  // cvxe
    public final void d(cuwd cuwd0) {
        String s = cuwd0.e();
        this.a.cB(s);
        this.b.d(cuwd0);
    }
}

