import j..util.Objects;

final class aqzp implements gmbg {
    final aqzq a;

    public aqzp(aqzq aqzq0) {
        Objects.requireNonNull(aqzq0);
        this.a = aqzq0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        int v;
        synchronized(this.a) {
            v = this.a.c;
            this.a.c = v + 1;
        }
        aqzq aqzq0 = this.a;
        if(aqzq0.isCancelled()) {
            aqzq.a.d("RetryingListenableFuture was cancelled after %d/%d retries, not retrying again.", new Object[]{v, ((int)aqzq0.b)});
            return;
        }
        if(v < aqzq0.b) {
            aqxh aqxh0 = aqzq0.d;
            if(aqxh0 != null) {
                aqxj.a.n("Retrying after error trying to switch transport to %s (%d/%d retries)", throwable0, new Object[]{aqxj.b(aqxh0.b), v, ((int)aqxh0.a.e)});
            }
            aqzq0.d();
            return;
        }
        if(!aqzq0.r(throwable0)) {
            aqzq.a.f("Attempted to set error for RetryingListenableFuture, but had already been set.", new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(!this.a.q(object0)) {
            aqzq.a.f("Attempted to successfully set result of RetryingListenableFuture but it had already been set.", new Object[0]);
        }
    }
}

