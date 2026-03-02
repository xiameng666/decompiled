public final class iapn extends RuntimeException {
    public final iapk a;
    public final iaof_metadata b;
    private static final long serialVersionUID = 0x1B131CBF794914F0L;

    public iapn(iapk iapk0) {
        this(iapk0, null);
    }

    public iapn(iapk iapk0, iaof_metadata iaof0) {
        super(iapk.g(iapk0), iapk0.v);
        this.a = iapk0;
        this.b = iaof0;
    }
}

