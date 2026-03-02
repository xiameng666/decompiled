public final class dokh implements dqrm {
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final long d;

    public dokh(long v, byte[] arr_b, byte[] arr_b1, long v1) {
        this.a = v;
        this.b = arr_b;
        this.c = arr_b1;
        this.d = v1;
    }

    @Override  // dqrm
    public final void a(dqrl dqrl0) {
        dqrl0.c(this.a, this.b, this.c, this.d);
    }
}

