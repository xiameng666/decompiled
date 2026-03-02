import j..util.Objects;

final class epww implements Runnable {
    final byte[] a;
    final epxa b;

    public epww(epxa epxa0, byte[] arr_b) {
        this.a = arr_b;
        Objects.requireNonNull(epxa0);
        this.b = epxa0;
        super();
    }

    @Override
    public final void run() {
        epxa epxa0 = this.b;
        if(epxa0.e) {
            eqgv eqgv0 = epxa0.g;
            if(eqgv0 != null) {
                eqgv0.b(this.a);
                return;
            }
        }
        epxa0.h(this.a);
    }
}

