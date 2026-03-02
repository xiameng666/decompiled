final class jqr {
    static final jqr a;
    volatile jqr next;
    volatile Thread thread;

    static {
        jqr.a = new jqr(null);
    }

    public jqr() {
        jqs.b.b(this, Thread.currentThread());
    }

    public jqr(byte[] arr_b) {
    }

    final void a(jqr jqr0) {
        jqs.b.a(this, jqr0);
    }
}

