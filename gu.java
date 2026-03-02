import android.view.View;

public final class gu {
    public static final gv a(int v) {
        switch(v) {
            case 0: {
                return gv.b;
            }
            case 4: {
                return gv.d;
            }
            case 8: {
                return gv.c;
            }
            default: {
                throw new IllegalArgumentException("Unknown visibility " + v);
            }
        }
    }

    public static final gv b(View view0) {
        ibuq.f(view0, "<this>");
        return view0.getAlpha() != 0.0f || view0.getVisibility() != 0 ? gu.a(view0.getVisibility()) : gv.d;
    }
}

