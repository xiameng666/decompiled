package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import su;
import sv;
import sw;
import tw;
import tx;
import ty;
import uf;
import ul;
import um;
import un;
import yza;
import yzb;
import yzc;
import yze;
import yzg;
import yzi;

public class FlexboxLayoutManager extends tx implements ul, yza {
    private int I;
    private int J;
    private final SparseArray K;
    private final Context L;
    private View M;
    private int N;
    private final yzc O;
    public int a;
    public int b;
    public boolean c;
    public List d;
    public final yze e;
    public sw f;
    public sw g;
    private static final Rect h;
    private int i;
    private final int j;
    private boolean k;
    private uf l;
    private un m;
    private yzi n;
    private final yzg o;
    private FlexboxLayoutManager.SavedState p;
    private int q;
    private int r;

    static {
        FlexboxLayoutManager.h = new Rect();
    }

    public FlexboxLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.j = -1;
        this.d = new ArrayList();
        this.e = new yze(this);
        this.o = new yzg(this);
        this.q = -1;
        this.r = 0x80000000;
        this.I = 0x80000000;
        this.J = 0x80000000;
        this.K = new SparseArray();
        this.N = -1;
        this.O = new yzc();
        tw tw0 = FlexboxLayoutManager.ax(context0, attributeSet0, v, v1);
        switch(tw0.a) {
            case 0: {
                if(tw0.c) {
                    this.M(1);
                }
                else {
                    this.M(0);
                }
                break;
            }
            case 1: {
                if(tw0.c) {
                    this.M(3);
                }
                else {
                    this.M(2);
                }
            }
        }
        if(this.b != 1) {
            this.aO();
            this.bF();
            this.b = 1;
            this.f = null;
            this.g = null;
            this.aU();
        }
        if(this.i != 4) {
            this.aO();
            this.bF();
            this.i = 4;
            this.aU();
        }
        this.L = context0;
    }

    @Override  // tx
    public final void A(int v, int v1) {
        this.bL(v);
    }

    @Override  // tx
    public final void B(int v, int v1) {
        this.bt(v);
        this.bL(v);
    }

    @Override  // tx
    public final int C(un un0) {
        return this.N(un0);
    }

    @Override  // tx
    public final int D(un un0) {
        return this.Q(un0);
    }

    @Override  // tx
    public final int E(un un0) {
        return this.R(un0);
    }

    @Override  // tx
    public final int F(un un0) {
        return this.N(un0);
    }

    @Override  // tx
    public final int G(un un0) {
        return this.Q(un0);
    }

    @Override  // tx
    public final int H(un un0) {
        return this.R(un0);
    }

    @Override  // yza
    public final void I(List list0) {
        this.d = list0;
    }

    @Override  // yza
    public final void J(int v, View view0) {
        this.K.put(v, view0);
    }

    public final int L() {
        View view0 = this.bQ(this.ar() - 1, -1);
        return view0 == null ? -1 : FlexboxLayoutManager.bl(view0);
    }

    public final void M(int v) {
        if(this.a != v) {
            this.aO();
            this.a = v;
            this.f = null;
            this.g = null;
            this.bF();
            this.aU();
        }
    }

    private final int N(un un0) {
        if(this.ar() != 0) {
            int v = un0.a();
            this.bH();
            View view0 = this.ac(v);
            View view1 = this.ai(v);
            if(un0.a() != 0 && view0 != null && view1 != null) {
                int v1 = this.f.a(view1) - this.f.d(view0);
                return Math.min(this.f.k(), v1);
            }
        }
        return 0;
    }

    @Override  // ul
    public final PointF O(int v) {
        if(this.ar() != 0) {
            View view0 = this.az(0);
            if(view0 != null) {
                int v1 = v >= FlexboxLayoutManager.bl(view0) ? 1 : -1;
                return this.lO() ? new PointF(0.0f, ((float)v1)) : new PointF(((float)v1), 0.0f);
            }
        }
        return null;
    }

    @Override  // tx
    public final Parcelable P() {
        FlexboxLayoutManager.SavedState flexboxLayoutManager$SavedState0 = this.p;
        if(flexboxLayoutManager$SavedState0 != null) {
            return new FlexboxLayoutManager.SavedState(flexboxLayoutManager$SavedState0);
        }
        Parcelable parcelable0 = new FlexboxLayoutManager.SavedState();
        if(this.ar() > 0) {
            View view0 = this.bE();
            parcelable0.a = FlexboxLayoutManager.bl(view0);
            parcelable0.b = this.f.d(view0) - this.f.j();
            return parcelable0;
        }
        ((FlexboxLayoutManager.SavedState)parcelable0).a();
        return parcelable0;
    }

    private final int Q(un un0) {
        if(this.ar() != 0) {
            int v = un0.a();
            View view0 = this.ac(v);
            View view1 = this.ai(v);
            if(un0.a() != 0 && view0 != null && view1 != null) {
                int v1 = FlexboxLayoutManager.bl(view0);
                int v2 = FlexboxLayoutManager.bl(view1);
                int v3 = Math.abs(this.f.a(view1) - this.f.d(view0));
                int[] arr_v = this.e.b;
                int v4 = arr_v[v1];
                return v4 == -1 || v4 == 0 ? 0 : Math.round(((float)v4) * (((float)v3) / ((float)(arr_v[v2] - v4 + 1))) + ((float)(this.f.j() - this.f.d(view0))));
            }
        }
        return 0;
    }

    private final int R(un un0) {
        if(this.ar() != 0) {
            int v = un0.a();
            View view0 = this.ac(v);
            View view1 = this.ai(v);
            if(un0.a() != 0 && view0 != null && view1 != null) {
                View view2 = this.bQ(0, this.ar());
                int v1 = view2 == null ? -1 : FlexboxLayoutManager.bl(view2);
                int v2 = this.L();
                return (int)(((float)Math.abs(this.f.a(view1) - this.f.d(view0))) / ((float)(v2 - v1 + 1)) * ((float)un0.a()));
            }
        }
        return 0;
    }

    private final int U(uf uf0, un un0, yzi yzi0) {
        int v37;
        int v36;
        int v26;
        int v21;
        boolean z1;
        int v20;
        float f5;
        int v18;
        int v16;
        int v = yzi0.f;
        if(v != 0x80000000) {
            int v1 = yzi0.a;
            if(v1 < 0) {
                yzi0.f = v + v1;
            }
            this.bI(uf0, yzi0);
        }
        int v2 = yzi0.a;
        boolean z = this.lO();
        int v3 = v2;
        int v4 = 0;
        while((v3 > 0 || this.n.b) && (yzi0.d >= 0 && yzi0.d < un0.a() && (yzi0.c >= 0 && yzi0.c < this.d.size()))) {
            yzb yzb0 = (yzb)this.d.get(yzi0.c);
            yzi0.d = yzb0.o;
            if(this.lO()) {
                int v5 = this.getPaddingLeft();
                int v6 = this.getPaddingRight();
                int v7 = yzi0.i == -1 ? yzi0.e - yzb0.g : yzi0.e;
                int v8 = yzi0.d;
                float f = Math.max(0.0f, 0.0f);
                int v9 = yzb0.h;
                float f1 = ((float)(this.G - v6)) - ((float)this.o.d);
                float f2 = ((float)v5) - ((float)this.o.d);
                int v10 = v8;
                int v11 = 0;
                while(v10 < v8 + v9) {
                    View view0 = this.s(v10);
                    if(yzi0.i == 1) {
                        this.aF(view0, FlexboxLayoutManager.h);
                        this.aD(view0);
                    }
                    else {
                        this.aF(view0, FlexboxLayoutManager.h);
                        this.aE(view0, v11);
                        ++v11;
                    }
                    yze yze0 = this.e;
                    long v12 = yze0.c[v10];
                    int v13 = (int)v12;
                    int v14 = yze.q(v12);
                    FlexboxLayoutManager.LayoutParams flexboxLayoutManager$LayoutParams0 = (FlexboxLayoutManager.LayoutParams)view0.getLayoutParams();
                    if(this.bP(view0, v13, v14, flexboxLayoutManager$LayoutParams0)) {
                        view0.measure(v13, v14);
                    }
                    float f3 = f2 + ((float)(flexboxLayoutManager$LayoutParams0.leftMargin + FlexboxLayoutManager.bk(view0)));
                    float f4 = f1 - ((float)(flexboxLayoutManager$LayoutParams0.rightMargin + FlexboxLayoutManager.bm(view0)));
                    int v15 = v7 + FlexboxLayoutManager.bn(view0);
                    if(this.c) {
                        v16 = v10;
                        int v17 = v15 + view0.getMeasuredHeight();
                        v18 = v9;
                        f5 = f4;
                        yze0.l(view0, yzb0, Math.round(f4) - view0.getMeasuredWidth(), v15, Math.round(f4), v17);
                    }
                    else {
                        f5 = f4;
                        v18 = v9;
                        v16 = v10;
                        int v19 = v15 + view0.getMeasuredHeight();
                        yze0.l(view0, yzb0, Math.round(f3), v15, Math.round(f3) + view0.getMeasuredWidth(), v19);
                    }
                    f2 = f3 + (((float)(view0.getMeasuredWidth() + flexboxLayoutManager$LayoutParams0.rightMargin + FlexboxLayoutManager.bm(view0))) + f);
                    f1 = f5 - (((float)(view0.getMeasuredWidth() + flexboxLayoutManager$LayoutParams0.leftMargin + FlexboxLayoutManager.bk(view0))) + f);
                    v10 = v16 + 1;
                    v9 = v18;
                    v2 = v2;
                    v8 = v8;
                    v11 = v11;
                    z = z;
                }
                v20 = v2;
                z1 = z;
            }
            else {
                v20 = v2;
                z1 = z;
                int v22 = this.getPaddingTop();
                int v23 = this.getPaddingBottom();
                int v24 = this.H;
                int v25 = yzi0.e;
                if(yzi0.i == -1) {
                    v26 = v25 + yzb0.g;
                    v25 -= yzb0.g;
                }
                else {
                    v26 = v25;
                }
                int v27 = yzi0.d;
                float f6 = Math.max(0.0f, 0.0f);
                int v28 = yzb0.h;
                float f7 = ((float)(v24 - v23)) - ((float)this.o.d);
                float f8 = ((float)v22) - ((float)this.o.d);
                int v29 = v27;
                int v30 = 0;
                while(v29 < v27 + v28) {
                    View view1 = this.s(v29);
                    yze yze1 = this.e;
                    long v31 = yze1.c[v29];
                    int v32 = (int)v31;
                    int v33 = yze.q(v31);
                    FlexboxLayoutManager.LayoutParams flexboxLayoutManager$LayoutParams1 = (FlexboxLayoutManager.LayoutParams)view1.getLayoutParams();
                    if(this.bP(view1, v32, v33, flexboxLayoutManager$LayoutParams1)) {
                        view1.measure(v32, v33);
                    }
                    float f9 = f8 + ((float)(flexboxLayoutManager$LayoutParams1.topMargin + FlexboxLayoutManager.bn(view1)));
                    float f10 = f7 - ((float)(flexboxLayoutManager$LayoutParams1.rightMargin + FlexboxLayoutManager.bh(view1)));
                    float f11 = f9;
                    if(yzi0.i == 1) {
                        this.aF(view1, FlexboxLayoutManager.h);
                        this.aD(view1);
                    }
                    else {
                        this.aF(view1, FlexboxLayoutManager.h);
                        this.aE(view1, v30);
                        ++v30;
                    }
                    int v34 = FlexboxLayoutManager.bk(view1) + v25;
                    int v35 = v26 - FlexboxLayoutManager.bm(view1);
                    if(!this.c) {
                        v37 = v28;
                        v36 = v27;
                        if(this.k) {
                            int v38 = v34 + view1.getMeasuredWidth();
                            yze1.m(view1, yzb0, false, v34, Math.round(f10) - view1.getMeasuredHeight(), v38, Math.round(f10));
                        }
                        else {
                            yze1.m(view1, yzb0, false, v34, Math.round(f11), v34 + view1.getMeasuredWidth(), Math.round(f11) + view1.getMeasuredHeight());
                        }
                    }
                    else if(this.k) {
                        v36 = v27;
                        v37 = v28;
                        yze1.m(view1, yzb0, true, v35 - view1.getMeasuredWidth(), Math.round(f10) - view1.getMeasuredHeight(), v35, Math.round(f10));
                    }
                    else {
                        v37 = v28;
                        v36 = v27;
                        yze1.m(view1, yzb0, true, v35 - view1.getMeasuredWidth(), Math.round(f11), v35, Math.round(f11) + view1.getMeasuredHeight());
                    }
                    float f12 = f11 + (((float)(view1.getMeasuredHeight() + flexboxLayoutManager$LayoutParams1.topMargin + FlexboxLayoutManager.bh(view1))) + f6);
                    f7 = f10 - (((float)(view1.getMeasuredHeight() + flexboxLayoutManager$LayoutParams1.bottomMargin + FlexboxLayoutManager.bn(view1))) + f6);
                    v28 = v37;
                    v30 = v30;
                    ++v29;
                    f8 = f12;
                    v27 = v36;
                }
            }
            yzi0.c += this.n.i;
            v21 = yzb0.g;
            v4 += v21;
            if(!z1 && this.c) {
                yzi0.e -= yzb0.g * yzi0.i;
            }
            else {
                yzi0.e += yzb0.g * yzi0.i;
            }
            v3 -= yzb0.g;
            v2 = v20;
            z = z1;
        }
        int v39 = yzi0.a - v4;
        yzi0.a = v39;
        int v40 = yzi0.f;
        if(v40 != 0x80000000) {
            int v41 = v40 + v4;
            yzi0.f = v41;
            if(v39 < 0) {
                yzi0.f = v41 + v39;
            }
            this.bI(uf0, yzi0);
        }
        return v2 - yzi0.a;
    }

    private final int V(int v, uf uf0, un un0, boolean z) {
        int v2;
        if(!this.lO() && this.c) {
            int v1 = v - this.f.j();
            if(v1 > 0) {
                v2 = this.aa(v1, uf0, un0);
                goto label_9;
            }
            return 0;
        }
        int v3 = this.f.f() - v;
        if(v3 > 0) {
            v2 = -this.aa(-v3, uf0, un0);
        label_9:
            if(z) {
                int v4 = this.f.f() - (v + v2);
                if(v4 > 0) {
                    this.f.n(v4);
                    return v4 + v2;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override  // tx
    public final void X(Parcelable parcelable0) {
        if((parcelable0 instanceof FlexboxLayoutManager.SavedState)) {
            this.p = (FlexboxLayoutManager.SavedState)parcelable0;
            this.aU();
        }
    }

    private final int Y(int v, uf uf0, un un0, boolean z) {
        int v2;
        if(!this.lO() && this.c) {
            int v1 = this.f.f() - v;
            if(v1 > 0) {
                v2 = this.aa(-v1, uf0, un0);
                goto label_9;
            }
            return 0;
        }
        int v3 = v - this.f.j();
        if(v3 > 0) {
            v2 = -this.aa(v3, uf0, un0);
        label_9:
            if(z) {
                int v4 = v + v2 - this.f.j();
                if(v4 > 0) {
                    this.f.n(-v4);
                    return v2 - v4;
                }
            }
            return v2;
        }
        return 0;
    }

    @Override  // tx
    public final void Z(int v) {
        this.q = v;
        this.r = 0x80000000;
        FlexboxLayoutManager.SavedState flexboxLayoutManager$SavedState0 = this.p;
        if(flexboxLayoutManager$SavedState0 != null) {
            flexboxLayoutManager$SavedState0.a();
        }
        this.aU();
    }

    @Override  // yza
    public final int a() {
        return 5;
    }

    @Override  // tx
    public final void aL(RecyclerView recyclerView0) {
        this.M = (View)recyclerView0.getParent();
    }

    private final int aa(int v, uf uf0, un un0) {
        int v12;
        int v1;
        if(this.ar() != 0 && v != 0) {
            this.bH();
            this.n.j = true;
            boolean z = !this.lO() && this.c;
            if(!z) {
                v1 = v <= 0 ? -1 : 1;
            }
            else if(v < 0) {
                v1 = 1;
            }
            else {
                v1 = -1;
            }
            int v2 = Math.abs(v);
            this.n.i = v1;
            boolean z1 = this.lO();
            int v3 = View.MeasureSpec.makeMeasureSpec(this.G, this.E);
            int v4 = View.MeasureSpec.makeMeasureSpec(this.H, this.F);
            boolean z2 = !z1 && this.c;
            if(v1 == 1) {
                View view0 = this.az(this.ar() - 1);
                if(view0 != null) {
                    yzi yzi0 = this.n;
                    yzi0.e = this.f.a(view0);
                    yze yze0 = this.e;
                    int v5 = FlexboxLayoutManager.bl(view0);
                    View view1 = this.am(view0, ((yzb)this.d.get(yze0.b[v5])));
                    yzi.a(this.n);
                    yzi yzi1 = this.n;
                    int v6 = v5 + yzi1.h;
                    yzi1.d = v6;
                    int[] arr_v = yze0.b;
                    yzi1.c = arr_v.length <= v6 ? -1 : arr_v[v6];
                    if(z2) {
                        yzi1.e = this.f.d(view1);
                        yzi yzi2 = this.n;
                        yzi2.f = -this.f.d(view1) + this.f.j();
                        this.n.f = Math.max(this.n.f, 0);
                    }
                    else {
                        yzi1.e = this.f.a(view1);
                        yzi yzi3 = this.n;
                        yzi3.f = this.f.a(view1) - this.f.f();
                    }
                    int v7 = this.n.c;
                    if((v7 == -1 || v7 > this.d.size() - 1) && this.n.d <= this.l()) {
                        int v8 = v2 - this.n.f;
                        yzc yzc0 = this.O;
                        yzc0.a();
                        if(v8 > 0) {
                            if(z1) {
                                yze0.c(yzc0, v3, v4, v8, this.n.d, this.d);
                            }
                            else {
                                yze0.d(yzc0, v3, v4, v8, this.n.d, this.d);
                            }
                            yze0.h(v3, v4, this.n.d);
                            yze0.o(this.n.d);
                        }
                    }
                    this.n.a = v2 - this.n.f;
                }
            }
            else {
                View view2 = this.az(0);
                if(view2 != null) {
                    yzi yzi4 = this.n;
                    yzi4.e = this.f.d(view2);
                    int v9 = FlexboxLayoutManager.bl(view2);
                    View view3 = this.ag(view2, ((yzb)this.d.get(this.e.b[v9])));
                    yzi.a(this.n);
                    int v10 = this.e.b[v9];
                    if(v10 == -1) {
                        v10 = 0;
                    }
                    this.n.d = v10 > 0 ? v9 - ((yzb)this.d.get(v10 - 1)).h : -1;
                    yzi yzi5 = this.n;
                    yzi5.c = v10 <= 0 ? 0 : v10 - 1;
                    if(z2) {
                        yzi5.e = this.f.a(view3);
                        yzi yzi6 = this.n;
                        yzi6.f = this.f.a(view3) - this.f.f();
                        this.n.f = Math.max(this.n.f, 0);
                    }
                    else {
                        yzi5.e = this.f.d(view3);
                        yzi yzi7 = this.n;
                        yzi7.f = -this.f.d(view3) + this.f.j();
                    }
                    this.n.a = v2 - this.n.f;
                }
            }
            int v11 = this.n.f + this.U(uf0, un0, this.n);
            if(v11 >= 0) {
                if(!z) {
                    v12 = v2 <= v11 ? v : v1 * v11;
                }
                else if(v2 > v11) {
                    v12 = -v1 * v11;
                }
                else {
                    v12 = v;
                }
                this.f.n(-v12);
                this.n.g = v12;
                return v12;
            }
        }
        return 0;
    }

    private final int ab(int v) {
        if(this.ar() != 0 && v != 0) {
            this.bH();
            boolean z = this.lO();
            int v1 = z ? this.M.getWidth() : this.M.getHeight();
            int v2 = z ? this.G : this.H;
            if(this.au() == 1) {
                int v3 = Math.abs(v);
                if(v < 0) {
                    return -Math.min(v2 + this.o.d - v1, v3);
                }
                int v4 = this.o.d;
                return v4 + v <= 0 ? v : -v4;
            }
            if(v > 0) {
                return Math.min(v2 - this.o.d - v1, v);
            }
            int v5 = this.o.d;
            return v5 + v < 0 ? -v5 : v;
        }
        return 0;
    }

    private final View ac(int v) {
        View view0 = this.an(0, this.ar(), v);
        if(view0 != null) {
            int v1 = this.e.b[FlexboxLayoutManager.bl(view0)];
            return v1 == -1 ? null : this.ag(view0, ((yzb)this.d.get(v1)));
        }
        return null;
    }

    @Override  // tx
    public final boolean ad() {
        if(this.b == 0) {
            return this.lO();
        }
        return this.lO() ? this.G > (this.M == null ? 0 : this.M.getWidth()) : true;
    }

    @Override  // tx
    public final boolean ae() {
        if(this.b == 0) {
            return !this.lO();
        }
        return this.lO() ? true : this.H > (this.M == null ? 0 : this.M.getHeight());
    }

    @Override  // tx
    public final boolean af() {
        return true;
    }

    private final View ag(View view0, yzb yzb0) {
        boolean z = this.lO();
        int v = yzb0.h;
        for(int v1 = 1; v1 < v; ++v1) {
            View view1 = this.az(v1);
            if(view1 != null && view1.getVisibility() != 8) {
                if(!this.c || z) {
                    if(this.f.d(view0) > this.f.d(view1)) {
                        view0 = view1;
                    }
                }
                else if(this.f.a(view0) < this.f.a(view1)) {
                    view0 = view1;
                }
            }
        }
        return view0;
    }

    private final View ai(int v) {
        View view0 = this.an(this.ar() - 1, -1, v);
        if(view0 == null) {
            return null;
        }
        int v1 = FlexboxLayoutManager.bl(view0);
        return this.am(view0, ((yzb)this.d.get(this.e.b[v1])));
    }

    private final View am(View view0, yzb yzb0) {
        boolean z = this.lO();
        int v = this.ar() - 2;
        int v1 = this.ar() - yzb0.h;
        while(v > v1 - 1) {
            View view1 = this.az(v);
            if(view1 != null && view1.getVisibility() != 8) {
                if(!this.c || z) {
                    if(this.f.a(view0) < this.f.a(view1)) {
                        view0 = view1;
                    }
                }
                else if(this.f.d(view0) > this.f.d(view1)) {
                    view0 = view1;
                }
            }
            --v;
        }
        return view0;
    }

    private final View an(int v, int v1, int v2) {
        this.bH();
        this.bG();
        int v3 = this.f.j();
        int v4 = this.f.f();
        View view0 = null;
        int v5 = v;
        View view1 = null;
        while(v5 != v1) {
            View view2 = this.az(v5);
            if(view2 != null) {
                int v6 = FlexboxLayoutManager.bl(view2);
                if(v6 >= 0 && v6 < v2) {
                    if(!((ty)view2.getLayoutParams()).fG()) {
                        if(this.f.d(view2) >= v3 && this.f.a(view2) <= v4) {
                            return view2;
                        }
                        if(view0 == null) {
                            view0 = view2;
                        }
                    }
                    else if(view1 == null) {
                        view1 = view2;
                    }
                }
            }
            v5 += (v1 <= v ? -1 : 1);
        }
        return view0 == null ? view1 : view0;
    }

    @Override  // tx
    public final void ao(RecyclerView recyclerView0) {
    }

    @Override  // tx
    public final void ap(RecyclerView recyclerView0, int v) {
        um um0 = new um(recyclerView0.getContext());
        um0.b = v;
        this.bb(um0);
    }

    @Override  // yza
    public final int b() {
        return this.i;
    }

    private final View bE() {
        return this.az(0);
    }

    private final void bF() {
        this.d.clear();
        this.o.b();
        this.o.d = 0;
    }

    private final void bG() {
        if(this.n == null) {
            this.n = new yzi();
        }
    }

    private final void bH() {
        if(this.f != null) {
            return;
        }
        if(this.lO()) {
            if(this.b == 0) {
                this.f = new su(this);
                this.g = new sv(this);
                return;
            }
            this.f = new sv(this);
            this.g = new su(this);
            return;
        }
        if(this.b == 0) {
            this.f = new sv(this);
            this.g = new su(this);
            return;
        }
        this.f = new su(this);
        this.g = new sv(this);
    }

    private final void bI(uf uf0, yzi yzi0) {
        if(yzi0.j) {
            if(yzi0.i == -1) {
                if(yzi0.f >= 0) {
                    int v = this.ar();
                    if(v != 0) {
                        int v1 = v - 1;
                        View view0 = this.az(v1);
                        if(view0 != null) {
                            int[] arr_v = this.e.b;
                            int v2 = arr_v[FlexboxLayoutManager.bl(view0)];
                            if(v2 != -1) {
                                yzb yzb0 = (yzb)this.d.get(v2);
                                int v3 = v1;
                                while(v3 >= 0) {
                                    View view1 = this.az(v3);
                                    if(view1 == null) {
                                        --v3;
                                        continue;
                                    }
                                    else {
                                        int v4 = yzi0.f;
                                        if(this.lO() || !this.c) {
                                            if(this.f.d(view1) >= this.f.e() - v4) {
                                            label_21:
                                                if(yzb0.o != FlexboxLayoutManager.bl(view1)) {
                                                    --v3;
                                                    continue;
                                                }
                                                else if(v2 <= 0) {
                                                    v = v3;
                                                }
                                                else {
                                                    v2 += yzi0.i;
                                                    yzb0 = (yzb)this.d.get(v2);
                                                    v = v3;
                                                    --v3;
                                                    continue;
                                                }
                                            }
                                        }
                                        else if(this.f.a(view1) <= v4) {
                                            goto label_21;
                                        }
                                    }
                                    break;
                                }
                                this.bJ(uf0, v, v1);
                            }
                        }
                    }
                }
            }
            else if(yzi0.f >= 0) {
                int v5 = this.ar();
                if(v5 != 0) {
                    View view2 = this.az(0);
                    if(view2 != null) {
                        int[] arr_v1 = this.e.b;
                        int v6 = arr_v1[FlexboxLayoutManager.bl(view2)];
                        if(v6 != -1) {
                            yzb yzb1 = (yzb)this.d.get(v6);
                            int v7 = -1;
                            int v8 = 0;
                            while(true) {
                                if(v8 < v5) {
                                    View view3 = this.az(v8);
                                    if(view3 == null) {
                                        ++v8;
                                        continue;
                                    }
                                    else {
                                        int v9 = yzi0.f;
                                        if(this.lO() || !this.c) {
                                            if(this.f.a(view3) <= v9) {
                                            label_55:
                                                if(yzb1.p == FlexboxLayoutManager.bl(view3)) {
                                                    if(v6 >= this.d.size() - 1) {
                                                        break;
                                                    }
                                                    v6 += yzi0.i;
                                                    yzb1 = (yzb)this.d.get(v6);
                                                    v7 = v8;
                                                }
                                                ++v8;
                                                continue;
                                            }
                                        }
                                        else if(this.f.e() - this.f.d(view3) <= v9) {
                                            goto label_55;
                                        }
                                    }
                                }
                                v8 = v7;
                                break;
                            }
                            this.bJ(uf0, 0, v8);
                        }
                    }
                }
            }
        }
    }

    private final void bJ(uf uf0, int v, int v1) {
        while(v1 >= v) {
            this.aS(v1, uf0);
            --v1;
        }
    }

    private final void bK() {
        int v = this.lO() ? this.F : this.E;
        this.n.b = v == 0x80000000 || v == 0;
    }

    private final void bL(int v) {
        if(v < this.L()) {
            int v1 = this.ar();
            this.e.j(v1);
            this.e.k(v1);
            this.e.i(v1);
            if(v < this.e.b.length) {
                this.N = v;
                View view0 = this.bE();
                if(view0 != null) {
                    this.q = FlexboxLayoutManager.bl(view0);
                    if(!this.lO() && this.c) {
                        this.r = this.f.a(view0) + this.f.g();
                        return;
                    }
                    this.r = this.f.d(view0) - this.f.j();
                }
            }
        }
    }

    private final void bM(yzg yzg0, boolean z, boolean z1) {
        if(z1) {
            this.bK();
        }
        else {
            this.n.b = false;
        }
        if(!this.lO() && this.c) {
            yzi yzi0 = this.n;
            yzi0.a = yzg0.c - this.getPaddingRight();
        }
        else {
            yzi yzi1 = this.n;
            yzi1.a = this.f.f() - yzg0.c;
        }
        this.n.d = yzg0.a;
        yzi.a(this.n);
        this.n.i = 1;
        this.n.e = yzg0.c;
        this.n.f = 0x80000000;
        this.n.c = yzg0.b;
        if(z && this.d.size() > 1 && (yzg0.b >= 0 && yzg0.b < this.d.size() - 1)) {
            yzb yzb0 = (yzb)this.d.get(yzg0.b);
            ++this.n.c;
            this.n.d += yzb0.h;
        }
    }

    private final void bN(yzg yzg0, boolean z, boolean z1) {
        if(z1) {
            this.bK();
        }
        else {
            this.n.b = false;
        }
        if(!this.lO() && this.c) {
            yzi yzi0 = this.n;
            yzi0.a = this.M.getWidth() - yzg0.c - this.f.j();
        }
        else {
            yzi yzi1 = this.n;
            yzi1.a = yzg0.c - this.f.j();
        }
        this.n.d = yzg0.a;
        yzi.a(this.n);
        this.n.i = -1;
        this.n.e = yzg0.c;
        this.n.f = 0x80000000;
        this.n.c = yzg0.b;
        if(z && yzg0.b > 0) {
            int v = yzg0.b;
            if(this.d.size() > v) {
                yzb yzb0 = (yzb)this.d.get(v);
                --this.n.c;
                this.n.d -= yzb0.h;
            }
        }
    }

    private static boolean bO(int v, int v1, int v2) {
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

    private final boolean bP(View view0, int v, int v1, ty ty0) {
        return view0.isLayoutRequested() || !this.A || !FlexboxLayoutManager.bO(view0.getWidth(), v, ty0.width) || !FlexboxLayoutManager.bO(view0.getHeight(), v1, ty0.height);
    }

    private final View bQ(int v, int v1) {
        for(int v2 = v; v2 != v1; v2 += v10) {
            View view0 = this.az(v2);
            int v3 = this.getPaddingLeft();
            int v4 = this.getPaddingTop();
            int v5 = this.G - this.getPaddingRight();
            int v6 = this.H - this.getPaddingBottom();
            ty ty0 = (ty)view0.getLayoutParams();
            int v7 = FlexboxLayoutManager.bA(view0) - ty0.leftMargin;
            ty ty1 = (ty)view0.getLayoutParams();
            int v8 = FlexboxLayoutManager.bC(view0) - ty1.topMargin;
            ty ty2 = (ty)view0.getLayoutParams();
            int v9 = FlexboxLayoutManager.bB(view0) + ty2.rightMargin;
            ty ty3 = (ty)view0.getLayoutParams();
            boolean z = false;
            int v10 = 1;
            if(v8 >= v6 || FlexboxLayoutManager.bz(view0) + ty3.bottomMargin >= v4) {
                z = true;
            }
            if((v7 >= v5 || v9 >= v3) && z) {
                return view0;
            }
            if(v1 <= v) {
                v10 = -1;
            }
        }
        return null;
    }

    @Override  // tx
    public final void bs() {
        this.aO();
    }

    @Override  // tx
    public final void bt(int v) {
        this.bL(v);
    }

    @Override  // yza
    public final int c(int v, int v1, int v2) {
        return FlexboxLayoutManager.as(this.H, this.F, v1, v2, this.ae());
    }

    @Override  // tx
    public final int d(int v, uf uf0, un un0) {
        if(this.lO() && this.b != 0) {
            int v1 = this.ab(v);
            this.o.d += v1;
            this.g.n(-v1);
            return v1;
        }
        int v2 = this.aa(v, uf0, un0);
        this.K.clear();
        return v2;
    }

    @Override  // tx
    public final int e(int v, uf uf0, un un0) {
        if(!this.lO() && (this.b != 0 || this.lO())) {
            int v1 = this.ab(v);
            this.o.d += v1;
            this.g.n(-v1);
            return v1;
        }
        int v2 = this.aa(v, uf0, un0);
        this.K.clear();
        return v2;
    }

    @Override  // tx
    public final ty f() {
        return new FlexboxLayoutManager.LayoutParams();
    }

    @Override  // yza
    public final int g(int v, int v1, int v2) {
        return FlexboxLayoutManager.as(this.G, this.E, v1, v2, this.ad());
    }

    @Override  // tx
    public final ty h(Context context0, AttributeSet attributeSet0) {
        return new FlexboxLayoutManager.LayoutParams(context0, attributeSet0);
    }

    @Override  // yza
    public final int i(View view0) {
        return this.lO() ? FlexboxLayoutManager.bn(view0) + FlexboxLayoutManager.bh(view0) : FlexboxLayoutManager.bk(view0) + FlexboxLayoutManager.bm(view0);
    }

    @Override  // yza
    public final int j(View view0, int v, int v1) {
        return this.lO() ? FlexboxLayoutManager.bk(view0) + FlexboxLayoutManager.bm(view0) : FlexboxLayoutManager.bn(view0) + FlexboxLayoutManager.bh(view0);
    }

    @Override  // yza
    public final int k() {
        return this.a;
    }

    @Override  // yza
    public final int l() {
        return this.m.a();
    }

    @Override  // yza
    public final boolean lO() {
        return this.a == 0 || this.a == 1;
    }

    @Override  // yza
    public final int m() {
        return this.b;
    }

    @Override  // yza
    public final int n() {
        if(this.d.size() == 0) {
            return 0;
        }
        int v1 = this.d.size();
        int v2 = 0x80000000;
        for(int v = 0; v < v1; ++v) {
            v2 = Math.max(v2, ((yzb)this.d.get(v)).e);
        }
        return v2;
    }

    @Override  // tx
    public final void o(uf uf0, un un0) {
        int v25;
        int v24;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        int v23;
        int v22;
        int v13;
        boolean z1;
        boolean z;
        this.l = uf0;
        this.m = un0;
        int v = un0.a();
        if(v != 0) {
        label_6:
            int v1 = this.au();
            int v2 = this.a;
            switch(v2) {
                case 0: {
                    z = v1 == 1;
                    this.c = z;
                    this.k = false;
                    break;
                }
                case 1: {
                    z = v1 != 1;
                    this.c = z;
                    this.k = false;
                    break;
                }
                default: {
                    if(v2 == 2) {
                        z = v1 == 1;
                        this.c = z;
                        this.k = false;
                        break;
                    }
                    else {
                        this.c = v1 == 1;
                        this.k = true;
                    }
                }
            }
            this.bH();
            this.bG();
            yze yze0 = this.e;
            yze0.j(v);
            yze0.k(v);
            yze0.i(v);
            this.n.j = false;
            FlexboxLayoutManager.SavedState flexboxLayoutManager$SavedState0 = this.p;
            if(flexboxLayoutManager$SavedState0 != null && flexboxLayoutManager$SavedState0.b(v)) {
                this.q = flexboxLayoutManager$SavedState0.a;
            }
            yzg yzg0 = this.o;
            if(!yzg0.f || this.q != -1 || flexboxLayoutManager$SavedState0 != null) {
                yzg0.b();
                FlexboxLayoutManager.SavedState flexboxLayoutManager$SavedState1 = this.p;
                if(un0.g) {
                label_82:
                    if(this.ar() == 0) {
                    label_111:
                        yzg0.a();
                        yzg0.a = 0;
                        yzg0.b = 0;
                    }
                    else {
                        View view2 = yzg0.e ? this.ai(un0.a()) : this.ac(un0.a());
                        if(view2 == null) {
                            goto label_111;
                        }
                        else {
                            FlexboxLayoutManager flexboxLayoutManager0 = yzg0.h;
                            sw sw0 = flexboxLayoutManager0.b == 0 ? flexboxLayoutManager0.g : flexboxLayoutManager0.f;
                            if(flexboxLayoutManager0.lO() || !flexboxLayoutManager0.c) {
                                yzg0.c = yzg0.e ? sw0.a(view2) + sw0.o() : sw0.d(view2);
                            }
                            else if(yzg0.e) {
                                yzg0.c = sw0.d(view2) + sw0.o();
                            }
                            else {
                                yzg0.c = sw0.a(view2);
                            }
                            int v6 = FlexboxLayoutManager.bl(view2);
                            yzg0.a = v6;
                            yzg0.g = false;
                            yze yze1 = flexboxLayoutManager0.e;
                            if(v6 == -1) {
                                v6 = 0;
                            }
                            int v7 = yze1.b[v6];
                            if(v7 == -1) {
                                v7 = 0;
                            }
                            yzg0.b = v7;
                            int v8 = yzg0.b;
                            if(flexboxLayoutManager0.d.size() > v8) {
                                yzg0.a = ((yzb)flexboxLayoutManager0.d.get(v8)).o;
                            }
                        }
                    }
                }
                else {
                    int v3 = this.q;
                    if(v3 == -1) {
                        goto label_82;
                    }
                    else if(v3 >= 0 && v3 < un0.a()) {
                        yzg0.a = this.q;
                        yzg0.b = yze0.b[this.q];
                        if(this.p != null && this.p.b(un0.a())) {
                            yzg0.c = this.f.j() + flexboxLayoutManager$SavedState1.b;
                            yzg0.g = true;
                            yzg0.b = -1;
                        }
                        else {
                            int v4 = this.r;
                            if(v4 == 0x80000000) {
                                View view0 = this.S(this.q);
                                if(view0 == null) {
                                    if(this.ar() > 0) {
                                        View view1 = this.az(0);
                                        if(view1 != null) {
                                            int v5 = FlexboxLayoutManager.bl(view1);
                                            yzg0.e = this.q < v5;
                                        }
                                    }
                                    yzg0.a();
                                }
                                else if(this.f.b(view0) > this.f.k()) {
                                    yzg0.a();
                                }
                                else if(this.f.d(view0) - this.f.j() < 0) {
                                    yzg0.c = this.f.j();
                                    yzg0.e = false;
                                }
                                else if(this.f.f() - this.f.a(view0) < 0) {
                                    yzg0.c = this.f.f();
                                    yzg0.e = true;
                                }
                                else {
                                    yzg0.c = yzg0.e ? this.f.a(view0) + this.f.o() : this.f.d(view0);
                                }
                            }
                            else if(!this.lO() && this.c) {
                                yzg0.c = v4 - this.f.g();
                            }
                            else {
                                yzg0.c = this.f.j() + this.r;
                            }
                        }
                    }
                    else {
                        this.q = -1;
                        this.r = 0x80000000;
                        goto label_82;
                    }
                }
                yzg0.f = true;
            }
            this.aG(uf0);
            if(yzg0.e) {
                this.bN(yzg0, false, true);
            }
            else {
                this.bM(yzg0, false, true);
            }
            int v9 = View.MeasureSpec.makeMeasureSpec(this.G, this.E);
            int v10 = View.MeasureSpec.makeMeasureSpec(this.H, this.F);
            int v11 = this.G;
            int v12 = this.H;
            if(this.lO()) {
                z1 = this.I != 0x80000000 && this.I != v11;
                yzi yzi0 = this.n;
                v13 = yzi0.b ? this.L.getResources().getDisplayMetrics().heightPixels : yzi0.a;
            }
            else {
                z1 = this.J != 0x80000000 && this.J != v12;
                v13 = this.n.b ? this.L.getResources().getDisplayMetrics().widthPixels : this.n.a;
            }
            this.I = v11;
            this.J = v12;
            int v14 = this.N;
            if(v14 != -1) {
                v15 = v9;
                v16 = v10;
                v17 = v14;
            label_165:
                int v21 = v17 == -1 ? yzg0.a : Math.min(v17, yzg0.a);
                yzc yzc1 = this.O;
                yzc1.a();
                if(!this.lO()) {
                    v22 = v16;
                    v23 = v21;
                    if(this.d.size() > 0) {
                        yze0.e(this.d, v23);
                        yze0.b(yzc1, v22, v15, v13, v23, yzg0.a, this.d);
                        v22 = v22;
                        v15 = v15;
                        v23 = v23;
                    }
                    else {
                        yze0.i(v);
                        yze0.d(yzc1, v15, v22, v13, 0, this.d);
                    }
                }
                else if(this.d.size() > 0) {
                    yze0.e(this.d, v21);
                    v22 = v16;
                    yze0.b(yzc1, v15, v22, v13, v21, yzg0.a, this.d);
                    v23 = v21;
                }
                else {
                    v22 = v16;
                    v23 = v21;
                    yze0.i(v);
                    yze0.c(yzc1, v15, v22, v13, 0, this.d);
                }
                this.d = yzc1.a;
                yze0.h(v15, v22, v23);
                yze0.o(v23);
            }
            else if(this.q == -1 && !z1) {
                v15 = v9;
                v16 = v10;
                v17 = -1;
                goto label_165;
            }
            else if(!yzg0.e) {
                this.d.clear();
                yzc yzc0 = this.O;
                yzc0.a();
                if(this.lO()) {
                    v18 = v9;
                    yze0.b(yzc0, v18, v10, v13, 0, yzg0.a, this.d);
                    v19 = v10;
                }
                else {
                    yze0.b(yzc0, v10, v9, v13, 0, yzg0.a, this.d);
                    v19 = v10;
                    v18 = v9;
                }
                this.d = yzc0.a;
                yze0.g(v18, v19);
                yze0.n();
                int v20 = yze0.b[yzg0.a];
                yzg0.b = v20;
                this.n.c = v20;
            }
            this.U(uf0, un0, this.n);
            if(yzg0.e) {
                v24 = this.n.e;
                this.bM(yzg0, true, false);
                this.U(uf0, un0, this.n);
                v25 = this.n.e;
            }
            else {
                v25 = this.n.e;
                this.bN(yzg0, true, false);
                this.U(uf0, un0, this.n);
                v24 = this.n.e;
            }
            if(this.ar() > 0) {
                if(yzg0.e) {
                    this.Y(v24 + this.V(v25, uf0, un0, true), uf0, un0, false);
                    return;
                }
                this.V(v25 + this.Y(v24, uf0, un0, true), uf0, un0, false);
            }
        }
        else if(!un0.g) {
            v = 0;
            goto label_6;
        }
    }

    @Override  // tx
    public final void p(un un0) {
        this.p = null;
        this.q = -1;
        this.r = 0x80000000;
        this.N = -1;
        this.o.b();
        this.K.clear();
    }

    @Override  // yza
    public final int q() {
        return this.j;
    }

    @Override  // yza
    public final int r() {
        int v = this.d.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((yzb)this.d.get(v1)).g;
        }
        return v2;
    }

    @Override  // yza
    public final View s(int v) {
        View view0 = (View)this.K.get(v);
        return view0 == null ? this.l.c(v) : view0;
    }

    @Override  // tx
    public final boolean t(ty ty0) {
        return ty0 instanceof FlexboxLayoutManager.LayoutParams;
    }

    @Override  // yza
    public final View u(int v) {
        return this.s(v);
    }

    @Override  // yza
    public final List v() {
        return this.d;
    }

    @Override  // yza
    public final void w(View view0, int v, int v1, yzb yzb0) {
        this.aF(view0, FlexboxLayoutManager.h);
        if(this.lO()) {
            int v2 = FlexboxLayoutManager.bk(view0) + FlexboxLayoutManager.bm(view0);
            yzb0.e += v2;
            yzb0.f += v2;
            return;
        }
        int v3 = FlexboxLayoutManager.bn(view0) + FlexboxLayoutManager.bh(view0);
        yzb0.e += v3;
        yzb0.f += v3;
    }

    @Override  // tx
    public final void x(int v, int v1) {
        this.bL(v);
    }

    @Override  // yza
    public final void y(yzb yzb0) {
    }

    @Override  // tx
    public final void z(int v, int v1) {
        this.bL(Math.min(v, v1));
    }
}

