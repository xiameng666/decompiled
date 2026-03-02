final class ilu extends ibur implements ibts {
    public static final ilu a;

    static {
        ilu.a = new ilu();
    }

    public ilu() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ity ity0 = ((ify)object0).u();
        return Boolean.valueOf(ity0 != null && ity0.a && ity0.f(iuz.E));
    }
}

