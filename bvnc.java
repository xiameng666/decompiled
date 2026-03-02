final class bvnc extends ibuo implements ibts {
    public static final bvnc a;

    static {
        bvnc.a = new bvnc();
    }

    public bvnc() {
        super(1, hgnx.class, "getIsLocaleUnsupported", "getIsLocaleUnsupported()Z", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hgnx hgnx0 = (hgnx)object0;
        ibuq.f(hgnx0, "p0");
        return Boolean.valueOf(hgnx0.b);
    }
}

