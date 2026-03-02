final class jme extends ibur implements ibts {
    public static final jme a;

    static {
        jme.a = new jme();
    }

    public jme() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        jmw jmw0 = (jmw)object0;
        jmw0.getHandler().post(new jmd(jmw0.r));
        return ibom.a;
    }
}

