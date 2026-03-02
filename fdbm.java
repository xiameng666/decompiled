public final class fdbm implements evqc {
    public final fdch a;
    public final fduq b;

    public fdbm(fdch fdch0, fduq fduq0) {
        this.a = fdch0;
        this.b = fduq0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        String s = this.a.n.a().a;
        this.a.m(this.b, s, "global", "Phone capability lookup failed");
    }
}

