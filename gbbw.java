import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

public abstract class gbbw extends gass implements garx, gary, gasx {
    private final Class s;
    public garp t;

    protected gbbw(gast gast0, Class class0) {
        super(gast0);
        this.s = class0;
    }

    @Override  // gass
    protected void O() {
        super.O();
        this.c();
    }

    @Override  // gass
    protected void P() {
        super.P();
        garp garp0 = this.t;
        if(garp0 != null) {
            garp0.F(this);
        }
    }

    @Override  // gass
    protected void U() {
        super.U();
        gbbv gbbv0 = new gbbv(this);
        this.l.c(gbbv0);
    }

    @Override  // gass
    protected void X() {
        super.X();
        garp garp0 = this.t;
        if(garp0 != null && (!garp0.k.a && garp0.k.c)) {
            this.nw(garp0.u());
        }
    }

    @Override  // gass
    protected final boolean aA() {
        garp garp0 = this.t;
        return this.aG() && garp0 != null && garp0.ak();
    }

    @Override  // gass
    public final boolean aC() {
        return (this.t == null || this.t.ak()) && super.aC();
    }

    @Override  // gass
    protected boolean aU(int v) {
        if(v == 3) {
            if(this.t != null) {
                return this.aW("BE_NDP_07").am() ^ 1;
            }
            v = 3;
        }
        return super.aU(v);
    }

    public final garp aW(String s) {
        garp garp0 = this.t;
        gavs.h(garp0, s, this.a.a.g, new gayx(this.no()));
        return garp0;
    }

    public final void aX(String s, boolean z) {
        int v = TextUtils.isEmpty(s);
        boolean z1 = true;
        if(1 == v) {
            s = null;
        }
        this.nw(s);
        garp garp0 = this.t;
        gavs.h(garp0, "BE_NDP_04", this.a.a.g, new gayx(this.no()));
        gath gath0 = garp0.k;
        if((v ^ 1) != gath0.d) {
            gath0.d = v ^ 1;
            garp0.V(hcsc.c, 1);
        }
        gbet gbet0 = this.n;
        hdry hdry0 = hdry.f;
        gath gath1 = this.aW("BE_NDP_06").k;
        if(gath1.a || z && !gath1.c) {
            z1 = false;
        }
        gbet0.d(hdry0, z1);
    }

    protected void aY() {
    }

    protected abstract void aZ();

    @Override  // gass
    public final void aa() {
        this.nJ();
        this.nK();
        this.h();
        this.nm();
        this.l();
        this.j();
    }

    @Override  // gass
    protected void ad(hdrl hdrl0, hdrl hdrl1) {
        super.ad(hdrl0, hdrl1);
        if(hdrl0 != null && hdrl0.e == hdrl1.e) {
            return;
        }
        this.nJ();
        this.nK();
    }

    protected void ba(bzs bzs0) {
    }

    protected void bb(String s) {
        View view0 = this.i;
        if(view0 != null) {
            if(TextUtils.isEmpty(s)) {
                s = null;
            }
            view0.setContentDescription(s);
        }
    }

    public final void bc() {
        gath gath0 = this.aW("BE_NDP_08").k;
        if(gath0.a && gath0.c && !this.av()) {
            gask gask0 = this.a.i;
            if(gask0.c) {
                gask0.e = true;
                gask0.d.removeCallbacksAndMessages(null);
                gash gash0 = new gash(gask0);
                gask0.d.post(gash0);
            }
        }
    }

    private final void c() {
        this.bb((this.t == null ? "" : this.t.i));
    }

    @Override  // garx
    public final void h() {
        if(this.aJ()) {
            this.aZ();
        }
    }

    @Override  // garx
    public final void i() {
        if(this.aJ()) {
            this.aY();
        }
    }

    @Override  // garx
    public final void j() {
        if(this.aJ()) {
            this.R();
        }
    }

    @Override  // garx
    public final void k(bzs bzs0) {
        this.ba(bzs0);
    }

    @Override  // garx
    public final void l() {
        if(this.aJ()) {
            garp garp0 = this.t;
            if(garp0 != null) {
                gavs.h(garp0, "BE_NDP_05", this.a.a.g, new gayx(this.no()));
                this.aX((garp0.k.a || garp0.k.c ? this.aW("BE_NDP_02").u() : null), true);
            }
        }
    }

    @Override  // garx
    public final void m() {
        View view0 = this.i;
        if(view0 != null) {
            int v = view0.getTop();
            for(View view1 = (View)view0.getParent(); true; view1 = (View)viewParent0) {
                int v1 = 0;
                if(view1 == null) {
                    break;
                }
                if((view1 instanceof NestedScrollView)) {
                    if(((NestedScrollView)view1).getChildCount() != 0) {
                        v1 = ((NestedScrollView)view1).getChildAt(0).getHeight() - ((NestedScrollView)view1).getHeight();
                    }
                    int v2 = Math.min(v, v1);
                    ((NestedScrollView)view1).m(view1.getScrollX(), v2);
                    v -= v2;
                }
                v += view1.getTop();
                ViewParent viewParent0 = view1.getParent();
                if(!(viewParent0 instanceof View)) {
                    break;
                }
            }
        }
    }

    @Override  // garx
    public final boolean n(hcta hcta0) {
        return this.aT((hcsz.a(hcta0.d) == 0 ? 1 : hcsz.a(hcta0.d)));
    }

    private final void nJ() {
        garp garp0 = this.t;
        if(garp0 != null) {
            garp0.F(this);
        }
    }

    private final void nK() {
        hdrl hdrl0 = this.b;
        this.t = hdrl0 != null && (hdrl0.b & 4) != 0 ? this.a.b.g(this.a.b.a(hdrl0.e, this.o), this.s) : null;
        garp garp0 = this.t;
        if(garp0 != null) {
            garp0.d.add(this);
            garp0.e = true;
        }
    }

    @Override  // garx
    public final Rect nl() {
        View view0 = this.i;
        Rect rect0 = new Rect();
        if(view0 != null) {
            view0.getGlobalVisibleRect(rect0);
        }
        return rect0;
    }

    @Override  // garx
    public final void nm() {
        if(this.aI()) {
            this.c();
        }
    }

    @Override  // gary
    public void nw(String s) {
    }
}

