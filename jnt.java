import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.ViewTreeObserver;

public final class jnt extends hfb implements ViewTreeObserver.OnGlobalFocusChangeListener, hiv {
    private ViewTreeObserver a;
    private final ibts b;
    private final ibts c;

    public jnt() {
        this.b = new jnr(this);
        this.c = new jns(this);
    }

    private final hji a() {
        if(!this.r.B) {
            hxt.d("visitLocalDescendants called on an unattached node");
        }
        hfb hfb0 = this.r;
        if((hfb0.t & 0x400) != 0) {
            hfb hfb1 = hfb0.v;
            boolean z = false;
            while(hfb1 != null) {
                if((hfb1.s & 0x400) != 0) {
                    hfb hfb2 = hfb1;
                    gwq gwq0 = null;
                    while(hfb2 != null) {
                        if((hfb2 instanceof hji)) {
                            if(!z) {
                                z = true;
                                goto label_34;
                            }
                            return (hji)hfb2;
                        }
                        else if((hfb2.s & 0x400) != 0 && (hfb2 instanceof iep)) {
                            hfb hfb3 = ((iep)hfb2).D;
                            int v = 0;
                            while(hfb3 != null) {
                                if((hfb3.s & 0x400) != 0) {
                                    ++v;
                                    if(v == 1) {
                                        hfb2 = hfb3;
                                    }
                                    else {
                                        if(gwq0 == null) {
                                            gwq0 = new gwq(new hfb[16]);
                                        }
                                        if(hfb2 != null) {
                                            gwq0.n(hfb2);
                                        }
                                        gwq0.n(hfb3);
                                        hfb2 = null;
                                    }
                                }
                                hfb3 = hfb3.v;
                            }
                            if(v != 1) {
                                goto label_34;
                            }
                            continue;
                        }
                    label_34:
                        hfb2 = ien.a(gwq0);
                    }
                }
                hfb1 = hfb1.v;
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override  // hiv
    public final void c(hir hir0) {
        hir0.a(false);
        hir0.c(this.b);
        hir0.d(this.c);
    }

    @Override  // hfb
    public final void dO() {
        ViewTreeObserver viewTreeObserver0 = ieo.a(this).getViewTreeObserver();
        this.a = viewTreeObserver0;
        viewTreeObserver0.addOnGlobalFocusChangeListener(this);
    }

    @Override  // hfb
    public final void dR() {
        ViewTreeObserver viewTreeObserver0 = this.a;
        if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnGlobalFocusChangeListener(this);
        }
        this.a = null;
        ieo.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view0, View view1) {
        if(ien.d(this).j != null) {
            View view2 = jnq.a(this);
            hio hio0 = ((ili)ien.f(this)).R;
            iio iio0 = ien.f(this);
            boolean z = true;
            boolean z1 = view0 != null && !ibuq.m(view0, iio0) && jnq.b(view2, view0);
            if(view1 == null || ibuq.m(view1, iio0) || !jnq.b(view2, view1)) {
                z = false;
            }
            if(!z1) {
                if(z) {
                    hji hji0 = this.a();
                    if(!hji0.e().a()) {
                        hjk.a(hji0);
                    }
                }
                else {
                label_16:
                    if(z1 && this.a().e().b()) {
                        hio0.l(false, false, 8);
                    }
                }
            }
            else if(!z) {
                goto label_16;
            }
        }
    }
}

