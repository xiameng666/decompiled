import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

public final class xr extends tt implements tz {
    private xn A;
    private final ub B;
    final List a;
    uq b;
    float c;
    float d;
    float e;
    float f;
    public float g;
    public float h;
    int i;
    final xm j;
    int k;
    final List l;
    RecyclerView m;
    final Runnable n;
    VelocityTracker o;
    View p;
    GestureDetector q;
    public Rect r;
    public long s;
    private final float[] t;
    private float u;
    private float v;
    private int w;
    private int x;
    private List y;
    private List z;

    public xr(xm xm0) {
        this.a = new ArrayList();
        this.t = new float[2];
        this.b = null;
        this.i = -1;
        this.w = 0;
        this.l = new ArrayList();
        this.n = new xg(this);
        this.p = null;
        this.B = new xh(this);
        this.j = xm0;
    }

    @Override  // tt
    public final void a(Rect rect0, View view0, RecyclerView recyclerView0, un un0) {
        rect0.setEmpty();
    }

    @Override  // tt
    public final void b(Canvas canvas0, RecyclerView recyclerView0, un un0) {
        float f2;
        float f1;
        if(this.b == null) {
            f2 = 0.0f;
            f1 = 0.0f;
        }
        else {
            this.n(this.t);
            float f = this.t[0];
            f1 = this.t[1];
            f2 = f;
        }
        xm xm0 = this.j;
        uq uq0 = this.b;
        List list0 = this.l;
        int v1 = list0.size();
        for(int v = 0; v < v1; ++v) {
            xp xp0 = (xp)list0.get(v);
            float f3 = xp0.d;
            float f4 = xp0.f;
            xp0.l = f3 == f4 ? xp0.h.a.getTranslationX() : f3 + xp0.p * (f4 - f3);
            float f5 = xp0.e;
            float f6 = xp0.g;
            xp0.m = f5 == f6 ? xp0.h.a.getTranslationY() : f5 + xp0.p * (f6 - f5);
            int v2 = canvas0.save();
            xm0.k(recyclerView0, xp0.h, xp0.l, xp0.m, false);
            canvas0.restoreToCount(v2);
        }
        if(uq0 != null) {
            int v3 = canvas0.save();
            xm0.k(recyclerView0, uq0, f2, f1, true);
            canvas0.restoreToCount(v3);
        }
    }

    @Override  // tz
    public final void c(View view0) {
    }

    @Override  // tz
    public final void d(View view0) {
        this.k(view0);
        uq uq0 = this.m.o(view0);
        if(uq0 != null) {
            if(this.b != null && uq0 == this.b) {
                this.l(null, 0);
                return;
            }
            this.h(uq0, false);
            if(this.a.remove(uq0.a)) {
                this.j.e(this.m, uq0);
            }
        }
    }

