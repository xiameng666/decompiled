public final class cznw implements Runnable {
    public final czoi a;
    public final gged_interceptors b;
    public final czyv c;

    public cznw(czoi czoi0, gged_interceptors gged0, czyv czyv0) {
        this.a = czoi0;
        this.b = gged0;
        this.c = czyv0;
    }

    @Override
    public final void run() {
        cunf cunf0 = czkq.a;
        cunf cunf1 = cunf0.b();
        gged_interceptors gged0 = this.b;
        cunf1.h("Sending ice candidates: %d", Integer.valueOf(gged0.size()));
        czoi czoi0 = this.a;
        czyv czyv0 = this.c;
        try {
            czzk czzk0 = czoi0.i;
            byte[] arr_b = czos.p(czoi0.b, gged0);
            if(czos.s(czzk0, czoi0.a, 2, czyv0, arr_b)) {
                cunf0.b().i("Sent ice candidates %s to %s.", gged0, czyv0);
            }
            else {
                cunf0.b().h("Failed to send ice candidates to %s.", czyv0);
            }
        }
        finally {
            czoi0.e = null;
            czoi0.f.removeAll(gged0);
        }
    }
}

