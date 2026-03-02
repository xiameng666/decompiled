final class jpi extends ibur implements ibtw {
    public static final jpi a;

    static {
        jpi.a = new jpi();
    }

    public jpi() {
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(!((goz)object0).ad((v & 3) != 2, v & 1)) {
            ((goz)object0).G();
        }
        return ibom.a;
    }
}