    final View e(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        uq uq0 = this.b;
        if(uq0 != null) {
            View view0 = uq0.a;
            if(xr.p(view0, f, f1, this.g + this.e, this.h + this.f)) {
                return view0;
            }
        }
        List list0 = this.l;
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            xp xp0 = (xp)list0.get(v);
            View view1 = xp0.h.a;
            if(xr.p(view1, f, f1, xp0.l, xp0.m)) {
                return view1;
            }
        }
        return this.m.r(f, f1);
    }

    public final void f(RecyclerView recyclerView0) {
        RecyclerView recyclerView1 = this.m;
        if(recyclerView1 != recyclerView0) {
            if(recyclerView1 != null) {
                recyclerView1.ah(this);
                this.m.ai(this.B);
                List list0 = this.m.w;
                if(list0 != null) {
                    list0.remove(this);
                }
                List list1 = this.l;
                int v = list1.size();
                while(true) {
                    --v;
                    if(v < 0) {
                        break;
                    }
                    xp xp0 = (xp)list1.get(0);
                    xp0.a();
                    this.j.e(this.m, xp0.h);
                }
                list1.clear();
                this.p = null;
                this.o();
                xn xn0 = this.A;
                if(xn0 != null) {
                    xn0.a = false;
                    this.A = null;
                }
                if(this.q != null) {
                    this.q = null;
                }
            }
            this.m = recyclerView0;
            if(recyclerView0 != null) {
                Resources resources0 = recyclerView0.getResources();
                this.u = resources0.getDimension(0x7F0708CF);  // dimen:item_touch_helper_swipe_escape_velocity
                this.v = resources0.getDimension(0x7F0708CE);  // dimen:item_touch_helper_swipe_escape_max_velocity
                this.x = ViewConfiguration.get(this.m.getContext()).getScaledTouchSlop();
                this.m.A(this);
                this.m.C(this.B);
                this.m.B(this);
                this.A = new xn(this);
                this.q = new GestureDetector(this.m.getContext(), this.A);
            }
        }
    }

    final void g(int v, MotionEvent motionEvent0, int v1) {
        if(this.b == null && v == 2 && this.w != 2) {
            xm xm0 = this.j;
            if(xm0.g()) {
                RecyclerView recyclerView0 = this.m;
                if(recyclerView0.E != 1) {
                    tx tx0 = recyclerView0.h();
                    int v2 = this.i;
                    uq uq0 = null;
                    if(v2 != -1) {
                        int v3 = motionEvent0.findPointerIndex(v2);
                        float f = Math.abs(motionEvent0.getX(v3) - this.c);
                        float f1 = Math.abs(motionEvent0.getY(v3) - this.d);
                        float f2 = (float)this.x;
                        if((f >= f2 || f1 >= f2) && (f <= f1 || !tx0.ad()) && (f1 <= f || !tx0.ae())) {
                            View view0 = this.e(motionEvent0);
                            if(view0 != null) {
                                uq0 = this.m.o(view0);
                            }
                        }
                    }
                    if(uq0 != null) {
                        int v4 = xm0.c(this.m, uq0) >> 8;
                        if((v4 & 0xFF) != 0) {
                            float f3 = motionEvent0.getX(v1);
                            float f4 = motionEvent0.getY(v1);
                            float f5 = f3 - this.c;
                            float f6 = f4 - this.d;
                            float f7 = Math.abs(f5);
                            float f8 = Math.abs(f6);
                            float f9 = (float)this.x;
                            if(f7 >= f9 || f8 >= f9) {
                                if(Float.compare(f7, f8) <= 0) {
                                    if((f6 >= 0.0f || (v4 & 1) != 0) && (f6 <= 0.0f || (v4 & 2) != 0)) {
                                        this.f = 0.0f;
                                        this.e = 0.0f;
                                        this.i = motionEvent0.getPointerId(0);
                                        this.l(uq0, 1);
                                    }
                                }
                                else if((f5 >= 0.0f || (v4 & 4) != 0) && (f5 <= 0.0f || (v4 & 8) != 0)) {
                                    this.f = 0.0f;
                                    this.e = 0.0f;
                                    this.i = motionEvent0.getPointerId(0);
                                    this.l(uq0, 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void h(uq uq0, boolean z) {
        List list0 = this.l;
        int v = list0.size();
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            xp xp0 = (xp)list0.get(v);
            if(xp0.h == uq0) {
                xp0.n |= (int)z;
                if(!xp0.o) {
                    xp0.a();
                }
                list0.remove(v);
                return;
            }
        }
    }

    final void i(uq uq0) {
        int v17;
        int v14;
        int v13;
        int v11;
        if(!this.m.isLayoutRequested() && this.w == 2) {
            View view0 = uq0.a;
            int v = (int)(this.h + this.f);
            int v1 = (int)(this.g + this.e);
            if(Float.compare(Math.abs(v - view0.getTop()), ((float)view0.getHeight()) * 0.5f) >= 0 || ((float)Math.abs(v1 - view0.getLeft())) >= ((float)view0.getWidth()) * 0.5f) {
                List list0 = this.y;
                if(list0 == null) {
                    this.y = new ArrayList();
                    this.z = new ArrayList();
                }
                else {
                    list0.clear();
                    this.z.clear();
                }
                int v2 = Math.round(this.g + this.e);
                int v3 = Math.round(this.h + this.f);
                int v4 = view0.getWidth() + v2;
                int v5 = view0.getHeight() + v3;
                int v6 = (v2 + v4) / 2;
                tx tx0 = this.m.h();
                int v7 = tx0.ar();
                int v8 = 0;
                while(v8 < v7) {
                    View view1 = tx0.az(v8);
                    if(view1 != view0 && (view1.getBottom() >= v3 && view1.getTop() <= v5 && view1.getRight() >= v2 && view1.getLeft() <= v4)) {
                        uq uq1 = this.m.o(view1);
                        int v9 = Math.abs(v6 - (view1.getLeft() + view1.getRight()) / 2);
                        int v10 = Math.abs((v3 + v5) / 2 - (view1.getTop() + view1.getBottom()) / 2);
                        v11 = v1;
                        int v12 = this.y.size();
                        v13 = v;
                        v14 = v2;
                        int v15 = 0;
                        int v16 = 0;
                        while(true) {
                            v17 = v9 * v9 + v10 * v10;
                            if(v15 >= v12 || v17 <= ((int)(((Integer)this.z.get(v15))))) {
                                break;
                            }
                            ++v16;
                            ++v15;
                            v12 = v12;
                        }
                        this.y.add(v16, uq1);
                        this.z.add(v16, Integer.valueOf(v17));
                    }
                    else {
                        v11 = v1;
                        v13 = v;
                        v14 = v2;
                    }
                    ++v8;
                    v1 = v11;
                    v = v13;
                    v2 = v14;
                }
                List list1 = this.y;
                if(list1.size() != 0) {
                    int v18 = v1 + view0.getWidth();
                    int v19 = v + view0.getHeight();
                    int v20 = v1 - view0.getLeft();
                    int v21 = v - view0.getTop();
                    int v22 = list1.size();
                    uq uq2 = null;
                    int v23 = -1;
                    for(int v24 = 0; v24 < v22; ++v24) {
                        uq uq3 = (uq)list1.get(v24);
                        if(v20 > 0) {
                            int v25 = uq3.a.getRight() - v18;
                            if(v25 < 0 && uq3.a.getRight() > view0.getRight()) {
                                int v26 = Math.abs(v25);
                                if(v26 > v23) {
                                    v23 = v26;
                                    uq2 = uq3;
                                }
                            }
                        }
                        if(v20 < 0) {
                            int v27 = uq3.a.getLeft() - v1;
                            if(v27 > 0 && uq3.a.getLeft() < view0.getLeft()) {
                                int v28 = Math.abs(v27);
                                if(v28 > v23) {
                                    v23 = v28;
                                    uq2 = uq3;
                                }
                            }
                        }
                        if(v21 < 0) {
                            int v29 = uq3.a.getTop() - v;
                            if(v29 > 0 && uq3.a.getTop() < view0.getTop()) {
                                int v30 = Math.abs(v29);
                                if(v30 > v23) {
                                    v23 = v30;
                                    uq2 = uq3;
                                }
                            }
                        }
                        if(v21 > 0) {
                            int v31 = uq3.a.getBottom() - v19;
                            if(v31 < 0 && uq3.a.getBottom() > view0.getBottom()) {
                                int v32 = Math.abs(v31);
                                if(v32 > v23) {
                                    v23 = v32;
                                    uq2 = uq3;
                                }
                            }
                        }
                    }
                    if(uq2 == null) {
                        this.y.clear();
                        this.z.clear();
                        return;
                    }
                    int v33 = uq2.fp();
                    uq0.fp();
                    if(this.j.m(uq0, uq2)) {
                        RecyclerView recyclerView0 = this.m;
                        tx tx1 = recyclerView0.h();
                        if((tx1 instanceof LinearLayoutManager)) {
                            View view2 = uq2.a;
                            ((LinearLayoutManager)tx1).T("Cannot drop a view during a scroll or layout calculation");
                            ((LinearLayoutManager)tx1).V();
                            ((LinearLayoutManager)tx1).Y();
                            int v34 = LinearLayoutManager.bl(view0);
                            int v35 = LinearLayoutManager.bl(view2);
                            int v36 = v34 >= v35 ? -1 : 1;
                            if(((LinearLayoutManager)tx1).m) {
                                if(v36 == 1) {
                                    ((LinearLayoutManager)tx1).aa(v35, ((LinearLayoutManager)tx1).l.f() - (((LinearLayoutManager)tx1).l.d(view2) + ((LinearLayoutManager)tx1).l.b(view0)));
                                    return;
                                }
                                ((LinearLayoutManager)tx1).aa(v35, ((LinearLayoutManager)tx1).l.f() - ((LinearLayoutManager)tx1).l.a(view2));
                                return;
                            }
                            if(v36 == -1) {
                                ((LinearLayoutManager)tx1).aa(v35, ((LinearLayoutManager)tx1).l.d(view2));
                                return;
                            }
                            ((LinearLayoutManager)tx1).aa(v35, ((LinearLayoutManager)tx1).l.a(view2) - ((LinearLayoutManager)tx1).l.b(view0));
                            return;
                        }
                        if(tx1.ad()) {
                            View view3 = uq2.a;
                            if(tx.bA(view3) <= recyclerView0.getPaddingLeft()) {
                                recyclerView0.al(v33);
                            }
                            if(tx.bB(view3) >= recyclerView0.getWidth() - recyclerView0.getPaddingRight()) {
                                recyclerView0.al(v33);
                            }
                        }
                        if(tx1.ae()) {
                            View view4 = uq2.a;
                            if(tx.bC(view4) <= recyclerView0.getPaddingTop()) {
                                recyclerView0.al(v33);
                            }
                            if(tx.bz(view4) >= recyclerView0.getHeight() - recyclerView0.getPaddingBottom()) {
                                recyclerView0.al(v33);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // tt
    public final void j(Canvas canvas0, RecyclerView recyclerView0) {
        float f;
        if(this.b == null) {
            f = 0.0f;
        }
        else {
            this.n(this.t);
            f = this.t[1];
        }
        xm xm0 = this.j;
        uq uq0 = this.b;
        List list0 = this.l;
        int v = this.w;
        int v1 = list0.size();
        boolean z = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            xp xp0 = (xp)list0.get(v2);
            int v3 = canvas0.save();
            xm0.l(xp0.h, xp0.m, xp0.i, false);
            canvas0.restoreToCount(v3);
        }
        if(uq0 != null) {
            int v4 = canvas0.save();
            xm0.l(uq0, f, v, true);
            canvas0.restoreToCount(v4);
        }
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            xp xp1 = (xp)list0.get(v1);
            if(!xp1.o) {
                z = true;
            }
            else if(!xp1.k) {
                list0.remove(v1);
            }
        }
        if(z) {
            recyclerView0.invalidate();
        }
    }

    final void k(View view0) {
        if(view0 == this.p) {
            this.p = null;
        }
    }

    final void l(uq uq0, int v) {
        boolean z1;
        float f1;
        float f;
        int v7;
        int v6;
        if(uq0 == this.b && v == this.w) {
            return;
        }
        this.s = 0x8000000000000000L;
        int v1 = this.w;
        this.h(uq0, true);
        this.w = v;
        if(v == 2) {
            if(uq0 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.p = uq0.a;
        }
        uq uq1 = this.b;
        boolean z = false;
        if(uq1 == null) {
            z1 = false;
        }
        else {
            View view0 = uq1.a;
            if(view0.getParent() == null) {
                z1 = false;
                this.k(view0);
                this.j.e(this.m, uq1);
            }
            else {
                if(v1 == 2) {
                    v7 = 0;
                }
                else if(this.w != 2) {
                    int v2 = this.j.o(uq1);
                    int v3 = this.m.getLayoutDirection();
                    int v4 = this.j.a(v2, v3) >> 8 & 0xFF;
                    if(v4 == 0) {
                        v7 = 0;
                    }
                    else {
                        int v5 = v2 >> 8 & 0xFF;
                        if((Math.abs(this.e) > Math.abs(this.f))) {
                            v6 = this.q(v4);
                            if(v6 > 0) {
                                if((v5 & v6) == 0) {
                                    v6 = xm.b(v6, this.m.getLayoutDirection());
                                }
                                v7 = v6;
                            }
                            else {
                                v6 = this.r(v4);
                                v7 = v6 > 0 ? v6 : 0;
                            }
                        }
                        else {
                            v6 = this.r(v4);
                            if(v6 <= 0) {
                                v6 = this.q(v4);
                                if(v6 > 0) {
                                    if((v5 & v6) == 0) {
                                        v6 = xm.b(v6, this.m.getLayoutDirection());
                                    }
                                    v7 = v6;
                                }
                                else {
                                    v7 = 0;
                                }
                            }
                            else {
                                v7 = v6;
                            }
                        }
                    }
                }
                else {
                    v7 = 0;
                }
                this.o();
                int v8 = 4;
                switch(v7) {
                    case 1: 
                    case 2: {
                        f1 = Math.signum(this.f) * ((float)this.m.getHeight());
                        f = 0.0f;
                        break;
                    }
                    case 4: 
                    case 8: {
                        f = Math.signum(this.e) * ((float)this.m.getWidth());
                        f1 = 0.0f;
                        break;
                    }
                    default: {
                        f = v7 != 16 && v7 != 0x20 ? 0.0f : Math.signum(this.e) * ((float)this.m.getWidth());
                        f1 = 0.0f;
                    }
                }
                if(v1 == 2) {
                    v8 = 8;
                }
                else if(v7 > 0) {
                    v8 = 2;
                }
                this.n(this.t);
                z1 = false;
                xi xi0 = new xi(this, uq1, v1, this.t[0], this.t[1], f, f1, v7, uq1);
                tr tr0 = this.m.D;
                long v9 = 0xFAL;
                if(tr0 != null) {
                    if(v8 != 8) {
                        v9 = tr0.i;
                    }
                }
                else if(v8 == 8) {
                    v9 = 200L;
                }
                xi0.j.setDuration(v9);
                this.l.add(xi0);
                xi0.h.n(false);
                xi0.j.start();
                z = true;
            }
            this.b = null;
        }
        if(uq0 != null) {
            this.k = (this.j.c(this.m, uq0) & (1 << v * 8 + 8) - 1) >> this.w * 8;
            this.g = (float)uq0.a.getLeft();
            this.h = (float)uq0.a.getTop();
            this.b = uq0;
            if(v == 2) {
                uq0.a.performHapticFeedback(0);
            }
        }
        ViewParent viewParent0 = this.m.getParent();
        if(viewParent0 != null) {
            if(this.b != null) {
                z1 = true;
            }
            viewParent0.requestDisallowInterceptTouchEvent(z1);
        }
        if(!z) {
            this.m.h().aV();
        }
        this.j.f(this.b, this.w);
        this.m.invalidate();
    }

    final void m(MotionEvent motionEvent0, int v, int v1) {
        float f = motionEvent0.getX(v1);
        float f1 = motionEvent0.getY(v1);
        float f2 = f - this.c;
        this.e = f2;
        this.f = f1 - this.d;
        if((v & 4) == 0) {
            f2 = Math.max(0.0f, f2);
            this.e = f2;
        }
        if((v & 8) == 0) {
            this.e = Math.min(0.0f, f2);
        }
        if((v & 1) == 0) {
            this.f = Math.max(0.0f, this.f);
        }
        if((v & 2) == 0) {
            this.f = Math.min(0.0f, this.f);
        }
    }

    private final void n(float[] arr_f) {
        arr_f[0] = (this.k & 12) == 0 ? this.b.a.getTranslationX() : this.g + this.e - ((float)this.b.a.getLeft());
        if((this.k & 3) != 0) {
            arr_f[1] = this.h + this.f - ((float)this.b.a.getTop());
            return;
        }
        arr_f[1] = this.b.a.getTranslationY();
    }

    private final void o() {
        VelocityTracker velocityTracker0 = this.o;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.o = null;
        }
    }

    private static boolean p(View view0, float f, float f1, float f2, float f3) {
        return f >= f2 && f <= f2 + ((float)view0.getWidth()) && f1 >= f3 && f1 <= f3 + ((float)view0.getHeight());
    }

    private final int q(int v) {
        int v1 = 8;
        if((v & 12) != 0) {
            int v2 = Float.compare(this.e, 0.0f) <= 0 ? 4 : 8;
            VelocityTracker velocityTracker0 = this.o;
            if(velocityTracker0 != null && this.i >= 0) {
                velocityTracker0.computeCurrentVelocity(1000, this.v);
                float f = this.o.getXVelocity(this.i);
                float f1 = this.o.getYVelocity(this.i);
                if(f <= 0.0f) {
                    v1 = 4;
                }
                float f2 = Math.abs(f);
                if((v1 & v) != 0 && v2 == v1 && (f2 >= this.u)) {
                    if(f2 <= Math.abs(f1)) {
                        goto label_15;
                    }
                    return v1;
                }
            }
        label_15:
            float f3 = (float)this.m.getWidth();
            return (v & v2) == 0 || !(Math.abs(this.e) > f3 * 0.5f) ? 0 : v2;
        }
        return 0;
    }

    private final int r(int v) {
        int v1 = 2;
        if((v & 3) != 0) {
            int v2 = Float.compare(this.f, 0.0f) <= 0 ? 1 : 2;
            VelocityTracker velocityTracker0 = this.o;
            if(velocityTracker0 != null && this.i >= 0) {
                velocityTracker0.computeCurrentVelocity(1000, this.v);
                float f = this.o.getXVelocity(this.i);
                float f1 = this.o.getYVelocity(this.i);
                if(f1 <= 0.0f) {
                    v1 = 1;
                }
                float f2 = Math.abs(f1);
                if((v1 & v) != 0 && v1 == v2 && (f2 >= this.u)) {
                    if(f2 <= Math.abs(f)) {
                        goto label_15;
                    }
                    return v1;
                }
            }
        label_15:
            float f3 = (float)this.m.getHeight();
            return (v & v2) == 0 || !(Math.abs(this.f) > f3 * 0.5f) ? 0 : v2;
        }
        return 0;
    }
}

