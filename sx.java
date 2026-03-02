import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

final class sx extends um {
    final sy a;

    public sx(sy sy0, Context context0) {
        this.a = sy0;
        super(context0);
    }

    @Override  // um
    protected final float a(DisplayMetrics displayMetrics0) {
        return 100.0f / ((float)displayMetrics0.densityDpi);
    }

    @Override  // um
    protected final int b(int v) {
        return Math.min(100, super.b(v));
    }

    @Override  // um
    protected final void c(View view0, uk uk0) {
        tx tx0 = this.a.a.h();
        int[] arr_v = this.a.d(tx0, view0);
        int v = arr_v[0];
        int v1 = arr_v[1];
        int v2 = this.j(Math.max(Math.abs(v), Math.abs(v1)));
        if(v2 > 0) {
            uk0.b(v, v1, v2, this.j);
        }
    }
}

