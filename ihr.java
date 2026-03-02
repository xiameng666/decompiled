final class ihr extends ibur implements ibts {
    public static final ihr a;

    static {
        ihr.a = new ihr();
    }

    public ihr() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ihy ihy0 = (ihy)object0;
        ify ify0 = ihy0.t;
        try {
            if(ihy0.A() && ihy.aF(ihy0)) {
                igd igd0 = ify0.v;
                if(igd0.k > 0) {
                    if(igd0.j || igd0.i) {
                        ify.aw(ify0);
                    }
                    igd0.o.B();
                }
                ify0.M();
                iio iio0 = igc.a(ify0);
                ((ili)iio0).l.d(ify0);
                if(ify0.B > 0) {
                    iio0.w(ify0);
                }
            }
            return ibom.a;
        }
        catch(Throwable throwable0) {
            ify0.ay(throwable0);
            throw new ibnm();
        }
    }
}

