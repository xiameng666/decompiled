public final class gplj implements Runnable {
    public final gplt a;
    public final Runnable b;

    public gplj(gplt gplt0, Runnable runnable0) {
        this.a = gplt0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        try {
            this.b.run();
        }
        catch(Throwable throwable0) {
            gplt gplt0 = this.a;
            gplt0.i = true;
            iaku iaku0 = gplt0.f;
            if(iaku0 != null) {
                iaku0.a(iapk.d(throwable0), new iaof_metadata());
                iakv iakv0 = gplt0.j;
                if(iakv0 != null && gplt0.e.e == 4) {
                    iakv0.a(null, throwable0);
                }
            }
        }
    }
}

