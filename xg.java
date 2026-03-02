import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;

final class xg implements Runnable {
    final xr a;

    public xg(xr xr0) {
        this.a = xr0;
        super();
    }

    @Override
    public final void run() {
        int v7;
        int v5;
        xr xr0 = this.a;
        if(xr0.b != null) {
            long v = System.currentTimeMillis();
            long v1 = xr0.s == 0x8000000000000000L ? 0L : v - xr0.s;
            tx tx0 = xr0.m.h();
            if(xr0.r == null) {
                xr0.r = new Rect();
            }
            tx0.aF(xr0.b.a, xr0.r);
            int v2 = 0;
            if(tx0.ad()) {
                int v3 = (int)(xr0.g + xr0.e);
                int v4 = v3 - xr0.r.left - xr0.m.getPaddingLeft();
                float f = xr0.e;
                if(f < 0.0f && v4 < 0) {
                    v5 = v4;
                }
                else if((f > 0.0f)) {
                    v4 = v3 + xr0.b.a.getWidth() + xr0.r.right - (xr0.m.getWidth() - xr0.m.getPaddingRight());
                    v5 = v4 > 0 ? v4 : 0;
                }
                else {
                    v5 = 0;
                }
            }
            else {
                v5 = 0;
            }
            if(tx0.ae()) {
                int v6 = (int)(xr0.h + xr0.f);
                v7 = v6 - xr0.r.top - xr0.m.getPaddingTop();
                float f1 = xr0.f;
                if(f1 >= 0.0f || v7 >= 0) {
                    if((f1 > 0.0f)) {
                        v7 = v6 + xr0.b.a.getHeight() + xr0.r.bottom - (xr0.m.getHeight() - xr0.m.getPaddingBottom());
                        if(v7 <= 0) {
                            v7 = 0;
                        }
                    }
                    else {
                        v7 = 0;
                    }
                }
            }
            else {
                v7 = 0;
            }
            if(v5 != 0) {
                RecyclerView recyclerView0 = xr0.m;
                int v8 = xr0.b.a.getWidth();
                xr0.m.getWidth();
                v5 = xr0.j.h(recyclerView0, v8, v5, v1);
            }
            if(v7 != 0) {
                RecyclerView recyclerView1 = xr0.m;
                int v9 = xr0.b.a.getHeight();
                xr0.m.getHeight();
                v7 = xr0.j.h(recyclerView1, v9, v7, v1);
            }
            if(v5 != 0) {
                v2 = v5;
            }
            else if(v7 == 0) {
                xr0.s = 0x8000000000000000L;
                return;
            }
            if(xr0.s == 0x8000000000000000L) {
                xr0.s = v;
            }
            xr0.m.scrollBy(v2, v7);
            uq uq0 = xr0.b;
            if(uq0 != null) {
                xr0.i(uq0);
            }
            xr0.m.removeCallbacks(xr0.n);
            xr0.m.postOnAnimation(this);
        }
    }
}

