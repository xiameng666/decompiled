public final class bqm implements bcd {
    public final bqn a;

    public bqm(bqn bqn0) {
        this.a = bqn0;
    }

    @Override  // bcd
    public final void a() {
        bqn bqn0 = this.a;
        synchronized(bqn0.a) {
            if(bqn0.b == null) {
                bcs.d("ScreenFlashWrapper", "apply: pendingListener is null!");
            }
            bqn0.d();
        }
    }
}

