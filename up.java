import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

public final class up implements Runnable {
    public OverScroller a;
    Interpolator b;
    final RecyclerView c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public up(RecyclerView recyclerView0) {
        this.c = recyclerView0;
        super();
        this.b = RecyclerView.b;
        this.f = false;
        this.g = false;
        this.a = new OverScroller(recyclerView0.getContext(), RecyclerView.b);
    }

    public final void a(int v, int v1) {
        RecyclerView recyclerView0 = this.c;
        recyclerView0.ar(2);
        this.e = 0;
        this.d = 0;
        Interpolator interpolator0 = RecyclerView.b;
        if(this.b != interpolator0) {
            this.b = interpolator0;
            this.a = new OverScroller(recyclerView0.getContext(), interpolator0);
        }
        this.a.fling(0, 0, v, v1, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
        this.b();
    }

    final void b() {
        if(this.f) {
            this.g = true;
            return;
        }
        this.e();
    }

    public final void c(int v, int v1, int v2, Interpolator interpolator0) {
        if(v2 == 0x80000000) {
            int v3 = Math.abs(v);
            int v4 = Math.abs(v1);
            int v5 = v3 <= v4 ? 0 : 1;
            int v6 = v5 == 0 ? this.c.getHeight() : this.c.getWidth();
            if(1 != v5) {
                v3 = v4;
            }
            v2 = Math.min(((int)((((float)v3) / ((float)v6) + 1.0f) * 300.0f)), 2000);
        }
        if(interpolator0 == null) {
            interpolator0 = RecyclerView.b;
        }
        if(this.b != interpolator0) {
            this.b = interpolator0;
            this.a = new OverScroller(this.c.getContext(), interpolator0);
        }
        this.e = 0;
        this.d = 0;
        this.c.ar(2);
        this.a.startScroll(0, 0, v, v1, v2);
        this.b();
    }

    public final void d() {
        this.c.removeCallbacks(this);
        this.a.abortAnimation();
    }

    private final void e() {
        this.c.removeCallbacks(this);
        this.c.postOnAnimation(this);
    }

    @Override
    public final void run() {
        int v20;
        boolean z;
        int v14;
        int v10;
        int v9;
        int v7;
        RecyclerView recyclerView0 = this.c;
        if(recyclerView0.n == null) {
            this.d();
            return;
        }
        this.g = false;
        this.f = true;
        recyclerView0.J();
        OverScroller overScroller0 = this.a;
        if(overScroller0.computeScrollOffset()) {
            int v = overScroller0.getCurrX();
            int v1 = overScroller0.getCurrY();
            int v2 = v - this.d;
            int v3 = v1 - this.e;
            this.d = v;
            this.e = v1;
            int v4 = RecyclerView.aE(v2, recyclerView0.z, recyclerView0.B, recyclerView0.getWidth());
            int v5 = RecyclerView.aE(v3, recyclerView0.A, recyclerView0.C, recyclerView0.getHeight());
            int[] arr_v = recyclerView0.T;
            arr_v[0] = 0;
            arr_v[1] = 0;
            if(recyclerView0.ay(v4, v5, arr_v, null, 1)) {
                v4 -= arr_v[0];
                v5 -= arr_v[1];
            }
            if(recyclerView0.getOverScrollMode() != 2) {
                recyclerView0.I(v4, v5);
            }
            if(recyclerView0.m == null) {
                v9 = v5;
                v10 = 0;
                v7 = 0;
            }
            else {
                arr_v[0] = 0;
                arr_v[1] = 0;
                recyclerView0.ak(v4, v5, arr_v);
                int v6 = arr_v[0];
                v7 = arr_v[1];
                v4 -= v6;
                um um0 = recyclerView0.n.w;
                if(um0 != null && !um0.e && um0.f) {
                    int v8 = recyclerView0.N.a();
                    if(v8 == 0) {
                        um0.g();
                    }
                    else {
                        if(um0.b >= v8) {
                            um0.b = v8 - 1;
                        }
                        um0.f(v6, v7);
                    }
                }
                v9 = v5 - v7;
                v10 = v6;
            }
            if(!recyclerView0.p.isEmpty()) {
                recyclerView0.invalidate();
            }
            arr_v[0] = 0;
            arr_v[1] = 0;
            int v11 = v10;
            recyclerView0.N(v11, v7, v4, v9, null, 1, arr_v);
            int v12 = v4 - arr_v[0];
            int v13 = v9 - arr_v[1];
            if(v11 != 0) {
                recyclerView0.O(v11, v7);
                v14 = v7;
            }
            else if(v7 != 0) {
                v11 = 0;
                recyclerView0.O(0, v7);
                v14 = v7;
            }
            else {
                v11 = 0;
                v14 = 0;
            }
            if(!recyclerView0.awakenScrollBars()) {
                recyclerView0.invalidate();
            }
            int v15 = overScroller0.getCurrX();
            int v16 = overScroller0.getFinalX();
            int v17 = overScroller0.getCurrY();
            int v18 = overScroller0.getFinalY();
            if(overScroller0.isFinished()) {
                z = true;
            }
            else if(v15 != v16 && v12 == 0) {
                z = false;
                v12 = 0;
            }
            else if(v17 != v18 && v13 == 0) {
                z = false;
                v13 = 0;
            }
            else {
                z = true;
            }
            um um1 = recyclerView0.n.w;
            if((um1 == null || !um1.e) && z) {
                if(recyclerView0.getOverScrollMode() != 2) {
                    int v19 = (int)overScroller0.getCurrVelocity();
                    if(v12 < 0) {
                        v20 = -v19;
                    }
                    else {
                        v20 = v12 <= 0 ? 0 : v19;
                    }
                    if(v13 < 0) {
                        v19 = -v19;
                    }
                    else if(v13 <= 0) {
                        v19 = 0;
                    }
                    if(v20 < 0) {
                        recyclerView0.Q();
                        if(recyclerView0.z.isFinished()) {
                            recyclerView0.z.onAbsorb(-v20);
                        }
                    }
                    else if(v20 > 0) {
                        recyclerView0.R();
                        if(recyclerView0.B.isFinished()) {
                            recyclerView0.B.onAbsorb(v20);
                        }
                    }
                    if(v19 < 0) {
                        recyclerView0.S();
                        if(recyclerView0.A.isFinished()) {
                            recyclerView0.A.onAbsorb(-v19);
                        }
                    }
                    else if(v19 > 0) {
                        recyclerView0.P();
                        if(recyclerView0.C.isFinished()) {
                            recyclerView0.C.onAbsorb(v19);
                        }
                    }
                    if(v20 != 0 || v19 != 0) {
                        recyclerView0.postInvalidateOnAnimation();
                    }
                }
                recyclerView0.M.b();
            }
            else {
                this.b();
                rx rx0 = recyclerView0.L;
                if(rx0 != null) {
                    rx0.a(recyclerView0, v11, v14);
                }
            }
            if(Build.VERSION.SDK_INT >= 35) {
                tn.a(recyclerView0, Math.abs(overScroller0.getCurrVelocity()));
            }
        }
        um um2 = recyclerView0.n.w;
        if(um2 != null && um2.e) {
            um2.f(0, 0);
        }
        this.f = false;
        if(this.g) {
            this.e();
            return;
        }
        recyclerView0.ar(0);
        recyclerView0.av(1);
    }
}

