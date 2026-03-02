final class ilr extends ibur implements ibts {
    public static final ilr a;

    static {
        ilr.a = new ilr();
    }

    public ilr() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ity ity0 = ((ify)object0).u();
        return Boolean.valueOf(ity0 != null && ity0.a);
    }
}

