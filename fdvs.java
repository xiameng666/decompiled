import j..util.Objects;

final class fdvs extends fdus {
    long a;
    long b;
    int c;
    final fdvu e;
    private final fdwy f;

    public fdvs(fdvu fdvu0, fdwy fdwy0) {
        Objects.requireNonNull(fdvu0);
        this.e = fdvu0;
        super();
        this.f = fdwy0;
    }

    @Override  // fdus
    public final void a(fduq fduq0) {
        if(this.b()) {
            return;
        }
        this.e.h(this.f, fduq0);
        this.a = fduq0.f;
        this.b = fduq0.g;
        ++this.c;
    }
}

