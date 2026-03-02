import android.view.View;
import android.view.ViewGroup;

public final class fuoe {
    public static final Object a(View view0, ViewGroup viewGroup0, fuod fuod0) {
        Object object0;
        ibuq.f(view0, "view");
        ibuq.f(viewGroup0, "contentView");
        if(view0.isLaidOut()) {
            try {
                int v = fuod0.a;
                if(v <= 0) {
                    throw new IllegalStateException("containerHeightPx must be >0, " + v);
                }
                int v1 = fuod0.b;
                if(v1 <= 0) {
                    throw new IllegalStateException("minHeightPx must be > 0, " + v1);
                }
                int v2 = fuod0.c;
                if(v2 <= 0) {
                    throw new IllegalStateException("maxHeightPx must be > 0, " + v2);
                }
                if(v2 <= v1) {
                    throw new IllegalStateException(a.z(v1, v2, "maxHeightPx must be > minHeightPx, ", " <= "));
                }
                if(fuod0.d < v1) {
                    throw new IllegalStateException(a.z(v1, v, "oversizeHeightPx must be >= minHeightPx, ", " < "));
                }
                object0 = ibom.a;
            }
            catch(IllegalStateException illegalStateException0) {
                object0 = ibnx.a(illegalStateException0);
            }
            if((object0 instanceof ibnv)) {
                return object0;
            }
            int v3 = viewGroup0.getHeight() - view0.getHeight();
            int v4 = viewGroup0.getHeight() - view0.getHeight();
            int v5 = fuod0.a;
            if(v3 + fuod0.b <= v5 - 10 && v5 - 10 <= v4 + fuod0.c) {
                int v6 = v5 - (viewGroup0.getHeight() - view0.getHeight());
                if(!fuof.b(view0.getHeight(), v6)) {
                    fuof.a(view0, v6);
                    return ibom.a;
                }
            }
            else {
                int v7 = view0.getHeight();
                int v8 = fuod0.d;
                if(!fuof.b(v7, v8)) {
                    fuof.a(view0, v8);
                }
            }
        }
        return ibom.a;
    }
}

