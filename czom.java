public final class czom implements Runnable {
    public final czor a;
    public final gged_interceptors b;
    public final czyv c;
    public final czzk d;

    public czom(czor czor0, gged_interceptors gged0, czzk czzk0, czyv czyv0) {
        this.a = czor0;
        this.b = gged0;
        this.d = czzk0;
        this.c = czyv0;
    }

    @Override
    public final void run() {
        cunf cunf0 = czkq.a;
        cunf cunf1 = cunf0.b();
        gged_interceptors gged0 = this.b;
        cunf1.h("Sending ice candidates: %d", Integer.valueOf(gged0.size()));
        czor czor0 = this.a;
        czyv czyv0 = this.c;
        try {
            byte[] arr_b = czos.p(czor0.c, gged0);
            if(czos.s(this.d, czor0.a, 3, czyv0, arr_b)) {
                cunf0.b().i("Sent ice candidates %s to %s.", gged0, czyv0);
            }
            else {
                cunf0.b().h("Failed to send ice candidates to %s.", czyv0);
            }
        }
        finally {
            czor0.i = null;
            czor0.j.removeAll(gged0);
        }
    }
}

