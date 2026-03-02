public final class rxx implements ibts {
    public final rrc a;

    public rxx(rrc rrc0) {
        this.a = rrc0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        rnv rnv0 = (rnv)object0;
        ibuq.f(rnv0, "metadata");
        sct.e("TaskStateManager", "Undelivered: " + rnv0 + " [" + this.a + "]");
        return ibom.a;
    }
}

