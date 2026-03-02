import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;

public abstract class xm {
    private static final Interpolator a;
    private static final Interpolator b;
    private int c;

    static {
        xm.a = new xk();
        xm.b = new xl();
    }

    public xm() {
        this.c = -1;
    }

    public final int a(int v, int v1) {
        if((v & 0x303030) == 0) {
            return v;
        }
        int v2 = v & ~(v & 0x303030);
        if(v1 == 0) {
            return (v & 0x303030) >> 2 | v2;
        }
        int v3 = (v & 0x303030) >> 1;
        return (0x303030 & v3) >> 2 | (v2 | 0xFFCFCFCF & v3);
    }

    public static int b(int v, int v1) {
        int v2 = v & 0xC0C0C;
        if(v2 == 0) {
            return v;
        }
        int v3 = v & ~v2;
        if(v1 == 0) {
            return v3 | v2 << 2;
        }
        int v4 = v2 + v2;
        return v3 | 0xFFF3F3F3 & v4 | (v4 & 0xC0C0C) << 2;
    }

    final int c(RecyclerView recyclerView0, uq uq0) {
        return this.a(this.o(uq0), recyclerView0.getLayoutDirection());
    }

    // String Decryptor: 1 succeeded, 0 failed
    public static int d(int v, int v1) {
        return v1 << v * 8;
    }

    public void e(RecyclerView recyclerView0, uq uq0) {
        View view0 = uq0.a;
        Object object0 = view0.getTag(0x7F0B1781);  // id:item_touch_helper_previous_elevation
        if((object0 instanceof Float)) {
            view0.setElevation(((Float)object0).floatValue());
        }
        view0.setTag(0x7F0B1781, null);  // id:item_touch_helper_previous_elevation
        view0.setTranslationX(0.0f);
        view0.setTranslationY(0.0f);
    }

    public void f(uq uq0, int v) {
    }

    public boolean g() {
        return true;
    }

    public final int h(RecyclerView recyclerView0, int v, int v1, long v2) {
        int v3 = this.c;
        if(v3 == -1) {
            v3 = recyclerView0.getResources().getDimensionPixelSize(0x7F0708CD);  // dimen:item_touch_helper_max_drag_scroll_per_frame
            this.c = v3;
        }
        int v4 = (int)Math.signum(v1);
        float f = 1.0f;
        float f1 = xm.b.getInterpolation(Math.min(1.0f, ((float)Math.abs(v1)) / ((float)v)));
        if(v2 <= 2000L) {
            f = ((float)v2) / 2000.0f;
        }
        int v5 = (int)(((float)(((int)(((float)(v4 * v3)) * f1)))) * xm.a.getInterpolation(f));
        if(v5 == 0) {
            return v1 <= 0 ? -1 : 1;
        }
        return v5;
    }

    public void i() {
    }

    public static int j(int v) {
        return xm.d(2, v) | xm.d(0, v);
    }

    public final void k(RecyclerView recyclerView0, uq uq0, float f, float f1, boolean z) {
        View view0 = uq0.a;
        if(z && view0.getTag(0x7F0B1781) == null) {  // id:item_touch_helper_previous_elevation
            Float float0 = view0.getElevation();
            int v = recyclerView0.getChildCount();
            float f2 = 0.0f;
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = recyclerView0.getChildAt(v1);
                if(view1 != view0) {
                    float f3 = view1.getElevation();
                    if((f3 > f2)) {
                        f2 = f3;
                    }
                }
            }
            view0.setElevation(f2 + 1.0f);
            view0.setTag(0x7F0B1781, float0);  // id:item_touch_helper_previous_elevation
        }
        view0.setTranslationX(f);
        view0.setTranslationY(f1);
    }

    public void l(uq uq0, float f, int v, boolean z) {
    }

    public abstract boolean m(uq arg1, uq arg2);

    public abstract void n();

    public abstract int o(uq arg1);
}

