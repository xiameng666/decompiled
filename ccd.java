final class ccd extends ibur implements ibtw {
    public static final ccd a;

    static {
        ccd.a = new ccd();
    }

    public ccd() {
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return Boolean.valueOf(((cde)object0) == ((cde)object1) && ((cde)object1) == cde.c);
    }
}

