public final class fmto implements gfsi {
    public final fmus a;

    public fmto(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            this.a.ak.F(this.a.e);
            flbj.a("ConvPresenter", "USER_INTERFACE_AUTO_BIND enabled, starting bind");
            return null;
        }
        flbj.a("ConvPresenter", "USER_INTERFACE_AUTO_BIND disabled, not starting bind");
        return null;
    }
}

