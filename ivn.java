final class ivn extends ibur implements ibtw {
    public static final ivn a;

    static {
        ivn.a = new ivn();
    }

    public ivn() {
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return Float.compare(((Number)((iug)object0).b.d(iuz.s, ivl.a)).floatValue(), ((Number)((iug)object1).b.d(iuz.s, ivm.a)).floatValue());
    }
}

