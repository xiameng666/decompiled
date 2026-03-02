import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import jeb.synthetic.FIN;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ijr extends ViewGroup {
    private WeakReference a;
    private IBinder b;
    private gpf c;
    private gpg d;
    private ibth e;
    private boolean f;
    private boolean g;

    public ijr(Context context0) {
        this(context0, null, 0, 6, null);
    }

    public ijr(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    public ijr(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.setImportantForAccessibility(1);
        iqr iqr0 = new iqr(this);
        this.addOnAttachStateChangeListener(iqr0);
        iqp iqp0 = new iqp(this);
        kzk.a(this).a.add(iqp0);
        this.e = new iqq(this, iqr0, iqp0);
    }

    public ijr(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void a() {
        if(this.f) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + this.getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0) {
        this.a();
        super.addView(view0);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v) {
        this.a();
        super.addView(view0, v);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, int v1) {
        this.a();
        super.addView(view0, v, v1);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.a();
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.a();
        super.addView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected final boolean addViewInLayout(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.a();
        return super.addViewInLayout(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected final boolean addViewInLayout(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0, boolean z) {
        this.a();
        return super.addViewInLayout(view0, v, viewGroup$LayoutParams0, z);
    }

    private final void b() {
        if(this.c == null) {
            try {
                this.f = true;
                gpg gpg0 = this.d;
                if(gpg0 == null) {
                    gpg0 = irq.a(this);
                    if(gpg0 == null) {
                        ViewParent viewParent0;
                        for(viewParent0 = this.getParent(); gpg0 == null && (viewParent0 instanceof View); viewParent0 = kib.a(((View)viewParent0))) {
                            gpg0 = irq.a(((View)viewParent0));
                        }
                    }
                    if(gpg0 == null) {
                        gpg0 = null;
                    }
                    else {
                        this.k(gpg0);
                    }
                    if(gpg0 == null) {
                        WeakReference weakReference0 = this.a;
                        if(weakReference0 == null) {
                            gpg0 = null;
                        }
                        else {
                            gpg0 = (gpg)weakReference0.get();
                            if(gpg0 == null || !ijr.l(gpg0)) {
                                gpg0 = null;
                            }
                        }
                        if(gpg0 == null) {
                            if(!this.isAttachedToWindow()) {
                                hxt.d(a.i(this, "Cannot locate windowRecomposer; View ", " is not attached to a window"));
                            }
                            ViewParent viewParent1 = this.getParent();
                            View view0 = this;
                            while((viewParent1 instanceof View) && ((View)viewParent1).getId() != 0x1020002) {
                                ViewParent viewParent2 = ((View)viewParent1).getParent();
                                view0 = (View)viewParent1;
                                viewParent1 = viewParent2;
                            }
                            gpg gpg1 = irq.a(view0);
                            if(gpg1 == null) {
                                ire ire0 = (ire)iri.a.get();
                                gpg0 = ire.a(view0);
                                irq.b(view0, gpg0);
                                icfz icfz0 = new icfz(view0.getHandler(), "windowRecomposer cleanup").b;
                                irh irh0 = new irh(((gsu)gpg0), view0, null);
                                view0.addOnAttachStateChangeListener(new irg(icbb.b(icdu.a, icfz0, null, irh0, 2)));
                                goto label_44;
                            }
                            else {
                                if((gpg1 instanceof gsu)) {
                                    gpg0 = (gsu)gpg1;
                                label_44:
                                    this.k(gpg0);
                                    goto label_47;
                                }
                                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                            }
                        }
                    }
                }
            label_47:
                gze gze0 = new gze(0xD8E40040, true, new ijq(this));
                if(ipk.a.compareAndSet(false, true)) {
                    icgv icgv0 = icgx.a(1, 0, null, 6);
                    icbb.b(iccl.b(ing.a()), null, null, new ipi(icgv0, null), 3);
                    ipj ipj0 = new ipj(icgv0);
                    __monitor_enter(hca.c);
                    int v = FIN.finallyOpen$NT();
                    hca.h = ibpo.al(hca.h, ipj0);
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(hca.c);
                    FIN.finallyCodeEnd$NT(v);
                    hca.r();
                }
                if(this.getChildCount() > 0) {
                    View view1 = this.getChildAt(0);
                    if((view1 instanceof ili)) {
                        ili ili0 = (ili)view1;
                    }
                    else {
                        goto label_65;
                    }
                }
                else {
                    this.removeAllViews();
                label_65:
                    ili0 = null;
                }
                if(ili0 == null) {
                    ili0 = new ili(this.getContext(), gpg0.d());
                    this.addView(ili0, irx.a);
                }
                Object object0 = ili0.getTag(0x7F0B2521);  // id:wrapped_composition_tag
                irw irw0 = (object0 instanceof irw) ? ((irw)object0) : null;
                if(irw0 == null) {
                    irw0 = new irw(ili0, new gpj(gpg0, new ijo(ili0.k)));
                    ili0.setTag(0x7F0B2521, irw0);  // id:wrapped_composition_tag
                }
                irw0.e(gze0);
                if(!ibuq.m(ili0.g, gpg0.d())) {
                    ili0.g = gpg0.d();
                    hfb hfb0 = ili0.k.u.f;
                    if((hfb0 instanceof hxj)) {
                        ((hxj)hfb0).t();
                    }
                    if(!hfb0.I().B) {
                        hxt.d("visitSubtreeIf called on an unattached node");
                    }
                    gwq gwq0 = new gwq(new hfb[16]);
                    hfb hfb1 = hfb0.I().v;
                    if(hfb1 == null) {
                        ien.j(gwq0, hfb0.I());
                    }
                    else {
                        gwq0.n(hfb1);
                    }
                    int v1;
                    while((v1 = gwq0.b) != 0) {
                        hfb hfb2 = (hfb)gwq0.c(v1 - 1);
                        if((hfb2.t & 16) != 0) {
                            hfb hfb3 = hfb2;
                            while(hfb3 != null && hfb3.B) {
                                if((hfb3.s & 16) != 0) {
                                    gwq gwq1 = null;
                                    hfb hfb4 = hfb3;
                                    while(hfb4 != null) {
                                        if(!(hfb4 instanceof ijc)) {
                                            if((hfb4.s & 16) != 0 && (hfb4 instanceof iep)) {
                                                hfb hfb5 = ((iep)hfb4).D;
                                                int v2 = 0;
                                                while(hfb5 != null) {
                                                    if((hfb5.s & 16) != 0) {
                                                        ++v2;
                                                        if(v2 == 1) {
                                                            hfb4 = hfb5;
                                                        }
                                                        else {
                                                            if(gwq1 == null) {
                                                                gwq1 = new gwq(new hfb[16]);
                                                            }
                                                            if(hfb4 != null) {
                                                                gwq1.n(hfb4);
                                                            }
                                                            gwq1.n(hfb5);
                                                            hfb4 = null;
                                                        }
                                                    }
                                                    hfb5 = hfb5.v;
                                                }
                                                if(v2 != 1) {
                                                    goto label_120;
                                                }
                                                continue;
                                            }
                                        }
                                        else if((((ijc)hfb4) instanceof hxj)) {
                                            ((hxj)(((ijc)hfb4))).t();
                                        }
                                    label_120:
                                        hfb4 = ien.a(gwq1);
                                    }
                                }
                                hfb3 = hfb3.v;
                            }
                        }
                        ien.j(gwq0, hfb2);
                    }
                }
                this.c = irw0;
                this.f = false;
            }
            catch(Throwable throwable0) {
                this.f = false;
                throw throwable0;
            }
        }
    }

    protected boolean c() {
        throw null;
    }

    public abstract void d(goz arg1, int arg2);

    public final void e() {
        if(this.d == null && !this.isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        this.b();
    }

    public final void f() {
        gpf gpf0 = this.c;
        if(gpf0 != null) {
            gpf0.d();
        }
        this.c = null;
        this.requestLayout();
    }

    public void g(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            view0.layout(this.getPaddingLeft(), this.getPaddingTop(), v2 - v - this.getPaddingRight(), v3 - v1 - this.getPaddingBottom());
        }
    }

    public void h(int v, int v1) {
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            super.onMeasure(v, v1);
            return;
        }
        int v2 = Math.max(0, View.MeasureSpec.getSize(v) - this.getPaddingLeft() - this.getPaddingRight());
        int v3 = Math.max(0, View.MeasureSpec.getSize(v1) - this.getPaddingTop() - this.getPaddingBottom());
        view0.measure(View.MeasureSpec.makeMeasureSpec(v2, View.MeasureSpec.getMode(v)), View.MeasureSpec.makeMeasureSpec(v3, View.MeasureSpec.getMode(v1)));
        this.setMeasuredDimension(view0.getMeasuredWidth() + this.getPaddingLeft() + this.getPaddingRight(), view0.getMeasuredHeight() + this.getPaddingTop() + this.getPaddingBottom());
    }

    public final void i(gpg gpg0) {
        if(this.d != gpg0) {
            this.d = gpg0;
            if(gpg0 != null) {
                this.a = null;
            }
            gpf gpf0 = this.c;
            if(gpf0 != null) {
                gpf0.d();
                this.c = null;
                if(this.isAttachedToWindow()) {
                    this.b();
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.g || super.isTransitionGroup();
    }

    public final void j() {
        ibth ibth1;
        ibth ibth0 = this.e;
        if(ibth0 != null) {
            ibth0.a();
        }
        if(this.isAttachedToWindow()) {
            lps lps0 = lsr.a(this);
            if(lps0 != null) {
                ibth1 = iqx.a(this, lps0.getLifecycle());
                goto label_15;
            }
            hxt.b(a.i(this, "View tree for ", " has no ViewTreeLifecycleOwner"));
            throw new ibnm();
        }
        else {
            ibvd ibvd0 = new ibvd();
            iqu iqu0 = new iqu(this, ibvd0);
            this.addOnAttachStateChangeListener(iqu0);
            ibvd0.a = new iqs(this, iqu0);
            ibth1 = new iqt(ibvd0);
        }
    label_15:
        this.e = ibth1;
    }

    private final void k(gpg gpg0) {
        if(!ijr.l(gpg0)) {
            gpg0 = null;
        }
        if(gpg0 != null) {
            this.a = new WeakReference(gpg0);
        }
    }

    private static final boolean l(gpg gpg0) {
        return !(gpg0 instanceof gsu) || ((gsn)((gsu)gpg0).o.b()).compareTo(gsn.b) > 0;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        IBinder iBinder0 = this.getWindowToken();
        if(this.b != iBinder0) {
            this.b = iBinder0;
            this.a = null;
        }
        if(this.c()) {
            this.b();
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.g(z, v, v1, v2, v3);
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        this.b();
        this.h(v, v1);
    }

    @Override  // android.view.View
    public final void onRtlPropertiesChanged(int v) {
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            view0.setLayoutDirection(v);
        }
    }

    @Override  // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.g = true;
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

