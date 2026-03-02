import android.view.ViewGroup;

public final class fcch extends fccf {
    final String t;
    public static final int u;

    protected fcch(ViewGroup viewGroup0, String s) {
        super(viewGroup0);
        this.t = s;
    }

    @Override  // fccf
    protected final void D(gdcl gdcl0) {
        fm fm0 = gdcl0.b;
        du du0 = fm0.h(this.t);
        if((du0 instanceof gdfr)) {
            ((gdfr)du0).lr();
            ca ca0 = new ca(fm0);
            ca0.o(du0);
            ca0.f();
        }
        super.D(gdcl0);
    }

    @Override  // fccf
    public final void E(gdcl gdcl0, boolean z) {
        du du0 = gdcl0.b.h(this.t);
        if((du0 instanceof gdfr)) {
            ((gdfr)du0).ll(z);
        }
    }

    @Override  // fccf
    protected final void F(hcfc hcfc0, gdcl gdcl0) {
        fcab fcab0 = fcab.I((hcfc0.d == null ? gewu.a : hcfc0.d), gdcl0.c, gdcl0.f, false, gdcl0.e);
        fcab0.cb = gdcl0.a;
        ca ca0 = new ca(gdcl0.b);
        ca0.v(fcab0, this.t);
        ca0.f();
        this.v.addView(fcab0.getView());
    }

    @Override  // fccf
    protected final boolean G(hcfc hcfc0, gdcl gdcl0) {
        return false;
    }
}

