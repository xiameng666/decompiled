public final class dxrm implements dqko {
    public final dxrr a;
    public final String b;

    public dxrm(dxrr dxrr0, String s) {
        this.a = dxrr0;
        this.b = s;
    }

    @Override  // dqko
    public final void a(Exception exception0) {
        ((ggtj)((ggtj)((ggtj)dxrr.at.i()).s(exception0)).ar(11650)).B("Error while fetching settings to initialize: %s", this.b);
        this.a.ax.c(exception0, this.a.getChildFragmentManager());
    }
}

