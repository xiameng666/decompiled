import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.viewinterop.BringIntoViewElement;

public final class jmw extends ViewGroup implements gom, iip, kee, keg {
    private final ibth A;
    private final int[] B;
    private final kef C;
    private final haq D;
    private final int E;
    private final String F;
    private har G;
    public static final ibts a;
    public final huv b;
    public final View c;
    public final iio d;
    public ibth e;
    public boolean f;
    public ibth g;
    public hfc h;
    public final ibts i;
    public jks j;
    public final ibts k;
    public lps l;
    public orl m;
    public final int[] n;
    public long o;
    public kgq p;
    public ibts q;
    public final ibth r;
    public final ibts s;
    public int t;
    public int u;
    public boolean v;
    public final ify w;
    public final View x;
    public ibts y;
    public ibts z;

    static {
        jmw.a = jme.a;
    }

    public jmw(Context context0, gpg gpg0, View view0, huv huv0, haq haq0, int v, iio iio0) {
        super(context0);
        this.b = huv0;
        this.c = view0;
        this.d = iio0;
        irq.b(this, gpg0);
        this.setSaveFromParentEnabled(false);
        this.addView(view0);
        kfz.a(this, new jmc(this));
        kex.b(this, this);
        this.e = jmv.a;
        this.g = jms.a;
        this.h = hfc.e;
        this.j = new jkt(1.0f, 1.0f);
        this.n = new int[2];
        this.o = 0L;
        this.r = new jmu(this);
        this.A = new jmt(this);
        this.B = new int[2];
        this.t = 0x80000000;
        this.u = 0x80000000;
        this.C = new kef();
        SparseArray sparseArray0 = null;
        ify ify0 = new ify(false, 3, null);
        ify0.k = this;
        hfc hfc0 = iuc.c(huw.a(hfc.e, jmy.a, huv0), true, jmm.a);
        hws hws0 = new hws();
        hws0.a = new hwu(this);
        hwz hwz0 = new hwz();
        hws0.e(hwz0);
        this.s = hwz0;
        hfc hfc1 = ibf.a(hhm.a(hfc0.a(hws0), new jmn(this, ify0, this)), new jmo(this, ify0)).a(new BringIntoViewElement(new jmp(this)));
        ify0.ae(this.h.a(hfc1));
        this.i = new jmf(ify0, hfc1);
        ify0.ab(this.j);
        this.k = new jmg(ify0);
        ify0.y = new jmh(this, ify0);
        ify0.z = new jmi(this);
        ify0.ad(new jml(this, ify0));
        this.w = ify0;
        this.x = view0;
        this.D = haq0;
        this.E = v;
        this.setClipChildren(false);
        String s = String.valueOf(v);
        this.F = s;
        Object object0 = haq0 == null ? null : haq0.a(s);
        if((object0 instanceof SparseArray)) {
            sparseArray0 = (SparseArray)object0;
        }
        if(sparseArray0 != null) {
            view0.restoreHierarchyState(sparseArray0);
        }
        if(haq0 != null) {
            this.o(haq0.e(s, new jnv(this)));
        }
        this.y = jnl.a;
        this.z = jnl.a;
    }

    @Override  // iip
    public final boolean A() {
        return this.isAttachedToWindow();
    }

    @Override  // gom
    public final void b() {
        this.removeAllViewsInLayout();
    }

    @Override  // gom
    public final void c() {
        this.g.a();
    }

    @Override  // gom
    public final void d() {
        View view0 = this.c;
        if(view0.getParent() != this) {
            this.addView(view0);
        }
    }

    @Override  // ked
    public final void e(View view0, int v, int v1, int[] arr_v, int v2) {
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        long v3 = this.b.b(((long)Float.floatToRawIntBits(jmy.a(v1))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(jmy.a(v))) << 0x20, jmy.c(v2));
        arr_v[0] = iqc.a(Float.intBitsToFloat(((int)(v3 >> 0x20))));
        arr_v[1] = iqc.a(Float.intBitsToFloat(((int)(v3 & 0xFFFFFFFFL))));
    }

    @Override  // keg
    public final kgq et(View view0, kgq kgq0) {
        this.p = new kgq(kgq0);
        return this.k(kgq0);
    }

    @Override  // ked
    public final void f(View view0, int v, int v1, int v2, int v3, int v4) {
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        this.b.a(((long)Float.floatToRawIntBits(jmy.a(v1))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(jmy.a(v))) << 0x20, ((long)Float.floatToRawIntBits(jmy.a(v2))) << 0x20 | ((long)Float.floatToRawIntBits(jmy.a(v3))) & 0xFFFFFFFFL, jmy.c(v4));
    }

    @Override  // kee
    public final void g(View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        if(!this.isNestedScrollingEnabled()) {
            return;
        }
        long v5 = this.b.a(((long)Float.floatToRawIntBits(jmy.a(v1))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(jmy.a(v))) << 0x20, ((long)Float.floatToRawIntBits(jmy.a(v2))) << 0x20 | ((long)Float.floatToRawIntBits(jmy.a(v3))) & 0xFFFFFFFFL, jmy.c(v4));
        arr_v[0] = iqc.a(Float.intBitsToFloat(((int)(v5 >> 0x20))));
        arr_v[1] = iqc.a(Float.intBitsToFloat(((int)(v5 & 0xFFFFFFFFL))));
    }

