import j..util.Objects;

public final class bfg implements bkp {
    public final bfq a;

    public bfg(bfq bfq0) {
        this.a = bfq0;
    }

    @Override  // bkp
    public final void a(bkq bkq0) {
        try {
            bfq bfq0 = this.a;
            bcn bcn0 = bkq0.f();
            if(bcn0 != null) {
                if(bfq0.a == null) {
                    bcs.d("CaptureNode", "Postview image is closed due to request completed or aborted");
                    bcn0.close();
                    return;
                }
                ((bgq)Objects.requireNonNull(bfq0.e)).b.accept(new bgr(bfq0.a, bcn0));
            }
        }
        catch(IllegalStateException illegalStateException0) {
            bcs.b("CaptureNode", "Failed to acquire latest image of postview", illegalStateException0);
        }
    }
}

