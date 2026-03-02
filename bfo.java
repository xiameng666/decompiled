final class bfo implements bpd {
    final bgt a;
    final bfq b;

    public bfo(bfq bfq0, bgt bgt0) {
        this.b = bfq0;
        this.a = bgt0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
        boj.b();
        bfq bfq0 = this.b;
        if(this.a == bfq0.a) {
            bcs.d("CaptureNode", "request aborted, id=" + bfq0.a.a);
            bge bge0 = bfq0.g;
            if(bge0 != null) {
                bge0.a = null;
            }
            bfq0.a = null;
        }
    }

    @Override  // bpd
    public final void b(Object object0) {
        Void void0 = (Void)object0;
    }
}

