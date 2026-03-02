final class inz extends ibur implements ibtw {
    public static final inz a;

    static {
        inz.a = new inz();
    }

    public inz() {
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

