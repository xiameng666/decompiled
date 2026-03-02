import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class um {
    private final uk a;
    public int b;
    public RecyclerView c;
    public tx d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    protected int l;
    protected int m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public um() {
        this.b = -1;
        this.a = new uk();
    }

    public um(Context context0) {
        this.b = -1;
        this.a = new uk();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.o = false;
        this.l = 0;
        this.m = 0;
        this.n = context0.getResources().getDisplayMetrics();
    }

    protected float a(DisplayMetrics displayMetrics0) {
        return 25.0f / ((float)displayMetrics0.densityDpi);
    }

    protected int b(int v) {
        float f = (float)Math.abs(v);
        if(!this.o) {
            this.p = this.a(this.n);
            this.o = true;
        }
        return (int)Math.ceil(f * this.p);
    }

    protected void c(View view0, uk uk0) {
        int v = this.h(view0, this.k());
        int v1 = this.i(view0, this.l());
        int v2 = this.j(((int)Math.sqrt(v * v + v1 * v1)));
        if(v2 > 0) {
            uk0.b(-v, -v1, v2, this.j);
        }
    }

    public final int d(View view0) {
        return this.c.d(view0);
    }

    public PointF e(int v) {
        tx tx0 = this.d;
        if((tx0 instanceof ul)) {
            return ((ul)tx0).O(v);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ul.class.getCanonicalName());
        return null;
    }

    final void f(int v, int v1) {
        RecyclerView recyclerView0 = this.c;
        if(this.b == -1 || recyclerView0 == null) {
            this.g();
        }
        if(this.e && this.g == null && this.d != null) {
            PointF pointF0 = this.e(this.b);
            if(pointF0 != null && ((pointF0.x != 0.0f) || pointF0.y != 0.0f)) {
                recyclerView0.ak(((int)Math.signum(pointF0.x)), ((int)Math.signum(pointF0.y)), null);
            }
        }
        this.e = false;
        View view0 = this.g;
        if(view0 != null) {
            if(this.d(view0) == this.b) {
                this.c(this.g, this.a);
                this.a.a(recyclerView0);
                this.g();
            }
            else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if(this.f) {
            uk uk0 = this.a;
            if(this.c.n.ar() == 0) {
                this.g();
            }
            else {
                int v2 = um.n(this.l, v);
                this.l = v2;
                int v3 = um.n(this.m, v1);
                this.m = v3;
                if(v2 == 0 && v3 == 0) {
                    PointF pointF1 = this.e(this.b);
                    if(pointF1 == null) {
                        uk0.a = this.b;
                        this.g();
                    }
                    else if(pointF1.x == 0.0f && pointF1.y == 0.0f) {
                        uk0.a = this.b;
                        this.g();
                    }
                    else {
                        float f = (float)Math.sqrt(pointF1.x * pointF1.x + pointF1.y * pointF1.y);
                        pointF1.x /= f;
                        pointF1.y /= f;
                        this.k = pointF1;
                        this.l = (int)(pointF1.x * 10000.0f);
                        this.m = (int)(pointF1.y * 10000.0f);
                        int v4 = this.b(10000);
                        uk0.b(((int)(((float)this.l) * 1.2f)), ((int)(((float)this.m) * 1.2f)), ((int)(((float)v4) * 1.2f)), this.i);
                    }
                }
            }
            int v5 = uk0.a;
            uk0.a(recyclerView0);
            if(v5 >= 0 && this.f) {
                this.e = true;
                recyclerView0.K.b();
            }
        }
    }

    public final void g() {
        if(!this.f) {
            return;
        }
        this.f = false;
        this.m = 0;
        this.l = 0;
        this.k = null;
        this.c.N.a = -1;
        this.g = null;
        this.b = -1;
        this.e = false;
        tx tx0 = this.d;
        if(tx0.w == this) {
            tx0.w = null;
        }
        this.d = null;
        this.c = null;
    }

    public int h(View view0, int v) {
        tx tx0 = this.d;
        if(tx0 != null && tx0.ad()) {
            ty ty0 = (ty)view0.getLayoutParams();
            return um.m(tx.bA(view0) - ty0.leftMargin, tx.bB(view0) + ty0.rightMargin, tx0.getPaddingLeft(), tx0.G - tx0.getPaddingRight(), v);
        }
        return 0;
    }

    public int i(View view0, int v) {
        tx tx0 = this.d;
        if(tx0 != null && tx0.ae()) {
            ty ty0 = (ty)view0.getLayoutParams();
            return um.m(tx.bC(view0) - ty0.topMargin, tx.bz(view0) + ty0.bottomMargin, tx0.getPaddingTop(), tx0.H - tx0.getPaddingBottom(), v);
        }
        return 0;
    }

    protected final int j(int v) {
        return (int)Math.ceil(((double)this.b(v)) / 0.3356);
    }

    protected int k() {
        PointF pointF0 = this.k;
        if(pointF0 != null) {
            if(pointF0.x == 0.0f) {
                return 0;
            }
            return this.k.x > 0.0f ? 1 : -1;
        }
        return 0;
    }

    protected int l() {
        PointF pointF0 = this.k;
        if(pointF0 != null) {
            if(pointF0.y == 0.0f) {
                return 0;
            }
            return this.k.y > 0.0f ? 1 : -1;
        }
        return 0;
    }

    public static int m(int v, int v1, int v2, int v3, int v4) {
        switch(v4) {
            case -1: {
                return v2 - v;
            }
            case 0: {
                int v5 = v2 - v;
                if(v5 > 0) {
                    return v5;
                }
                int v6 = v3 - v1;
                return v6 >= 0 ? 0 : v6;
            }
            default: {
                return v3 - v1;
            }
        }
    }

    private static int n(int v, int v1) {
        int v2 = v - v1;
        return v * v2 > 0 ? v2 : 0;
    }
}

