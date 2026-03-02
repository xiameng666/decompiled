import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

public final class kie implements View.OnTouchListener {
    final kic a;
    final View b;
    boolean c;
    boolean d;
    boolean e;
    public final ListView f;
    private static final int g;
    private final Interpolator h;
    private Runnable i;
    private final float[] j;
    private final float[] k;
    private final int l;
    private final float[] m;
    private final float[] n;
    private final float[] o;
    private boolean p;
    private boolean q;

    static {
        kie.g = 100;
    }

    public kie(ListView listView0) {
        kic kic0 = new kic();
        this.a = kic0;
        this.h = new AccelerateInterpolator();
        float[] arr_f = {0.0f, 0.0f};
        this.j = arr_f;
        float[] arr_f1 = {3.402823E+38f, 3.402823E+38f};
        this.k = arr_f1;
        float[] arr_f2 = {0.0f, 0.0f};
        this.m = arr_f2;
        float[] arr_f3 = {0.0f, 0.0f};
        this.n = arr_f3;
        float[] arr_f4 = {3.402823E+38f, 3.402823E+38f};
        this.o = arr_f4;
        this.b = listView0;
        DisplayMetrics displayMetrics0 = Resources.getSystem().getDisplayMetrics();
        float f = ((float)(((int)(displayMetrics0.density * 1575.0f + 0.5f)))) / 1000.0f;
        arr_f4[0] = f;
        arr_f4[1] = f;
        float f1 = ((float)(((int)(displayMetrics0.density * 315.0f + 0.5f)))) / 1000.0f;
        arr_f3[0] = f1;
        arr_f3[1] = f1;
        arr_f1[0] = 3.402823E+38f;
        arr_f1[1] = 3.402823E+38f;
        arr_f[0] = 0.2f;
        arr_f[1] = 0.2f;
        arr_f2[0] = 0.001f;
        arr_f2[1] = 0.001f;
        this.l = kie.g;
        kic0.a = 500;
        kic0.b = 500;
        this.f = listView0;
    }

    static float a(float f, float f1, float f2) {
        if((f > f2)) {
            return f2;
        }
        return f < f1 ? f1 : f;
    }

    final boolean b() {
        int v = (int)(this.a.d / Math.abs(this.a.d));
        if(v != 0) {
            ListView listView0 = this.f;
            int v1 = listView0.getCount();
            if(v1 != 0) {
                int v2 = listView0.getChildCount();
                int v3 = listView0.getFirstVisiblePosition();
                return v <= 0 ? v < 0 && (v3 > 0 || listView0.getChildAt(0).getTop() < 0) : v3 + v2 < v1 || listView0.getChildAt(v2 - 1).getBottom() > listView0.getHeight();
            }
        }
        return false;
    }

    public final void c(boolean z) {
        if(this.q && !z) {
            this.f();
        }
        this.q = z;
    }

    private final float d(int v, float f, float f1, float f2) {
        float f5;
        float f3 = kie.a(this.j[v] * f1, 0.0f, this.k[v]);
        float f4 = this.e(f1 - f, f3) - this.e(f, f3);
        if((f4 < 0.0f)) {
            f5 = kie.a(-this.h.getInterpolation(-f4), -1.0f, 1.0f);
        }
        else {
            f5 = f4 > 0.0f ? kie.a(this.h.getInterpolation(f4), -1.0f, 1.0f) : 0.0f;
        }
        int v1 = Float.compare(f5, 0.0f);
        if(v1 == 0) {
            return 0.0f;
        }
        float f6 = this.m[v];
        float f7 = this.n[v];
        float f8 = this.o[v];
        float f9 = f6 * f2;
        return v1 <= 0 ? -kie.a(-f5 * f9, f7, f8) : kie.a(f5 * f9, f7, f8);
    }

    private final float e(float f, float f1) {
        if(f1 == 0.0f) {
            return 0.0f;
        }
        if((f < f1)) {
            if(Float.compare(f, 0.0f) >= 0) {
                return 1.0f - f / f1;
            }
            return this.e ? 1.0f : 0.0f;
        }
        return 0.0f;
    }

    private final void f() {
        int v = 0;
        if(this.c) {
            this.e = false;
            return;
        }
        kic kic0 = this.a;
        long v1 = AnimationUtils.currentAnimationTimeMillis();
        int v2 = (int)(v1 - kic0.e);
        int v3 = kic0.b;
        if(v2 > v3) {
            v = v3;
        }
        else if(v2 >= 0) {
            v = v2;
        }
        kic0.i = v;
        kic0.h = kic0.a(v1);
        kic0.g = v1;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(this.q) {
            switch(motionEvent0.getActionMasked()) {
                case 0: {
                    this.d = true;
                    this.p = false;
                    break;
                }
                case 2: {
                    break;
                }
                case 1: 
                case 3: {
                    this.f();
                    return false;
                }
                default: {
                    return false;
                }
            }
            float f = motionEvent0.getX();
            float f1 = (float)view0.getWidth();
            View view1 = this.b;
            float f2 = this.d(0, f, f1, ((float)view1.getWidth()));
            float f3 = this.d(1, motionEvent0.getY(), ((float)view0.getHeight()), ((float)view1.getHeight()));
            this.a.c = f2;
            this.a.d = f3;
            if(!this.e && this.b()) {
                if(this.i == null) {
                    this.i = new kid(this);
                }
                this.e = true;
                this.c = true;
                if(this.p) {
                    this.i.run();
                }
                else {
                    int v = this.l;
                    if(v > 0) {
                        view1.postOnAnimationDelayed(this.i, ((long)v));
                    }
                    else {
                        this.i.run();
                    }
                }
                this.p = true;
            }
        }
        return false;
    }
}

