import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public final class kzx {
    public int a;
    public int b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float g;
    public int h;
    public final int i;
    public int j;
    public View k;
    public Interpolator l;
    private static final Interpolator m;
    private int n;
    private int[] o;
    private int[] p;
    private int[] q;
    private int r;
    private VelocityTracker s;
    private final float t;
    private final OverScroller u;
    private final kzw v;
    private boolean w;
    private final ViewGroup x;
    private final Runnable y;

    static {
        kzx.m = new kzt();
    }

    private kzx(Context context0, ViewGroup viewGroup0, kzw kzw0) {
        this.n = -1;
        this.y = new kzu(this);
        if(kzw0 == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.x = viewGroup0;
        this.v = kzw0;
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        int v = (int)(context0.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
        this.i = v;
        this.h = v;
        this.b = viewConfiguration0.getScaledTouchSlop();
        this.t = (float)viewConfiguration0.getScaledMaximumFlingVelocity();
        this.g = (float)viewConfiguration0.getScaledMinimumFlingVelocity();
        this.l = kzx.m;
        this.u = new OverScroller(context0, new kzv(this));
    }

    private static final float A(float f, float f1, float f2) {
        float f3 = Math.abs(f);
        if(Float.compare(f3, f1) < 0) {
            return 0.0f;
        }
        if((f3 > f2)) {
            return f > 0.0f ? f2 : -f2;
        }
        return f;
    }

    private static final int B(int v, int v1, int v2) {
        int v3 = Math.abs(v);
        if(v3 < v1) {
            return 0;
        }
        if(v3 > v2) {
            return v <= 0 ? -v2 : v2;
        }
        return v;
    }

    public final View a(int v, int v1) {
        ViewGroup viewGroup0 = this.x;
        int v2 = viewGroup0.getChildCount();
        while(true) {
            --v2;
            if(v2 < 0) {
                break;
            }
            View view0 = viewGroup0.getChildAt(v2);
            if(v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom()) {
                return view0;
            }
        }
        return null;
    }

    public static kzx b(ViewGroup viewGroup0, kzw kzw0) {
        return new kzx(viewGroup0.getContext(), viewGroup0, kzw0);
    }

    public static kzx c(ViewGroup viewGroup0, float f, kzw kzw0) {
        kzx kzx0 = kzx.b(viewGroup0, kzw0);
        kzx0.b = (int)(((float)kzx0.b) * (1.0f / f));
        return kzx0;
    }

    public final void d() {
        this.e();
        if(this.a == 2) {
            this.u.getCurrX();
            this.u.getCurrY();
            this.u.abortAnimation();
            int v = this.u.getCurrX();
            int v1 = this.u.getCurrY();
            this.v.l(this.k, v, v1);
        }
        this.l = kzx.m;
        this.h(0);
    }

    public final void e() {
        this.n = -1;
        float[] arr_f = this.c;
        if(arr_f != null) {
            Arrays.fill(arr_f, 0.0f);
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.o, 0);
            Arrays.fill(this.p, 0);
            Arrays.fill(this.q, 0);
            this.r = 0;
        }
        VelocityTracker velocityTracker0 = this.s;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.s = null;
        }
    }

    public final void f(View view0, int v) {
        ViewParent viewParent0 = view0.getParent();
        ViewGroup viewGroup0 = this.x;
        if(viewParent0 != viewGroup0) {
            throw new IllegalArgumentException(a.i(viewGroup0, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (", ")"));
        }
        this.k = view0;
        this.n = v;
        this.v.c(view0, v);
        this.h(1);
    }

    public final void g(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        int v2 = 0;
        if(v == 0) {
            this.e();
            v = 0;
        }
        if(this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v3 = motionEvent0.getPointerId(0);
                View view0 = this.a(((int)f), ((int)f1));
                this.u(f, f1, v3);
                this.n(view0, v3);
                if((this.o[v3] & this.j) != 0) {
                    this.v.k(v3);
                    return;
                }
                return;
            }
            case 1: {
                if(this.a == 1) {
                    this.s();
                }
                this.e();
                return;
            }
            case 2: {
                if(this.a != 1) {
                    goto label_47;
                }
                int v4 = this.n;
                if(this.z(v4)) {
                    int v5 = motionEvent0.findPointerIndex(v4);
                    if(v5 != -1) {
                        float f2 = motionEvent0.getX(v5);
                        float f3 = motionEvent0.getY(v5);
                        int v6 = this.n;
                        float f4 = f2 - this.e[v6];
                        float f5 = f3 - this.f[v6];
                        int v7 = this.k.getLeft() + ((int)f4);
                        int v8 = this.k.getTop() + ((int)f5);
                        int v9 = this.k.getLeft();
                        int v10 = this.k.getTop();
                        if(((int)f4) != 0) {
                            v7 = this.v.p(this.k, v7);
                            this.k.offsetLeftAndRight(v7 - v9);
                        }
                        if(((int)f5) != 0) {
                            v8 = this.v.h(this.k, v8);
                            this.k.offsetTopAndBottom(v8 - v10);
                        }
                        if(((int)f4) != 0 || ((int)f5) != 0) {
                            this.v.l(this.k, v7, v8);
                            this.v(motionEvent0);
                            return;
                        label_47:
                            int v11 = motionEvent0.getPointerCount();
                            while(v2 < v11) {
                                int v12 = motionEvent0.getPointerId(v2);
                                if(this.z(v12)) {
                                    float f6 = motionEvent0.getX(v2);
                                    float f7 = motionEvent0.getY(v2);
                                    float f8 = f6 - this.c[v12];
                                    float f9 = f7 - this.d[v12];
                                    this.t(f8, f9, v12);
                                    if(this.a != 1) {
                                        View view1 = this.a(((int)f6), ((int)f7));
                                        if(!this.x(view1, f8, f9) || !this.n(view1, v12)) {
                                            ++v2;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                ++v2;
                            }
                        }
                        this.v(motionEvent0);
                        return;
                    }
                }
                return;
            }
            case 3: {
                if(this.a == 1) {
                    this.r(0.0f, 0.0f);
                }
                this.e();
                return;
            }
            case 5: {
                int v13 = motionEvent0.getPointerId(v1);
                float f10 = motionEvent0.getX(v1);
                float f11 = motionEvent0.getY(v1);
                this.u(f10, f11, v13);
                if(this.a == 0) {
                    this.n(this.a(((int)f10), ((int)f11)), v13);
                    if((this.o[v13] & this.j) != 0) {
                        this.v.k(v13);
                        return;
                    }
                }
                else if(this.j(this.k, ((int)f10), ((int)f11))) {
                    this.n(this.k, v13);
                    return;
                }
                return;
            }
            case 6: {
                int v14 = motionEvent0.getPointerId(v1);
                if(this.a == 1 && v14 == this.n) {
                    int v15 = motionEvent0.getPointerCount();
                    while(true) {
                        if(v2 < v15) {
                            int v16 = motionEvent0.getPointerId(v2);
                            if(v16 == this.n || (this.a(((int)motionEvent0.getX(v2)), ((int)motionEvent0.getY(v2))) != this.k || !this.n(this.k, v16))) {
                                ++v2;
                                continue;
                            }
                            else if(this.n != -1) {
                                break;
                            }
                        }
                        this.s();
                        break;
                    }
                }
                this.q(v14);
            }
        }
    }

    final void h(int v) {
        this.x.removeCallbacks(this.y);
        if(this.a != v) {
            this.a = v;
            this.v.d(v);
            if(this.a == 0) {
                this.k = null;
            }
        }
    }

    public final boolean i(int v) {
        return (this.r & 1 << v) != 0;
    }

    public final boolean j(View view0, int v, int v1) {
        return view0 == null ? false : v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom();
    }

    public final boolean k(int v, int v1) {
        if(this.w) {
            return this.y(v, v1, ((int)this.s.getXVelocity(this.n)), ((int)this.s.getYVelocity(this.n)));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean l(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.e();
            v = 0;
        }
        if(this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v2 = motionEvent0.getPointerId(0);
                this.u(f, f1, v2);
                View view0 = this.a(((int)f), ((int)f1));
                if(view0 == this.k && this.a == 2) {
                    this.n(view0, v2);
                }
                if((this.o[v2] & this.j) != 0) {
                    this.v.k(v2);
                    return this.a == 1;
                }
                return this.a == 1;
            }
            case 2: {
                if(this.c != null && this.d != null) {
                    int v3 = motionEvent0.getPointerCount();
                    int v4 = 0;
                    while(v4 < v3) {
                        int v5 = motionEvent0.getPointerId(v4);
                        if(this.z(v5)) {
                            float f2 = motionEvent0.getX(v4);
                            float f3 = motionEvent0.getY(v4);
                            float f4 = f2 - this.c[v5];
                            float f5 = f3 - this.d[v5];
                            View view1 = this.a(((int)f2), ((int)f3));
                            boolean z = this.x(view1, f4, f5);
                            if(z) {
                                int v6 = view1.getLeft();
                                int v7 = this.v.p(view1, ((int)f4) + v6);
                                int v8 = view1.getTop();
                                int v9 = this.v.h(view1, ((int)f5) + v8);
                                int v10 = this.v.a(view1);
                                int v11 = this.v.i();
                                if(v10 != 0 && (v10 <= 0 || v7 != v6) || v11 != 0 && (v11 <= 0 || v9 != v8)) {
                                    goto label_42;
                                }
                            }
                            else {
                            label_42:
                                this.t(f4, f5, v5);
                                if(this.a != 1 && (!z || !this.n(view1, v5))) {
                                    ++v4;
                                    continue;
                                }
                            }
                            break;
                        }
                        ++v4;
                    }
                    this.v(motionEvent0);
                    return this.a == 1;
                }
                return this.a == 1;
            }
            case 1: 
            case 3: {
                this.e();
                return this.a == 1;
            }
            case 5: {
                int v12 = motionEvent0.getPointerId(v1);
                float f6 = motionEvent0.getX(v1);
                float f7 = motionEvent0.getY(v1);
                this.u(f6, f7, v12);
                int v13 = this.a;
                if(v13 == 0) {
                    if((this.o[v12] & this.j) != 0) {
                        this.v.k(v12);
                        return this.a == 1;
                    }
                }
                else if(v13 == 2) {
                    View view2 = this.a(((int)f6), ((int)f7));
                    if(view2 == this.k) {
                        this.n(view2, v12);
                        return this.a == 1;
                    }
                }
                return this.a == 1;
            }
            case 6: {
                this.q(motionEvent0.getPointerId(v1));
                return this.a == 1;
            }
            default: {
                return this.a == 1;
            }
        }
    }

    public final boolean m(View view0, int v, int v1) {
        this.k = view0;
        this.n = -1;
        boolean z = this.y(v, v1, 0, 0);
        if(!z && this.a == 0 && this.k != null) {
            this.k = null;
            return false;
        }
        return z;
    }

    final boolean n(View view0, int v) {
        if(view0 == this.k && this.n == v) {
            return true;
        }
        if(view0 != null && this.v.o(view0, v)) {
            this.n = v;
            this.f(view0, v);
            return true;
        }
        return false;
    }

    public final boolean o() {
        if(this.a == 2) {
            OverScroller overScroller0 = this.u;
            boolean z = overScroller0.computeScrollOffset();
            int v = overScroller0.getCurrX();
            int v1 = overScroller0.getCurrY();
            int v2 = v - this.k.getLeft();
            int v3 = v1 - this.k.getTop();
            if(v2 != 0) {
                this.k.offsetLeftAndRight(v2);
            }
            if(v3 != 0) {
                this.k.offsetTopAndBottom(v3);
            }
            if(v2 != 0 || v3 != 0) {
                this.v.l(this.k, v, v1);
            }
            if(!z) {
                this.x.post(this.y);
            }
            else if(v == overScroller0.getFinalX() && v1 == overScroller0.getFinalY()) {
                overScroller0.abortAnimation();
                this.x.post(this.y);
                return this.a == 2;
            }
        }
        return this.a == 2;
    }

    private final int p(int v, int v1, int v2) {
        if(v == 0) {
            return 0;
        }
        int v3 = this.x.getWidth();
        int v4 = Math.abs(v1);
        return v4 <= 0 ? Math.min(((int)((((float)Math.abs(v)) / ((float)v2) + 1.0f) * 256.0f)), 600) : Math.min(Math.round(Math.abs((((float)(v3 / 2)) + ((float)Math.sin((Math.min(1.0f, ((float)Math.abs(v)) / ((float)v3)) - 0.5f) * 0.471239f)) * ((float)(v3 / 2))) / ((float)v4)) * 1000.0f) * 4, 600);
    }

    private final void q(int v) {
        float[] arr_f = this.c;
        if(arr_f != null && this.i(v)) {
            arr_f[v] = 0.0f;
            this.d[v] = 0.0f;
            this.e[v] = 0.0f;
            this.f[v] = 0.0f;
            this.o[v] = 0;
            this.p[v] = 0;
            this.q[v] = 0;
            this.r &= ~(1 << v);
        }
    }

    private final void r(float f, float f1) {
        this.w = true;
        this.v.e(this.k, f, f1);
        this.w = false;
        if(this.a == 1) {
            this.h(0);
        }
    }

    private final void s() {
        this.s.computeCurrentVelocity(1000, this.t);
        this.r(kzx.A(this.s.getXVelocity(this.n), this.g, this.t), kzx.A(this.s.getYVelocity(this.n), this.g, this.t));
    }

    private final void t(float f, float f1, int v) {
        int v1 = this.w(f, f1, v, 1);
        if(this.w(f1, f, v, 4)) {
            v1 |= 4;
        }
        if(this.w(f, f1, v, 2)) {
            v1 |= 2;
        }
        if(this.w(f1, f, v, 8)) {
            v1 |= 8;
        }
        if(v1 != 0) {
            this.p[v] |= v1;
            this.v.b(v1, v);
        }
    }

    private final void u(float f, float f1, int v) {
        float[] arr_f = this.c;
        int v1 = 0;
        if(arr_f == null || arr_f.length <= v) {
            float[] arr_f1 = new float[v + 1];
            float[] arr_f2 = new float[v + 1];
            float[] arr_f3 = new float[v + 1];
            float[] arr_f4 = new float[v + 1];
            int[] arr_v = new int[v + 1];
            int[] arr_v1 = new int[v + 1];
            int[] arr_v2 = new int[v + 1];
            if(arr_f != null) {
                System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
                System.arraycopy(this.d, 0, arr_f2, 0, this.d.length);
                System.arraycopy(this.e, 0, arr_f3, 0, this.e.length);
                System.arraycopy(this.f, 0, arr_f4, 0, this.f.length);
                System.arraycopy(this.o, 0, arr_v, 0, this.o.length);
                System.arraycopy(this.p, 0, arr_v1, 0, this.p.length);
                System.arraycopy(this.q, 0, arr_v2, 0, this.q.length);
            }
            this.c = arr_f1;
            this.d = arr_f2;
            this.e = arr_f3;
            this.f = arr_f4;
            this.o = arr_v;
            this.p = arr_v1;
            this.q = arr_v2;
        }
        float[] arr_f5 = this.c;
        this.e[v] = f;
        arr_f5[v] = f;
        float[] arr_f6 = this.d;
        this.f[v] = f1;
        arr_f6[v] = f1;
        int[] arr_v3 = this.o;
        ViewGroup viewGroup0 = this.x;
        if(((int)f) < viewGroup0.getLeft() + this.h) {
            v1 = 1;
        }
        if(((int)f1) < viewGroup0.getTop() + this.h) {
            v1 |= 4;
        }
        if(((int)f) > viewGroup0.getRight() - this.h) {
            v1 |= 2;
        }
        if(((int)f1) > viewGroup0.getBottom() - this.h) {
            v1 |= 8;
        }
        arr_v3[v] = v1;
        this.r |= 1 << v;
    }

    private final void v(MotionEvent motionEvent0) {
        int v = motionEvent0.getPointerCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = motionEvent0.getPointerId(v1);
            if(this.z(v2)) {
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.e[v2] = f;
                this.f[v2] = f1;
            }
        }
    }

    private final boolean w(float f, float f1, int v, int v1) {
        float f2 = Math.abs(f);
        float f3 = Math.abs(f1);
        if((this.o[v] & v1) == v1 && (this.j & v1) != 0 && (this.q[v] & v1) != v1 && (this.p[v] & v1) != v1) {
            float f4 = (float)this.b;
            if(f2 > f4 || f3 > f4) {
                if((f2 < f3 * 0.5f)) {
                    this.v.j();
                }
                return (this.p[v] & v1) == 0 && f2 > ((float)this.b);
            }
        }
        return false;
    }

    private final boolean x(View view0, float f, float f1) {
        if(view0 == null) {
            return false;
        }
        boolean z = this.v.a(view0) > 0;
        boolean z1 = this.v.i() > 0;
        if(z && z1) {
            return f * f + f1 * f1 > ((float)(this.b * this.b));
        }
        return z ? Math.abs(f) > ((float)this.b) : z1 && Math.abs(f1) > ((float)this.b);
    }

    private final boolean y(int v, int v1, int v2, int v3) {
        float f1;
        float f;
        int v4 = this.k.getLeft();
        int v5 = this.k.getTop();
        int v6 = v - v4;
        int v7 = v1 - v5;
        if(v6 == 0 && v7 == 0) {
            this.u.abortAnimation();
            this.h(0);
            return false;
        }
        View view0 = this.k;
        int v8 = kzx.B(v2, ((int)this.g), ((int)this.t));
        int v9 = kzx.B(v3, ((int)this.g), ((int)this.t));
        int v10 = Math.abs(v6);
        int v11 = Math.abs(v7);
        int v12 = Math.abs(v8);
        int v13 = Math.abs(v9);
        int v14 = v12 + v13;
        int v15 = v10 + v11;
        if(v9 == 0) {
            f = (float)v15;
            f1 = (float)v11;
        }
        else {
            f = (float)v14;
            f1 = (float)v13;
        }
        this.l = kzx.m;
        this.u.startScroll(v4, v5, v6, v7, ((int)(((float)this.p(v6, v8, this.v.a(view0))) * (v8 == 0 ? ((float)v10) / ((float)v15) : ((float)v12) / ((float)v14)) + ((float)this.p(v7, v9, this.v.i())) * (f1 / f))));
        this.h(2);
        return true;
    }

    private final boolean z(int v) {
        return this.i(v);
    }
}

