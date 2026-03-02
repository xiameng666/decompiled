final class iir extends ibur implements ibts {
    public static final iir a;

    static {
        iir.a = new iir();
    }

    public iir() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((ify)object0).am()) {
            ify.aw(((ify)object0));
        }
        return ibom.a;
    }
}

