import android.view.View;
import android.view.ViewGroup;

public abstract class gbbx extends gbbw implements gasz {
    public gbbt s;
    ViewGroup u;
    private boolean v;

    protected gbbx(gast gast0, Class class0) {
        super(gast0, class0);
    }

    @Override  // gbbw
    protected final void P() {
        super.P();
        this.be();
    }

    @Override  // gbbw
    protected final void X() {
        super.X();
        if(this.s != null) {
            ViewGroup viewGroup0 = this.u;
            if(viewGroup0 != null) {
                gast gast0 = this.a;
                gbmd gbmd0 = new gbmd(viewGroup0);
                gaxl.a();
                boolean z = hzlg.a.b().b();
                gasm gasm0 = gast0.e;
                if(z) {
                    gbmd0.e = gasm0;
                }
                else {
                    gasm0.d();
                }
                long v = this.y(this).no();
                gasm0.d.h(v, gbmd0);
            }
            this.n.a();
            this.B(this.u);
            this.n.b();
            if(this.j) {
                this.bf();
                return;
            }
            this.be();
        }
    }

    @Override  // gass
    public final void Y() {
        ViewGroup viewGroup0 = this.u;
        if(viewGroup0 != null) {
            this.B(viewGroup0);
        }
        gbbt gbbt0 = this.s;
        if(gbbt0 != null) {
            gbbt0.B();
        }
        this.n.c();
    }

    @Override  // gass
    public final boolean aH() {
        return this.s != null && this.s.aj;
    }

    public final void aV() {
        this.a.a.g().a();
    }

    @Override  // gass
    protected void ab() {
        super.ab();
        this.a.e.d.i(this.y(this).no());
    }

    @Override  // gbbw
    protected void ad(hdrl hdrl0, hdrl hdrl1) {
        super.ad(hdrl0, hdrl1);
        gbbt gbbt0 = this.b(hdrl1);
        this.s = gbbt0;
        this.v = gbbt0.isAdded();
        this.u = this.s.a(this.a.a.b());
    }

    @Override  // gass
    protected final void ae(boolean z) {
        super.ae(z);
        if(this.s != null && this.aI()) {
            if(z) {
                this.bf();
                return;
            }
            this.be();
        }
    }

    protected abstract gbbt b(hdrl arg1);

    private final String bd() {
        return String.valueOf(this.p);
    }

    private final void be() {
        if(this.v) {
            ca ca0 = new ca(this.a.a.a());
            ca0.o(this.s);
            ca0.a();
            this.v = false;
        }
    }

    private final void bf() {
        if(!this.v) {
            ca ca0 = new ca(this.a.a.a());
            ca0.v(this.s, this.bd());
            ca0.a();
            this.v = true;
        }
    }

    public void c() {
    }

    @Override  // gasz
    public final void nP(View view0) {
        this.u.removeView(view0);
    }

    protected final du nu() {
        return this.a.a.a().h(this.bd());
    }

    @Override  // gasz
    public final void nv(gass gass0, View view0, int v) {
        this.u.addView(view0, v);
    }

    @Override  // gass
    public final View t() {
        return this.u;
    }

    @Override  // gass
    protected final gata z() {
        return new gata(this);
    }
}

