import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class tx {
    public final boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    private final wy UJ;
    private final wy UL;
    qo s;
    public RecyclerView t;
    public final wz u;
    public final wz v;
    public um w;
    public boolean x;
    public boolean y;
    boolean z;

    public tx() {
        tu tu0 = new tu(this);
        this.UJ = tu0;
        tv tv0 = new tv(this);
        this.UL = tv0;
        this.u = new wz(tu0);
        this.v = new wz(tv0);
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = true;
        this.B = true;
    }

    public void A(int v, int v1) {
    }

    public void B(int v, int v1) {
        this.bt(v);
    }

    public int C(un un0) {
        return 0;
    }

    public int D(un un0) {
        return 0;
    }

    public int E(un un0) {
        return 0;
    }

    public int F(un un0) {
        return 0;
    }

    public int G(un un0) {
        return 0;
    }

    public int H(un un0) {
        return 0;
    }

    public Parcelable P() {
        return null;
    }

    public View S(int v) {
        int v1 = this.ar();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view0 = this.az(v2);
            uq uq0 = RecyclerView.p(view0);
            if(uq0 != null && uq0.c() == v && !uq0.A() && (this.t.N.g || !uq0.v())) {
                return view0;
            }
        }
        return null;
    }

    public void T(String s) {
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 != null) {
            recyclerView0.E(s);
        }
    }

    public void W(AccessibilityEvent accessibilityEvent0) {
        boolean z = true;
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 != null && accessibilityEvent0 != null) {
            if(!recyclerView0.canScrollVertically(1) && !this.t.canScrollVertically(-1) && !this.t.canScrollHorizontally(-1) && !this.t.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent0.setScrollable(z);
            tk tk0 = this.t.m;
            if(tk0 != null) {
                accessibilityEvent0.setItemCount(tk0.b());
            }
        }
    }

    public void X(Parcelable parcelable0) {
    }

    public void Z(int v) {
    }

    public final View aA() {
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 == null) {
            return null;
        }
        View view0 = recyclerView0.getFocusedChild();
        return view0 == null || this.s.k(view0) ? null : view0;
    }

    public final void aB(View view0) {
        this.aC(view0, -1);
    }

    public final void aC(View view0, int v) {
        this.dC(view0, v, true);
    }

    public final void aD(View view0) {
        this.aE(view0, -1);
    }

    public final void aE(View view0, int v) {
        this.dC(view0, v, false);
    }

    public final void aF(View view0, Rect rect0) {
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 == null) {
            rect0.set(0, 0, 0, 0);
            return;
        }
        rect0.set(recyclerView0.g(view0));
    }

    public final void aG(uf uf0) {
        int v = this.ar();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            View view0 = this.az(v);
            uq uq0 = RecyclerView.p(view0);
            if(uq0.A()) {
            }
            else if(uq0.t() && !uq0.v() && !this.t.m.c) {
                this.aT(v);
                uf0.m(uq0);
            }
            else {
                this.aH(v);
                uf0.n(view0);
                this.t.h.g(uq0);
            }
        }
    }

    public final void aH(int v) {
        this.az(v);
        this.s.h(v);
    }

    public final void aI(RecyclerView recyclerView0) {
        this.y = true;
        this.aL(recyclerView0);
    }

    public void aJ(int v) {
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 != null) {
            int v1 = recyclerView0.g.a();
            for(int v2 = 0; v2 < v1; ++v2) {
                recyclerView0.g.d(v2).offsetLeftAndRight(v);
            }
        }
    }

    public void aK(int v) {
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 != null) {
            int v1 = recyclerView0.g.a();
            for(int v2 = 0; v2 < v1; ++v2) {
                recyclerView0.g.d(v2).offsetTopAndBottom(v);
            }
        }
    }

    public void aL(RecyclerView recyclerView0) {
    }

    public final void aM(View view0, khb khb0) {
        uq uq0 = RecyclerView.p(view0);
        if(uq0 != null && !uq0.v() && !this.s.k(uq0.a)) {
            this.fM(this.t.d, this.t.N, view0, khb0);
        }
    }

    public void aN(int v) {
    }

    public final void aO() {
        int v = this.ar();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            this.s.j(v);
        }
    }

    public final void aP(uf uf0) {
        int v = this.ar();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            if(!RecyclerView.p(this.az(v)).A()) {
                this.aS(v, uf0);
            }
        }
    }

    public final void aQ(uf uf0) {
        ArrayList arrayList0 = uf0.a;
        int v = arrayList0.size();
        for(int v1 = v - 1; v1 >= 0; --v1) {
            View view0 = ((uq)arrayList0.get(v1)).a;
            uq uq0 = RecyclerView.p(view0);
            if(!uq0.A()) {
                uq0.n(false);
                if(uq0.x()) {
                    this.t.removeDetachedView(view0, false);
                }
                tr tr0 = this.t.D;
                if(tr0 != null) {
                    tr0.b(uq0);
                }
                uq0.n(true);
                uf0.i(view0);
            }
        }
        arrayList0.clear();
        ArrayList arrayList1 = uf0.b;
        if(arrayList1 != null) {
            arrayList1.clear();
        }
        if(v > 0) {
            this.t.invalidate();
        }
    }

    public final void aR(View view0, uf uf0) {
        qo qo0 = this.s;
        switch(qo0.c) {
            case 1: {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            case 2: {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            default: {
                try {
                    qo0.c = 1;
                    qo0.d = view0;
                    th th0 = qo0.e;
                    int v1 = th0.b(view0);
                    if(v1 >= 0) {
                        if(qo0.a.g(v1)) {
                            qo0.l(view0);
                        }
                        th0.e(v1);
                    }
                }
                finally {
                    qo0.c = 0;
                    qo0.d = null;
                }
                uf0.l(view0);
            }
        }
    }

    public final void aS(int v, uf uf0) {
        View view0 = this.az(v);
        this.aT(v);
        uf0.l(view0);
    }

    public final void aT(int v) {
        if(this.az(v) != null) {
            this.s.j(v);
        }
    }

    public final void aU() {
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 != null) {
            recyclerView0.requestLayout();
        }
    }

    public final void aV() {
        this.x = true;
    }

    public final void aW(RecyclerView recyclerView0) {
        this.aX(View.MeasureSpec.makeMeasureSpec(recyclerView0.getWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(recyclerView0.getHeight(), 0x40000000));
    }

    public final void aX(int v, int v1) {
        this.G = View.MeasureSpec.getSize(v);
        int v2 = View.MeasureSpec.getMode(v);
        this.E = v2;
        if(v2 == 0 && !RecyclerView.a) {
            this.G = 0;
        }
        this.H = View.MeasureSpec.getSize(v1);
        int v3 = View.MeasureSpec.getMode(v1);
        this.F = v3;
        if(v3 == 0 && !RecyclerView.a) {
            this.H = 0;
        }
    }

    public final void aY(int v, int v1) {
        this.t.setMeasuredDimension(v, v1);
    }

    public final void aZ(int v, int v1) {
        int v2 = this.ar();
        if(v2 != 0) {
            int v4 = 0x80000000;
            int v5 = 0x7FFFFFFF;
            int v6 = 0x7FFFFFFF;
            int v7 = 0x80000000;
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = this.az(v3);
                Rect rect0 = this.t.k;
                RecyclerView.U(view0, rect0);
                if(rect0.left < v5) {
                    v5 = rect0.left;
                }
                if(rect0.right > v4) {
                    v4 = rect0.right;
                }
                if(rect0.top < v6) {
                    v6 = rect0.top;
                }
                if(rect0.bottom > v7) {
                    v7 = rect0.bottom;
                }
            }
            this.t.k.set(v5, v6, v4, v7);
            this.fN(this.t.k, v, v1);
            return;
        }
        this.t.K(v, v1);
    }

    public boolean ad() {
        return false;
    }

    public boolean ae() {
        throw null;
    }

    public boolean af() {
        return this.z;
    }

    public boolean ah() {
        return false;
    }

    public boolean aj() {
        return false;
    }

    public void ak(int v, int v1, un un0, rv rv0) {
    }

    public void al(int v, rv rv0) {
    }

    public void ao(RecyclerView recyclerView0) {
    }

    public void ap(RecyclerView recyclerView0, int v) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public static int aq(int v, int v1, int v2) {
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getSize(v);
        switch(v3) {
            case 0x80000000: {
                return Math.min(v4, Math.max(v1, v2));
            }
            case 0x40000000: {
                return v4;
            }
            default: {
                return Math.max(v1, v2);
            }
        }
    }

    public final int ar() {
        return this.s == null ? 0 : this.s.a();
    }

    public static int as(int v, int v1, int v2, int v3, boolean z) {
        int v4 = Math.max(0, v - v2);
        if(z) {
            if(v3 >= 0) {
                return View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
            }
            return v3 == -1 && (v1 == 0x80000000 || v1 == 0x40000000) ? View.MeasureSpec.makeMeasureSpec(v4, v1) : 0;
        }
        if(v3 >= 0) {
            return View.MeasureSpec.makeMeasureSpec(v3, 0x40000000);
        }
        if(v3 == -1) {
            return View.MeasureSpec.makeMeasureSpec(v4, v1);
        }
        if(v3 == -2) {
            return v1 == 0x80000000 || v1 == 0x40000000 ? View.MeasureSpec.makeMeasureSpec(v4, 0x80000000) : View.MeasureSpec.makeMeasureSpec(v4, 0);
        }
        return 0;
    }

    public final int at() {
        tk tk0 = this.t == null ? null : this.t.m;
        return tk0 == null ? 0 : tk0.b();
    }

    public final int au() {
        return this.t.getLayoutDirection();
    }

    public final int av() {
        return this.t.getMinimumHeight();
    }

    public final int aw() {
        return this.t.getMinimumWidth();
    }

    public static tw ax(Context context0, AttributeSet attributeSet0, int v, int v1) {
        tw tw0 = new tw();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, ky.a, v, v1);
        tw0.a = typedArray0.getInt(0, 1);
        tw0.b = typedArray0.getInt(10, 1);
        tw0.c = typedArray0.getBoolean(9, false);
        tw0.d = typedArray0.getBoolean(11, false);
        typedArray0.recycle();
        return tw0;
    }

    public final View ay(View view0) {
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 == null) {
            return null;
        }
        View view1 = recyclerView0.s(view0);
        if(view1 == null) {
            return null;
        }
        return this.s.k(view1) ? null : view1;
    }

    public final View az(int v) {
        return this.s == null ? null : this.s.d(v);
    }

    public static final int bA(View view0) {
        return view0.getLeft() - tx.bk(view0);
    }

    public static final int bB(View view0) {
        return view0.getRight() + tx.bm(view0);
    }

    public static final int bC(View view0) {
        return view0.getTop() - tx.bn(view0);
    }

    public final boolean bD(int v, Bundle bundle0) {
        float f;
        int v4;
        int v3;
        if(this.t != null) {
            int v1 = this.H;
            int v2 = this.G;
            Rect rect0 = new Rect();
            if(this.t.getMatrix().isIdentity() && this.t.getGlobalVisibleRect(rect0)) {
                v1 = rect0.height();
                v2 = rect0.width();
            }
            switch(v) {
                case 0x1000: {
                    v3 = this.t.canScrollVertically(1) ? v1 - this.getPaddingTop() - this.getPaddingBottom() : 0;
                    v4 = this.t.canScrollHorizontally(1) ? v2 - this.getPaddingLeft() - this.getPaddingRight() : 0;
                    break;
                }
                case 0x2000: {
                    v3 = this.t.canScrollVertically(-1) ? -(v1 - this.getPaddingTop() - this.getPaddingBottom()) : 0;
                    v4 = this.t.canScrollHorizontally(-1) ? -(v2 - this.getPaddingLeft() - this.getPaddingRight()) : 0;
                    break;
                }
                default: {
                    v3 = 0;
                    v4 = 0;
                }
            }
            if(v3 == 0) {
                if(v4 != 0) {
                    v3 = 0;
                    goto label_24;
                }
                return false;
            }
        label_24:
            if(bundle0 == null) {
                f = 1.0f;
            }
            else {
                f = bundle0.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if(f >= 0.0f) {
                    goto label_30;
                }
                return false;
            }
        label_30:
            if(Float.compare(f, Infinityf) == 0) {
                RecyclerView recyclerView0 = this.t;
                tk tk0 = recyclerView0.m;
                if(tk0 == null) {
                    return false;
                }
                switch(v) {
                    case 0x1000: {
                        recyclerView0.as(tk0.b() - 1);
                        return true;
                    }
                    case 0x2000: {
                        recyclerView0.as(0);
                        return true;
                    }
                    default: {
                        return true;
                    }
                }
            }
            if(Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                v3 = (int)(((float)v3) * f);
                v4 = (int)(((float)v4) * f);
            }
            this.t.aI(v4, v3, true);
            return true;
        }
        return false;
    }

    public final void ba(RecyclerView recyclerView0) {
        if(recyclerView0 == null) {
            this.t = null;
            this.s = null;
            this.G = 0;
            this.H = 0;
        }
        else {
            this.t = recyclerView0;
            this.s = recyclerView0.g;
            this.G = recyclerView0.getWidth();
            this.H = recyclerView0.getHeight();
        }
        this.E = 0x40000000;
        this.F = 0x40000000;
    }

    public final void bb(um um0) {
        um um1 = this.w;
        if(um1 != null && um0 != um1 && um1.f) {
            um1.g();
        }
        this.w = um0;
        RecyclerView recyclerView0 = this.t;
        recyclerView0.K.d();
        if(um0.h) {
            Log.w("RecyclerView", "An instance of " + um0.getClass().getSimpleName() + " was started more than once. Each instance of" + um0.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        um0.c = recyclerView0;
        um0.d = this;
        int v = um0.b;
        if(v == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        um0.c.N.a = v;
        um0.f = true;
        um0.e = true;
        um0.g = um0.c.n.S(um0.b);
        um0.c.K.b();
        um0.h = true;
    }

    public final boolean bc() {
        return this.t != null && this.t.i;
    }

    public static boolean bd(int v, int v1, int v2) {
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v1);
        if(v2 > 0 && v != v2) {
            return false;
        }
        switch(v3) {
            case 0x80000000: {
                return v4 >= v;
            }
            case 0: {
                return true;
            }
            default: {
                return v3 == 0x40000000 ? v4 == v : false;
            }
        }
    }

    public final boolean be() {
        return this.w != null && this.w.f;
    }

    public boolean bf(RecyclerView recyclerView0, View view0, Rect rect0, boolean z, boolean z1) {
        int v = this.getPaddingLeft();
        int v1 = this.getPaddingTop();
        int v2 = this.G - this.getPaddingRight();
        int v3 = this.H - this.getPaddingBottom();
        int v4 = view0.getLeft() + rect0.left - view0.getScrollX();
        int v5 = view0.getTop() + rect0.top - view0.getScrollY();
        int v6 = v4 - v;
        int v7 = v5 - v1;
        int v8 = 0;
        int v9 = Math.min(0, v6);
        int v10 = rect0.width() + v4 - v2;
        int v11 = Math.min(0, v7);
        int v12 = Math.max(0, v10);
        int v13 = Math.max(0, rect0.height() + v5 - v3);
        if(this.au() != 1) {
            if(v9 == 0) {
                v9 = Math.min(v6, v12);
            }
        }
        else if(v12 != 0) {
            v9 = v12;
        }
        else {
            v9 = Math.max(v9, v10);
        }
        if(v11 == 0) {
            v11 = Math.min(v7, v13);
        }
        if(z1) {
            View view1 = recyclerView0.getFocusedChild();
            if(view1 == null) {
                return false;
            }
            int v14 = this.getPaddingLeft();
            int v15 = this.getPaddingTop();
            int v16 = this.G - this.getPaddingRight();
            int v17 = this.H - this.getPaddingBottom();
            Rect rect1 = this.t.k;
            RecyclerView.U(view1, rect1);
            if(rect1.left - v9 < v16 && rect1.right - v9 > v14 && rect1.top - v11 < v17 && rect1.bottom - v11 > v15) {
                goto label_34;
            }
            return false;
        }
    label_34:
        if(v9 != 0) {
            v8 = v9;
        }
        else if(v11 == 0) {
            return false;
        }
        if(z) {
            recyclerView0.scrollBy(v8, v11);
            return true;
        }
        recyclerView0.aH(v8, v11);
        return true;
    }

    public boolean bg(View view0, int v, int v1, ty ty0) {
        return view0.isLayoutRequested() || !this.A || !tx.bd(view0.getWidth(), v, ty0.width) || !tx.bd(view0.getHeight(), v1, ty0.height);
    }

    public static final int bh(View view0) {
        return ((ty)view0.getLayoutParams()).d.bottom;
    }

    public static final int bi(View view0) {
        Rect rect0 = ((ty)view0.getLayoutParams()).d;
        return view0.getMeasuredHeight() + rect0.top + rect0.bottom;
    }

    public static final int bj(View view0) {
        Rect rect0 = ((ty)view0.getLayoutParams()).d;
        return view0.getMeasuredWidth() + rect0.left + rect0.right;
    }

    public static final int bk(View view0) {
        return ((ty)view0.getLayoutParams()).d.left;
    }

    public static final int bl(View view0) {
        return ((ty)view0.getLayoutParams()).fE();
    }

    public static final int bm(View view0) {
        return ((ty)view0.getLayoutParams()).d.right;
    }

    public static final int bn(View view0) {
        return ((ty)view0.getLayoutParams()).d.top;
    }

    public final void bo(View view0, Rect rect0) {
        Rect rect1 = ((ty)view0.getLayoutParams()).d;
        rect0.set(-rect1.left, -rect1.top, view0.getWidth() + rect1.right, view0.getHeight() + rect1.bottom);
        if(this.t != null) {
            Matrix matrix0 = view0.getMatrix();
            if(matrix0 != null && !matrix0.isIdentity()) {
                RectF rectF0 = this.t.l;
                rectF0.set(rect0);
                matrix0.mapRect(rectF0);
                rect0.set(((int)Math.floor(rectF0.left)), ((int)Math.floor(rectF0.top)), ((int)Math.ceil(rectF0.right)), ((int)Math.ceil(rectF0.bottom)));
            }
        }
        rect0.offset(view0.getLeft(), view0.getTop());
    }

    public static final void bp(View view0, int v, int v1, int v2, int v3) {
        Rect rect0 = ((ty)view0.getLayoutParams()).d;
        view0.layout(v + rect0.left, v1 + rect0.top, v2 - rect0.right, v3 - rect0.bottom);
    }

    public static final void bq(View view0, int v, int v1, int v2, int v3) {
        ty ty0 = (ty)view0.getLayoutParams();
        view0.layout(v + ty0.d.left + ty0.leftMargin, v1 + ty0.d.top + ty0.topMargin, v2 - ty0.d.right - ty0.rightMargin, v3 - ty0.d.bottom - ty0.bottomMargin);
    }

    public final void br(View view0) {
        ty ty0 = (ty)view0.getLayoutParams();
        Rect rect0 = this.t.g(view0);
        int v = rect0.left + rect0.right;
        int v1 = rect0.top + rect0.bottom;
        int v2 = tx.as(this.G, this.E, this.getPaddingLeft() + this.getPaddingRight() + ty0.leftMargin + ty0.rightMargin + v, ty0.width, this.ad());
        int v3 = tx.as(this.H, this.F, this.getPaddingTop() + this.getPaddingBottom() + ty0.topMargin + ty0.bottomMargin + v1, ty0.height, this.ae());
        if(this.bg(view0, v2, v3, ty0)) {
            view0.measure(v2, v3);
        }
    }

    public void bs() {
    }

    public void bt(int v) {
    }

    public final void bu(int v, int v1) {
        this.t.K(v, v1);
    }

    public final void bv(Runnable runnable0) {
        RecyclerView recyclerView0 = this.t;
        if(recyclerView0 != null) {
            recyclerView0.removeCallbacks(runnable0);
        }
    }

    @Deprecated
    public final void bw() {
        this.z = true;
    }

    public final void bx() {
        if(!this.B) {
            this.B = true;
            this.C = 0;
            RecyclerView recyclerView0 = this.t;
            if(recyclerView0 != null) {
                recyclerView0.d.p();
            }
        }
    }

    public final void by(RecyclerView recyclerView0) {
        this.y = false;
        this.ao(recyclerView0);
    }

    public static final int bz(View view0) {
        return view0.getBottom() + tx.bh(view0);
    }

    public int d(int v, uf uf0, un un0) {
        return 0;
    }

    private final void dC(View view0, int v, boolean z) {
        uq uq0 = RecyclerView.p(view0);
        if(!z && !uq0.v()) {
            this.t.h.g(uq0);
        }
        else {
            this.t.h.b(uq0);
        }
        ty ty0 = (ty)view0.getLayoutParams();
        if(uq0.B() || uq0.w()) {
            if(uq0.w()) {
                uq0.p();
            }
            else {
                uq0.i();
            }
            this.s.g(view0, v, view0.getLayoutParams(), false);
        }
        else if(view0.getParent() == this.t) {
            int v1 = this.s.c(view0);
            if(v == -1) {
                v = this.s.a();
            }
            if(v1 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.t.indexOfChild(view0) + this.t.t());
            }
            if(v1 != v) {
                tx tx0 = this.t.n;
                View view1 = tx0.az(v1);
                if(view1 == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + v1 + tx0.t.toString());
                }
                tx0.aH(v1);
                ty ty1 = (ty)view1.getLayoutParams();
                uq uq1 = RecyclerView.p(view1);
                if(uq1.v()) {
                    tx0.t.h.b(uq1);
                }
                else {
                    tx0.t.h.g(uq1);
                }
                tx0.s.g(view1, v, ty1, uq1.v());
            }
        }
        else {
            this.s.f(view0, v, false);
            ty0.e = true;
            um um0 = this.w;
            if(um0 != null && um0.f && um0.d(view0) == um0.b) {
                um0.g = view0;
            }
        }
        if(ty0.f) {
            uq0.a.invalidate();
            ty0.f = false;
        }
    }

    public int e(int v, uf uf0, un un0) {
        return 0;
    }

    public abstract ty f();

    public int fH(uf uf0, un un0) {
        return this.t == null || this.t.m == null || !this.ad() ? 1 : this.t.m.b();
    }

    public int fI(uf uf0, un un0) {
        return this.t == null || this.t.m == null || !this.ae() ? 1 : this.t.m.b();
    }

    public ty fJ(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if((viewGroup$LayoutParams0 instanceof ty)) {
            return new ty(((ty)viewGroup$LayoutParams0));
        }
        return (viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) ? new ty(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new ty(viewGroup$LayoutParams0);
    }

    public View fK(View view0, int v, uf uf0, un un0) {
        return null;
    }

    public void fL(uf uf0, un un0, khb khb0) {
        if(this.t.canScrollVertically(-1) || this.t.canScrollHorizontally(-1)) {
            khb0.m(0x2000);
            khb0.W(true);
            khb0.ar();
        }
        if(this.t.canScrollVertically(1) || this.t.canScrollHorizontally(1)) {
            khb0.m(0x1000);
            khb0.W(true);
            khb0.ar();
        }
        khb0.A(kgy.a(this.fI(uf0, un0), this.fH(uf0, un0), 0));
    }

    public void fM(uf uf0, un un0, View view0, khb khb0) {
        int v = 0;
        int v1 = this.ae() ? tx.bl(view0) : 0;
        if(this.ad()) {
            v = tx.bl(view0);
        }
        khb0.B(kgz.a(v1, 1, v, 1, false, false));
    }

    public void fN(Rect rect0, int v, int v1) {
        int v2 = rect0.width() + this.getPaddingLeft() + this.getPaddingRight();
        int v3 = rect0.height() + this.getPaddingTop() + this.getPaddingBottom();
        this.aY(tx.aq(v, v2, this.aw()), tx.aq(v1, v3, this.av()));
    }

    public boolean fO(int v, Bundle bundle0) {
        return this.bD(v, bundle0);
    }

    public boolean fP() {
        return false;
    }

    public void fQ() {
    }

    public final int getPaddingBottom() {
        return this.t == null ? 0 : this.t.getPaddingBottom();
    }

    public final int getPaddingEnd() {
        return this.t == null ? 0 : this.t.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        return this.t == null ? 0 : this.t.getPaddingLeft();
    }

    public final int getPaddingRight() {
        return this.t == null ? 0 : this.t.getPaddingRight();
    }

    public final int getPaddingStart() {
        return this.t == null ? 0 : this.t.getPaddingStart();
    }

    public final int getPaddingTop() {
        return this.t == null ? 0 : this.t.getPaddingTop();
    }

    public ty h(Context context0, AttributeSet attributeSet0) {
        return new ty(context0, attributeSet0);
    }

    public void o(uf uf0, un un0) {
        throw null;
    }

    public void p(un un0) {
    }

    public boolean t(ty ty0) {
        return ty0 != null;
    }

    public void x(int v, int v1) {
    }

    public void z(int v, int v1) {
    }
}

