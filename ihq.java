final class ihq extends ibur implements ibts {
    public static final ihq a;

    static {
        ihq.a = new ihq();
    }

    public ihq() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        iil iil0 = ((ihy)object0).G;
        if(iil0 != null) {
            iil0.invalidate();
        }
        return ibom.a;
    }
}