    @Override  // android.view.ViewGroup
    public final boolean gatherTransparentRegion(Region region0) {
        if(region0 == null) {
            return true;
        }
        this.getLocationInWindow(this.B);
        int v = this.B[0];
        region0.op(v, this.B[1], v + this.getWidth(), this.B[1] + this.getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override  // android.view.ViewGroup
    public final CharSequence getAccessibilityClassName() {
        return this.getClass().getName();
    }

    @Override  // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.c.getLayoutParams();
        return viewGroup$LayoutParams0 == null ? new ViewGroup.LayoutParams(-1, -1) : viewGroup$LayoutParams0;
    }

    @Override  // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.C.a();
    }

    @Override  // ked
    public final void h(View view0, View view1, int v, int v1) {
        this.C.b(v, v1);
    }

    @Override  // ked
    public final void i(View view0, int v) {
        this.C.c(v);
    }

    @Override  // android.view.ViewGroup
    public final ViewParent invalidateChildInParent(int[] arr_v, Rect rect0) {
        super.invalidateChildInParent(arr_v, rect0);
        this.l();
        return null;
    }

    @Override  // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    public final iiy j() {
        if(!this.isAttachedToWindow()) {
            hxt.d("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.d.j();
    }

    public final kgq k(kgq kgq0) {
        if(!kgq0.f(-1).equals(jxn.a) || !kgq0.g(-9).equals(jxn.a) || kgq0.l() != null) {
            ihy ihy0 = this.w.r();
            if(ihy0.t()) {
                long v = jlg.b(hzl.a(ihy0));
                int v1 = jlf.a(v);
                int v2 = 0;
                if(v1 < 0) {
                    v1 = 0;
                }
                int v3 = jlf.b(v) >= 0 ? jlf.b(v) : 0;
                long v4 = hzl.g(ihy0).g();
                long v5 = jlg.b(ihy0.j(0xFFFFFFFFL & ((long)Float.floatToRawIntBits(((int)(ihy0.c & 0xFFFFFFFFL)))) | ((long)Float.floatToRawIntBits(((int)(ihy0.c >> 0x20)))) << 0x20));
                int v6 = ((int)(v4 >> 0x20)) - jlf.a(v5) >= 0 ? ((int)(v4 >> 0x20)) - jlf.a(v5) : 0;
                int v7 = ((int)(v4 & 0xFFFFFFFFL)) - jlf.b(v5);
                if(v7 >= 0) {
                    v2 = v7;
                }
                return v1 == 0 && v3 == 0 && v6 == 0 && v2 == 0 ? kgq0 : kgq0.p(v1, v3, v6, v2);
            }
        }
        return kgq0;
    }

    public final void l() {
        if(this.v) {
            jmb jmb0 = new jmb(this.A);
            this.c.postOnAnimation(jmb0);
            return;
        }
        this.w.J();
    }

    public static final jxn m(jxn jxn0, int v, int v1, int v2, int v3) {
        int v4 = jxn0.b - v;
        int v5 = jxn0.c - v1;
        int v6 = jxn0.d - v2;
        int v7 = jxn0.e - v3;
        if(v4 < 0) {
            v4 = 0;
        }
        if(v5 < 0) {
            v5 = 0;
        }
        if(v6 < 0) {
            v6 = 0;
        }
        if(v7 < 0) {
            v7 = 0;
        }
        return jxn.e(v4, v5, v6, v7);
    }

    public static final int n(int v, int v1, int v2) {
        if(v2 < 0 && v != v1) {
            switch(v2) {
                case -2: {
                    return v1 == 0x7FFFFFFF ? 0 : View.MeasureSpec.makeMeasureSpec(v1, 0x80000000);
                }
                case -1: {
                    return v1 == 0x7FFFFFFF ? 0 : View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
                }
                default: {
                    return 0;
                }
            }
        }
        return View.MeasureSpec.makeMeasureSpec(ibwt.j(v2, v, v1), 0x40000000);
    }

    public final void o(har har0) {
        har har1 = this.G;
        if(har1 != null) {
            har1.a();
        }
        this.G = har0;
    }

    @Override  // android.view.ViewGroup
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.a();
    }

    @Override  // android.view.ViewGroup
    public final void onDescendantInvalidated(View view0, View view1) {
        super.onDescendantInvalidated(view0, view1);
        this.l();
    }

    @Override  // android.view.ViewGroup
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j().a.b(this);
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.c.layout(0, 0, v2 - v, v3 - v1);
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        View view0 = this.c;
        if(view0.getParent() != this) {
            this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
            return;
        }
        if(view0.getVisibility() == 8) {
            this.setMeasuredDimension(0, 0);
            return;
        }
        view0.measure(v, v1);
        this.setMeasuredDimension(view0.getMeasuredWidth(), view0.getMeasuredHeight());
        this.t = v;
        this.u = v1;
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedFling(View view0, float f, float f1, boolean z) {
        if(!this.isNestedScrollingEnabled()) {
            return false;
        }
        icbb.b(this.b.f(), null, null, new jmq(z, this, jlt.a(jmy.b(f), jmy.b(f1)), null), 3);
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean onNestedPreFling(View view0, float f, float f1) {
        if(!this.isNestedScrollingEnabled()) {
            return false;
        }
        icbb.b(this.b.f(), null, null, new jmr(this, jlt.a(-f, -f1), null), 3);
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        ibts ibts0 = this.q;
        if(ibts0 != null) {
            ibts0.a((rect0 == null ? null : hmn.c(rect0)));
        }
        return true;
    }

    @Override  // android.view.ViewGroup
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ibts ibts0 = this.s;
        if(ibts0 != null) {
            ibts0.a(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override  // ked
    public final boolean u(View view0, View view1, int v, int v1) {
        return (v & 2) != 0 || (v & 1) != 0;
    }
}

