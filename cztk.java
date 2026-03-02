public final class cztk implements geky {
    public final byte[] a;

    public cztk(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // geky
    public final void a(gele gele0) {
        if(!gele0.a()) {
            czkq.a.c().h("BleSocketOutputStream failed to send a control packet %s", czmk.g(this.a));
        }
    }
}

