import android.graphics.Rect;
import android.view.View;

public final class fcor {
    static final fcoo a;

    static {
        fcop fcop0 = new fcop();
        fcop0.d(0.125f);
        fcop0.b(0.365f);
        fcop0.c(0.052f);
        fcoq fcoq0 = fcop0.a();
        fcop fcop1 = new fcop();
        fcop1.d(0.122f);
        fcop1.b(0.356f);
        fcop1.c(0.028f);
        fcor.a = new fcoo(fcoq0, fcop1.a());
    }

    public static void a(xob xob0, View view0) {
        fcor.b(xob0, view0, fcor.a);
    }

    public static void b(xob xob0, View view0, fcoo fcoo0) {
        Rect rect0 = xob0.getWindowManager().getCurrentWindowMetrics().getBounds();
        fcoq fcoq0 = xob0.getResources().getConfiguration().isScreenRound() ? fcoo0.a : fcoo0.b;
        float f = (float)rect0.height();
        float f1 = (float)rect0.height();
        int v = Math.round(((float)rect0.width()) * fcoq0.c);
        view0.setPadding(v, Math.round(f * fcoq0.a), v, Math.round(f1 * fcoq0.b));
    }
}

